import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
public class class286 {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1330424245
	)
	static int field3074;

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lni;I)Z",
		garbageValue = "-249009883"
	)
	static boolean method5662(PlayerComposition var0) {
		if (var0.equipment[0] < 512) {
			return false;
		} else {
			ItemComposition var1 = class214.ItemDefinition_get(var0.equipment[0] - 512);
			return var1.maleModel1 != class223.field2348.field2342 && var1.maleModel2 != class223.field2348.field2342;
		}
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "863743368"
	)
	static void method5663() {
		if (Client.isSpellSelected) {
			Widget var0 = class33.widgetDefinition.getWidgetChild(JagexCache.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				Interpreter.runScriptEvent(var1);
			}

			Client.selectedSpellItemId = -1;
			Client.isSpellSelected = false;
			ClanChannelMember.invalidateWidget(var0);
		}
	}
}
