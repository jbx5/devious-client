import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sz")
public abstract class class492 implements class309 {
	@ObfuscatedName("db")
	static boolean field5083;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	class537 field5081;

	class492(int var1) {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;IB)V",
		garbageValue = "0"
	)
	abstract void vmethod9169(Buffer var1, int var2);

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "-609977713"
	)
	public void method9166(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class488 var3 = (class488)ArchiveDiskAction.findEnumerated(Ignored.method8979(), var2);
			if (var3 != null) {
				switch(var3.field5075) {
				case 0:
					int var4 = var1.readUnsignedByte();
					this.field5081 = LoginScreenAnimation.method2733(var4);
					if (this.field5081 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
				case 1:
					ArchiveDiskAction.findEnumerated(class177.method3791(), var1.readUnsignedByte());
					break;
				case 2:
					var1.readStringCp1252NullCircumfixed();
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
				}
			} else {
				this.vmethod9169(var1, var2);
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "708987122"
	)
	boolean method9174() {
		return this.field5081 != null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "224182011"
	)
	Object method9168() {
		if (this.field5081 == class537.field5332) {
			return 0;
		} else if (this.field5081 == class537.field5333) {
			return -1L;
		} else {
			return this.field5081 == class537.field5331 ? "" : null;
		}
	}
}
