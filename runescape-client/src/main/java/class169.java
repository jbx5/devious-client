import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gs")
final class class169 implements ThreadFactory {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = -4207687721508692447L
	)
	static long field1801;

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)[Lfs;",
		garbageValue = "26"
	)
	static class139[] method3551() {
		return new class139[]{class139.field1611, class139.field1613, class139.field1609, class139.field1610, class139.field1607, class139.field1612, class139.field1608, class139.field1614, class139.field1615};
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1096809925"
	)
	static void method3549() {
		synchronized(ArchiveDiskActionHandler.field4331) {
			if (ArchiveDiskActionHandler.field4329 == 0) {
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field4329 = 600;
			ArchiveDiskActionHandler.field4332 = false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIS)I",
		garbageValue = "18858"
	)
	public static int method3550(int var0, int var1, int var2) {
		int var3 = SpotAnimationDefinition.method3814(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "92"
	)
	static int method3544(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else {
			return 2;
		}
	}
}
