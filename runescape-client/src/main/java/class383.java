import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
public class class383 {
   @ObfuscatedName("jj")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "344145901"
   )
   static void method7318(int var0, int var1) {
      int var2 = class7.fontBold12.stringWidth("Choose Option");

      int var3;
      int var4;
      for(var3 = 0; var3 < Client.menuOptionsCount; ++var3) {
         var4 = class7.fontBold12.stringWidth(SceneTilePaint.method4753(var3));
         if (var4 > var2) {
            var2 = var4;
         }
      }

      var2 += 8;
      var3 = Client.menuOptionsCount * 15 + 22;
      var4 = var0 - var2 / 2;
      if (var4 + var2 > GameEngine.canvasWidth) {
         var4 = GameEngine.canvasWidth - var2;
      }

      if (var4 < 0) {
         var4 = 0;
      }

      int var5 = var1;
      if (var3 + var1 > class143.canvasHeight) {
         var5 = class143.canvasHeight - var3;
      }

      if (var5 < 0) {
         var5 = 0;
      }

      class20.menuX = var4;
      Login.menuY = var5;
      PacketWriter.menuWidth = var2;
      class30.menuHeight = Client.menuOptionsCount * 15 + 22;
   }
}
