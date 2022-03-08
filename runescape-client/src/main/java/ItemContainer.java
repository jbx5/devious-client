import net.runelite.rs.Reflection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("bp")
@Implements("ItemContainer")
public class ItemContainer extends Node {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Loj;")
    @Export("itemContainers")
    static NodeHashTable itemContainers;

    @ObfuscatedName("l")
    @Export("ids")
    int[] ids;

    @ObfuscatedName("s")
    @Export("quantities")
    int[] quantities;

    static {
        itemContainers = new NodeHashTable(32);
    }

    ItemContainer() {
        this.ids = new int[]{ -1 };
        this.quantities = new int[]{ 0 };
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", garbageValue = "-1793389136")
    @Export("loadClassFromDescriptor")
    static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
        if (var0.equals("B")) {
            return Byte.TYPE;
        } else if (var0.equals("I")) {
            return Integer.TYPE;
        } else if (var0.equals("S")) {
            return Short.TYPE;
        } else if (var0.equals("J")) {
            return Long.TYPE;
        } else if (var0.equals("Z")) {
            return Boolean.TYPE;
        } else if (var0.equals("F")) {
            return Float.TYPE;
        } else if (var0.equals("D")) {
            return Double.TYPE;
        } else if (var0.equals("C")) {
            return Character.TYPE;
        } else {
            return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
        }
    }

    @ObfuscatedName("go")
    @ObfuscatedSignature(descriptor = "(Lcw;III)V", garbageValue = "-586498893")
    @Export("performPlayerAnimation")
    static void performPlayerAnimation(Player var0, int var1, int var2) {
        if ((var0.sequence == var1) && (var1 != (-1))) {
            int var3 = class78.SequenceDefinition_get(var1).field2109;
            if (var3 == 1) {
                var0.sequenceFrame = 0;
                var0.sequenceFrameCycle = 0;
                var0.sequenceDelay = var2;
                var0.field1129 = 0;
            }
            if (var3 == 2) {
                var0.field1129 = 0;
            }
        } else if (((var1 == (-1)) || (var0.sequence == (-1))) || (class78.SequenceDefinition_get(var1).field2095 >= class78.SequenceDefinition_get(var0.sequence).field2095)) {
            var0.sequence = var1;
            var0.sequenceFrame = 0;
            var0.sequenceFrameCycle = 0;
            var0.sequenceDelay = var2;
            var0.field1129 = 0;
            var0.field1176 = var0.pathLength;
        }
    }
}