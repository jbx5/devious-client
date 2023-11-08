import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
public class class302 {
	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "Lrg;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("up")
	@ObfuscatedGetter(
		intValue = -616078041
	)
	static int field3119;

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lnn;IIB)V",
		garbageValue = "51"
	)
	public static void method5906(Widget var0, int var1, int var2) {
		PlayerComposition var3 = var0.field3717;
		boolean var4 = var2 != var3.gender;
		var3.gender = var2;
		if (var4) {
			int var5;
			int var7;
			if (var3.gender == var1) {
				for (var5 = 0; var5 < PlayerComposition.equipmentIndices.length; ++var5) {
					var7 = PlayerComposition.equipmentIndices[var5];
					if (var3.equipment[var7] > 0 && var3.equipment[var7] < 512) {
						var3.equipment[var7] = var3.field3596[var7];
					}
				}
			} else {
				label74: {
					if (var3.equipment[0] >= 512) {
						boolean var8;
						if (var3.equipment[0] < 512) {
							var8 = false;
						} else {
							ItemComposition var6 = class214.ItemDefinition_get(var3.equipment[0] - 512);
							var8 = var6.maleModel1 != class205.field2231.field2245 && var6.maleModel2 != class205.field2231.field2245;
						}

						if (!var8) {
							break label74;
						}
					}

					var3.equipment[class205.field2231.field2245] = 1;
				}

				for (var5 = 0; var5 < 7; ++var5) {
					var7 = PlayerComposition.equipmentIndices[var5];
					if (var3.equipment[var7] > 0 && var3.equipment[var7] < 512) {
						class228.method4438(var2, var3.equipment, var5);
					}
				}
			}
		}

		var3.method6323();
	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(Ldc;ZB)V",
		garbageValue = "-113"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			HealthBarDefinition.widgetDefinition.method6283(var2);
		}

		for (IntegerNode var4 = (IntegerNode)Client.widgetFlags.first(); var4 != null; var4 = (IntegerNode)Client.widgetFlags.next()) {
			if ((var4.key >> 48 & 65535L) == (long)var2) {
				var4.remove();
			}
		}

		Widget var5 = HealthBarDefinition.widgetDefinition.method6285(var3);
		if (var5 != null) {
			class159.invalidateWidget(var5);
		}

		if (Client.rootInterface != -1) {
			class514.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
