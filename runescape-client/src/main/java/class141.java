import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
class class141 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	final class142 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lfq;Lvg;I)V"
	)
	class141(class142 var1, Buffer var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3277(this.val$p, this.val$version);
		return null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-169100810"
	)
	public static final void method3257(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0;
		ViewportMouse.ViewportMouse_y = var1;
		ViewportMouse.ViewportMouse_isInViewport = true;
		ViewportMouse.ViewportMouse_entityCount = 0;
		ViewportMouse.ViewportMouse_false0 = false;
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1727958977"
	)
	static void method3259() {
		if (Client.isSpellSelected) {
			Widget var0 = FloorUnderlayDefinition.widgetDefinition.getWidgetChild(MenuAction.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				class421.runScriptEvent(var1);
			}

			Client.selectedSpellItemId = -1;
			Client.isSpellSelected = false;
			class416.invalidateWidget(var0);
		}
	}
}
