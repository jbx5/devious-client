import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cc")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -77588071
	)
	static int field482;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	static IndexedSprite field486;
	@ObfuscatedName("ac")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpv;Lpv;I)I",
		garbageValue = "2061096132"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) {
			return 0;
		} else {
			if (this.filterWorlds) {
				if (Client.worldId == var1.world) {
					return -1;
				}

				if (var2.world == Client.worldId) {
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1571534553"
	)
	static int method1257(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var7 = var2 ? Interpreter.scriptDotWidget : class464.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class107 var8 = new class107(var4, var7.id, var7.childIndex, var7.itemId);
					Interpreter.field870.add(var8);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				class320.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class107 var6 = new class107(var5, var3, var4, TaskHandler.widgetDefinition.method6841(var3).itemId);
					Interpreter.field870.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field885 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var7 = TaskHandler.widgetDefinition.method6841(Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
			} else {
				var7 = var2 ? Interpreter.scriptDotWidget : class464.scriptActiveWidget;
			}

			if (var7.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var7;
				var9.args = var7.onResize;
				var9.field1099 = Interpreter.field885 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1986103346"
	)
	static final void method1267(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class461.clientPreferences.updateAreaSoundEffectsVolume(var0);
	}
}
