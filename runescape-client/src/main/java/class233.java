import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ht")
public class class233 {
    @ObfuscatedName("kw")
    @ObfuscatedSignature(descriptor = "(IIII)Lcf;", garbageValue = "-852839339")
    static final InterfaceParent method4772(int var0, int var1, int var2) {
        InterfaceParent var3 = new InterfaceParent();
        var3.group = var1;
        var3.type = var2;
        Client.interfaceParents.put(var3, ((long) (var0)));
        class336.Widget_resetModelFrames(var1);
        Widget var4 = class130.getWidget(var0);
        class112.invalidateWidget(var4);
        if (Client.meslayerContinueWidget != null) {
            class112.invalidateWidget(Client.meslayerContinueWidget);
            Client.meslayerContinueWidget = null;
        }
        FontName.decrementMenuEntries();
        PcmPlayer.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var0 >> 16], var4, false);
        Occluder.runWidgetOnLoadListener(var1);
        if (Client.rootInterface != (-1)) {
            DevicePcmPlayerProvider.runIntfCloseListeners(Client.rootInterface, 1);
        }
        return var3;
    }
}