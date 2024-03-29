package me.mrCookieSlime.Slimefun.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import me.mrCookieSlime.CSCoreLibPlugin.general.Clock;

public class SlimefunBackup {

	public static void start() {
		File folder = new File("data-storage/Slimefun/block-backups");
		List<File> backups = Arrays.asList(folder.listFiles());

		if (backups.size() > 20) {
			Collections.sort(backups, (a, b) -> {
				try {
					return (int) (new SimpleDateFormat("yyyy-MM-dd-HH-mm").parse(a.getName().replace(".zip", "")).getTime() - new SimpleDateFormat("yyyy-MM-dd-HH-mm").parse(b.getName().replace(".zip", "")).getTime());
				} catch (ParseException e) {
					return 0;
				}
			});

			for (int i = backups.size() - 20; i > 0; i--) {
				backups.get(i).delete();
			}
		}

		File file = new File("data-storage/Slimefun/block-backups/" + Clock.format(new Date()) + ".zip");
		byte[] buffer = new byte[1024];

		if (file.exists()) {
			file.delete();
		}

		try {
			file.createNewFile();

			try (ZipOutputStream output = new ZipOutputStream(new FileOutputStream(file))) {
				for (File f1: new File("data-storage/Slimefun/stored-blocks/").listFiles()) {
					for (File f: f1.listFiles()) {
						ZipEntry entry = new ZipEntry("stored-blocks/" + f1.getName() + "/" + f.getName());
						output.putNextEntry(entry);

						try (FileInputStream input = new FileInputStream(f)) {
							int length;
							while ((length = input.read(buffer)) > 0) {
								output.write(buffer, 0, length);
							}
						}

						output.closeEntry();
					}
				}

				for (File f: new File("data-storage/Slimefun/universal-inventories/").listFiles()) {
					ZipEntry entry = new ZipEntry("universal-inventories/" + f.getName());
					output.putNextEntry(entry);

					try (FileInputStream input = new FileInputStream(f)) {
						int length;
						while ((length = input.read(buffer)) > 0) {
							output.write(buffer, 0, length);
						}
					}

					output.closeEntry();
				}

				for (File f: new File("data-storage/Slimefun/stored-inventories/").listFiles()) {
					ZipEntry entry = new ZipEntry("stored-inventories/" + f.getName());
					output.putNextEntry(entry);

					try (FileInputStream input = new FileInputStream(f)) {
						int length;
						while ((length = input.read(buffer)) > 0) {
							output.write(buffer, 0, length);
						}
					}

					output.closeEntry();
				}

				File chunks = new File("data-storage/Slimefun/stored-chunks/chunks.sfc");

				if (chunks.exists()) {
					ZipEntry entry = new ZipEntry("stored-chunks/chunks.sfc");
					output.putNextEntry(entry);

					try (FileInputStream input = new FileInputStream(chunks)) {
						int length;
						while ((length = input.read(buffer)) > 0) {
							output.write(buffer, 0, length);
						}
					}

					output.closeEntry();
				}
			}

			System.out.println("[Slimefun] Backed up Blocks to " + file.getName());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}