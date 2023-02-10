import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("Frames")
public class Frames extends DualNode {
   @ObfuscatedName("fb")
   static String field2620;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "[Lhm;"
   )
   @Export("frames")
   Animation[] frames;

   @ObfuscatedSignature(
      descriptor = "(Lln;Lln;IZ)V",
      garbageValue = "0"
   )
   public Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
      NodeDeque var5 = new NodeDeque();
      int var6 = var1.getGroupFileCount(var3);
      this.frames = new Animation[var6];
      int[] var7 = var1.getGroupFileIds(var3);

      for(int var8 = 0; var8 < var7.length; ++var8) {
         byte[] var9 = var1.takeFile(var3, var7[var8]);
         Skeleton var10 = null;
         int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

         for(Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) {
            if (var11 == var12.id) {
               var10 = var12;
               break;
            }
         }

         if (var10 == null) {
            byte[] var13 = var2.getFile(var11, 0);
            var10 = new Skeleton(var11, var13);
            var5.addFirst(var10);
         }

         this.frames[var7[var8]] = new Animation(var9, var10);
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1076744918"
   )
   @Export("hasAlphaTransform")
   public boolean hasAlphaTransform(int var1) {
      return this.frames[var1].hasAlphaTransform;
   }

   @ObfuscatedName("gd")
   @ObfuscatedSignature(
      descriptor = "(Lkz;III)V",
      garbageValue = "1584997198"
   )
   @Export("checkIfMinimapClicked")
   static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
      if (Client.minimapState == 0 || Client.minimapState == 3) {
         if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !ClanMate.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
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
               int var9 = var5 * var7 + var4 * var8 >> 11;
               int var10 = var5 * var8 - var4 * var7 >> 11;
               int var11 = var9 + class387.localPlayer.x >> 7;
               int var12 = class387.localPlayer.y - var10 >> 7;
               PacketBufferNode var13 = Renderable.getPacketBufferNode(ClientPacket.field3087, Client.packetWriter.isaacCipher);
               var13.packetBuffer.writeByte(18);
               var13.packetBuffer.writeShort(ParamComposition.baseX * 64 + var11);
               var13.packetBuffer.writeByteSub(Client.field702.method4143(82) ? (Client.field702.method4143(81) ? 2 : 1) : 0);
               var13.packetBuffer.writeShort(Client.baseY * 64 + var12);
               var13.packetBuffer.writeByte(var4);
               var13.packetBuffer.writeByte(var5);
               var13.packetBuffer.writeShort(Client.camAngleY);
               var13.packetBuffer.writeByte(57);
               var13.packetBuffer.writeByte(0);
               var13.packetBuffer.writeByte(0);
               var13.packetBuffer.writeByte(89);
               var13.packetBuffer.writeShort(class387.localPlayer.x);
               var13.packetBuffer.writeShort(class387.localPlayer.y);
               var13.packetBuffer.writeByte(63);
               Client.packetWriter.addNode(var13);
               Client.destinationX = var11;
               Client.destinationY = var12;
            }
         }

      }
   }
}
