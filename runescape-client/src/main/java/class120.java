import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("dw")
public class class120 extends DualNode {
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = 1678979845)
    int field1471;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "[[Ldt;")
    public class115[][] field1470;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "[[Ldt;")
    class115[][] field1472;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -1072517793)
    int field1473;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = -1031841031)
    int field1474;

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "Lgs;")
    public Skeleton field1478;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 1707817163)
    int field1476;

    @ObfuscatedName("w")
    boolean field1475;

    @ObfuscatedSignature(descriptor = "(Lkq;Lkq;IZ)V", garbageValue = "0")
    public class120(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
        this.field1470 = null;
        this.field1472 = null;
        this.field1476 = 0;
        this.field1471 = var3;
        byte[] var5 = var1.takeFile((this.field1471 >> 16) & 65535, this.field1471 & 65535);
        Buffer var6 = new Buffer(var5);
        int var7 = var6.readUnsignedByte();
        int var8 = var6.readUnsignedShort();
        byte[] var9 = var2.getFile(var8, 0);
        this.field1478 = new Skeleton(var8, var9);
        this.method2660(var6, var7);
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpi;IB)V", garbageValue = "79")
    void method2660(Buffer var1, int var2) {
        this.field1473 = var1.readUnsignedShort();
        this.field1474 = var1.readUnsignedShort();
        this.field1476 = var1.readUnsignedByte();
        int var3 = var1.readUnsignedShort();
        this.field1472 = new class115[this.field1478.method3887().method3871()][];
        this.field1470 = new class115[this.field1478.method3886()][];
        for (int var4 = 0; var4 < var3; ++var4) {
            class116 var5 = class113.method2600(var1.readUnsignedByte());
            int var6 = var1.readShortSmart();
            int var8 = var1.readUnsignedByte();
            class117 var9 = ((class117) (class140.findEnumerated(SoundCache.method792(), var8)));
            if (var9 == null) {
                var9 = class117.field1457;
            }
            class115 var10 = new class115();
            var10.method2619(var1, var2);
            int var11 = var5.method2640();
            class115[][] var12;
            if (var5 == class116.field1436) {
                var12 = this.field1472;
            } else {
                var12 = this.field1470;
            }
            if (var12[var6] == null) {
                var12[var6] = new class115[var11];
            }
            var12[var6][var9.method2647()] = var10;
            if (var5 == class116.field1441) {
                this.field1475 = true;
            }
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-14")
    int method2661() {
        return this.field1473;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1685844440")
    int method2662() {
        return this.field1474;
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1200373585")
    public int method2666() {
        return this.field1476;
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1020257728")
    public int method2693() {
        return this.method2662() - this.method2661();
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "30")
    public boolean method2697() {
        return this.field1475;
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(ILdm;IIB)V", garbageValue = "1")
    public void method2679(int var1, class113 var2, int var3, int var4) {
        class371 var5 = WorldMapSection0.method4716();
        this.method2687(var5, var3, var2, var1);
        this.method2669(var5, var3, var2, var1);
        this.method2680(var5, var3, var2, var1);
        var2.method2565(var5);
        var5.method6703();
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(Lni;ILdm;IS)V", garbageValue = "5450")
    void method2687(class371 var1, int var2, class113 var3, int var4) {
        float[] var5 = var3.method2569(this.field1476);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1472[var2] != null) {
            class115 var9 = this.field1472[var2][0];
            class115 var10 = this.field1472[var2][1];
            class115 var11 = this.field1472[var2][2];
            if (var9 != null) {
                var6 = var9.method2611(var4);
            }
            if (var10 != null) {
                var7 = var10.method2611(var4);
            }
            if (var11 != null) {
                var8 = var11.method2611(var4);
            }
        }
        class370 var20 = GrandExchangeOfferNameComparator.method5704();
        var20.method6669(1.0F, 0.0F, 0.0F, var6);
        class370 var21;
        synchronized(class370.field4235) {
            if (class370.field4231 == 0) {
                var21 = new class370();
            } else {
                class370.field4235[--class370.field4231].method6643();
                var21 = class370.field4235[class370.field4231];
            }
        }
        var21.method6669(0.0F, 1.0F, 0.0F, var7);
        class370 var12;
        synchronized(class370.field4235) {
            if (class370.field4231 == 0) {
                var12 = new class370();
            } else {
                class370.field4235[--class370.field4231].method6643();
                var12 = class370.field4235[class370.field4231];
            }
        }
        var12.method6669(0.0F, 0.0F, 1.0F, var8);
        class370 var14;
        synchronized(class370.field4235) {
            if (class370.field4231 == 0) {
                var14 = new class370();
            } else {
                class370.field4235[--class370.field4231].method6643();
                var14 = class370.field4235[class370.field4231];
            }
        }
        var14.method6663(var12);
        var14.method6663(var20);
        var14.method6663(var21);
        class371 var16 = WorldMapSection0.method4716();
        var16.method6683(var14);
        var1.method6682(var16);
        var20.method6642();
        var21.method6642();
        var12.method6642();
        var14.method6642();
        var16.method6703();
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(Lni;ILdm;II)V", garbageValue = "238134222")
    void method2680(class371 var1, int var2, class113 var3, int var4) {
        float[] var5 = var3.method2589(this.field1476);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1472[var2] != null) {
            class115 var9 = this.field1472[var2][3];
            class115 var10 = this.field1472[var2][4];
            class115 var11 = this.field1472[var2][5];
            if (var9 != null) {
                var6 = var9.method2611(var4);
            }
            if (var10 != null) {
                var7 = var10.method2611(var4);
            }
            if (var11 != null) {
                var8 = var11.method2611(var4);
            }
        }
        var1.field4241[12] = var6;
        var1.field4241[13] = var7;
        var1.field4241[14] = var8;
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(Lni;ILdm;II)V", garbageValue = "1303358455")
    void method2669(class371 var1, int var2, class113 var3, int var4) {
        float[] var5 = var3.method2570(this.field1476);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1472[var2] != null) {
            class115 var9 = this.field1472[var2][6];
            class115 var10 = this.field1472[var2][7];
            class115 var11 = this.field1472[var2][8];
            if (var9 != null) {
                var6 = var9.method2611(var4);
            }
            if (var10 != null) {
                var7 = var10.method2611(var4);
            }
            if (var11 != null) {
                var8 = var11.method2611(var4);
            }
        }
        class371 var12 = WorldMapSection0.method4716();
        var12.method6681(var6, var7, var8);
        var1.method6682(var12);
        var12.method6703();
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(ILbl;ZI)I", garbageValue = "1719618305")
    static int method2698(int var0, Script var1, boolean var2) {
        int var4;
        int var9;
        if (var0 == ScriptOpcodes.CC_CREATE) {
            Interpreter.Interpreter_intStackSize -= 3;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            int var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            } else {
                Widget var6 = class130.getWidget(var9);
                if (var6.children == null) {
                    var6.children = new Widget[var11 + 1];
                }
                if (var6.children.length <= var11) {
                    Widget[] var7 = new Widget[var11 + 1];
                    for (int var8 = 0; var8 < var6.children.length; ++var8) {
                        var7[var8] = var6.children[var8];
                    }
                    var6.children = var7;
                }
                if ((var11 > 0) && (var6.children[var11 - 1] == null)) {
                    throw new RuntimeException("" + (var11 - 1));
                } else {
                    Widget var12 = new Widget();
                    var12.type = var4;
                    var12.parentId = var12.id = var6.id;
                    var12.childIndex = var11;
                    var12.isIf3 = true;
                    var6.children[var11] = var12;
                    if (var2) {
                        class16.scriptDotWidget = var12;
                    } else {
                        Interpreter.scriptActiveWidget = var12;
                    }
                    class112.invalidateWidget(var6);
                    return 1;
                }
            }
        } else {
            Widget var3;
            if (var0 == ScriptOpcodes.CC_DELETE) {
                var3 = (var2) ? class16.scriptDotWidget : Interpreter.scriptActiveWidget;
                Widget var10 = class130.getWidget(var3.id);
                var10.children[var3.childIndex] = null;
                class112.invalidateWidget(var10);
                return 1;
            } else if (var0 == ScriptOpcodes.CC_DELETEALL) {
                var3 = class130.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
                var3.children = null;
                class112.invalidateWidget(var3);
                return 1;
            } else if (var0 == 103) {
                Interpreter.Interpreter_intStackSize -= 3;
                return 1;
            } else if (var0 == 104) {
                --Interpreter.Interpreter_intStackSize;
                return 1;
            } else if (var0 != ScriptOpcodes.CC_FIND) {
                if (var0 == ScriptOpcodes.IF_FIND) {
                    var3 = class130.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
                    if (var3 != null) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
                        if (var2) {
                            class16.scriptDotWidget = var3;
                        } else {
                            Interpreter.scriptActiveWidget = var3;
                        }
                    } else {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                    }
                    return 1;
                } else if (var0 == 202) {
                    Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] = 0;
                    return 1;
                } else if (var0 == 203) {
                    Interpreter.Interpreter_intStack[(--Interpreter.Interpreter_intStackSize) + 1] = 0;
                    return 1;
                } else {
                    return 2;
                }
            } else {
                Interpreter.Interpreter_intStackSize -= 2;
                var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                Widget var5 = ModeWhere.getWidgetChild(var9, var4);
                if ((var5 != null) && (var4 != (-1))) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
                    if (var2) {
                        class16.scriptDotWidget = var5;
                    } else {
                        Interpreter.scriptActiveWidget = var5;
                    }
                } else {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                }
                return 1;
            }
        }
    }

    @ObfuscatedName("j")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1669093139")
    static void method2699() {
        Login.worldSelectOpen = false;
        class260.leftTitleSprite.drawAt(Login.xPadding, 0);
        FriendSystem.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
        class28.logoSprite.drawAt((Login.xPadding + 382) - (class28.logoSprite.subWidth / 2), 18);
    }
}