import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("NpcOverrides")
public class NpcOverrides {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -5178930276951482385L
	)
	public long field1960;
	@ObfuscatedName("aw")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("al")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ai")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ar")
	@Export("useLocalPlayer")
	public boolean useLocalPlayer;

	public NpcOverrides(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.useLocalPlayer = false;
		this.field1960 = var1;
		this.modelIds = var3;
		this.recolorTo = var4;
		this.retextureTo = var5;
		this.useLocalPlayer = var6;
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-80"
	)
	static boolean method3696() {
		return (Client.drawPlayerNames & 1) != 0;
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)V",
		garbageValue = "243841173"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0) {
		if (var0.buttonType == 1) {
			class106.method2775(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId);
		}

		String var1;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var1 = UserComparator9.Widget_getSpellActionName(var0);
			if (var1 != null) {
				class106.method2775(var1, class370.colorStartTag(65280) + var0.field3785, 25, 0, -1, var0.id, var0.itemId);
			}
		}

		if (var0.buttonType == 3) {
			UrlRequest.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			UrlRequest.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			UrlRequest.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			UrlRequest.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				if (class175.method3550(class429.getWidgetFlags(var0)) && (class128.selectedSpellFlags & 32) == 32) {
					class106.method2775(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId);
				}
			} else {
				for (int var6 = 9; var6 >= 5; --var6) {
					int var4 = class429.getWidgetFlags(var0);
					boolean var8 = (var4 >> var6 + 1 & 1) != 0;
					String var9;
					if (!var8 && var0.onOp == null) {
						var9 = null;
					} else if (var0.actions != null && var0.actions.length > var6 && var0.actions[var6] != null && var0.actions[var6].trim().length() != 0) {
						var9 = var0.actions[var6];
					} else {
						var9 = null;
					}

					if (var9 != null) {
						class106.method2775(var9, var0.dataText, 1007, var6 + 1, var0.childIndex, var0.id, var0.itemId);
					}
				}

				var1 = UserComparator9.Widget_getSpellActionName(var0);
				if (var1 != null) {
					class106.method2775(var1, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId);
				}

				for (int var2 = 4; var2 >= 0; --var2) {
					int var5 = class429.getWidgetFlags(var0);
					boolean var10 = (var5 >> var2 + 1 & 1) != 0;
					String var3;
					if (!var10 && var0.onOp == null) {
						var3 = null;
					} else if (var0.actions != null && var0.actions.length > var2 && var0.actions[var2] != null && var0.actions[var2].trim().length() != 0) {
						var3 = var0.actions[var2];
					} else {
						var3 = null;
					}

					if (var3 != null) {
						class246.insertMenuItem(var3, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry);
					}
				}

				if (MusicPatch.method6335(class429.getWidgetFlags(var0))) {
					UrlRequest.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
