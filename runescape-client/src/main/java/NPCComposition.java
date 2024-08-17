import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	public static AbstractArchive field2575;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("uw")
	@ObfuscatedGetter(
		intValue = -605862025
	)
	static int field2613;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -246559647
	)
	@Export("id")
	public int id;
	@ObfuscatedName("am")
	@Export("name")
	public String name;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 980302171
	)
	@Export("size")
	public int size;
	@ObfuscatedName("ae")
	@Export("models")
	int[] models;
	@ObfuscatedName("ad")
	int[] field2572;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 581986145
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1256266003
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -805934585
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1188148499
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1597186121
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2000901309
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -541403145
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1656000143
	)
	public int field2580;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1887349965
	)
	public int field2579;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 629288755
	)
	public int field2582;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2033769375
	)
	public int field2596;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1661834911
	)
	public int field2584;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 227587829
	)
	public int field2585;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -893169933
	)
	public int field2586;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1381013931
	)
	public int field2587;
	@ObfuscatedName("az")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bg")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bz")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bj")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bc")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bo")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 685060765
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1128785607
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 959845169
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("bx")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -201442627
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -590086729
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -180319391
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("br")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1887104017
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1347892197
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bt")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("bi")
	@Export("isClipped")
	public boolean isClipped;
	@ObfuscatedName("be")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("ba")
	@Export("lowPriorityFollowerOps")
	public boolean lowPriorityFollowerOps;
	@ObfuscatedName("bn")
	@Export("headIconArchiveIds")
	int[] headIconArchiveIds;
	@ObfuscatedName("bw")
	@Export("headIconSpriteIndex")
	short[] headIconSpriteIndex;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 253789525
	)
	public int field2583;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bb")
	int[] field2612;

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
		this.field2580 = -1;
		this.field2579 = -1;
		this.field2582 = -1;
		this.field2596 = -1;
		this.field2584 = -1;
		this.field2585 = -1;
		this.field2586 = -1;
		this.field2587 = -1;
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
		this.field2583 = -1;
		this.field2612 = new int[]{1, 1, 1, 1, 1, 1};
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "73"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "2029658134"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvg;II)V",
		garbageValue = "-1605926653"
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
			this.field2572 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2572[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 74) {
			this.field2612[0] = var1.readUnsignedShort();
		} else if (var2 == 75) {
			this.field2612[1] = var1.readUnsignedShort();
		} else if (var2 == 76) {
			this.field2612[2] = var1.readUnsignedShort();
		} else if (var2 == 77) {
			this.field2612[3] = var1.readUnsignedShort();
		} else if (var2 == 78) {
			this.field2612[4] = var1.readUnsignedShort();
		} else if (var2 == 79) {
			this.field2612[5] = var1.readUnsignedShort();
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
					this.field2580 = var1.readUnsignedShort();
				} else if (var2 == 115) {
					this.field2580 = var1.readUnsignedShort();
					this.field2579 = var1.readUnsignedShort();
					this.field2582 = var1.readUnsignedShort();
					this.field2596 = var1.readUnsignedShort();
				} else if (var2 == 116) {
					this.field2584 = var1.readUnsignedShort();
				} else if (var2 == 117) {
					this.field2584 = var1.readUnsignedShort();
					this.field2585 = var1.readUnsignedShort();
					this.field2586 = var1.readUnsignedShort();
					this.field2587 = var1.readUnsignedShort();
				} else if (var2 == 122) {
					this.isFollower = true;
				} else if (var2 == 123) {
					this.lowPriorityFollowerOps = true;
				} else if (var2 == 124) {
					this.field2583 = var1.readUnsignedShort();
				} else if (var2 == 249) {
					this.params = class143.readStringIntParameters(var1, this.params);
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
		descriptor = "(Lkr;ILkr;ILjl;I)Lhr;",
		garbageValue = "1947286994"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NpcOverrides var5) {
		if (this.transforms != null) {
			NPCComposition var10 = this.transform();
			return var10 == null ? null : var10.getModel(var1, var2, var3, var4, var5);
		} else {
			long var6 = (long)this.id;
			if (var5 != null) {
				var6 |= var5.field2558 << 16;
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
		descriptor = "(Ljl;I)Lgm;",
		garbageValue = "546561462"
	)
	public final ModelData method4917(NpcOverrides var1) {
		if (this.transforms != null) {
			NPCComposition var2 = this.transform();
			return var2 == null ? null : var2.method4917(var1);
		} else {
			return this.getModelData(this.field2572, var1);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([ILjl;I)Lgm;",
		garbageValue = "-596718521"
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
				if (var3[var5] != -1 && !field2575.tryLoadFile(var3[var5], 0)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				ModelData[] var9 = new ModelData[var3.length];

				for (int var6 = 0; var6 < var3.length; ++var6) {
					var9[var6] = ModelData.ModelData_get(field2575, var3[var6], 0);
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljm;",
		garbageValue = "441517321"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class143.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? UserComparator8.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1014248109"
	)
	public final int method4955() {
		if (this.transforms != null) {
			NPCComposition var1 = this.transform();
			if (var1 != null) {
				return var1.id;
			}
		}

		return -1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-287136868"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = class143.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-1"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params;
		int var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = var5.integer;
			}
		}

		return var3;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "242007829"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return Archive.method7241(this.params, var1, var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1559070879"
	)
	public boolean method4923() {
		return this.headIconArchiveIds != null && this.headIconSpriteIndex != null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1999698592"
	)
	public int[] method4950() {
		return this.headIconArchiveIds;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "984411521"
	)
	public int method4925(int var1) {
		return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "748068556"
	)
	public short[] method4930() {
		return this.headIconSpriteIndex;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)S",
		garbageValue = "1092067716"
	)
	public short method4927(int var1) {
		return this.headIconSpriteIndex != null && var1 < this.headIconSpriteIndex.length ? this.headIconSpriteIndex[var1] : -1;
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(Lnq;I)Z",
		garbageValue = "1233531847"
	)
	static final boolean method4964(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method6580(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.method6581(0);
			}

			if (var1 == 325) {
				Client.playerAppearance.method6581(1);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = class218.getPacketBufferNode(class546.field5371 >= 224 ? ClientPacket.field3356 : ClientPacket.field3348, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
