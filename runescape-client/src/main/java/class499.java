import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tv")
public abstract class class499 implements class308 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	class544 field5126;

	class499(int var1) {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;II)V",
		garbageValue = "-1750278900"
	)
	abstract void vmethod9347(Buffer var1, int var2);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "534052529"
	)
	public void method9346(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class495 var3 = (class495)class177.findEnumerated(class429.method8337(), var2);
			if (var3 != null) {
				switch(var3.field5120) {
				case 0:
					int var5 = var1.readUnsignedByte();
					this.field5126 = JagexCache.method4512(var5);
					if (this.field5126 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
				case 1:
					class383[] var4 = new class383[]{class383.field4495, class383.field4493, class383.field4496, class383.field4494};
					class177.findEnumerated(var4, var1.readUnsignedByte());
					break;
				case 2:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
				case 3:
					var1.readStringCp1252NullCircumfixed();
				}
			} else {
				this.vmethod9347(var1, var2);
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1935826085"
	)
	boolean method9355() {
		return this.field5126 != null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "-1606353224"
	)
	Object method9348() {
		if (this.field5126 == class544.field5385) {
			return 0;
		} else if (this.field5126 == class544.field5380) {
			return -1L;
		} else {
			return this.field5126 == class544.field5381 ? "" : null;
		}
	}
}
