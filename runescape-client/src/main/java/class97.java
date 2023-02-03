import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
public class class97 {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -752043559
   )
   int field1306;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1050555097
   )
   int field1310;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 986287601
   )
   int field1308;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1059520575
   )
   int field1309;

   class97(int var1, int var2, int var3, int var4) {
      this.field1306 = var1;
      this.field1310 = var2;
      this.field1308 = var3;
      this.field1309 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-8"
   )
   int method2702() {
      return this.field1306;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-73"
   )
   int method2692() {
      return this.field1310;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1907200129"
   )
   int method2693() {
      return this.field1308;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2091202510"
   )
   int method2694() {
      return this.field1309;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "1301110913"
   )
   @Export("isAlphaNumeric")
   public static boolean isAlphaNumeric(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   @ObfuscatedName("ja")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIIB)V",
      garbageValue = "-60"
   )
   @Export("drawWidgets")
   static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (class153.loadInterface(var0)) {
         MouseHandler.field262 = null;
         class27.drawInterface(WorldMapLabel.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
         if (MouseHandler.field262 != null) {
            class27.drawInterface(MouseHandler.field262, -1412584499, var1, var2, var3, var4, class288.field3342, class366.field4370, var7);
            MouseHandler.field262 = null;
         }

      } else {
         if (var7 != -1) {
            Client.field725[var7] = true;
         } else {
            for(int var8 = 0; var8 < 100; ++var8) {
               Client.field725[var8] = true;
            }
         }

      }
   }
}
