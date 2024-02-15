import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class128 {
	@ObfuscatedName("ai")
	public static final float field1512;
	@ObfuscatedName("ar")
	public static final float field1519;
	@ObfuscatedName("as")
	static float[] field1511;
	@ObfuscatedName("aa")
	static float[] field1510;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	static GraphicsDefaults field1514;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = -45116601
	)
	static int field1513;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = -1097261913
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;

	static {
		field1512 = Math.ulp(1.0F);
		field1519 = field1512 * 2.0F;
		field1511 = new float[4];
		field1510 = new float[5];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "552143229"
	)
	public static int method3013(int var0, int var1) {
		int var2 = var0 >>> 31;
		return (var0 + var2) / var1 - var2;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "64"
	)
	static final int method3011(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1;
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "38"
	)
	static void method3018(int var0, String var1) {
		Login.Login_loadingText = var1;
		Login.Login_loadingPercent = var0;
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "([Lng;IB)V",
		garbageValue = "100"
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
						Canvas.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					class177.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = ArchiveLoader.widgetDefinition.method6431(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					class177.runScriptEvent(var5);
				}
			}
		}

	}
}
