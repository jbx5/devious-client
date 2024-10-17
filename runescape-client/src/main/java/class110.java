import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
final class class110 implements class351 {
	@ObfuscatedName("bx")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	final Widget val$item;

	@ObfuscatedSignature(
		descriptor = "(Lng;)V"
	)
	class110(Widget var1) {
		this.val$item = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-3346"
	)
	public void vmethod6889() {
		if (this.val$item.method7287().field3811 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2565(this.val$item);
			var1.setArgs(this.val$item.method7287().field3811);
			Archive.method7599().addFirst(var1);
		}

	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)V",
		garbageValue = "1809135205"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field590) {
			Client.validRootWidgets[var0.rootIndex] = true;
		}

	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(Lvl;IB)V",
		garbageValue = "-35"
	)
	static void method3072(Buffer var0, int var1) {
		class154.method3607(var0.array, var1);
		class93.method2592(var0, var1);
	}
}
