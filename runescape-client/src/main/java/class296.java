import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("kw")
public class class296 {
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -764353757)
    static int field3510;

    @ObfuscatedName("hz")
    @ObfuscatedSignature(descriptor = "(Lcb;I)V", garbageValue = "-1892325000")
    static final void method5489(PendingSpawn var0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (var0.type == 0) {
            var1 = Decimator.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
        }
        if (var0.type == 1) {
            var1 = Decimator.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
        }
        if (var0.type == 2) {
            var1 = Decimator.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
        }
        if (var0.type == 3) {
            var1 = Decimator.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
        }
        if (0L != var1) {
            int var6 = Decimator.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
            var3 = Skeleton.Entity_unpackID(var1);
            var4 = var6 & 31;
            var5 = (var6 >> 6) & 3;
        }
        var0.objectId = var3;
        var0.field1100 = var4;
        var0.field1106 = var5;
    }
}