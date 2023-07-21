import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
public abstract class class458 implements class281 {
	@ObfuscatedName("tn")
	static boolean field4775;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	class503 field4772;

	class458(int var1) {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "-546839154"
	)
	abstract void vmethod8372(Buffer var1, int var2);

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "126"
	)
	public void method8381(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class454 var3 = (class454)ClientPreferences.findEnumerated(UrlRequester.method2824(), var2);
			if (var3 != null) {
				switch(var3.field4765) {
				case 0:
					ClientPreferences.findEnumerated(Tiles.method2247(), var1.readUnsignedByte());
					break;
				case 1:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
				case 2:
					var1.readStringCp1252NullCircumfixed();
					break;
				case 3:
					int var4 = var1.readUnsignedByte();
					this.field4772 = class395.method7456(var4);
					if (this.field4772 == null) {
						throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
					}
				}
			} else {
				this.vmethod8372(var1, var2);
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1079590565"
	)
	boolean method8373() {
		return this.field4772 != null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "703790014"
	)
	Object method8374() {
		if (this.field4772 == class503.field5030) {
			return 0;
		} else if (this.field4772 == class503.field5027) {
			return -1L;
		} else {
			return this.field4772 == class503.field5028 ? "" : null;
		}
	}

	@ObfuscatedName("aj")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}
}
