import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("n")
	static final int[] field1970;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-775301691)

	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	1129048987)

	@Export("startBit")
	public int startBit;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	153132931)

	@Export("endBit")
	public int endBit;
	static 
	{
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		field1970 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field1970[var1] = var0 - 1;
			var0 += var0;
		}

	}

	VarbitComposition() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"391271030")

	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		} 
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;II)V", garbageValue = 
	"-467631265")

	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(descriptor = 
	"(IIII)V", garbageValue = 
	"-1670747147")

	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if ((((var0 >= 128) && (var1 >= 128)) && (var0 <= 13056)) && (var1 <= 13056)) {
			int var3 = WorldMapLabel.getTileHeight(var0, var1, class18.Client_plane) - var2;
			var0 -= WorldMapLabelSize.cameraX;
			var3 -= ItemContainer.cameraY;
			var1 -= class154.cameraZ;
			int var4 = Rasterizer3D.Rasterizer3D_sine[class147.cameraPitch];
			int var5 = Rasterizer3D.Rasterizer3D_cosine[class147.cameraPitch];
			int var6 = Rasterizer3D.Rasterizer3D_sine[class21.cameraYaw];
			int var7 = Rasterizer3D.Rasterizer3D_cosine[class21.cameraYaw];
			int var8 = ((var0 * var7) + (var6 * var1)) >> 16;
			var1 = ((var7 * var1) - (var0 * var6)) >> 16;
			var0 = var8;
			var8 = ((var5 * var3) - (var4 * var1)) >> 16;
			var1 = ((var5 * var1) + (var3 * var4)) >> 16;
			if (var1 >= 50) {
				Client.viewportTempX = ((var0 * Client.viewportZoom) / var1) + (Client.viewportWidth / 2);
				Client.viewportTempY = (Client.viewportHeight / 2) + ((var8 * Client.viewportZoom) / var1);
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1667758885")

	static final int method3578() {
		float var0 = 200.0F * (((float) (class131.clientPreferences.method2240())) - 0.5F);
		return 100 - Math.round(var0);
	}
}