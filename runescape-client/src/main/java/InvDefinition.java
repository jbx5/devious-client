import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("fu")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("InvDefinition_archive")
    static AbstractArchive InvDefinition_archive;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("InvDefinition_cached")
    static EvictingDualNodeHashTable InvDefinition_cached;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -1694978241)
    @Export("size")
    public int size;

    static {
        InvDefinition_cached = new EvictingDualNodeHashTable(64);
    }

    InvDefinition() {
        this.size = 0;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Lpi;S)V", garbageValue = "14661")
    @Export("decode")
    void decode(Buffer var1) {
        while (true) {
            int var2 = var1.readUnsignedByte();
            if (var2 == 0) {
                return;
            }
            this.decodeNext(var1, var2);
        } 
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(Lpi;II)V", garbageValue = "310801205")
    @Export("decodeNext")
    void decodeNext(Buffer var1, int var2) {
        if (var2 == 2) {
            this.size = var1.readUnsignedShort();
        }
    }
}