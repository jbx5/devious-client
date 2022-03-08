import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("fp")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("VarpDefinition_archive")
    static AbstractArchive VarpDefinition_archive;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -843726729)
    @Export("VarpDefinition_fileCount")
    public static int VarpDefinition_fileCount;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("VarpDefinition_cached")
    static EvictingDualNodeHashTable VarpDefinition_cached;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -2136538939)
    @Export("type")
    public int type;

    static {
        VarpDefinition_cached = new EvictingDualNodeHashTable(64);
    }

    VarpDefinition() {
        this.type = 0;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Lpi;B)V", garbageValue = "28")
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
    @ObfuscatedSignature(descriptor = "(Lpi;II)V", garbageValue = "1970677173")
    @Export("decodeNext")
    void decodeNext(Buffer var1, int var2) {
        if (var2 == 5) {
            this.type = var1.readUnsignedShort();
        }
    }
}