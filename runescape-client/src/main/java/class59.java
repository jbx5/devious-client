import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
public class class59 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	VorbisFloor field431;
	@ObfuscatedName("al")
	boolean field429;
	@ObfuscatedName("aj")
	int[] field428;
	@ObfuscatedName("az")
	int[] field430;
	@ObfuscatedName("af")
	boolean[] field427;

	@ObfuscatedSignature(
		descriptor = "(Lbx;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field431 = var1;
		this.field429 = var2;
		this.field428 = var3;
		this.field430 = var4;
		this.field427 = var5;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([FIB)V",
		garbageValue = "-22"
	)
	void method1138(float[] var1, int var2) {
		int var3 = this.field431.field270.length;
		VorbisFloor var10000 = this.field431;
		int var4 = VorbisFloor.field275[this.field431.multiplier - 1];
		boolean[] var5 = this.field427;
		this.field427[1] = true;
		var5[0] = true;

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) {
			var7 = this.field431.method769(this.field428, var6);
			var8 = this.field431.method763(this.field428, var6);
			var9 = this.field431.method761(this.field428[var7], this.field430[var7], this.field428[var8], this.field430[var8], this.field428[var6]);
			var10 = this.field430[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (var10 != 0) {
				boolean[] var14 = this.field427;
				this.field427[var8] = true;
				var14[var7] = true;
				this.field427[var6] = true;
				if (var10 >= var13) {
					this.field430[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
				} else {
					this.field430[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9;
				}
			} else {
				this.field427[var6] = false;
				this.field430[var6] = var9;
			}
		}

		this.VarbisFloor_sort(0, var3 - 1);
		var6 = 0;
		var7 = this.field431.multiplier * this.field430[0];

		for (var8 = 1; var8 < var3; ++var8) {
			if (this.field427[var8]) {
				var9 = this.field428[var8];
				var10 = this.field431.multiplier * this.field430[var8];
				this.field431.method762(var6, var7, var9, var10, var1, var2);
				if (var9 >= var2) {
					return;
				}

				var6 = var9;
				var7 = var10;
			}
		}

		var10000 = this.field431;
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) {
			var1[var9] *= var16;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "101"
	)
	boolean method1139() {
		return this.field429;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-109070827"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.field428[var1];
			int var5 = this.field430[var1];
			boolean var6 = this.field427[var1];

			for (int var7 = var1 + 1; var7 <= var2; ++var7) {
				int var8 = this.field428[var7];
				if (var8 < var4) {
					this.field428[var3] = var8;
					this.field430[var3] = this.field430[var7];
					this.field427[var3] = this.field427[var7];
					++var3;
					this.field428[var7] = this.field428[var3];
					this.field430[var7] = this.field430[var3];
					this.field427[var7] = this.field427[var3];
				}
			}

			this.field428[var3] = var4;
			this.field430[var3] = var5;
			this.field427[var3] = var6;
			this.VarbisFloor_sort(var1, var3 - 1);
			this.VarbisFloor_sort(var3 + 1, var2);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "1209703094"
	)
	@Export("randomDatData2")
	public static byte[] randomDatData2() {
		byte[] var0 = new byte[24];

		try {
			JagexCache.JagexCache_randomDat.seek(0L);
			JagexCache.JagexCache_randomDat.readFully(var0);

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
			}

			if (var1 >= 24) {
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) {
				var0[var2] = -1;
			}
		}

		return var0;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1156072082"
	)
	static int method1145(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F));
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "-944551946"
	)
	static boolean method1147(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		Scene var7 = ModeWhere.worldView.scene;
		int var9;
		if (var5 == class379.field4408.field4411) {
			BoundaryObject var8 = var7.getBoundaryObject(var0, var1, var2);
			if (var8 != null) {
				var9 = class105.Entity_unpackID(var8.tag);
				if (var3 == WorldMapDecorationType.field3995.id) {
					var8.renderable1 = new DynamicObject(ModeWhere.worldView, var9, 2, var4 + 4, var0, var1, var2, var6, false, var8.renderable1);
					var8.renderable2 = new DynamicObject(ModeWhere.worldView, var9, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var8.renderable2);
				} else {
					var8.renderable1 = new DynamicObject(ModeWhere.worldView, var9, var3, var4, var0, var1, var2, var6, false, var8.renderable1);
				}

				return true;
			}
		} else if (var5 == class379.field4407.field4411) {
			WallDecoration var10 = var7.getWallDecoration(var0, var1, var2);
			if (var10 != null) {
				var9 = class105.Entity_unpackID(var10.tag);
				if (var3 != WorldMapDecorationType.field4004.id && var3 != WorldMapDecorationType.field4002.id) {
					if (var3 == WorldMapDecorationType.field4000.id) {
						var10.renderable1 = new DynamicObject(ModeWhere.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field3998.id) {
						var10.renderable1 = new DynamicObject(ModeWhere.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field3996.id) {
						var10.renderable1 = new DynamicObject(ModeWhere.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
						var10.renderable2 = new DynamicObject(ModeWhere.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable2);
					}
				} else {
					var10.renderable1 = new DynamicObject(ModeWhere.worldView, var9, 4, var4, var0, var1, var2, var6, false, var10.renderable1);
				}

				return true;
			}
		} else if (var5 == class379.field4409.field4411) {
			GameObject var11 = var7.getGameObject(var0, var1, var2);
			if (var3 == WorldMapDecorationType.field4014.id) {
				var3 = WorldMapDecorationType.field4013.id;
			}

			if (var11 != null) {
				var11.renderable = new DynamicObject(ModeWhere.worldView, class105.Entity_unpackID(var11.tag), var3, var4, var0, var1, var2, var6, false, var11.renderable);
				return true;
			}
		} else if (var5 == class379.field4410.field4411) {
			FloorDecoration var12 = var7.getFloorDecoration(var0, var1, var2);
			if (var12 != null) {
				var12.renderable = new DynamicObject(ModeWhere.worldView, class105.Entity_unpackID(var12.tag), 22, var4, var0, var1, var2, var6, false, var12.renderable);
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Ldt;Luk;B)V",
		garbageValue = "-113"
	)
	static void method1148(WorldView var0, PacketBuffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 < var0.worldEntityCount) {
			throw new RuntimeException("dang");
		} else if (var2 > var0.worldEntityCount) {
			throw new RuntimeException("dang!");
		} else {
			var0.worldEntityCount = 0;

			int var3;
			int var4;
			for (var3 = 0; var3 < var2; ++var3) {
				var4 = var0.worldEntityIndices[var3];
				WorldEntity var15 = var0.worldEntities[var4];
				boolean var6 = var1.readUnsignedByte() == 1;
				if (!var6) {
					var0.worldEntities[var4] = null;
				} else {
					var0.worldEntityIndices[++var0.worldEntityCount - 1] = var4;
					byte var7 = var1.readByte();
					byte var16 = var1.readByte();
					var15.field4940 = var1.readUnsignedShort();
					class237 var17 = WorldMapSection2.method5520((byte)var1.readUnsignedByte());
					int var11 = var15.field4940;
					int var12 = var15.field4939;
					int var13 = var11 - var12 & 2047;
					class238 var14 = class238.field2537;
					if (var13 > 1024) {
						var13 = 2048 - var13;
						var14 = class238.field2538;
					}

					class233 var18 = new class233(var14, var13);
					int var20 = Math.min(var18.method4493(), 128);
					var15.field4941 = var20 / Client.field756;
					var15.field4944 = var20 % Client.field756;
					if (var7 != 0 || var16 != 0) {
						var15.method8762(var7 + var15.field4942[0], var16 + var15.field4950[0], var17);
					}
				}
			}

			while (var1.method9604(Client.packetWriter.serverPacketLength) >= 10) {
				var3 = var1.readUnsignedShort();
				var0.worldEntityIndices[++var0.worldEntityCount - 1] = var3;
				var4 = var1.readUnsignedByte();
				int var5 = var1.readUnsignedByte();
				int var21 = var4 * 8;
				int var22 = var5 * 8;
				WorldEntity var8 = new WorldEntity(var3, var21, var22, class459.clientPreferences.getDrawDistance());
				var0.worldEntities[var3] = var8;
				int var9 = var1.readUnsignedByte();
				int var10 = var1.readUnsignedByte();
				var8.method8763(var9, var10);
				var8.field4939 = var1.readUnsignedShort();
				var1.readUnsignedShort();
			}

		}
	}
}
