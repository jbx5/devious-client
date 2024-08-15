import java.util.ArrayList;
import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
@Implements("MusicPatch")
public class MusicPatch extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2095060725
	)
	int field3632;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lcu;"
	)
	@Export("rawSounds")
	class53[] rawSounds;
	@ObfuscatedName("au")
	short[] field3634;
	@ObfuscatedName("ax")
	byte[] field3628;
	@ObfuscatedName("ao")
	byte[] field3631;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lmk;"
	)
	MusicPatchNode2[] field3633;
	@ObfuscatedName("ac")
	byte[] field3630;
	@ObfuscatedName("ae")
	ArrayList field3635;
	@ObfuscatedName("ad")
	int[] field3636;

	MusicPatch(byte[] var1) {
		this.field3635 = new ArrayList(8);
		this.rawSounds = new class53[128];
		this.field3634 = new short[128];
		this.field3628 = new byte[128];
		this.field3631 = new byte[128];
		this.field3633 = new MusicPatchNode2[128];
		this.field3630 = new byte[128];
		this.field3636 = new int[128];
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
		byte[] var38 = new byte[var9];
		int var12;
		int var14;
		if (var9 > 1) {
			var38[1] = 1;
			int var13 = 1;
			var12 = 2;

			for (var14 = 2; var14 < var9; ++var14) {
				int var43 = var2.readUnsignedByte();
				if (var43 == 0) {
					var13 = var12++;
				} else {
					if (var43 <= var13) {
						--var43;
					}

					var13 = var43;
				}

				var38[var14] = (byte)var13;
			}
		} else {
			var12 = var9;
		}

		MusicPatchNode2[] var39 = new MusicPatchNode2[var12];

		MusicPatchNode2 var15;
		for (var14 = 0; var14 < var39.length; ++var14) {
			var15 = var39[var14] = new MusicPatchNode2();
			int var42 = var2.readUnsignedByte();
			if (var42 > 0) {
				var15.field3549 = new byte[var42 * 2];
			}

			var42 = var2.readUnsignedByte();
			if (var42 > 0) {
				var15.field3550 = new byte[var42 * 2 + 2];
				var15.field3550[1] = 64;
			}
		}

		var14 = var2.readUnsignedByte();
		byte[] var44 = var14 > 0 ? new byte[var14 * 2] : null;
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
			this.field3634[var20] = (short)var19;
		}

		var19 = 0;

		short[] var50;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			var50 = this.field3634;
			var50[var20] = (short)(var50[var20] + (var19 << 8));
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

			var50 = this.field3634;
			var50[var23] = (short)(var50[var23] + ((var22 - 1 & 2) << 14));
			this.field3636[var23] = var22;
			--var20;
		}

		var20 = 0;
		var21 = 0;
		var23 = 0;

		int var24;
		for (var24 = 0; var24 < 128; ++var24) {
			if (this.field3636[var24] != 0) {
				if (var20 == 0) {
					if (var21 < var4.length) {
						var20 = var4[var21++];
					} else {
						var20 = -1;
					}

					var23 = var2.array[var5++] - 1;
				}

				this.field3630[var24] = (byte)var23;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var24 = 0;

		for (int var25 = 0; var25 < 128; ++var25) {
			if (this.field3636[var25] != 0) {
				if (var20 == 0) {
					if (var21 < var7.length) {
						var20 = var7[var21++];
					} else {
						var20 = -1;
					}

					var24 = var2.array[var8++] + 16 << 2;
				}

				this.field3631[var25] = (byte)var24;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		MusicPatchNode2 var40 = null;

		int var26;
		for (var26 = 0; var26 < 128; ++var26) {
			if (this.field3636[var26] != 0) {
				if (var20 == 0) {
					var40 = var39[var38[var21]];
					if (var21 < var10.length) {
						var20 = var10[var21++];
					} else {
						var20 = -1;
					}
				}

				this.field3633[var26] = var40;
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

				if (this.field3636[var27] > 0) {
					var26 = var2.readUnsignedByte() + 1;
				}
			}

			this.field3628[var27] = (byte)var26;
			--var20;
		}

		this.field3632 = var2.readUnsignedByte() + 1;

		int var29;
		MusicPatchNode2 var41;
		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field3549 != null) {
				for (var29 = 1; var29 < var41.field3549.length; var29 += 2) {
					var41.field3549[var29] = var2.readByte();
				}
			}

			if (var41.field3550 != null) {
				for (var29 = 3; var29 < var41.field3550.length - 2; var29 += 2) {
					var41.field3550[var29] = var2.readByte();
				}
			}
		}

		if (var44 != null) {
			for (var27 = 1; var27 < var44.length; var27 += 2) {
				var44[var27] = var2.readByte();
			}
		}

		if (var16 != null) {
			for (var27 = 1; var27 < var16.length; var27 += 2) {
				var16[var27] = var2.readByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field3550 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var41.field3550.length; var29 += 2) {
					var19 = var19 + 1 + var2.readUnsignedByte();
					var41.field3550[var29] = (byte)var19;
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field3549 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var41.field3549.length; var29 += 2) {
					var19 = var19 + 1 + var2.readUnsignedByte();
					var41.field3549[var29] = (byte)var19;
				}
			}
		}

		byte var30;
		int var32;
		int var33;
		int var34;
		int var35;
		int var36;
		int var47;
		byte var49;
		if (var44 != null) {
			var19 = var2.readUnsignedByte();
			var44[0] = (byte)var19;

			for (var27 = 2; var27 < var44.length; var27 += 2) {
				var19 = 1 + var19 + var2.readUnsignedByte();
				var44[var27] = (byte)var19;
			}

			var49 = var44[0];
			byte var28 = var44[1];

			for (var29 = 0; var29 < var49; ++var29) {
				this.field3628[var29] = (byte)(var28 * this.field3628[var29] + 32 >> 6);
			}

			for (var29 = 2; var29 < var44.length; var29 += 2) {
				var30 = var44[var29];
				byte var31 = var44[var29 + 1];
				var32 = var28 * (var30 - var49) + (var30 - var49) / 2;

				for (var33 = var49; var33 < var30; ++var33) {
					var35 = var30 - var49;
					var36 = var32 >>> 31;
					var34 = (var36 + var32) / var35 - var36;
					this.field3628[var33] = (byte)(var34 * this.field3628[var33] + 32 >> 6);
					var32 += var31 - var28;
				}

				var49 = var30;
				var28 = var31;
			}

			for (var47 = var49; var47 < 128; ++var47) {
				this.field3628[var47] = (byte)(var28 * this.field3628[var47] + 32 >> 6);
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

			var49 = var16[0];
			int var46 = var16[1] << 1;

			for (var29 = 0; var29 < var49; ++var29) {
				var47 = var46 + (this.field3631[var29] & 255);
				if (var47 < 0) {
					var47 = 0;
				}

				if (var47 > 128) {
					var47 = 128;
				}

				this.field3631[var29] = (byte)var47;
			}

			int var48;
			for (var29 = 2; var29 < var16.length; var29 += 2) {
				var30 = var16[var29];
				var48 = var16[var29 + 1] << 1;
				var32 = var46 * (var30 - var49) + (var30 - var49) / 2;

				for (var33 = var49; var33 < var30; ++var33) {
					var35 = var30 - var49;
					var36 = var32 >>> 31;
					var34 = (var36 + var32) / var35 - var36;
					int var37 = var34 + (this.field3631[var33] & 255);
					if (var37 < 0) {
						var37 = 0;
					}

					if (var37 > 128) {
						var37 = 128;
					}

					this.field3631[var33] = (byte)var37;
					var32 += var48 - var46;
				}

				var49 = var30;
				var46 = var48;
			}

			for (var47 = var49; var47 < 128; ++var47) {
				var48 = var46 + (this.field3631[var47] & 255);
				if (var48 < 0) {
					var48 = 0;
				}

				if (var48 > 128) {
					var48 = 128;
				}

				this.field3631[var47] = (byte)var48;
			}

			Object var45 = null;
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39[var27].field3551 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field3549 != null) {
				var41.field3560 = var2.readUnsignedByte();
			}

			if (var41.field3550 != null) {
				var41.field3553 = var2.readUnsignedByte();
			}

			if (var41.field3551 > 0) {
				var41.field3554 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39[var27].field3556 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field3556 > 0) {
				var41.field3557 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field3557 > 0) {
				var41.field3552 = var2.readUnsignedByte();
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lbn;Ljava/util/BitSet;B)Z",
		garbageValue = "28"
	)
	boolean method6441(SoundCache var1, BitSet var2) {
		boolean var3 = true;
		int var4 = 0;
		class53 var5 = new class53();

		int var7;
		for (int var6 = var2.nextSetBit(0); var6 != -1; var6 = var2.nextSetBit(var7)) {
			var7 = var2.nextClearBit(var6);

			for (int var8 = var6; var8 < var7; ++var8) {
				if (var2.get(var8)) {
					int var9 = this.field3636[var8];
					if (var9 != 0) {
						if (var9 != var4) {
							var4 = var9--;
							if ((var9 & 1) == 0) {
								var5 = new class53(var1.method827(var9 >> 2));
							} else {
								var5 = var1.method826(var9 >> 2);
							}

							if (var5.method1042()) {
								var3 = false;
							} else {
								this.field3635.add(this.field3635.size(), var5);
							}
						}

						if (!var5.method1042()) {
							this.rawSounds[var8] = var5;
							this.field3636[var8] = 0;
						}
					}
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "996545674"
	)
	void method6433() {
		this.field3636 = null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1507645483"
	)
	static void method6438(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) {
				int var5 = 0;
				if (var1 > var4.maxX * 128) {
					var5 += var1 - var4.maxX * 128;
				} else if (var1 < var4.x * 16384) {
					var5 += var4.x * 16384 - var1;
				}

				if (var2 > var4.maxY * 16384) {
					var5 += var2 - var4.maxY * 16384;
				} else if (var2 < var4.y * 16384) {
					var5 += var4.y * 16384 - var2;
				}

				var5 = Math.max(var5 - 64, 0);
				if (var5 < var4.field836 && TileItem.clientPreferences.getAreaSoundEffectsVolume() != 0 && var0 == var4.plane) {
					float var6 = var4.field834 < var4.field836 ? Math.min(Math.max((float)(var4.field836 - var5) / (float)(var4.field836 - var4.field834), 0.0F), 1.0F) : 1.0F;
					int var7 = (int)(var6 * (float)TileItem.clientPreferences.getAreaSoundEffectsVolume());
					if (var4.stream1 == null) {
						if (var4.soundEffectId >= 0) {
							SoundEffect var8 = SoundEffect.readSoundEffect(Projectile.soundEffectsArchive, var4.soundEffectId, 0);
							if (var8 != null) {
								RawSound var9 = var8.toRawSound().resample(class343.decimator);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var7);
								var10.setNumLoops(-1);
								ScriptFrame.pcmStreamMixer.addSubStream(var10);
								var4.stream1 = var10;
							}
						}
					} else {
						var4.stream1.method858(var7);
					}

					if (var4.stream2 == null) {
						if (var4.soundEffectIds != null && (var4.field839 -= var3) <= 0) {
							int var12 = (int)(Math.random() * (double)var4.soundEffectIds.length);
							SoundEffect var13 = SoundEffect.readSoundEffect(Projectile.soundEffectsArchive, var4.soundEffectIds[var12], 0);
							if (var13 != null) {
								RawSound var14 = var13.toRawSound().resample(class343.decimator);
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var14, 100, var7);
								var11.setNumLoops(0);
								ScriptFrame.pcmStreamMixer.addSubStream(var11);
								var4.stream2 = var11;
								var4.field839 = var4.field837 + (int)(Math.random() * (double)(var4.field841 - var4.field837));
							}
						}
					} else {
						var4.stream2.method858(var7);
						if (!var4.stream2.hasNext()) {
							var4.stream2 = null;
						}
					}
				} else {
					if (var4.stream1 != null) {
						ScriptFrame.pcmStreamMixer.removeSubStream(var4.stream1);
						var4.stream1 = null;
					}

					if (var4.stream2 != null) {
						ScriptFrame.pcmStreamMixer.removeSubStream(var4.stream2);
						var4.stream2 = null;
					}
				}
			}
		}

	}
}
