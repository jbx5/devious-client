import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("fv")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("KitDefinition_archive")
	static AbstractArchive KitDefinition_archive;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("KitDefinition_modelsArchive")
	static AbstractArchive KitDefinition_modelsArchive;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1273507349)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Liz;")
	@Export("KitDefinition_cached")
	static EvictingDualNodeHashTable KitDefinition_cached = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("ew")
	@ObfuscatedSignature(descriptor = "Lln;")
	@Export("archive10")
	static Archive archive10;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1346029147)
	@Export("bodypartID")
	public int bodypartID = -1;

	@ObfuscatedName("q")
	@Export("models2")
	int[] models2;

	@ObfuscatedName("i")
	@Export("recolorFrom")
	short[] recolorFrom;

	@ObfuscatedName("k")
	@Export("recolorTo")
	short[] recolorTo;

	@ObfuscatedName("o")
	@Export("retextureFrom")
	short[] retextureFrom;

	@ObfuscatedName("n")
	@Export("retextureTo")
	short[] retextureTo;

	@ObfuscatedName("d")
	@Export("models")
	int[] models = new int[]{ -1, -1, -1, -1, -1 };

	@ObfuscatedName("a")
	@Export("nonSelectable")
	public boolean nonSelectable = false;

	KitDefinition() {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "113533312")
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lqr;IB)V", garbageValue = "4")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.bodypartID = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) {
				var3 = var1.readUnsignedByte();
				this.models2 = new int[var3];
				for (var4 = 0; var4 < var3; ++var4) {
					this.models2[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) {
				this.nonSelectable = true;
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
			} else if (var2 >= 60 && var2 < 70) {
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1850904854")
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) {
			return true;
		} else {
			boolean var1 = true;
			for (int var2 = 0; var2 < this.models2.length; ++var2) {
				if (!KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}
			return var1;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(B)Lgp;", garbageValue = "86")
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) {
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length];
			for (int var2 = 0; var2 < this.models2.length; ++var2) {
				var1[var2] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models2[var2], 0);
			}
			ModelData var4;
			if (var1.length == 1) {
				var4 = var1[0];
			} else {
				var4 = new ModelData(var1, var1.length);
			}
			int var3;
			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
				}
			}
			if (this.retextureFrom != null) {
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}
			return var4;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "894950921")
	public boolean method3351() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; ++var2) {
			if (this.models[var2] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(I)Lgp;", garbageValue = "1970122407")
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; ++var3) {
			if (this.models[var3] != -1) {
				var1[var2++] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models[var3], 0);
			}
		}
		ModelData var5 = new ModelData(var1, var2);
		int var4;
		if (this.recolorFrom != null) {
			for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
				var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
			}
		}
		if (this.retextureFrom != null) {
			for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
				var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
			}
		}
		return var5;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "170123111")
	static String method3349() {
		return ClanMate.clientPreferences.method2211() ? NPCComposition.method3410(Login.Login_username) : Login.Login_username;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(descriptor = "(ILbz;ZI)I", garbageValue = "1955170611")
	static int method3336(int var0, Script var1, boolean var2) {
		if (var0 == 7400) {
			--User.Interpreter_intStackSize;
			--UserComparator8.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7401) {
			--User.Interpreter_intStackSize;
			--UserComparator8.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7402) {
			User.Interpreter_intStackSize -= 2;
			--UserComparator8.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7403) {
			User.Interpreter_intStackSize -= 2;
			--UserComparator8.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7404) {
			--User.Interpreter_intStackSize;
			--UserComparator8.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7405) {
			User.Interpreter_intStackSize -= 2;
			return 1;
		} else if (var0 == 7406) {
			--User.Interpreter_intStackSize;
			Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 == 7407) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 7408) {
			User.Interpreter_intStackSize -= 2;
			--UserComparator8.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 7409) {
			--User.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7463) {
			boolean var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
			ApproximateRouteStrategy.method1071(var3);
			return 1;
		} else {
			return 2;
		}
	}
}