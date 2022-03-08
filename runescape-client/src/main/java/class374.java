import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("nz")
public enum class374 implements MouseWheel {

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lnz;")
    field4267(1, 1),
    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lnz;")
    field4262(0, 2),
    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lnz;")
    field4263(2, 3),
    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Lnz;")
    field4264(3, 10);
    @ObfuscatedName("aw")
    static String field4266;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = 1282944377)
    final int field4265;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = 518533281)
    final int field4261;

    class374(int var3, int var4) {
        this.field4265 = var3;
        this.field4261 = var4;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-303340189")
    @Export("rsOrdinal")
    public int rsOrdinal() {
        return this.field4261;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/io/File;", garbageValue = "-2028285812")
    @Export("getFile")
    static File getFile(String var0) {
        if (!FileSystem.FileSystem_hasPermissions) {
            throw new RuntimeException("");
        } else {
            File var1 = ((File) (FileSystem.FileSystem_cacheFiles.get(var0)));
            if (var1 != null) {
                return var1;
            } else {
                File var2 = new File(SecureRandomCallable.FileSystem_cacheDir, var0);
                RandomAccessFile var3 = null;
                try {
                    File var4 = new File(var2.getParent());
                    if (!var4.exists()) {
                        throw new RuntimeException("");
                    } else {
                        var3 = new RandomAccessFile(var2, "rw");
                        int var5 = var3.read();
                        var3.seek(0L);
                        var3.write(var5);
                        var3.seek(0L);
                        var3.close();
                        FileSystem.FileSystem_cacheFiles.put(var0, var2);
                        return var2;
                    }
                } catch (Exception var8) {
                    try {
                        if (var3 != null) {
                            var3.close();
                            var3 = null;
                        }
                    } catch (Exception var7) {
                    }
                    throw new RuntimeException();
                }
            }
        }
    }

    @ObfuscatedName("f")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "127")
    static void method6776() {
        Player.method2159(24);
        UserComparator7.setLoginResponseString("", "You were disconnected from the server.", "");
    }
}