import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
public abstract class class476 implements class296 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	class521 field4875;

	class476(int var1) {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "-1596270008"
	)
	abstract void vmethod8737(Buffer var1, int var2);

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1129594658"
	)
	public void method8736(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class472[] var3 = new class472[]{class472.field4863, class472.field4866, class472.field4862, class472.field4864};
			class472 var4 = (class472)class356.findEnumerated(var3, var2);
			if (var4 != null) {
				switch(var4.field4865) {
				case 0:
					class370[] var5 = new class370[]{class370.field4322, class370.field4321, class370.field4320, class370.field4326};
					class356.findEnumerated(var5, var1.readUnsignedByte());
					break;
				case 1:
					var1.readStringCp1252NullCircumfixed();
					break;
				case 2:
					int var6 = var1.readUnsignedByte();
					this.field4875 = class297.method5966(var6);
					if (this.field4875 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6);
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
				}
			} else {
				this.vmethod8737(var1, var2);
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-87852554"
	)
	boolean method8738() {
		return this.field4875 != null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "-2127993541"
	)
	Object method8741() {
		if (this.field4875 == class521.field5125) {
			return 0;
		} else if (this.field4875 == class521.field5128) {
			return -1L;
		} else {
			return this.field4875 == class521.field5126 ? "" : null;
		}
	}
}
