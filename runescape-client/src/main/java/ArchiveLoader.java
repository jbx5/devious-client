import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("bk")
@Implements("ArchiveLoader")
public class ArchiveLoader {
    @ObfuscatedName("f")
    @Export("formattedOperatingSystemName")
    public static String formattedOperatingSystemName;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lkz;")
    @Export("archive")
    final Archive archive;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 588213751)
    @Export("groupCount")
    final int groupCount;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = 315923437)
    @Export("loadedCount")
    int loadedCount;

    @ObfuscatedSignature(descriptor = "(Lkz;Ljava/lang/String;)V")
    ArchiveLoader(Archive var1, String var2) {
        this.loadedCount = 0;
        this.archive = var1;
        this.groupCount = var1.getGroupCount();
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "1")
    @Export("isLoaded")
    boolean isLoaded() {
        this.loadedCount = 0;
        for (int var1 = 0; var1 < this.groupCount; ++var1) {
            if ((!this.archive.method5530(var1)) || this.archive.method5557(var1)) {
                ++this.loadedCount;
            }
        }
        return this.loadedCount >= this.groupCount;
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(Lkq;Ljava/lang/String;Ljava/lang/String;I)[Lpt;", garbageValue = "1930156810")
    public static SpritePixels[] method2061(AbstractArchive var0, String var1, String var2) {
        int var3 = var0.getGroupId(var1);
        int var4 = var0.getFileId(var3, var2);
        return UserList.method6415(var0, var3, var4);
    }

    @ObfuscatedName("bk")
    @ObfuscatedSignature(descriptor = "([BB)[B", garbageValue = "70")
    @Export("decompressBytes")
    static final byte[] decompressBytes(byte[] var0) {
        Buffer var1 = new Buffer(var0);
        int var2 = var1.readUnsignedByte();
        int var3 = var1.readInt();
        if ((var3 < 0) || ((AbstractArchive.field3910 != 0) && (var3 > AbstractArchive.field3910))) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var6 = new byte[var3];
            var1.readBytes(var6, 0, var3);
            return var6;
        } else {
            int var4 = var1.readInt();
            if ((var4 >= 0) && ((AbstractArchive.field3910 == 0) || (var4 <= AbstractArchive.field3910))) {
                byte[] var5 = new byte[var4];
                if (var2 == 1) {
                    BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
                } else {
                    AbstractArchive.gzipDecompressor.decompress(var1, var5);
                }
                return var5;
            } else {
                throw new RuntimeException();
            }
        }
    }

    @ObfuscatedName("iz")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZI)V", garbageValue = "57386745")
    @Export("insertMenuItem")
    static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
        if (!Client.isMenuOpen) {
            if (Client.menuOptionsCount < 500) {
                Client.menuActions[Client.menuOptionsCount] = var0;
                Client.menuTargets[Client.menuOptionsCount] = var1;
                Client.menuOpcodes[Client.menuOptionsCount] = var2;
                Client.menuIdentifiers[Client.menuOptionsCount] = var3;
                Client.menuArguments1[Client.menuOptionsCount] = var4;
                Client.menuArguments2[Client.menuOptionsCount] = var5;
                Client.menuShiftClick[Client.menuOptionsCount] = var6;
                ++Client.menuOptionsCount;
            }
        }
    }
}