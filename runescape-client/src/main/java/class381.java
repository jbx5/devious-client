import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("nr")
public class class381 {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lnr;")
    static final class381 field4272;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lnr;")
    static final class381 field4274;

    @ObfuscatedName("s")
    String field4273;

    static {
        field4272 = new class381("application/json");
        field4274 = new class381("text/plain");
    }

    class381(String var1) {
        this.field4273 = var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-840182307")
    public String method6812() {
        return this.field4273;
    }
}