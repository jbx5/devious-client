import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
public final class class418 {
	@ObfuscatedName("ab")
	@Export("base37Table")
	static final char[] base37Table;
	@ObfuscatedName("ay")
	static long[] field4653;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field4653 = new long[12];

		for (int var0 = 0; var0 < field4653.length; ++var0) {
			field4653[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Luy;",
		garbageValue = "0"
	)
	public static class535 method7757(int var0) {
		int var1 = class533.field5288[var0];
		if (var1 == 1) {
			return class535.field5299;
		} else if (var1 == 2) {
			return class535.field5292;
		} else {
			return var1 == 3 ? class535.field5293 : null;
		}
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldi;",
		garbageValue = "-817350728"
	)
	@Export("openInterface")
	static final InterfaceParent openInterface(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		class499.method8953(var1);
		Widget var4 = FloorUnderlayDefinition.widgetDefinition.method6544(var0);
		class416.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			class416.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		class165.revalidateWidgetScroll(FloorUnderlayDefinition.widgetDefinition.Widget_interfaceComponents[var0 >> 16], var4, false);
		class297.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			HealthBarUpdate.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
