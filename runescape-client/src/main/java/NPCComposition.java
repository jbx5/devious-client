import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -244805767
	)
	@Export("id")
	public int id;
	@ObfuscatedName("at")
	@Export("name")
	public String name;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1016297279
	)
	@Export("size")
	public int size;
	@ObfuscatedName("ac")
	@Export("models")
	int[] models;
	@ObfuscatedName("ao")
	int[] field2122;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 313198789
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1484904517
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 59190127
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -795735663
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -276666815
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1751645485
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -598540973
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1920059097
	)
	public int field2130;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1452064117
	)
	public int field2131;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 553056745
	)
	public int field2161;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1419348581
	)
	public int field2133;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 472894765
	)
	public int field2134;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -188150803
	)
	public int field2135;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1542668147
	)
	public int field2136;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -434528093
	)
	public int field2124;
	@ObfuscatedName("ag")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bs")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bf")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bo")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bi")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bt")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -2065950307
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1845965057
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1609108809
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("be")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 398319189
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1443122473
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1140381571
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("bk")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1078074805
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1577258597
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bx")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("bd")
	@Export("isClipped")
	public boolean isClipped;
	@ObfuscatedName("bv")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bm")
	@Export("lowPriorityFollowerOps")
	public boolean lowPriorityFollowerOps;
	@ObfuscatedName("bq")
	@Export("headIconArchiveIds")
	int[] headIconArchiveIds;
	@ObfuscatedName("bj")
	@Export("headIconSpriteIndex")
	short[] headIconSpriteIndex;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
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
		this.field2130 = -1;
		this.field2131 = -1;
		this.field2161 = -1;
		this.field2133 = -1;
		this.field2134 = -1;
		this.field2135 = -1;
		this.field2136 = -1;
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "209334241"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "542456774"
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lua;II)V",
		garbageValue = "-1416466765"
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
			this.field2122 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2122[var4] = var1.readUnsignedShort();
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
					this.field2130 = var1.readUnsignedShort();
				} else if (var2 == 115) {
					this.field2130 = var1.readUnsignedShort();
					this.field2131 = var1.readUnsignedShort();
					this.field2161 = var1.readUnsignedShort();
					this.field2133 = var1.readUnsignedShort();
				} else if (var2 == 116) {
					this.field2134 = var1.readUnsignedShort();
				} else if (var2 == 117) {
					this.field2134 = var1.readUnsignedShort();
					this.field2135 = var1.readUnsignedShort();
					this.field2136 = var1.readUnsignedShort();
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lic;ILic;ILio;B)Lkb;",
		garbageValue = "-62"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NpcOverrides var5) {
		if (this.transforms != null) {
			NPCComposition var10 = this.transform();
			return var10 == null ? null : var10.getModel(var1, var2, var3, var4, var5);
		} else {
			long var6 = (long)this.id;
			if (var5 != null) {
				var6 |= var5.field2110 << 16;
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lio;I)Ljb;",
		garbageValue = "1284735365"
	)
	public final ModelData method3967(NpcOverrides var1) {
		if (this.transforms != null) {
			NPCComposition var2 = this.transform();
			return var2 == null ? null : var2.method3967(var1);
		} else {
			return this.getModelData(this.field2122, var1);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([ILio;I)Ljb;",
		garbageValue = "1674117224"
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
				if (var3[var5] != -1 && !class30.field158.tryLoadFile(var3[var5], 0)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				ModelData[] var9 = new ModelData[var3.length];

				for (int var6 = 0; var6 < var3.length; ++var6) {
					var9[var6] = ModelData.ModelData_get(class30.field158, var3[var6], 0);
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Liq;",
		garbageValue = "51664635"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = ClientPacket.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class134.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-118"
	)
	public final int method3985() {
		if (this.transforms != null) {
			NPCComposition var1 = this.transform();
			if (var1 != null) {
				return var1.id;
			}
		}

		return -1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-49"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = ClientPacket.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1798279112"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1104684634"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class103.method2726(this.params, var1, var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-250"
	)
	public boolean method3982() {
		return this.headIconArchiveIds != null && this.headIconSpriteIndex != null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "0"
	)
	public int[] method3962() {
		return this.headIconArchiveIds;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "69"
	)
	public int method3976(int var1) {
		return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-1924565781"
	)
	public short[] method3977() {
		return this.headIconSpriteIndex;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)S",
		garbageValue = "-1894697863"
	)
	public short method3978(int var1) {
		return this.headIconSpriteIndex != null && var1 < this.headIconSpriteIndex.length ? this.headIconSpriteIndex[var1] : -1;
	}
}
