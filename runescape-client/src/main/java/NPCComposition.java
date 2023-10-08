import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	public static AbstractArchive field2085;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 849514739
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ar")
	@Export("name")
	public String name;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 336907057
	)
	@Export("size")
	public int size;
	@ObfuscatedName("am")
	@Export("models")
	int[] models;
	@ObfuscatedName("av")
	int[] field2053;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -771436155
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -683029639
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 53136165
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1652208225
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -601680513
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 407029447
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1457167705
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1220844931
	)
	public int field2059;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1929114687
	)
	public int field2060;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1555933215
	)
	public int field2061;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2140161505
	)
	public int field2088;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 578435175
	)
	public int field2063;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 279963805
	)
	public int field2064;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2021467469
	)
	public int field2065;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 999682433
	)
	public int field2074;
	@ObfuscatedName("ad")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bn")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bk")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("by")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bd")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("be")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1597602147
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -137869179
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1670534557
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("bb")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 2015472055
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -47059193
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1112913073
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("bm")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 574355089
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1345003587
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bc")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("bu")
	@Export("isClipped")
	public boolean isClipped;
	@ObfuscatedName("bf")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bh")
	@Export("headIconArchiveIds")
	int[] headIconArchiveIds;
	@ObfuscatedName("bl")
	@Export("headIconSpriteIndex")
	short[] headIconSpriteIndex;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
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
		this.field2059 = -1;
		this.field2060 = -1;
		this.field2061 = -1;
		this.field2088 = -1;
		this.field2063 = -1;
		this.field2064 = -1;
		this.field2065 = -1;
		this.field2074 = -1;
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
		this.headIconArchiveIds = null;
		this.headIconSpriteIndex = null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "2"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;IB)V",
		garbageValue = "0"
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
			this.field2053 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2053[var4] = var1.readUnsignedShort();
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
				} else if (var2 == 111) {
					this.isFollower = true;
				} else if (var2 == 114) {
					this.field2059 = var1.readUnsignedShort();
				} else if (var2 == 115) {
					this.field2059 = var1.readUnsignedShort();
					this.field2060 = var1.readUnsignedShort();
					this.field2061 = var1.readUnsignedShort();
					this.field2088 = var1.readUnsignedShort();
				} else if (var2 == 116) {
					this.field2063 = var1.readUnsignedShort();
				} else if (var2 == 117) {
					this.field2063 = var1.readUnsignedShort();
					this.field2064 = var1.readUnsignedShort();
					this.field2065 = var1.readUnsignedShort();
					this.field2074 = var1.readUnsignedShort();
				} else if (var2 == 249) {
					this.params = class167.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lif;ILif;ILhe;B)Ljn;",
		garbageValue = "0"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NpcOverrides var5) {
		if (this.transforms != null) {
			NPCComposition var10 = this.transform();
			return var10 == null ? null : var10.getModel(var1, var2, var3, var4, var5);
		} else {
			long var6 = (long)this.id;
			if (var5 != null) {
				var6 |= var5.field2040 << 16;
			}

			Model var8 = (Model) NpcDefinition_cachedModels.get(var6);
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lhe;I)Ljw;",
		garbageValue = "-1925302214"
	)
	public final ModelData method3784(NpcOverrides var1) {
		if (this.transforms != null) {
			NPCComposition var2 = this.transform();
			return var2 == null ? null : var2.method3784(var1);
		} else {
			return this.getModelData(this.field2053, var1);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([ILhe;I)Ljw;",
		garbageValue = "817549267"
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
				if (var3[var5] != -1 && !field2085.tryLoadFile(var3[var5], 0)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				ModelData[] var9 = new ModelData[var3.length];

				for (int var6 = 0; var6 < var3.length; ++var6) {
					var9[var6] = ModelData.ModelData_get(field2085, var3[var6], 0);
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
		descriptor = "(I)Lhw;",
		garbageValue = "637485229"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class36.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class190.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-329950655"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = class36.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "-28498"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return AttackOption.method2721(this.params, var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-210955753"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class30.method448(this.params, var1, var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1901854799"
	)
	public boolean method3790() {
		return this.headIconArchiveIds != null && this.headIconSpriteIndex != null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "71"
	)
	public int[] method3791() {
		return this.headIconArchiveIds;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "438787459"
	)
	public int method3792(int var1) {
		return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "1864289740"
	)
	public short[] method3802() {
		return this.headIconSpriteIndex;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)S",
		garbageValue = "628204446"
	)
	public short method3794(int var1) {
		return this.headIconSpriteIndex != null && var1 < this.headIconSpriteIndex.length ? this.headIconSpriteIndex[var1] : -1;
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1885012369"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field700 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (class178.getWindowedMode() == 1) {
			class159.client.setMaxCanvasSize(765, 503);
		} else {
			class159.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25) {
			class517.method9051();
		}

	}
}
