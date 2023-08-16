import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rv")
public abstract class class457 implements class280 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	class502 field4771;

	class457(int var1) {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;II)V",
		garbageValue = "362589282"
	)
	abstract void vmethod8312(Buffer var1, int var2);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "-87"
	)
	public void method8310(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class453 var3 = (class453)KeyHandler.findEnumerated(class418.method7713(), var2);
			if (var3 != null) {
				switch(var3.field4761) {
				case 0:
					int var4 = var1.readUnsignedByte();
					this.field4771 = SequenceDefinition.method4071(var4);
					if (this.field4771 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
				case 1:
					var1.readStringCp1252NullCircumfixed();
					break;
				case 2:
					class352[] var5 = new class352[]{class352.field4228, class352.field4225, class352.field4226, class352.field4224};
					KeyHandler.findEnumerated(var5, var1.readUnsignedByte());
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
				}
			} else {
				this.vmethod8312(var1, var2);
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2062851135"
	)
	boolean method8315() {
		return this.field4771 != null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/Object;",
		garbageValue = "-12"
	)
	Object method8314() {
		if (this.field4771 == class502.field5035) {
			return 0;
		} else if (this.field4771 == class502.field5037) {
			return -1L;
		} else {
			return this.field4771 == class502.field5030 ? "" : null;
		}
	}
}
