import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
@ObfuscatedName("jh")
@Implements("MusicPatch")
public class MusicPatch extends Node {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 2093471633)
	int field3249;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "[Lap;")
	@Export("rawSounds")
	RawSound[] rawSounds = new RawSound[128];

	@ObfuscatedName("f")
	short[] field3245 = new short[128];

	@ObfuscatedName("u")
	byte[] field3246 = new byte[128];

	@ObfuscatedName("c")
	byte[] field3244 = new byte[128];

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "[Ljb;")
	MusicPatchNode2[] field3252 = new MusicPatchNode2[128];

	@ObfuscatedName("z")
	byte[] field3247 = new byte[128];

	@ObfuscatedName("j")
	int[] field3248 = new int[128];

	MusicPatch(byte[] var1) {
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
		byte[] var36 = new byte[var9];
		int var12;
		int var14;
		if (var9 > 1) {
			var36[1] = 1;
			int var13 = 1;
			var12 = 2;
			for (var14 = 2; var14 < var9; ++var14) {
				int var41 = var2.readUnsignedByte();
				if (var41 == 0) {
					var13 = var12++;
				} else {
					if (var41 <= var13) {
						--var41;
					}
					var13 = var41;
				}
				var36[var14] = ((byte) (var13));
			}
		} else {
			var12 = var9;
		}
		MusicPatchNode2[] var37 = new MusicPatchNode2[var12];
		MusicPatchNode2 var15;
		for (var14 = 0; var14 < var37.length; ++var14) {
			var15 = var37[var14] = new MusicPatchNode2();
			int var40 = var2.readUnsignedByte();
			if (var40 > 0) {
				var15.field3181 = new byte[var40 * 2];
			}
			var40 = var2.readUnsignedByte();
			if (var40 > 0) {
				var15.field3191 = new byte[var40 * 2 + 2];
				var15.field3191[1] = 64;
			}
		}
		var14 = var2.readUnsignedByte();
		byte[] var42 = (var14 > 0) ? new byte[var14 * 2] : null;
		var14 = var2.readUnsignedByte();
		byte[] var16 = (var14 > 0) ? new byte[var14 * 2] : null;
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
			this.field3245[var20] = ((short) (var19));
		}
		var19 = 0;
		short[] var46;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			var46 = this.field3245;
			var46[var20] = ((short) (var46[var20] + (var19 << 8)));
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
			var46 = this.field3245;
			var46[var23] = ((short) (var46[var23] + ((var22 - 1 & 2) << 14)));
			this.field3248[var23] = var22;
			--var20;
		}
		var20 = 0;
		var21 = 0;
		var23 = 0;
		int var24;
		for (var24 = 0; var24 < 128; ++var24) {
			if (this.field3248[var24] != 0) {
				if (var20 == 0) {
					if (var21 < var4.length) {
						var20 = var4[var21++];
					} else {
						var20 = -1;
					}
					var23 = var2.array[var5++] - 1;
				}
				this.field3247[var24] = ((byte) (var23));
				--var20;
			}
		}
		var20 = 0;
		var21 = 0;
		var24 = 0;
		for (int var25 = 0; var25 < 128; ++var25) {
			if (this.field3248[var25] != 0) {
				if (var20 == 0) {
					if (var21 < var7.length) {
						var20 = var7[var21++];
					} else {
						var20 = -1;
					}
					var24 = var2.array[var8++] + 16 << 2;
				}
				this.field3244[var25] = ((byte) (var24));
				--var20;
			}
		}
		var20 = 0;
		var21 = 0;
		MusicPatchNode2 var38 = null;
		int var26;
		for (var26 = 0; var26 < 128; ++var26) {
			if (this.field3248[var26] != 0) {
				if (var20 == 0) {
					var38 = var37[var36[var21]];
					if (var21 < var10.length) {
						var20 = var10[var21++];
					} else {
						var20 = -1;
					}
				}
				this.field3252[var26] = var38;
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
				if (this.field3248[var27] > 0) {
					var26 = var2.readUnsignedByte() + 1;
				}
			}
			this.field3246[var27] = ((byte) (var26));
			--var20;
		}
		this.field3249 = var2.readUnsignedByte() + 1;
		int var29;
		MusicPatchNode2 var39;
		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3181 != null) {
				for (var29 = 1; var29 < var39.field3181.length; var29 += 2) {
					var39.field3181[var29] = var2.readByte();
				}
			}
			if (var39.field3191 != null) {
				for (var29 = 3; var29 < var39.field3191.length - 2; var29 += 2) {
					var39.field3191[var29] = var2.readByte();
				}
			}
		}
		if (var42 != null) {
			for (var27 = 1; var27 < var42.length; var27 += 2) {
				var42[var27] = var2.readByte();
			}
		}
		if (var16 != null) {
			for (var27 = 1; var27 < var16.length; var27 += 2) {
				var16[var27] = var2.readByte();
			}
		}
		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3191 != null) {
				var19 = 0;
				for (var29 = 2; var29 < var39.field3191.length; var29 += 2) {
					var19 = 1 + var19 + var2.readUnsignedByte();
					var39.field3191[var29] = ((byte) (var19));
				}
			}
		}
		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3181 != null) {
				var19 = 0;
				for (var29 = 2; var29 < var39.field3181.length; var29 += 2) {
					var19 = 1 + var19 + var2.readUnsignedByte();
					var39.field3181[var29] = ((byte) (var19));
				}
			}
		}
		int var28;
		int var30;
		int var31;
		int var32;
		int var33;
		int var34;
		byte var44;
		if (var42 != null) {
			var19 = var2.readUnsignedByte();
			var42[0] = ((byte) (var19));
			for (var27 = 2; var27 < var42.length; var27 += 2) {
				var19 = var19 + 1 + var2.readUnsignedByte();
				var42[var27] = ((byte) (var19));
			}
			var44 = var42[0];
			var28 = var42[1];
			for (var29 = 0; var29 < var44; ++var29) {
				this.field3246[var29] = ((byte) (var28 * this.field3246[var29] + 32 >> 6));
			}
			for (var29 = 2; var29 < var42.length; var29 += 2) {
				var30 = var42[var29];
				var31 = var42[var29 + 1];
				var32 = var28 * (var30 - var44) + (var30 - var44) / 2;
				for (var33 = var44; var33 < var30; ++var33) {
					var34 = class143.method3070(var32, var30 - var44);
					this.field3246[var33] = ((byte) (var34 * this.field3246[var33] + 32 >> 6));
					var32 += var31 - var28;
				}
				var44 = ((byte) (var30));
				var28 = var31;
			}
			for (var30 = var44; var30 < 128; ++var30) {
				this.field3246[var30] = ((byte) (var28 * this.field3246[var30] + 32 >> 6));
			}
			var15 = null;
		}
		if (var16 != null) {
			var19 = var2.readUnsignedByte();
			var16[0] = ((byte) (var19));
			for (var27 = 2; var27 < var16.length; var27 += 2) {
				var19 = 1 + var19 + var2.readUnsignedByte();
				var16[var27] = ((byte) (var19));
			}
			var44 = var16[0];
			var28 = var16[1] << 1;
			for (var29 = 0; var29 < var44; ++var29) {
				var30 = var28 + (this.field3244[var29] & 255);
				if (var30 < 0) {
					var30 = 0;
				}
				if (var30 > 128) {
					var30 = 128;
				}
				this.field3244[var29] = ((byte) (var30));
			}
			for (var29 = 2; var29 < var16.length; var29 += 2) {
				byte var45 = var16[var29];
				var31 = var16[var29 + 1] << 1;
				var32 = var28 * (var45 - var44) + (var45 - var44) / 2;
				for (var33 = var44; var33 < var45; ++var33) {
					var34 = class143.method3070(var32, var45 - var44);
					int var35 = var34 + (this.field3244[var33] & 255);
					if (var35 < 0) {
						var35 = 0;
					}
					if (var35 > 128) {
						var35 = 128;
					}
					this.field3244[var33] = ((byte) (var35));
					var32 += var31 - var28;
				}
				var44 = var45;
				var28 = var31;
			}
			for (var30 = var44; var30 < 128; ++var30) {
				var31 = var28 + (this.field3244[var30] & 255);
				if (var31 < 0) {
					var31 = 0;
				}
				if (var31 > 128) {
					var31 = 128;
				}
				this.field3244[var30] = ((byte) (var31));
			}
			Object var43 = null;
		}
		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field3180 = var2.readUnsignedByte();
		}
		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3181 != null) {
				var39.field3183 = var2.readUnsignedByte();
			}
			if (var39.field3191 != null) {
				var39.field3184 = var2.readUnsignedByte();
			}
			if (var39.field3180 > 0) {
				var39.field3185 = var2.readUnsignedByte();
			}
		}
		for (var27 = 0; var27 < var12; ++var27) {
			var37[var27].field3182 = var2.readUnsignedByte();
		}
		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3182 > 0) {
				var39.field3186 = var2.readUnsignedByte();
			}
		}
		for (var27 = 0; var27 < var12; ++var27) {
			var39 = var37[var27];
			if (var39.field3186 > 0) {
				var39.field3188 = var2.readUnsignedByte();
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lan;[B[IB)Z", garbageValue = "-1")
	boolean method5439(SoundCache var1, byte[] var2, int[] var3) {
		boolean var4 = true;
		int var5 = 0;
		RawSound var6 = null;
		for (int var7 = 0; var7 < 128; ++var7) {
			if (var2 == null || var2[var7] != 0) {
				int var8 = this.field3248[var7];
				if (var8 != 0) {
					if (var5 != var8) {
						var5 = var8--;
						if ((var8 & 1) == 0) {
							var6 = var1.getSoundEffect(var8 >> 2, var3);
						} else {
							var6 = var1.getMusicSample(var8 >> 2, var3);
						}
						if (var6 == null) {
							var4 = false;
						}
					}
					if (var6 != null) {
						this.rawSounds[var7] = var6;
						this.field3248[var7] = 0;
					}
				}
			}
		}
		return var4;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1836285440")
	@Export("clear")
	void clear() {
		this.field3248 = null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lff;III)Lat;", garbageValue = "-984491907")
	public static final PcmPlayer method5443(TaskHandler var0, int var1, int var2) {
		if (class301.field3595 == 0) {
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}
			try {
				PcmPlayer var3 = class82.pcmPlayerProvider.player();
				var3.samples = new int[(PcmPlayer.PcmPlayer_stereo ? 2 : 1) * 256];
				var3.field290 = var2;
				var3.init();
				var3.capacity = (var2 & -1024) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}
				var3.open(var3.capacity);
				if (class354.field4242 > 0 && PcmPlayer.soundSystem == null) {
					PcmPlayer.soundSystem = new SoundSystem();
					Messages.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					Messages.soundSystemExecutor.scheduleAtFixedRate(PcmPlayer.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}
				if (PcmPlayer.soundSystem != null) {
					if (PcmPlayer.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}
					PcmPlayer.soundSystem.players[var1] = var3;
				}
				return var3;
			} catch (Throwable var4) {
				return new PcmPlayer();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(descriptor = "(IZZZZI)Llu;", garbageValue = "-993060568")
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class346.JagexCache_idxFiles[var0], 1000000);
		}
		return new Archive(var5, EnumComposition.masterDisk, var0, var1, var2, var3, var4);
	}
}