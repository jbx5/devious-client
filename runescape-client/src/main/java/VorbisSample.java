import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("VorbisSample")
public class VorbisSample extends Node {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	static class60 field352;
	@ObfuscatedName("ac")
	static int field353;
	@ObfuscatedName("ae")
	static int field354;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lcx;"
	)
	static VorbisCodebook[] field377;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lbt;"
	)
	static VorbisFloor[] field356;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lbw;"
	)
	static VorbisResidue[] field368;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lby;"
	)
	static VorbisMapping[] field358;
	@ObfuscatedName("as")
	static boolean[] field359;
	@ObfuscatedName("aw")
	static int[] field360;
	@ObfuscatedName("af")
	static boolean field361;
	@ObfuscatedName("ap")
	static float[] field351;
	@ObfuscatedName("ak")
	static float[] field355;
	@ObfuscatedName("ai")
	static float[] field369;
	@ObfuscatedName("at")
	static float[] field346;
	@ObfuscatedName("az")
	static float[] field357;
	@ObfuscatedName("bg")
	static float[] field375;
	@ObfuscatedName("bz")
	static int[] field373;
	@ObfuscatedName("bj")
	static int[] field367;
	@ObfuscatedName("ab")
	byte[][] field372;
	@ObfuscatedName("ay")
	@Export("sampleRate")
	int sampleRate;
	@ObfuscatedName("an")
	@Export("sampleCount")
	int sampleCount;
	@ObfuscatedName("au")
	@Export("start")
	int start;
	@ObfuscatedName("ax")
	@Export("end")
	int end;
	@ObfuscatedName("ao")
	boolean field350;
	@ObfuscatedName("aa")
	float[] field362;
	@ObfuscatedName("ah")
	int field363;
	@ObfuscatedName("ag")
	int field374;
	@ObfuscatedName("av")
	boolean field365;
	@ObfuscatedName("ar")
	float[] field366;
	@ObfuscatedName("bc")
	@Export("samples")
	byte[] samples;
	@ObfuscatedName("bo")
	int field376;
	@ObfuscatedName("bm")
	int field364;

	static {
		field352 = new class60();
		field361 = false;
	}

	VorbisSample(byte[] var1) {
		this.read(var1);
	}

	@ObfuscatedName("ay")
	@Export("read")
	void read(byte[] var1) {
		Buffer var2 = new Buffer(var1);
		this.sampleRate = var2.readInt();
		this.sampleCount = var2.readInt();
		this.start = var2.readInt();
		this.end = var2.readInt();
		if (this.end < 0) {
			this.end = ~this.end;
			this.field350 = true;
		}

		int var3 = var2.readInt();
		this.field372 = new byte[var3][];

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = 0;

			int var6;
			do {
				var6 = var2.readUnsignedByte();
				var5 += var6;
			} while(var6 >= 255);

			byte[] var7 = new byte[var5];
			var2.readBytes(var7, 0, var5);
			this.field372[var4] = var7;
		}

	}

	@ObfuscatedName("au")
	float[] method1066(int var1) {
		class60 var2 = new class60();
		var2.method1139(this.field372[var1], 0);
		this.field366 = new float[field354];
		var2.method1138();
		int var3 = var2.method1146(class170.iLog(field360.length - 1));
		boolean var4 = field359[var3];
		int var5 = var4 ? field354 : field353;
		boolean var6 = false;
		boolean var7 = false;
		if (var4) {
			var6 = var2.method1138() != 0;
			var7 = var2.method1138() != 0;
		}

		int var8 = var5 >> 1;
		int var9;
		int var10;
		int var11;
		if (var4 && !var6) {
			var9 = (var5 >> 2) - (field353 >> 2);
			var10 = (field353 >> 2) + (var5 >> 2);
			var11 = field353 >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}

		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (field353 >> 2);
			var13 = (field353 >> 2) + (var5 - (var5 >> 2));
			var14 = field353 >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}

		VorbisMapping var15 = field358[field360[var3]];
		int var16 = var15.field332;
		int var17 = var15.field334[var16];
		class59 var18 = field356[var17].method735(var2);
		boolean var19 = !var18.method1130();

		int var20;
		for (var20 = 0; var20 < var15.field333; ++var20) {
			VorbisResidue var45 = field368[var15.field335[var20]];
			float[] var47 = this.field366;
			var45.method845(var47, var5 >> 1, var19, var2);
		}

		if (var18.method1130()) {
			var16 = var15.field332;
			int var10000 = var15.field334[var16];
			var18.method1118(this.field366, var5 >> 1);
		}

		int var21;
		int var22;
		if (!var18.method1130()) {
			for (var20 = var5 >> 1; var20 < var5; ++var20) {
				this.field366[var20] = 0.0F;
			}
		} else {
			var20 = var5 >> 1;
			var21 = var5 >> 2;
			var22 = var5 >> 3;
			float[] var23 = this.field366;

			int var24;
			for (var24 = 0; var24 < var20; ++var24) {
				var23[var24] *= 0.5F;
			}

			for (var24 = var20; var24 < var5; ++var24) {
				var23[var24] = -var23[var5 - var24 - 1];
			}

			float[] var43 = var4 ? field346 : field351;
			float[] var25 = var4 ? field357 : field355;
			float[] var26 = var4 ? field375 : field369;
			int[] var27 = var4 ? field367 : field373;

			int var28;
			float var29;
			float var30;
			float var31;
			float var32;
			for (var28 = 0; var28 < var21; ++var28) {
				var29 = var23[var28 * 4] - var23[var5 - var28 * 4 - 1];
				var30 = var23[var28 * 4 + 2] - var23[var5 - var28 * 4 - 3];
				var31 = var43[var28 * 2];
				var32 = var43[var28 * 2 + 1];
				var23[var5 - var28 * 4 - 1] = var29 * var31 - var30 * var32;
				var23[var5 - var28 * 4 - 3] = var29 * var32 + var30 * var31;
			}

			float var33;
			float var34;
			for (var28 = 0; var28 < var22; ++var28) {
				var29 = var23[var20 + var28 * 4 + 3];
				var30 = var23[var20 + var28 * 4 + 1];
				var31 = var23[var28 * 4 + 3];
				var32 = var23[var28 * 4 + 1];
				var23[var20 + var28 * 4 + 3] = var29 + var31;
				var23[var20 + var28 * 4 + 1] = var30 + var32;
				var33 = var43[var20 - 4 - var28 * 4];
				var34 = var43[var20 - 3 - var28 * 4];
				var23[var28 * 4 + 3] = (var29 - var31) * var33 - (var30 - var32) * var34;
				var23[var28 * 4 + 1] = (var30 - var32) * var33 + (var29 - var31) * var34;
			}

			var28 = class170.iLog(var5 - 1);

			int var48;
			int var49;
			int var50;
			int var51;
			for (var48 = 0; var48 < var28 - 3; ++var48) {
				var49 = var5 >> var48 + 2;
				var50 = 8 << var48;

				for (var51 = 0; var51 < 2 << var48; ++var51) {
					int var52 = var5 - var49 * var51 * 2;
					int var53 = var5 - var49 * (var51 * 2 + 1);

					for (int var35 = 0; var35 < var5 >> var48 + 4; ++var35) {
						int var36 = var35 * 4;
						float var37 = var23[var52 - 1 - var36];
						float var38 = var23[var52 - 3 - var36];
						float var39 = var23[var53 - 1 - var36];
						float var40 = var23[var53 - 3 - var36];
						var23[var52 - 1 - var36] = var37 + var39;
						var23[var52 - 3 - var36] = var38 + var40;
						float var41 = var43[var35 * var50];
						float var42 = var43[var35 * var50 + 1];
						var23[var53 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
						var23[var53 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42;
					}
				}
			}

			for (var48 = 1; var48 < var22 - 1; ++var48) {
				var49 = var27[var48];
				if (var48 < var49) {
					var50 = var48 * 8;
					var51 = var49 * 8;
					var33 = var23[var50 + 1];
					var23[var50 + 1] = var23[var51 + 1];
					var23[var51 + 1] = var33;
					var33 = var23[var50 + 3];
					var23[var50 + 3] = var23[var51 + 3];
					var23[var51 + 3] = var33;
					var33 = var23[var50 + 5];
					var23[var50 + 5] = var23[var51 + 5];
					var23[var51 + 5] = var33;
					var33 = var23[var50 + 7];
					var23[var50 + 7] = var23[var51 + 7];
					var23[var51 + 7] = var33;
				}
			}

			for (var48 = 0; var48 < var20; ++var48) {
				var23[var48] = var23[var48 * 2 + 1];
			}

			for (var48 = 0; var48 < var22; ++var48) {
				var23[var5 - 1 - var48 * 2] = var23[var48 * 4];
				var23[var5 - 2 - var48 * 2] = var23[var48 * 4 + 1];
				var23[var5 - var21 - 1 - var48 * 2] = var23[var48 * 4 + 2];
				var23[var5 - var21 - 2 - var48 * 2] = var23[var48 * 4 + 3];
			}

			for (var48 = 0; var48 < var22; ++var48) {
				var30 = var26[var48 * 2];
				var31 = var26[var48 * 2 + 1];
				var32 = var23[var20 + var48 * 2];
				var33 = var23[var20 + var48 * 2 + 1];
				var34 = var23[var5 - 2 - var48 * 2];
				float var54 = var23[var5 - 1 - var48 * 2];
				float var55 = var31 * (var32 - var34) + var30 * (var33 + var54);
				var23[var20 + var48 * 2] = (var32 + var34 + var55) * 0.5F;
				var23[var5 - 2 - var48 * 2] = (var32 + var34 - var55) * 0.5F;
				var55 = var31 * (var33 + var54) - var30 * (var32 - var34);
				var23[var20 + var48 * 2 + 1] = (var33 - var54 + var55) * 0.5F;
				var23[var5 - 1 - var48 * 2] = (-var33 + var54 + var55) * 0.5F;
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var48] = var23[var20 + var48 * 2] * var25[var48 * 2] + var23[var20 + var48 * 2 + 1] * var25[var48 * 2 + 1];
				var23[var20 - 1 - var48] = var23[var20 + var48 * 2] * var25[var48 * 2 + 1] - var23[var20 + var48 * 2 + 1] * var25[var48 * 2];
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var48 + (var5 - var21)] = -var23[var48];
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var48] = var23[var21 + var48];
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var21 + var48] = -var23[var21 - var48 - 1];
			}

			for (var48 = 0; var48 < var21; ++var48) {
				var23[var20 + var48] = var23[var5 - var48 - 1];
			}

			float[] var57;
			for (var48 = var9; var48 < var10; ++var48) {
				var30 = (float)Math.sin(((double)(var48 - var9) + 0.5D) / (double)var11 * 0.5D * 3.141592653589793D);
				var57 = this.field366;
				var57[var48] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}

			for (var48 = var12; var48 < var13; ++var48) {
				var30 = (float)Math.sin(((double)(var48 - var12) + 0.5D) / (double)var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				var57 = this.field366;
				var57[var48] *= (float)Math.sin(1.5707963267948966D * (double)var30 * (double)var30);
			}
		}

		float[] var44 = null;
		if (this.field363 > 0) {
			var21 = var5 + this.field363 >> 2;
			var44 = new float[var21];
			int var46;
			if (!this.field365) {
				for (var22 = 0; var22 < this.field374; ++var22) {
					var46 = var22 + (this.field363 >> 1);
					var44[var22] += this.field362[var46];
				}
			}

			if (var18.method1130()) {
				for (var22 = var9; var22 < var5 >> 1; ++var22) {
					var46 = var44.length - (var5 >> 1) + var22;
					var44[var46] += this.field366[var22];
				}
			}
		}

		float[] var56 = this.field362;
		this.field362 = this.field366;
		this.field366 = var56;
		this.field363 = var5;
		this.field374 = var13 - (var5 >> 1);
		this.field365 = !var18.method1130();
		return var44;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([I)Lbq;"
	)
	@Export("toRawSound")
	RawSound toRawSound(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (this.samples == null) {
				this.field363 = 0;
				this.field362 = new float[field354];
				this.samples = new byte[this.sampleCount];
				this.field376 = 0;
				this.field364 = 0;
			}

			for (; this.field364 < this.field372.length; ++this.field364) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var2 = this.method1066(this.field364);
				if (var2 != null) {
					int var3 = this.field376;
					int var4 = var2.length;
					if (var4 > this.sampleCount - var3) {
						var4 = this.sampleCount - var3;
					}

					for (int var5 = 0; var5 < var4; ++var5) {
						int var6 = (int)(128.0F + var2[var5] * 128.0F);
						if ((var6 & -256) != 0) {
							var6 = ~var6 >> 31;
						}

						this.samples[var3++] = (byte)(var6 - 128);
					}

					if (var1 != null) {
						var1[0] -= var3 - this.field376;
					}

					this.field376 = var3;
				}
			}

			this.field362 = null;
			byte[] var7 = this.samples;
			this.samples = null;
			return new RawSound(this.sampleRate, var7, this.start, this.end, this.field350);
		}
	}

	@ObfuscatedName("ab")
	@Export("float32Unpack")
	static float float32Unpack(int var0) {
		int var1 = var0 & 2097151;
		int var2 = var0 & Integer.MIN_VALUE;
		int var3 = (var0 & 2145386496) >> 21;
		if (var2 != 0) {
			var1 = -var1;
		}

		return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
	}

	@ObfuscatedName("an")
	static void method1059(byte[] var0) {
		class60 var1 = field352;
		var1.method1139(var0, 0);
		field353 = 1 << var1.method1146(4);
		field354 = 1 << var1.method1146(4);

		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		for (var2 = 0; var2 < 2; ++var2) {
			var3 = var2 != 0 ? field354 : field353;
			var4 = var3 >> 1;
			var5 = var3 >> 2;
			var6 = var3 >> 3;
			float[] var13 = new float[var4];

			for (int var8 = 0; var8 < var5; ++var8) {
				var13[var8 * 2] = (float)Math.cos((double)(var8 * 4) * 3.141592653589793D / (double)var3);
				var13[var8 * 2 + 1] = -((float)Math.sin((double)(var8 * 4) * 3.141592653589793D / (double)var3));
			}

			float[] var14 = new float[var4];

			for (int var9 = 0; var9 < var5; ++var9) {
				var14[var9 * 2] = (float)Math.cos((double)(var9 * 2 + 1) * 3.141592653589793D / (double)(var3 * 2));
				var14[var9 * 2 + 1] = (float)Math.sin((double)(var9 * 2 + 1) * 3.141592653589793D / (double)(var3 * 2));
			}

			float[] var15 = new float[var5];

			for (int var10 = 0; var10 < var6; ++var10) {
				var15[var10 * 2] = (float)Math.cos((double)(var10 * 4 + 2) * 3.141592653589793D / (double)var3);
				var15[var10 * 2 + 1] = -((float)Math.sin((double)(var10 * 4 + 2) * 3.141592653589793D / (double)var3));
			}

			int[] var16 = new int[var6];
			int var11 = class170.iLog(var6 - 1);

			for (int var12 = 0; var12 < var6; ++var12) {
				var16[var12] = HealthBarUpdate.method2581(var12, var11);
			}

			if (var2 != 0) {
				field346 = var13;
				field357 = var14;
				field375 = var15;
				field367 = var16;
			} else {
				field351 = var13;
				field355 = var14;
				field369 = var15;
				field373 = var16;
			}
		}

		var2 = var1.method1146(8) + 1;
		field377 = new VorbisCodebook[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			field377[var3] = new VorbisCodebook();
		}

		var3 = var1.method1146(6) + 1;

		for (var4 = 0; var4 < var3; ++var4) {
			var1.method1146(16);
		}

		var3 = var1.method1146(6) + 1;
		field356 = new VorbisFloor[var3];

		for (var4 = 0; var4 < var3; ++var4) {
			field356[var4] = new VorbisFloor();
		}

		var4 = var1.method1146(6) + 1;
		field368 = new VorbisResidue[var4];

		for (var5 = 0; var5 < var4; ++var5) {
			field368[var5] = new VorbisResidue();
		}

		var5 = var1.method1146(6) + 1;
		field358 = new VorbisMapping[var5];

		for (var6 = 0; var6 < var5; ++var6) {
			field358[var6] = new VorbisMapping();
		}

		var6 = var1.method1146(6) + 1;
		field359 = new boolean[var6];
		field360 = new int[var6];

		for (int var7 = 0; var7 < var6; ++var7) {
			field359[var7] = var1.method1138() != 0;
			var1.method1146(16);
			var1.method1146(16);
			field360[var7] = var1.method1146(8);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lob;)Z"
	)
	static boolean method1057(AbstractArchive var0) {
		if (!field361) {
			byte[] var1 = var0.takeFile(0, 0);
			if (var1 == null) {
				return false;
			}

			method1059(var1);
			field361 = true;
		}

		return true;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lob;II)Lcz;"
	)
	@Export("readMusicSample")
	static VorbisSample readMusicSample(AbstractArchive var0, int var1, int var2) {
		if (!method1057(var0)) {
			var0.tryLoadFile(var1, var2);
			return null;
		} else {
			byte[] var3 = var0.takeFile(var1, var2);
			return var3 == null ? null : new VorbisSample(var3);
		}
	}
}
