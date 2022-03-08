import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("v")
public class class8 {
    @ObfuscatedName("c")
    final int field45;

    @ObfuscatedName("l")
    final int field46;

    @ObfuscatedName("s")
    final String field44;

    @ObfuscatedSignature(descriptor = "(Lpi;)V")
    class8(Buffer var1) {
        this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
    }

    class8(int var1, int var2, String var3) {
        this.field45 = var1;
        this.field46 = var2;
        this.field44 = var3;
    }

    @ObfuscatedName("c")
    String method59() {
        return (Integer.toHexString(this.field45) + Integer.toHexString(this.field46)) + this.field44;
    }

    @ObfuscatedName("l")
    int method58() {
        return this.field46;
    }
}