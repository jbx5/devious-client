import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
	@ObfuscatedName("tp")
	@ObfuscatedGetter(intValue = 
	-1270169191)

	static int field2065;
	@ObfuscatedName("v")
	@Export("ObjectDefinition_isLowDetail")
	public static boolean ObjectDefinition_isLowDetail;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lln;")

	@Export("ObjectDefinition_modelsArchive")
	public static AbstractArchive ObjectDefinition_modelsArchive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("ObjectDefinition_cached")
	static EvictingDualNodeHashTable ObjectDefinition_cached;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("ObjectDefinition_cachedModelData")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("ObjectDefinition_cachedEntities")
	static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("ObjectDefinition_cachedModels")
	static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"[Lhc;")

	static ModelData[] field2020;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	-1590595383)

	@Export("id")
	public int id;
	@ObfuscatedName("o")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("r")
	@Export("models")
	int[] models;
	@ObfuscatedName("p")
	@Export("name")
	public String name;
	@ObfuscatedName("w")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("k")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("d")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("m")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	-2085287383)

	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 
	-876347031)

	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	-1883412293)

	@Export("interactType")
	public int interactType;
	@ObfuscatedName("x")
	@Export("boolean1")
	public boolean boolean1;
	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 
	-906830101)

	@Export("int1")
	public int int1;
	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 
	-763814967)

	@Export("clipType")
	int clipType;
	@ObfuscatedName("j")
	@Export("nonFlatShading")
	boolean nonFlatShading;
	@ObfuscatedName("e")
	@Export("modelClipped")
	public boolean modelClipped;
	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 
	-163974259)

	@Export("animationId")
	public int animationId;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	2136398039)

	@Export("int2")
	public int int2;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(intValue = 
	1916202791)

	@Export("ambient")
	int ambient;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(intValue = 
	-726394467)

	@Export("contrast")
	int contrast;
	@ObfuscatedName("aw")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("am")
	@ObfuscatedGetter(intValue = 
	2034901073)

	@Export("mapIconId")
	public int mapIconId;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(intValue = 
	-297146651)

	@Export("mapSceneId")
	public int mapSceneId;
	@ObfuscatedName("ao")
	@Export("isRotated")
	boolean isRotated;
	@ObfuscatedName("aj")
	@Export("clipped")
	public boolean clipped;
	@ObfuscatedName("al")
	@ObfuscatedGetter(intValue = 
	1276797079)

	@Export("modelSizeX")
	int modelSizeX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(intValue = 
	-64921)

	@Export("modelHeight")
	int modelHeight;
	@ObfuscatedName("at")
	@ObfuscatedGetter(intValue = 
	-473772847)

	@Export("modelSizeY")
	int modelSizeY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(intValue = 
	-852003755)

	@Export("offsetX")
	int offsetX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(intValue = 
	232493773)

	@Export("offsetHeight")
	int offsetHeight;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(intValue = 
	1389514563)

	@Export("offsetY")
	int offsetY;
	@ObfuscatedName("ah")
	@Export("boolean2")
	public boolean boolean2;
	@ObfuscatedName("ac")
	@Export("isSolid")
	boolean isSolid;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(intValue = 
	1878888665)

	@Export("int3")
	public int int3;
	@ObfuscatedName("au")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("af")
	@ObfuscatedGetter(intValue = 
	-729176201)

	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(intValue = 
	-2043045051)

	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(intValue = 
	-1644497933)

	@Export("ambientSoundId")
	public int ambientSoundId;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(intValue = 
	-1328611557)

	@Export("int7")
	public int int7;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(intValue = 
	-171517787)

	@Export("int5")
	public int int5;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(intValue = 
	398628539)

	@Export("int6")
	public int int6;
	@ObfuscatedName("az")
	@Export("soundEffectIds")
	public int[] soundEffectIds;
	@ObfuscatedName("as")
	@Export("boolean3")
	public boolean boolean3;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(descriptor = 
	"Lpt;")

	@Export("params")
	IterableNodeHashTable params;
	static 
	{
		ObjectDefinition_isLowDetail = false;
		ObjectDefinition_cached = new EvictingDualNodeHashTable(4096);
		ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500);
		ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30);
		ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30);
		field2020 = new ModelData[4];
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
		this.int5 = 0;
		this.int6 = 0;
		this.boolean3 = true;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"2")

	@Export("postDecode")
	void postDecode() {
		if (this.int1 == (-1)) {
			this.int1 = 0;
			if ((this.modelIds != null) && ((this.models == null) || (this.models[0] == 10))) {
				this.int1 = 1;
			}

			for (int var1 = 0; var1 < 5; ++var1) {
				if (this.actions[var1] != null) {
					this.int1 = 1;
				}
			}
		}

		if (this.int3 == (-1)) {
			this.int3 = (this.interactType != 0) ? 1 : 0;
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"-1801029007")

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

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;II)V", garbageValue = 
	"-1971745226")

	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedByte();
			if (var3 > 0) {
				if ((this.modelIds != null) && (!ObjectDefinition_isLowDetail)) {
					var1.offset += var3 * 3;
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
				if ((this.modelIds != null) && (!ObjectDefinition_isLowDetail)) {
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
		} else if ((var2 != 77) && (var2 != 92)) {
			if (var2 == 78) {
				this.ambientSoundId = var1.readUnsignedShort();
				this.int7 = var1.readUnsignedByte();
			} else if (var2 == 79) {
				this.int5 = var1.readUnsignedShort();
				this.int6 = var1.readUnsignedShort();
				this.int7 = var1.readUnsignedByte();
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
				this.params = class214.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(II)Z", garbageValue = 
	"683516334")

	public final boolean method3664(int var1) {
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-1481046668")

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

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(II[[IIIIB)Lix;", garbageValue = 
	"84")

	@Export("getEntity")
	public final Renderable getEntity(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) {
			var7 = ((long) (var2 + (this.id << 10)));
		} else {
			var7 = ((long) ((var2 + (var1 << 3)) + (this.id << 10)));
		}

		Object var9 = ((Renderable) (ObjectDefinition_cachedEntities.get(var7)));
		if (var9 == null) {
			ModelData var10 = this.getModelData(var1, var2);
			if (var10 == null) {
				return null;
			}

			if (!this.nonFlatShading) {
				var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			} else {
				var10.ambient = ((short) (this.ambient + 64));
				var10.contrast = ((short) (this.contrast + 768));
				var10.calculateVertexNormals();
				var9 = var10;
			}

			ObjectDefinition_cachedEntities.put(((DualNode) (var9)), var7);
		}

		if (this.nonFlatShading) {
			var9 = ((ModelData) (var9)).copyModelData();
		}

		if (this.clipType >= 0) {
			if (var9 instanceof Model) {
				var9 = ((Model) (var9)).contourGround(var3, var4, var5, var6, true, this.clipType);
			} else if (var9 instanceof ModelData) {
				var9 = ((ModelData) (var9)).method4517(var3, var4, var5, var6, true, this.clipType);
			}
		}

		return ((Renderable) (var9));
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(II[[IIIII)Liq;", garbageValue = 
	"-261368298")

	@Export("getModel")
	public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) {
			var7 = ((long) (var2 + (this.id << 10)));
		} else {
			var7 = ((long) ((var2 + (var1 << 3)) + (this.id << 10)));
		}

		Model var9 = ((Model) (ObjectDefinition_cachedModels.get(var7)));
		if (var9 == null) {
			ModelData var10 = this.getModelData(var1, var2);
			if (var10 == null) {
				return null;
			}

			var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			ObjectDefinition_cachedModels.put(var9, var7);
		}

		if (this.clipType >= 0) {
			var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType);
		}

		return var9;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(II[[IIIILgw;II)Liq;", garbageValue = 
	"1099870493")

	@Export("getModelDynamic")
	public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
		long var9;
		if (this.models == null) {
			var9 = ((long) (var2 + (this.id << 10)));
		} else {
			var9 = ((long) ((var2 + (var1 << 3)) + (this.id << 10)));
		}

		Model var11 = ((Model) (ObjectDefinition_cachedModels.get(var9)));
		if (var11 == null) {
			ModelData var12 = this.getModelData(var1, var2);
			if (var12 == null) {
				return null;
			}

			var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			ObjectDefinition_cachedModels.put(var11, var9);
		}

		if ((var7 == null) && (this.clipType == (-1))) {
			return var11;
		} else {
			if (var7 != null) {
				var11 = var7.transformObjectModel(var11, var8, var2);
			} else {
				var11 = var11.toSharedSequenceModel(true);
			}

			if (this.clipType >= 0) {
				var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType);
			}

			return var11;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(III)Lhc;", garbageValue = 
	"1620081906")

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
			if ((var1 == 2) && (var2 > 3)) {
				var4 = !var4;
			}

			var5 = this.modelIds.length;

			for (int var6 = 0; var6 < var5; ++var6) {
				var7 = this.modelIds[var6];
				if (var4) {
					var7 += 65536;
				}

				var3 = ((ModelData) (ObjectDefinition_cachedModelData.get(((long) (var7)))));
				if (var3 == null) {
					var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var7 & 65535, 0);
					if (var3 == null) {
						return null;
					}

					if (var4) {
						var3.method4526();
					}

					ObjectDefinition_cachedModelData.put(var3, ((long) (var7)));
				}

				if (var5 > 1) {
					field2020[var6] = var3;
				}
			}

			if (var5 > 1) {
				var3 = new ModelData(field2020, var5);
			}
		} else {
			int var9 = -1;

			for (var5 = 0; var5 < this.models.length; ++var5) {
				if (this.models[var5] == var1) {
					var9 = var5;
					break;
				}
			}

			if (var9 == (-1)) {
				return null;
			}

			var5 = this.modelIds[var9];
			boolean var10 = this.isRotated ^ (var2 > 3);
			if (var10) {
				var5 += 65536;
			}

			var3 = ((ModelData) (ObjectDefinition_cachedModelData.get(((long) (var5)))));
			if (var3 == null) {
				var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var5 & 65535, 0);
				if (var3 == null) {
					return null;
				}

				if (var10) {
					var3.method4526();
				}

				ObjectDefinition_cachedModelData.put(var3, ((long) (var5)));
			}
		}

		if (((this.modelSizeX == 128) && (this.modelHeight == 128)) && (this.modelSizeY == 128)) {
			var4 = false;
		} else {
			var4 = true;
		}

		boolean var11;
		if (((this.offsetX == 0) && (this.offsetHeight == 0)) && (this.offsetY == 0)) {
			var11 = false;
		} else {
			var11 = true;
		}

		ModelData var8 = new ModelData(var3, ((var2 == 0) && (!var4)) && (!var11), null == this.recolorFrom, this.retextureFrom == null, true);
		if ((var1 == 4) && (var2 > 3)) {
			var8.method4512(256);
			var8.changeOffset(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1) {
			var8.method4553();
		} else if (var2 == 2) {
			var8.method4520();
		} else if (var2 == 3) {
			var8.method4521();
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(B)Lgj;", garbageValue = 
	"32")

	@Export("transform")
	public final ObjectComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != (-1)) {
			var1 = SecureRandomCallable.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != (-1)) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if ((var1 >= 0) && (var1 < (this.transforms.length - 1))) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != (-1) ? class146.getObjectDefinition(var2) : null;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(IIB)I", garbageValue = 
	"104")

	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params;
		int var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			IntegerNode var5 = ((IntegerNode) (var4.get(((long) (var1)))));
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = var5.integer;
			}
		}

		return var3;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(ILjava/lang/String;I)Ljava/lang/String;", garbageValue = 
	"1640621220")

	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params;
		String var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			ObjectNode var5 = ((ObjectNode) (var4.get(((long) (var1)))));
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = ((String) (var5.obj));
			}
		}

		return var3;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"45")

	@Export("hasSound")
	public boolean hasSound() {
		if (this.transforms == null) {
			return (this.ambientSoundId != (-1)) || (this.soundEffectIds != null);
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) {
				if (this.transforms[var1] != (-1)) {
					ObjectComposition var2 = class146.getObjectDefinition(this.transforms[var1]);
					if ((var2.ambientSoundId != (-1)) || (var2.soundEffectIds != null)) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(II)Lgh;", garbageValue = 
	"2086980764")

	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = ((StructComposition) (StructComposition.StructDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1937470798")

	static void method3674() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = ((Message) (var0.next()));
			var1.clearIsFromFriend();
		} 

	}
}