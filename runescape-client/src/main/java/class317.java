import java.io.DataInputStream;
import java.net.URL;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
public class class317 implements Comparator {
	class317() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lll;Lll;I)I",
		garbageValue = "-1564510989"
	)
	int method6058(class310 var1, class310 var2) {
		return var1.field3459 - var2.field3459;
	}

	public int compare(Object var1, Object var2) {
		return this.method6058((class310)var1, (class310)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V",
		garbageValue = "-83"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = "";
				if (var1 != null) {
					var2 = HealthBarUpdate.method2427(var1);
				}

				if (var0 != null) {
					if (var1 != null) {
						var2 = var2 + " | ";
					}

					var2 = var2 + var0;
				}

				System.out.println("Error: " + var2);
				var2 = var2.replace(':', '.');
				var2 = var2.replace('@', '_');
				var2 = var2.replace('&', '_');
				var2 = var2.replace('#', '_');
				if (RunException.RunException_applet == null) {
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + RunException.field5235 + "&u=" + RunException.field5234 + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + RunException.field5236 + "&e=" + var2);
				DataInputStream var4 = new DataInputStream(var3.openStream());
				var4.read();
				var4.close();
			} catch (Exception var5) {
			}

		}
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(Lmt;I)V",
		garbageValue = "-1456057901"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0) {
		if (var0.buttonType == 1) {
			class134.method3047(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId);
		}

		String var1;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var1 = class13.Widget_getSpellActionName(var0);
			if (var1 != null) {
				class134.method3047(var1, MusicPatchPcmStream.colorStartTag(65280) + var0.field3752, 25, 0, -1, var0.id, var0.itemId);
			}
		}

		if (var0.buttonType == 3) {
			JagexCache.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			JagexCache.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			JagexCache.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			JagexCache.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				if (WorldMapRectangle.method5509(UserComparator8.getWidgetFlags(var0)) && (PcmPlayer.selectedSpellFlags & 32) == 32) {
					class134.method3047(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId);
				}
			} else {
				for (int var6 = 9; var6 >= 5; --var6) {
					String var9 = class212.method4141(var0, var6);
					if (var9 != null) {
						class134.method3047(var9, var0.dataText, 1007, var6 + 1, var0.childIndex, var0.id, var0.itemId);
					}
				}

				var1 = class13.Widget_getSpellActionName(var0);
				if (var1 != null) {
					class134.method3047(var1, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId);
				}

				for (int var2 = 4; var2 >= 0; --var2) {
					int var5 = UserComparator8.getWidgetFlags(var0);
					boolean var4 = (var5 >> var2 + 1 & 1) != 0;
					String var7;
					if (!var4 && var0.onOp == null) {
						var7 = null;
					} else if (var0.actions != null && var0.actions.length > var2 && var0.actions[var2] != null && var0.actions[var2].trim().length() != 0) {
						var7 = var0.actions[var2];
					} else {
						var7 = null;
					}

					if (var7 != null) {
						class7.insertMenuItem(var7, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry);
					}
				}

				int var3 = UserComparator8.getWidgetFlags(var0);
				boolean var10 = (var3 & 1) != 0;
				if (var10) {
					JagexCache.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
