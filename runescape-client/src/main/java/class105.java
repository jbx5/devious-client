import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public class class105 {
	@ObfuscatedName("dn")
	static boolean field1355;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1668832143
	)
	int field1356;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -809279291
	)
	int field1363;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1766423523
	)
	int field1357;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1709525437
	)
	int field1358;

	class105(int var1, int var2, int var3, int var4) {
		this.field1356 = var1;
		this.field1363 = var2;
		this.field1357 = var3;
		this.field1358 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	int method2832() {
		return this.field1356;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1436624632"
	)
	int method2825() {
		return this.field1363;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1660646598"
	)
	int method2826() {
		return this.field1357;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1467247541"
	)
	int method2827() {
		return this.field1358;
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "([Lnq;IB)V",
		garbageValue = "127"
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
						HealthBarUpdate.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					class421.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = FloorUnderlayDefinition.widgetDefinition.method6544(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					class421.runScriptEvent(var5);
				}
			}
		}

	}
}
