import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ao")
public class class33 {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Llt;")
    @Export("reflectionChecks")
    static IterableNodeDeque reflectionChecks;

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "[Lbi;")
    @Export("World_worlds")
    static World[] World_worlds;

    @ObfuscatedName("hj")
    @ObfuscatedGetter(intValue = -191531185)
    static int field243;

    static {
        reflectionChecks = new IterableNodeDeque();
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1944227841")
    public static void method626() {
        FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
    }

    @ObfuscatedName("jv")
    @ObfuscatedSignature(descriptor = "([Ljz;II)V", garbageValue = "1424565311")
    @Export("runComponentCloseListeners")
    static final void runComponentCloseListeners(Widget[] var0, int var1) {
        for (int var2 = 0; var2 < var0.length; ++var2) {
            Widget var3 = var0[var2];
            if (var3 != null) {
                if (var3.type == 0) {
                    if (var3.children != null) {
                        runComponentCloseListeners(var3.children, var1);
                    }
                    InterfaceParent var4 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var3.id)))));
                    if (var4 != null) {
                        DevicePcmPlayerProvider.runIntfCloseListeners(var4.group, var1);
                    }
                }
                ScriptEvent var5;
                if ((var1 == 0) && (var3.onDialogAbort != null)) {
                    var5 = new ScriptEvent();
                    var5.widget = var3;
                    var5.args = var3.onDialogAbort;
                    class92.runScriptEvent(var5);
                }
                if ((var1 == 1) && (var3.onSubChange != null)) {
                    if (var3.childIndex >= 0) {
                        Widget var6 = class130.getWidget(var3.id);
                        if ((((var6 == null) || (var6.children == null)) || (var3.childIndex >= var6.children.length)) || (var3 != var6.children[var3.childIndex])) {
                            continue;
                        }
                    }
                    var5 = new ScriptEvent();
                    var5.widget = var3;
                    var5.args = var3.onSubChange;
                    class92.runScriptEvent(var5);
                }
            }
        }
    }
}