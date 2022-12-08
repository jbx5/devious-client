import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
public final class class364 {
   @ObfuscatedName("h")
   final Object field4362;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -417894275
   )
   int field4363;

   class364(Object var1, int var2) {
      this.field4362 = var1;
      this.field4363 = var2;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)Lgm;",
      garbageValue = "-1598389394"
   )
   public static HitSplatDefinition method6987(int var0) {
      HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class18.HitSplatDefinition_archive.takeFile(32, var0);
         var1 = new HitSplatDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }
}
