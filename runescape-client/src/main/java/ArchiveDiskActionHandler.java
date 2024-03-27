import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oq")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1592027713
	)
	static int field4360;
	@ObfuscatedName("at")
	static boolean field4358;
	@ObfuscatedName("an")
	static Object field4365;
	@ObfuscatedName("ao")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field4360 = 0;
		field4358 = false;
		field4365 = new Object();
	}

	ArchiveDiskActionHandler() {
	}

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) {
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last();
				}

				if (var1 != null) {
					if (var1.type == 0) {
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							var1.remove();
						}
					} else if (var1.type == 1) {
						var1.data = var1.archiveDisk.read((int)var1.key);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							ArchiveDiskActionHandler_responseQueue.addFirst(var1);
						}
					}

					synchronized(field4365) {
						if ((field4358 || field4360 <= 1) && ArchiveDiskActionHandler_requestQueue.method7256()) {
							field4360 = 0;
							field4365.notifyAll();
							return;
						}

						field4360 = 600;
					}
				} else {
					class499.method8677(100L);
					synchronized(field4365) {
						if ((field4358 || field4360 <= 1) && ArchiveDiskActionHandler_requestQueue.method7256()) {
							field4360 = 0;
							field4365.notifyAll();
							return;
						}

						--field4360;
					}
				}
			}
		} catch (Exception var13) {
			class180.RunException_sendStackTrace((String)null, var13);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)Z",
		garbageValue = "2"
	)
	static final boolean method6905(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6;
		if (var7 < var0 && var7 < var1 && var7 < var2) {
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6;
			if (var7 > var0 && var7 > var1 && var7 > var2) {
				return false;
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6;
				if (var7 < var3 && var7 < var4 && var7 < var5) {
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6;
					return var7 <= var3 || var7 <= var4 || var7 <= var5;
				}
			}
		}
	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZS)V",
		garbageValue = "-19196"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < ItemComposition.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = HttpRequest.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					ReflectionCheck.foundItemIdCount = -1;
					class59.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		class59.foundItemIds = var2;
		MusicSong.foundItemIndex = 0;
		ReflectionCheck.foundItemIdCount = var3;
		String[] var8 = new String[ReflectionCheck.foundItemIdCount];

		for (int var5 = 0; var5 < ReflectionCheck.foundItemIdCount; ++var5) {
			var8[var5] = HttpRequest.ItemDefinition_get(var2[var5]).name;
		}

		class467.method8371(var8, class59.foundItemIds);
	}
}
