import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("cn")
public class class91 {
    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(Lkq;Ljava/lang/String;Ljava/lang/String;I)Lpg;", garbageValue = "502535767")
    @Export("SpriteBuffer_getIndexedSpriteByName")
    public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
        int var3 = var0.getGroupId(var1);
        int var4 = var0.getFileId(var3, var2);
        IndexedSprite var5;
        if (!class125.method2744(var0, var3, var4)) {
            var5 = null;
        } else {
            var5 = class317.method5780();
        }
        return var5;
    }

    @ObfuscatedName("fg")
    @ObfuscatedSignature(descriptor = "(Ljz;III)V", garbageValue = "-732657194")
    @Export("checkIfMinimapClicked")
    static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
        if ((Client.minimapState == 0) || (Client.minimapState == 3)) {
            if ((!Client.isMenuOpen) && ((MouseHandler.MouseHandler_lastButton == 1) || ((!class370.mouseCam) && (MouseHandler.MouseHandler_lastButton == 4)))) {
                SpriteMask var3 = var0.getSpriteMask(true);
                if (var3 == null) {
                    return;
                }
                int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
                int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
                if (var3.contains(var4, var5)) {
                    var4 -= var3.width / 2;
                    var5 -= var3.height / 2;
                    int var6 = Client.camAngleY & 2047;
                    int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
                    int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
                    int var9 = ((var7 * var5) + (var8 * var4)) >> 11;
                    int var10 = ((var5 * var8) - (var7 * var4)) >> 11;
                    int var11 = (var9 + WorldMapSprite.localPlayer.x) >> 7;
                    int var12 = (WorldMapSprite.localPlayer.y - var10) >> 7;
                    PacketBufferNode var13 = class135.getPacketBufferNode(ClientPacket.field2926, Client.packetWriter.isaacCipher);
                    var13.packetBuffer.writeByte(18);
                    var13.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1 : 0);
                    var13.packetBuffer.writeShortLE(var11 + Canvas.baseX);
                    var13.packetBuffer.writeShortLE(var12 + class118.baseY);
                    var13.packetBuffer.writeByte(var4);
                    var13.packetBuffer.writeByte(var5);
                    var13.packetBuffer.writeShort(Client.camAngleY);
                    var13.packetBuffer.writeByte(57);
                    var13.packetBuffer.writeByte(0);
                    var13.packetBuffer.writeByte(0);
                    var13.packetBuffer.writeByte(89);
                    var13.packetBuffer.writeShort(WorldMapSprite.localPlayer.x);
                    var13.packetBuffer.writeShort(WorldMapSprite.localPlayer.y);
                    var13.packetBuffer.writeByte(63);
                    Client.packetWriter.addNode(var13);
                    Client.destinationX = var11;
                    Client.destinationY = var12;
                }
            }
        }
    }
}