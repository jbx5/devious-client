import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.util.Comparator;
import net.runelite.mapping.Export;
@ObfuscatedName("cf")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("o")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lnh;Lnh;B)I", garbageValue = "78")
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged(((Buddy) (var1)), ((Buddy) (var2)));
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Llc;B)V", garbageValue = "-55")
	public static void method2655(AbstractArchive var0) {
		class295.StructDefinition_archive = var0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(ILng;Llu;I)V", garbageValue = "1214028762")
	static void method2647(int var0, ArchiveDisk var1, Archive var2) {
		byte[] var3 = null;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			for (ArchiveDiskAction var5 = ((ArchiveDiskAction) (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last())); var5 != null; var5 = ((ArchiveDiskAction) (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()))) {
				if (((long) (var0)) == var5.key && var1 == var5.archiveDisk && var5.type == 0) {
					var3 = var5.data;
					break;
				}
			}
		}
		if (var3 != null) {
			var2.load(var1, var0, var3, true);
		} else {
			byte[] var4 = var1.read(var0);
			var2.load(var1, var0, var4, true);
		}
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2133887826")
	static final void method2654() {
		if (Client.logoutTimer > 0) {
			class433.logOut();
		} else {
			Client.timer.method6553();
			class82.updateGameState(40);
			class240.field2847 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIII)V", garbageValue = "1799333746")
	static final void method2657(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		ViewportMouse.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, false);
	}
}