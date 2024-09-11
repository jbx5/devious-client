import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
public class class75 {
	@ObfuscatedName("ax")
	static final BigInteger field921;
	@ObfuscatedName("aq")
	static final BigInteger field917;

	static {
		field921 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field917 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(Lny;B)V",
		garbageValue = "3"
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
			SoundCache.insertMenuItem(var1, "", 24, 0, 0, var2, var3, false, -1);
		}

		int var4;
		String var18;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var1 = UserComparator3.Widget_getSpellActionName(var0);
			if (var1 != null) {
				var18 = HttpMethod.colorStartTag(65280) + var0.field3983;
				var3 = var0.id;
				var4 = var0.itemId;
				SoundCache.insertMenuItem(var1, var18, 25, 0, -1, var3, var4, false, -1);
			}
		}

		if (var0.buttonType == 3) {
			Projection.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			Projection.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			Projection.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			Projection.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		if (var0.isIf3) {
			int var5;
			int var6;
			boolean var19;
			String var20;
			int var22;
			if (Client.isSpellSelected) {
				var2 = class310.getWidgetFlags(var0);
				var19 = (var2 >> 21 & 1) != 0;
				if (var19 && (class320.selectedSpellFlags & 32) == 32) {
					var20 = Client.selectedSpellActionName;
					String var24 = Client.selectedSpellName + " " + "->" + " " + var0.dataText;
					var5 = var0.childIndex;
					var6 = var0.id;
					var22 = var0.itemId;
					SoundCache.insertMenuItem(var20, var24, 58, 0, var5, var6, var22, false, -1);
				}
			} else {
				for (int var27 = 9; var27 >= 0; --var27) {
					if (var27 == var0.field3968) {
						var18 = UserComparator3.Widget_getSpellActionName(var0);
						if (var18 != null) {
							var20 = var0.dataText;
							var4 = var0.childIndex;
							var5 = var0.id;
							var6 = var0.itemId;
							SoundCache.insertMenuItem(var18, var20, 25, 0, var4, var5, var6, false, -1);
						}
					}

					var4 = class310.getWidgetFlags(var0);
					boolean var25 = (var4 >> var27 + 1 & 1) != 0;
					if (!var25 && var0.onOp == null) {
						var18 = null;
					} else if (var0.actions != null && var0.actions.length > var27 && var0.actions[var27] != null && var0.actions[var27].trim().length() != 0) {
						var18 = var0.actions[var27];
					} else {
						var18 = null;
					}

					if (var18 != null) {
						int var8;
						int var10;
						int var11;
						short var26;
						if (var27 > var0.field3968) {
							var26 = 1007;
							String var7 = var0.dataText;
							var8 = var27 + 1;
							int var9 = var0.childIndex;
							var10 = var0.id;
							var11 = var0.itemId;
							var6 = SoundCache.insertMenuItem(var18, var7, var26, var8, var9, var10, var11, false, -1);
							var4 = var6;
						} else {
							var26 = 57;
							var4 = SoundCache.insertMenuItem(var18, var0.dataText, var26, var27 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry, -1);
						}

						if (var0.field3898 != null && var27 < var0.field3898.length && var0.field3898[var27] != null) {
							String[] var21 = var0.field3898[var27];

							for (var22 = var21.length - 1; var22 >= 0; --var22) {
								var8 = var22 + 1 << 16 | var27 + 1;
								if (var21[var22] != null && !var21[var22].isEmpty()) {
									String var23 = var21[var22];
									var10 = var0.childIndex;
									var11 = var0.id;
									int var12 = var0.itemId;
									if (!Client.isMenuOpen) {
										int var14 = var26;
										if (var26 >= 2000) {
											var14 = var26 - 2000;
										}

										if (HealthBarUpdate.field1304 != -1) {
										}

										boolean var15 = true;
										boolean var16;
										if (!var15) {
											var16 = var14 == 2 || var14 == 8 || var14 == 25 || var14 == 17 || var14 == 25;
											var15 = var16;
										}

										var16 = var15 || class537.method9779(var14);
										if (!var16) {
											boolean var17 = var14 == 1002 || var14 == 1003 || var14 == 1004;
											var16 = var17;
										}

										if (var16 && var4 >= 0 && var4 < Client.menu.subMenus.length) {
											if (Client.menu.subMenus[var4] == null) {
												Client.menu.subMenus[var4] = new Menu(false);
											}

											Client.menu.subMenus[var4].insertMenuItem(var23, "", var26, var8, var10, var11, var12, false, -1);
										}
									}
								}
							}
						}
					}
				}

				var2 = class310.getWidgetFlags(var0);
				var19 = (var2 & 1) != 0;
				if (var19) {
					Projection.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
