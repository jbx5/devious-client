import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("dn")
public class class125 extends class126 {
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = 863990671)
    int field1514;

    @ObfuscatedSignature(descriptor = "Ldk;")
    final class129 this$0;

    @ObfuscatedSignature(descriptor = "(Ldk;)V")
    class125(class129 var1) {
        this.this$0 = var1;
        this.field1514 = -1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "703192976")
    void vmethod3019(Buffer var1) {
        this.field1514 = var1.readUnsignedShort();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ley;I)V", garbageValue = "750335300")
    void vmethod3020(ClanSettings var1) {
        var1.method2853(this.field1514);
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "([BI)Lpt;", garbageValue = "-2047697021")
    public static final SpritePixels method2743(byte[] var0) {
        BufferedImage var1 = null;
        try {
            var1 = ImageIO.read(new ByteArrayInputStream(var0));
            int var2 = var1.getWidth();
            int var3 = var1.getHeight();
            int[] var4 = new int[var3 * var2];
            PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2);
            var5.grabPixels();
            return new SpritePixels(var4, var2, var3);
        } catch (IOException var7) {
        } catch (InterruptedException var8) {
        }
        return new SpritePixels(0, 0);
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-142466895")
    public static int method2741(int var0) {
        return class263.field3091[var0];
    }

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "(Lkq;III)Z", garbageValue = "-130705025")
    public static boolean method2744(AbstractArchive var0, int var1, int var2) {
        byte[] var3 = var0.takeFile(var1, var2);
        if (var3 == null) {
            return false;
        } else {
            class372.SpriteBuffer_decode(var3);
            return true;
        }
    }

    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-981957509")
    static void method2745() {
        Login.Login_username = Login.Login_username.trim();
        if (Login.Login_username.length() == 0) {
            UserComparator7.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
        } else {
            long var1 = SceneTilePaint.method4271();
            byte var0;
            if (var1 == 0L) {
                var0 = 5;
            } else {
                String var4 = Login.Login_username;
                Random var5 = new Random();
                Buffer var6 = new Buffer(128);
                Buffer var7 = new Buffer(128);
                int[] var8 = new int[]{ var5.nextInt(), var5.nextInt(), ((int) (var1 >> 32)), ((int) (var1)) };
                var6.writeByte(10);
                int var9;
                for (var9 = 0; var9 < 4; ++var9) {
                    var6.writeInt(var5.nextInt());
                }
                var6.writeInt(var8[0]);
                var6.writeInt(var8[1]);
                var6.writeLong(var1);
                var6.writeLong(0L);
                for (var9 = 0; var9 < 4; ++var9) {
                    var6.writeInt(var5.nextInt());
                }
                var6.encryptRsa(class65.field869, class65.field868);
                var7.writeByte(10);
                for (var9 = 0; var9 < 3; ++var9) {
                    var7.writeInt(var5.nextInt());
                }
                var7.writeLong(var5.nextLong());
                var7.writeLongMedium(var5.nextLong());
                if (Client.randomDatData != null) {
                    var7.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
                } else {
                    byte[] var22 = KeyHandler.method332();
                    var7.writeBytes(var22, 0, var22.length);
                }
                var7.writeLong(var5.nextLong());
                var7.encryptRsa(class65.field869, class65.field868);
                var9 = GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var4);
                if ((var9 % 8) != 0) {
                    var9 += 8 - (var9 % 8);
                }
                Buffer var10 = new Buffer(var9);
                var10.writeStringCp1252NullTerminated(var4);
                var10.offset = var9;
                var10.xteaEncryptAll(var8);
                Buffer var11 = new Buffer(((var7.offset + var6.offset) + var10.offset) + 5);
                var11.writeByte(2);
                var11.writeByte(var6.offset);
                var11.writeBytes(var6.array, 0, var6.offset);
                var11.writeByte(var7.offset);
                var11.writeBytes(var7.array, 0, var7.offset);
                var11.writeShort(var10.offset);
                var11.writeBytes(var10.array, 0, var10.offset);
                byte[] var13 = var11.array;
                String var12 = class134.method2826(var13, 0, var13.length);
                String var14 = var12;
                byte var3;
                try {
                    URL var15 = new URL(StructComposition.method3387("services", false) + "m=accountappeal/login.ws");
                    URLConnection var16 = var15.openConnection();
                    var16.setDoInput(true);
                    var16.setDoOutput(true);
                    var16.setConnectTimeout(5000);
                    OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream());
                    var17.write((("data2=" + TileItem.method2296(var14)) + "&dest=") + TileItem.method2296("passwordchoice.ws"));
                    var17.flush();
                    InputStream var18 = var16.getInputStream();
                    var11 = new Buffer(new byte[1000]);
                    while (true) {
                        int var19 = var18.read(var11.array, var11.offset, 1000 - var11.offset);
                        if (var19 == (-1)) {
                            var17.close();
                            var18.close();
                            String var23 = new String(var11.array);
                            if (var23.startsWith("OFFLINE")) {
                                var3 = 4;
                            } else if (var23.startsWith("WRONG")) {
                                var3 = 7;
                            } else if (var23.startsWith("RELOAD")) {
                                var3 = 3;
                            } else if (var23.startsWith("Not permitted for social network accounts.")) {
                                var3 = 6;
                            } else {
                                var11.xteaDecryptAll(var8);
                                while ((var11.offset > 0) && (var11.array[var11.offset - 1] == 0)) {
                                    --var11.offset;
                                } 
                                var23 = new String(var11.array, 0, var11.offset);
                                boolean var20;
                                if (var23 == null) {
                                    var20 = false;
                                } else {
                                    label106 : {
                                        try {
                                            new URL(var23);
                                        } catch (MalformedURLException var24) {
                                            var20 = false;
                                            break label106;
                                        }
                                        var20 = true;
                                    }
                                }
                                if (var20) {
                                    MilliClock.openURL(var23, true, false);
                                    var3 = 2;
                                } else {
                                    var3 = 5;
                                }
                            }
                            break;
                        }
                        var11.offset += var19;
                        if (var11.offset >= 1000) {
                            var3 = 5;
                            break;
                        }
                    } 
                } catch (Throwable var25) {
                    var25.printStackTrace();
                    var3 = 5;
                }
                var0 = var3;
            }
            switch (var0) {
                case 2 :
                    UserComparator7.setLoginResponseString(Strings.field3802, Strings.field3569, Strings.field3716);
                    Player.method2159(6);
                    break;
                case 3 :
                    UserComparator7.setLoginResponseString("", "Error connecting to server.", "");
                    break;
                case 4 :
                    UserComparator7.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
                    break;
                case 5 :
                    UserComparator7.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
                    break;
                case 6 :
                    UserComparator7.setLoginResponseString("", "Error connecting to server.", "");
                    break;
                case 7 :
                    UserComparator7.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
            }
        }
    }

    @ObfuscatedName("hp")
    @ObfuscatedSignature(descriptor = "(Lcw;IILgl;I)V", garbageValue = "-864027006")
    static final void method2742(Player var0, int var1, int var2, class185 var3) {
        int var4 = var0.pathX[0];
        int var5 = var0.pathY[0];
        int var6 = var0.transformedSize();
        if ((((var4 >= var6) && (var4 < (104 - var6))) && (var5 >= var6)) && (var5 < (104 - var6))) {
            if ((((var1 >= var6) && (var1 < (104 - var6))) && (var2 >= var6)) && (var2 < (104 - var6))) {
                int var8 = var0.transformedSize();
                Client.field781.approxDestinationX = var1;
                Client.field781.approxDestinationY = var2;
                Client.field781.approxDestinationSizeX = 1;
                Client.field781.approxDestinationSizeY = 1;
                ApproximateRouteStrategy var9 = Client.field781;
                ApproximateRouteStrategy var10 = var9;
                CollisionMap var11 = Client.collisionMaps[var0.plane];
                int[] var12 = Client.field782;
                int[] var13 = Client.field783;
                int var14;
                int var15;
                for (var14 = 0; var14 < 128; ++var14) {
                    for (var15 = 0; var15 < 128; ++var15) {
                        class186.directions[var14][var15] = 0;
                        class186.distances[var14][var15] = 99999999;
                    }
                }
                int var16;
                int var17;
                byte var19;
                int var20;
                int var21;
                int var23;
                int var25;
                int var26;
                int var27;
                int var28;
                boolean var34;
                int var36;
                int var37;
                int var39;
                if (var8 == 1) {
                    var34 = class16.method199(var4, var5, var9, var11);
                } else if (var8 == 2) {
                    var34 = PlayerComposition.method5395(var4, var5, var9, var11);
                } else {
                    var16 = var4;
                    var17 = var5;
                    byte var18 = 64;
                    var19 = 64;
                    var20 = var4 - var18;
                    var21 = var5 - var19;
                    class186.directions[var18][var19] = 99;
                    class186.distances[var18][var19] = 0;
                    byte var22 = 0;
                    var23 = 0;
                    class186.bufferX[var22] = var4;
                    var39 = var22 + 1;
                    class186.bufferY[var22] = var5;
                    int[][] var24 = var11.flags;
                    boolean var35;
                    label494 : while (true) {
                        label492 : while (true) {
                            do {
                                do {
                                    do {
                                        label469 : do {
                                            if (var23 == var39) {
                                                SecureRandomCallable.field1009 = var16;
                                                class7.field39 = var17;
                                                var35 = false;
                                                break label494;
                                            }
                                            var16 = class186.bufferX[var23];
                                            var17 = class186.bufferY[var23];
                                            var23 = (var23 + 1) & 4095;
                                            var36 = var16 - var20;
                                            var37 = var17 - var21;
                                            var25 = var16 - var11.xInset;
                                            var26 = var17 - var11.yInset;
                                            if (var10.hasArrived(var8, var16, var17, var11)) {
                                                SecureRandomCallable.field1009 = var16;
                                                class7.field39 = var17;
                                                var35 = true;
                                                break label494;
                                            }
                                            var27 = class186.distances[var36][var37] + 1;
                                            if ((((var36 > 0) && (class186.directions[var36 - 1][var37] == 0)) && ((var24[var25 - 1][var26] & 19136782) == 0)) && ((var24[var25 - 1][(var8 + var26) - 1] & 19136824) == 0)) {
                                                var28 = 1;
                                                while (true) {
                                                    if (var28 >= (var8 - 1)) {
                                                        class186.bufferX[var39] = var16 - 1;
                                                        class186.bufferY[var39] = var17;
                                                        var39 = (var39 + 1) & 4095;
                                                        class186.directions[var36 - 1][var37] = 2;
                                                        class186.distances[var36 - 1][var37] = var27;
                                                        break;
                                                    }
                                                    if ((var24[var25 - 1][var26 + var28] & 19136830) != 0) {
                                                        break;
                                                    }
                                                    ++var28;
                                                } 
                                            }
                                            if ((((var36 < (128 - var8)) && (class186.directions[var36 + 1][var37] == 0)) && ((var24[var25 + var8][var26] & 19136899) == 0)) && ((var24[var25 + var8][(var8 + var26) - 1] & 19136992) == 0)) {
                                                var28 = 1;
                                                while (true) {
                                                    if (var28 >= (var8 - 1)) {
                                                        class186.bufferX[var39] = var16 + 1;
                                                        class186.bufferY[var39] = var17;
                                                        var39 = (var39 + 1) & 4095;
                                                        class186.directions[var36 + 1][var37] = 8;
                                                        class186.distances[var36 + 1][var37] = var27;
                                                        break;
                                                    }
                                                    if ((var24[var8 + var25][var26 + var28] & 19136995) != 0) {
                                                        break;
                                                    }
                                                    ++var28;
                                                } 
                                            }
                                            if ((((var37 > 0) && (class186.directions[var36][var37 - 1] == 0)) && ((var24[var25][var26 - 1] & 19136782) == 0)) && ((var24[(var8 + var25) - 1][var26 - 1] & 19136899) == 0)) {
                                                var28 = 1;
                                                while (true) {
                                                    if (var28 >= (var8 - 1)) {
                                                        class186.bufferX[var39] = var16;
                                                        class186.bufferY[var39] = var17 - 1;
                                                        var39 = (var39 + 1) & 4095;
                                                        class186.directions[var36][var37 - 1] = 1;
                                                        class186.distances[var36][var37 - 1] = var27;
                                                        break;
                                                    }
                                                    if ((var24[var28 + var25][var26 - 1] & 19136911) != 0) {
                                                        break;
                                                    }
                                                    ++var28;
                                                } 
                                            }
                                            if ((((var37 < (128 - var8)) && (class186.directions[var36][var37 + 1] == 0)) && ((var24[var25][var26 + var8] & 19136824) == 0)) && ((var24[(var8 + var25) - 1][var8 + var26] & 19136992) == 0)) {
                                                var28 = 1;
                                                while (true) {
                                                    if (var28 >= (var8 - 1)) {
                                                        class186.bufferX[var39] = var16;
                                                        class186.bufferY[var39] = var17 + 1;
                                                        var39 = (var39 + 1) & 4095;
                                                        class186.directions[var36][var37 + 1] = 4;
                                                        class186.distances[var36][var37 + 1] = var27;
                                                        break;
                                                    }
                                                    if ((var24[var25 + var28][var26 + var8] & 19137016) != 0) {
                                                        break;
                                                    }
                                                    ++var28;
                                                } 
                                            }
                                            if ((((var36 > 0) && (var37 > 0)) && (class186.directions[var36 - 1][var37 - 1] == 0)) && ((var24[var25 - 1][var26 - 1] & 19136782) == 0)) {
                                                var28 = 1;
                                                while (true) {
                                                    if (var28 >= var8) {
                                                        class186.bufferX[var39] = var16 - 1;
                                                        class186.bufferY[var39] = var17 - 1;
                                                        var39 = (var39 + 1) & 4095;
                                                        class186.directions[var36 - 1][var37 - 1] = 3;
                                                        class186.distances[var36 - 1][var37 - 1] = var27;
                                                        break;
                                                    }
                                                    if (((var24[var25 - 1][var28 + (var26 - 1)] & 19136830) != 0) || ((var24[var28 + (var25 - 1)][var26 - 1] & 19136911) != 0)) {
                                                        break;
                                                    }
                                                    ++var28;
                                                } 
                                            }
                                            if ((((var36 < (128 - var8)) && (var37 > 0)) && (class186.directions[var36 + 1][var37 - 1] == 0)) && ((var24[var25 + var8][var26 - 1] & 19136899) == 0)) {
                                                var28 = 1;
                                                while (true) {
                                                    if (var28 >= var8) {
                                                        class186.bufferX[var39] = var16 + 1;
                                                        class186.bufferY[var39] = var17 - 1;
                                                        var39 = (var39 + 1) & 4095;
                                                        class186.directions[var36 + 1][var37 - 1] = 9;
                                                        class186.distances[var36 + 1][var37 - 1] = var27;
                                                        break;
                                                    }
                                                    if (((var24[var25 + var8][var28 + (var26 - 1)] & 19136995) != 0) || ((var24[var25 + var28][var26 - 1] & 19136911) != 0)) {
                                                        break;
                                                    }
                                                    ++var28;
                                                } 
                                            }
                                            if ((((var36 > 0) && (var37 < (128 - var8))) && (class186.directions[var36 - 1][var37 + 1] == 0)) && ((var24[var25 - 1][var8 + var26] & 19136824) == 0)) {
                                                for (var28 = 1; var28 < var8; ++var28) {
                                                    if (((var24[var25 - 1][var26 + var28] & 19136830) != 0) || ((var24[var28 + (var25 - 1)][var26 + var8] & 19137016) != 0)) {
                                                        continue label469;
                                                    }
                                                }
                                                class186.bufferX[var39] = var16 - 1;
                                                class186.bufferY[var39] = var17 + 1;
                                                var39 = (var39 + 1) & 4095;
                                                class186.directions[var36 - 1][var37 + 1] = 6;
                                                class186.distances[var36 - 1][var37 + 1] = var27;
                                            }
                                        } while (var36 >= (128 - var8) );
                                    } while (var37 >= (128 - var8) );
                                } while (class186.directions[var36 + 1][var37 + 1] != 0 );
                            } while ((var24[var8 + var25][var26 + var8] & 19136992) != 0 );
                            for (var28 = 1; var28 < var8; ++var28) {
                                if (((var24[var28 + var25][var8 + var26] & 19137016) != 0) || ((var24[var25 + var8][var28 + var26] & 19136995) != 0)) {
                                    continue label492;
                                }
                            }
                            class186.bufferX[var39] = var16 + 1;
                            class186.bufferY[var39] = var17 + 1;
                            var39 = (var39 + 1) & 4095;
                            class186.directions[var36 + 1][var37 + 1] = 12;
                            class186.distances[var36 + 1][var37 + 1] = var27;
                        } 
                    } 
                    var34 = var35;
                }
                int var7;
                label540 : {
                    var15 = var4 - 64;
                    var16 = var5 - 64;
                    var17 = SecureRandomCallable.field1009;
                    var36 = class7.field39;
                    if (!var34) {
                        var37 = Integer.MAX_VALUE;
                        var20 = Integer.MAX_VALUE;
                        byte var38 = 10;
                        var39 = var10.approxDestinationX;
                        var23 = var10.approxDestinationY;
                        int var33 = var10.approxDestinationSizeX;
                        var25 = var10.approxDestinationSizeY;
                        for (var26 = var39 - var38; var26 <= (var38 + var39); ++var26) {
                            for (var27 = var23 - var38; var27 <= (var23 + var38); ++var27) {
                                var28 = var26 - var15;
                                int var29 = var27 - var16;
                                if (((((var28 >= 0) && (var29 >= 0)) && (var28 < 128)) && (var29 < 128)) && (class186.distances[var28][var29] < 100)) {
                                    int var30 = 0;
                                    if (var26 < var39) {
                                        var30 = var39 - var26;
                                    } else if (var26 > ((var39 + var33) - 1)) {
                                        var30 = var26 - ((var39 + var33) - 1);
                                    }
                                    int var31 = 0;
                                    if (var27 < var23) {
                                        var31 = var23 - var27;
                                    } else if (var27 > ((var23 + var25) - 1)) {
                                        var31 = var27 - ((var25 + var23) - 1);
                                    }
                                    int var32 = (var31 * var31) + (var30 * var30);
                                    if ((var32 < var37) || ((var37 == var32) && (class186.distances[var28][var29] < var20))) {
                                        var37 = var32;
                                        var20 = class186.distances[var28][var29];
                                        var17 = var26;
                                        var36 = var27;
                                    }
                                }
                            }
                        }
                        if (var37 == Integer.MAX_VALUE) {
                            var7 = -1;
                            break label540;
                        }
                    }
                    if ((var4 == var17) && (var36 == var5)) {
                        var12[0] = var17;
                        var13[0] = var36;
                        var7 = 0;
                    } else {
                        var19 = 0;
                        class186.bufferX[var19] = var17;
                        var37 = var19 + 1;
                        class186.bufferY[var19] = var36;
                        for (var20 = var21 = class186.directions[var17 - var15][var36 - var16]; (var4 != var17) || (var36 != var5); var20 = class186.directions[var17 - var15][var36 - var16]) {
                            if (var21 != var20) {
                                var21 = var20;
                                class186.bufferX[var37] = var17;
                                class186.bufferY[var37++] = var36;
                            }
                            if ((var20 & 2) != 0) {
                                ++var17;
                            } else if ((var20 & 8) != 0) {
                                --var17;
                            }
                            if ((var20 & 1) != 0) {
                                ++var36;
                            } else if ((var20 & 4) != 0) {
                                --var36;
                            }
                        }
                        var39 = 0;
                        while ((var37--) > 0) {
                            var12[var39] = class186.bufferX[var37];
                            var13[var39++] = class186.bufferY[var37];
                            if (var39 >= var12.length) {
                                break;
                            }
                        } 
                        var7 = var39;
                    }
                }
                var14 = var7;
                if (var7 >= 1) {
                    for (var15 = 0; var15 < (var14 - 1); ++var15) {
                        var0.method2116(Client.field782[var15], Client.field783[var15], var3);
                    }
                }
            }
        }
    }
}