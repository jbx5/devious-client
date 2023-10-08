import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
public class class410 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -443305391
	)
	int field4522;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class410(int var1, boolean var2) {
		this.field4522 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-15695"
	)
	public int method7603() {
		return this.field4522;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1656605881"
	)
	static final boolean method7606(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (Decimator.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class508.field5041;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class508.field5042;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-1849908879"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class33.widgetDefinition.loadInterface(var0)) {
			class9.field35 = null;
			Tile.drawInterface(class33.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (class9.field35 != null) {
				Tile.drawInterface(class9.field35, -1412584499, var1, var2, var3, var4, GrandExchangeEvent.field4389, class10.field48, var7);
				class9.field35 = null;
			}

		} else {
			if (var7 != -1) {
				Client.validRootWidgets[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.validRootWidgets[var8] = true;
				}
			}

		}
	}
}
