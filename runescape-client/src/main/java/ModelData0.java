import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("gh")
@Implements("ModelData0")
public class ModelData0 {
    @ObfuscatedName("ag")
    protected static String field2547;

    @ObfuscatedName("bw")
    static String field2546;

    ModelData0() {
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-247398088")
    public static void method4272() {
        WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", garbageValue = "-1968551558")
    public static String method4273(String var0) {
        int var1 = var0.length();
        char[] var2 = new char[var1];
        byte var3 = 2;
        for (int var4 = 0; var4 < var1; ++var4) {
            char var5 = var0.charAt(var4);
            if (var3 == 0) {
                var5 = Character.toLowerCase(var5);
            } else if ((var3 == 2) || Character.isUpperCase(var5)) {
                char var6;
                if ((var5 != 181) && (var5 != 402)) {
                    var6 = Character.toTitleCase(var5);
                } else {
                    var6 = var5;
                }
                var5 = var6;
            }
            if (Character.isLetter(var5)) {
                var3 = 0;
            } else if (((var5 != '.') && (var5 != '?')) && (var5 != '!')) {
                if (Character.isSpaceChar(var5)) {
                    if (var3 != 2) {
                        var3 = 1;
                    }
                } else {
                    var3 = 1;
                }
            } else {
                var3 = 2;
            }
            var2[var4] = var5;
        }
        return new String(var2);
    }

    @ObfuscatedName("il")
    @ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)V", garbageValue = "558586673")
    static void method4274(int var0, String var1) {
        int var2 = Players.Players_count;
        int[] var3 = Players.Players_indices;
        boolean var4 = false;
        Username var5 = new Username(var1, VarcInt.loginType);
        for (int var6 = 0; var6 < var2; ++var6) {
            Player var7 = Client.players[var3[var6]];
            if ((((var7 != null) && (var7 != WorldMapSprite.localPlayer)) && (var7.username != null)) && var7.username.equals(var5)) {
                PacketBufferNode var8;
                if (var0 == 1) {
                    var8 = class135.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
                    var8.packetBuffer.writeByteNeg(0);
                    var8.packetBuffer.writeShortAddLE(var3[var6]);
                    Client.packetWriter.addNode(var8);
                } else if (var0 == 4) {
                    var8 = class135.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
                    var8.packetBuffer.writeShortAdd(var3[var6]);
                    var8.packetBuffer.writeByteAdd(0);
                    Client.packetWriter.addNode(var8);
                } else if (var0 == 6) {
                    var8 = class135.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
                    var8.packetBuffer.writeByte(0);
                    var8.packetBuffer.writeShortLE(var3[var6]);
                    Client.packetWriter.addNode(var8);
                } else if (var0 == 7) {
                    var8 = class135.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
                    var8.packetBuffer.writeByteNeg(0);
                    var8.packetBuffer.writeShort(var3[var6]);
                    Client.packetWriter.addNode(var8);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            LoginScreenAnimation.addGameMessage(4, "", "Unable to find " + var1);
        }
    }
}