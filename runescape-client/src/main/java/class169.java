import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
public class class169 extends class145 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -541809465
	)
	int field1800;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = 7193403944356157085L
	)
	long field1799;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lff;)V"
	)
	class169(class148 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-11659242"
	)
	void vmethod3414(Buffer var1) {
		this.field1800 = var1.readInt();
		this.field1799 = var1.readLong();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgi;I)V",
		garbageValue = "21847466"
	)
	void vmethod3415(ClanSettings var1) {
		var1.method3237(this.field1800, this.field1799);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZB)I",
		garbageValue = "-23"
	)
	static int method3419(int var0, Script var1, boolean var2) {
		if (var0 == 6809) {
			int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			ObjectComposition var4 = class91.getObjectDefinition(var3);
			Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "815194863"
	)
	static String method3418(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0];
		}
	}
}
