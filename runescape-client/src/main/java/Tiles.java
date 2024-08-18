import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1476113117
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("ay")
	@Export("Tiles_underlays")
	static short[][][] Tiles_underlays;
	@ObfuscatedName("an")
	@Export("Tiles_overlays")
	static short[][][] Tiles_overlays;
	@ObfuscatedName("am")
	static int[][] field1032;
	@ObfuscatedName("ac")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("ad")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("aa")
	static final int[] field1015;
	@ObfuscatedName("ah")
	static final int[] field1023;
	@ObfuscatedName("ag")
	static final int[] field1017;
	@ObfuscatedName("av")
	static final int[] field1025;
	@ObfuscatedName("ar")
	static final int[] field1026;
	@ObfuscatedName("ap")
	static final int[] field1022;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1144356223
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2139316347
	)
	@Export("rndLightness")
	static int rndLightness;

	static {
		Tiles_minPlane = 99;
		field1015 = new int[]{1, 2, 4, 8};
		field1023 = new int[]{16, 32, 64, 128};
		field1017 = new int[]{1, 0, -1, 0};
		field1025 = new int[]{0, -1, 0, 1};
		field1026 = new int[]{1, -1, -1, 1};
		field1022 = new int[]{-1, -1, 1, 1};
		rndHue = (int)(Math.random() * 17.0D) - 8;
		rndLightness = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-939045777"
	)
	public static String method2323(CharSequence var0) {
		String var1 = class265.base37DecodeLong(Calendar.method7131(var0));
		if (var1 == null) {
			var1 = "";
		}

		return var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ldy;[BIIIIIII)V"
	)
	static final void method2347(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Buffer var9 = new Buffer(var1);
		int var10 = -1;

		while (true) {
			int var11 = var9.readIncrSmallSmart();
			if (var11 == 0) {
				return;
			}

			var10 += var11;
			int var12 = 0;

			while (true) {
				int var13 = var9.readUShortSmart();
				if (var13 == 0) {
					break;
				}

				var12 += var13 - 1;
				int var14 = var12 & 63;
				int var15 = var12 >> 6 & 63;
				int var16 = var12 >> 12;
				int var17 = var9.readUnsignedByte();
				int var18 = var17 >> 2;
				int var19 = var17 & 3;
				if (var5 == var16 && var15 >= var6 && var15 < var6 + 8 && var14 >= var7 && var14 < var7 + 8) {
					ObjectComposition var20 = class222.getObjectDefinition(var10);
					int var23 = var15 & 7;
					int var24 = var14 & 7;
					int var26 = var20.sizeX;
					int var27 = var20.sizeY;
					int var28;
					if ((var19 & 1) == 1) {
						var28 = var26;
						var26 = var27;
						var27 = var28;
					}

					int var25 = var8 & 3;
					int var22;
					if (var25 == 0) {
						var22 = var23;
					} else if (var25 == 1) {
						var22 = var24;
					} else if (var25 == 2) {
						var22 = 7 - var23 - (var26 - 1);
					} else {
						var22 = 7 - var24 - (var27 - 1);
					}

					var28 = var3 + var22;
					int var31 = var15 & 7;
					int var32 = var14 & 7;
					int var34 = var20.sizeX;
					int var35 = var20.sizeY;
					int var36;
					if ((var19 & 1) == 1) {
						var36 = var34;
						var34 = var35;
						var35 = var36;
					}

					int var33 = var8 & 3;
					int var30;
					if (var33 == 0) {
						var30 = var32;
					} else if (var33 == 1) {
						var30 = 7 - var31 - (var34 - 1);
					} else if (var33 == 2) {
						var30 = 7 - var32 - (var35 - 1);
					} else {
						var30 = var31;
					}

					var36 = var30 + var4;
					if (var28 > 0 && var36 > 0 && var28 < var0.sizeX - 1 && var36 < var0.sizeY - 1) {
						int var37 = var2;
						if ((var0.tileSettings[1][var28][var36] & 2) == 2) {
							var37 = var2 - 1;
						}

						CollisionMap var38 = null;
						if (var37 >= 0 && var0.collisionMaps != null) {
							var38 = var0.collisionMaps[var37];
						}

						Tile.addObjects(var0, var2, var28, var36, var10, var19 + var8 & 3, var18, var38);
					}
				}
			}
		}
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Ldy;Lvs;I)V",
		garbageValue = "-1252510895"
	)
	@Export("updateWorldEntitiesFromPacketBuffer")
	static void updateWorldEntitiesFromPacketBuffer(WorldView var0, PacketBuffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 < var0.worldEntityCount) {
			throw new RuntimeException("dang");
		} else if (var2 > var0.worldEntityCount) {
			throw new RuntimeException("dang!");
		} else {
			var0.worldEntityCount = 0;

			int var3;
			int var4;
			label62:
			for (var3 = 0; var3 < var2; ++var3) {
				var4 = var0.worldEntityIndices[var3];
				WorldEntity var14 = var0.worldEntities[var4];
				boolean var6 = var1.readUnsignedByte() == 1;
				if (!var6) {
					var0.worldEntities[var4] = null;
				} else {
					var0.worldEntityIndices[++var0.worldEntityCount - 1] = var4;
					byte var7 = var1.readByte();
					byte var15 = var1.readByte();
					var14.rotationAngle = var1.readUnsignedShort();
					byte var10 = (byte)var1.readUnsignedByte();
					MoveSpeed[] var11 = MoveSpeed.field2992;

					for (int var12 = 0; var12 < var11.length; ++var12) {
						MoveSpeed var13 = var11[var12];
						if (var10 == var13.id) {
							class270 var17 = class255.method5031(var14.rotationAngle, var14.currentRotationAngle);
							int var18 = Math.min(var17.method5427(), 128);
							var14.movementSpeed = var18 / Client.field727;
							var14.remainingMovementSteps = var18 % Client.field727;
							if (var7 != 0 || var15 != 0) {
								var14.move(var7 + var14.directionsX[0], var15 + var14.directionsY[0], var13);
							}
							continue label62;
						}
					}

					throw new RuntimeException("Could not find MoveSpeed with ID " + var10);
				}
			}

			while (var1.method9577(Client.packetWriter.serverPacketLength) >= 10) {
				var3 = var1.readUnsignedShort();
				var0.worldEntityIndices[++var0.worldEntityCount - 1] = var3;
				var4 = var1.readUnsignedByte();
				int var5 = var1.readUnsignedByte();
				int var19 = var4 * 8;
				int var20 = var5 * 8;
				WorldEntity var8 = new WorldEntity(var3, var19, var20, TileItem.clientPreferences.getDrawDistance(), class173.field1823);
				var0.worldEntities[var3] = var8;
				int var9 = var1.readUnsignedByte();
				int var21 = var1.readUnsignedByte();
				var8.setPosition(var9, var21);
				var8.currentRotationAngle = var1.readUnsignedShort();
				var1.readUnsignedShort();
			}

		}
	}
}
