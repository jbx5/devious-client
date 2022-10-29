import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1171532599
   )
   @Export("width")
   int width;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 2064295769
   )
   @Export("height")
   int height;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -294423873
   )
   @Export("x")
   int x;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1121577211
   )
   @Export("y")
   int y;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lil;"
   )
   final WorldMapManager this$0;

   @ObfuscatedSignature(
      descriptor = "(Lil;)V"
   )
   WorldMapRectangle(WorldMapManager var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("jv")
   @ObfuscatedSignature(
      descriptor = "(Lkn;IIZB)V",
      garbageValue = "48"
   )
   @Export("alignWidgetSize")
   static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
      int var4 = var0.width;
      int var5 = var0.height;
      if (var0.widthAlignment == 0) {
         var0.width = var0.rawWidth;
      } else if (var0.widthAlignment == 1) {
         var0.width = var1 - var0.rawWidth;
      } else if (var0.widthAlignment == 2) {
         var0.width = var0.rawWidth * var1 >> 14;
      }

      if (var0.heightAlignment == 0) {
         var0.height = var0.rawHeight;
      } else if (var0.heightAlignment == 1) {
         var0.height = var2 - var0.rawHeight;
      } else if (var0.heightAlignment == 2) {
         var0.height = var2 * var0.rawHeight >> 14;
      }

      if (var0.widthAlignment == 4) {
         var0.width = var0.height * var0.field3498 / var0.field3532;
      }

      if (var0.heightAlignment == 4) {
         var0.height = var0.field3532 * var0.width / var0.field3498;
      }

      if (var0.contentType == 1337) {
         Client.viewportWidget = var0;
      }

      if (var0.type == 12) {
         var0.method6076().method5772(var0.width, var0.height);
      }

      if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) {
         ScriptEvent var6 = new ScriptEvent();
         var6.widget = var0;
         var6.args = var0.onResize;
         Client.scriptEvents.addFirst(var6);
      }

   }
}
