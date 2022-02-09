import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("es")
public class class140 extends class126 {
    @ObfuscatedName("up")
    @ObfuscatedGetter(longValue = -4940723474862761385L)
    static long field1626;

    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -1868849589)
    @Export("musicTrackFileId")
    public static int musicTrackFileId;

    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 106617299)
    static int field1630;

    @ObfuscatedName("ex")
    @ObfuscatedSignature(descriptor = "Lnm;")
    @Export("spriteIds")
    static GraphicsDefaults spriteIds;

    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = 858742987)
    int field1625;

    @ObfuscatedSignature(descriptor = "Ldk;")
    final class129 this$0;

    @ObfuscatedSignature(descriptor = "(Ldk;)V")
    class140(class129 var1) {
        this.this$0 = var1;
        this.field1625 = -1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "703192976")
    void vmethod3019(Buffer var1) {
        this.field1625 = var1.readUnsignedShort();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ley;I)V", garbageValue = "750335300")
    void vmethod3020(ClanSettings var1) {
        var1.method2856(this.field1625);
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "([Llr;II)Llr;", garbageValue = "-1875165885")
    @Export("findEnumerated")
    public static MouseWheel findEnumerated(MouseWheel[] var0, int var1) {
        MouseWheel[] var2 = var0;
        for (int var3 = 0; var3 < var2.length; ++var3) {
            MouseWheel var4 = var2[var3];
            if (var1 == var4.rsOrdinal()) {
                return var4;
            }
        }
        return null;
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "([BIII)Ljava/lang/String;", garbageValue = "-1708933530")
    @Export("decodeStringCp1252")
    public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
        char[] var3 = new char[var2];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; ++var5) {
            int var6 = var0[var5 + var1] & 255;
            if (var6 != 0) {
                if ((var6 >= 128) && (var6 < 160)) {
                    char var7 = class333.cp1252AsciiExtension[var6 - 128];
                    if (var7 == 0) {
                        var7 = '?';
                    }
                    var6 = var7;
                }
                var3[var4++] = ((char) (var6));
            }
        }
        return new String(var3, 0, var4);
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(IB)I", garbageValue = "-53")
    static int method2932(int var0) {
        Message var1 = ((Message) (Messages.Messages_hashTable.get(((long) (var0)))));
        if (var1 == null) {
            return -1;
        } else {
            return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message) (var1.nextDual)).count;
        }
    }

    @ObfuscatedName("ff")
    @ObfuscatedSignature(descriptor = "(IZZZI)Lkz;", garbageValue = "492803972")
    @Export("newArchive")
    static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
        ArchiveDisk var4 = null;
        if (JagexCache.JagexCache_dat2File != null) {
            var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, VerticalAlignment.JagexCache_idxFiles[var0], 1000000);
        }
        return new Archive(var4, class16.masterDisk, var0, var1, var2, var3);
    }
}