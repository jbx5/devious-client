import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public class class117 {
	@ObfuscatedName("v")
	boolean field1413;
	@ObfuscatedName("c")
	boolean field1408;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Ldi;")

	class116 field1409;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Ldi;")

	class116 field1410;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"[Ldm;")

	class113[] field1411;
	@ObfuscatedName("n")
	boolean field1412;
	@ObfuscatedName("s")
	float field1422;
	@ObfuscatedName("l")
	float field1414;
	@ObfuscatedName("q")
	float[] field1415;
	@ObfuscatedName("o")
	float[] field1416;
	@ObfuscatedName("r")
	boolean field1407;
	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 
	1038794237)

	int field1418;
	@ObfuscatedName("w")
	float[] field1419;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	-297304491)

	int field1417;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	-1891962511)

	int field1421;
	@ObfuscatedName("m")
	float field1425;
	@ObfuscatedName("u")
	float field1423;

	class117() {
		this.field1415 = new float[4];
		this.field1416 = new float[4];
		this.field1407 = true;
		this.field1418 = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;IB)I", garbageValue = 
	"-14")

	int method2708(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		int var4 = var1.readUnsignedByte();
		class123 var5 = ((class123) (MusicPatchPcmStream.findEnumerated(class385.method6974(), var4)));
		if (var5 == null) {
			var5 = class123.field1489;
		}

		int var6 = var1.readUnsignedByte();
		class116 var7 = ((class116) (MusicPatchPcmStream.findEnumerated(class140.method3045(), var6)));
		if (var7 == null) {
			var7 = class116.field1403;
		}

		this.field1409 = var7;
		int var8 = var1.readUnsignedByte();
		class116 var9 = ((class116) (MusicPatchPcmStream.findEnumerated(class140.method3045(), var8)));
		if (var9 == null) {
			var9 = class116.field1403;
		}

		this.field1410 = var9;
		this.field1413 = var1.readUnsignedByte() != 0;
		this.field1411 = new class113[var3];
		class113 var12 = null;

		int var10;
		for (var10 = 0; var10 < var3; ++var10) {
			class113 var11 = new class113();
			var11.method2647(var1, var2);
			this.field1411[var10] = var11;
			if (var12 != null) {
				var12.field1375 = var11;
			}

			var12 = var11;
		}

		this.field1417 = this.field1411[0].field1373;
		this.field1421 = this.field1411[this.method2715() - 1].field1373;
		this.field1419 = new float[this.method2712() + 1];

		for (var10 = this.method2714(); var10 <= this.method2711(); ++var10) {
			this.field1419[var10 - this.method2714()] = class10.method92(this, ((float) (var10)));
		}

		this.field1411 = null;
		this.field1425 = class10.method92(this, ((float) (this.method2714() - 1)));
		this.field1423 = class10.method92(this, ((float) (this.method2711() + 1)));
		return var3;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(II)F", garbageValue = 
	"937027636")

	public float method2709(int var1) {
		if (var1 < this.method2714()) {
			return this.field1425;
		} else {
			return var1 > this.method2711() ? this.field1423 : this.field1419[var1 - this.method2714()];
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"-43")

	int method2714() {
		return this.field1417;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-589047321")

	int method2711() {
		return this.field1421;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"32")

	int method2712() {
		return this.method2711() - this.method2714();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(FI)I", garbageValue = 
	"-1858768246")

	int method2713(float var1) {
		if (((this.field1418 < 0) || (((float) (this.field1411[this.field1418].field1373)) > var1)) || ((this.field1411[this.field1418].field1375 != null) && (((float) (this.field1411[this.field1418].field1375.field1373)) <= var1))) {
			if ((var1 >= ((float) (this.method2714()))) && (var1 <= ((float) (this.method2711())))) {
				int var2 = this.method2715();
				int var3 = this.field1418;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = (var4 + var5) >> 1;
						if (var1 < ((float) (this.field1411[var6].field1373))) {
							if (var1 > ((float) (this.field1411[var6 - 1].field1373))) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (var1 <= ((float) (this.field1411[var6].field1373))) {
								var3 = var6;
								break;
							}

							if (var1 < ((float) (this.field1411[var6 + 1].field1373))) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while (var4 <= var5 );
				}

				if (var3 != this.field1418) {
					this.field1418 = var3;
					this.field1407 = true;
				}

				return this.field1418;
			} else {
				return -1;
			}
		} else {
			return this.field1418;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(FB)Ldm;", garbageValue = 
	"-11")

	class113 method2736(float var1) {
		int var2 = this.method2713(var1);
		return (var2 >= 0) && (var2 < this.field1411.length) ? this.field1411[var2] : null;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"2021346356")

	int method2715() {
		return this.field1411 == null ? 0 : this.field1411.length;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"([Ljava/lang/String;[SIII)V", garbageValue = 
	"-1434751049")

	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if ((var6 == null) || ((var0[var8] != null) && (var0[var8].compareTo(var6) < (var8 & 1)))) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}

	}
}