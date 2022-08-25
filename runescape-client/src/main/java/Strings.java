import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("kg")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("cs")
	public static String field3742 = "Please visit the support page for assistance.";

	@ObfuscatedName("ei")
	public static String field3746 = "Please visit the support page for assistance.";

	@ObfuscatedName("kn")
	public static String field3894 = "";

	@ObfuscatedName("kj")
	public static String field3687 = "Page has opened in a new window.";

	@ObfuscatedName("ki")
	public static String field3762 = "(Please check your popup blocker.)";

	@ObfuscatedName("bq")
	@ObfuscatedSignature(descriptor = "(ILbz;ZI)I", garbageValue = "1995278317")
	static int method5685(int var0, Script var1, boolean var2) {
		if (var0 == 7100) {
			++User.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7101) {
			UserComparator8.Interpreter_stringStackSize += 2;
			return 1;
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) {
			if (var0 == 7106) {
				++User.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7107) {
				++User.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7108) {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (TaskHandler.method3190()) ? 1 : 0;
				return 1;
			} else if (var0 == 7110) {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else if (var0 == 7120) {
				--User.Interpreter_intStackSize;
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else if (var0 == 7121) {
				User.Interpreter_intStackSize -= 2;
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
				return 1;
			} else if (var0 == 7122) {
				User.Interpreter_intStackSize -= 2;
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else {
				return 2;
			}
		} else {
			++User.Interpreter_intStackSize;
			return 1;
		}
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(descriptor = "(Lcq;III)V", garbageValue = "-624973350")
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = ByteArrayPool.SequenceDefinition_get(var1).field2181;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1172 = 0;
			}
			if (var3 == 2) {
				var0.field1172 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || ByteArrayPool.SequenceDefinition_get(var1).field2157 >= ByteArrayPool.SequenceDefinition_get(var0.sequence).field2157) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1172 = 0;
			var0.field1201 = var0.pathLength;
		}
	}
}