import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = 2009823259
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lkb;",
		garbageValue = "-852782106"
	)
	@Export("getModel")
	protected Model getModel() {
		return null;
	}

	@ObfuscatedName("ef")
	void vmethod5198(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10) {
		Model var12 = this.getModel();
		if (var12 != null) {
			this.height = var12.height;
			int var13 = Rasterizer3D.Rasterizer3D_sine[var2];
			int var14 = Rasterizer3D.Rasterizer3D_cosine[var2];
			int var15 = Rasterizer3D.Rasterizer3D_sine[var3];
			int var16 = Rasterizer3D.Rasterizer3D_cosine[var3];
			var12.draw(var1, var13, var14, var15, var16, var4 - var7, var5 - var8, var6 - var9, var10);
		}

	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(ILql;IIIJ)V"
	)
	void vmethod5205(int var1, class423 var2, int var3, int var4, int var5, long var6) {
		Model var8 = this.getModel();
		if (var8 != null) {
			this.height = var8.height;
			var8.vmethod5205(var1, var2, var3, var4, var5, var6);
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lor;Lor;B)Z",
		garbageValue = "84"
	)
	public static boolean method5097(AbstractArchive var0, AbstractArchive var1) {
		WorldMapElement.WorldMapElement_archive = var1;
		if (!var0.isFullyLoaded()) {
			return false;
		} else {
			class193.WorldMapElement_count = var0.getGroupFileCount(35);
			WorldMapElement.WorldMapElement_cached = new WorldMapElement[class193.WorldMapElement_count];

			for (int var2 = 0; var2 < class193.WorldMapElement_count; ++var2) {
				byte[] var3 = var0.takeFile(35, var2);
				WorldMapElement.WorldMapElement_cached[var2] = new WorldMapElement(var2);
				if (var3 != null) {
					WorldMapElement.WorldMapElement_cached[var2].decode(new Buffer(var3));
					WorldMapElement.WorldMapElement_cached[var2].method3828();
				}
			}

			return true;
		}
	}
}
