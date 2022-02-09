import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ch")
public class class78 {
    @ObfuscatedName("x")
    static int[][][] field1033;

    @ObfuscatedName("hb")
    @ObfuscatedSignature(descriptor = "Lpt;")
    @Export("redHintArrowSprite")
    static SpritePixels redHintArrowSprite;

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Llu;IB)Lii;", garbageValue = "27")
    public static PacketBufferNode method2082(int var0, String var1, Language var2, int var3) {
        PacketBufferNode var4 = class135.getPacketBufferNode(ClientPacket.field2839, Client.packetWriter.isaacCipher);
        var4.packetBuffer.writeByte(0);
        int var5 = var4.packetBuffer.offset;
        var4.packetBuffer.writeByte(var0);
        String var6 = var1.toLowerCase();
        byte var7 = 0;
        if (var6.startsWith("yellow:")) {
            var7 = 0;
            var1 = var1.substring("yellow:".length());
        } else if (var6.startsWith("red:")) {
            var7 = 1;
            var1 = var1.substring("red:".length());
        } else if (var6.startsWith("green:")) {
            var7 = 2;
            var1 = var1.substring("green:".length());
        } else if (var6.startsWith("cyan:")) {
            var7 = 3;
            var1 = var1.substring("cyan:".length());
        } else if (var6.startsWith("purple:")) {
            var7 = 4;
            var1 = var1.substring("purple:".length());
        } else if (var6.startsWith("white:")) {
            var7 = 5;
            var1 = var1.substring("white:".length());
        } else if (var6.startsWith("flash1:")) {
            var7 = 6;
            var1 = var1.substring("flash1:".length());
        } else if (var6.startsWith("flash2:")) {
            var7 = 7;
            var1 = var1.substring("flash2:".length());
        } else if (var6.startsWith("flash3:")) {
            var7 = 8;
            var1 = var1.substring("flash3:".length());
        } else if (var6.startsWith("glow1:")) {
            var7 = 9;
            var1 = var1.substring("glow1:".length());
        } else if (var6.startsWith("glow2:")) {
            var7 = 10;
            var1 = var1.substring("glow2:".length());
        } else if (var6.startsWith("glow3:")) {
            var7 = 11;
            var1 = var1.substring("glow3:".length());
        } else if (var2 != Language.Language_EN) {
            if (var6.startsWith("yellow:")) {
                var7 = 0;
                var1 = var1.substring("yellow:".length());
            } else if (var6.startsWith("red:")) {
                var7 = 1;
                var1 = var1.substring("red:".length());
            } else if (var6.startsWith("green:")) {
                var7 = 2;
                var1 = var1.substring("green:".length());
            } else if (var6.startsWith("cyan:")) {
                var7 = 3;
                var1 = var1.substring("cyan:".length());
            } else if (var6.startsWith("purple:")) {
                var7 = 4;
                var1 = var1.substring("purple:".length());
            } else if (var6.startsWith("white:")) {
                var7 = 5;
                var1 = var1.substring("white:".length());
            } else if (var6.startsWith("flash1:")) {
                var7 = 6;
                var1 = var1.substring("flash1:".length());
            } else if (var6.startsWith("flash2:")) {
                var7 = 7;
                var1 = var1.substring("flash2:".length());
            } else if (var6.startsWith("flash3:")) {
                var7 = 8;
                var1 = var1.substring("flash3:".length());
            } else if (var6.startsWith("glow1:")) {
                var7 = 9;
                var1 = var1.substring("glow1:".length());
            } else if (var6.startsWith("glow2:")) {
                var7 = 10;
                var1 = var1.substring("glow2:".length());
            } else if (var6.startsWith("glow3:")) {
                var7 = 11;
                var1 = var1.substring("glow3:".length());
            }
        }
        var6 = var1.toLowerCase();
        byte var8 = 0;
        if (var6.startsWith("wave:")) {
            var8 = 1;
            var1 = var1.substring("wave:".length());
        } else if (var6.startsWith("wave2:")) {
            var8 = 2;
            var1 = var1.substring("wave2:".length());
        } else if (var6.startsWith("shake:")) {
            var8 = 3;
            var1 = var1.substring("shake:".length());
        } else if (var6.startsWith("scroll:")) {
            var8 = 4;
            var1 = var1.substring("scroll:".length());
        } else if (var6.startsWith("slide:")) {
            var8 = 5;
            var1 = var1.substring("slide:".length());
        } else if (var2 != Language.Language_EN) {
            if (var6.startsWith("wave:")) {
                var8 = 1;
                var1 = var1.substring("wave:".length());
            } else if (var6.startsWith("wave2:")) {
                var8 = 2;
                var1 = var1.substring("wave2:".length());
            } else if (var6.startsWith("shake:")) {
                var8 = 3;
                var1 = var1.substring("shake:".length());
            } else if (var6.startsWith("scroll:")) {
                var8 = 4;
                var1 = var1.substring("scroll:".length());
            } else if (var6.startsWith("slide:")) {
                var8 = 5;
                var1 = var1.substring("slide:".length());
            }
        }
        var4.packetBuffer.writeByte(var7);
        var4.packetBuffer.writeByte(var8);
        WorldMapRectangle.method4757(var4.packetBuffer, var1);
        if (var0 == class287.field3420.rsOrdinal()) {
            var4.packetBuffer.writeByte(var3);
        }
        var4.packetBuffer.writeLengthByte(var4.packetBuffer.offset - var5);
        return var4;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(II)Lgm;", garbageValue = "-1203041469")
    @Export("SequenceDefinition_get")
    public static SequenceDefinition SequenceDefinition_get(int var0) {
        SequenceDefinition var1 = ((SequenceDefinition) (SequenceDefinition.SequenceDefinition_cached.get(((long) (var0)))));
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = class377.SequenceDefinition_archive.takeFile(12, var0);
            var1 = new SequenceDefinition();
            if (var2 != null) {
                var1.decode(new Buffer(var2));
            }
            var1.postDecode();
            SequenceDefinition.SequenceDefinition_cached.put(var1, ((long) (var0)));
            return var1;
        }
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "([BIILgn;[Lgi;I)V", garbageValue = "2046049041")
    static final void method2083(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
        Buffer var5 = new Buffer(var0);
        int var6 = -1;
        while (true) {
            int var7 = var5.readIncrSmallSmart();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.readUShortSmart();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 63;
                int var11 = (var8 >> 6) & 63;
                int var12 = var8 >> 12;
                int var13 = var5.readUnsignedByte();
                int var14 = var13 >> 2;
                int var15 = var13 & 3;
                int var16 = var11 + var1;
                int var17 = var10 + var2;
                if ((((var16 > 0) && (var17 > 0)) && (var16 < 103)) && (var17 < 103)) {
                    int var18 = var12;
                    if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) {
                        var18 = var12 - 1;
                    }
                    CollisionMap var19 = null;
                    if (var18 >= 0) {
                        var19 = var4[var18];
                    }
                    class231.method4765(var12, var16, var17, var6, var15, var14, var3, var19);
                }
            } 
        } 
    }
}