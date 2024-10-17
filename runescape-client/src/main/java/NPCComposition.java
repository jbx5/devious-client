import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -406967203
	)
	@Export("id")
	public int id;
	@ObfuscatedName("as")
	@Export("name")
	public String name;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 255989129
	)
	@Export("size")
	public int size;
	@ObfuscatedName("am")
	@Export("models")
	int[] models;
	@ObfuscatedName("at")
	int[] field2012;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -814133743
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2091984723
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1913122343
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1456821303
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1563983899
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 283282507
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 506724573
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -998942873
	)
	public int field2038;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1846827721
	)
	public int field2021;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1971023201
	)
	public int field2022;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -921569603
	)
	public int field2023;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 804795867
	)
	public int field2024;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1011422531
	)
	public int field2025;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -870724451
	)
	public int field2026;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 2107501571
	)
	public int field2027;
	@ObfuscatedName("ah")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bh")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bj")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bv")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bx")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bk")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1201504359
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1062697345
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 557977451
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("bz")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1678826441
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 118807205
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1565081637
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("bn")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1400759119
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1384094359
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bs")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("bm")
	@Export("isClipped")
	public boolean isClipped;
	@ObfuscatedName("bo")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bd")
	@Export("lowPriorityFollowerOps")
	public boolean lowPriorityFollowerOps;
	@ObfuscatedName("ba")
	@Export("headIconArchiveIds")
	int[] headIconArchiveIds;
	@ObfuscatedName("bw")
	@Export("headIconSpriteIndex")
	short[] headIconSpriteIndex;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1479800425
	)
	public int field2050;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bg")
	int[] field2052;

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
		this.field2038 = -1;
		this.field2021 = -1;
		this.field2022 = -1;
		this.field2023 = -1;
		this.field2024 = -1;
		this.field2025 = -1;
		this.field2026 = -1;
		this.field2027 = -1;
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
		this.field2050 = -1;
		this.field2052 = new int[]{1, 1, 1, 1, 1, 1};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "73"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvl;B)V",
		garbageValue = "41"
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
		descriptor = "(Lvl;II)V",
		garbageValue = "-2129317726"
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
			this.field2012 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2012[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 74) {
			this.field2052[0] = var1.readUnsignedShort();
		} else if (var2 == 75) {
			this.field2052[1] = var1.readUnsignedShort();
		} else if (var2 == 76) {
			this.field2052[2] = var1.readUnsignedShort();
		} else if (var2 == 77) {
			this.field2052[3] = var1.readUnsignedShort();
		} else if (var2 == 78) {
			this.field2052[4] = var1.readUnsignedShort();
		} else if (var2 == 79) {
			this.field2052[5] = var1.readUnsignedShort();
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
					this.field2038 = var1.readUnsignedShort();
				} else if (var2 == 115) {
					this.field2038 = var1.readUnsignedShort();
					this.field2021 = var1.readUnsignedShort();
					this.field2022 = var1.readUnsignedShort();
					this.field2023 = var1.readUnsignedShort();
				} else if (var2 == 116) {
					this.field2024 = var1.readUnsignedShort();
				} else if (var2 == 117) {
					this.field2024 = var1.readUnsignedShort();
					this.field2025 = var1.readUnsignedShort();
					this.field2026 = var1.readUnsignedShort();
					this.field2027 = var1.readUnsignedShort();
				} else if (var2 == 122) {
					this.isFollower = true;
				} else if (var2 == 123) {
					this.lowPriorityFollowerOps = true;
				} else if (var2 == 124) {
					this.field2050 = var1.readUnsignedShort();
				} else if (var2 == 249) {
					this.params = DynamicObject.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Liu;ILiu;ILhn;B)Ljy;",
		garbageValue = "12"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NpcOverrides var5) {
		if (this.transforms != null) {
			NPCComposition var10 = this.transform();
			return var10 == null ? null : var10.getModel(var1, var2, var3, var4, var5);
		} else {
			long var6 = (long)this.id;
			if (var5 != null) {
				var6 |= var5.field2001 << 16;
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lhn;I)Ljj;",
		garbageValue = "-1908859861"
	)
	public final ModelData method4026(NpcOverrides var1) {
		if (this.transforms != null) {
			NPCComposition var2 = this.transform();
			return var2 == null ? null : var2.method4026(var1);
		} else {
			return this.getModelData(this.field2012, var1);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([ILhn;I)Ljj;",
		garbageValue = "1628943764"
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
				if (var3[var5] != -1 && !GrandExchangeOfferTotalQuantityComparator.field4643.tryLoadFile(var3[var5], 0)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				ModelData[] var9 = new ModelData[var3.length];

				for (int var6 = 0; var6 < var3.length; ++var6) {
					var9[var6] = ModelData.ModelData_get(GrandExchangeOfferTotalQuantityComparator.field4643, var3[var6], 0);
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lhy;",
		garbageValue = "-1575584255"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = Projectile.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? ActorSpotAnim.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "33178518"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = Projectile.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "-13559"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class180.method3850(this.params, var1, var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-2082163542"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class298.method6296(this.params, var1, var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "787111131"
	)
	public boolean method4001() {
		return this.headIconArchiveIds != null && this.headIconSpriteIndex != null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1963942209"
	)
	public int[] method4002() {
		return this.headIconArchiveIds;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1339276061"
	)
	public int method3998(int var1) {
		return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "-65"
	)
	public short[] method4004() {
		return this.headIconSpriteIndex;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)S",
		garbageValue = "6"
	)
	public short method4005(int var1) {
		return this.headIconSpriteIndex != null && var1 < this.headIconSpriteIndex.length ? this.headIconSpriteIndex[var1] : -1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lng;IIII)V",
		garbageValue = "204453434"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3995 == null) {
			throw new RuntimeException();
		} else {
			var0.field3995[var1] = var2;
			var0.field3961[var1] = var3;
		}
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Lev;IIIIB)V",
		garbageValue = "0"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3, int var4) {
		NPCComposition var5 = var0.definition;
		if (Client.menu.menuOptionsCount < 400) {
			if (var5.transforms != null) {
				var5 = var5.transform();
			}

			if (var5 != null) {
				if (var5.isInteractable) {
					if (!var5.isFollower || Client.followerIndex == var1) {
						String var6 = var0.method2966();
						int var7;
						int var10;
						if (var5.combatLevel != 0 && var0.field1292 != 0) {
							var7 = var0.field1292 != -1 ? var0.field1292 : var5.combatLevel;
							var10 = SpriteMask.localPlayer.combatLevel;
							int var11 = var10 - var7;
							String var9;
							if (var11 < -9) {
								var9 = class204.colorStartTag(16711680);
							} else if (var11 < -6) {
								var9 = class204.colorStartTag(16723968);
							} else if (var11 < -3) {
								var9 = class204.colorStartTag(16740352);
							} else if (var11 < 0) {
								var9 = class204.colorStartTag(16756736);
							} else if (var11 > 9) {
								var9 = class204.colorStartTag(65280);
							} else if (var11 > 6) {
								var9 = class204.colorStartTag(4259584);
							} else if (var11 > 3) {
								var9 = class204.colorStartTag(8453888);
							} else if (var11 > 0) {
								var9 = class204.colorStartTag(12648192);
							} else {
								var9 = class204.colorStartTag(16776960);
							}

							var6 = var6 + var9 + " " + " (" + "level-" + var7 + ")";
						}

						if (var5.lowPriorityFollowerOps && Client.followerOpsLowPriority) {
							AsyncRestClient.insertMenuItem("Examine", class204.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
						}

						if (!class172.field1855 && Client.isItemSelected == 1) {
							AsyncRestClient.insertMenuItem("Use", Client.field659 + " " + "->" + " " + class204.colorStartTag(16776960) + var6, 7, var1, var2, var3, -1, false, var4);
						} else if (Client.isSpellSelected) {
							if (!class172.field1855 && (class373.selectedSpellFlags & 2) == 2) {
								AsyncRestClient.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class204.colorStartTag(16776960) + var6, 8, var1, var2, var3, -1, false, var4);
							}
						} else {
							var7 = var5.lowPriorityFollowerOps && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var8 = var5.actions;
							int var12;
							if (var8 != null) {
								for (var12 = 4; var12 >= 0; --var12) {
									if (!class172.field1855 && var0.method2993(var12) && var8[var12] != null && !var8[var12].equalsIgnoreCase("Attack")) {
										var10 = 0;
										if (var12 == 0) {
											var10 = var7 + 9;
										}

										if (var12 == 1) {
											var10 = var7 + 10;
										}

										if (var12 == 2) {
											var10 = var7 + 11;
										}

										if (var12 == 3) {
											var10 = var7 + 12;
										}

										if (var12 == 4) {
											var10 = var7 + 13;
										}

										AsyncRestClient.insertMenuItem(var8[var12], class204.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
									}
								}
							}

							if (var8 != null) {
								for (var12 = 4; var12 >= 0; --var12) {
									if (!class172.field1855 && var0.method2993(var12) && var8[var12] != null && var8[var12].equalsIgnoreCase("Attack")) {
										short var13 = 0;
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) {
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var5.combatLevel > SpriteMask.localPlayer.combatLevel) {
												var13 = 2000;
											}

											var10 = 0;
											if (var12 == 0) {
												var10 = var13 + 9;
											}

											if (var12 == 1) {
												var10 = var13 + 10;
											}

											if (var12 == 2) {
												var10 = var13 + 11;
											}

											if (var12 == 3) {
												var10 = var13 + 12;
											}

											if (var12 == 4) {
												var10 = var13 + 13;
											}

											AsyncRestClient.insertMenuItem(var8[var12], class204.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
										}
									}
								}
							}

							if (!var5.lowPriorityFollowerOps || !Client.followerOpsLowPriority) {
								AsyncRestClient.insertMenuItem("Examine", class204.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
							}
						}

					}
				}
			}
		}
	}
}
