import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("jb")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("iv")
	@ObfuscatedSignature(descriptor = "[Lql;")
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;

	@ObfuscatedName("o")
	byte[] field3181;

	@ObfuscatedName("q")
	byte[] field3191;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -269407849)
	int field3180;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 2098863067)
	int field3183;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1094581829)
	int field3184;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1087093375)
	int field3185;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 1945654061)
	int field3186;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 363338077)
	int field3182;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -456929793)
	int field3188;

	MusicPatchNode2() {
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(IIIII)I", garbageValue = "1425759949")
	static final int method5247(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1;
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
	}
}