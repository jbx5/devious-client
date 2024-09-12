import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("ag")
	@Export("Tiles_overlays")
	static short[][][] Tiles_overlays;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2045762615
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;

	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-63683089"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-70"
	)
	@Export("set")
	public abstract void set(byte[] var1);

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-558949762"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}

		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(IZZZZZI)Lof;",
		garbageValue = "1918811219"
	)
	static Archive method7402(int var0, boolean var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		ArchiveDisk var6 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var6 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class215.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var6, class382.masterDisk, FontName.field5260, var0, var1, var2, var3, var4, var5);
	}
}
