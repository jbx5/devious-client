import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1531493799
   )
   @Export("objectDefinitionId")
   final int objectDefinitionId;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1505004585
   )
   @Export("decoration")
   final int decoration;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1529813931
   )
   @Export("rotation")
   final int rotation;

   WorldMapDecoration(int var1, int var2, int var3) {
      this.objectDefinitionId = var1;
      this.decoration = var2;
      this.rotation = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(III)Lkn;",
      garbageValue = "-1310850366"
   )
   @Export("getWidgetChild")
   public static Widget getWidgetChild(int var0, int var1) {
      Widget var2 = class281.getWidget(var0);
      if (var1 == -1) {
         return var2;
      } else {
         return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Ldb;FI)F",
      garbageValue = "-1677535030"
   )
   static float method5149(class124 var0, float var1) {
      if (var0 == null) {
         return 0.0F;
      } else {
         float var2 = var1 - var0.field1485;
         return var0.field1487[3] + (var0.field1487[2] + (var2 * var0.field1487[0] + var0.field1487[1]) * var2) * var2;
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "-1213424322"
   )
   public static int method5148(int var0, int var1, int var2) {
      int var3 = Archive.method6338(var2 - var1 + 1);
      var3 <<= var1;
      var0 |= var3;
      return var0;
   }
}
