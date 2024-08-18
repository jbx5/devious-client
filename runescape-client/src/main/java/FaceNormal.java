import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -470124891
	)
	@Export("x")
	int x;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -790385207
	)
	@Export("y")
	int y;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 59101789
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2108267681"
	)
	public static int method4141(int var0) {
		return class497.field5036[var0 & 16383];
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(Lnq;B)V",
		garbageValue = "-65"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0) {
		if (var0.buttonType == 1) {
			NPC.method2813(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId);
		}

		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			String var1 = RestClientThreadFactory.Widget_getSpellActionName(var0);
			if (var1 != null) {
				NPC.method2813(var1, TransformationMatrix.colorStartTag(65280) + var0.field3934, 25, 0, -1, var0.id, var0.itemId);
			}
		}

		if (var0.buttonType == 3) {
			SecureUrlRequester.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			SecureUrlRequester.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			SecureUrlRequester.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			SecureUrlRequester.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				int var16 = SpriteMask.getWidgetFlags(var0);
				boolean var15 = (var16 >> 21 & 1) != 0;
				if (var15 && (UserComparator3.selectedSpellFlags & 32) == 32) {
					NPC.method2813(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId);
				}
			} else {
				for (int var17 = 9; var17 >= 0; --var17) {
					String var2;
					if (var17 == var0.field3886) {
						var2 = RestClientThreadFactory.Widget_getSpellActionName(var0);
						if (var2 != null) {
							NPC.method2813(var2, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId);
						}
					}

					var2 = SecureRandomCallable.method2374(var0, var17);
					if (var2 != null) {
						int var3;
						short var4;
						if (var17 > var0.field3886) {
							var4 = 1007;
							var3 = NPC.method2813(var2, var0.dataText, var4, var17 + 1, var0.childIndex, var0.id, var0.itemId);
						} else {
							var4 = 57;
							var3 = NpcOverrides.insertMenuItem(var2, var0.dataText, var4, var17 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry, -1);
						}

						if (var0.field3873 != null && var17 < var0.field3873.length && var0.field3873[var17] != null) {
							String[] var5 = var0.field3873[var17];

							for (int var6 = var5.length - 1; var6 >= 0; --var6) {
								int var7 = var6 + 1 << 16 | var17 + 1;
								if (var5[var6] != null && !var5[var6].isEmpty()) {
									String var8 = var5[var6];
									int var9 = var0.childIndex;
									int var10 = var0.id;
									int var11 = var0.itemId;
									if (!Client.isMenuOpen) {
										int var13 = var4;
										if (var4 >= 2000) {
											var13 = var4 - 2000;
										}

										boolean var14 = var13 == 16 || var13 == 17 || var13 >= 18 && var13 <= 22;
										if (!var14 && !TilesProjection.method4124(var13) && !ScriptEvent.method2422(var13)) {
										}

										boolean var12 = true;
										if (var12 && var3 >= 0 && var3 < Client.menu.subMenus.length) {
											if (Client.menu.subMenus[var3] == null) {
												Client.menu.subMenus[var3] = new Menu(false);
											}

											Client.menu.subMenus[var3].insertMenuItem(var8, "", var4, var7, var9, var10, var11, false, -1);
										}
									}
								}
							}
						}
					}
				}

				if (ParamComposition.method5049(SpriteMask.getWidgetFlags(var0))) {
					SecureUrlRequester.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
