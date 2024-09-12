import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	public static AbstractArchive field2043;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 12568355
	)
	@Export("id")
	public int id;
	@ObfuscatedName("af")
	@Export("name")
	public String name;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1842011545
	)
	@Export("size")
	public int size;
	@ObfuscatedName("au")
	@Export("models")
	int[] models;
	@ObfuscatedName("ar")
	int[] field2011;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1798569947
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -331749079
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 532278243
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2141995003
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1412269515
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -376940899
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1348224971
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1659263349
	)
	public int field2012;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 388830119
	)
	public int field2015;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1774154209
	)
	public int field2021;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 388602199
	)
	public int field2029;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 374786521
	)
	public int field2023;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1813876517
	)
	public int field2051;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1065801131
	)
	public int field2020;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2123706605
	)
	public int field2026;
	@ObfuscatedName("ak")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bn")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bh")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bd")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bx")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bf")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -40051705
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 465667413
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1590443583
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("ba")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 900679833
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -246677879
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 616462267
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("bb")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 524557037
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -475910083
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bl")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("bz")
	@Export("isClipped")
	public boolean isClipped;
	@ObfuscatedName("bu")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("br")
	@Export("lowPriorityFollowerOps")
	public boolean lowPriorityFollowerOps;
	@ObfuscatedName("bo")
	@Export("headIconArchiveIds")
	int[] headIconArchiveIds;
	@ObfuscatedName("bv")
	@Export("headIconSpriteIndex")
	short[] headIconSpriteIndex;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 288346659
	)
	public int field2049;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bk")
	int[] field2022;

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
		this.field2012 = -1;
		this.field2015 = -1;
		this.field2021 = -1;
		this.field2029 = -1;
		this.field2023 = -1;
		this.field2051 = -1;
		this.field2020 = -1;
		this.field2026 = -1;
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
		this.field2049 = -1;
		this.field2022 = new int[]{1, 1, 1, 1, 1, 1};
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-212678786"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "39"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lvf;II)V",
		garbageValue = "2089032385"
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
			this.field2011 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2011[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 74) {
			this.field2022[0] = var1.readUnsignedShort();
		} else if (var2 == 75) {
			this.field2022[1] = var1.readUnsignedShort();
		} else if (var2 == 76) {
			this.field2022[2] = var1.readUnsignedShort();
		} else if (var2 == 77) {
			this.field2022[3] = var1.readUnsignedShort();
		} else if (var2 == 78) {
			this.field2022[4] = var1.readUnsignedShort();
		} else if (var2 == 79) {
			this.field2022[5] = var1.readUnsignedShort();
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
					this.field2012 = var1.readUnsignedShort();
				} else if (var2 == 115) {
					this.field2012 = var1.readUnsignedShort();
					this.field2015 = var1.readUnsignedShort();
					this.field2021 = var1.readUnsignedShort();
					this.field2029 = var1.readUnsignedShort();
				} else if (var2 == 116) {
					this.field2023 = var1.readUnsignedShort();
				} else if (var2 == 117) {
					this.field2023 = var1.readUnsignedShort();
					this.field2051 = var1.readUnsignedShort();
					this.field2020 = var1.readUnsignedShort();
					this.field2026 = var1.readUnsignedShort();
				} else if (var2 == 122) {
					this.isFollower = true;
				} else if (var2 == 123) {
					this.lowPriorityFollowerOps = true;
				} else if (var2 == 124) {
					this.field2049 = var1.readUnsignedShort();
				} else if (var2 == 249) {
					this.params = class166.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lif;ILif;ILhp;I)Ljm;",
		garbageValue = "220269434"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NpcOverrides var5) {
		if (this.transforms != null) {
			NPCComposition var10 = this.transform();
			return var10 == null ? null : var10.getModel(var1, var2, var3, var4, var5);
		} else {
			long var6 = (long)this.id;
			if (var5 != null) {
				var6 |= var5.field1996 << 16;
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lhp;I)Ljv;",
		garbageValue = "485730990"
	)
	public final ModelData method3966(NpcOverrides var1) {
		if (this.transforms != null) {
			NPCComposition var2 = this.transform();
			return var2 == null ? null : var2.method3966(var1);
		} else {
			return this.getModelData(this.field2011, var1);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([ILhp;I)Ljv;",
		garbageValue = "908949744"
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
				if (var3[var5] != -1 && !field2043.tryLoadFile(var3[var5], 0)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				ModelData[] var9 = new ModelData[var3.length];

				for (int var6 = 0; var6 < var3.length; ++var6) {
					var9[var6] = ModelData.ModelData_get(field2043, var3[var6], 0);
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Lhn;",
		garbageValue = "-81"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = LoginPacket.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class168.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = LoginPacket.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "0"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class27.method421(this.params, var1, var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1322434375"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params;
		String var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = (String)var5.obj;
			}
		}

		return var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	public boolean method3961() {
		return this.headIconArchiveIds != null && this.headIconSpriteIndex != null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-29295119"
	)
	public int[] method3973() {
		return this.headIconArchiveIds;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "906686746"
	)
	public int method4007(int var1) {
		return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-1863765918"
	)
	public short[] method3975() {
		return this.headIconSpriteIndex;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)S",
		garbageValue = "1767626597"
	)
	public short method4006(int var1) {
		return this.headIconSpriteIndex != null && var1 < this.headIconSpriteIndex.length ? this.headIconSpriteIndex[var1] : -1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-105"
	)
	public static void method3978() {
		VarpDefinition.VarpDefinition_cached.clear();
	}
}
