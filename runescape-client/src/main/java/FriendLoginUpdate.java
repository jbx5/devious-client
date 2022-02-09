import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("mu")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
    @ObfuscatedName("et")
    @ObfuscatedSignature(descriptor = "Lkz;")
    @Export("archive2")
    static Archive archive2;

    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = 2021515913)
    public int field4148;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lpb;")
    @Export("username")
    public Username username;

    @ObfuscatedName("s")
    @Export("world")
    public short world;

    @ObfuscatedSignature(descriptor = "(Lpb;I)V")
    FriendLoginUpdate(Username var1, int var2) {
        this.field4148 = ((int) (DirectByteArrayCopier.getServerTime() / 1000L));
        this.username = var1;
        this.world = ((short) (var2));
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Lnj;FFFI)F", garbageValue = "-1742547133")
    static float method6333(class373 var0, float var1, float var2, float var3) {
        float var4 = class113.method2602(var0.field4260, var0.field4258, var1);
        if (Math.abs(var4) < class112.field1386) {
            return var1;
        } else {
            float var5 = class113.method2602(var0.field4260, var0.field4258, var2);
            if (Math.abs(var5) < class112.field1386) {
                return var2;
            } else {
                float var6 = 0.0F;
                float var7 = 0.0F;
                float var8 = 0.0F;
                float var13 = 0.0F;
                boolean var14 = true;
                boolean var15 = false;
                do {
                    var15 = false;
                    if (var14) {
                        var6 = var1;
                        var13 = var4;
                        var7 = var2 - var1;
                        var8 = var7;
                        var14 = false;
                    }
                    if (Math.abs(var13) < Math.abs(var5)) {
                        var1 = var2;
                        var2 = var6;
                        var6 = var1;
                        var4 = var5;
                        var5 = var13;
                        var13 = var4;
                    }
                    float var16 = (class112.field1390 * Math.abs(var2)) + (var3 * 0.5F);
                    float var17 = 0.5F * (var6 - var2);
                    boolean var18 = (Math.abs(var17) > var16) && (var5 != 0.0F);
                    if (var18) {
                        if ((Math.abs(var8) >= var16) && (Math.abs(var4) > Math.abs(var5))) {
                            float var12 = var5 / var4;
                            float var9;
                            float var10;
                            if (var6 == var1) {
                                var9 = (var17 * 2.0F) * var12;
                                var10 = 1.0F - var12;
                            } else {
                                var10 = var4 / var13;
                                float var11 = var5 / var13;
                                var9 = (((((var10 - var11) * var10) * var17) * 2.0F) - ((var11 - 1.0F) * (var2 - var1))) * var12;
                                var10 = ((var12 - 1.0F) * (var11 - 1.0F)) * (var10 - 1.0F);
                            }
                            if (((double) (var9)) > 0.0) {
                                var10 = -var10;
                            } else {
                                var9 = -var9;
                            }
                            var12 = var8;
                            var8 = var7;
                            if (((var9 * 2.0F) < (((var10 * var17) * 3.0F) - Math.abs(var10 * var16))) && (var9 < Math.abs((0.5F * var12) * var10))) {
                                var7 = var9 / var10;
                            } else {
                                var7 = var17;
                                var8 = var17;
                            }
                        } else {
                            var7 = var17;
                            var8 = var17;
                        }
                        var1 = var2;
                        var4 = var5;
                        if (Math.abs(var7) > var16) {
                            var2 += var7;
                        } else if (((double) (var17)) > 0.0) {
                            var2 += var16;
                        } else {
                            var2 -= var16;
                        }
                        var5 = class113.method2602(var0.field4260, var0.field4258, var2);
                        if (((double) (var5 * (var13 / Math.abs(var13)))) > 0.0) {
                            var14 = true;
                            var15 = true;
                        } else {
                            var15 = true;
                        }
                    }
                } while (var15 );
                return var2;
            }
        }
    }

    @ObfuscatedName("ae")
    @ObfuscatedSignature(descriptor = "(ILbl;ZS)I", garbageValue = "-285")
    static int method6332(int var0, Script var1, boolean var2) {
        if (var0 == 6900) {
            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
            return 1;
        } else if (var0 == 6950) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
            return 1;
        } else {
            return 2;
        }
    }
}