import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class167 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lde;"
   )
   public UrlRequest field1815;
   @ObfuscatedName("f")
   public float[] field1814;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lft;"
   )
   final class162 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lft;)V"
   )
   class167(class162 var1) {
      this.this$0 = var1;
      this.field1814 = new float[4];
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1753837162"
   )
   @Export("Widget_unpackTargetMask")
   public static int Widget_unpackTargetMask(int var0) {
      return var0 >> 11 & 63;
   }

   @ObfuscatedName("gs")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-111989353"
   )
   @Export("setWindowedMode")
   static void setWindowedMode(int var0) {
      Client.field587 = 0L;
      if (var0 >= 2) {
         Client.isResizable = true;
      } else {
         Client.isResizable = false;
      }

      if (class13.getWindowedMode() == 1) {
         ClanChannelMember.client.setMaxCanvasSize(765, 503);
      } else {
         ClanChannelMember.client.setMaxCanvasSize(7680, 2160);
      }

      if (Client.gameState >= 25) {
         class9.method61();
      }

   }
}
