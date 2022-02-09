import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("fq")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("EnumDefinition_archive")
    static AbstractArchive EnumDefinition_archive;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("EnumDefinition_cached")
    static EvictingDualNodeHashTable EnumDefinition_cached;

    @ObfuscatedName("s")
    @Export("inputType")
    public char inputType;

    @ObfuscatedName("e")
    @Export("outputType")
    public char outputType;

    @ObfuscatedName("r")
    @Export("defaultStr")
    public String defaultStr;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = 1973980043)
    @Export("defaultInt")
    public int defaultInt;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -882871953)
    @Export("outputCount")
    public int outputCount;

    @ObfuscatedName("w")
    @Export("keys")
    public int[] keys;

    @ObfuscatedName("v")
    @Export("intVals")
    public int[] intVals;

    @ObfuscatedName("a")
    @Export("strVals")
    public String[] strVals;

    static {
        EnumDefinition_cached = new EvictingDualNodeHashTable(64);
    }

    EnumComposition() {
        this.defaultStr = "null";
        this.outputCount = 0;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "1858536756")
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
    @ObfuscatedSignature(descriptor = "(Lpi;II)V", garbageValue = "-148344704")
    @Export("decodeNext")
    void decodeNext(Buffer var1, int var2) {
        if (var2 == 1) {
            this.inputType = ((char) (var1.readUnsignedByte()));
        } else if (var2 == 2) {
            this.outputType = ((char) (var1.readUnsignedByte()));
        } else if (var2 == 3) {
            this.defaultStr = var1.readStringCp1252NullTerminated();
        } else if (var2 == 4) {
            this.defaultInt = var1.readInt();
        } else {
            int var3;
            if (var2 == 5) {
                this.outputCount = var1.readUnsignedShort();
                this.keys = new int[this.outputCount];
                this.strVals = new String[this.outputCount];
                for (var3 = 0; var3 < this.outputCount; ++var3) {
                    this.keys[var3] = var1.readInt();
                    this.strVals[var3] = var1.readStringCp1252NullTerminated();
                }
            } else if (var2 == 6) {
                this.outputCount = var1.readUnsignedShort();
                this.keys = new int[this.outputCount];
                this.intVals = new int[this.outputCount];
                for (var3 = 0; var3 < this.outputCount; ++var3) {
                    this.keys[var3] = var1.readInt();
                    this.intVals[var3] = var1.readInt();
                }
            }
        }
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-919641499")
    @Export("size")
    public int size() {
        return this.outputCount;
    }
}