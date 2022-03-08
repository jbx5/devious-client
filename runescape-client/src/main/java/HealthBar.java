import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ck")
@Implements("HealthBar")
public class HealthBar extends Node {
    @ObfuscatedName("fk")
    @Export("worldHost")
    static String worldHost;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lfs;")
    @Export("definition")
    HealthBarDefinition definition;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Llt;")
    @Export("updates")
    IterableNodeDeque updates;

    @ObfuscatedSignature(descriptor = "(Lfs;)V")
    HealthBar(HealthBarDefinition var1) {
        this.updates = new IterableNodeDeque();
        this.definition = var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "-1837572845")
    @Export("put")
    void put(int var1, int var2, int var3, int var4) {
        HealthBarUpdate var5 = null;
        int var6 = 0;
        for (HealthBarUpdate var7 = ((HealthBarUpdate) (this.updates.last())); var7 != null; var7 = ((HealthBarUpdate) (this.updates.previous()))) {
            ++var6;
            if (var7.cycle == var1) {
                var7.set(var1, var2, var3, var4);
                return;
            }
            if (var7.cycle <= var1) {
                var5 = var7;
            }
        }
        if (var5 == null) {
            if (var6 < 4) {
                this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
            }
        } else {
            IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
            if (var6 >= 4) {
                this.updates.last().remove();
            }
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(IB)Lcd;", garbageValue = "1")
    @Export("get")
    HealthBarUpdate get(int var1) {
        HealthBarUpdate var2 = ((HealthBarUpdate) (this.updates.last()));
        if ((var2 != null) && (var2.cycle <= var1)) {
            for (HealthBarUpdate var3 = ((HealthBarUpdate) (this.updates.previous())); (var3 != null) && (var3.cycle <= var1); var3 = ((HealthBarUpdate) (this.updates.previous()))) {
                var2.remove();
                var2 = var3;
            }
            if (((this.definition.int5 + var2.cycle) + var2.cycleOffset) > var1) {
                return var2;
            } else {
                var2.remove();
                return null;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "2000667860")
    @Export("isEmpty")
    boolean isEmpty() {
        return this.updates.method5882();
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lkq;Lkq;ZI)V", garbageValue = "-2108078857")
    public static void method2248(AbstractArchive var0, AbstractArchive var1, boolean var2) {
        class12.ObjectDefinition_archive = var0;
        ObjectComposition.ObjectDefinition_modelsArchive = var1;
        ObjectComposition.ObjectDefinition_isLowDetail = var2;
    }

    @ObfuscatedName("gj")
    @ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "4")
    static boolean method2250() {
        return (Client.drawPlayerNames & 8) != 0;
    }
}