import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Comparator;
import net.runelite.mapping.Export;
@ObfuscatedName("nf")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("q")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;

	@ObfuscatedName("r")
	@Export("cacheParentPaths")
	static String[] cacheParentPaths;

	@ObfuscatedName("ja")
	@ObfuscatedGetter(intValue = 1435916161)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;

	@ObfuscatedName("h")
	@Export("nextComparator")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;I)V", garbageValue = "-1795552245")
	@Export("addComparator")
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) {
			this.nextComparator = var1;
		} else if (this.nextComparator instanceof AbstractUserComparator) {
			((AbstractUserComparator) (this.nextComparator)).addComparator(var1);
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(Lnb;Lnb;B)I", garbageValue = "80")
	@Export("compareUser")
	protected final int compareUser(User var1, User var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(ILnk;Lln;I)V", garbageValue = "-1499141243")
	static void method6637(int var0, ArchiveDisk var1, Archive var2) {
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)I", garbageValue = "-549396051")
	public static int method6644(CharSequence var0) {
		return WorldMapIcon_0.method4838(var0, 10, true);
	}
}