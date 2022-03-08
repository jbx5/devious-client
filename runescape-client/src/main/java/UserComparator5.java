import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ds")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
    @ObfuscatedName("c")
    @Export("reversed")
    final boolean reversed;

    public UserComparator5(boolean var1) {
        this.reversed = var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lmd;Lmd;I)I", garbageValue = "71966662")
    @Export("compareBuddy")
    int compareBuddy(Buddy var1, Buddy var2) {
        if (var1.world != 0) {
            if (var2.world == 0) {
                return this.reversed ? -1 : 1;
            }
        } else if (var2.world != 0) {
            return this.reversed ? 1 : -1;
        }
        return this.compareUser(var1, var2);
    }

    public int compare(Object var1, Object var2) {
        return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "0")
    static void method2475() {
        Tiles.Tiles_minPlane = 99;
        Tiles.Tiles_underlays = new byte[4][104][104];
        Tiles.Tiles_overlays = new byte[4][104][104];
        Tiles.Tiles_shapes = new byte[4][104][104];
        Tiles.field998 = new byte[4][104][104];
        class78.field1033 = new int[4][105][105];
        class260.field3078 = new byte[4][105][105];
        class19.field106 = new int[105][105];
        class7.Tiles_hue = new int[104];
        RouteStrategy.Tiles_saturation = new int[104];
        AbstractByteArrayCopier.Tiles_lightness = new int[104];
        class1.Tiles_hueMultiplier = new int[104];
        VarcInt.field1789 = new int[104];
    }

    @ObfuscatedName("ij")
    @ObfuscatedSignature(descriptor = "(IIIIIIIII)V", garbageValue = "2012601559")
    @Export("drawWidgets")
    static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        if (class13.loadInterface(var0)) {
            WorldMapElement.field1784 = null;
            Skills.drawInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
            if (WorldMapElement.field1784 != null) {
                Skills.drawInterface(WorldMapElement.field1784, -1412584499, var1, var2, var3, var4, WorldMapData_1.field2676, ParamComposition.field1938, var7);
                WorldMapElement.field1784 = null;
            }
        } else if (var7 != (-1)) {
            Client.field713[var7] = true;
        } else {
            for (int var8 = 0; var8 < 100; ++var8) {
                Client.field713[var8] = true;
            }
        }
    }
}