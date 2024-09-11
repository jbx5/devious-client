import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	static GameBuild field3217;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = -1240771331
	)
	static int field3219;
	@ObfuscatedName("ae")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-107"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var1 + var2 * 64];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvf;Ljava/lang/String;I)I",
		garbageValue = "1937703142"
	)
	public static int method6191(Buffer var0, String var1) {
		int var2 = var0.offset;
		byte[] var3 = UserComparator5.method3197(var1);
		var0.writeSmartByteShort(var3.length);
		var0.offset += class365.huffman.compress(var3, 0, var3.length, var0.array, var0.offset);
		return var0.offset - var2;
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Lmx;I)V",
		garbageValue = "-1013851258"
	)
	static final void method6194(class324 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var30;
		if (class324.field3417 == var0) {
			var2 = var1.readUnsignedByteSub();
			var3 = (var2 >> 4 & 7) + class169.field1830;
			var4 = (var2 & 7) + WorldMapArea.field3102;
			var5 = var1.readInt();
			var6 = var1.readUnsignedShortAddLE();
			var7 = var1.readUnsignedIntIME();
			if (var3 >= 0 && var4 >= 0 && var3 < class162.worldView.sizeX && var4 < class162.worldView.sizeY) {
				var30 = Client.field596 == -1 ? class162.worldView.plane : Client.field596;
				WidgetDefinition.method6851(var30, var3, var4, var6, var7, var5);
			}

		} else {
			int var19;
			int var24;
			int var25;
			if (class324.field3410 == var0) {
				var2 = var1.readUnsignedShortAdd();
				var3 = var1.readUnsignedByteNeg();
				var4 = var1.readUnsignedByteNeg();
				var5 = var4 >> 2;
				var6 = var4 & 3;
				var7 = Client.field595[var5];
				var30 = var1.readUnsignedByteNeg();
				var19 = (var30 >> 4 & 7) + class169.field1830;
				var24 = (var30 & 7) + WorldMapArea.field3102;
				if (var19 >= 0 && var24 >= 0 && var19 < class162.worldView.sizeX && var24 < class162.worldView.sizeY) {
					var25 = Client.field596 == -1 ? class162.worldView.plane : Client.field596;
					class165.method3680(class162.worldView, var25, var19, var24, var7, var2, var5, var6, var3, 0, -1);
				}

			} else {
				int var27;
				if (class324.field3418 == var0) {
					var2 = var1.readUnsignedShortLE();
					var3 = var1.readUnsignedByteSub();
					var4 = (var3 >> 4 & 7) + class169.field1830;
					var5 = (var3 & 7) + WorldMapArea.field3102;
					var6 = var1.readUnsignedShortAddLE();
					var7 = var1.readUnsignedShortLE();
					boolean var31 = var1.readUnsignedByte() == 1;
					var19 = var1.readUnsignedByte();
					var24 = var1.readUnsignedByteSub();
					var25 = var1.readUnsignedIntLE();
					if (var4 >= 0 && var5 >= 0 && var4 < class162.worldView.sizeX && var5 < class162.worldView.sizeY) {
						var27 = Client.field596 == -1 ? class162.worldView.plane : Client.field596;
						class224.addTileItemToGroundItems(var27, var4, var5, var6, var25, var19, var7, var2, var24, var31);
					}

				} else if (class324.field3422 == var0) {
					var2 = var1.readUnsignedShort();
					var3 = var1.readUnsignedByteSub();
					var4 = (var3 >> 4 & 7) + class169.field1830;
					var5 = (var3 & 7) + WorldMapArea.field3102;
					var6 = var1.readUnsignedIntIME();
					var7 = class162.worldView.plane;
					if (0 <= var4 && var4 < 104 && 0 <= var5 && var5 < 104) {
						var30 = Client.field596 == -1 ? var7 : Client.field596;
						ArchiveLoader.method2478(var30, var4, var5, var2, var6);
					}

				} else {
					if (class324.field3413 == var0) {
						var2 = var1.readUnsignedByteAdd();
						var3 = (var2 >> 4 & 7) + class169.field1830;
						var4 = (var2 & 7) + WorldMapArea.field3102;
						var5 = var1.readUnsignedShortAdd();
						var6 = var1.readUnsignedByteNeg();
						var7 = class162.worldView.plane;
						if (var3 >= 0 && var4 >= 0 && var3 < class162.worldView.sizeX && var4 < class162.worldView.sizeY) {
							NodeDeque var8 = class162.worldView.groundItems[var7][var3][var4];
							if (var8 != null) {
								for (TileItem var23 = (TileItem)var8.last(); var23 != null; var23 = (TileItem)var8.previous()) {
									if ((var5 & 32767) == var23.id) {
										var23.setFlag(var6);
										break;
									}
								}
							}

							if (var3 >= 0 && var4 >= 0 && var3 < class162.worldView.sizeX && var4 < class162.worldView.sizeY) {
								var19 = Client.field596 == -1 ? class162.worldView.plane : Client.field596;
								ItemComposition.method4281(var19, var3, var4, var5, var6);
							}

							return;
						}
					}

					int var13;
					int var14;
					int var15;
					int var16;
					if (class324.field3414 == var0) {
						var2 = var1.readUnsignedShortLE();
						var3 = var1.readUnsignedShortLE();
						var4 = var1.readUnsignedByteAdd();
						var5 = (var4 >> 4 & 7) + class169.field1830;
						var6 = (var4 & 7) + WorldMapArea.field3102;
						var7 = var1.readUnsignedShortAdd();
						byte var20 = var1.readByteNeg();
						var19 = var1.readUnsignedShort();
						byte var10 = var1.readByteAdd();
						byte var11 = var1.readByte();
						byte var12 = var1.readByteNeg();
						var13 = var1.readUnsignedByteSub();
						var14 = var13 >> 2;
						var15 = var13 & 3;
						var16 = Client.field595[var14];
						Player var17;
						if (var7 == Client.localPlayerIndex) {
							var17 = AddRequestTask.localPlayer;
						} else {
							var17 = class162.worldView.players[var7];
						}

						if (var17 != null) {
							int var18 = Client.field596 == -1 ? class162.worldView.plane : Client.field596;
							UserComparator8.method3185(var18, var5, var6, var14, var15, var16, var19, var2, var3, var20, var11, var10, var12, var17);
						}
					}

					if (class324.field3416 == var0) {
						var2 = var1.readUnsignedShort();
						var3 = var1.readUnsignedByteNeg() * 4;
						var4 = var1.method10045();
						var5 = var1.readUnsignedShortAdd();
						var6 = var1.readUnsignedShort();
						var7 = var1.readUnsignedByte();
						var30 = (var7 >> 4 & 7) + class169.field1830;
						var19 = (var7 & 7) + WorldMapArea.field3102;
						var24 = var1.method9979();
						var25 = var1.readUnsignedByteAdd();
						var27 = var1.readUnsignedByte() * 4;
						byte var28 = var1.readByteSub();
						var14 = var1.readUnsignedShortAdd();
						byte var29 = var1.readByte();
						var13 = var28 + var30;
						var15 = var29 + var19;
						if (var30 >= 0 && var19 >= 0 && var30 < class162.worldView.sizeX && var19 < class162.worldView.sizeY && var13 >= 0 && var15 >= 0 && var13 < class162.worldView.sizeX && var15 < class162.worldView.sizeY && var2 != 65535) {
							var16 = Client.field596 == -1 ? class162.worldView.plane : Client.field596;
							class166.method3692(var16, var30, var19, var13, var15, var4, var2, var27, var3, var14, var6, var25, var5, var24);
						}

					} else if (class324.field3415 == var0) {
						var2 = var1.readUnsignedByte();
						var3 = (var2 >> 4 & 7) + class169.field1830;
						var4 = (var2 & 7) + WorldMapArea.field3102;
						var5 = var1.readUnsignedByte();
						var6 = var5 >> 2;
						var7 = var5 & 3;
						var30 = Client.field595[var6];
						if (var3 >= 0 && var4 >= 0 && var3 < class162.worldView.sizeX && var4 < class162.worldView.sizeY) {
							var19 = Client.field596 == -1 ? class162.worldView.plane : Client.field596;
							class165.method3680(class162.worldView, var19, var3, var4, var30, -1, var6, var7, 31, 0, -1);
						}

					} else if (class324.field3411 == var0) {
						var2 = var1.readUnsignedByte() & 31;
						var3 = var1.readUnsignedShortAdd();
						var4 = var1.readUnsignedByteSub();
						var5 = var1.readUnsignedByteSub();
						var6 = var1.readUnsignedByte();
						var7 = var1.readUnsignedByteAdd();
						var30 = (var7 >> 4 & 7) + class169.field1830;
						var19 = (var7 & 7) + WorldMapArea.field3102;
						if (var30 >= 0 && var19 >= 0 && var30 < class162.worldView.sizeX && var19 < class162.worldView.sizeY) {
							var24 = var2 + 1;
							if (AddRequestTask.localPlayer.pathX[0] >= var30 - var24 && AddRequestTask.localPlayer.pathX[0] <= var30 + var24 && AddRequestTask.localPlayer.pathY[0] >= var19 - var24 && AddRequestTask.localPlayer.pathY[0] <= var19 + var24 && class461.clientPreferences.getAreaSoundEffectsVolume() != 0 && var5 > 0 && Client.soundEffectCount < 50) {
								Client.soundEffectIds[Client.soundEffectCount] = var3;
								Client.soundEffects[Client.soundEffectCount] = null;
								Client.soundLocations[Client.soundEffectCount] = var2 + (var19 << 8) + (var30 << 16);
								Client.queuedSoundEffectLoops[Client.soundEffectCount] = var5;
								Client.queuedSoundEffectDelays[Client.soundEffectCount] = var6;
								Client.field627[Client.soundEffectCount] = var4;
								++Client.soundEffectCount;
							}
						}

					} else if (class324.field3412 == var0) {
						var2 = var1.readUnsignedByteSub();
						var3 = (var2 >> 4 & 7) + class169.field1830;
						var4 = (var2 & 7) + WorldMapArea.field3102;
						var5 = var1.readUnsignedShortAdd();
						var6 = var1.readUnsignedByteSub();
						var7 = var1.readUnsignedShortAdd();
						if (var3 >= 0 && var4 >= 0 && var3 < class162.worldView.sizeX && var4 < class162.worldView.sizeY) {
							var3 = Coord.method6797(var3);
							var4 = Coord.method6797(var4);
							var30 = Client.field596 == -1 ? class162.worldView.plane : Client.field596;
							GraphicsObject var9 = new GraphicsObject(var5, var30, var3, var4, VarcInt.getTileHeight(class162.worldView, var3, var4, var30) - var6, var7, Client.cycle);
							class162.worldView.graphicsObjects.addFirst(var9);
						}

					} else if (class324.field3419 == var0) {
						var2 = var1.readUnsignedByteSub();
						var3 = var2 >> 2;
						var4 = var2 & 3;
						var5 = Client.field595[var3];
						var6 = var1.readUnsignedByte();
						var7 = (var6 >> 4 & 7) + class169.field1830;
						var30 = (var6 & 7) + WorldMapArea.field3102;
						var19 = var1.readUnsignedShortLE();
						if (0 <= var7 && var7 < 103 && 0 <= var30 && var30 < 103) {
							var24 = Client.field596 == -1 ? class162.worldView.plane : Client.field596;
							PendingSpawn var21 = StructComposition.method4123(class162.worldView, var24, var7, var30, var5);
							if (var21 != null) {
								ObjectComposition var22 = class273.getObjectDefinition(var21.field1215);
								if (var22.field2221) {
									var21.field1221 = var19;
									return;
								}
							}

							boolean var26 = GraphicsObject.method2285(var24, var7, var30, var3, var4, var5, var19);
							if (var26) {
								return;
							}

							if (var21 != null) {
								var21.field1221 = var19;
							}
						}

					}
				}
			}
		}
	}
}
