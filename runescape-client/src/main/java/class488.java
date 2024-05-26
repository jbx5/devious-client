import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sp")
public abstract class class488 implements class304 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	class533 field5010;

	class488(int var1) {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;II)V",
		garbageValue = "-1280674805"
	)
	abstract void vmethod8915(Buffer var1, int var2);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "1924757991"
	)
	public void method8914(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class484 var3 = (class484)MenuAction.findEnumerated(ScriptFrame.method1168(), var2);
			if (var3 != null) {
				switch(var3.field5002) {
				case 0:
					MenuAction.findEnumerated(SecureRandomFuture.method2203(), var1.readUnsignedByte());
					break;
				case 1:
					var1.readStringCp1252NullCircumfixed();
					break;
				case 2:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
				case 3:
					int var4 = var1.readUnsignedByte();
					this.field5010 = WorldMapIcon_1.method5497(var4);
					if (this.field5010 == null) {
						throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
					}
				}
			} else {
				this.vmethod8915(var1, var2);
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "155"
	)
	boolean method8916() {
		return this.field5010 != null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "-1730136676"
	)
	Object method8922() {
		if (this.field5010 == class533.field5263) {
			return 0;
		} else if (this.field5010 == class533.field5266) {
			return -1L;
		} else {
			return this.field5010 == class533.field5267 ? "" : null;
		}
	}
}
