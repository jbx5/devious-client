import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("dp")
public class class117 {
	@ObfuscatedName("et")
	@ObfuscatedSignature(descriptor = "Llu;")
	@Export("archive12")
	static Archive archive12;

	@ObfuscatedName("fo")
	@ObfuscatedGetter(intValue = -605035153)
	@Export("currentPort")
	static int currentPort;

	@ObfuscatedName("o")
	boolean field1446;

	@ObfuscatedName("q")
	boolean field1434;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Ldy;")
	class116 field1435;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Ldy;")
	class116 field1436;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "[Ldd;")
	class113[] field1437;

	@ObfuscatedName("w")
	boolean field1433;

	@ObfuscatedName("z")
	float field1439;

	@ObfuscatedName("j")
	float field1440;

	@ObfuscatedName("h")
	float[] field1441 = new float[4];

	@ObfuscatedName("a")
	float[] field1442 = new float[4];

	@ObfuscatedName("d")
	boolean field1448 = true;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 1623274009)
	int field1438 = 0;

	@ObfuscatedName("x")
	float[] field1445;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -1130550585)
	int field1447;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 1061946561)
	int field1444;

	@ObfuscatedName("b")
	float field1449;

	@ObfuscatedName("l")
	float field1443;

	class117() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;II)I", garbageValue = "1712190926")
	int method2773(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		int var4 = var1.readUnsignedByte();
		class123 var5 = ((class123) (class271.findEnumerated(class306.method5767(), var4)));
		if (var5 == null) {
			var5 = class123.field1510;
		}
		int var6 = var1.readUnsignedByte();
		class116[] var7 = new class116[]{ class116.field1431, class116.field1423, class116.field1424, class116.field1425, class116.field1422 };
		class116 var8 = ((class116) (class271.findEnumerated(var7, var6)));
		if (var8 == null) {
			var8 = class116.field1431;
		}
		this.field1435 = var8;
		int var12 = var1.readUnsignedByte();
		class116[] var9 = new class116[]{ class116.field1431, class116.field1423, class116.field1424, class116.field1425, class116.field1422 };
		class116 var10 = ((class116) (class271.findEnumerated(var9, var12)));
		if (var10 == null) {
			var10 = class116.field1431;
		}
		this.field1436 = var10;
		this.field1446 = var1.readUnsignedByte() != 0;
		this.field1437 = new class113[var3];
		class113 var14 = null;
		int var13;
		for (var13 = 0; var13 < var3; ++var13) {
			class113 var11 = new class113();
			var11.method2708(var1, var2);
			this.field1437[var13] = var11;
			if (var14 != null) {
				var14.field1388 = var11;
			}
			var14 = var11;
		}
		this.field1447 = this.field1437[0].field1390;
		this.field1444 = this.field1437[this.method2785() - 1].field1390;
		this.field1445 = new float[this.method2772() + 1];
		for (var13 = this.method2769(); var13 <= this.method2775(); ++var13) {
			this.field1445[var13 - this.method2769()] = MouseHandler.method600(this, ((float) (var13)));
		}
		this.field1437 = null;
		this.field1449 = MouseHandler.method600(this, ((float) (this.method2769() - 1)));
		this.field1443 = MouseHandler.method600(this, ((float) (this.method2775() + 1)));
		return var3;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)F", garbageValue = "-1139151310")
	public float method2777(int var1) {
		if (var1 < this.method2769()) {
			return this.field1449;
		} else {
			return var1 > this.method2775() ? this.field1443 : this.field1445[var1 - this.method2769()];
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-24")
	int method2769() {
		return this.field1447;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-828010612")
	int method2775() {
		return this.field1444;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "323526183")
	int method2772() {
		return this.method2775() - this.method2769();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(FI)I", garbageValue = "-1662333309")
	int method2771(float var1) {
		if (this.field1438 < 0 || !(((float) (this.field1437[this.field1438].field1390)) <= var1) || this.field1437[this.field1438].field1388 != null && !(((float) (this.field1437[this.field1438].field1388.field1390)) > var1)) {
			if (!(var1 < ((float) (this.method2769()))) && !(var1 > ((float) (this.method2775())))) {
				int var2 = this.method2785();
				int var3 = this.field1438;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;
					do {
						int var6 = var4 + var5 >> 1;
						if (var1 < ((float) (this.field1437[var6].field1390))) {
							if (var1 > ((float) (this.field1437[var6 - 1].field1390))) {
								var3 = var6 - 1;
								break;
							}
							var5 = var6 - 1;
						} else {
							if (!(var1 > ((float) (this.field1437[var6].field1390)))) {
								var3 = var6;
								break;
							}
							if (var1 < ((float) (this.field1437[var6 + 1].field1390))) {
								var3 = var6;
								break;
							}
							var4 = var6 + 1;
						}
					} while (var4 <= var5 );
				}
				if (var3 != this.field1438) {
					this.field1438 = var3;
					this.field1448 = true;
				}
				return this.field1438;
			} else {
				return -1;
			}
		} else {
			return this.field1438;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(FI)Ldd;", garbageValue = "-1944565910")
	class113 method2774(float var1) {
		int var2 = this.method2771(var1);
		return var2 >= 0 && var2 < this.field1437.length ? this.field1437[var2] : null;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1901581488")
	int method2785() {
		return this.field1437 == null ? 0 : this.field1437.length;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "(ILbc;ZB)I", garbageValue = "4")
	static int method2793(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			TaskHandler.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
			EnumComposition var10 = class174.getEnum(var3);
			if (var10.outputType != 's') {
			}
			for (var6 = 0; var6 < var10.outputCount; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}
			if (var10 != null) {
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}
			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				EnumComposition var4 = class174.getEnum(var3);
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			TaskHandler.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 3];
			EnumComposition var7 = class174.getEnum(var5);
			if (var3 == var7.inputType && var9 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}
						var7 = null;
						break;
					}
				}
				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}
				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
				}
				return 1;
			}
		}
	}
}