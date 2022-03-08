import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("nu")
public abstract class class378 implements class241 {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Loi;")
    class414 field4270;

    class378(int var1) {
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpi;II)V", garbageValue = "1610720083")
    abstract void vmethod6802(Buffer var1, int var2);

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(Lpi;B)V", garbageValue = "-8")
    public void method6797(Buffer var1) {
        while (true) {
            int var2 = var1.readUnsignedByte();
            if (var2 == 0) {
                return;
            }
            class374 var3 = ((class374) (class140.findEnumerated(Friend.method6284(), var2)));
            if (var3 != null) {
                switch (var3.field4265) {
                    case 0 :
                        class140.findEnumerated(WorldMapData_1.method4638(), var1.readUnsignedByte());
                        break;
                    case 1 :
                        int var4 = var1.readUnsignedByte();
                        this.field4270 = class14.method178(var4);
                        if (this.field4270 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
                    case 2 :
                    default :
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
                    case 3 :
                        var1.readStringCp1252NullCircumfixed();
                }
            } else {
                this.vmethod6802(var1, var2);
            }
        } 
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(S)Z", garbageValue = "-32142")
    boolean method6799() {
        return this.field4270 != null;
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;", garbageValue = "215034854")
    Object method6800() {
        if (this.field4270 == class414.field4487) {
            return 0;
        } else if (this.field4270 == class414.field4489) {
            return -1L;
        } else {
            return this.field4270 == class414.field4495 ? "" : null;
        }
    }
}