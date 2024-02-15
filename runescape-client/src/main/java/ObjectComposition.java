import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
	@ObfuscatedName("aq")
	@Export("ObjectDefinition_isLowDetail")
	public static boolean ObjectDefinition_isLowDetail;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("ObjectDefinition_archive")
	public static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("ObjectDefinition_modelsArchive")
	public static AbstractArchive ObjectDefinition_modelsArchive;
	@ObfuscatedName("ai")
	@Export("ObjectDefinition_isRev220SoundData")
	public static boolean ObjectDefinition_isRev220SoundData;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("ObjectDefinition_cached")
	static EvictingDualNodeHashTable ObjectDefinition_cached;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("ObjectDefinition_cachedModelData")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("ObjectDefinition_cachedEntities")
	static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("ObjectDefinition_cachedModels")
	static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lkf;"
	)
	@Export("modelDataArray")
	static ModelData[] modelDataArray;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -741461527
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ak")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("ah")
	@Export("models")
	int[] models;
	@ObfuscatedName("aj")
	@Export("name")
	public String name;
	@ObfuscatedName("af")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ax")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("an")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ag")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -268458779
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 500074863
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 937195717
	)
	@Export("interactType")
	public int interactType;
	@ObfuscatedName("ay")
	@Export("boolean1")
	public boolean boolean1;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1089834539
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1378373733
	)
	@Export("clipType")
	int clipType;
	@ObfuscatedName("ab")
	@Export("nonFlatShading")
	boolean nonFlatShading;
	@ObfuscatedName("av")
	@Export("modelClipped")
	public boolean modelClipped;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1635606557
	)
	@Export("animationId")
	public int animationId;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -2045658089
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1344279479
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1245071989
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bi")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1058156917
	)
	@Export("mapIconId")
	public int mapIconId;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -859238543
	)
	@Export("mapSceneId")
	public int mapSceneId;
	@ObfuscatedName("bt")
	@Export("isRotated")
	boolean isRotated;
	@ObfuscatedName("bk")
	@Export("clipped")
	public boolean clipped;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 149883361
	)
	@Export("modelSizeX")
	int modelSizeX;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -766936121
	)
	@Export("modelHeight")
	int modelHeight;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 106296047
	)
	@Export("modelSizeY")
	int modelSizeY;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1194549815
	)
	@Export("offsetX")
	int offsetX;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 160074193
	)
	@Export("offsetHeight")
	int offsetHeight;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1266365157
	)
	@Export("offsetY")
	int offsetY;
	@ObfuscatedName("br")
	@Export("boolean2")
	public boolean boolean2;
	@ObfuscatedName("bp")
	@Export("isSolid")
	boolean isSolid;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 407817173
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("bg")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 738400603
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -873573755
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 363387855
	)
	@Export("ambientSoundId")
	public int ambientSoundId;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1109311488
	)
	@Export("int7")
	public int int7;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 467288064
	)
	@Export("int8")
	public int int8;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -826106219
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1359996533
	)
	@Export("int6")
	public int int6;
	@ObfuscatedName("bx")
	@Export("soundEffectIds")
	public int[] soundEffectIds;
	@ObfuscatedName("cs")
	@Export("boolean3")
	public boolean boolean3;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		ObjectDefinition_isLowDetail = false;
		ObjectDefinition_isRev220SoundData = false;
		ObjectDefinition_cached = new EvictingDualNodeHashTable(4096);
		ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500);
		ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30);
		ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30);
		modelDataArray = new ModelData[4];
	}

	ObjectComposition() {
		this.name = "null";
		this.sizeX = 1;
		this.sizeY = 1;
		this.interactType = 2;
		this.boolean1 = true;
		this.int1 = -1;
		this.clipType = -1;
		this.nonFlatShading = false;
		this.modelClipped = false;
		this.animationId = -1;
		this.int2 = 16;
		this.ambient = 0;
		this.contrast = 0;
		this.actions = new String[5];
		this.mapIconId = -1;
		this.mapSceneId = -1;
		this.isRotated = false;
		this.clipped = true;
		this.modelSizeX = 128;
		this.modelHeight = 128;
		this.modelSizeY = 128;
		this.offsetX = 0;
		this.offsetHeight = 0;
		this.offsetY = 0;
		this.boolean2 = false;
		this.isSolid = false;
		this.int3 = -1;
		this.transformVarbit = -1;
		this.transformVarp = -1;
		this.ambientSoundId = -1;
		this.int7 = 0;
		this.int8 = 0;
		this.int5 = 0;
		this.int6 = 0;
		this.boolean3 = true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.int1 == -1) {
			this.int1 = 0;
			if (this.modelIds != null && (this.models == null || this.models[0] == 10)) {
				this.int1 = 1;
			}

			for (int var1 = 0; var1 < 5; ++var1) {
				if (this.actions[var1] != null) {
					this.int1 = 1;
				}
			}
		}

		if (this.int3 == -1) {
			this.int3 = this.interactType != 0 ? 1 : 0;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;B)V",
		garbageValue = "16"
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
		garbageValue = "-1457313281"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedByte();
			if (var3 > 0) {
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
					var1.offset += 3 * var3;
				} else {
					this.models = new int[var3];
					this.modelIds = new int[var3];

					for (var4 = 0; var4 < var3; ++var4) {
						this.modelIds[var4] = var1.readUnsignedShort();
						this.models[var4] = var1.readUnsignedByte();
					}
				}
			}
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 5) {
			var3 = var1.readUnsignedByte();
			if (var3 > 0) {
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
					var1.offset += 2 * var3;
				} else {
					this.models = null;
					this.modelIds = new int[var3];

					for (var4 = 0; var4 < var3; ++var4) {
						this.modelIds[var4] = var1.readUnsignedShort();
					}
				}
			}
		} else if (var2 == 14) {
			this.sizeX = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.sizeY = var1.readUnsignedByte();
		} else if (var2 == 17) {
			this.interactType = 0;
			this.boolean1 = false;
		} else if (var2 == 18) {
			this.boolean1 = false;
		} else if (var2 == 19) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 21) {
			this.clipType = 0;
		} else if (var2 == 22) {
			this.nonFlatShading = true;
		} else if (var2 == 23) {
			this.modelClipped = true;
		} else if (var2 == 24) {
			this.animationId = var1.readUnsignedShort();
			if (this.animationId == 65535) {
				this.animationId = -1;
			}
		} else if (var2 == 27) {
			this.interactType = 1;
		} else if (var2 == 28) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 29) {
			this.ambient = var1.readByte();
		} else if (var2 == 39) {
			this.contrast = var1.readByte() * 25;
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
		} else if (var2 == 61) {
			var1.readUnsignedShort();
		} else if (var2 == 62) {
			this.isRotated = true;
		} else if (var2 == 64) {
			this.clipped = false;
		} else if (var2 == 65) {
			this.modelSizeX = var1.readUnsignedShort();
		} else if (var2 == 66) {
			this.modelHeight = var1.readUnsignedShort();
		} else if (var2 == 67) {
			this.modelSizeY = var1.readUnsignedShort();
		} else if (var2 == 68) {
			this.mapSceneId = var1.readUnsignedShort();
		} else if (var2 == 69) {
			var1.readUnsignedByte();
		} else if (var2 == 70) {
			this.offsetX = var1.readShort();
		} else if (var2 == 71) {
			this.offsetHeight = var1.readShort();
		} else if (var2 == 72) {
			this.offsetY = var1.readShort();
		} else if (var2 == 73) {
			this.boolean2 = true;
		} else if (var2 == 74) {
			this.isSolid = true;
		} else if (var2 == 75) {
			this.int3 = var1.readUnsignedByte();
		} else if (var2 != 77 && var2 != 92) {
			if (var2 == 78) {
				this.ambientSoundId = var1.readUnsignedShort();
				this.int7 = var1.readUnsignedByte() * 16384;
				this.int8 = (ObjectDefinition_isRev220SoundData ? var1.readUnsignedByte() : 0) * 16384;
			} else if (var2 == 79) {
				this.int5 = var1.readUnsignedShort();
				this.int6 = var1.readUnsignedShort();
				this.int7 = var1.readUnsignedByte() * 16384;
				this.int8 = (ObjectDefinition_isRev220SoundData ? var1.readUnsignedByte() : 0) * 16384;
				var3 = var1.readUnsignedByte();
				this.soundEffectIds = new int[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.soundEffectIds[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 81) {
				this.clipType = var1.readUnsignedByte() * 256;
			} else if (var2 == 82) {
				this.mapIconId = var1.readUnsignedShort();
			} else if (var2 == 89) {
				this.boolean3 = false;
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
			if (var2 == 92) {
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-623242503"
	)
	public final boolean method3925(int var1) {
		if (this.models != null) {
			for (int var4 = 0; var4 < this.models.length; ++var4) {
				if (this.models[var4] == var1) {
					return ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0);
				}
			}

			return true;
		} else if (this.modelIds == null) {
			return true;
		} else if (var1 != 10) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.modelIds.length; ++var3) {
				var2 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0);
			}

			return var2;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "28"
	)
	@Export("needsModelFiles")
	public final boolean needsModelFiles() {
		if (this.modelIds == null) {
			return true;
		} else {
			boolean var1 = true;

			for (int var2 = 0; var2 < this.modelIds.length; ++var2) {
				var1 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 65535, 0);
			}

			return var1;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Lky;",
		garbageValue = "1924118332"
	)
	@Export("getEntity")
	public final Renderable getEntity(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) {
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10));
		}

		Object var9 = (Renderable)ObjectDefinition_cachedEntities.get(var7);
		if (var9 == null) {
			ModelData var10 = this.getModelData(var1, var2);
			if (var10 == null) {
				return null;
			}

			if (!this.nonFlatShading) {
				var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			} else {
				var10.ambient = (short)(this.ambient + 64);
				var10.contrast = (short)(this.contrast + 768);
				var10.calculateVertexNormals();
				var9 = var10;
			}

			ObjectDefinition_cachedEntities.put((DualNode)var9, var7);
		}

		if (this.nonFlatShading) {
			var9 = ((ModelData)var9).copyModelData();
		}

		if (this.clipType * 65536 >= 0) {
			if (var9 instanceof Model) {
				var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType * 65536);
			} else if (var9 instanceof ModelData) {
				var9 = ((ModelData)var9).method5182(var3, var4, var5, var6, true, this.clipType * 65536);
			}
		}

		return (Renderable)var9;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Lkz;",
		garbageValue = "-1898420221"
	)
	@Export("getModel")
	public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) {
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10));
		}

		Model var9 = (Model)ObjectDefinition_cachedModels.get(var7);
		if (var9 == null) {
			ModelData var10 = this.getModelData(var1, var2);
			if (var10 == null) {
				return null;
			}

			var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			ObjectDefinition_cachedModels.put(var9, var7);
		}

		if (this.clipType * 65536 >= 0) {
			var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType * 65536);
		}

		return var9;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIILhs;IB)Lkz;",
		garbageValue = "-113"
	)
	@Export("getModelDynamic")
	public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
		long var9;
		if (this.models == null) {
			var9 = (long)(var2 + (this.id << 10));
		} else {
			var9 = (long)(var2 + (var1 << 3) + (this.id << 10));
		}

		Model var11 = (Model)ObjectDefinition_cachedModels.get(var9);
		if (var11 == null) {
			ModelData var12 = this.getModelData(var1, var2);
			if (var12 == null) {
				return null;
			}

			var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			ObjectDefinition_cachedModels.put(var11, var9);
		}

		if (var7 == null && this.clipType * 65536 == -1) {
			return var11;
		} else {
			if (var7 != null) {
				var11 = var7.transformObjectModel(var11, var8, var2);
			} else {
				var11 = var11.toSharedSequenceModel(true);
			}

			if (this.clipType * 65536 >= 0) {
				var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType * 65536);
			}

			return var11;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Lkf;",
		garbageValue = "-1547269588"
	)
	@Export("getModelData")
	final ModelData getModelData(int var1, int var2) {
		ModelData var3 = null;
		boolean var4;
		int var5;
		int var7;
		if (this.models == null) {
			if (var1 != 10) {
				return null;
			}

			if (this.modelIds == null) {
				return null;
			}

			var4 = this.isRotated;
			if (var1 == 2 && var2 > 3) {
				var4 = !var4;
			}

			var5 = this.modelIds.length;

			for (int var6 = 0; var6 < var5; ++var6) {
				var7 = this.modelIds[var6];
				if (var4) {
					var7 += 65536;
				}

				var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var7);
				if (var3 == null) {
					var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var7 & 65535, 0);
					if (var3 == null) {
						return null;
					}

					if (var4) {
						var3.method5256();
					}

					ObjectDefinition_cachedModelData.put(var3, (long)var7);
				}

				if (var5 > 1) {
					modelDataArray[var6] = var3;
				}
			}

			if (var5 > 1) {
				var3 = new ModelData(modelDataArray, var5);
			}
		} else {
			int var9 = -1;

			for (var5 = 0; var5 < this.models.length; ++var5) {
				if (this.models[var5] == var1) {
					var9 = var5;
					break;
				}
			}

			if (var9 == -1) {
				return null;
			}

			var5 = this.modelIds[var9];
			boolean var10 = this.isRotated ^ var2 > 3;
			if (var10) {
				var5 += 65536;
			}

			var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var5);
			if (var3 == null) {
				var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var5 & 65535, 0);
				if (var3 == null) {
					return null;
				}

				if (var10) {
					var3.method5256();
				}

				ObjectDefinition_cachedModelData.put(var3, (long)var5);
			}
		}

		if (this.modelSizeX == 128 && this.modelHeight == 128 && this.modelSizeY == 128) {
			var4 = false;
		} else {
			var4 = true;
		}

		boolean var11;
		if (this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0) {
			var11 = false;
		} else {
			var11 = true;
		}

		ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, null == this.recolorFrom, this.retextureFrom == null, true);
		if (var1 == 4 && var2 > 3) {
			var8.method5187(256);
			var8.changeOffset(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1) {
			var8.method5184();
		} else if (var2 == 2) {
			var8.method5177();
		} else if (var2 == 3) {
			var8.method5186();
		}

		if (this.recolorFrom != null) {
			for (var7 = 0; var7 < this.recolorFrom.length; ++var7) {
				var8.recolor(this.recolorFrom[var7], this.recolorTo[var7]);
			}
		}

		if (this.retextureFrom != null) {
			for (var7 = 0; var7 < this.retextureFrom.length; ++var7) {
				var8.retexture(this.retextureFrom[var7], this.retextureTo[var7]);
			}
		}

		if (var4) {
			var8.resize(this.modelSizeX, this.modelHeight, this.modelSizeY);
		}

		if (var11) {
			var8.changeOffset(this.offsetX, this.offsetHeight, this.offsetY);
		}

		return var8;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lhe;",
		garbageValue = "-1174034912"
	)
	@Export("transform")
	public final ObjectComposition transform() {
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

		return var2 != -1 ? class127.getObjectDefinition(var2) : null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "699962041"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "2"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1958511328"
	)
	@Export("hasSound")
	public boolean hasSound() {
		if (this.transforms == null) {
			return this.ambientSoundId != -1 || this.soundEffectIds != null;
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) {
				if (this.transforms[var1] != -1) {
					ObjectComposition var2 = class127.getObjectDefinition(this.transforms[var1]);
					if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) {
						return true;
					}
				}
			}

			return false;
		}
	}
}
