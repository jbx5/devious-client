import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
public class class97 {
   @ObfuscatedName("ab")
   @Export("SpriteBuffer_spriteWidths")
   public static int[] SpriteBuffer_spriteWidths;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 2080935713
   )
   int field1302;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 446388583
   )
   int field1299;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1357124753
   )
   int field1300;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1073288555
   )
   int field1298;

   class97(int var1, int var2, int var3, int var4) {
      this.field1302 = var1;
      this.field1299 = var2;
      this.field1300 = var3;
      this.field1298 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-4"
   )
   int method2639() {
      return this.field1302;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1384589700"
   )
   int method2637() {
      return this.field1299;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "7"
   )
   int method2638() {
      return this.field1300;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1869203767"
   )
   int method2641() {
      return this.field1298;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "2039313596"
   )
   static int method2652(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 0) {
            var1 = 0;
         } else if (var1 > 127) {
            var1 = 127;
         }

         var1 = 127 - var1;
         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }
}
