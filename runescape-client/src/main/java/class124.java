import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
public enum class124 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1531(0, 0),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1528(1, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1525(2, 2),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1523(3, 3),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1527(4, 4),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1526(5, 5),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1529(6, 6),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1530(7, 7),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1524(8, 8);

	@ObfuscatedName("y")
	@Export("operatingSystemName")
	static String operatingSystemName;
	@ObfuscatedName("hh")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -2497053
	)
	final int field1532;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -357833305
	)
	final int field1533;

	class124(int var3, int var4) {
		this.field1532 = var3; // L: 117
		this.field1533 = var4; // L: 118
	} // L: 119

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1533; // L: 122
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llv;I)V",
		garbageValue = "259178183"
	)
	public static void method2964(AbstractArchive var0) {
		StructComposition.StructDefinition_archive = var0; // L: 19
	} // L: 20

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(S)[Lqi;",
		garbageValue = "255"
	)
	static SpritePixels[] method2967() {
		SpritePixels[] var0 = new SpritePixels[class458.SpriteBuffer_spriteCount]; // L: 152

		for (int var1 = 0; var1 < class458.SpriteBuffer_spriteCount; ++var1) { // L: 153
			SpritePixels var2 = var0[var1] = new SpritePixels(); // L: 154
			var2.width = SecureRandomCallable.SpriteBuffer_spriteWidth; // L: 155
			var2.height = class402.SpriteBuffer_spriteHeight; // L: 156
			var2.xOffset = class458.SpriteBuffer_xOffsets[var1]; // L: 157
			var2.yOffset = class458.SpriteBuffer_yOffsets[var1]; // L: 158
			var2.subWidth = ApproximateRouteStrategy.SpriteBuffer_spriteWidths[var1]; // L: 159
			var2.subHeight = UserComparator9.SpriteBuffer_spriteHeights[var1]; // L: 160
			int var3 = var2.subWidth * var2.subHeight; // L: 161
			byte[] var4 = FileSystem.SpriteBuffer_pixels[var1]; // L: 162
			var2.pixels = new int[var3]; // L: 163

			for (int var5 = 0; var5 < var3; ++var5) { // L: 164
				var2.pixels[var5] = class458.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		class458.SpriteBuffer_xOffsets = null; // L: 167
		class458.SpriteBuffer_yOffsets = null; // L: 168
		ApproximateRouteStrategy.SpriteBuffer_spriteWidths = null; // L: 169
		UserComparator9.SpriteBuffer_spriteHeights = null; // L: 170
		class458.SpriteBuffer_spritePalette = null; // L: 171
		FileSystem.SpriteBuffer_pixels = null; // L: 172
		return var0; // L: 174
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(Lce;II)V",
		garbageValue = "-2011953728"
	)
	static final void method2956(Actor var0, int var1) {
		class82.worldToScreen(var0.x, var0.y, var1); // L: 5230
	} // L: 5231

	@ObfuscatedName("kn")
	static final void method2965(double var0) {
		Rasterizer3D.Rasterizer3D_setBrightness(var0); // L: 11586
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0); // L: 11587
		MouseRecorder.method2247(); // L: 11588
		Player.clientPreferences.method2399(var0); // L: 11589
	} // L: 11590
}
