import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
public class class321 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	public static AbstractArchive field3480;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	public static AbstractArchive field3475;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	public static AbstractArchive field3477;
	@ObfuscatedName("ai")
	public static ArrayList field3479;
	@ObfuscatedName("ar")
	public static LinkedList field3478;
	@ObfuscatedName("as")
	@Export("musicSongs")
	public static ArrayList musicSongs;
	@ObfuscatedName("aa")
	static ArrayList field3484;
	@ObfuscatedName("az")
	public static ArrayList field3481;
	@ObfuscatedName("ao")
	public static final List field3482;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 160371303
	)
	@Export("musicPlayerStatus")
	static int musicPlayerStatus;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -351242133
	)
	static int field3476;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 540034119
	)
	static int field3485;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 282906921
	)
	static int field3486;

	static {
		field3479 = null;
		field3478 = new LinkedList();
		musicSongs = new ArrayList(3);
		field3484 = new ArrayList(3);
		field3481 = new ArrayList();
		field3482 = new ArrayList();
		musicPlayerStatus = 0;
		field3476 = 0;
		field3485 = 0;
		field3486 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I[BLrl;B)V",
		garbageValue = "0"
	)
	static void method6113(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 0;
		var3.key = (long)var0;
		var3.data = var1;
		var3.archiveDisk = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		synchronized(ArchiveDiskActionHandler.field4365) {
			if (ArchiveDiskActionHandler.field4362 == 0) {
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field4362 = 600;
			ArchiveDiskActionHandler.field4363 = false;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BB)[I",
		garbageValue = "-79"
	)
	public static int[] method6147(byte[] var0) {
		if (var0 != null && var0.length != 0 && var0.length <= 8) {
			int[] var1 = new int[var0.length];

			for (int var2 = 0; var2 < var0.length; ++var2) {
				if (var0[var2] < 0 || var0[var2] > class557.field5359.length) {
					return null;
				}

				var1[var2] = class557.field5359[var0[var2]];
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-28"
	)
	protected static final void method6145() {
		SecureRandomSSLSocket.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		class496.gameCyclesToDo = 0;
	}
}
