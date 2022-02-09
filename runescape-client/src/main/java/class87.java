import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("cs")
public class class87 {
    @ObfuscatedName("bs")
    @ObfuscatedGetter(intValue = -1182301979)
    static int field1218;

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1336454088")
    public static void method2222() {
        VarpDefinition.VarpDefinition_cached.clear();
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-717884109")
    public static int method2224(int var0) {
        return RouteStrategy.method3679(ViewportMouse.ViewportMouse_entityTags[var0]);
    }

    @ObfuscatedName("hi")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "76")
    static final void method2220() {
        for (PendingSpawn var0 = ((PendingSpawn) (Client.pendingSpawns.last())); var0 != null; var0 = ((PendingSpawn) (Client.pendingSpawns.previous()))) {
            if (var0.hitpoints == (-1)) {
                var0.delay = 0;
                class296.method5489(var0);
            } else {
                var0.remove();
            }
        }
    }

    @ObfuscatedName("hb")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-526331207")
    @Export("addCancelMenuEntry")
    static void addCancelMenuEntry() {
        HitSplatDefinition.method3454();
        Client.menuActions[0] = "Cancel";
        Client.menuTargets[0] = "";
        Client.menuOpcodes[0] = 1006;
        Client.menuShiftClick[0] = false;
        Client.menuOptionsCount = 1;
    }

    @ObfuscatedName("ht")
    @ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "-44")
    static final void method2221(int var0, int var1) {
        if (((Client.menuOptionsCount >= 2) || (Client.isItemSelected != 0)) || Client.isSpellSelected) {
            if (Client.showMouseOverText) {
                int var2 = Client.menuOptionsCount - 1;
                String var4;
                if ((Client.isItemSelected == 1) && (Client.menuOptionsCount < 2)) {
                    var4 = ((("Use" + " ") + Client.selectedItemName) + " ") + "->";
                } else if (Client.isSpellSelected && (Client.menuOptionsCount < 2)) {
                    var4 = (((Client.selectedSpellActionName + " ") + Client.selectedSpellName) + " ") + "->";
                } else {
                    var4 = class144.method2969(var2);
                }
                if (Client.menuOptionsCount > 2) {
                    var4 = (((((var4 + LoginScreenAnimation.colorStartTag(16777215)) + " ") + '/') + " ") + (Client.menuOptionsCount - 2)) + " more options";
                }
                class408.fontBold12.drawRandomAlphaAndSpacing(var4, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000);
            }
        }
    }
}