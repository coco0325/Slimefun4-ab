package me.mrCookieSlime.Slimefun.listeners;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import me.mrCookieSlime.CSCoreLibPlugin.general.Block.BlockAdjacents;
import me.mrCookieSlime.Slimefun.SlimefunStartup;
import me.mrCookieSlime.Slimefun.Events.MultiBlockInteractEvent;
import me.mrCookieSlime.Slimefun.Objects.MultiBlock;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.handlers.ItemHandler;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.handlers.MultiBlockInteractionHandler;
import me.mrCookieSlime.Slimefun.api.BlockStorage;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.type.Piston;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.BlockPistonRetractEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

public class BlockListener implements Listener {

    ArrayList<Material> logs = new ArrayList<Material>(Arrays.asList(Material.ACACIA_LOG,Material.OAK_LOG,Material.DARK_OAK_LOG,Material.SPRUCE_LOG));
    ArrayList<Material> axes = new ArrayList<Material>(Arrays.asList(Material.DIAMOND_AXE,Material.GOLDEN_AXE,Material.IRON_AXE,Material.STONE_AXE,Material.WOODEN_AXE));

    public BlockListener(SlimefunStartup plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onBlockFall(EntityChangeBlockEvent event) {
        if (event.getEntity() instanceof FallingBlock) {
            if (BlockStorage.hasBlockInfo(event.getBlock())) {
                event.setCancelled(true);
                FallingBlock fb = (FallingBlock) event.getEntity();
                if (fb.getDropItem()) {
                    fb.getWorld().dropItemNaturally(fb.getLocation(), new ItemStack(fb.getBlockData().getMaterial(), 1));
                }
            }
        }
    }

    @EventHandler
    public void onPistonExtend(BlockPistonExtendEvent e) {
        for (Block b : e.getBlocks()) {
            if (BlockStorage.hasBlockInfo(b)) {
                e.setCancelled(true);
                e.getBlock().setType(Material.AIR);
                return;
            } else if (b.getRelative(e.getDirection()).getType() == Material.AIR && BlockStorage.hasBlockInfo(b.getRelative(e.getDirection()))) {
                e.setCancelled(true);
                e.getBlock().setType(Material.AIR);
                return;
            }
        }
        if(!e.isCancelled()){
            BlockStorage.clearBlockInfo(e.getBlock().getRelative(e.getDirection()));
        }
    }

    @EventHandler
    public void onPistonRetract(BlockPistonRetractEvent e) {
        if (e.isSticky()) {
            for (Block b : e.getBlocks()) {
                if (BlockStorage.hasBlockInfo(b)) {
                    e.setCancelled(true);
                    return;
                } else if (b.getRelative(e.getDirection()).getType() == Material.AIR && BlockStorage.hasBlockInfo(b.getRelative(e.getDirection()))) {
                    e.setCancelled(true);
                    return;
                }
            }
        }
    }

    @EventHandler
    public void onBreak(BlockBreakEvent e){
        if(e.getBlock().getType() == Material.PISTON || e.getBlock().getType() == Material.STICKY_PISTON){
            if(((Piston)e.getBlock()).isExtended()){
                e.setCancelled(true);
            }
        }else if(e.getBlock().getType() == Material.PISTON_HEAD){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onRightClick(PlayerInteractEvent e) {
        if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if(axes.contains(e.getPlayer().getInventory().getItemInMainHand().getType()) || axes.contains(e.getPlayer().getInventory().getItemInOffHand().getType())){
                if(e.getClickedBlock() != null){
                    if(logs.contains(e.getClickedBlock().getType())){
                        if(BlockStorage.hasBlockInfo(e.getClickedBlock())){
                            e.setCancelled(true);
                        }
                    }
                }
            }
            if (!e.getHand().equals(EquipmentSlot.HAND)) return;
            Player p = e.getPlayer();
            Block b = e.getClickedBlock();
            List<MultiBlock> multiblocks = new ArrayList<>();
            for (MultiBlock mb : MultiBlock.list()) {
                if (mb.getTriggerBlock() == b.getType()) {
                    Material[] blocks = mb.getBuild();

                    if (mb.getTriggerBlock() == blocks[1]) {
                        if (
                                BlockAdjacents.hasMaterialOnSide(b, blocks[0]) &&
                                        BlockAdjacents.hasMaterialOnSide(b, blocks[2]) &&
                                        BlockAdjacents.isMaterial(b.getRelative(BlockFace.DOWN), blocks[4]) &&
                                        BlockAdjacents.hasMaterialOnSide(b.getRelative(BlockFace.DOWN), blocks[3]) &&
                                        BlockAdjacents.hasMaterialOnSide(b.getRelative(BlockFace.DOWN), blocks[5]) &&
                                        BlockAdjacents.isMaterial(b.getRelative(BlockFace.DOWN).getRelative(BlockFace.DOWN), blocks[7]) &&
                                        BlockAdjacents.hasMaterialOnSide(b.getRelative(BlockFace.DOWN).getRelative(BlockFace.DOWN), blocks[6]) &&
                                        BlockAdjacents.hasMaterialOnSide(b.getRelative(BlockFace.DOWN).getRelative(BlockFace.DOWN), blocks[8])
                        ) {
                            if (blocks[0] != null && blocks[0] == blocks[2] && !BlockAdjacents.hasMaterialOnBothSides(b.getRelative(0, 0, 0), blocks[0]))
                                ;
                            else if (blocks[3] != null && blocks[3] == blocks[5] && !BlockAdjacents.hasMaterialOnBothSides(b.getRelative(0, -1, 0), blocks[5]))
                                ;
                            else if (blocks[6] != null && blocks[6] == blocks[8] && !BlockAdjacents.hasMaterialOnBothSides(b.getRelative(0, -2, 0), blocks[8]))
                                ;
                            else multiblocks.add(mb);
                        }
                    } else if (mb.getTriggerBlock() == blocks[4]) {
                        if (
                                BlockAdjacents.hasMaterialOnSide(b, blocks[3]) &&
                                        BlockAdjacents.hasMaterialOnSide(b, blocks[5]) &&
                                        BlockAdjacents.isMaterial(b.getRelative(BlockFace.DOWN), blocks[7]) &&
                                        BlockAdjacents.hasMaterialOnSide(b.getRelative(BlockFace.DOWN), blocks[6]) &&
                                        BlockAdjacents.hasMaterialOnSide(b.getRelative(BlockFace.DOWN), blocks[8]) &&
                                        BlockAdjacents.isMaterial(b.getRelative(BlockFace.UP), blocks[1]) &&
                                        BlockAdjacents.hasMaterialOnSide(b.getRelative(BlockFace.UP), blocks[0]) &&
                                        BlockAdjacents.hasMaterialOnSide(b.getRelative(BlockFace.UP), blocks[2])
                        ) {
                            if (blocks[0] != null && blocks[0] == blocks[2] && !BlockAdjacents.hasMaterialOnBothSides(b.getRelative(0, 1, 0), blocks[0]))
                                ;
                            else if (blocks[3] != null && blocks[3] == blocks[5] && !BlockAdjacents.hasMaterialOnBothSides(b.getRelative(0, 0, 0), blocks[5]))
                                ;
                            else if (blocks[6] != null && blocks[6] == blocks[8] && !BlockAdjacents.hasMaterialOnBothSides(b.getRelative(0, -1, 0), blocks[8]))
                                ;
                            else multiblocks.add(mb);
                            ;
                        }
                    } else if (mb.getTriggerBlock() == blocks[7]) {
                        if (
                                BlockAdjacents.hasMaterialOnSide(b, blocks[6]) &&
                                        BlockAdjacents.hasMaterialOnSide(b, blocks[8]) &&
                                        BlockAdjacents.isMaterial(b.getRelative(BlockFace.UP).getRelative(BlockFace.UP), blocks[1]) &&
                                        BlockAdjacents.hasMaterialOnSide(b.getRelative(BlockFace.UP).getRelative(BlockFace.UP), blocks[0]) &&
                                        BlockAdjacents.hasMaterialOnSide(b.getRelative(BlockFace.UP).getRelative(BlockFace.UP), blocks[2]) &&
                                        BlockAdjacents.isMaterial(b.getRelative(BlockFace.UP), blocks[4]) &&
                                        BlockAdjacents.hasMaterialOnSide(b.getRelative(BlockFace.UP), blocks[3]) &&
                                        BlockAdjacents.hasMaterialOnSide(b.getRelative(BlockFace.UP), blocks[5])
                        ) {
                            if (blocks[0] != null && blocks[0] == blocks[2] && !BlockAdjacents.hasMaterialOnBothSides(b.getRelative(0, 2, 0), blocks[0]))
                                ;
                            else if (blocks[3] != null && blocks[3] == blocks[5] && !BlockAdjacents.hasMaterialOnBothSides(b.getRelative(0, 1, 0), blocks[5]))
                                ;
                            else if (blocks[6] != null && blocks[6] == blocks[8] && !BlockAdjacents.hasMaterialOnBothSides(b.getRelative(0, 0, 0), blocks[8]))
                                ;
                            else multiblocks.add(mb);
                            ;
                        }
                    }
                }
            }

            if (!multiblocks.isEmpty()) {
                e.setCancelled(true);

                for (ItemHandler handler : SlimefunItem.getHandlers("MultiBlockInteractionHandler")) {
                    if (((MultiBlockInteractionHandler) handler).onInteract(p, multiblocks.get(multiblocks.size() - 1), b))
                        break;
                }

                MultiBlockInteractEvent event = new MultiBlockInteractEvent(p, multiblocks.get(multiblocks.size() - 1), b);
                Bukkit.getPluginManager().callEvent(event);
            }
        }
    }
}
