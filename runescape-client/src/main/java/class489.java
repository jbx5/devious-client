import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sm")
public abstract class class489 implements class305 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lue;"
	)
	class534 field5037;

	class489(int var1) {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "191575790"
	)
	abstract void vmethod8827(Buffer var1, int var2);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "799861739"
	)
	public void method8818(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class485[] var3 = new class485[]{class485.field5028, class485.field5024, class485.field5026, class485.field5027};
			class485 var4 = (class485)class210.findEnumerated(var3, var2);
			if (var4 != null) {
				switch(var4.field5025) {
				case 0:
					class379[] var6 = new class379[]{class379.field4429, class379.field4432, class379.field4430, class379.field4431};
					class210.findEnumerated(var6, var1.readUnsignedByte());
					break;
				case 1:
					var1.readStringCp1252NullCircumfixed();
					break;
				case 2:
					int var5 = var1.readUnsignedByte();
					this.field5037 = AttackOption.method2792(var5);
					if (this.field5037 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
				}
			} else {
				this.vmethod8827(var1, var2);
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1843509771"
	)
	boolean method8820() {
		return this.field5037 != null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/Object;",
		garbageValue = "-84"
	)
	Object method8821() {
		if (this.field5037 == class534.field5290) {
			return 0;
		} else if (this.field5037 == class534.field5284) {
			return -1L;
		} else {
			return this.field5037 == class534.field5286 ? "" : null;
		}
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Ldx;I)V",
		garbageValue = "-921158618"
	)
	static void method8833(NPC var0) {
		var0.field1194 = var0.definition.size;
		var0.field1259 = var0.definition.rotation;
		var0.walkSequence = var0.definition.walkSequence;
		var0.walkBackSequence = var0.definition.walkBackSequence;
		var0.walkLeftSequence = var0.definition.walkLeftSequence;
		var0.walkRightSequence = var0.definition.walkRightSequence;
		var0.idleSequence = var0.definition.idleSequence;
		var0.turnLeftSequence = var0.definition.turnLeftSequence;
		var0.turnRightSequence = var0.definition.turnRightSequence;
		var0.runSequence = var0.definition.field2000;
		var0.field1262 = var0.definition.field2006;
		var0.field1219 = var0.definition.field2002;
		var0.field1202 = var0.definition.field2029;
		var0.field1205 = var0.definition.field2004;
		var0.field1208 = var0.definition.field2005;
		var0.field1249 = var0.definition.field2011;
		var0.field1210 = var0.definition.field2007;
	}
}
