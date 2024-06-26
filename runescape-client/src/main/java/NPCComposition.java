import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	public static AbstractArchive field1985;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = -1562550201
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2009531171
	)
	@Export("id")
	public int id;
	@ObfuscatedName("aj")
	@Export("name")
	public String name;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1973900023
	)
	@Export("size")
	public int size;
	@ObfuscatedName("ab")
	@Export("models")
	int[] models;
	@ObfuscatedName("ai")
	int[] field1992;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 478583057
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1539012287
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -206631735
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1926993693
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -545327657
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 798328077
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -70046247
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 608377993
	)
	public int field2000;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 37745465
	)
	public int field2006;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1117893463
	)
	public int field2002;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1500665669
	)
	public int field2029;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1300492197
	)
	public int field2004;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1571755443
	)
	public int field2005;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1490450937
	)
	public int field2011;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1165099135
	)
	public int field2007;
	@ObfuscatedName("ar")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bt")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bj")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("be")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bm")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bo")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1316122047
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1126463291
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 204475581
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("bs")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 966241915
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -2012644261
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 2046397449
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("by")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1985607835
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -814500775
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bc")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("bv")
	@Export("isClipped")
	public boolean isClipped;
	@ObfuscatedName("bb")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bn")
	@Export("lowPriorityFollowerOps")
	public boolean lowPriorityFollowerOps;
	@ObfuscatedName("bh")
	@Export("headIconArchiveIds")
	int[] headIconArchiveIds;
	@ObfuscatedName("bq")
	@Export("headIconSpriteIndex")
	short[] headIconSpriteIndex;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -720142033
	)
	public int field2030;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bk")
	int[] field2032;

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
		this.field2000 = -1;
		this.field2006 = -1;
		this.field2002 = -1;
		this.field2029 = -1;
		this.field2004 = -1;
		this.field2005 = -1;
		this.field2011 = -1;
		this.field2007 = -1;
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
		this.field2030 = -1;
		this.field2032 = new int[]{1, 1, 1, 1, 1, 1};
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1954284404"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-1048876932"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;IS)V",
		garbageValue = "-13603"
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
			this.field1992 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field1992[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 74) {
			this.field2032[0] = var1.readUnsignedShort();
		} else if (var2 == 75) {
			this.field2032[1] = var1.readUnsignedShort();
		} else if (var2 == 76) {
			this.field2032[2] = var1.readUnsignedShort();
		} else if (var2 == 77) {
			this.field2032[3] = var1.readUnsignedShort();
		} else if (var2 == 78) {
			this.field2032[4] = var1.readUnsignedShort();
		} else if (var2 == 79) {
			this.field2032[5] = var1.readUnsignedShort();
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
			this.contrast = var1.readByte();
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
					this.field2000 = var1.readUnsignedShort();
				} else if (var2 == 115) {
					this.field2000 = var1.readUnsignedShort();
					this.field2006 = var1.readUnsignedShort();
					this.field2002 = var1.readUnsignedShort();
					this.field2029 = var1.readUnsignedShort();
				} else if (var2 == 116) {
					this.field2004 = var1.readUnsignedShort();
				} else if (var2 == 117) {
					this.field2004 = var1.readUnsignedShort();
					this.field2005 = var1.readUnsignedShort();
					this.field2011 = var1.readUnsignedShort();
					this.field2007 = var1.readUnsignedShort();
				} else if (var2 == 122) {
					this.isFollower = true;
				} else if (var2 == 123) {
					this.lowPriorityFollowerOps = true;
				} else if (var2 == 124) {
					this.field2030 = var1.readUnsignedShort();
				} else if (var2 == 249) {
					this.params = AttackOption.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lii;ILii;ILhh;I)Llv;",
		garbageValue = "1852669233"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NpcOverrides var5) {
		if (this.transforms != null) {
			NPCComposition var10 = this.transform();
			return var10 == null ? null : var10.getModel(var1, var2, var3, var4, var5);
		} else {
			long var6 = (long)this.id;
			if (var5 != null) {
				var6 |= var5.field1981 << 16;
			}

			Model var8 = (Model)NpcDefinition_cachedModels.get(var6);
			if (var8 == null) {
				ModelData var9 = this.getModelData(this.models, var5);
				if (var9 == null) {
					return null;
				}

				var8 = var9.toModel(this.ambient + 64, this.contrast * 5 + 850, -30, -50, -30);
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lhh;I)Lkr;",
		garbageValue = "-998465275"
	)
	public final ModelData method3706(NpcOverrides var1) {
		if (this.transforms != null) {
			NPCComposition var2 = this.transform();
			return var2 == null ? null : var2.method3706(var1);
		} else {
			return this.getModelData(this.field1992, var1);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([ILhh;I)Lkr;",
		garbageValue = "630131586"
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
				if (var3[var5] != -1 && !field1985.tryLoadFile(var3[var5], 0)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				ModelData[] var9 = new ModelData[var3.length];

				for (int var6 = 0; var6 < var3.length; ++var6) {
					var9[var6] = ModelData.ModelData_get(field1985, var3[var6], 0);
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lhb;",
		garbageValue = "765503065"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class162.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class76.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2016243441"
	)
	public final int method3731() {
		if (this.transforms != null) {
			NPCComposition var1 = this.transform();
			if (var1 != null) {
				return var1.id;
			}
		}

		return -1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1222906230"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = class162.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "6810"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return WorldMapRectangle.method4997(this.params, var1, var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)Ljava/lang/String;",
		garbageValue = "-21641"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class109.method2817(this.params, var1, var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1793189942"
	)
	public boolean method3712() {
		return this.headIconArchiveIds != null && this.headIconSpriteIndex != null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-481979218"
	)
	public int[] method3713() {
		return this.headIconArchiveIds;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1764901866"
	)
	public int method3702(int var1) {
		return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "30"
	)
	public short[] method3715() {
		return this.headIconSpriteIndex;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)S",
		garbageValue = "2053251793"
	)
	public short method3716(int var1) {
		return this.headIconSpriteIndex != null && var1 < this.headIconSpriteIndex.length ? this.headIconSpriteIndex[var1] : -1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "1467803250"
	)
	@Export("sortItemsByName")
	static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Lde;B)V",
		garbageValue = "123"
	)
	static final void method3756(WorldView var0) {
		for (PendingSpawn var1 = (PendingSpawn)var0.pendingSpawns.last(); var1 != null; var1 = (PendingSpawn)var0.pendingSpawns.previous()) {
			if (var1.hitpoints > 0) {
				--var1.hitpoints;
			}

			boolean var2;
			int var3;
			int var4;
			ObjectComposition var5;
			if (var1.hitpoints == 0) {
				if (var1.objectId >= 0) {
					var3 = var1.objectId;
					var4 = var1.field1185;
					var5 = HttpRequest.getObjectDefinition(var3);
					if (var4 == 11) {
						var4 = 10;
					}

					if (var4 >= 5 && var4 <= 8) {
						var4 = 4;
					}

					var2 = var5.method3913(var4);
					if (!var2) {
						continue;
					}
				}

				Bounds.addPendingSpawnToScene(var0, var1.plane, var1.type, var1.x, var1.y, var1.objectId, var1.field1176, var1.field1185, var1.field1181);
				var1.remove();
			} else {
				if (var1.delay > 0) {
					--var1.delay;
				}

				if (var1.delay == 0 && var1.x >= 1 && var1.y >= 1 && var1.x <= 102 && var1.y <= 102) {
					if (var1.field1175 >= 0) {
						var3 = var1.field1175;
						var4 = var1.field1186;
						var5 = HttpRequest.getObjectDefinition(var3);
						if (var4 == 11) {
							var4 = 10;
						}

						if (var4 >= 5 && var4 <= 8) {
							var4 = 4;
						}

						var2 = var5.method3913(var4);
						if (!var2) {
							continue;
						}
					}

					Bounds.addPendingSpawnToScene(var0, var1.plane, var1.type, var1.x, var1.y, var1.field1175, var1.field1179, var1.field1186, var1.field1181);
					var1.delay = -1;
					if (var1.field1175 == var1.objectId && var1.objectId == -1) {
						var1.remove();
					} else if (var1.field1175 == var1.objectId && var1.field1176 == var1.field1179 && var1.field1185 == var1.field1186) {
						var1.remove();
					}
				}
			}
		}

	}
}
