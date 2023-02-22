import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public class class132 {
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IB)Lhg;",
      garbageValue = "-90"
   )
   @Export("getEnum")
   public static EnumComposition getEnum(int var0) {
      EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0);
         var1 = new EnumComposition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         EnumComposition.EnumDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-97"
   )
   public static int method3036(int var0) {
      long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
      int var1 = (int)(var2 >>> 0 & 127L);
      return var1;
   }
}
