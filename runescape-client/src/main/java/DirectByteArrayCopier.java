import java.nio.ByteBuffer;




import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("p")
	static int[][][] field3277;
	@ObfuscatedName("v")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(B)[B", garbageValue = 
	"-16")

	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()];
		this.directBuffer.position(0);
		this.directBuffer.get(var1);
		return var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"([BI)V", garbageValue = 
	"-308662955")

	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length);
		this.directBuffer.position(0);
		this.directBuffer.put(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Llq;Ljava/lang/String;Ljava/lang/String;I)[Lql;", garbageValue = 
	"-177825093")

	public static SpritePixels[] method5541(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		return UserList.method6853(var0, var3, var4);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"1953861280")

	static int method5540(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			class295.Interpreter_intStackSize -= 3;
			KitDefinition.queueSoundEffect(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_SONG) {
			class401.playSong(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
			class295.Interpreter_intStackSize -= 2;
			class145.method3032(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]);
			return 1;
		} else {
			class83 var3;
			class82 var4;
			int var5;
			int var6;
			String var7;
			if (((((((var0 != 3212) && (var0 != 3213)) && (var0 != 3209)) && (var0 != 3181)) && (var0 != 3203)) && (var0 != 3205)) && (var0 != 3207)) {
				if (((((((var0 != 3214) && (var0 != 3215)) && (var0 != 3210)) && (var0 != 3182)) && (var0 != 3204)) && (var0 != 3206)) && (var0 != 3208)) {
					return var0 == 3211 ? 1 : 2;
				} else {
					var3 = class83.field1081;
					var4 = class82.field1072;
					boolean var8 = false;
					if (var0 == 3214) {
						var6 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						var3 = ((class83) (ChatChannel.findEnumerated(GraphicsObject.method1866(), var6)));
						if (var3 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}

					if (var0 == 3215) {
						var6 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						var4 = ((class82) (ChatChannel.findEnumerated(AbstractArchive.method5972(), var6)));
						if (var4 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}

					if (var0 == 3210) {
						var6 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						var3 = ((class83) (ChatChannel.findEnumerated(GraphicsObject.method1866(), var6)));
						if (var3 == null) {
							var4 = ((class82) (ChatChannel.findEnumerated(AbstractArchive.method5972(), var6)));
							if (var4 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3182) {
						var3 = class83.field1078;
					} else if (var0 == 3204) {
						var4 = class82.field1065;
					} else if (var0 == 3206) {
						var4 = class82.field1069;
					} else if (var0 == 3208) {
						var4 = class82.field1067;
					}

					if (var4 == class82.field1072) {
						switch (var3.field1079) {
							case 1 :
								var5 = (Interpreter.clientPreferences.method2257()) ? 1 : 0;
								break;
							case 2 :
								var5 = (Interpreter.clientPreferences.method2259()) ? 1 : 0;
								break;
							case 3 :
								var5 = (Interpreter.clientPreferences.method2251()) ? 1 : 0;
								break;
							case 4 :
								var5 = Interpreter.clientPreferences.method2275();
								break;
							case 5 :
								var5 = ViewportMouse.method4492();
								break;
							default :
								var7 = String.format("Unkown device option: %s.", var3.toString());
								throw new RuntimeException(var7);}

					} else {
						switch (var4.field1068) {
							case 1 :
								var5 = (Interpreter.clientPreferences.method2255()) ? 1 : 0;
								break;
							case 2 :
								var6 = Interpreter.clientPreferences.method2288();
								var5 = Math.round(((float) (var6 * 100)) / 255.0F);
								break;
							case 3 :
								var6 = Interpreter.clientPreferences.method2269();
								var5 = Math.round(((float) (var6 * 100)) / 127.0F);
								break;
							case 4 :
								var6 = Interpreter.clientPreferences.method2286();
								var5 = Math.round(((float) (var6 * 100)) / 127.0F);
								break;
							default :
								var7 = String.format("Unkown game option: %s.", var4.toString());
								throw new RuntimeException(var7);}

					}

					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var5;
					return 1;
				}
			} else {
				var3 = class83.field1081;
				var4 = class82.field1072;
				var5 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				if (var0 == 3212) {
					var6 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					var3 = ((class83) (ChatChannel.findEnumerated(GraphicsObject.method1866(), var6)));
					if (var3 == null) {
						throw new RuntimeException(String.format("Unrecognized device option %d", var6));
					}
				}

				if (var0 == 3213) {
					var6 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					var4 = ((class82) (ChatChannel.findEnumerated(AbstractArchive.method5972(), var6)));
					if (var4 == null) {
						throw new RuntimeException(String.format("Unrecognized game option %d", var6));
					}
				}

				if (var0 == 3209) {
					var6 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					var3 = ((class83) (ChatChannel.findEnumerated(GraphicsObject.method1866(), var6)));
					if (var3 == null) {
						var4 = ((class82) (ChatChannel.findEnumerated(AbstractArchive.method5972(), var6)));
						if (var4 == null) {
							throw new RuntimeException(String.format("Unrecognized client option %d", var6));
						}
					}
				} else if (var0 == 3181) {
					var3 = class83.field1078;
				} else if (var0 == 3203) {
					var4 = class82.field1065;
				} else if (var0 == 3205) {
					var4 = class82.field1069;
				} else if (var0 == 3207) {
					var4 = class82.field1067;
				}

				if (var4 == class82.field1072) {
					switch (var3.field1079) {
						case 1 :
							Interpreter.clientPreferences.method2256(var5 == 1);
							break;
						case 2 :
							Interpreter.clientPreferences.method2258(var5 == 1);
							break;
						case 3 :
							Interpreter.clientPreferences.method2265(var5 == 1);
							break;
						case 4 :
							if (var5 < 0) {
								var5 = 0;
							}

							Interpreter.clientPreferences.method2263(var5);
							break;
						case 5 :
							WorldMapSection0.method4940(var5);
							break;
						default :
							var7 = String.format("Unkown device option: %s.", var3.toString());
							throw new RuntimeException(var7);}

				} else {
					switch (var4.field1068) {
						case 1 :
							Interpreter.clientPreferences.method2254(var5 == 1);
							break;
						case 2 :
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round(((float) (var5 * 255)) / 100.0F);
							Tiles.method2040(var6);
							break;
						case 3 :
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round(((float) (var5 * 127)) / 100.0F);
							class28.method424(var6);
							break;
						case 4 :
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round(((float) (var5 * 127)) / 100.0F);
							class21.method334(var6);
							break;
						default :
							var7 = String.format("Unkown game option: %s.", var4.toString());
							throw new RuntimeException(var7);}

				}

				return 1;
			}
		}
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-874180383")

	static final void method5546() {
		class286.method5548(false);
		Client.field541 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < WorldMapSectionType.regionLandArchives.length; ++var1) {
			if ((ObjectComposition.regionMapArchiveIds[var1] != (-1)) && (WorldMapSectionType.regionLandArchives[var1] == null)) {
				WorldMapSectionType.regionLandArchives[var1] = class302.archive5.takeFile(ObjectComposition.regionMapArchiveIds[var1], 0);
				if (WorldMapSectionType.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field541;
				}
			}

			if ((Message.regionLandArchiveIds[var1] != (-1)) && (Occluder.regionMapArchives[var1] == null)) {
				Occluder.regionMapArchives[var1] = class302.archive5.takeFileEncrypted(Message.regionLandArchiveIds[var1], 0, Message.xteaKeys[var1]);
				if (Occluder.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field541;
				}
			}
		}

		if (!var0) {
			Client.field545 = 1;
		} else {
			Client.field543 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < WorldMapSectionType.regionLandArchives.length; ++var1) {
				byte[] var15 = Occluder.regionMapArchives[var1];
				if (var15 != null) {
					var3 = ((class123.regions[var1] >> 8) * 64) - ApproximateRouteStrategy.baseX;
					var4 = ((class123.regions[var1] & 255) * 64) - class250.baseY;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= class67.method1879(var15, var3, var4);
				}
			}

			if (!var0) {
				Client.field545 = 2;
			} else {
				if (Client.field545 != 0) {
					class119.drawLoadingMessage(((("Loading - please wait." + ("<br>" + " (")) + 100) + "%") + ")", true);
				}

				MouseHandler.playPcmPlayers();
				FriendSystem.scene.clear();

				for (var1 = 0; var1 < 4; ++var1) {
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var2 = 0; var2 < 104; ++var2) {
						for (var3 = 0; var3 < 104; ++var3) {
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0;
						}
					}
				}

				MouseHandler.playPcmPlayers();
				Tile.method3992();
				var1 = WorldMapSectionType.regionLandArchives.length;
				Players.method2419();
				class286.method5548(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var14;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = ((class123.regions[var2] >> 8) * 64) - ApproximateRouteStrategy.baseX;
						var4 = ((class123.regions[var2] & 255) * 64) - class250.baseY;
						var14 = WorldMapSectionType.regionLandArchives[var2];
						if (var14 != null) {
							MouseHandler.playPcmPlayers();
							ChatChannel.method1991(var14, var3, var4, (class193.field2197 * 8) - 48, (class221.field2647 * 8) - 48, Client.collisionMaps);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = ((class123.regions[var2] >> 8) * 64) - ApproximateRouteStrategy.baseX;
						var4 = ((class123.regions[var2] & 255) * 64) - class250.baseY;
						var14 = WorldMapSectionType.regionLandArchives[var2];
						if ((var14 == null) && (class221.field2647 < 800)) {
							MouseHandler.playPcmPlayers();
							WorldMapEvent.method5136(var3, var4, 64, 64);
						}
					}

					class286.method5548(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var13 = Occluder.regionMapArchives[var2];
						if (var13 != null) {
							var4 = ((class123.regions[var2] >> 8) * 64) - ApproximateRouteStrategy.baseX;
							var5 = ((class123.regions[var2] & 255) * 64) - class250.baseY;
							MouseHandler.playPcmPlayers();
							Canvas.method388(var13, var4, var5, FriendSystem.scene, Client.collisionMaps);
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) {
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) {
						MouseHandler.playPcmPlayers();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								boolean var16 = false;
								var6 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var6 != (-1)) {
									var7 = (var6 >> 24) & 3;
									var8 = (var6 >> 1) & 3;
									var9 = (var6 >> 14) & 1023;
									var10 = (var6 >> 3) & 2047;
									var11 = ((var9 / 8) << 8) + (var10 / 8);

									for (int var12 = 0; var12 < class123.regions.length; ++var12) {
										if ((class123.regions[var12] == var11) && (WorldMapSectionType.regionLandArchives[var12] != null)) {
											WorldMapScaleHandler.method5135(WorldMapSectionType.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, Client.collisionMaps);
											var16 = true;
											break;
										}
									}
								}

								if (!var16) {
									class126.method2820(var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == (-1)) {
								WorldMapEvent.method5136(var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					class286.method5548(true);

					for (var2 = 0; var2 < 4; ++var2) {
						MouseHandler.playPcmPlayers();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != (-1)) {
									var6 = (var5 >> 24) & 3;
									var7 = (var5 >> 1) & 3;
									var8 = (var5 >> 14) & 1023;
									var9 = (var5 >> 3) & 2047;
									var10 = ((var8 / 8) << 8) + (var9 / 8);

									for (var11 = 0; var11 < class123.regions.length; ++var11) {
										if ((class123.regions[var11] == var10) && (Occluder.regionMapArchives[var11] != null)) {
											Tiles.method2006(Occluder.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, FriendSystem.scene, Client.collisionMaps);
											break;
										}
									}
								}
							}
						}
					}
				}

				class286.method5548(true);
				MouseHandler.playPcmPlayers();
				Renderable.method4310(FriendSystem.scene, Client.collisionMaps);
				class286.method5548(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > class160.Client_plane) {
					var2 = class160.Client_plane;
				}

				if (var2 < (class160.Client_plane - 1)) {
					var2 = class160.Client_plane - 1;
				}

				if (Client.isLowDetail) {
					FriendSystem.scene.init(Tiles.Tiles_minPlane);
				} else {
					FriendSystem.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						class162.updateItemPile(var3, var4);
					}
				}

				MouseHandler.playPcmPlayers();
				Projectile.method1957();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var17;
				if (UserComparator10.client.hasFrame()) {
					var17 = ItemContainer.getPacketBufferNode(ClientPacket.field2938, Client.packetWriter.isaacCipher);
					var17.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var17);
				}

				if (!Client.isInInstance) {
					var3 = (class193.field2197 - 6) / 8;
					var4 = (class193.field2197 + 6) / 8;
					var5 = (class221.field2647 - 6) / 8;
					var6 = (class221.field2647 + 6) / 8;

					for (var7 = var3 - 1; var7 <= (var4 + 1); ++var7) {
						for (var8 = var5 - 1; var8 <= (var6 + 1); ++var8) {
							if ((((var7 < var3) || (var7 > var4)) || (var8 < var5)) || (var8 > var6)) {
								class302.archive5.loadRegionFromName((("m" + var7) + "_") + var8);
								class302.archive5.loadRegionFromName((("l" + var7) + "_") + var8);
							}
						}
					}
				}

				InterfaceParent.updateGameState(30);
				MouseHandler.playPcmPlayers();
				ScriptEvent.method2111();
				var17 = ItemContainer.getPacketBufferNode(ClientPacket.field2973, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var17);
				class78.method2098();
			}
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(descriptor = 
	"(IIIIIIII)V", garbageValue = 
	"465119855")

	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if ((((var2 >= 1) && (var3 >= 1)) && (var2 <= 102)) && (var3 <= 102)) {
			if (Client.isLowDetail && (var0 != class160.Client_plane)) {
				return;
			}

			long var7 = 0L;
			boolean var9 = true;
			boolean var10 = false;
			boolean var11 = false;
			if (var1 == 0) {
				var7 = FriendSystem.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) {
				var7 = FriendSystem.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) {
				var7 = FriendSystem.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) {
				var7 = FriendSystem.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (var7 != 0L) {
				var12 = FriendSystem.scene.getObjectFlags(var0, var2, var3, var7);
				int var38 = class121.Entity_unpackID(var7);
				int var39 = var12 & 31;
				int var40 = (var12 >> 6) & 3;
				ObjectComposition var13;
				if (var1 == 0) {
					FriendSystem.scene.removeBoundaryObject(var0, var2, var3);
					var13 = class116.getObjectDefinition(var38);
					if (var13.interactType != 0) {
						Client.collisionMaps[var0].method3843(var2, var3, var39, var40, var13.boolean1);
					}
				}

				if (var1 == 1) {
					FriendSystem.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) {
					FriendSystem.scene.removeGameObject(var0, var2, var3);
					var13 = class116.getObjectDefinition(var38);
					if (((((var2 + var13.sizeX) > 103) || ((var3 + var13.sizeX) > 103)) || ((var2 + var13.sizeY) > 103)) || ((var3 + var13.sizeY) > 103)) {
						return;
					}

					if (var13.interactType != 0) {
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var40, var13.boolean1);
					}
				}

				if (var1 == 3) {
					FriendSystem.scene.removeFloorDecoration(var0, var2, var3);
					var13 = class116.getObjectDefinition(var38);
					if (var13.interactType == 1) {
						Client.collisionMaps[var0].method3846(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var12 = var0;
				if ((var0 < 3) && ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2)) {
					var12 = var0 + 1;
				}

				Scene var41 = FriendSystem.scene;
				CollisionMap var14 = Client.collisionMaps[var0];
				ObjectComposition var15 = class116.getObjectDefinition(var4);
				int var16;
				int var17;
				if ((var5 != 1) && (var5 != 3)) {
					var16 = var15.sizeX;
					var17 = var15.sizeY;
				} else {
					var16 = var15.sizeY;
					var17 = var15.sizeX;
				}

				int var18;
				int var19;
				if ((var16 + var2) <= 104) {
					var18 = (var16 >> 1) + var2;
					var19 = var2 + ((var16 + 1) >> 1);
				} else {
					var18 = var2;
					var19 = var2 + 1;
				}

				int var20;
				int var21;
				if ((var3 + var17) <= 104) {
					var20 = var3 + (var17 >> 1);
					var21 = var3 + ((var17 + 1) >> 1);
				} else {
					var20 = var3;
					var21 = var3 + 1;
				}

				int[][] var22 = Tiles.Tiles_heights[var12];
				int var23 = (((var22[var18][var21] + var22[var19][var20]) + var22[var18][var20]) + var22[var19][var21]) >> 2;
				int var24 = (var2 << 7) + (var16 << 6);
				int var25 = (var3 << 7) + (var17 << 6);
				long var26 = MilliClock.calculateTag(var2, var3, 2, var15.int1 == 0, var4);
				int var28 = (var5 << 6) + var6;
				if (var15.int3 == 1) {
					var28 += 256;
				}

				Object var36;
				if (var6 == 22) {
					if ((var15.animationId == (-1)) && (var15.transforms == null)) {
						var36 = var15.getModel(22, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 22, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
					}

					var41.newFloorDecoration(var0, var2, var3, var23, ((Renderable) (var36)), var26, var28);
					if (var15.interactType == 1) {
						var14.setBlockedByFloorDec(var2, var3);
					}
				} else if ((var6 != 10) && (var6 != 11)) {
					if (var6 >= 12) {
						if ((var15.animationId == (-1)) && (var15.transforms == null)) {
							var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
						}

						var41.method4138(var0, var2, var3, var23, 1, 1, ((Renderable) (var36)), 0, var26, var28);
						if (var15.interactType != 0) {
							var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
						}
					} else if (var6 == 0) {
						if ((var15.animationId == (-1)) && (var15.transforms == null)) {
							var36 = var15.getModel(0, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 0, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
						}

						var41.newBoundaryObject(var0, var2, var3, var23, ((Renderable) (var36)), ((Renderable) (null)), Tiles.field988[var5], 0, var26, var28);
						if (var15.interactType != 0) {
							var14.method3838(var2, var3, var6, var5, var15.boolean1);
						}
					} else if (var6 == 1) {
						if ((var15.animationId == (-1)) && (var15.transforms == null)) {
							var36 = var15.getModel(1, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 1, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
						}

						var41.newBoundaryObject(var0, var2, var3, var23, ((Renderable) (var36)), ((Renderable) (null)), Tiles.field989[var5], 0, var26, var28);
						if (var15.interactType != 0) {
							var14.method3838(var2, var3, var6, var5, var15.boolean1);
						}
					} else {
						int var29;
						if (var6 == 2) {
							var29 = (var5 + 1) & 3;
							Object var31;
							Object var37;
							if ((var15.animationId == (-1)) && (var15.transforms == null)) {
								var37 = var15.getModel(2, var5 + 4, var22, var24, var23, var25);
								var31 = var15.getModel(2, var29, var22, var24, var23, var25);
							} else {
								var37 = new DynamicObject(var4, 2, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
								var31 = new DynamicObject(var4, 2, var29, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
							}

							var41.newBoundaryObject(var0, var2, var3, var23, ((Renderable) (var37)), ((Renderable) (var31)), Tiles.field988[var5], Tiles.field988[var29], var26, var28);
							if (var15.interactType != 0) {
								var14.method3838(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 3) {
							if ((var15.animationId == (-1)) && (var15.transforms == null)) {
								var36 = var15.getModel(3, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 3, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
							}

							var41.newBoundaryObject(var0, var2, var3, var23, ((Renderable) (var36)), ((Renderable) (null)), Tiles.field989[var5], 0, var26, var28);
							if (var15.interactType != 0) {
								var14.method3838(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 9) {
							if ((var15.animationId == (-1)) && (var15.transforms == null)) {
								var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
							}

							var41.method4138(var0, var2, var3, var23, 1, 1, ((Renderable) (var36)), 0, var26, var28);
							if (var15.interactType != 0) {
								var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
							}
						} else if (var6 == 4) {
							if ((var15.animationId == (-1)) && (var15.transforms == null)) {
								var36 = var15.getModel(4, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
							}

							var41.newWallDecoration(var0, var2, var3, var23, ((Renderable) (var36)), ((Renderable) (null)), Tiles.field988[var5], 0, 0, 0, var26, var28);
						} else {
							long var30;
							Object var32;
							if (var6 == 5) {
								var29 = 16;
								var30 = var41.getBoundaryObjectTag(var0, var2, var3);
								if (0L != var30) {
									var29 = class116.getObjectDefinition(class121.Entity_unpackID(var30)).int2;
								}

								if ((var15.animationId == (-1)) && (var15.transforms == null)) {
									var32 = var15.getModel(4, var5, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
								}

								var41.newWallDecoration(var0, var2, var3, var23, ((Renderable) (var32)), ((Renderable) (null)), Tiles.field988[var5], 0, var29 * Tiles.field990[var5], var29 * Tiles.field991[var5], var26, var28);
							} else if (var6 == 6) {
								var29 = 8;
								var30 = var41.getBoundaryObjectTag(var0, var2, var3);
								if (0L != var30) {
									var29 = class116.getObjectDefinition(class121.Entity_unpackID(var30)).int2 / 2;
								}

								if ((var15.animationId == (-1)) && (var15.transforms == null)) {
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
								}

								var41.newWallDecoration(var0, var2, var3, var23, ((Renderable) (var32)), ((Renderable) (null)), 256, var5, var29 * Tiles.field1000[var5], var29 * Tiles.field993[var5], var26, var28);
							} else if (var6 == 7) {
								int var35 = (var5 + 2) & 3;
								if ((var15.animationId == (-1)) && (var15.transforms == null)) {
									var36 = var15.getModel(4, var35 + 4, var22, var24, var23, var25);
								} else {
									var36 = new DynamicObject(var4, 4, var35 + 4, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
								}

								var41.newWallDecoration(var0, var2, var3, var23, ((Renderable) (var36)), ((Renderable) (null)), 256, var35, 0, 0, var26, var28);
							} else if (var6 == 8) {
								var29 = 8;
								var30 = var41.getBoundaryObjectTag(var0, var2, var3);
								if (0L != var30) {
									var29 = class116.getObjectDefinition(class121.Entity_unpackID(var30)).int2 / 2;
								}

								int var34 = (var5 + 2) & 3;
								Object var33;
								if ((var15.animationId == (-1)) && (var15.transforms == null)) {
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
									var33 = var15.getModel(4, var34 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
									var33 = new DynamicObject(var4, 4, var34 + 4, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
								}

								var41.newWallDecoration(var0, var2, var3, var23, ((Renderable) (var32)), ((Renderable) (var33)), 256, var5, var29 * Tiles.field1000[var5], var29 * Tiles.field993[var5], var26, var28);
							}
						}
					}
				} else {
					if ((var15.animationId == (-1)) && (var15.transforms == null)) {
						var36 = var15.getModel(10, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 10, var5, var12, var2, var3, var15.animationId, var15.boolean3, ((Renderable) (null)));
					}

					if (var36 != null) {
						var41.method4138(var0, var2, var3, var23, var16, var17, ((Renderable) (var36)), var6 == 11 ? 256 : 0, var26, var28);
					}

					if (var15.interactType != 0) {
						var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
					}
				}
			}
		}

	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(descriptor = 
	"(Lkn;Lgz;IIZI)V", garbageValue = 
	"-1597453701")

	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions;
		byte var6 = -1;
		String var7 = null;
		if ((var5 != null) && (var5[var3] != null)) {
			if (var3 == 0) {
				var6 = 33;
			} else if (var3 == 1) {
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35;
			} else if (var3 == 3) {
				var6 = 36;
			} else {
				var6 = 37;
			}

			var7 = var5[var3];
		} else if (var3 == 4) {
			var6 = 37;
			var7 = "Drop";
		}

		if ((var6 != (-1)) && (var7 != null)) {
			DynamicObject.insertMenuItem(var7, ChatChannel.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4);
		}

	}
}