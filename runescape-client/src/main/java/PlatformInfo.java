import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("om")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
    @ObfuscatedName("aa")
    @ObfuscatedGetter(intValue = -2111873731)
    int field4310;

    @ObfuscatedName("ao")
    boolean field4315;

    @ObfuscatedName("aq")
    @ObfuscatedGetter(intValue = 928794825)
    int field4332;

    @ObfuscatedName("ay")
    @ObfuscatedGetter(intValue = 1141313035)
    int field4327;

    @ObfuscatedName("ac")
    @ObfuscatedGetter(intValue = 1295695619)
    int field4318;

    @ObfuscatedName("ab")
    @ObfuscatedGetter(intValue = 1348526855)
    int field4321;

    @ObfuscatedName("as")
    @ObfuscatedGetter(intValue = 375945725)
    int field4320;

    @ObfuscatedName("ag")
    boolean field4339;

    @ObfuscatedName("az")
    @ObfuscatedGetter(intValue = 1255519543)
    int field4322;

    @ObfuscatedName("ad")
    @ObfuscatedGetter(intValue = -795648819)
    int field4338;

    @ObfuscatedName("at")
    @ObfuscatedGetter(intValue = 1868037803)
    int field4323;

    @ObfuscatedName("ae")
    @ObfuscatedGetter(intValue = -2120333351)
    int field4325;

    @ObfuscatedName("an")
    String field4326;

    @ObfuscatedName("aw")
    String field4333;

    @ObfuscatedName("aj")
    String field4328;

    @ObfuscatedName("ax")
    String field4319;

    @ObfuscatedName("ah")
    @ObfuscatedGetter(intValue = -424689989)
    int field4330;

    @ObfuscatedName("ai")
    @ObfuscatedGetter(intValue = 124820225)
    int field4331;

    @ObfuscatedName("am")
    @ObfuscatedGetter(intValue = 3563507)
    int field4311;

    @ObfuscatedName("be")
    @ObfuscatedGetter(intValue = 1090045979)
    int field4329;

    @ObfuscatedName("bt")
    String field4334;

    @ObfuscatedName("bn")
    String field4335;

    @ObfuscatedName("bz")
    int[] field4336;

    @ObfuscatedName("bx")
    @ObfuscatedGetter(intValue = 179713279)
    int field4337;

    @ObfuscatedName("bd")
    String field4309;

    PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
        this.field4336 = new int[3];
        this.field4310 = var1;
        this.field4315 = var2;
        this.field4332 = var3;
        this.field4327 = var4;
        this.field4318 = var5;
        this.field4321 = var6;
        this.field4320 = var7;
        this.field4339 = var8;
        this.field4322 = var9;
        this.field4338 = var10;
        this.field4323 = var11;
        this.field4325 = var12;
        this.field4326 = var13;
        this.field4333 = var14;
        this.field4328 = var15;
        this.field4319 = var16;
        this.field4330 = var17;
        this.field4331 = var18;
        this.field4311 = var19;
        this.field4329 = var20;
        this.field4334 = var21;
        this.field4335 = var22;
        this.field4336 = var23;
        this.field4337 = var24;
        this.field4309 = var25;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpi;B)V", garbageValue = "-32")
    @Export("write")
    public void write(Buffer var1) {
        var1.writeByte(8);
        var1.writeByte(this.field4310);
        var1.writeByte(this.field4315 ? 1 : 0);
        var1.writeShort(this.field4332);
        var1.writeByte(this.field4327);
        var1.writeByte(this.field4318);
        var1.writeByte(this.field4321);
        var1.writeByte(this.field4320);
        var1.writeByte(this.field4339 ? 1 : 0);
        var1.writeShort(this.field4322);
        var1.writeByte(this.field4338);
        var1.writeMedium(this.field4323);
        var1.writeShort(this.field4325);
        var1.writeStringCp1252NullCircumfixed(this.field4326);
        var1.writeStringCp1252NullCircumfixed(this.field4333);
        var1.writeStringCp1252NullCircumfixed(this.field4328);
        var1.writeStringCp1252NullCircumfixed(this.field4319);
        var1.writeByte(this.field4331);
        var1.writeShort(this.field4330);
        var1.writeStringCp1252NullCircumfixed(this.field4334);
        var1.writeStringCp1252NullCircumfixed(this.field4335);
        var1.writeByte(this.field4311);
        var1.writeByte(this.field4329);
        for (int var2 = 0; var2 < this.field4336.length; ++var2) {
            var1.writeInt(this.field4336[var2]);
        }
        var1.writeInt(this.field4337);
        var1.writeStringCp1252NullCircumfixed(this.field4309);
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1721444510")
    @Export("size")
    public int size() {
        byte var1 = 39;
        int var17 = var1 + class160.method3126(this.field4326);
        var17 += class160.method3126(this.field4333);
        String var4 = this.field4328;
        int var3 = var4.length() + 2;
        var17 += var3;
        String var7 = this.field4319;
        int var6 = var7.length() + 2;
        var17 += var6;
        String var10 = this.field4334;
        int var9 = var10.length() + 2;
        var17 += var9;
        String var13 = this.field4335;
        int var12 = var13.length() + 2;
        var17 += var12;
        String var16 = this.field4309;
        int var15 = var16.length() + 2;
        var17 += var15;
        return var17;
    }

    @ObfuscatedName("jb")
    @ObfuscatedSignature(descriptor = "(Ljz;IIIIIII)V", garbageValue = "-1881244247")
    static final void method6860(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        if (Client.field571) {
            Client.alternativeScrollbarWidth = 32;
        } else {
            Client.alternativeScrollbarWidth = 0;
        }
        Client.field571 = false;
        int var7;
        if ((MouseHandler.MouseHandler_currentButton == 1) || ((!class370.mouseCam) && (MouseHandler.MouseHandler_currentButton == 4))) {
            if ((((var5 >= var1) && (var5 < (var1 + 16))) && (var6 >= var2)) && (var6 < (var2 + 16))) {
                var0.scrollY -= 4;
                class112.invalidateWidget(var0);
            } else if ((((var5 >= var1) && (var5 < (var1 + 16))) && (var6 >= ((var3 + var2) - 16))) && (var6 < (var3 + var2))) {
                var0.scrollY += 4;
                class112.invalidateWidget(var0);
            } else if ((((var5 >= (var1 - Client.alternativeScrollbarWidth)) && (var5 < ((Client.alternativeScrollbarWidth + var1) + 16))) && (var6 >= (var2 + 16))) && (var6 < ((var3 + var2) - 16))) {
                var7 = (var3 * (var3 - 32)) / var4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = ((var6 - var2) - 16) - (var7 / 2);
                int var9 = (var3 - 32) - var7;
                var0.scrollY = (var8 * (var4 - var3)) / var9;
                class112.invalidateWidget(var0);
                Client.field571 = true;
            }
        }
        if (Client.mouseWheelRotation != 0) {
            var7 = var0.width;
            if ((((var5 >= (var1 - var7)) && (var6 >= var2)) && (var5 < (var1 + 16))) && (var6 <= (var3 + var2))) {
                var0.scrollY += Client.mouseWheelRotation * 45;
                class112.invalidateWidget(var0);
            }
        }
    }
}