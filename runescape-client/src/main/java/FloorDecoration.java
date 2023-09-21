import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		longValue = -3968021499924867655L
	)
	static long field2499;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1830367773
	)
	@Export("z")
	int z;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 488993931
	)
	@Export("x")
	int x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 212406311
	)
	@Export("y")
	int y;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -5502089969894061195L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2018612915
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "759565724"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = UserComparator3.World_worlds[var6];
			UserComparator3.World_worlds[var6] = UserComparator3.World_worlds[var1];
			UserComparator3.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				if (DevicePcmPlayerProvider.method312(UserComparator3.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
					World var10 = UserComparator3.World_worlds[var9];
					UserComparator3.World_worlds[var9] = UserComparator3.World_worlds[var7];
					UserComparator3.World_worlds[var7++] = var10;
				}
			}

			UserComparator3.World_worlds[var1] = UserComparator3.World_worlds[var7];
			UserComparator3.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(Lnm;B)V",
		garbageValue = "0"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0) {
		String var1;
		int var2;
		int var3;
		if (var0.buttonType == 1) {
			var1 = var0.buttonText;
			var2 = var0.id;
			var3 = var0.itemId;
			class208.insertMenuItem(var1, "", 24, 0, 0, var2, var3, false);
		}

		int var4;
		String var8;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var1 = class155.Widget_getSpellActionName(var0);
			if (var1 != null) {
				var8 = Client.colorStartTag(65280) + var0.field3806;
				var3 = var0.id;
				var4 = var0.itemId;
				class208.insertMenuItem(var1, var8, 25, 0, -1, var3, var4, false);
			}
		}

		if (var0.buttonType == 3) {
			class153.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			class153.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			class153.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			class153.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		if (var0.isIf3) {
			int var5;
			int var6;
			int var7;
			String var10;
			if (Client.isSpellSelected) {
				var2 = MouseRecorder.getWidgetFlags(var0);
				boolean var9 = (var2 >> 21 & 1) != 0;
				if (var9 && (class31.selectedSpellFlags & 32) == 32) {
					var10 = Client.selectedSpellActionName;
					String var11 = Client.selectedSpellName + " " + "->" + " " + var0.dataText;
					var5 = var0.childIndex;
					var6 = var0.id;
					var7 = var0.itemId;
					class208.insertMenuItem(var10, var11, 58, 0, var5, var6, var7, false);
				}
			} else {
				for (int var12 = 9; var12 >= 5; --var12) {
					var8 = class231.method4382(var0, var12);
					if (var8 != null) {
						var10 = var0.dataText;
						var4 = var12 + 1;
						var5 = var0.childIndex;
						var6 = var0.id;
						var7 = var0.itemId;
						class208.insertMenuItem(var8, var10, 1007, var4, var5, var6, var7, false);
					}
				}

				var1 = class155.Widget_getSpellActionName(var0);
				if (var1 != null) {
					var8 = var0.dataText;
					var3 = var0.childIndex;
					var4 = var0.id;
					var5 = var0.itemId;
					class208.insertMenuItem(var1, var8, 25, 0, var3, var4, var5, false);
				}

				for (var2 = 4; var2 >= 0; --var2) {
					var10 = class231.method4382(var0, var2);
					if (var10 != null) {
						class208.insertMenuItem(var10, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry);
					}
				}

				if (class146.method3161(MouseRecorder.getWidgetFlags(var0))) {
					class153.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
