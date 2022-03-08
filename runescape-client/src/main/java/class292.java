import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ku")
public class class292 {
    static {
        Math.sqrt(8192.0);
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Lon;ILjava/lang/String;I)Ljava/lang/String;", garbageValue = "-2085730144")
    static String method5479(IterableNodeHashTable var0, int var1, String var2) {
        if (var0 == null) {
            return var2;
        } else {
            ObjectNode var3 = ((ObjectNode) (var0.get(((long) (var1)))));
            return var3 == null ? var2 : ((String) (var3.obj));
        }
    }
}