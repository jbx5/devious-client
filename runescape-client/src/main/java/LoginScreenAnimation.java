import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("cc")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
    @ObfuscatedName("fz")
    static String field1200;

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "[Lpg;")
    @Export("sprites")
    IndexedSprite[] sprites;

    @ObfuscatedName("i")
    int[] field1193;

    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -1599270879)
    int field1194;

    @ObfuscatedName("v")
    int[] field1195;

    @ObfuscatedName("a")
    int[] field1196;

    @ObfuscatedName("y")
    int[] field1191;

    @ObfuscatedName("u")
    int[] field1208;

    @ObfuscatedName("h")
    @ObfuscatedGetter(intValue = -156558015)
    int field1198;

    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = 1783303053)
    int field1197;

    @ObfuscatedName("x")
    int[] field1201;

    @ObfuscatedName("p")
    int[] field1202;

    @ObfuscatedName("n")
    int[] field1203;

    @ObfuscatedName("m")
    int[] field1204;

    @ObfuscatedName("d")
    @ObfuscatedGetter(intValue = -233088909)
    int field1205;

    @ObfuscatedName("j")
    @ObfuscatedGetter(intValue = -1165677427)
    int field1206;

    @ObfuscatedName("f")
    @ObfuscatedGetter(intValue = 1265486129)
    int field1189;

    @ObfuscatedSignature(descriptor = "([Lpg;)V")
    LoginScreenAnimation(IndexedSprite[] var1) {
        this.field1193 = new int[256];
        this.field1194 = 0;
        this.field1198 = 0;
        this.field1197 = 0;
        this.field1205 = 0;
        this.field1206 = 0;
        this.field1189 = 0;
        this.sprites = var1;
        this.initColors();
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1819291611")
    @Export("initColors")
    void initColors() {
        this.field1196 = new int[256];
        int var1;
        for (var1 = 0; var1 < 64; ++var1) {
            this.field1196[var1] = var1 * 262144;
        }
        for (var1 = 0; var1 < 64; ++var1) {
            this.field1196[var1 + 64] = (var1 * 1024) + 16711680;
        }
        for (var1 = 0; var1 < 64; ++var1) {
            this.field1196[var1 + 128] = (var1 * 4) + 16776960;
        }
        for (var1 = 0; var1 < 64; ++var1) {
            this.field1196[var1 + 192] = 16777215;
        }
        this.field1191 = new int[256];
        for (var1 = 0; var1 < 64; ++var1) {
            this.field1191[var1] = var1 * 1024;
        }
        for (var1 = 0; var1 < 64; ++var1) {
            this.field1191[var1 + 64] = (var1 * 4) + 65280;
        }
        for (var1 = 0; var1 < 64; ++var1) {
            this.field1191[var1 + 128] = (var1 * 262144) + 65535;
        }
        for (var1 = 0; var1 < 64; ++var1) {
            this.field1191[var1 + 192] = 16777215;
        }
        this.field1208 = new int[256];
        for (var1 = 0; var1 < 64; ++var1) {
            this.field1208[var1] = var1 * 4;
        }
        for (var1 = 0; var1 < 64; ++var1) {
            this.field1208[var1 + 64] = (var1 * 262144) + 255;
        }
        for (var1 = 0; var1 < 64; ++var1) {
            this.field1208[var1 + 128] = (var1 * 1024) + 16711935;
        }
        for (var1 = 0; var1 < 64; ++var1) {
            this.field1208[var1 + 192] = 16777215;
        }
        this.field1195 = new int[256];
        this.field1205 = 0;
        this.field1203 = new int[32768];
        this.field1204 = new int[32768];
        this.method2204(((IndexedSprite) (null)));
        this.field1201 = new int[32768];
        this.field1202 = new int[32768];
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1740106478")
    void method2208() {
        this.field1196 = null;
        this.field1191 = null;
        this.field1208 = null;
        this.field1195 = null;
        this.field1203 = null;
        this.field1204 = null;
        this.field1201 = null;
        this.field1202 = null;
        this.field1205 = 0;
        this.field1206 = 0;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "1")
    @Export("draw")
    void draw(int var1, int var2) {
        if (this.field1201 == null) {
            this.initColors();
        }
        if (this.field1189 == 0) {
            this.field1189 = var2;
        }
        int var3 = var2 - this.field1189;
        if (var3 >= 256) {
            var3 = 0;
        }
        this.field1189 = var2;
        if (var3 > 0) {
            this.method2187(var3);
        }
        this.method2209(var1);
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-55")
    final void method2187(int var1) {
        this.field1205 += 128 * var1;
        int var2;
        if (this.field1205 > this.field1203.length) {
            this.field1205 -= this.field1203.length;
            var2 = ((int) (Math.random() * 12.0));
            this.method2204(this.sprites[var2]);
        }
        var2 = 0;
        int var3 = var1 * 128;
        int var4 = (256 - var1) * 128;
        int var6;
        for (int var5 = 0; var5 < var4; ++var5) {
            var6 = this.field1201[var2 + var3] - ((this.field1203[(var2 + this.field1205) & (this.field1203.length - 1)] * var1) / 6);
            if (var6 < 0) {
                var6 = 0;
            }
            this.field1201[var2++] = var6;
        }
        byte var15 = 10;
        var6 = 128 - var15;
        int var7;
        int var10;
        for (var7 = 256 - var1; var7 < 256; ++var7) {
            int var8 = var7 * 128;
            for (int var9 = 0; var9 < 128; ++var9) {
                var10 = ((int) (Math.random() * 100.0));
                if (((var10 < 50) && (var9 > var15)) && (var9 < var6)) {
                    this.field1201[var9 + var8] = 255;
                } else {
                    this.field1201[var9 + var8] = 0;
                }
            }
        }
        if (this.field1198 > 0) {
            this.field1198 -= var1 * 4;
        }
        if (this.field1197 > 0) {
            this.field1197 -= var1 * 4;
        }
        if ((this.field1198 == 0) && (this.field1197 == 0)) {
            var7 = ((int) (Math.random() * ((double) (2000 / var1))));
            if (var7 == 0) {
                this.field1198 = 1024;
            }
            if (var7 == 1) {
                this.field1197 = 1024;
            }
        }
        for (var7 = 0; var7 < (256 - var1); ++var7) {
            this.field1193[var7] = this.field1193[var7 + var1];
        }
        for (var7 = 256 - var1; var7 < 256; ++var7) {
            this.field1193[var7] = ((int) (((Math.sin(((double) (this.field1194)) / 14.0) * 16.0) + (Math.sin(((double) (this.field1194)) / 15.0) * 14.0)) + (Math.sin(((double) (this.field1194)) / 16.0) * 12.0)));
            ++this.field1194;
        }
        this.field1206 += var1;
        var7 = ((Client.cycle & 1) + var1) / 2;
        if (var7 > 0) {
            short var16 = 128;
            byte var17 = 2;
            var10 = (128 - var17) - var17;
            int var11;
            int var12;
            int var13;
            for (var11 = 0; var11 < (this.field1206 * 100); ++var11) {
                var12 = ((int) (Math.random() * ((double) (var10)))) + var17;
                var13 = ((int) (Math.random() * ((double) (var16)))) + var16;
                this.field1201[var12 + (var13 << 7)] = 192;
            }
            this.field1206 = 0;
            int var14;
            for (var11 = 0; var11 < 256; ++var11) {
                var12 = 0;
                var13 = var11 * 128;
                for (var14 = -var7; var14 < 128; ++var14) {
                    if ((var14 + var7) < 128) {
                        var12 += this.field1201[(var14 + var13) + var7];
                    }
                    if ((var14 - (var7 + 1)) >= 0) {
                        var12 -= this.field1201[(var14 + var13) - (var7 + 1)];
                    }
                    if (var14 >= 0) {
                        this.field1202[var13 + var14] = var12 / ((var7 * 2) + 1);
                    }
                }
            }
            for (var11 = 0; var11 < 128; ++var11) {
                var12 = 0;
                for (var13 = -var7; var13 < 256; ++var13) {
                    var14 = var13 * 128;
                    if ((var13 + var7) < 256) {
                        var12 += this.field1202[(var11 + var14) + (var7 * 128)];
                    }
                    if ((var13 - (var7 + 1)) >= 0) {
                        var12 -= this.field1202[(var11 + var14) - ((var7 + 1) * 128)];
                    }
                    if (var13 >= 0) {
                        this.field1201[var11 + var14] = var12 / ((var7 * 2) + 1);
                    }
                }
            }
        }
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(IIII)I", garbageValue = "-833857327")
    final int method2188(int var1, int var2, int var3) {
        int var4 = 256 - var3;
        return ((((var3 * (var2 & 65280)) + (var4 * (var1 & 65280))) & 16711680) + (((var4 * (var1 & 16711935)) + (var3 * (var2 & 16711935))) & (-16711936))) >> 8;
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-814155741")
    final void method2209(int var1) {
        int var2 = this.field1195.length;
        if (this.field1198 > 0) {
            this.method2206(this.field1198, this.field1191);
        } else if (this.field1197 > 0) {
            this.method2206(this.field1197, this.field1208);
        } else {
            for (int var3 = 0; var3 < var2; ++var3) {
                this.field1195[var3] = this.field1196[var3];
            }
        }
        this.method2192(var1);
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(I[II)V", garbageValue = "1008871550")
    final void method2206(int var1, int[] var2) {
        int var3 = this.field1195.length;
        for (int var4 = 0; var4 < var3; ++var4) {
            if (var1 > 768) {
                this.field1195[var4] = this.method2188(this.field1196[var4], var2[var4], 1024 - var1);
            } else if (var1 > 256) {
                this.field1195[var4] = var2[var4];
            } else {
                this.field1195[var4] = this.method2188(var2[var4], this.field1196[var4], 256 - var1);
            }
        }
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-119")
    final void method2192(int var1) {
        int var2 = 0;
        for (int var3 = 1; var3 < 255; ++var3) {
            int var4 = ((256 - var3) * this.field1193[var3]) / 256;
            int var5 = var4 + var1;
            int var6 = 0;
            int var7 = 128;
            if (var5 < 0) {
                var6 = -var5;
                var5 = 0;
            }
            if ((var5 + 128) >= PcmPlayer.rasterProvider.width) {
                var7 = PcmPlayer.rasterProvider.width - var5;
            }
            int var8 = var5 + ((var3 + 8) * PcmPlayer.rasterProvider.width);
            var2 += var6;
            for (int var9 = var6; var9 < var7; ++var9) {
                int var10 = this.field1201[var2++];
                int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
                if (((var10 != 0) && (var11 >= Rasterizer2D.Rasterizer2D_xClipStart)) && (var11 < Rasterizer2D.Rasterizer2D_xClipEnd)) {
                    int var12 = var10;
                    int var13 = 256 - var10;
                    var10 = this.field1195[var10];
                    int var14 = PcmPlayer.rasterProvider.pixels[var8];
                    PcmPlayer.rasterProvider.pixels[var8++] = (-16777216) | (((((var12 * (var10 & 65280)) + (var13 * (var14 & 65280))) & 16711680) + ((((var10 & 16711935) * var12) + ((var14 & 16711935) * var13)) & (-16711936))) >> 8);
                } else {
                    ++var8;
                }
            }
            var2 += 128 - var7;
        }
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(Lpg;I)V", garbageValue = "-895320228")
    final void method2204(IndexedSprite var1) {
        int var2;
        for (var2 = 0; var2 < this.field1203.length; ++var2) {
            this.field1203[var2] = 0;
        }
        int var3;
        for (var2 = 0; var2 < 5000; ++var2) {
            var3 = ((int) ((Math.random() * 128.0) * 256.0));
            this.field1203[var3] = ((int) (Math.random() * 256.0));
        }
        int var4;
        int var5;
        for (var2 = 0; var2 < 20; ++var2) {
            for (var3 = 1; var3 < 255; ++var3) {
                for (var4 = 1; var4 < 127; ++var4) {
                    var5 = var4 + (var3 << 7);
                    this.field1204[var5] = (((this.field1203[var5 + 128] + this.field1203[var5 - 128]) + this.field1203[var5 + 1]) + this.field1203[var5 - 1]) / 4;
                }
            }
            int[] var8 = this.field1203;
            this.field1203 = this.field1204;
            this.field1204 = var8;
        }
        if (var1 != null) {
            var2 = 0;
            for (var3 = 0; var3 < var1.subHeight; ++var3) {
                for (var4 = 0; var4 < var1.subWidth; ++var4) {
                    if (var1.pixels[var2++] != 0) {
                        var5 = (var4 + var1.xOffset) + 16;
                        int var6 = (var3 + var1.yOffset) + 16;
                        int var7 = var5 + (var6 << 7);
                        this.field1203[var7] = 0;
                    }
                }
            }
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V", garbageValue = "-205678556")
    @Export("addGameMessage")
    static void addGameMessage(int var0, String var1, String var2) {
        GraphicsObject.addChatMessage(var0, var1, var2, ((String) (null)));
    }

    @ObfuscatedName("l")
    public static boolean method2219(long var0) {
        boolean var2 = var0 != 0L;
        if (var2) {
            boolean var3 = ((int) ((var0 >>> 16) & 1L)) == 1;
            var2 = !var3;
        }
        return var2;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;", garbageValue = "-932017962")
    @Export("colorStartTag")
    static String colorStartTag(int var0) {
        return ("<col=" + Integer.toHexString(var0)) + ">";
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(Lbi;Lbi;IZB)I", garbageValue = "37")
    @Export("compareWorlds")
    static int compareWorlds(World var0, World var1, int var2, boolean var3) {
        if (var2 == 1) {
            int var4 = var0.population;
            int var5 = var1.population;
            if (!var3) {
                if (var4 == (-1)) {
                    var4 = 2001;
                }
                if (var5 == (-1)) {
                    var5 = 2001;
                }
            }
            return var4 - var5;
        } else if (var2 == 2) {
            return var0.location - var1.location;
        } else if (var2 == 3) {
            if (var0.activity.equals("-")) {
                if (var1.activity.equals("-")) {
                    return 0;
                } else {
                    return var3 ? -1 : 1;
                }
            } else if (var1.activity.equals("-")) {
                return var3 ? 1 : -1;
            } else {
                return var0.activity.compareTo(var1.activity);
            }
        } else if (var2 == 4) {
            return var0.method1662() ? var1.method1662() ? 0 : 1 : var1.method1662() ? -1 : 0;
        } else if (var2 == 5) {
            return var0.method1649() ? var1.method1649() ? 0 : 1 : var1.method1649() ? -1 : 0;
        } else if (var2 == 6) {
            return var0.isPvp() ? var1.isPvp() ? 0 : 1 : var1.isPvp() ? -1 : 0;
        } else if (var2 == 7) {
            return var0.isMembersOnly() ? var1.isMembersOnly() ? 0 : 1 : var1.isMembersOnly() ? -1 : 0;
        } else {
            return var0.id - var1.id;
        }
    }

    @ObfuscatedName("ha")
    @ObfuscatedSignature(descriptor = "(Lcq;IS)V", garbageValue = "-10156")
    static final void method2214(Actor var0, int var1) {
        class148.worldToScreen(var0.x, var0.y, var1);
    }

    @ObfuscatedName("kx")
    @ObfuscatedSignature(descriptor = "(Ljz;I)Z", garbageValue = "-293317117")
    static final boolean method2218(Widget var0) {
        int var1 = var0.contentType;
        if (var1 == 205) {
            Client.logoutTimer = 250;
            return true;
        } else {
            int var2;
            int var3;
            if ((var1 >= 300) && (var1 <= 313)) {
                var2 = (var1 - 300) / 2;
                var3 = var1 & 1;
                Client.playerAppearance.changeAppearance(var2, var3 == 1);
            }
            if ((var1 >= 314) && (var1 <= 323)) {
                var2 = (var1 - 314) / 2;
                var3 = var1 & 1;
                Client.playerAppearance.method5393(var2, var3 == 1);
            }
            if (var1 == 324) {
                Client.playerAppearance.changeSex(false);
            }
            if (var1 == 325) {
                Client.playerAppearance.changeSex(true);
            }
            if (var1 == 326) {
                PacketBufferNode var4 = class135.getPacketBufferNode(ClientPacket.field2922, Client.packetWriter.isaacCipher);
                Client.playerAppearance.write(var4.packetBuffer);
                Client.packetWriter.addNode(var4);
                return true;
            } else {
                return false;
            }
        }
    }
}