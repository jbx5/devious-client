import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
public final class class314 {
	@ObfuscatedName("af")
	static final HashMap field3427;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field3428;

	static {
		field3427 = new HashMap();
		java.util.Calendar.getInstance(method6000("Europe/London"));
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;",
		garbageValue = "-127615188"
	)
	static TimeZone method6000(String var0) {
		synchronized(field3427) {
			TimeZone var2 = (TimeZone)field3427.get(var0);
			if (var2 == null) {
				var2 = TimeZone.getTimeZone(var0);
				field3427.put(var0, var2);
			}

			return var2;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;B)Z",
		garbageValue = "-75"
	)
	static boolean method6005(Date var0) {
		java.util.Calendar var1 = java.util.Calendar.getInstance();
		var1.set(1, var1.get(1) - 13);
		var1.set(5, var1.get(5) + 1);
		var1.set(11, 0);
		var1.set(12, 0);
		var1.set(13, 0);
		var1.set(14, 0);
		Date var2 = var1.getTime();
		return var0.before(var2);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "2047821445"
	)
	static int method6006(int var0, Script var1, boolean var2) {
		if (var0 == 6754) {
			int var5 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			NPCComposition var6 = Script.getNpcDefinition(var5);
			Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : "";
			return 1;
		} else {
			NPCComposition var3;
			if (var0 == 6764) {
				UserComparator6.Interpreter_intStackSize -= 2;
				var3 = Script.getNpcDefinition(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]);
				int var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.method3738(var4);
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.method3729(var4);
				return 1;
			} else if (var0 == 6765) {
				var3 = Script.getNpcDefinition(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}
}
