import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("mn")
@Implements("IgnoreList")
public class IgnoreList extends UserList {
    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lok;")
    @Export("loginType")
    final LoginType loginType;

    @ObfuscatedSignature(descriptor = "(Lok;)V")
    public IgnoreList(LoginType var1) {
        super(400);
        this.loginType = var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)Lmy;", garbageValue = "2000225121")
    @Export("newInstance")
    User newInstance() {
        return new Ignored();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(IB)[Lmy;", garbageValue = "55")
    @Export("newTypedArray")
    User[] newTypedArray(int var1) {
        return new Ignored[var1];
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Lpi;II)V", garbageValue = "2036771987")
    @Export("read")
    public void read(Buffer var1, int var2) {
        while (true) {
            if (var1.offset < var2) {
                int var3 = var1.readUnsignedByte();
                boolean var4 = (var3 & 1) == 1;
                Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
                Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
                var1.readStringCp1252NullTerminated();
                if ((var5 != null) && var5.hasCleanName()) {
                    Ignored var7 = ((Ignored) (this.getByCurrentUsername(var5)));
                    if (var4) {
                        Ignored var8 = ((Ignored) (this.getByCurrentUsername(var6)));
                        if ((var8 != null) && (var8 != var7)) {
                            if (var7 != null) {
                                this.remove(var8);
                            } else {
                                var7 = var8;
                            }
                        }
                    }
                    if (var7 != null) {
                        this.changeName(var7, var5, var6);
                        continue;
                    }
                    if (this.getSize() < 400) {
                        int var9 = this.getSize();
                        var7 = ((Ignored) (this.addLast(var5, var6)));
                        var7.id = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        } 
    }

    @ObfuscatedName("j")
    @ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "33")
    static final int method6264(int var0, int var1) {
        if (var0 == (-2)) {
            return 12345678;
        } else if (var0 == (-1)) {
            if (var1 < 2) {
                var1 = 2;
            } else if (var1 > 126) {
                var1 = 126;
            }
            return var1;
        } else {
            var1 = ((var0 & 127) * var1) / 128;
            if (var1 < 2) {
                var1 = 2;
            } else if (var1 > 126) {
                var1 = 126;
            }
            return (var0 & 65408) + var1;
        }
    }

    @ObfuscatedName("al")
    @ObfuscatedSignature(descriptor = "(Lfg;I)Z", garbageValue = "65280")
    static boolean method6265(ObjectComposition var0) {
        if (var0.transforms != null) {
            int[] var1 = var0.transforms;
            for (int var2 = 0; var2 < var1.length; ++var2) {
                int var3 = var1[var2];
                ObjectComposition var4 = ParamComposition.getObjectDefinition(var3);
                if (var4.mapIconId != (-1)) {
                    return true;
                }
            }
        } else if (var0.mapIconId != (-1)) {
            return true;
        }
        return false;
    }
}