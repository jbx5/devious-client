import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
public class class146 extends class128 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-1735785845)

	int field1653;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-463030185)

	int field1652;

	@ObfuscatedSignature(descriptor = 
	"Lee;")

	final class131 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Lee;)V")

	class146(class131 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;B)V", garbageValue = 
	"-73")

	void vmethod3107(Buffer var1) {
		this.field1653 = var1.readInt();
		this.field1652 = var1.readInt();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Leh;I)V", garbageValue = 
	"-1228032820")

	void vmethod3104(ClanSettings var1) {
		var1.method2927(this.field1653, this.field1652);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(IILge;Lgf;B)Z", garbageValue = 
	"46")

	static final boolean method3041(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0;
		int var5 = var1;
		byte var6 = 64;
		byte var7 = 64;
		int var8 = var0 - var6;
		int var9 = var1 - var7;
		class194.directions[var6][var7] = 99;
		class194.distances[var6][var7] = 0;
		byte var10 = 0;
		int var11 = 0;
		class194.bufferX[var10] = var0;
		byte var10001 = var10;
		int var18 = var10 + 1;
		class194.bufferY[var10001] = var1;
		int[][] var12 = var3.flags;

		while (var11 != var18) {
			var4 = class194.bufferX[var11];
			var5 = class194.bufferY[var11];
			var11 = (var11 + 1) & 4095;
			int var16 = var4 - var8;
			int var17 = var5 - var9;
			int var13 = var4 - var3.xInset;
			int var14 = var5 - var3.yInset;
			if (var2.hasArrived(2, var4, var5, var3)) {
				VarpDefinition.field1819 = var4;
				class194.field2202 = var5;
				return true;
			}

			int var15 = class194.distances[var16][var17] + 1;
			if ((((var16 > 0) && (class194.directions[var16 - 1][var17] == 0)) && ((var12[var13 - 1][var14] & 19136782) == 0)) && ((var12[var13 - 1][var14 + 1] & 19136824) == 0)) {
				class194.bufferX[var18] = var4 - 1;
				class194.bufferY[var18] = var5;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16 - 1][var17] = 2;
				class194.distances[var16 - 1][var17] = var15;
			}

			if ((((var16 < 126) && (class194.directions[var16 + 1][var17] == 0)) && ((var12[var13 + 2][var14] & 19136899) == 0)) && ((var12[var13 + 2][var14 + 1] & 19136992) == 0)) {
				class194.bufferX[var18] = var4 + 1;
				class194.bufferY[var18] = var5;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16 + 1][var17] = 8;
				class194.distances[var16 + 1][var17] = var15;
			}

			if ((((var17 > 0) && (class194.directions[var16][var17 - 1] == 0)) && ((var12[var13][var14 - 1] & 19136782) == 0)) && ((var12[var13 + 1][var14 - 1] & 19136899) == 0)) {
				class194.bufferX[var18] = var4;
				class194.bufferY[var18] = var5 - 1;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16][var17 - 1] = 1;
				class194.distances[var16][var17 - 1] = var15;
			}

			if ((((var17 < 126) && (class194.directions[var16][var17 + 1] == 0)) && ((var12[var13][var14 + 2] & 19136824) == 0)) && ((var12[var13 + 1][var14 + 2] & 19136992) == 0)) {
				class194.bufferX[var18] = var4;
				class194.bufferY[var18] = var5 + 1;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16][var17 + 1] = 4;
				class194.distances[var16][var17 + 1] = var15;
			}

			if ((((((var16 > 0) && (var17 > 0)) && (class194.directions[var16 - 1][var17 - 1] == 0)) && ((var12[var13 - 1][var14] & 19136830) == 0)) && ((var12[var13 - 1][var14 - 1] & 19136782) == 0)) && ((var12[var13][var14 - 1] & 19136911) == 0)) {
				class194.bufferX[var18] = var4 - 1;
				class194.bufferY[var18] = var5 - 1;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16 - 1][var17 - 1] = 3;
				class194.distances[var16 - 1][var17 - 1] = var15;
			}

			if ((((((var16 < 126) && (var17 > 0)) && (class194.directions[var16 + 1][var17 - 1] == 0)) && ((var12[var13 + 1][var14 - 1] & 19136911) == 0)) && ((var12[var13 + 2][var14 - 1] & 19136899) == 0)) && ((var12[var13 + 2][var14] & 19136995) == 0)) {
				class194.bufferX[var18] = var4 + 1;
				class194.bufferY[var18] = var5 - 1;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16 + 1][var17 - 1] = 9;
				class194.distances[var16 + 1][var17 - 1] = var15;
			}

			if ((((((var16 > 0) && (var17 < 126)) && (class194.directions[var16 - 1][var17 + 1] == 0)) && ((var12[var13 - 1][var14 + 1] & 19136830) == 0)) && ((var12[var13 - 1][var14 + 2] & 19136824) == 0)) && ((var12[var13][var14 + 2] & 19137016) == 0)) {
				class194.bufferX[var18] = var4 - 1;
				class194.bufferY[var18] = var5 + 1;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16 - 1][var17 + 1] = 6;
				class194.distances[var16 - 1][var17 + 1] = var15;
			}

			if ((((((var16 < 126) && (var17 < 126)) && (class194.directions[var16 + 1][var17 + 1] == 0)) && ((var12[var13 + 1][var14 + 2] & 19137016) == 0)) && ((var12[var13 + 2][var14 + 2] & 19136992) == 0)) && ((var12[var13 + 2][var14 + 1] & 19136995) == 0)) {
				class194.bufferX[var18] = var4 + 1;
				class194.bufferY[var18] = var5 + 1;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16 + 1][var17 + 1] = 12;
				class194.distances[var16 + 1][var17 + 1] = var15;
			}
		} 

		VarpDefinition.field1819 = var4;
		class194.field2202 = var5;
		return false;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1112634096")

	public static void method3040() {
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = 
	"(ILkn;IIIII[FB)Lkn;", garbageValue = 
	"125")

	static Widget method3043(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget();
		var8.type = var0;
		var8.parentId = var1.id;
		var8.childIndex = var2;
		var8.isIf3 = true;
		var8.xAlignment = var3;
		var8.yAlignment = var4;
		var8.widthAlignment = var5;
		var8.heightAlignment = var6;
		var8.rawX = ((int) (((float) (var1.width)) * var7[0]));
		var8.rawY = ((int) (var7[1] * ((float) (var1.height))));
		var8.rawWidth = ((int) (var7[2] * ((float) (var1.width))));
		var8.rawHeight = ((int) (((float) (var1.height)) * var7[3]));
		return var8;
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(descriptor = 
	"(ZLpy;I)V", garbageValue = 
	"1921667201")

	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) {
			var2 = var1.readUnsignedShortAdd();
			var3 = var1.readUnsignedShortAdd();
			int var4 = var1.readUnsignedShort();
			Message.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					Message.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			class123.regions = new int[var4];
			ObjectComposition.regionMapArchiveIds = new int[var4];
			Message.regionLandArchiveIds = new int[var4];
			WorldMapSectionType.regionLandArchives = new byte[var4][];
			Occluder.regionMapArchives = new byte[var4][];
			boolean var16 = false;
			if (Client.field753) {
				if ((((var2 / 8) == 48) || ((var2 / 8) == 49)) && ((var3 / 8) == 48)) {
					var16 = true;
				}

				if (((var2 / 8) == 48) && ((var3 / 8) == 148)) {
					var16 = true;
				}
			}

			var4 = 0;

			for (var6 = (var2 - 6) / 8; var6 <= ((var2 + 6) / 8); ++var6) {
				for (var7 = (var3 - 6) / 8; var7 <= ((var3 + 6) / 8); ++var7) {
					var8 = var7 + (var6 << 8);
					if ((!var16) || (((((var7 != 49) && (var7 != 149)) && (var7 != 147)) && (var6 != 50)) && ((var6 != 49) || (var7 != 47)))) {
						class123.regions[var4] = var8;
						ObjectComposition.regionMapArchiveIds[var4] = class302.archive5.getGroupId((("m" + var6) + "_") + var7);
						Message.regionLandArchiveIds[var4] = class302.archive5.getGroupId((("l" + var6) + "_") + var7);
						++var4;
					}
				}
			}

			class321.method6030(var2, var3, true);
		} else {
			var2 = var1.readUnsignedShortAddLE();
			var3 = var1.readUnsignedShortLE();
			boolean var15 = var1.readUnsignedByte() == 1;
			var5 = var1.readUnsignedShort();
			var1.importIndex();

			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			Message.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					Message.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			class123.regions = new int[var5];
			ObjectComposition.regionMapArchiveIds = new int[var5];
			Message.regionLandArchiveIds = new int[var5];
			WorldMapSectionType.regionLandArchives = new byte[var5][];
			Occluder.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != (-1)) {
							int var10 = (var9 >> 14) & 1023;
							int var11 = (var9 >> 3) & 2047;
							int var12 = ((var10 / 8) << 8) + (var11 / 8);

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (class123.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != (-1)) {
								class123.regions[var5] = var12;
								var13 = (var12 >> 8) & 255;
								int var14 = var12 & 255;
								ObjectComposition.regionMapArchiveIds[var5] = class302.archive5.getGroupId((("m" + var13) + "_") + var14);
								Message.regionLandArchiveIds[var5] = class302.archive5.getGroupId((("l" + var13) + "_") + var14);
								++var5;
							}
						}
					}
				}
			}

			class321.method6030(var3, var2, !var15);
		}

	}
}