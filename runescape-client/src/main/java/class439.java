import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("pj")
public class class439 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1851304909)
	static final int field4696 = ((int) (Math.pow(2.0, 4.0) - 1.0));

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 1365918829)
	static final int field4694 = ((int) (Math.pow(2.0, 8.0) - 1.0));

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(IIIB)I", garbageValue = "-16")
	static final int method7671(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = ItemContainer.method2154(var3, var5);
		int var8 = ItemContainer.method2154(var3 + 1, var5);
		int var9 = ItemContainer.method2154(var3, var5 + 1);
		int var10 = ItemContainer.method2154(var3 + 1, var5 + 1);
		int var11 = MusicPatchNode2.method5247(var7, var8, var4, var2);
		int var12 = MusicPatchNode2.method5247(var9, var10, var4, var2);
		return MusicPatchNode2.method5247(var11, var12, var6, var2);
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(descriptor = "([Lku;Lku;ZB)V", garbageValue = "-60")
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = (var1.scrollWidth != 0) ? var1.scrollWidth : var1.width;
		int var4 = (var1.scrollHeight != 0) ? var1.scrollHeight : var1.height;
		NetCache.resizeInterface(var0, var1.id, var3, var4, var2);
		if (var1.children != null) {
			NetCache.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}
		InterfaceParent var5 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var1.id)))));
		if (var5 != null) {
			int var6 = var5.group;
			if (ReflectionCheck.loadInterface(var6)) {
				NetCache.resizeInterface(Widget.Widget_interfaceComponents[var6], -1, var3, var4, var2);
			}
		}
		if (var1.contentType == 1337) {
		}
	}
}