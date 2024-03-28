import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public class class286 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	static final class286 field3129;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	static final class286 field3128;
	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 393112575
	)
	@Export("value")
	final int value;

	static {
		field3129 = new class286(0);
		field3128 = new class286(1);
	}

	class286(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;B)V",
		garbageValue = "-59"
	)
	public static void method5689(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Z",
		garbageValue = "1452326065"
	)
	static boolean method5688(String var0, int var1) {
		return class360.method6859(var0, var1, "openjs");
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "([Lnt;II)V",
		garbageValue = "2042071131"
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
						Login.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					AbstractWorldMapData.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = class243.widgetDefinition.method6281(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					AbstractWorldMapData.runScriptEvent(var5);
				}
			}
		}

	}
}
