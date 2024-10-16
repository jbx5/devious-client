import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = -922634183
	)
	static int field1515;
	@ObfuscatedName("ap")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsv;Lsv;B)I",
		garbageValue = "0"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Lmj;I)V",
		garbageValue = "-1800875332"
	)
	static final void method3315(class323 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var4;
		int var6;
		int var8;
		int var23;
		int var24;
		int var25;
		int var27;
		if (class323.field3415 == var0) {
			var23 = var1.readUnsignedIntME();
			var24 = var1.readUnsignedShortAdd();
			var4 = var1.readUnsignedByte();
			var25 = (var4 >> 4 & 7) + ItemLayer.field2480;
			var6 = (var4 & 7) + class134.field1572;
			var27 = var1.readInt();
			if (var25 >= 0 && var6 >= 0 && var25 < class344.worldView.sizeX && var6 < class344.worldView.sizeY) {
				var8 = Client.field734 == -1 ? class344.worldView.plane : Client.field734;
				class92.method2581(var8, var25, var6, var24, var23, var27);
			}

		} else {
			int var9;
			int var10;
			if (class323.field3420 == var0) {
				var23 = var1.readUnsignedShortLE();
				var24 = var1.readUnsignedByteAdd();
				var4 = var1.readUnsignedByte() & 31;
				var25 = var1.readUnsignedByteNeg();
				var6 = var1.readUnsignedByte();
				var27 = var1.readUnsignedByteNeg();
				var8 = (var27 >> 4 & 7) + ItemLayer.field2480;
				var9 = (var27 & 7) + class134.field1572;
				if (var8 >= 0 && var9 >= 0 && var8 < class344.worldView.sizeX && var9 < class344.worldView.sizeY) {
					var10 = var4 + 1;
					if (SpriteMask.localPlayer.pathX[0] >= var8 - var10 && SpriteMask.localPlayer.pathX[0] <= var8 + var10 && SpriteMask.localPlayer.pathY[0] >= var9 - var10 && SpriteMask.localPlayer.pathY[0] <= var10 + var9 && TaskHandler.clientPreferences.getAreaSoundEffectsVolume() != 0 && var24 > 0 && Client.soundEffectCount < 50) {
						Client.soundEffectIds[Client.soundEffectCount] = var23;
						Client.soundEffects[Client.soundEffectCount] = null;
						Client.soundLocations[Client.soundEffectCount] = var4 + (var9 << 8) + (var8 << 16);
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var24;
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = var6;
						Client.field573[Client.soundEffectCount] = var25;
						++Client.soundEffectCount;
					}
				}

			} else if (class323.field3416 == var0) {
				var23 = var1.readUnsignedByteSub();
				var24 = (var23 >> 4 & 7) + ItemLayer.field2480;
				var4 = (var23 & 7) + class134.field1572;
				var25 = var1.readUnsignedShortAdd();
				var6 = var1.readUnsignedIntLE();
				var27 = class344.worldView.plane;
				if (0 <= var24 && var24 < 104 && 0 <= var4 && var4 < 104) {
					var8 = Client.field734 == -1 ? var27 : Client.field734;
					class136.method3436(var8, var24, var4, var25, var6);
				}

			} else {
				int var11;
				if (class323.field3418 == var0) {
					var23 = var1.readUnsignedByteSub();
					var24 = var23 >> 2;
					var4 = var23 & 3;
					var25 = Client.field580[var24];
					var6 = var1.readUnsignedByteSub();
					var27 = var1.readUnsignedShortLE();
					var8 = var1.readUnsignedByteAdd();
					var9 = (var8 >> 4 & 7) + ItemLayer.field2480;
					var10 = (var8 & 7) + class134.field1572;
					if (var9 >= 0 && var10 >= 0 && var9 < class344.worldView.sizeX && var10 < class344.worldView.sizeY) {
						var11 = Client.field734 == -1 ? class344.worldView.plane : Client.field734;
						class217.method4485(class344.worldView, var11, var9, var10, var25, var27, var24, var4, var6, 0, -1);
					}

				} else if (class323.field3422 == var0) {
					var23 = var1.readUnsignedByteNeg();
					var24 = (var23 >> 4 & 7) + ItemLayer.field2480;
					var4 = (var23 & 7) + class134.field1572;
					var25 = var1.readUnsignedShortLE();
					var6 = var1.readInt();
					if (var24 >= 0 && var4 >= 0 && var24 < 104 && var4 < 104) {
						var27 = Client.field734 == -1 ? class344.worldView.plane : Client.field734;
						StudioGame.method7530(var27, var24, var4, var25, var6);
					}

				} else {
					int var12;
					int var13;
					int var14;
					int var15;
					int var16;
					if (class323.field3424 == var0) {
						byte var2 = var1.readByteNeg();
						byte var3 = var1.readByteNeg();
						var4 = var1.readUnsignedShortAddLE();
						byte var5 = var1.readByteNeg();
						var6 = var1.readUnsignedShort();
						byte var7 = var1.readByteAdd();
						var8 = var1.readUnsignedByteAdd();
						var9 = (var8 >> 4 & 7) + ItemLayer.field2480;
						var10 = (var8 & 7) + class134.field1572;
						var11 = var1.readUnsignedShortAdd();
						var12 = var1.readUnsignedByteNeg();
						var13 = var12 >> 2;
						var14 = var12 & 3;
						var15 = Client.field580[var13];
						var16 = var1.readUnsignedShortLE();
						Player var17;
						if (var16 == Client.localPlayerIndex) {
							var17 = SpriteMask.localPlayer;
						} else {
							var17 = class344.worldView.players[var16];
						}

						if (var17 != null) {
							int var18 = Client.field734 == -1 ? class344.worldView.plane : Client.field734;
							class376.method7523(var18, var9, var10, var13, var14, var15, var6, var4, var11, var5, var2, var7, var3, var17);
						}
					}

					if (class323.field3421 == var0) {
						var23 = var1.readUnsignedByte();
						var24 = var23 >> 2;
						var4 = var23 & 3;
						var25 = Client.field580[var24];
						var6 = var1.readUnsignedShortAddLE();
						var27 = var1.readUnsignedByte();
						var8 = (var27 >> 4 & 7) + ItemLayer.field2480;
						var9 = (var27 & 7) + class134.field1572;
						if (0 <= var8 && var8 < 103 && 0 <= var9 && var9 < 103) {
							var10 = Client.field734 == -1 ? class344.worldView.plane : Client.field734;
							PendingSpawn var21 = class202.method4112(class344.worldView, var10, var8, var9, var25);
							if (var21 != null) {
								ObjectComposition var22 = UrlRequest.getObjectDefinition(var21.field1200);
								if (var22.field2222) {
									var21.field1214 = var6;
									return;
								}
							}

							boolean var31 = HealthBarConfig.method2961(var10, var8, var9, var24, var4, var25, var6);
							if (var31) {
								return;
							}

							if (var21 != null) {
								var21.field1214 = var6;
							}
						}

					} else if (class323.field3427 == var0) {
						var23 = var1.readUnsignedShortAdd();
						var24 = var1.readNullableLargeSmart();
						var4 = var1.readUnsignedShortAdd();
						var25 = var1.readUnsignedShortAddLE();
						var6 = var1.method10140();
						var27 = var1.readUnsignedByte() * 4;
						var8 = var1.readUnsignedByteSub();
						var9 = (var8 >> 4 & 7) + ItemLayer.field2480;
						var10 = (var8 & 7) + class134.field1572;
						var11 = var1.readUnsignedByteAdd() * 4;
						var12 = var1.readUnsignedShortAdd();
						byte var30 = var1.readByteNeg();
						var14 = var1.readUnsignedByteNeg();
						byte var32 = var1.readByteAdd();
						var15 = var32 + var9;
						var13 = var30 + var10;
						if (var9 >= 0 && var10 >= 0 && var9 < class344.worldView.sizeX && var10 < class344.worldView.sizeY && var15 >= 0 && var13 >= 0 && var15 < class344.worldView.sizeX && var13 < class344.worldView.sizeY && var12 != 65535) {
							var16 = Client.field734 == -1 ? class344.worldView.plane : Client.field734;
							class153.method3597(var16, var9, var10, var15, var13, var6, var12, var27, var11, var4, var23, var14, var25, var24);
						}

					} else if (class323.field3425 == var0) {
						var23 = var1.readUnsignedByte();
						var24 = var23 >> 2;
						var4 = var23 & 3;
						var25 = Client.field580[var24];
						var6 = var1.readUnsignedByteSub();
						var27 = (var6 >> 4 & 7) + ItemLayer.field2480;
						var8 = (var6 & 7) + class134.field1572;
						if (var27 >= 0 && var8 >= 0 && var27 < class344.worldView.sizeX && var8 < class344.worldView.sizeY) {
							var9 = Client.field734 == -1 ? class344.worldView.plane : Client.field734;
							class217.method4485(class344.worldView, var9, var27, var8, var25, -1, var24, var4, 31, 0, -1);
						}

					} else if (class323.field3426 == var0) {
						var23 = var1.readUnsignedByte();
						var24 = (var23 >> 4 & 7) + ItemLayer.field2480;
						var4 = (var23 & 7) + class134.field1572;
						var25 = var1.readUnsignedShort();
						short var28 = (short)var1.readShortLE();
						var27 = var1.readUnsignedIntLE();
						var8 = var1.readUnsignedShortAdd();
						short var29 = (short)var1.readShort();
						var10 = var1.readSignedShort();
						var11 = var1.readShortLE();
						if (var24 >= 0 && var4 >= 0 && var24 < 104 && var4 < 104) {
							var12 = Client.field734 == -1 ? class344.worldView.plane : Client.field734;
							PacketBufferNode.method6524(var12, var24, var4, var8, var27, var29, var11, var28, var10, var25);
						}

					} else if (class323.field3419 == var0) {
						var23 = var1.readUnsignedShortLE();
						var24 = var1.readUnsignedShortAddLE();
						var4 = var1.readUnsignedByteNeg();
						var25 = (var4 >> 4 & 7) + ItemLayer.field2480;
						var6 = (var4 & 7) + class134.field1572;
						var27 = var1.readUnsignedByte();
						if (var25 >= 0 && var6 >= 0 && var25 < class344.worldView.sizeX && var6 < class344.worldView.sizeY) {
							var25 = Coord.method6854(var25);
							var6 = Coord.method6854(var6);
							var8 = Client.field734 == -1 ? class344.worldView.plane : Client.field734;
							GraphicsObject var33 = new GraphicsObject(var23, var8, var25, var6, ScriptFrame.getTileHeight(class344.worldView, var25, var6, var8) - var27, var24, Client.cycle);
							class344.worldView.graphicsObjects.addFirst(var33);
						}

					} else {
						if (class323.field3423 == var0) {
							var23 = var1.readUnsignedByteSub();
							var24 = var1.readUnsignedShort();
							var4 = var1.readUnsignedByteSub();
							var25 = (var4 >> 4 & 7) + ItemLayer.field2480;
							var6 = (var4 & 7) + class134.field1572;
							var27 = class344.worldView.plane;
							if (var25 >= 0 && var6 >= 0 && var25 < class344.worldView.sizeX && var6 < class344.worldView.sizeY) {
								NodeDeque var19 = class344.worldView.groundItems[var27][var25][var6];
								if (var19 != null) {
									for (TileItem var20 = (TileItem)var19.last(); var20 != null; var20 = (TileItem)var19.previous()) {
										if ((var24 & 32767) == var20.id) {
											var20.setFlag(var23);
											break;
										}
									}
								}

								if (var25 >= 0 && var6 >= 0 && var25 < class344.worldView.sizeX && var6 < class344.worldView.sizeY) {
									var9 = Client.field734 == -1 ? class344.worldView.plane : Client.field734;
									UserComparator3.method3312(var9, var25, var6, var24, var23);
								}

								return;
							}
						}

						if (class323.field3417 == var0) {
							var23 = var1.readUnsignedByteSub();
							var24 = (var23 >> 4 & 7) + ItemLayer.field2480;
							var4 = (var23 & 7) + class134.field1572;
							var25 = var1.readUnsignedByte();
							boolean var26 = var1.readUnsignedByte() == 1;
							var27 = var1.readInt();
							var8 = var1.readUnsignedShortAddLE();
							var9 = var1.readUnsignedByteAdd();
							var10 = var1.readUnsignedShortLE();
							var11 = var1.readUnsignedShortLE();
							if (var24 >= 0 && var4 >= 0 && var24 < class344.worldView.sizeX && var4 < class344.worldView.sizeY) {
								var12 = Client.field734 == -1 ? class344.worldView.plane : Client.field734;
								WorldMapSectionType.addTileItemToGroundItems(var12, var24, var4, var8, var27, var25, var11, var10, var9, var26);
							}

						}
					}
				}
			}
		}
	}
}
