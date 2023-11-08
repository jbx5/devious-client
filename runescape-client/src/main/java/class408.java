import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
public class class408 {
	@ObfuscatedName("at")
	public char field4509;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1715000515
	)
	public int field4508;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -969780909
	)
	public int field4507;

	class408() {
		this.field4508 = 0;
		this.field4507 = 0;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Ltu;I)Ljava/lang/Object;",
		garbageValue = "-458356510"
	)
	static Object method7657(class514 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5060) {
			case 0:
				return Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
			case 2:
				return Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}
}
