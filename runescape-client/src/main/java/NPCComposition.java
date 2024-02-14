import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	public static AbstractArchive field1964;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1649526313
	)
	@Export("id")
	public int id;
	@ObfuscatedName("aa")
	@Export("name")
	public String name;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1200322013
	)
	@Export("size")
	public int size;
	@ObfuscatedName("ao")
	@Export("models")
	int[] models;
	@ObfuscatedName("au")
	int[] field1994;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -641444085
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1730976877
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -369839719
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1810055459
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -964079029
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1604087399
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -213186797
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -739363907
	)
	public int field1979;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1035998327
	)
	public int field1980;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1836325165
	)
	public int field1987;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2060153769
	)
	public int field1982;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1208452197
	)
	public int field1983;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1090622731
	)
	public int field1966;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1033123305
	)
	public int field1984;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -905258827
	)
	public int field1986;
	@ObfuscatedName("ap")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bu")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bo")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bd")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bi")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bq")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1490701553
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -2079367309
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1633013487
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("bm")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -299076281
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 335416247
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 358183959
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("bb")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1059260067
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 208627683
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bp")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("bf")
	@Export("isClipped")
	public boolean isClipped;
	@ObfuscatedName("bg")
	public boolean field2005;
	@ObfuscatedName("be")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bc")
	@Export("headIconArchiveIds")
	int[] headIconArchiveIds;
	@ObfuscatedName("bz")
	@Export("headIconSpriteIndex")
	short[] headIconSpriteIndex;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lta;"
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
		this.field1979 = -1;
		this.field1980 = -1;
		this.field1987 = -1;
		this.field1982 = -1;
		this.field1983 = -1;
		this.field1966 = -1;
		this.field1984 = -1;
		this.field1986 = -1;
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
		this.field2005 = false;
		this.isFollower = false;
		this.headIconArchiveIds = null;
		this.headIconSpriteIndex = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-132261211"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;B)V",
		garbageValue = "0"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "2079469647"
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
			this.field1994 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field1994[var4] = var1.readUnsignedShort();
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
					this.field1979 = var1.readUnsignedShort();
				} else if (var2 == 115) {
					this.field1979 = var1.readUnsignedShort();
					this.field1980 = var1.readUnsignedShort();
					this.field1987 = var1.readUnsignedShort();
					this.field1982 = var1.readUnsignedShort();
				} else if (var2 == 116) {
					this.field1983 = var1.readUnsignedShort();
				} else if (var2 == 117) {
					this.field1983 = var1.readUnsignedShort();
					this.field1966 = var1.readUnsignedShort();
					this.field1984 = var1.readUnsignedShort();
					this.field1986 = var1.readUnsignedShort();
				} else if (var2 == 122) {
					this.field2005 = true;
				} else if (var2 == 123) {
					this.isFollower = true;
				} else if (var2 == 249) {
					this.params = class324.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhs;ILhs;ILht;I)Lkz;",
		garbageValue = "-1363556981"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NpcOverrides var5) {
		if (this.transforms != null) {
			NPCComposition var10 = this.transform();
			return var10 == null ? null : var10.getModel(var1, var2, var3, var4, var5);
		} else {
			long var6 = (long)this.id;
			if (var5 != null) {
				var6 |= var5.field1960 << 16;
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lht;B)Lkf;",
		garbageValue = "3"
	)
	public final ModelData method3702(NpcOverrides var1) {
		if (this.transforms != null) {
			NPCComposition var2 = this.transform();
			return var2 == null ? null : var2.method3702(var1);
		} else {
			return this.getModelData(this.field1994, var1);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([ILht;I)Lkf;",
		garbageValue = "1934764414"
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
				if (var3[var5] != -1 && !field1964.tryLoadFile(var3[var5], 0)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				ModelData[] var9 = new ModelData[var3.length];

				for (int var6 = 0; var6 < var3.length; ++var6) {
					var9[var6] = ModelData.ModelData_get(field1964, var3[var6], 0);
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lho;",
		garbageValue = "82"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class332.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? VarcInt.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-10620"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = class332.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-692597377"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "232488627"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1591783850"
	)
	public boolean method3709() {
		return this.headIconArchiveIds != null && this.headIconSpriteIndex != null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-692020245"
	)
	public int[] method3700() {
		return this.headIconArchiveIds;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-466777872"
	)
	public int method3703(int var1) {
		return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-2092456263"
	)
	public short[] method3743() {
		return this.headIconSpriteIndex;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IS)S",
		garbageValue = "256"
	)
	public short method3712(int var1) {
		return this.headIconSpriteIndex != null && var1 < this.headIconSpriteIndex.length ? this.headIconSpriteIndex[var1] : -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmj;",
		garbageValue = "-756894589"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field3344, ServerPacket.field3413, ServerPacket.field3298, ServerPacket.field3299, ServerPacket.field3309, ServerPacket.field3360, ServerPacket.field3402, ServerPacket.field3324, ServerPacket.field3304, ServerPacket.field3305, ServerPacket.field3301, ServerPacket.field3332, ServerPacket.field3308, ServerPacket.field3394, ServerPacket.field3310, ServerPacket.field3311, ServerPacket.field3307, ServerPacket.field3313, ServerPacket.field3314, ServerPacket.field3410, ServerPacket.field3322, ServerPacket.field3317, ServerPacket.field3318, ServerPacket.field3319, ServerPacket.field3320, ServerPacket.field3321, ServerPacket.field3377, ServerPacket.field3323, ServerPacket.field3400, ServerPacket.field3407, ServerPacket.field3348, ServerPacket.field3327, ServerPacket.field3392, ServerPacket.field3329, ServerPacket.field3330, ServerPacket.field3331, ServerPacket.field3297, ServerPacket.field3333, ServerPacket.field3334, ServerPacket.field3335, ServerPacket.field3296, ServerPacket.field3337, ServerPacket.field3338, ServerPacket.field3397, ServerPacket.field3340, ServerPacket.field3408, ServerPacket.field3342, ServerPacket.field3343, ServerPacket.field3363, ServerPacket.field3345, ServerPacket.field3418, ServerPacket.field3347, ServerPacket.field3325, ServerPacket.field3349, ServerPacket.field3315, ServerPacket.field3351, ServerPacket.field3352, ServerPacket.field3353, ServerPacket.field3354, ServerPacket.field3386, ServerPacket.field3355, ServerPacket.field3357, ServerPacket.field3358, ServerPacket.field3359, ServerPacket.field3412, ServerPacket.field3361, ServerPacket.field3362, ServerPacket.field3420, ServerPacket.field3364, ServerPacket.field3365, ServerPacket.field3366, ServerPacket.field3303, ServerPacket.field3368, ServerPacket.field3369, ServerPacket.field3370, ServerPacket.field3371, ServerPacket.field3372, ServerPacket.field3373, ServerPacket.field3374, ServerPacket.field3375, ServerPacket.field3376, ServerPacket.field3385, ServerPacket.field3378, ServerPacket.field3356, ServerPacket.field3380, ServerPacket.field3381, ServerPacket.field3382, ServerPacket.field3383, ServerPacket.field3384, ServerPacket.field3421, ServerPacket.field3312, ServerPacket.field3387, ServerPacket.field3388, ServerPacket.field3389, ServerPacket.field3390, ServerPacket.field3326, ServerPacket.field3339, ServerPacket.field3393, ServerPacket.field3391, ServerPacket.field3395, ServerPacket.field3336, ServerPacket.field3405, ServerPacket.field3398, ServerPacket.field3399, ServerPacket.field3306, ServerPacket.field3341, ServerPacket.field3396, ServerPacket.field3403, ServerPacket.field3404, ServerPacket.field3300, ServerPacket.field3406, ServerPacket.field3328, ServerPacket.field3367, ServerPacket.field3409, ServerPacket.field3316, ServerPacket.field3411, ServerPacket.field3401, ServerPacket.field3350, ServerPacket.field3414, ServerPacket.field3415, ServerPacket.field3416, ServerPacket.field3417, ServerPacket.field3302, ServerPacket.field3419, ServerPacket.field3346};
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1209928476"
	)
	static void method3708() {
		try {
			File var0 = new File(class334.userHomeDirectory, "random.dat");
			int var2;
			if (var0.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			} else {
				label38:
				for (int var1 = 0; var1 < class136.field1621.length; ++var1) {
					for (var2 = 0; var2 < HttpRequest.field43.length; ++var2) {
						File var3 = new File(HttpRequest.field43[var2] + class136.field1621[var1] + File.separatorChar + "random.dat");
						if (var3.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0);
							break label38;
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) {
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				var2 = var4.read();
				var4.seek(0L);
				var4.write(var2);
				var4.seek(0L);
				var4.close();
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
		}

	}
}
