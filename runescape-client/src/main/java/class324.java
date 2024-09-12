import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
public class class324 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class324 field3410;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class324 field3418;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class324 field3415;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class324 field3411;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class324 field3413;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class324 field3412;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class324 field3414;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class324 field3416;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class324 field3417;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class324 field3422;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class324 field3419;
	@ObfuscatedName("gd")
	@Export("worldHost")
	static String worldHost;

	static {
		field3410 = new class324(5);
		field3418 = new class324(14);
		field3415 = new class324(2);
		field3411 = new class324(7);
		field3413 = new class324(4);
		field3412 = new class324(6);
		field3414 = new class324(14);
		field3416 = new class324(20);
		field3417 = new class324(11);
		field3422 = new class324(7);
		field3419 = new class324(4);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "5"
	)
	class324(int var1) {
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)V",
		garbageValue = "1906690256"
	)
	static void method6405(class95 var0) {
		if (Client.field603 != var0) {
			Client.field603 = var0;
		}
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "([Lny;IB)V",
		garbageValue = "-114"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						class147.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					class215.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = TaskHandler.widgetDefinition.method6841(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					class215.runScriptEvent(var5);
				}
			}
		}

	}
}
