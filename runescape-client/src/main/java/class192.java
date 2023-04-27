import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
public class class192 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lhl;"
   )
   static final class192 field2068;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lhl;"
   )
   static final class192 field2062;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lhl;"
   )
   static final class192 field2063;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lhl;"
   )
   static final class192 field2061;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lhl;"
   )
   static final class192 field2065;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lhl;"
   )
   static final class192 field2066;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lhl;"
   )
   static final class192 field2069;
   @ObfuscatedName("nf")
   @ObfuscatedGetter(
      intValue = -1141903185
   )
   @Export("menuX")
   static int menuX;

   static {
      field2068 = new class192(0, class204.field2323);
      field2062 = new class192(1, class204.field2324);
      field2063 = new class192(2, class204.field2319);
      field2061 = new class192(3, class204.field2321);
      field2065 = new class192(4, class204.field2318);
      field2066 = new class192(5, class204.field2322);
      field2069 = new class192(6, class204.field2327);
   }

   @ObfuscatedSignature(
      descriptor = "(ILhp;)V"
   )
   class192(int var1, class204 var2) {
   }

   @ObfuscatedName("lj")
   @ObfuscatedSignature(
      descriptor = "(Lmq;IIB)V",
      garbageValue = "-121"
   )
   @Export("alignWidgetPosition")
   static void alignWidgetPosition(Widget var0, int var1, int var2) {
      if (var0.xAlignment == 0) {
         var0.x = var0.rawX;
      } else if (var0.xAlignment == 1) {
         var0.x = var0.rawX + (var1 - var0.width) / 2;
      } else if (var0.xAlignment == 2) {
         var0.x = var1 - var0.width - var0.rawX;
      } else if (var0.xAlignment == 3) {
         var0.x = var0.rawX * var1 >> 14;
      } else if (var0.xAlignment == 4) {
         var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
      } else {
         var0.x = var1 - var0.width - (var0.rawX * var1 >> 14);
      }

      if (var0.yAlignment == 0) {
         var0.y = var0.rawY;
      } else if (var0.yAlignment == 1) {
         var0.y = (var2 - var0.height) / 2 + var0.rawY;
      } else if (var0.yAlignment == 2) {
         var0.y = var2 - var0.height - var0.rawY;
      } else if (var0.yAlignment == 3) {
         var0.y = var2 * var0.rawY >> 14;
      } else if (var0.yAlignment == 4) {
         var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
      } else {
         var0.y = var2 - var0.height - (var2 * var0.rawY >> 14);
      }

   }
}
