import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
public class class230 {
   @ObfuscatedName("ix")
   @ObfuscatedGetter(
      intValue = 815510889
   )
   @Export("selectedItemWidget")
   static int selectedItemWidget;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)Lqi;",
      garbageValue = "-1766478327"
   )
   public static class453 method4679(int var0) {
      int var1 = class451.field4825[var0];
      if (var1 == 1) {
         return class453.field4834;
      } else if (var1 == 2) {
         return class453.field4836;
      } else {
         return var1 == 3 ? class453.field4828 : null;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IB)Lgk;",
      garbageValue = "2"
   )
   @Export("getParamDefinition")
   public static ParamComposition getParamDefinition(int var0) {
      ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class11.ParamDefinition_archive.takeFile(11, var0);
         var1 = new ParamComposition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.postDecode();
         ParamComposition.ParamDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIB)I",
      garbageValue = "41"
   )
   public static int method4681(int var0, int var1, int var2, int var3, int var4, int var5) {
      if ((var5 & 1) == 1) {
         int var6 = var3;
         var3 = var4;
         var4 = var6;
      }

      var2 &= 3;
      if (var2 == 0) {
         return var1;
      } else if (var2 == 1) {
         return 7 - var0 - (var3 - 1);
      } else {
         return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
      }
   }

   @ObfuscatedName("mu")
   @ObfuscatedSignature(
      descriptor = "(II)Lqq;",
      garbageValue = "791803911"
   )
   static class457 method4680(int var0) {
      class457 var1 = (class457)Client.DBTableIndex_cache.get((long)var0);
      if (var1 == null) {
         var1 = new class457(class250.field2930, class413.method7766(var0), ArchiveDiskActionHandler.method6293(var0));
         Client.DBTableIndex_cache.put(var1, (long)var0);
      }

      return var1;
   }
}
