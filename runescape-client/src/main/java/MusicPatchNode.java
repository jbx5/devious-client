import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
   @ObfuscatedName("mi")
   @ObfuscatedSignature(
      descriptor = "Ldv;"
   )
   @Export("localPlayer")
   static Player localPlayer;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1021419297
   )
   int field3467;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Llz;"
   )
   @Export("patch")
   MusicPatch patch;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lbr;"
   )
   @Export("rawSound")
   RawSound rawSound;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Llp;"
   )
   MusicPatchNode2 field3452;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1959190999
   )
   int field3450;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -630482265
   )
   int field3454;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -254585523
   )
   int field3455;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1083381765
   )
   int field3456;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -279706293
   )
   int field3470;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 274954637
   )
   int field3458;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -1077015879
   )
   int field3459;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -814647939
   )
   int field3460;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 873438947
   )
   int field3461;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 891662681
   )
   int field3468;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -602614853
   )
   int field3464;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -371546193
   )
   int field3449;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 667306259
   )
   int field3465;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -2032101041
   )
   int field3457;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lbl;"
   )
   @Export("stream")
   RawPcmStream stream;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1971564769
   )
   int field3462;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -89170073
   )
   int field3469;

   MusicPatchNode() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-61"
   )
   void method5986() {
      this.patch = null;
      this.rawSound = null;
      this.field3452 = null;
      this.stream = null;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IS)F",
      garbageValue = "13359"
   )
   public static float method5985(int var0) {
      var0 &= 16383;
      return (float)((double)((float)var0 / 16384.0F) * 6.283185307179586);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1731174532"
   )
   public static boolean method5983(int var0) {
      return (var0 >> 20 & 1) != 0;
   }

   @ObfuscatedName("iw")
   @ObfuscatedSignature(
      descriptor = "(Lmq;IIB)V",
      garbageValue = "-122"
   )
   @Export("checkIfMinimapClicked")
   static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
      if (Client.minimapState == 0 || Client.minimapState == 3) {
         if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class473.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
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
               int var9 = var4 * var8 + var5 * var7 >> 11;
               int var10 = var5 * var8 - var4 * var7 >> 11;
               int var11 = var9 + localPlayer.x >> 7;
               int var12 = localPlayer.y - var10 >> 7;
               PacketBufferNode var13 = class330.getPacketBufferNode(ClientPacket.field3105, Client.packetWriter.isaacCipher);
               var13.packetBuffer.writeByte(18);
               var13.packetBuffer.writeShortAddLE(GameObject.baseY * 64 + var12);
               var13.packetBuffer.writeShortLE(WorldMapData_0.baseX * 64 + var11);
               var13.packetBuffer.writeByteSub(Client.field721.method4229(82) ? (Client.field721.method4229(81) ? 2 : 1) : 0);
               var13.packetBuffer.writeByte(var4);
               var13.packetBuffer.writeByte(var5);
               var13.packetBuffer.writeShort(Client.camAngleY);
               var13.packetBuffer.writeByte(57);
               var13.packetBuffer.writeByte(0);
               var13.packetBuffer.writeByte(0);
               var13.packetBuffer.writeByte(89);
               var13.packetBuffer.writeShort(localPlayer.x);
               var13.packetBuffer.writeShort(localPlayer.y);
               var13.packetBuffer.writeByte(63);
               Client.packetWriter.addNode(var13);
               Client.destinationX = var11;
               Client.destinationY = var12;
            }
         }

      }
   }

   @ObfuscatedName("nu")
   @ObfuscatedSignature(
      descriptor = "(Lmq;I)Ljava/lang/String;",
      garbageValue = "603369429"
   )
   @Export("Widget_getSpellActionName")
   static String Widget_getSpellActionName(Widget var0) {
      if (class195.Widget_unpackTargetMask(KeyHandler.getWidgetFlags(var0)) == 0) {
         return null;
      } else {
         return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
      }
   }
}
