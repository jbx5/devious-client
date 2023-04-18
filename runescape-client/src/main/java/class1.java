import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
public class class1 implements Callable {
   @ObfuscatedName("wa")
   static Iterator field6;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   @Export("scriptActiveWidget")
   static Widget scriptActiveWidget;
   @ObfuscatedName("is")
   @ObfuscatedSignature(
      descriptor = "Lgp;"
   )
   @Export("socketTask")
   static Task socketTask;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lsg;"
   )
   final Buffer field1;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lac;"
   )
   final class3 field3;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lal;"
   )
   final class7 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lal;Lsg;Lac;)V"
   )
   class1(class7 var1, Buffer var2, class3 var3) {
      this.this$0 = var1;
      this.field1 = var2;
      this.field3 = var3;
   }

   public Object call() {
      return this.field3.vmethod13(this.field1);
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "([III[FI)V",
      garbageValue = "580310026"
   )
   public static void method8(int[] var0, int var1, int var2, float[] var3) {
      if (var3 == null && Rasterizer3D.field2512 == Rasterizer3D.field2519) {
         Rasterizer3D.field2519 = Rasterizer3D.field2518;
      }

      Rasterizer3D.field2519.method4477(var0, var1, var2, var3);
   }

   @ObfuscatedName("hf")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1439083269"
   )
   @Export("playSong")
   static void playSong(int var0) {
      if (var0 == -1 && !Client.playingJingle) {
         FloorUnderlayDefinition.method3865();
      } else if (var0 != -1 && var0 != Client.currentTrackGroupId && class20.clientPreferences.method2461() != 0 && !Client.playingJingle) {
         Actor.method2399(2, class399.archive6, var0, 0, class20.clientPreferences.method2461(), false);
      }

      Client.currentTrackGroupId = var0;
   }

   @ObfuscatedName("ih")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "5"
   )
   static final void method12() {
      class133.method3165(WorldMapRectangle.field3006, Players.field1344, KitDefinition.field1957);
      GraphicsObject.method2026(ScriptEvent.field1041, class86.field1082);
      if (class36.cameraX == WorldMapRectangle.field3006 && class174.cameraY == Players.field1344 && class297.cameraZ == KitDefinition.field1957 && ScriptEvent.field1041 == WorldMapSectionType.cameraPitch && class125.cameraYaw == class86.field1082) {
         Client.field731 = false;
         Client.isCameraLocked = false;
         Client.field673 = false;
         Client.field747 = false;
         FontName.field4884 = 0;
         MilliClock.field1871 = 0;
         ScriptFrame.field469 = 0;
         Archive.field4213 = 0;
         WorldMapElement.field1937 = 0;
         class138.field1637 = 0;
         KeyHandler.field137 = 0;
         PlayerCompositionColorTextureOverride.field1902 = 0;
         class123.field1499 = 0;
         class16.field90 = 0;
         Client.field667 = null;
         Client.field737 = null;
         Client.field750 = null;
      }

   }

   @ObfuscatedName("io")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "339651855"
   )
   static void method11() {
      PacketBufferNode var0 = class330.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
      var0.packetBuffer.writeByte(GrandExchangeOfferNameComparator.getWindowedMode());
      var0.packetBuffer.writeShort(GameEngine.canvasWidth);
      var0.packetBuffer.writeShort(class262.canvasHeight);
      Client.packetWriter.addNode(var0);
   }
}
