import java.util.ArrayList;
import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
@Implements("MusicPatch")
public class MusicPatch extends Node {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1443245103
	)
	int field3565;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lcj;"
	)
	@Export("rawSounds")
	class53[] rawSounds;
	@ObfuscatedName("at")
	short[] field3557;
	@ObfuscatedName("an")
	byte[] field3561;
	@ObfuscatedName("ao")
	byte[] field3562;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lmb;"
	)
	MusicPatchNode2[] field3563;
	@ObfuscatedName("aw")
	byte[] field3564;
	@ObfuscatedName("ad")
	ArrayList field3560;
	@ObfuscatedName("al")
	int[] field3566;

	MusicPatch(byte[] var1) {
		this.field3560 = new ArrayList(8);
		this.rawSounds = new class53[128];
		this.field3557 = new short[128];
		this.field3561 = new byte[128];
		this.field3562 = new byte[128];
		this.field3563 = new MusicPatchNode2[128];
		this.field3564 = new byte[128];
		this.field3566 = new int[128];
		Buffer var2 = new Buffer(var1);

		int var3;
		for (var3 = 0; var2.array[var3 + var2.offset] != 0; ++var3) {
		}

		byte[] var4 = new byte[var3];

		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			var4[var5] = var2.readByte();
		}

		++var2.offset;
		++var3;
		var5 = var2.offset;
		var2.offset += var3;

		int var6;
		for (var6 = 0; var2.array[var6 + var2.offset] != 0; ++var6) {
		}

		byte[] var7 = new byte[var6];

		int var8;
		for (var8 = 0; var8 < var6; ++var8) {
			var7[var8] = var2.readByte();
		}

		++var2.offset;
		++var6;
		var8 = var2.offset;
		var2.offset += var6;

		int var9;
		for (var9 = 0; var2.array[var9 + var2.offset] != 0; ++var9) {
		}

		byte[] var10 = new byte[var9];

		for (int var11 = 0; var11 < var9; ++var11) {
			var10[var11] = var2.readByte();
		}

		++var2.offset;
		++var9;
		byte[] var37 = new byte[var9];
		int var12;
		int var14;
		if (var9 > 1) {
			var37[1] = 1;
			int var13 = 1;
			var12 = 2;

			for (var14 = 2; var14 < var9; ++var14) {
				int var42 = var2.readUnsignedByte();
				if (var42 == 0) {
					var13 = var12++;
				} else {
					if (var42 <= var13) {
						--var42;
					}

					var13 = var42;
				}

				var37[var14] = (byte)var13;
			}
		} else {
			var12 = var9;
		}

		MusicPatchNode2[] var38 = new MusicPatchNode2[var12];

		MusicPatchNode2 var15;
		for (var14 = 0; var14 < var38.length; ++var14) {
			var15 = var38[var14] = new MusicPatchNode2();
			int var41 = var2.readUnsignedByte();
			if (var41 > 0) {
				var15.field3488 = new byte[var41 * 2];
			}

			var41 = var2.readUnsignedByte();
			if (var41 > 0) {
				var15.field3482 = new byte[var41 * 2 + 2];
				var15.field3482[1] = 64;
			}
		}

		var14 = var2.readUnsignedByte();
		byte[] var43 = var14 > 0 ? new byte[var14 * 2] : null;
		var14 = var2.readUnsignedByte();
		byte[] var16 = var14 > 0 ? new byte[var14 * 2] : null;

		int var17;
		for (var17 = 0; var2.array[var17 + var2.offset] != 0; ++var17) {
		}

		byte[] var18 = new byte[var17];

		int var19;
		for (var19 = 0; var19 < var17; ++var19) {
			var18[var19] = var2.readByte();
		}

		++var2.offset;
		++var17;
		var19 = 0;

		int var20;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			this.field3557[var20] = (short)var19;
		}

		var19 = 0;

		short[] var49;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			var49 = this.field3557;
			var49[var20] = (short)(var49[var20] + (var19 << 8));
		}

		var20 = 0;
		int var21 = 0;
		int var22 = 0;

		int var23;
		for (var23 = 0; var23 < 128; ++var23) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				var22 = var2.readVarInt();
			}

			var49 = this.field3557;
			var49[var23] = (short)(var49[var23] + ((var22 - 1 & 2) << 14));
			this.field3566[var23] = var22;
			--var20;
		}

		var20 = 0;
		var21 = 0;
		var23 = 0;

		int var24;
		for (var24 = 0; var24 < 128; ++var24) {
			if (this.field3566[var24] != 0) {
				if (var20 == 0) {
					if (var21 < var4.length) {
						var20 = var4[var21++];
					} else {
						var20 = -1;
					}

					var23 = var2.array[var5++] - 1;
				}

				this.field3564[var24] = (byte)var23;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var24 = 0;

		for (int var25 = 0; var25 < 128; ++var25) {
			if (this.field3566[var25] != 0) {
				if (var20 == 0) {
					if (var21 < var7.length) {
						var20 = var7[var21++];
					} else {
						var20 = -1;
					}

					var24 = var2.array[var8++] + 16 << 2;
				}

				this.field3562[var25] = (byte)var24;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		MusicPatchNode2 var39 = null;

		int var26;
		for (var26 = 0; var26 < 128; ++var26) {
			if (this.field3566[var26] != 0) {
				if (var20 == 0) {
					var39 = var38[var37[var21]];
					if (var21 < var10.length) {
						var20 = var10[var21++];
					} else {
						var20 = -1;
					}
				}

				this.field3563[var26] = var39;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var26 = 0;

		int var27;
		for (var27 = 0; var27 < 128; ++var27) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				if (this.field3566[var27] > 0) {
					var26 = var2.readUnsignedByte() + 1;
				}
			}

			this.field3561[var27] = (byte)var26;
			--var20;
		}

		this.field3565 = var2.readUnsignedByte() + 1;

		int var29;
		MusicPatchNode2 var40;
		for (var27 = 0; var27 < var12; ++var27) {
			var40 = var38[var27];
			if (var40.field3488 != null) {
				for (var29 = 1; var29 < var40.field3488.length; var29 += 2) {
					var40.field3488[var29] = var2.readByte();
				}
			}

			if (var40.field3482 != null) {
				for (var29 = 3; var29 < var40.field3482.length - 2; var29 += 2) {
					var40.field3482[var29] = var2.readByte();
				}
			}
		}

		if (var43 != null) {
			for (var27 = 1; var27 < var43.length; var27 += 2) {
				var43[var27] = var2.readByte();
			}
		}

		if (var16 != null) {
			for (var27 = 1; var27 < var16.length; var27 += 2) {
				var16[var27] = var2.readByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var40 = var38[var27];
			if (var40.field3482 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var40.field3482.length; var29 += 2) {
					var19 = 1 + var19 + var2.readUnsignedByte();
					var40.field3482[var29] = (byte)var19;
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var40 = var38[var27];
			if (var40.field3488 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var40.field3488.length; var29 += 2) {
					var19 = 1 + var19 + var2.readUnsignedByte();
					var40.field3488[var29] = (byte)var19;
				}
			}
		}

		byte var30;
		int var32;
		int var33;
		int var34;
		int var35;
		int var46;
		byte var48;
		if (var43 != null) {
			var19 = var2.readUnsignedByte();
			var43[0] = (byte)var19;

			for (var27 = 2; var27 < var43.length; var27 += 2) {
				var19 = var19 + 1 + var2.readUnsignedByte();
				var43[var27] = (byte)var19;
			}

			var48 = var43[0];
			byte var28 = var43[1];

			for (var29 = 0; var29 < var48; ++var29) {
				this.field3561[var29] = (byte)(var28 * this.field3561[var29] + 32 >> 6);
			}

			for (var29 = 2; var29 < var43.length; var29 += 2) {
				var30 = var43[var29];
				byte var31 = var43[var29 + 1];
				var32 = var28 * (var30 - var48) + (var30 - var48) / 2;

				for (var33 = var48; var33 < var30; ++var33) {
					var35 = var30 - var48;
					int var36 = var32 >>> 31;
					var34 = (var36 + var32) / var35 - var36;
					this.field3561[var33] = (byte)(var34 * this.field3561[var33] + 32 >> 6);
					var32 += var31 - var28;
				}

				var48 = var30;
				var28 = var31;
			}

			for (var46 = var48; var46 < 128; ++var46) {
				this.field3561[var46] = (byte)(var28 * this.field3561[var46] + 32 >> 6);
			}

			var15 = null;
		}

		if (var16 != null) {
			var19 = var2.readUnsignedByte();
			var16[0] = (byte)var19;

			for (var27 = 2; var27 < var16.length; var27 += 2) {
				var19 = var19 + 1 + var2.readUnsignedByte();
				var16[var27] = (byte)var19;
			}

			var48 = var16[0];
			int var45 = var16[1] << 1;

			for (var29 = 0; var29 < var48; ++var29) {
				var46 = var45 + (this.field3562[var29] & 255);
				if (var46 < 0) {
					var46 = 0;
				}

				if (var46 > 128) {
					var46 = 128;
				}

				this.field3562[var29] = (byte)var46;
			}

			int var47;
			for (var29 = 2; var29 < var16.length; var29 += 2) {
				var30 = var16[var29];
				var47 = var16[var29 + 1] << 1;
				var32 = var45 * (var30 - var48) + (var30 - var48) / 2;

				for (var33 = var48; var33 < var30; ++var33) {
					var34 = class254.method4942(var32, var30 - var48);
					var35 = var34 + (this.field3562[var33] & 255);
					if (var35 < 0) {
						var35 = 0;
					}

					if (var35 > 128) {
						var35 = 128;
					}

					this.field3562[var33] = (byte)var35;
					var32 += var47 - var45;
				}

				var48 = var30;
				var45 = var47;
			}

			for (var46 = var48; var46 < 128; ++var46) {
				var47 = var45 + (this.field3562[var46] & 255);
				if (var47 < 0) {
					var47 = 0;
				}

				if (var47 > 128) {
					var47 = 128;
				}

				this.field3562[var46] = (byte)var47;
			}

			Object var44 = null;
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var38[var27].field3489 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var40 = var38[var27];
			if (var40.field3488 != null) {
				var40.field3484 = var2.readUnsignedByte();
			}

			if (var40.field3482 != null) {
				var40.field3487 = var2.readUnsignedByte();
			}

			if (var40.field3489 > 0) {
				var40.field3486 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var38[var27].field3485 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var40 = var38[var27];
			if (var40.field3485 > 0) {
				var40.field3483 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var40 = var38[var27];
			if (var40.field3483 > 0) {
				var40.field3481 = var2.readUnsignedByte();
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lbq;Ljava/util/BitSet;I)Z",
		garbageValue = "157937762"
	)
	boolean method6186(SoundCache var1, BitSet var2) {
		boolean var3 = true;
		int var4 = 0;
		class53 var5 = new class53();

		int var7;
		for (int var6 = var2.nextSetBit(0); var6 != -1; var6 = var2.nextSetBit(var7)) {
			var7 = var2.nextClearBit(var6);

			for (int var8 = var6; var8 < var7; ++var8) {
				if (var2.get(var8)) {
					int var9 = this.field3566[var8];
					if (var9 != 0) {
						if (var9 != var4) {
							var4 = var9--;
							if ((var9 & 1) == 0) {
								var5 = new class53(var1.method826(var9 >> 2));
							} else {
								var5 = var1.method834(var9 >> 2);
							}

							if (var5.method1042()) {
								var3 = false;
							} else {
								this.field3560.add(this.field3560.size(), var5);
							}
						}

						if (!var5.method1042()) {
							this.rawSounds[var8] = var5;
							this.field3566[var8] = 0;
						}
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2042479896"
	)
	void method6179() {
		this.field3566 = null;
	}
}
