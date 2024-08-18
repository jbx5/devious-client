import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("st")
public abstract class class490 implements class307 {
	@ObfuscatedName("ay")
	public static String field5021;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 2048703095
	)
	static int field5018;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	class535 field5019;

	class490(int var1) {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;II)V",
		garbageValue = "-653525945"
	)
	abstract void vmethod8889(Buffer var1, int var2);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "836060159"
	)
	public void method8888(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class486 var3 = (class486)class134.findEnumerated(SequenceDefinition.method5285(), var2);
			if (var3 != null) {
				switch(var3.field5012) {
				case 0:
					class134.findEnumerated(GameObject.method4487(), var1.readUnsignedByte());
					break;
				case 1:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
				case 2:
					int var4 = var1.readUnsignedByte();
					this.field5019 = class418.method7757(var4);
					if (this.field5019 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
				case 3:
					var1.readStringCp1252NullCircumfixed();
				}
			} else {
				this.vmethod8889(var1, var2);
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	boolean method8890() {
		return this.field5019 != null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "1990182157"
	)
	Object method8891() {
		if (this.field5019 == class535.field5299) {
			return 0;
		} else if (this.field5019 == class535.field5293) {
			return -1L;
		} else {
			return this.field5019 == class535.field5292 ? "" : null;
		}
	}
}
