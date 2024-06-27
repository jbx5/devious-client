import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
public class class214 {
	@ObfuscatedName("ap")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	public UrlRequest field2340;
	@ObfuscatedName("ad")
	public float[] field2338;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	final class224 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lif;)V"
	)
	class214(class224 var1) {
		this.this$0 = var1;
		this.field2338 = new float[4];
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "([Lnx;IB)V",
		garbageValue = "-4"
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
						BuddyRankComparator.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					Projectile.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = ModeWhere.widgetDefinition.method6519(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					Projectile.runScriptEvent(var5);
				}
			}
		}

	}
}
