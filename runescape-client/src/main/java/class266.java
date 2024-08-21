import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
public class class266 extends Node {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1534421177
	)
	public int field2912;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -274591305
	)
	public int field2913;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1122311063
	)
	public int field2914;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	public Widget field2915;

	@ObfuscatedSignature(
		descriptor = "(IIILnq;)V"
	)
	public class266(int var1, int var2, int var3, Widget var4) {
		this.field2914 = var1;
		this.field2912 = var2;
		this.field2913 = var3;
		this.field2915 = var4;
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(Lvw;B)V",
		garbageValue = "-89"
	)
	@Export("sortMenuEntries")
	static final void sortMenuEntries(Menu var0) {
		boolean var1 = false;

		while (!var1) {
			var1 = true;

			for (int var2 = 0; var2 < var0.menuOptionsCount - 1; ++var2) {
				if (var0.menuOpcodes[var2] < 1000 && var0.menuOpcodes[var2 + 1] > 1000) {
					String var3 = var0.menuTargets[var2];
					var0.menuTargets[var2] = var0.menuTargets[var2 + 1];
					var0.menuTargets[var2 + 1] = var3;
					String var4 = var0.menuActions[var2];
					var0.menuActions[var2] = var0.menuActions[var2 + 1];
					var0.menuActions[var2 + 1] = var4;
					Menu var5 = var0.subMenus[var2];
					var0.subMenus[var2] = var0.subMenus[var2 + 1];
					var0.subMenus[var2 + 1] = var5;
					int var6 = var0.menuOpcodes[var2];
					var0.menuOpcodes[var2] = var0.menuOpcodes[var2 + 1];
					var0.menuOpcodes[var2 + 1] = var6;
					var6 = var0.menuArguments1[var2];
					var0.menuArguments1[var2] = var0.menuArguments1[var2 + 1];
					var0.menuArguments1[var2 + 1] = var6;
					var6 = var0.menuArguments2[var2];
					var0.menuArguments2[var2] = var0.menuArguments2[var2 + 1];
					var0.menuArguments2[var2 + 1] = var6;
					var6 = var0.menuIdentifiers[var2];
					var0.menuIdentifiers[var2] = var0.menuIdentifiers[var2 + 1];
					var0.menuIdentifiers[var2 + 1] = var6;
					var6 = var0.menuItemIds[var2];
					var0.menuItemIds[var2] = var0.menuItemIds[var2 + 1];
					var0.menuItemIds[var2 + 1] = var6;
					var6 = var0.menuWorldViewIds[var2];
					var0.menuWorldViewIds[var2] = var0.menuWorldViewIds[var2 + 1];
					var0.menuWorldViewIds[var2 + 1] = var6;
					boolean var7 = var0.menuShiftClick[var2];
					var0.menuShiftClick[var2] = var0.menuShiftClick[var2 + 1];
					var0.menuShiftClick[var2 + 1] = var7;
					var1 = false;
				}
			}
		}

	}
}
