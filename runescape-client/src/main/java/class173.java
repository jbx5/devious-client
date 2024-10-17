import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public class class173 extends class166 {
	@ObfuscatedName("ap")
	String field1859;
	@ObfuscatedName("aw")
	byte field1860;
	@ObfuscatedName("ak")
	byte field1858;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgg;)V"
	)
	class173(class167 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-303680000"
	)
	void vmethod3816(Buffer var1) {
		this.field1859 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1859 != null) {
			var1.readUnsignedByte();
			this.field1860 = var1.readByte();
			this.field1858 = var1.readByte();
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgw;I)V",
		garbageValue = "-152326479"
	)
	void vmethod3817(ClanChannel var1) {
		var1.name = this.field1859;
		if (this.field1859 != null) {
			var1.field1841 = this.field1860;
			var1.field1845 = this.field1858;
		}

	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Lui;I)Ljava/lang/Object;",
		garbageValue = "-79340727"
	)
	static Object method3818(class544 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5382) {
			case 1:
				return Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
			case 2:
				return Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}
}
