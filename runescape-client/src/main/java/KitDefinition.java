import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("KitDefinition_archive")
	public static AbstractArchive KitDefinition_archive;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("KitDefinition_cached")
	public static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("sp")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1514514101
	)
	@Export("bodypartID")
	public int bodypartID;
	@ObfuscatedName("aa")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("at")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ab")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ac")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ao")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ah")
	@Export("models")
	int[] models;
	@ObfuscatedName("av")
	@Export("nonSelectable")
	public boolean nonSelectable;

	static {
		KitDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	KitDefinition() {
		this.bodypartID = -1;
		this.models = new int[]{-1, -1, -1, -1, -1};
		this.nonSelectable = false;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "1860250283"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lua;II)V",
		garbageValue = "1615055212"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.bodypartID = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) {
				var3 = var1.readUnsignedByte();
				this.models2 = new int[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.models2[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) {
				this.nonSelectable = true;
			} else if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3];
				this.recolorTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.recolorFrom[var4] = (short)var1.readUnsignedShort();
					this.recolorTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = (short)var1.readUnsignedShort();
					this.retextureTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 >= 60 && var2 < 70) {
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-66"
	)
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) {
			return true;
		} else {
			boolean var1 = true;

			for (int var2 = 0; var2 < this.models2.length; ++var2) {
				if (!class156.KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}

			return var1;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljb;",
		garbageValue = "1605515774"
	)
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) {
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length];

			for (int var2 = 0; var2 < this.models2.length; ++var2) {
				var1[var2] = ModelData.ModelData_get(class156.KitDefinition_modelsArchive, this.models2[var2], 0);
			}

			ModelData var4;
			if (var1.length == 1) {
				var4 = var1[0];
			} else {
				var4 = new ModelData(var1, var1.length);
			}

			int var3;
			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
				}
			}

			if (this.retextureFrom != null) {
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2026407683"
	)
	public boolean method3874() {
		boolean var1 = true;

		for (int var2 = 0; var2 < 5; ++var2) {
			if (this.models[var2] != -1 && !class156.KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljb;",
		garbageValue = "-938751037"
	)
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5];
		int var2 = 0;

		for (int var3 = 0; var3 < 5; ++var3) {
			if (this.models[var3] != -1) {
				var1[var2++] = ModelData.ModelData_get(class156.KitDefinition_modelsArchive, this.models[var3], 0);
			}
		}

		ModelData var5 = new ModelData(var1, var2);
		int var4;
		if (this.recolorFrom != null) {
			for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
				var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
			}
		}

		if (this.retextureFrom != null) {
			for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
				var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
			}
		}

		return var5;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIZIIB)J",
		garbageValue = "3"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4, int var5) {
		long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17 | ((long)var5 & 2047L) << 49;
		if (var3) {
			var6 |= 65536L;
		}

		return var6;
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-20"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		class13.clear();
		class358.topLevelWorldView.clear();
		Client.field552.method4379();
		System.gc();
		Skills.method7123(0, 0);
		SoundSystem.method851();
		Client.playingJingle = false;
		class151.method3270();
		class105.updateGameState(10);
		Client.serverTick = 0;
		MilliClock.method3646().method3660();
		MilliClock.method3646().method3663();
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(Lmn;I)V",
		garbageValue = "-984863006"
	)
	static final void method3899(class319 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var3;
		int var4;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var23;
		int var24;
		if (class319.field3384 == var0) {
			var23 = var1.readUnsignedByteNeg();
			var3 = (var23 >> 4 & 7) + HttpRequestTask.field96;
			var4 = (var23 & 7) + class323.field3544;
			var24 = var1.readUnsignedByteAdd() & 31;
			var6 = var1.readUnsignedByte();
			var7 = var1.readUnsignedByteNeg();
			var8 = var1.readUnsignedByteAdd();
			var9 = var1.readUnsignedShortLE();
			if (var3 >= 0 && var4 >= 0 && var3 < ModeWhere.worldView.sizeX && var4 < ModeWhere.worldView.sizeY) {
				var10 = var24 + 1;
				if (class17.localPlayer.pathX[0] >= var3 - var10 && class17.localPlayer.pathX[0] <= var3 + var10 && class17.localPlayer.pathY[0] >= var4 - var10 && class17.localPlayer.pathY[0] <= var4 + var10 && class459.clientPreferences.getAreaSoundEffectsVolume() != 0 && var8 > 0 && Client.soundEffectCount < 50) {
					Client.soundEffectIds[Client.soundEffectCount] = var9;
					Client.soundEffects[Client.soundEffectCount] = null;
					Client.soundLocations[Client.soundEffectCount] = var24 + (var4 << 8) + (var3 << 16);
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8;
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = var7;
					Client.field785[Client.soundEffectCount] = var6;
					++Client.soundEffectCount;
				}
			}

		} else {
			int var12;
			int var13;
			int var14;
			int var15;
			if (class319.field3382 == var0) {
				byte var2 = var1.readByteAdd();
				var3 = var1.readUnsignedShortAdd();
				var4 = var1.readUnsignedShortAdd();
				byte var5 = var1.readByteNeg();
				var6 = var1.readUnsignedShortAdd();
				var7 = var1.readUnsignedByte();
				var8 = var7 >> 2;
				var9 = var7 & 3;
				var10 = Client.field604[var8];
				byte var11 = var1.readByteSub();
				var12 = var1.readUnsignedByteAdd();
				var13 = (var12 >> 4 & 7) + HttpRequestTask.field96;
				var14 = (var12 & 7) + class323.field3544;
				var15 = var1.readUnsignedShortAddLE();
				byte var16 = var1.readByteAdd();
				Player var17;
				if (var15 == Client.localPlayerIndex) {
					var17 = class17.localPlayer;
				} else {
					var17 = ModeWhere.worldView.players[var15];
				}

				if (var17 != null) {
					int var18 = Client.field753 == -1 ? ModeWhere.worldView.plane : Client.field753;
					class142.method3197(var18, var13, var14, var8, var9, var10, var3, var6, var4, var5, var11, var2, var16, var17);
				}
			}

			int var27;
			if (class319.field3375 == var0) {
				var23 = var1.readUnsignedByte();
				var3 = var1.readUnsignedByteAdd();
				var4 = (var3 >> 4 & 7) + HttpRequestTask.field96;
				var24 = (var3 & 7) + class323.field3544;
				var6 = var1.readUnsignedByteAdd();
				var7 = var6 >> 2;
				var8 = var6 & 3;
				var9 = Client.field604[var7];
				var10 = var1.readUnsignedShortAdd();
				if (var4 >= 0 && var24 >= 0 && var4 < ModeWhere.worldView.sizeX && var24 < ModeWhere.worldView.sizeY) {
					var27 = Client.field753 == -1 ? ModeWhere.worldView.plane : Client.field753;
					class162.method3417(ModeWhere.worldView, var27, var4, var24, var9, var10, var7, var8, var23, 0, -1);
				}

			} else if (class319.field3378 == var0) {
				var23 = var1.readUnsignedShort();
				var3 = var1.readUnsignedByteAdd();
				var4 = (var3 >> 4 & 7) + HttpRequestTask.field96;
				var24 = (var3 & 7) + class323.field3544;
				var6 = var1.readUnsignedByteNeg();
				var7 = var6 >> 2;
				var8 = var6 & 3;
				var9 = Client.field604[var7];
				if (var4 >= 0 && var24 >= 0 && var4 < 103 && var24 < 103) {
					var10 = Client.field753 == -1 ? ModeWhere.worldView.plane : Client.field753;
					PendingSpawn var21 = class177.method3603(ModeWhere.worldView, var10, var4, var24, var9);
					if (var21 != null) {
						ObjectComposition var22 = HitSplatDefinition.getObjectDefinition(var21.field1193);
						if (var22.field2315) {
							var21.field1190 = var23;
							return;
						}
					}

					boolean var28 = class59.method1147(var10, var4, var24, var7, var8, var9, var23);
					if (var28) {
						return;
					}

					if (var21 != null) {
						var21.field1190 = var23;
					}
				}

			} else if (class319.field3379 == var0) {
				var23 = var1.readUnsignedShortLE();
				var3 = var1.readUnsignedShort();
				var4 = var1.method9313();
				var24 = var1.readUnsignedByteSub();
				var6 = var1.readUnsignedByteSub() * 4;
				byte var26 = var1.readByteNeg();
				var8 = var1.method9313();
				var9 = var1.readUnsignedByteNeg();
				var10 = (var9 >> 4 & 7) + HttpRequestTask.field96;
				var27 = (var9 & 7) + class323.field3544;
				var12 = var1.readUnsignedByteNeg() * 4;
				var13 = var1.readUnsignedShort();
				var14 = var1.readUnsignedShort();
				byte var29 = var1.readByte();
				var7 = var26 + var10;
				var15 = var29 + var27;
				if (var10 >= 0 && var27 >= 0 && var10 < ModeWhere.worldView.sizeX && var27 < ModeWhere.worldView.sizeY && var7 >= 0 && var15 >= 0 && var7 < ModeWhere.worldView.sizeX && var15 < ModeWhere.worldView.sizeY && var3 != 65535) {
					int var30 = Client.field753 == -1 ? ModeWhere.worldView.plane : Client.field753;
					WorldMapEvent.method6096(var30, var10, var27, var7, var15, var4, var3, var6, var12, var14, var13, var24, var23, var8);
				}

			} else if (class319.field3383 == var0) {
				var23 = var1.readUnsignedByteSub();
				var3 = (var23 >> 4 & 7) + HttpRequestTask.field96;
				var4 = (var23 & 7) + class323.field3544;
				var24 = var1.readUnsignedIntME();
				var6 = var1.readUnsignedShortAddLE();
				var7 = var1.readUnsignedIntME();
				if (var3 >= 0 && var4 >= 0 && var3 < ModeWhere.worldView.sizeX && var4 < ModeWhere.worldView.sizeY) {
					var8 = Client.field753 == -1 ? ModeWhere.worldView.plane : Client.field753;
					class136.method3128(var8, var3, var4, var6, var7, var24);
				}

			} else {
				if (class319.field3387 == var0) {
					var23 = var1.readUnsignedShort();
					var3 = var1.readUnsignedByteNeg();
					var4 = var1.readUnsignedByteAdd();
					var24 = (var4 >> 4 & 7) + HttpRequestTask.field96;
					var6 = (var4 & 7) + class323.field3544;
					var7 = ModeWhere.worldView.plane;
					if (var24 >= 0 && var6 >= 0 && var24 < ModeWhere.worldView.sizeX && var6 < ModeWhere.worldView.sizeY) {
						NodeDeque var19 = ModeWhere.worldView.groundItems[var7][var24][var6];
						if (var19 != null) {
							for (TileItem var31 = (TileItem)var19.last(); var31 != null; var31 = (TileItem)var19.previous()) {
								if ((var23 & 32767) == var31.id) {
									var31.setFlag(var3);
									break;
								}
							}
						}

						if (var24 >= 0 && var6 >= 0 && var24 < ModeWhere.worldView.sizeX && var6 < ModeWhere.worldView.sizeY) {
							var9 = Client.field753 == -1 ? ModeWhere.worldView.plane : Client.field753;
							class140.method3146(var9, var24, var6, var23, var3);
						}

						return;
					}
				}

				if (class319.field3377 == var0) {
					var23 = var1.readUnsignedShort();
					var3 = var1.readUnsignedShortAdd();
					var4 = var1.readUnsignedIntLE();
					var24 = var1.readUnsignedShortAdd();
					var6 = var1.readUnsignedByte();
					boolean var25 = var1.readUnsignedByte() == 1;
					var8 = var1.readUnsignedByteSub();
					var9 = (var8 >> 4 & 7) + HttpRequestTask.field96;
					var10 = (var8 & 7) + class323.field3544;
					var27 = var1.readUnsignedByteSub();
					if (var9 >= 0 && var10 >= 0 && var9 < ModeWhere.worldView.sizeX && var10 < ModeWhere.worldView.sizeY) {
						var12 = Client.field753 == -1 ? ModeWhere.worldView.plane : Client.field753;
						WorldMapID.addTileItemToGroundItems(var12, var9, var10, var24, var4, var27, var23, var3, var6, var25);
					}

				} else if (class319.field3380 == var0) {
					var23 = var1.readUnsignedByteNeg();
					var3 = var23 >> 2;
					var4 = var23 & 3;
					var24 = Client.field604[var3];
					var6 = var1.readUnsignedByte();
					var7 = (var6 >> 4 & 7) + HttpRequestTask.field96;
					var8 = (var6 & 7) + class323.field3544;
					if (var7 >= 0 && var8 >= 0 && var7 < ModeWhere.worldView.sizeX && var8 < ModeWhere.worldView.sizeY) {
						var9 = Client.field753 == -1 ? ModeWhere.worldView.plane : Client.field753;
						class162.method3417(ModeWhere.worldView, var9, var7, var8, var24, -1, var3, var4, 31, 0, -1);
					}

				} else if (class319.field3388 == var0) {
					var23 = var1.readUnsignedByteSub();
					var3 = (var23 >> 4 & 7) + HttpRequestTask.field96;
					var4 = (var23 & 7) + class323.field3544;
					var24 = var1.readUnsignedShortLE();
					var6 = var1.readUnsignedByteSub();
					var7 = var1.readUnsignedShort();
					if (var3 >= 0 && var4 >= 0 && var3 < ModeWhere.worldView.sizeX && var4 < ModeWhere.worldView.sizeY) {
						var3 = var3 * 128 + 64;
						var4 = var4 * 128 + 64;
						var8 = Client.field753 == -1 ? ModeWhere.worldView.plane : Client.field753;
						GraphicsObject var20 = new GraphicsObject(var24, var8, var3, var4, SoundSystem.getTileHeight(ModeWhere.worldView, var3, var4, var8) - var6, var7, Client.cycle);
						ModeWhere.worldView.graphicsObjects.addFirst(var20);
					}

				} else if (class319.field3385 == var0) {
					var23 = var1.readUnsignedByteSub();
					var3 = (var23 >> 4 & 7) + HttpRequestTask.field96;
					var4 = (var23 & 7) + class323.field3544;
					var24 = var1.readUnsignedIntME();
					var6 = var1.readUnsignedShortAddLE();
					var7 = ModeWhere.worldView.plane;
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
						var8 = Client.field753 == -1 ? var7 : Client.field753;
						Coord.method6523(var8, var3, var4, var6, var24);
					}

				}
			}
		}
	}

	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "(IB)Lum;",
		garbageValue = "55"
	)
	static DbTable method3898(int var0) {
		DbTable var1 = (DbTable)Client.archive11.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(HealthBar.field1357, var0);
		}

		return var1;
	}
}
