import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sl")
public abstract class class472 implements class294 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	class517 field4816;

	class472(int var1) {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;IS)V",
		garbageValue = "6664"
	)
	abstract void vmethod8471(Buffer var1, int var2);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-1679983256"
	)
	public void method8465(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class468 var3 = (class468)SequenceDefinition.findEnumerated(class30.method449(), var2);
			if (var3 != null) {
				switch(var3.field4809) {
				case 0:
					int var5 = var1.readUnsignedByte();
					this.field4816 = Tile.method4516(var5);
					if (this.field4816 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
				case 1:
					var1.readStringCp1252NullCircumfixed();
					break;
				case 2:
					class367[] var4 = new class367[]{class367.field4263, class367.field4260, class367.field4261, class367.field4259};
					SequenceDefinition.findEnumerated(var4, var1.readUnsignedByte());
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
				}
			} else {
				this.vmethod8471(var1, var2);
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1797957438"
	)
	boolean method8466() {
		return this.field4816 != null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "1069039915"
	)
	Object method8470() {
		if (this.field4816 == class517.field5067) {
			return 0;
		} else if (this.field4816 == class517.field5066) {
			return -1L;
		} else {
			return this.field4816 == class517.field5065 ? "" : null;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Luf;",
		garbageValue = "-1429373012"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.field5222, FillMode.SOLID, FillMode.field5221};
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZB)I",
		garbageValue = "47"
	)
	static int method8475(int var0, Script var1, boolean var2) {
		if (var0 == 7463) {
			boolean var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			class330.method6204(var3);
			return 1;
		} else {
			return 2;
		}
	}
}
