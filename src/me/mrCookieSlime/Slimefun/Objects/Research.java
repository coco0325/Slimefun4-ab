package me.mrCookieSlime.Slimefun.Objects;

import java.util.*;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Variable;
import me.mrCookieSlime.CSCoreLibPlugin.general.Particles.FireworkShow;
import me.mrCookieSlime.Slimefun.SlimefunStartup;
import me.mrCookieSlime.Slimefun.Events.ResearchUnlockEvent;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Setup.Messages;
import me.mrCookieSlime.Slimefun.Setup.ResearchSetup;
import me.mrCookieSlime.Slimefun.api.PlayerProfile;
import me.mrCookieSlime.Slimefun.api.Slimefun;

import me.vagdedes.mysql.database.SQL;

/**
 * Statically handles researches. Represents a research, which is bound to one
 * {@link SlimefunItem} or more and require XP levels to unlock this/these item(s).
 * <p>
 * See {@link #Research(int, String, int)} to create a research.
 * <p>
 * See {@link ResearchSetup} for the built-in researches.
 * 
 * @author TheBusyBiscuit
 * @since 4.0
 */
public class Research {

	private static final int[] research_progress = {23, 44, 57, 92};

	public static String tablename = "sf_research";

	/**
	 * Whether researching is enabled or not;
	 * @since 4.0
	 */
	public static boolean enableResearching;
	
	/**
	 * Contains all the registered researches;
	 * @since 4.0
	 * @see ResearchSetup
	 */
	public static List<Research> list = new LinkedList<>();
	
	/**
	 * Contains all Research Titles
	 */
	public static List<String> titles;
	public static List<UUID> researching = new ArrayList<>();
	
	/**
	 * Whether researching in creative is free.
	 * @since 4.0
	 */
	public static boolean creative_research = true;

	private int id;
	private String name, sid;
	private List<SlimefunItem> items;
	private int cost;
	private boolean enabled;

	/**
	 * The constructor for a Research.
	 * <p>
	 * Create a new research by calling {@link #Research(int, String, int)}, then
	 * bind this research to the Slimefun items you want by calling
	 * {@link #addItems(SlimefunItem...)}. Once you're finished, call {@link #register()}
	 * to register it.
	 * <p>
	 * To speed up, directly setup the research by calling 
	 * {@link Slimefun#registerResearch(Research, org.bukkit.inventory.ItemStack...)}.
	 * 
	 * @param id Unique integer ID for this research, used for {@link #getByID(int)} and to
	 *           register it in Researches.yml
	 * @param name Display name of the research
	 * @param cost Cost in XP levels to unlock the research
	 * 
	 * @since 4.0
	 */
	public Research(int id, String name, int cost) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.sid = String.valueOf(id);
		this.items = new ArrayList<>();
		this.enabled = true;
	}
	
	public boolean isEnabled() {
		return enableResearching && enabled;
	}


	/**
	 * Gets the ID of the research.
	 * 
	 * @return ID of the research
	 * 
	 * @since 4.0
	 */
	public int getID() {
		return id;
	}

	/**
	 * Gets the display name of the research.
	 * 
	 * @return The display name of the research
	 * 
	 * @since 4.0
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the cost in XP levels to unlock the research.
	 * 
	 * @return The cost in XP levels of the research
	 * 
	 * @since 4.0
	 * @deprecated Moved to {@link #getCost()}
	 */
	@Deprecated
	public int getLevel() {
		return cost;
	}

	/**
	 * Sets the cost in XP levels to unlock the research.
	 * 
	 * @param level Cost in XP levels
	 * 
	 * @since 4.0
	 * @deprecated Moved to {@link #setCost(int)}
	 */
	@Deprecated
	public void setLevel(int level) {
		this.cost = level;
	}

	/**
	 * Gets the cost in XP levels to unlock the research.
	 * 
	 * @return The cost in XP levels of the research
	 * @since 4.1.10
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * Sets the cost in XP levels to unlock the research.
	 * 
	 * @param cost Cost in XP levels
	 * 
	 * @since 4.1.10
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

	/**
	 * Bind the specified Slimefun items to the research.
	 * 
	 * @param items {@link SlimefunItem} to bind to the research
	 * 
	 * @since 4.0
	 */
	public void addItems(SlimefunItem... items) {
		for (SlimefunItem item: items) {
			if (item != null) item.bindToResearch(this);
		}
	}

	/**
	 * Gets the list of the Slimefun items bound to the research.
	 * 
	 * @return the Slimefun items bound to the research
	 * 
	 * @since 4.0
	 */
	public List<SlimefunItem> getAffectedItems() {
		return items;
	}

	private void save(UUID uuid, int id){

	}

	/**
	 * Convenience method to check if the player unlocked this research.
	 * 
	 * @param p Player to check
	 * @return true if he unlocked the research, otherwise false
	 * 
	 * @since 4.0
	 * @see #hasUnlocked(UUID)
	 */
	@Deprecated
	public boolean hasUnlocked(Player p) {
		return hasUnlocked(p.getUniqueId());
	}

	/**
	 * Checks if the player unlocked this research.
	 * 
	 * @param uuid UUID of the player to check
	 * @return true if he unlocked the research, otherwise false
	 * 
	 * @since 4.0
	 * @see #hasUnlocked(Player)
	 */
	public boolean hasUnlocked(UUID uuid) {
		if (!enabled) return true;
		if (!SlimefunStartup.getResearchCfg().getBoolean(this.id + ".enabled")) return true;
		ArrayList<String> list = getPlayerResearches(uuid);
		if(list == null) return false;
		return list.contains(this.sid);
	}

	public static void checkConnetion(){
		if(!me.vagdedes.mysql.database.MySQL.isConnected()){
			me.vagdedes.mysql.database.MySQL.connect();
		}
	}

	public static ArrayList<String> getPlayerResearches(UUID uuid){
		String result;
		if(SQL.exists("uuid", uuid.toString(), tablename)){
			checkConnetion();
			result = String.valueOf(SQL.get("unlocked", "uuid", "=", uuid.toString(), tablename));
		}else{
			return null;
		}
		ArrayList<String> researches = new ArrayList<String>(Arrays.asList(result.split("\\.")));
		return researches;
	}

	private void SQLunlock(UUID uuid){
		if(SQL.exists("uuid", uuid.toString(), tablename)){
			ArrayList<String> research_list = getPlayerResearches(uuid);
			if(!research_list.contains(this.sid)){
				research_list.add(this.sid);
				StringBuilder strings = new StringBuilder();
				for(String id : research_list){
					strings.append(id+"\\.");
				}
				checkConnetion();
				SQL.set("unlocked", strings.toString(), "uuid", "=", uuid.toString(), tablename);
			}
		}else{
			checkConnetion();
			SQL.insertData("uuid, unlocked", " '"+uuid.toString()+"', '"+this.sid+"\\.' ", tablename);
		}
	}

	/**
	 * Checks if the player can unlock this research.
	 * 
	 * @param p Player to check
	 * @return true if he can unlock the research, otherwise false
	 * 
	 * @since 4.1.10
	 */
	public boolean canUnlock(Player p) {
		if (!isEnabled()) return true;
		return (p.getGameMode() == GameMode.CREATIVE && creative_research) || p.getLevel() >= this.cost;
	}

	/**
	 * Locks the research for the specified player.
	 * 
	 * @param p Player to lock the research
	 * 
	 * @since 4.0
	 */
	@Deprecated
	public void lock(Player p) {
		Messages.local.sendTranslation(p, "commands.research.reset-target", true);
		if(SQL.exists("uuid", p.getUniqueId().toString(), tablename)){
			ArrayList<String> research_list = new ArrayList<String>(getPlayerResearches(p.getUniqueId()));
			research_list.remove(this.sid);
			if(research_list.size() == 0){
				checkConnetion();
				SQL.deleteData("uuid", "=", p.getUniqueId().toString(), tablename);
				return;
			}
			StringBuilder strings = new StringBuilder();
			for(String id : research_list){
				strings.append(id+"\\.");
			}
			checkConnetion();
			SQL.set("unlocked", strings.toString(), "uuid", "=", p.getUniqueId().toString(), tablename);
		}
	}

	/**
	 * Unlocks the research for the specified player.
	 * 
	 * @param p Player to unlock the research
	 * @param instant Whether to unlock the research instantly
	 * 
	 * @since 4.0
	 */
	public void unlock(final Player p, boolean instant) {
		if (!hasUnlocked(p)) {
			ResearchUnlockEvent event = new ResearchUnlockEvent(p, this);
			Bukkit.getPluginManager().callEvent(event);
			
			Runnable runnable = () -> {
				PlayerProfile.fromUUID(p.getUniqueId()).setResearched(this, true);
				Messages.local.sendTranslation(p, "messages.unlocked", true, new Variable("%research%", getName()));
				
				if (SlimefunStartup.getCfg().getBoolean("options.research-unlock-fireworks")) {
					FireworkShow.launchRandom(p, 1);
				}
			};
			
			if (!event.isCancelled()) {
				final int research = this.id;
				if (instant) {
                    SQLunlock(p.getUniqueId());
					Messages.local.sendTranslation(p, "messages.unlocked", true, new Variable("%research%", getName()));
					if (SlimefunStartup.getCfg().getBoolean("options.research-give-fireworks"))
						FireworkShow.launchRandom(p, 1);
				} else if (!researching.contains(p.getUniqueId())){
					researching.add(p.getUniqueId());
					Messages.local.sendTranslation(p, "messages.research.start", true, new Variable("%research%", getName()));
					
					for (int i = 1; i < research_progress.length + 1; i++) {
						int j = i;
						
						Bukkit.getScheduler().scheduleSyncDelayedTask(SlimefunStartup.instance, () -> {
							p.playSound(p.getLocation(), Sound.ENTITY_BAT_TAKEOFF, 0.7F, 1F);
							Messages.local.sendTranslation(p, "messages.research.progress", true, new Variable("%research%", getName()), new Variable("%progress%", research_progress[j - 1] + "%"));
						}, i * 20L);
					}
					
					Bukkit.getScheduler().scheduleSyncDelayedTask(SlimefunStartup.instance, () -> {
                        SQLunlock(p.getUniqueId());
						Messages.local.sendTranslation(p, "messages.unlocked", true, new Variable("%research%", getName()));
						if (SlimefunStartup.getCfg().getBoolean("options.research-unlock-fireworks"))
							FireworkShow.launchRandom(p, 1);
						researching.remove(p.getUniqueId());
					}, (research_progress.length + 1)*20L);
				}
			}
		}
	}



	/**
	 * Registers the research.
	 * 
	 * @since 4.0
	 */
	public void register() {
		SlimefunStartup.getResearchCfg().setDefaultValue("enable-researching", true);

		if (SlimefunStartup.getResearchCfg().contains(this.getID() + ".enabled") && !SlimefunStartup.getResearchCfg().getBoolean(this.getID() + ".enabled")) {
			Iterator<SlimefunItem> iterator = items.iterator();
			while (iterator.hasNext()) {
				SlimefunItem item = iterator.next();
				if (item != null) item.bindToResearch(null);
				iterator.remove();
			}
			return;
		}

		SlimefunStartup.getResearchCfg().setDefaultValue(this.getID() + ".name", this.getName());
		SlimefunStartup.getResearchCfg().setDefaultValue(this.getID() + ".cost", this.getCost());
		SlimefunStartup.getResearchCfg().setDefaultValue(this.getID() + ".enabled", true);

		this.name = SlimefunStartup.getResearchCfg().getString(this.getID() + ".name");
		this.cost = SlimefunStartup.getResearchCfg().getInt(this.getID() + ".cost");
		this.enabled = SlimefunStartup.getResearchCfg().getBoolean(this.getID() + ".enabled");

		list.add(this);
		if (SlimefunStartup.getCfg().getBoolean("options.print-out-loading")) System.out.println("[Slimefun] Loaded Research \"" + this.getName() + "\"");
	}

	/**
	 * Gets the list of all registered researches.
	 * 
	 * @return The list of registered researches
	 * 
	 * @since 4.0
	 * @see ResearchSetup
	 */
	public static List<Research> list() {
		return list;
	}

	/**
	 * Gets if the specified player is currently unlocking a research.
	 * 
	 * @param p Player to check
	 * @return true if the player is unlocking a research, otherwise false
	 * 
	 * @since 4.0
	 */
	public static boolean isResearching(Player p) {
		return SlimefunStartup.instance.getUtilities().researching.contains(p.getUniqueId());
	}

	/**
	 * Sends the research statistics and title of the specified player to the command sender.
	 * 
	 * @param sender CommandSender to send the statistics
	 * @param p Player to get the statistics
	 * 
	 * @since 4.0
	 * @see #getTitle(Player, List)
	 */
	@Deprecated
	public static void sendStats(CommandSender sender, Player p) {
		PlayerProfile profile = PlayerProfile.fromUUID(p.getUniqueId());
		Set<Research> researched = profile.getResearches();
		int levels = researched.stream().mapToInt(Research::getCost).sum();
		
		String progress = String.valueOf(Math.round(((researched.size() * 100.0F) / list().size()) * 100.0F) / 100.0F);
		if (Float.parseFloat(progress) < 16.0F) progress = "&4" + progress + " &r% ";
		else if (Float.parseFloat(progress) < 32.0F) progress = "&c" + progress + " &r% ";
		else if (Float.parseFloat(progress) < 48.0F) progress = "&6" + progress + " &r% ";
		else if (Float.parseFloat(progress) < 64.0F) progress = "&e" + progress + " &r% ";
		else if (Float.parseFloat(progress) < 80.0F) progress = "&2" + progress + " &r% ";
		else progress = "&a" + progress + " &r% ";

		sender.sendMessage("");
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7玩家數據: &b" + p.getName()));
		sender.sendMessage("");
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7主題: &b" + getTitle(p, researched)));
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7研究進度: " + progress + "&e(" + researched.size() + " / " + list().size() + ")"));
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7總花費等級: &b" + levels));
	}

	/**
	 * Gets the title of the specified player.
	 * 
	 * @param p Player to get the rank
	 * @param researched List of the player's unlocked researches
	 * @return the title of the specified player
	 * 
	 * @since 4.0
	 * @see #sendStats(CommandSender, Player)
	 */
	@Deprecated
	public static String getTitle(Player p, Collection<Research> researched) {
		int index = Math.round(Float.valueOf(String.valueOf(Math.round(((researched.size() * 100.0F) / list().size()) * 100.0F) / 100.0F)) / 100.0F) * titles.size();
		if (index > 0) index--;
		return titles.get(index);
	}

	/**
	 * Attempts to get the research with the given ID.
	 * 
	 * @param id ID of the research to get
	 * @return Research if found, or null
	 * 
	 * @since 4.0
	 */
	public static Research getByID(int id) {
		for (Research research: list) {
			if (research.getID() == id) return research;
		}
		return null;
	}

	/**
	 * Gets the list of unlocked researches for a player using his UUID.
	 * 
	 * @param uuid UUID of the player
	 * @return the list of unlocked researches for the player
	 * 
	 * @since 4.0
	 * @see #getResearches(String)
	 */
	@Deprecated
	public static List<Research> getResearches(UUID uuid) {
		List<Research> researched = new ArrayList<>();
		for (Research r: list()) {
			if (r.hasUnlocked(uuid)) researched.add(r);
		}
		return researched;
	}

	/**
	 * Convenience method to get the list of unlocked researches
	 * for a player using his UUID (specified as a String).
	 * 
	 * @param uuid String representing the UUID of the player
	 * @return the list of unlocked researches for the player
	 * 
	 * @since 4.0
	 * @see #getResearches(UUID)
	 */
	@Deprecated
	public static List<Research> getResearches(String uuid) {
		return getResearches(UUID.fromString(uuid));
	}
}