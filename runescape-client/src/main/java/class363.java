import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
public class class363 {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-144890898"
	)
	static final int method6942(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = class101.method2725(var3, var5);
		int var8 = class101.method2725(var3 + 1, var5);
		int var9 = class101.method2725(var3, var5 + 1);
		int var10 = class101.method2725(var3 + 1, var5 + 1);
		int var11 = Varcs.method2797(var7, var8, var4, var2);
		int var12 = Varcs.method2797(var9, var10, var4, var2);
		return Varcs.method2797(var11, var12, var6, var2);
	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(Ldj;ZI)V",
		garbageValue = "926093339"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			class380.widgetDefinition.method6346(var2);
		}

		class47.method911(var2);
		Widget var4 = class380.widgetDefinition.method6348(var3);
		if (var4 != null) {
			FaceNormal.invalidateWidget(var4);
		}

		if (Client.rootInterface != -1) {
			WorldMapScaleHandler.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
