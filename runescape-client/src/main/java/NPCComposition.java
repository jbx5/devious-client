import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Llq;")

	@Export("NpcDefinition_archive")
	static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Llq;")

	@Export("NpcDefinition_modelArchive")
	static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Liq;")

	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Liq;")

	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("fx")
	static int[] field1918;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-2143016853)

	@Export("id")
	public int id;
	@ObfuscatedName("n")
	@Export("name")
	public String name;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	1363241301)

	@Export("size")
	public int size;
	@ObfuscatedName("f")
	@Export("models")
	int[] models;
	@ObfuscatedName("u")
	int[] field1941;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	-174401589)

	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	-1489915603)

	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 
	1943936215)

	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	-15491073)

	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 
	159519197)

	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 
	238467661)

	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	-49692117)

	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("b")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("w")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("a")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("m")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("q")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("y")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 
	-2021557183)

	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 
	-674598947)

	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 
	-2097500577)

	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("i")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(intValue = 
	2003503301)

	@Export("ambient")
	int ambient;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(intValue = 
	-1146245031)

	@Export("contrast")
	int contrast;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(intValue = 
	1820418945)

	@Export("headIconPrayer")
	public int headIconPrayer;
	@ObfuscatedName("au")
	@ObfuscatedGetter(intValue = 
	-934703889)

	@Export("rotation")
	public int rotation;
	@ObfuscatedName("at")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(intValue = 
	-1879234601)

	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(intValue = 
	-1792687465)

	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("ae")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("ab")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("aa")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = 
	"Lpq;")

	@Export("params")
	IterableNodeHashTable params;
	static 
	{
		NpcDefinition_cached = new EvictingDualNodeHashTable(64);
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50);
	}

	NPCComposition() {
		this.name = "null";
		this.size = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.actions = new String[5];
		this.drawMapDot = true;
		this.combatLevel = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.isVisible = false;
		this.ambient = 0;
		this.contrast = 0;
		this.headIconPrayer = -1;
		this.rotation = 32;
		this.transformVarbit = -1;
		this.transformVarp = -1;
		this.isInteractable = true;
		this.isClickable = true;
		this.isFollower = false;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(S)V", garbageValue = 
	"8806")

	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;B)V", garbageValue = 
	"26")

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

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;II)V", garbageValue = 
	"345201372")

	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedByte();
			this.models = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.models[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 12) {
			this.size = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.idleSequence = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.walkSequence = var1.readUnsignedShort();
		} else if (var2 == 15) {
			this.turnLeftSequence = var1.readUnsignedShort();
		} else if (var2 == 16) {
			this.turnRightSequence = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.walkSequence = var1.readUnsignedShort();
			this.walkBackSequence = var1.readUnsignedShort();
			this.walkLeftSequence = var1.readUnsignedShort();
			this.walkRightSequence = var1.readUnsignedShort();
		} else if (var2 == 18) {
			var1.readUnsignedShort();
		} else if ((var2 >= 30) && (var2 < 35)) {
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var3 = var1.readUnsignedByte();
			this.recolorFrom = new short[var3];
			this.recolorTo = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.recolorFrom[var4] = ((short) (var1.readUnsignedShort()));
				this.recolorTo[var4] = ((short) (var1.readUnsignedShort()));
			}
		} else if (var2 == 41) {
			var3 = var1.readUnsignedByte();
			this.retextureFrom = new short[var3];
			this.retextureTo = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.retextureFrom[var4] = ((short) (var1.readUnsignedShort()));
				this.retextureTo[var4] = ((short) (var1.readUnsignedShort()));
			}
		} else if (var2 == 60) {
			var3 = var1.readUnsignedByte();
			this.field1941 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field1941[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 93) {
			this.drawMapDot = false;
		} else if (var2 == 95) {
			this.combatLevel = var1.readUnsignedShort();
		} else if (var2 == 97) {
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 98) {
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 99) {
			this.isVisible = true;
		} else if (var2 == 100) {
			this.ambient = var1.readByte();
		} else if (var2 == 101) {
			this.contrast = var1.readByte() * 5;
		} else if (var2 == 102) {
			this.headIconPrayer = var1.readUnsignedShort();
		} else if (var2 == 103) {
			this.rotation = var1.readUnsignedShort();
		} else if ((var2 != 106) && (var2 != 118)) {
			if (var2 == 107) {
				this.isInteractable = false;
			} else if (var2 == 109) {
				this.isClickable = false;
			} else if (var2 == 111) {
				this.isFollower = true;
			} else if (var2 == 249) {
				this.params = NetFileRequest.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}

			var3 = -1;
			if (var2 == 118) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Lgg;ILgg;II)Lhx;", garbageValue = 
	"-1552465915")

	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.transforms != null) {
			NPCComposition var12 = this.transform();
			return var12 == null ? null : var12.getModel(var1, var2, var3, var4);
		} else {
			Model var5 = ((Model) (NpcDefinition_cachedModels.get(((long) (this.id)))));
			if (var5 == null) {
				boolean var6 = false;

				for (int var7 = 0; var7 < this.models.length; ++var7) {
					if (!NpcDefinition_modelArchive.tryLoadFile(this.models[var7], 0)) {
						var6 = true;
					}
				}

				if (var6) {
					return null;
				}

				ModelData[] var8 = new ModelData[this.models.length];

				int var9;
				for (var9 = 0; var9 < this.models.length; ++var9) {
					var8[var9] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.models[var9], 0);
				}

				ModelData var10;
				if (var8.length == 1) {
					var10 = var8[0];
				} else {
					var10 = new ModelData(var8, var8.length);
				}

				if (this.recolorFrom != null) {
					for (var9 = 0; var9 < this.recolorFrom.length; ++var9) {
						var10.recolor(this.recolorFrom[var9], this.recolorTo[var9]);
					}
				}

				if (this.retextureFrom != null) {
					for (var9 = 0; var9 < this.retextureFrom.length; ++var9) {
						var10.retexture(this.retextureFrom[var9], this.retextureTo[var9]);
					}
				}

				var5 = var10.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
				NpcDefinition_cachedModels.put(var5, ((long) (this.id)));
			}

			Model var11;
			if ((var1 != null) && (var3 != null)) {
				var11 = var1.applyTransformations(var5, var2, var3, var4);
			} else if (var1 != null) {
				var11 = var1.transformActorModel(var5, var2);
			} else if (var3 != null) {
				var11 = var3.transformActorModel(var5, var4);
			} else {
				var11 = var5.toSharedSequenceModel(true);
			}

			if ((this.widthScale != 128) || (this.heightScale != 128)) {
				var11.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var11;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(I)Lgt;", garbageValue = 
	"-1424786403")

	@Export("getModelData")
	public final ModelData getModelData() {
		if (this.transforms != null) {
			NPCComposition var7 = this.transform();
			return var7 == null ? null : var7.getModelData();
		} else if (this.field1941 == null) {
			return null;
		} else {
			boolean var1 = false;

			for (int var2 = 0; var2 < this.field1941.length; ++var2) {
				if (!NpcDefinition_modelArchive.tryLoadFile(this.field1941[var2], 0)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			} else {
				ModelData[] var5 = new ModelData[this.field1941.length];

				for (int var3 = 0; var3 < this.field1941.length; ++var3) {
					var5[var3] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.field1941[var3], 0);
				}

				ModelData var6;
				if (var5.length == 1) {
					var6 = var5[0];
				} else {
					var6 = new ModelData(var5, var5.length);
				}

				int var4;
				if (this.recolorFrom != null) {
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
					}
				}

				if (this.retextureFrom != null) {
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
					}
				}

				return var6;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)Lfj;", garbageValue = 
	"1331074811")

	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != (-1)) {
			var1 = WorldMapRegion.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != (-1)) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if ((var1 >= 0) && (var1 < (this.transforms.length - 1))) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != (-1) ? class9.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"-5")

	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != (-1)) {
				var1 = WorldMapRegion.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != (-1)) {
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if ((var1 >= 0) && (var1 < this.transforms.length)) {
				return this.transforms[var1] != (-1);
			} else {
				return this.transforms[this.transforms.length - 1] != (-1);
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(III)I", garbageValue = 
	"-1070953519")

	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return ClanSettings.method2976(this.params, var1, var2);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(ILjava/lang/String;I)Ljava/lang/String;", garbageValue = 
	"-777122666")

	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class19.method315(this.params, var1, var2);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(Lpy;I)I", garbageValue = 
	"1149580844")

	static int method3491(PacketBuffer var0) {
		int var1 = var0.readBits(2);
		int var2;
		if (var1 == 0) {
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.readBits(5);
		} else if (var1 == 2) {
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11);
		}

		return var2;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(Llq;Ljava/lang/String;Ljava/lang/String;I)Lqx;", garbageValue = 
	"342414454")

	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		return class16.method218(var0, var3, var4);
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(descriptor = 
	"(Lcx;IIII)V", garbageValue = 
	"527518202")

	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition;
		if (Client.menuOptionsCount < 400) {
			if (var4.transforms != null) {
				var4 = var4.transform();
			}

			if (var4 != null) {
				if (var4.isInteractable) {
					if ((!var4.isFollower) || (Client.followerIndex == var1)) {
						String var5 = var4.name;
						int var6;
						int var9;
						if ((var4.combatLevel != 0) && (var0.field1161 != 0)) {
							var6 = (var0.field1161 != (-1)) ? (var0.field1161 * (-1966879477)) * (-544172381) : (var4.combatLevel * (-2021557183)) * (-620194879);
							var9 = class19.localPlayer.combatLevel;
							int var10 = var9 - var6;
							String var8;
							if (var10 < (-9)) {
								var8 = ChatChannel.colorStartTag(16711680);
							} else if (var10 < (-6)) {
								var8 = ChatChannel.colorStartTag(16723968);
							} else if (var10 < (-3)) {
								var8 = ChatChannel.colorStartTag(16740352);
							} else if (var10 < 0) {
								var8 = ChatChannel.colorStartTag(16756736);
							} else if (var10 > 9) {
								var8 = ChatChannel.colorStartTag(65280);
							} else if (var10 > 6) {
								var8 = ChatChannel.colorStartTag(4259584);
							} else if (var10 > 3) {
								var8 = ChatChannel.colorStartTag(8453888);
							} else if (var10 > 0) {
								var8 = ChatChannel.colorStartTag(12648192);
							} else {
								var8 = ChatChannel.colorStartTag(16776960);
							}

							var5 = (((((var5 + var8) + " ") + " (") + "level-") + var6) + ")";
						}

						if (var4.isFollower && Client.followerOpsLowPriority) {
							SecureRandomFuture.insertMenuItemNoShift("Examine", ChatChannel.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
						}

						if (Client.isItemSelected == 1) {
							SecureRandomFuture.insertMenuItemNoShift("Use", ((((Client.selectedItemName + " ") + "->") + " ") + ChatChannel.colorStartTag(16776960)) + var5, 7, var1, var2, var3);
						} else if (Client.isSpellSelected) {
							if ((class154.selectedSpellFlags & 2) == 2) {
								SecureRandomFuture.insertMenuItemNoShift(Client.selectedSpellActionName, ((((Client.selectedSpellName + " ") + "->") + " ") + ChatChannel.colorStartTag(16776960)) + var5, 8, var1, var2, var3);
							}
						} else {
							var6 = (var4.isFollower && Client.followerOpsLowPriority) ? 2000 : 0;
							String[] var7 = var4.actions;
							int var11;
							if (var7 != null) {
								for (var11 = 4; var11 >= 0; --var11) {
									if ((var7[var11] != null) && (!var7[var11].equalsIgnoreCase("Attack"))) {
										var9 = 0;
										if (var11 == 0) {
											var9 = var6 + 9;
										}

										if (var11 == 1) {
											var9 = var6 + 10;
										}

										if (var11 == 2) {
											var9 = var6 + 11;
										}

										if (var11 == 3) {
											var9 = var6 + 12;
										}

										if (var11 == 4) {
											var9 = var6 + 13;
										}

										SecureRandomFuture.insertMenuItemNoShift(var7[var11], ChatChannel.colorStartTag(16776960) + var5, var9, var1, var2, var3);
									}
								}
							}

							if (var7 != null) {
								for (var11 = 4; var11 >= 0; --var11) {
									if ((var7[var11] != null) && var7[var11].equalsIgnoreCase("Attack")) {
										short var12 = 0;
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) {
											if ((Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick) || ((AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption) && (var4.combatLevel > class19.localPlayer.combatLevel))) {
												var12 = 2000;
											}

											var9 = 0;
											if (var11 == 0) {
												var9 = var12 + 9;
											}

											if (var11 == 1) {
												var9 = var12 + 10;
											}

											if (var11 == 2) {
												var9 = var12 + 11;
											}

											if (var11 == 3) {
												var9 = var12 + 12;
											}

											if (var11 == 4) {
												var9 = var12 + 13;
											}

											SecureRandomFuture.insertMenuItemNoShift(var7[var11], ChatChannel.colorStartTag(16776960) + var5, var9, var1, var2, var3);
										}
									}
								}
							}

							if ((!var4.isFollower) || (!Client.followerOpsLowPriority)) {
								SecureRandomFuture.insertMenuItemNoShift("Examine", ChatChannel.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
							}
						}

					}
				}
			}
		}
	}
}