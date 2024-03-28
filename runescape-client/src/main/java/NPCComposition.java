import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2114128667
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ab")
	@Export("name")
	public String name;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1152725665
	)
	@Export("size")
	public int size;
	@ObfuscatedName("ad")
	@Export("models")
	int[] models;
	@ObfuscatedName("al")
	int[] field2109;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2133671945
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1451260513
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -765841053
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1314204327
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -480607591
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -559690763
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1082802681
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 66866733
	)
	public int field2117;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 757679103
	)
	public int field2105;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -881297567
	)
	public int field2119;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1895679495
	)
	public int field2111;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2126142001
	)
	public int field2121;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 430126441
	)
	public int field2122;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1118043759
	)
	public int field2123;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -696029733
	)
	public int field2124;
	@ObfuscatedName("ak")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bp")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bz")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bc")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bf")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("be")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -917072141
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1049106863
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1466311325
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("bx")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1120914791
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 57820681
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -828178871
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("bj")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1201406899
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1292070679
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bb")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("by")
	@Export("isClipped")
	public boolean isClipped;
	@ObfuscatedName("bk")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bt")
	@Export("lowPriorityFollowerOps")
	public boolean lowPriorityFollowerOps;
	@ObfuscatedName("bq")
	@Export("headIconArchiveIds")
	int[] headIconArchiveIds;
	@ObfuscatedName("bi")
	@Export("headIconSpriteIndex")
	short[] headIconSpriteIndex;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
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
		this.field2117 = -1;
		this.field2105 = -1;
		this.field2119 = -1;
		this.field2111 = -1;
		this.field2121 = -1;
		this.field2122 = -1;
		this.field2123 = -1;
		this.field2124 = -1;
		this.actions = new String[5];
		this.drawMapDot = true;
		this.combatLevel = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.isVisible = false;
		this.ambient = 0;
		this.contrast = 0;
		this.rotation = 32;
		this.transformVarbit = -1;
		this.transformVarp = -1;
		this.isInteractable = true;
		this.isClipped = true;
		this.isFollower = false;
		this.lowPriorityFollowerOps = false;
		this.headIconArchiveIds = null;
		this.headIconSpriteIndex = null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "701718067"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1708679572"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "-522079210"
	)
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
		} else if (var2 >= 30 && var2 < 35) {
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.actions[var2 - 30] = null;
			}
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
		} else if (var2 == 60) {
			var3 = var1.readUnsignedByte();
			this.field2109 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2109[var4] = var1.readUnsignedShort();
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
		} else {
			int var5;
			if (var2 == 102) {
				var3 = var1.readUnsignedByte();
				var4 = 0;

				for (var5 = var3; var5 != 0; var5 >>= 1) {
					++var4;
				}

				this.headIconArchiveIds = new int[var4];
				this.headIconSpriteIndex = new short[var4];

				for (int var6 = 0; var6 < var4; ++var6) {
					if ((var3 & 1 << var6) == 0) {
						this.headIconArchiveIds[var6] = -1;
						this.headIconSpriteIndex[var6] = -1;
					} else {
						this.headIconArchiveIds[var6] = var1.readNullableLargeSmart();
						this.headIconSpriteIndex[var6] = (short)var1.readShortSmartSub();
					}
				}
			} else if (var2 == 103) {
				this.rotation = var1.readUnsignedShort();
			} else if (var2 != 106 && var2 != 118) {
				if (var2 == 107) {
					this.isInteractable = false;
				} else if (var2 == 109) {
					this.isClipped = false;
				} else if (var2 == 114) {
					this.field2117 = var1.readUnsignedShort();
				} else if (var2 == 115) {
					this.field2117 = var1.readUnsignedShort();
					this.field2105 = var1.readUnsignedShort();
					this.field2119 = var1.readUnsignedShort();
					this.field2111 = var1.readUnsignedShort();
				} else if (var2 == 116) {
					this.field2121 = var1.readUnsignedShort();
				} else if (var2 == 117) {
					this.field2121 = var1.readUnsignedShort();
					this.field2122 = var1.readUnsignedShort();
					this.field2123 = var1.readUnsignedShort();
					this.field2124 = var1.readUnsignedShort();
				} else if (var2 == 122) {
					this.isFollower = true;
				} else if (var2 == 123) {
					this.lowPriorityFollowerOps = true;
				} else if (var2 == 249) {
					this.params = SecureRandomFuture.readStringIntParameters(var1, this.params);
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

				for (var5 = 0; var5 <= var4; ++var5) {
					this.transforms[var5] = var1.readUnsignedShort();
					if (this.transforms[var5] == 65535) {
						this.transforms[var5] = -1;
					}
				}

				this.transforms[var4 + 1] = var3;
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lig;ILig;ILhg;I)Ljn;",
		garbageValue = "1883741450"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NpcOverrides var5) {
		if (this.transforms != null) {
			NPCComposition var10 = this.transform();
			return var10 == null ? null : var10.getModel(var1, var2, var3, var4, var5);
		} else {
			long var6 = (long)this.id;
			if (var5 != null) {
				var6 |= var5.field2101 << 16;
			}

			Model var8 = (Model)NpcDefinition_cachedModels.get(var6);
			if (var8 == null) {
				ModelData var9 = this.getModelData(this.models, var5);
				if (var9 == null) {
					return null;
				}

				var8 = var9.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
				NpcDefinition_cachedModels.put(var8, var6);
			}

			Model var11;
			if (var1 != null && var3 != null) {
				var11 = var1.applyTransformations(var8, var2, var3, var4);
			} else if (var1 != null) {
				var11 = var1.transformActorModel(var8, var2);
			} else if (var3 != null) {
				var11 = var3.transformActorModel(var8, var4);
			} else {
				var11 = var8.toSharedSequenceModel(true);
			}

			if (this.widthScale != 128 || this.heightScale != 128) {
				var11.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var11;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lhg;I)Ljj;",
		garbageValue = "-1471968864"
	)
	public final ModelData method3864(NpcOverrides var1) {
		if (this.transforms != null) {
			NPCComposition var2 = this.transform();
			return var2 == null ? null : var2.method3864(var1);
		} else {
			return this.getModelData(this.field2109, var1);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([ILhg;B)Ljj;",
		garbageValue = "-90"
	)
	@Export("getModelData")
	ModelData getModelData(int[] var1, NpcOverrides var2) {
		int[] var3 = var1;
		if (var2 != null && var2.modelIds != null) {
			var3 = var2.modelIds;
		}

		if (var3 == null) {
			return null;
		} else {
			boolean var4 = false;

			for (int var5 = 0; var5 < var3.length; ++var5) {
				if (var3[var5] != -1 && !Decimator.field395.tryLoadFile(var3[var5], 0)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				ModelData[] var9 = new ModelData[var3.length];

				for (int var6 = 0; var6 < var3.length; ++var6) {
					var9[var6] = ModelData.ModelData_get(Decimator.field395, var3[var6], 0);
				}

				ModelData var10;
				if (var9.length == 1) {
					var10 = var9[0];
					if (var10 == null) {
						var10 = new ModelData(var9, var9.length);
					}
				} else {
					var10 = new ModelData(var9, var9.length);
				}

				short[] var7;
				int var8;
				if (this.recolorFrom != null) {
					var7 = this.recolorTo;
					if (var2 != null && var2.recolorTo != null) {
						var7 = var2.recolorTo;
					}

					for (var8 = 0; var8 < this.recolorFrom.length; ++var8) {
						var10.recolor(this.recolorFrom[var8], var7[var8]);
					}
				}

				if (this.retextureFrom != null) {
					var7 = this.retextureTo;
					if (var2 != null && var2.retextureTo != null) {
						var7 = var2.retextureTo;
					}

					for (var8 = 0; var8 < this.retextureFrom.length; ++var8) {
						var10.retexture(this.retextureFrom[var8], var7[var8]);
					}
				}

				return var10;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lhk;",
		garbageValue = "-1693142084"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = SpotAnimationDefinition.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? UserComparator10.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-553260736"
	)
	public final int method3867() {
		if (this.transforms != null) {
			NPCComposition var1 = this.transform();
			if (var1 != null) {
				return var1.id;
			}
		}

		return -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "30"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = SpotAnimationDefinition.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) {
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) {
				return this.transforms[var1] != -1;
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "-9709"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return Sound.method4074(this.params, var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1401164265"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class27.method400(this.params, var1, var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "7"
	)
	public boolean method3871() {
		return this.headIconArchiveIds != null && this.headIconSpriteIndex != null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-20"
	)
	public int[] method3872() {
		return this.headIconArchiveIds;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1991102401"
	)
	public int method3877(int var1) {
		return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-658649455"
	)
	public short[] method3874() {
		return this.headIconSpriteIndex;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)S",
		garbageValue = "-1579620841"
	)
	public short method3890(int var1) {
		return this.headIconSpriteIndex != null && var1 < this.headIconSpriteIndex.length ? this.headIconSpriteIndex[var1] : -1;
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1682223487"
	)
	static void method3903() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;

		for (int var2 = 0; var2 < var0; ++var2) {
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) {
				class167.addPlayerToScene(Client.players[var1[var2]], true);
			}
		}

	}
}
