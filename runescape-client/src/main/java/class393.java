import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pk")
public class class393 {
	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldv;",
		garbageValue = "-78627862"
	)
	@Export("openInterface")
	static final InterfaceParent openInterface(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		class137.method3176(var1);
		Widget var4 = ModeWhere.widgetDefinition.method6519(var0);
		TriBool.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			TriBool.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		class238.revalidateWidgetScroll(ModeWhere.widgetDefinition.Widget_interfaceComponents[var0 >> 16], var4, false);
		class7.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			BuddyRankComparator.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
