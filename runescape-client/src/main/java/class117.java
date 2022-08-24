import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("dj")
public class class117 {
	@ObfuscatedName("s")
	boolean field1447;

	@ObfuscatedName("h")
	boolean field1438;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Ldg;")
	class116 field1439;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Ldg;")
	class116 field1449;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "[Ldr;")
	class113[] field1441;

	@ObfuscatedName("q")
	boolean field1442;

	@ObfuscatedName("i")
	float field1437;

	@ObfuscatedName("k")
	float field1444;

	@ObfuscatedName("o")
	float[] field1445 = new float[4];

	@ObfuscatedName("n")
	float[] field1440 = new float[4];

	@ObfuscatedName("d")
	boolean field1448 = true;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -142194557)
	int field1446 = 0;

	@ObfuscatedName("m")
	float[] field1454;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -1852010129)
	int field1450;

	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = -777934173)
	int field1451;

	@ObfuscatedName("z")
	float field1452;

	@ObfuscatedName("r")
	float field1443;

	class117() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lqr;II)I", garbageValue = "1553569592")
	int method2685(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		int var4 = var1.readUnsignedByte();
		class123[] var5 = new class123[]{ class123.field1508, class123.field1515, class123.field1507, class123.field1512, class123.field1509, class123.field1518, class123.field1511, class123.field1510, class123.field1513 };
		class123 var6 = ((class123) (GameEngine.findEnumerated(var5, var4)));
		if (var6 == null) {
			var6 = class123.field1513;
		}
		int var12 = var1.readUnsignedByte();
		class116[] var7 = new class116[]{ class116.field1434, class116.field1431, class116.field1428, class116.field1433, class116.field1432 };
		class116 var8 = ((class116) (GameEngine.findEnumerated(var7, var12)));
		if (var8 == null) {
			var8 = class116.field1434;
		}
		this.field1439 = var8;
		int var13 = var1.readUnsignedByte();
		class116[] var9 = new class116[]{ class116.field1434, class116.field1431, class116.field1428, class116.field1433, class116.field1432 };
		class116 var10 = ((class116) (GameEngine.findEnumerated(var9, var13)));
		if (var10 == null) {
			var10 = class116.field1434;
		}
		this.field1449 = var10;
		this.field1447 = var1.readUnsignedByte() != 0;
		this.field1441 = new class113[var3];
		class113 var15 = null;
		int var14;
		for (var14 = 0; var14 < var3; ++var14) {
			class113 var11 = new class113();
			var11.method2621(var1, var2);
			this.field1441[var14] = var11;
			if (var15 != null) {
				var15.field1404 = var11;
			}
			var15 = var11;
		}
		this.field1450 = this.field1441[0].field1400;
		this.field1451 = this.field1441[this.method2712() - 1].field1400;
		this.field1454 = new float[this.method2686() + 1];
		for (var14 = this.method2687(); var14 <= this.method2709(); ++var14) {
			this.field1454[var14 - this.method2687()] = class10.method86(this, ((float) (var14)));
		}
		this.field1441 = null;
		this.field1452 = class10.method86(this, ((float) (this.method2687() - 1)));
		this.field1443 = class10.method86(this, ((float) (this.method2709() + 1)));
		return var3;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(II)F", garbageValue = "-313022235")
	public float method2705(int var1) {
		if (var1 < this.method2687()) {
			return this.field1452;
		} else {
			return var1 > this.method2709() ? this.field1443 : this.field1454[var1 - this.method2687()];
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(S)I", garbageValue = "512")
	int method2687() {
		return this.field1450;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "428317719")
	int method2709() {
		return this.field1451;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-70")
	int method2686() {
		return this.method2709() - this.method2687();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(FI)I", garbageValue = "1558860712")
	int method2690(float var1) {
		if (this.field1446 < 0 || !(((float) (this.field1441[this.field1446].field1400)) <= var1) || this.field1441[this.field1446].field1404 != null && !(((float) (this.field1441[this.field1446].field1404.field1400)) > var1)) {
			if (!(var1 < ((float) (this.method2687()))) && !(var1 > ((float) (this.method2709())))) {
				int var2 = this.method2712();
				int var3 = this.field1446;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;
					do {
						int var6 = var5 + var4 >> 1;
						if (var1 < ((float) (this.field1441[var6].field1400))) {
							if (var1 > ((float) (this.field1441[var6 - 1].field1400))) {
								var3 = var6 - 1;
								break;
							}
							var5 = var6 - 1;
						} else {
							if (!(var1 > ((float) (this.field1441[var6].field1400)))) {
								var3 = var6;
								break;
							}
							if (var1 < ((float) (this.field1441[var6 + 1].field1400))) {
								var3 = var6;
								break;
							}
							var4 = var6 + 1;
						}
					} while (var4 <= var5 );
				}
				if (var3 != this.field1446) {
					this.field1446 = var3;
					this.field1448 = true;
				}
				return this.field1446;
			} else {
				return -1;
			}
		} else {
			return this.field1446;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(FB)Ldr;", garbageValue = "-25")
	class113 method2691(float var1) {
		int var2 = this.method2690(var1);
		return var2 >= 0 && var2 < this.field1441.length ? this.field1441[var2] : null;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "16711935")
	int method2712() {
		return this.field1441 == null ? 0 : this.field1441.length;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "([BB)V", garbageValue = "51")
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class457.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class457.SpriteBuffer_xOffsets = new int[class457.SpriteBuffer_spriteCount];
		InterfaceParent.SpriteBuffer_yOffsets = new int[class457.SpriteBuffer_spriteCount];
		class457.SpriteBuffer_spriteWidths = new int[class457.SpriteBuffer_spriteCount];
		SoundCache.SpriteBuffer_spriteHeights = new int[class457.SpriteBuffer_spriteCount];
		class181.SpriteBuffer_pixels = new byte[class457.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class457.SpriteBuffer_spriteCount * 8;
		class457.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class457.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;
		int var3;
		for (var3 = 0; var3 < class457.SpriteBuffer_spriteCount; ++var3) {
			class457.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}
		for (var3 = 0; var3 < class457.SpriteBuffer_spriteCount; ++var3) {
			InterfaceParent.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}
		for (var3 = 0; var3 < class457.SpriteBuffer_spriteCount; ++var3) {
			class457.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}
		for (var3 = 0; var3 < class457.SpriteBuffer_spriteCount; ++var3) {
			SoundCache.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}
		var1.offset = var0.length - 7 - class457.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		class457.SpriteBuffer_spritePalette = new int[var2];
		for (var3 = 1; var3 < var2; ++var3) {
			class457.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (class457.SpriteBuffer_spritePalette[var3] == 0) {
				class457.SpriteBuffer_spritePalette[var3] = 1;
			}
		}
		var1.offset = 0;
		for (var3 = 0; var3 < class457.SpriteBuffer_spriteCount; ++var3) {
			int var4 = class457.SpriteBuffer_spriteWidths[var3];
			int var5 = SoundCache.SpriteBuffer_spriteHeights[var3];
			int var6 = var4 * var5;
			byte[] var7 = new byte[var6];
			class181.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var4 * var10] = var1.readByte();
					}
				}
			}
		}
	}
}