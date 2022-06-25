import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.security.SecureRandom;
import net.runelite.mapping.Export;
@ObfuscatedName("kj")
public class class306 {
	@ObfuscatedName("gv")
	@Export("secureRandom")
	static SecureRandom secureRandom;

	@ObfuscatedName("is")
	@ObfuscatedSignature(descriptor = "(Lci;IILgn;I)V", garbageValue = "-1866135565")
	static final void method5765(Player var0, int var1, int var2, class192 var3) {
		int var4 = var0.pathX[0];
		int var5 = var0.pathY[0];
		int var6 = var0.transformedSize();
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) {
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
				int var8 = var0.transformedSize();
				RouteStrategy var9 = VerticalAlignment.method3533(var1, var2);
				CollisionMap var10 = Client.collisionMaps[var0.plane];
				int[] var11 = Client.field674;
				int[] var12 = Client.field776;
				int var13;
				int var14;
				for (var13 = 0; var13 < 128; ++var13) {
					for (var14 = 0; var14 < 128; ++var14) {
						class193.directions[var13][var14] = 0;
						class193.distances[var13][var14] = 99999999;
					}
				}
				int var15;
				int var16;
				byte var18;
				int var19;
				int var20;
				int var22;
				int var24;
				int var25;
				int var26;
				boolean var33;
				int var35;
				int var36;
				int var38;
				if (var8 == 1) {
					var15 = var4;
					var16 = var5;
					byte var17 = 64;
					var18 = 64;
					var19 = var4 - var17;
					var20 = var5 - var18;
					class193.directions[var17][var18] = 99;
					class193.distances[var17][var18] = 0;
					byte var21 = 0;
					var22 = 0;
					class193.bufferX[var21] = var4;
					var38 = var21 + 1;
					class193.bufferY[var21] = var5;
					int[][] var23 = var10.flags;
					boolean var34;
					while (true) {
						if (var38 == var22) {
							class193.field2219 = var15;
							class394.field4429 = var16;
							var34 = false;
							break;
						}
						var15 = class193.bufferX[var22];
						var16 = class193.bufferY[var22];
						var22 = var22 + 1 & 4095;
						var35 = var15 - var19;
						var36 = var16 - var20;
						var24 = var15 - var10.xInset;
						var25 = var16 - var10.yInset;
						if (var9.hasArrived(1, var15, var16, var10)) {
							class193.field2219 = var15;
							class394.field4429 = var16;
							var34 = true;
							break;
						}
						var26 = class193.distances[var35][var36] + 1;
						if (var35 > 0 && class193.directions[var35 - 1][var36] == 0 && (var23[var24 - 1][var25] & 19136776) == 0) {
							class193.bufferX[var38] = var15 - 1;
							class193.bufferY[var38] = var16;
							var38 = var38 + 1 & 4095;
							class193.directions[var35 - 1][var36] = 2;
							class193.distances[var35 - 1][var36] = var26;
						}
						if (var35 < 127 && class193.directions[var35 + 1][var36] == 0 && (var23[var24 + 1][var25] & 19136896) == 0) {
							class193.bufferX[var38] = var15 + 1;
							class193.bufferY[var38] = var16;
							var38 = var38 + 1 & 4095;
							class193.directions[var35 + 1][var36] = 8;
							class193.distances[var35 + 1][var36] = var26;
						}
						if (var36 > 0 && class193.directions[var35][var36 - 1] == 0 && (var23[var24][var25 - 1] & 19136770) == 0) {
							class193.bufferX[var38] = var15;
							class193.bufferY[var38] = var16 - 1;
							var38 = var38 + 1 & 4095;
							class193.directions[var35][var36 - 1] = 1;
							class193.distances[var35][var36 - 1] = var26;
						}
						if (var36 < 127 && class193.directions[var35][var36 + 1] == 0 && (var23[var24][var25 + 1] & 19136800) == 0) {
							class193.bufferX[var38] = var15;
							class193.bufferY[var38] = var16 + 1;
							var38 = var38 + 1 & 4095;
							class193.directions[var35][var36 + 1] = 4;
							class193.distances[var35][var36 + 1] = var26;
						}
						if (var35 > 0 && var36 > 0 && class193.directions[var35 - 1][var36 - 1] == 0 && (var23[var24 - 1][var25 - 1] & 19136782) == 0 && (var23[var24 - 1][var25] & 19136776) == 0 && (var23[var24][var25 - 1] & 19136770) == 0) {
							class193.bufferX[var38] = var15 - 1;
							class193.bufferY[var38] = var16 - 1;
							var38 = var38 + 1 & 4095;
							class193.directions[var35 - 1][var36 - 1] = 3;
							class193.distances[var35 - 1][var36 - 1] = var26;
						}
						if (var35 < 127 && var36 > 0 && class193.directions[var35 + 1][var36 - 1] == 0 && (var23[var24 + 1][var25 - 1] & 19136899) == 0 && (var23[var24 + 1][var25] & 19136896) == 0 && (var23[var24][var25 - 1] & 19136770) == 0) {
							class193.bufferX[var38] = var15 + 1;
							class193.bufferY[var38] = var16 - 1;
							var38 = var38 + 1 & 4095;
							class193.directions[var35 + 1][var36 - 1] = 9;
							class193.distances[var35 + 1][var36 - 1] = var26;
						}
						if (var35 > 0 && var36 < 127 && class193.directions[var35 - 1][var36 + 1] == 0 && (var23[var24 - 1][var25 + 1] & 19136824) == 0 && (var23[var24 - 1][var25] & 19136776) == 0 && (var23[var24][var25 + 1] & 19136800) == 0) {
							class193.bufferX[var38] = var15 - 1;
							class193.bufferY[var38] = var16 + 1;
							var38 = var38 + 1 & 4095;
							class193.directions[var35 - 1][var36 + 1] = 6;
							class193.distances[var35 - 1][var36 + 1] = var26;
						}
						if (var35 < 127 && var36 < 127 && class193.directions[var35 + 1][var36 + 1] == 0 && (var23[var24 + 1][var25 + 1] & 19136992) == 0 && (var23[var24 + 1][var25] & 19136896) == 0 && (var23[var24][var25 + 1] & 19136800) == 0) {
							class193.bufferX[var38] = var15 + 1;
							class193.bufferY[var38] = var16 + 1;
							var38 = var38 + 1 & 4095;
							class193.directions[var35 + 1][var36 + 1] = 12;
							class193.distances[var35 + 1][var36 + 1] = var26;
						}
					} 
					var33 = var34;
				} else if (var8 == 2) {
					var33 = WorldMapIcon_1.method4592(var4, var5, var9, var10);
				} else {
					var33 = class127.method2844(var4, var5, var8, var9, var10);
				}
				int var7;
				label346 : {
					var14 = var4 - 64;
					var15 = var5 - 64;
					var16 = class193.field2219;
					var35 = class394.field4429;
					if (!var33) {
						var36 = Integer.MAX_VALUE;
						var19 = Integer.MAX_VALUE;
						byte var37 = 10;
						var38 = var9.approxDestinationX;
						var22 = var9.approxDestinationY;
						int var32 = var9.approxDestinationSizeX;
						var24 = var9.approxDestinationSizeY;
						for (var25 = var38 - var37; var25 <= var37 + var38; ++var25) {
							for (var26 = var22 - var37; var26 <= var22 + var37; ++var26) {
								int var27 = var25 - var14;
								int var28 = var26 - var15;
								if (var27 >= 0 && var28 >= 0 && var27 < 128 && var28 < 128 && class193.distances[var27][var28] < 100) {
									int var29 = 0;
									if (var25 < var38) {
										var29 = var38 - var25;
									} else if (var25 > var32 + var38 - 1) {
										var29 = var25 - (var38 + var32 - 1);
									}
									int var30 = 0;
									if (var26 < var22) {
										var30 = var22 - var26;
									} else if (var26 > var24 + var22 - 1) {
										var30 = var26 - (var22 + var24 - 1);
									}
									int var31 = var30 * var30 + var29 * var29;
									if (var31 < var36 || var36 == var31 && class193.distances[var27][var28] < var19) {
										var36 = var31;
										var19 = class193.distances[var27][var28];
										var16 = var25;
										var35 = var26;
									}
								}
							}
						}
						if (var36 == Integer.MAX_VALUE) {
							var7 = -1;
							break label346;
						}
					}
					if (var16 == var4 && var5 == var35) {
						var11[0] = var16;
						var12[0] = var35;
						var7 = 0;
					} else {
						var18 = 0;
						class193.bufferX[var18] = var16;
						var36 = var18 + 1;
						class193.bufferY[var18] = var35;
						for (var19 = var20 = class193.directions[var16 - var14][var35 - var15]; var4 != var16 || var35 != var5; var19 = class193.directions[var16 - var14][var35 - var15]) {
							if (var19 != var20) {
								var20 = var19;
								class193.bufferX[var36] = var16;
								class193.bufferY[var36++] = var35;
							}
							if ((var19 & 2) != 0) {
								++var16;
							} else if ((var19 & 8) != 0) {
								--var16;
							}
							if ((var19 & 1) != 0) {
								++var35;
							} else if ((var19 & 4) != 0) {
								--var35;
							}
						}
						var38 = 0;
						while (var36-- > 0) {
							var11[var38] = class193.bufferX[var36];
							var12[var38++] = class193.bufferY[var36];
							if (var38 >= var11.length) {
								break;
							}
						} 
						var7 = var38;
					}
				}
				var13 = var7;
				if (var7 >= 1) {
					for (var14 = 0; var14 < var13 - 1; ++var14) {
						var0.method2141(Client.field674[var14], Client.field776[var14], var3);
					}
				}
			}
		}
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "171777159")
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		GraphicsObject.method1870();
		for (ObjectSound var1 = ((ObjectSound) (ObjectSound.objectSounds.last())); var1 != null; var1 = ((ObjectSound) (ObjectSound.objectSounds.previous()))) {
			if (var1.obj != null) {
				var1.set();
			}
		}
		int var3 = FloorUnderlayDefinition.VarpDefinition_get(var0).type;
		if (var3 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var3 == 1) {
				if (var2 == 1) {
					Rasterizer3D.Rasterizer3D_setBrightness(0.9);
					((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).setBrightness(0.9);
					Projectile.method1959();
					class19.clientPreferences.method2255(0.9);
				}
				if (var2 == 2) {
					Rasterizer3D.Rasterizer3D_setBrightness(0.8);
					((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).setBrightness(0.8);
					Projectile.method1959();
					class19.clientPreferences.method2255(0.8);
				}
				if (var2 == 3) {
					Rasterizer3D.Rasterizer3D_setBrightness(0.7);
					((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).setBrightness(0.7);
					Projectile.method1959();
					class19.clientPreferences.method2255(0.7);
				}
				if (var2 == 4) {
					Rasterizer3D.Rasterizer3D_setBrightness(0.6);
					((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).setBrightness(0.6);
					Projectile.method1959();
					class19.clientPreferences.method2255(0.6);
				}
			}
			if (var3 == 3) {
				if (var2 == 0) {
					PacketBufferNode.method5196(255);
				}
				if (var2 == 1) {
					PacketBufferNode.method5196(192);
				}
				if (var2 == 2) {
					PacketBufferNode.method5196(128);
				}
				if (var2 == 3) {
					PacketBufferNode.method5196(64);
				}
				if (var2 == 4) {
					PacketBufferNode.method5196(0);
				}
			}
			if (var3 == 4) {
				if (var2 == 0) {
					WorldMapData_0.method4563(127);
				}
				if (var2 == 1) {
					WorldMapData_0.method4563(96);
				}
				if (var2 == 2) {
					WorldMapData_0.method4563(64);
				}
				if (var2 == 3) {
					WorldMapData_0.method4563(32);
				}
				if (var2 == 4) {
					WorldMapData_0.method4563(0);
				}
			}
			if (var3 == 5) {
				Client.leftClickOpensMenu = var2;
			}
			if (var3 == 6) {
				Client.chatEffects = var2;
			}
			if (var3 == 9) {
				Client.field676 = var2;
			}
			if (var3 == 10) {
				if (var2 == 0) {
					WorldMapEvent.method5121(127);
				}
				if (var2 == 1) {
					WorldMapEvent.method5121(96);
				}
				if (var2 == 2) {
					WorldMapEvent.method5121(64);
				}
				if (var2 == 3) {
					WorldMapEvent.method5121(32);
				}
				if (var2 == 4) {
					WorldMapEvent.method5121(0);
				}
			}
			if (var3 == 17) {
				Client.followerIndex = var2 & 65535;
			}
			if (var3 == 18) {
				Client.playerAttackOption = ((AttackOption) (Actor.findEnumerated(class7.method52(), var2)));
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}
			if (var3 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}
			if (var3 == 22) {
				Client.npcAttackOption = ((AttackOption) (Actor.findEnumerated(class7.method52(), var2)));
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}
		}
	}
}