import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ey")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -655054217
	)
	static int field1464;
	@ObfuscatedName("at")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lrh;Lrh;I)I",
		garbageValue = "-464829605"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "-32"
	)
	static int method3019(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var7 = var2 ? Interpreter.scriptDotWidget : HealthBar.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class102 var8 = new class102(var4, var7.id, var7.childIndex, var7.itemId);
					Interpreter.field847.add(var8);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				DbTableType.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class102 var6 = new class102(var5, var3, var4, HealthBarDefinition.widgetDefinition.method6285(var3).itemId);
					Interpreter.field847.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field849 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var7 = HealthBarDefinition.widgetDefinition.method6285(Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize]);
			} else {
				var7 = var2 ? Interpreter.scriptDotWidget : HealthBar.scriptActiveWidget;
			}

			if (var7.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var7;
				var9.args = var7.onResize;
				var9.field1063 = Interpreter.field849 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}
}
