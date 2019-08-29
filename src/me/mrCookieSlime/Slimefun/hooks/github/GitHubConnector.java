package me.mrCookieSlime.Slimefun.hooks.github;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import me.mrCookieSlime.Slimefun.SlimefunStartup;

public abstract class GitHubConnector {

	private File file;

	public GitHubConnector() {
		this.file = new File("plugins/Slimefun/cache/github/" + this.getFileName() + ".json");
		SlimefunStartup.instance.getUtilities().connectors.add(this);
	}

	public abstract String getFileName();
	public abstract String getRepository();
	public abstract String getURLSuffix();
	public abstract void onSuccess(JsonElement element);
	public abstract void onFailure();

	public void pullFile() {
		if (SlimefunStartup.getCfg().getBoolean("options.print-out-github-data-retrieving")) System.out.println("[Slimefun - GitHub] Retrieving '" + this.getFileName() + ".json' from GitHub...");

		try {
			URL website = new URL("https://api.github.com/repos/" + this.getRepository() + this.getURLSuffix());

			URLConnection connection = website.openConnection();
			connection.setConnectTimeout(3000);
			connection.addRequestProperty("User-Agent", "Slimefun 4 GitHub Agent (by TheBusyBiscuit)");
			connection.setDoOutput(true);

			try (ReadableByteChannel channel = Channels.newChannel(connection.getInputStream())) {
				try (FileOutputStream stream = new FileOutputStream(file)) {
					stream.getChannel().transferFrom(channel, 0, Long.MAX_VALUE);
					this.parseData();
				}
			}
		} catch (IOException e) {
			if (SlimefunStartup.getCfg().getBoolean("options.print-out-github-data-retrieving")) System.err.println("[Slimefun - GitHub] ERROR - Could not connect to GitHub in time.");

			if (hasData()) {
				this.parseData();
			}
			else {
				this.onFailure();
			}
		}
	}

	public boolean hasData() {
		return this.getFile().exists();
	}

	public File getFile() {
		return this.file;
	}

	public void parseData() {
		try (BufferedReader reader = new BufferedReader(new FileReader(this.getFile()))) {
			String full = "";

			String line;
			while ((line = reader.readLine()) != null) {
				full = full + line;
			}

			JsonElement element = new JsonParser().parse(full);
			this.onSuccess(element);
		} 
		catch (IOException e) {
			e.printStackTrace();
			this.onFailure();
		}
	}
}
