import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("World")
public class World {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -962516855
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2009368915
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("ap")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("aa")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -5014477
	)
	@Export("id")
	int id;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -734076159
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -272827429
	)
	@Export("population")
	int population;
	@ObfuscatedName("an")
	@Export("host")
	String host;
	@ObfuscatedName("ar")
	@Export("activity")
	String activity;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1366935941
	)
	@Export("location")
	int location;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1816726787
	)
	@Export("index")
	int index;
	@ObfuscatedName("am")
	String field847;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (class510.field5087.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1342373424"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (class510.field5077.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1471748283"
	)
	boolean method1805() {
		return (class510.field5062.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-87"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (class510.field5071.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1678180347"
	)
	boolean method1817() {
		return (class510.field5075.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1233565973"
	)
	boolean method1808() {
		return (class510.field5090.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "879753429"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (class510.field5086.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-6"
	)
	boolean method1809() {
		return (class510.field5091.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	boolean method1843() {
		return (class510.field5069.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	boolean method1811() {
		return (class510.field5088.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-2141322867"
	)
	public static String method1830(String var0) {
		int var1 = var0.length();
		char[] var2 = new char[var1];
		byte var3 = 2;

		for (int var4 = 0; var4 < var1; ++var4) {
			char var5 = var0.charAt(var4);
			if (var3 == 0) {
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) {
				var5 = SceneTilePaint.method4921(var5);
			}

			if (Character.isLetter(var5)) {
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') {
				if (Character.isSpaceChar(var5)) {
					if (var3 != 2) {
						var3 = 1;
					}
				} else {
					var3 = 1;
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5;
		}

		return new String(var2);
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Lls;I)V",
		garbageValue = "681545140"
	)
	static final void method1806(class295 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (class295.field3212 == var0) {
			var2 = var1.readUnsignedIntIME();
			var3 = var1.readUnsignedIntME();
			var4 = var1.readUnsignedByte();
			var5 = (var4 >> 4 & 7) + ObjectSound.field855;
			var6 = (var4 & 7) + class125.field1499;
			var7 = var1.readUnsignedShortAdd();
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
				NodeDeque var45 = Client.groundItems[HealthBar.Client_plane][var5][var6];
				if (var45 != null) {
					for (TileItem var36 = (TileItem)var45.last(); var36 != null; var36 = (TileItem)var45.previous()) {
						if ((var7 & 32767) == var36.id && var3 == var36.quantity) {
							var36.quantity = var2;
							break;
						}
					}

					class135.updateItemPile(var5, var6);
				}
			}

		} else {
			int var8;
			int var9;
			byte var10;
			int var12;
			int var13;
			if (class295.field3215 == var0) {
				var2 = var1.readUnsignedByteAdd();
				var3 = var2 >> 2;
				var4 = var2 & 3;
				var5 = Client.field711[var3];
				var6 = var1.readUnsignedByteNeg();
				var7 = (var6 >> 4 & 7) + ObjectSound.field855;
				var8 = (var6 & 7) + class125.field1499;
				var9 = var1.readUnsignedShortAddLE();
				var10 = var1.readByteAdd();
				byte var11 = var1.readByteNeg();
				var12 = var1.readUnsignedShortLE();
				var13 = var1.readUnsignedShortLE();
				byte var14 = var1.readByteSub();
				byte var15 = var1.readByte();
				int var16 = var1.readUnsignedShortAddLE();
				Player var17;
				if (var9 == Client.localPlayerIndex) {
					var17 = VarbitComposition.localPlayer;
				} else {
					var17 = Client.players[var9];
				}

				if (var17 != null) {
					ObjectComposition var18 = WorldMapElement.getObjectDefinition(var13);
					int var19;
					int var20;
					if (var4 != 1 && var4 != 3) {
						var19 = var18.sizeX;
						var20 = var18.sizeY;
					} else {
						var19 = var18.sizeY;
						var20 = var18.sizeX;
					}

					int var21 = var7 + (var19 >> 1);
					int var22 = var7 + (var19 + 1 >> 1);
					int var23 = var8 + (var20 >> 1);
					int var24 = var8 + (var20 + 1 >> 1);
					int[][] var25 = Tiles.Tiles_heights[HealthBar.Client_plane];
					int var26 = var25[var22][var24] + var25[var21][var24] + var25[var22][var23] + var25[var21][var23] >> 2;
					int var27 = (var7 << 7) + (var19 << 6);
					int var28 = (var8 << 7) + (var20 << 6);
					Model var29 = var18.getModel(var3, var4, var25, var27, var26, var28);
					if (var29 != null) {
						ClientPreferences.method2475(HealthBar.Client_plane, var7, var8, var5, -1, 0, 0, 31, var12 + 1, var16 + 1);
						var17.animationCycleStart = var12 + Client.cycle;
						var17.animationCycleEnd = var16 + Client.cycle;
						var17.model0 = var29;
						var17.field1138 = var7 * 128 + var19 * 64;
						var17.field1140 = var8 * 128 + var20 * 64;
						var17.tileHeight2 = var26;
						byte var30;
						if (var14 > var10) {
							var30 = var14;
							var14 = var10;
							var10 = var30;
						}

						if (var11 > var15) {
							var30 = var11;
							var11 = var15;
							var15 = var30;
						}

						var17.minX = var7 + var14;
						var17.maxX = var10 + var7;
						var17.minY = var11 + var8;
						var17.maxY = var15 + var8;
					}
				}
			}

			if (class295.field3208 == var0) {
				var2 = var1.readUnsignedByteNeg();
				var3 = (var2 >> 4 & 7) + ObjectSound.field855;
				var4 = (var2 & 7) + class125.field1499;
				var5 = var1.readUnsignedShort();
				var6 = var1.readUnsignedByteNeg();
				var7 = var1.readUnsignedShortAdd();
				if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
					var3 = var3 * 128 + 64;
					var4 = var4 * 128 + 64;
					GraphicsObject var44 = new GraphicsObject(var7, HealthBar.Client_plane, var3, var4, class18.getTileHeight(var3, var4, HealthBar.Client_plane) - var6, var5, Client.cycle);
					Client.graphicsObjects.addFirst(var44);
				}

			} else {
				int var40;
				if (class295.field3216 == var0) {
					var2 = var1.readUnsignedByteAdd();
					var3 = var1.readUnsignedByteNeg();
					var4 = var3 >> 2;
					var5 = var3 & 3;
					var6 = Client.field711[var4];
					var7 = var1.readUnsignedShortAddLE();
					var8 = var1.readUnsignedByteSub();
					var9 = (var8 >> 4 & 7) + ObjectSound.field855;
					var40 = (var8 & 7) + class125.field1499;
					if (var9 >= 0 && var40 >= 0 && var9 < 104 && var40 < 104) {
						ClientPreferences.method2475(HealthBar.Client_plane, var9, var40, var6, var7, var4, var5, var2, 0, -1);
					}

				} else {
					int var41;
					if (class295.field3209 == var0) {
						var2 = var1.readUnsignedByteNeg();
						var3 = var2 >> 2;
						var4 = var2 & 3;
						var5 = Client.field711[var3];
						var6 = var1.readUnsignedShortLE();
						var7 = var1.readUnsignedByteNeg();
						var8 = (var7 >> 4 & 7) + ObjectSound.field855;
						var9 = (var7 & 7) + class125.field1499;
						if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
							if (var5 == 0) {
								BoundaryObject var35 = class130.scene.method4547(HealthBar.Client_plane, var8, var9);
								if (var35 != null) {
									var41 = InvDefinition.Entity_unpackID(var35.tag);
									if (var3 == 2) {
										var35.renderable1 = new DynamicObject(var41, 2, var4 + 4, HealthBar.Client_plane, var8, var9, var6, false, var35.renderable1);
										var35.renderable2 = new DynamicObject(var41, 2, var4 + 1 & 3, HealthBar.Client_plane, var8, var9, var6, false, var35.renderable2);
									} else {
										var35.renderable1 = new DynamicObject(var41, var3, var4, HealthBar.Client_plane, var8, var9, var6, false, var35.renderable1);
									}

									return;
								}
							}

							if (var5 == 1) {
								WallDecoration var46 = class130.scene.method4548(HealthBar.Client_plane, var8, var9);
								if (var46 != null) {
									var41 = InvDefinition.Entity_unpackID(var46.tag);
									if (var3 != 4 && var3 != 5) {
										if (var3 == 6) {
											var46.renderable1 = new DynamicObject(var41, 4, var4 + 4, HealthBar.Client_plane, var8, var9, var6, false, var46.renderable1);
										} else if (var3 == 7) {
											var46.renderable1 = new DynamicObject(var41, 4, (var4 + 2 & 3) + 4, HealthBar.Client_plane, var8, var9, var6, false, var46.renderable1);
										} else if (var3 == 8) {
											var46.renderable1 = new DynamicObject(var41, 4, var4 + 4, HealthBar.Client_plane, var8, var9, var6, false, var46.renderable1);
											var46.renderable2 = new DynamicObject(var41, 4, (var4 + 2 & 3) + 4, HealthBar.Client_plane, var8, var9, var6, false, var46.renderable2);
										}
									} else {
										var46.renderable1 = new DynamicObject(var41, 4, var4, HealthBar.Client_plane, var8, var9, var6, false, var46.renderable1);
									}

									return;
								}
							}

							if (var5 == 2) {
								GameObject var47 = class130.scene.getGameObject(HealthBar.Client_plane, var8, var9);
								if (var3 == 11) {
									var3 = 10;
								}

								if (var47 != null) {
									var47.renderable = new DynamicObject(InvDefinition.Entity_unpackID(var47.tag), var3, var4, HealthBar.Client_plane, var8, var9, var6, false, var47.renderable);
									return;
								}
							}

							if (var5 == 3) {
								FloorDecoration var48 = class130.scene.getFloorDecoration(HealthBar.Client_plane, var8, var9);
								if (var48 != null) {
									var48.renderable = new DynamicObject(InvDefinition.Entity_unpackID(var48.tag), 22, var4, HealthBar.Client_plane, var8, var9, var6, false, var48.renderable);
									return;
								}
							}

							class460.method8320(HealthBar.Client_plane, var8, var9, var5, var6);
						}

					} else {
						TileItem var32;
						if (class295.field3213 == var0) {
							var1.readUnsignedByteAdd();
							var2 = var1.readUnsignedByteAdd();
							var3 = (var2 >> 4 & 7) + ObjectSound.field855;
							var4 = (var2 & 7) + class125.field1499;
							var5 = var1.readUnsignedByte();
							var6 = var1.readInt();
							var1.readUnsignedShortAddLE();
							var1.readUnsignedShortLE();
							var1.readUnsignedByteAdd();
							var7 = var1.readUnsignedShort();
							if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
								var32 = new TileItem();
								var32.id = var7;
								var32.quantity = var6;
								var32.method2674(var5);
								if (Client.groundItems[HealthBar.Client_plane][var3][var4] == null) {
									Client.groundItems[HealthBar.Client_plane][var3][var4] = new NodeDeque();
								}

								Client.groundItems[HealthBar.Client_plane][var3][var4].addFirst(var32);
								class135.updateItemPile(var3, var4);
							}

						} else if (class295.field3218 == var0) {
							var2 = var1.readUnsignedByte();
							var3 = (var2 >> 4 & 7) + ObjectSound.field855;
							var4 = (var2 & 7) + class125.field1499;
							var5 = var1.readUnsignedByteNeg();
							var6 = var5 >> 2;
							var7 = var5 & 3;
							var8 = Client.field711[var6];
							if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
								ClientPreferences.method2475(HealthBar.Client_plane, var3, var4, var8, -1, var6, var7, 31, 0, -1);
							}

						} else {
							NodeDeque var31;
							if (class295.field3217 == var0) {
								var2 = var1.readUnsignedShortAddLE();
								var3 = var1.readUnsignedIntIME();
								var4 = var1.readUnsignedByte();
								var5 = (var4 >> 4 & 7) + ObjectSound.field855;
								var6 = (var4 & 7) + class125.field1499;
								if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
									var31 = Client.groundItems[HealthBar.Client_plane][var5][var6];
									if (var31 != null) {
										for (var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) {
											if ((var2 & 32767) == var32.id && var3 == var32.quantity) {
												var32.remove();
												break;
											}
										}

										if (var31.last() == null) {
											Client.groundItems[HealthBar.Client_plane][var5][var6] = null;
										}

										class135.updateItemPile(var5, var6);
									}
								}

							} else {
								if (class295.field3214 == var0) {
									var2 = var1.readUnsignedByteAdd();
									var3 = (var2 >> 4 & 7) + ObjectSound.field855;
									var4 = (var2 & 7) + class125.field1499;
									var5 = var1.readUnsignedByteSub();
									var6 = var5 >> 4 & 15;
									var7 = var5 & 7;
									var8 = var1.readUnsignedByte();
									var9 = var1.readUnsignedShortAddLE();
									if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
										var40 = var6 + 1;
										if (VarbitComposition.localPlayer.pathX[0] >= var3 - var40 && VarbitComposition.localPlayer.pathX[0] <= var40 + var3 && VarbitComposition.localPlayer.pathY[0] >= var4 - var40 && VarbitComposition.localPlayer.pathY[0] <= var40 + var4 && class449.clientPreferences.method2554() != 0 && var7 > 0 && Client.soundEffectCount < 50) {
											Client.soundEffectIds[Client.soundEffectCount] = var9;
											Client.queuedSoundEffectLoops[Client.soundEffectCount] = var7;
											Client.queuedSoundEffectDelays[Client.soundEffectCount] = var8;
											Client.soundEffects[Client.soundEffectCount] = null;
											Client.soundLocations[Client.soundEffectCount] = var6 + (var4 << 8) + (var3 << 16);
											++Client.soundEffectCount;
										}
									}
								}

								int var42;
								if (class295.field3211 == var0) {
									var2 = var1.readUnsignedShortAdd();
									var3 = var1.readUnsignedShort();
									byte var37 = var1.readByteSub();
									var5 = var1.readUnsignedByteNeg();
									var6 = var1.method9108();
									byte var39 = var1.readByte();
									var8 = var1.readUnsignedByteAdd() * 4;
									var9 = var1.readUnsignedByteNeg();
									var40 = var1.readUnsignedByteSub() * 4;
									var41 = var1.method9109();
									var12 = var1.readUnsignedByte();
									var13 = (var12 >> 4 & 7) + ObjectSound.field855;
									var42 = (var12 & 7) + class125.field1499;
									int var43 = var1.readUnsignedShortAddLE();
									var4 = var37 + var13;
									var7 = var39 + var42;
									if (var13 >= 0 && var42 >= 0 && var13 < 104 && var42 < 104 && var4 >= 0 && var7 >= 0 && var4 < 104 && var7 < 104 && var43 != 65535) {
										var13 = var13 * 128 + 64;
										var42 = var42 * 128 + 64;
										var4 = var4 * 128 + 64;
										var7 = var7 * 128 + 64;
										Projectile var34 = new Projectile(var43, HealthBar.Client_plane, var13, var42, class18.getTileHeight(var13, var42, HealthBar.Client_plane) - var8, var2 + Client.cycle, var3 + Client.cycle, var5, var9, var41, var6, var40);
										var34.setDestination(var4, var7, class18.getTileHeight(var4, var7, HealthBar.Client_plane) - var40, var2 + Client.cycle);
										Client.projectiles.addFirst(var34);
									}

								} else if (class295.field3207 == var0) {
									var2 = var1.readUnsignedShortLE();
									var3 = var1.readUnsignedByteAdd();
									var4 = (var3 >> 4 & 7) + ObjectSound.field855;
									var5 = (var3 & 7) + class125.field1499;
									byte var38 = var1.readByteSub();
									var7 = var1.method9109();
									var8 = var1.readUnsignedByteAdd();
									var9 = var1.readUnsignedShortAddLE();
									var10 = var1.readByteAdd();
									var41 = var1.readUnsignedByteNeg() * 4;
									var12 = var1.readUnsignedByteAdd();
									var13 = var1.readUnsignedByteAdd() * 4;
									var42 = var1.readUnsignedShort();
									var40 = var10 + var4;
									var6 = var38 + var5;
									if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var40 >= 0 && var6 >= 0 && var40 < 104 && var6 < 104 && var2 != 65535) {
										var4 = var4 * 128 + 64;
										var5 = var5 * 128 + 64;
										var40 = var40 * 128 + 64;
										var6 = var6 * 128 + 64;
										Projectile var33 = new Projectile(var2, HealthBar.Client_plane, var4, var5, class18.getTileHeight(var4, var5, HealthBar.Client_plane) - var13, var42 + Client.cycle, var9 + Client.cycle, var8, var12, var7, var41);
										var33.setDestination(var40, var6, class18.getTileHeight(var40, var6, HealthBar.Client_plane) - var41, var42 + Client.cycle);
										Client.projectiles.addFirst(var33);
									}

								} else if (class295.field3210 == var0) {
									var2 = var1.readUnsignedByte();
									var3 = (var2 >> 4 & 7) + ObjectSound.field855;
									var4 = (var2 & 7) + class125.field1499;
									var5 = var1.readUnsignedByteSub();
									var6 = var1.readUnsignedShortLE();
									if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
										var31 = Client.groundItems[HealthBar.Client_plane][var3][var4];
										if (var31 != null) {
											for (var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) {
												if ((var6 & 32767) == var32.id) {
													var32.method2674(var5);
													break;
												}
											}
										}
									}

								}
							}
						}
					}
				}
			}
		}
	}
}
