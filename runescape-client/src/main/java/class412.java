import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
public class class412 {
   @ObfuscatedName("h")
   float[] field4630;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1911705725
   )
   int field4632;

   class412(float[] var1, int var2) {
      this.field4630 = var1;
      this.field4632 = var2;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)I",
      garbageValue = "-541800699"
   )
   public static int method7858(CharSequence var0) {
      return class318.method6373(var0, 10, true);
   }

   @ObfuscatedName("nl")
   @ObfuscatedSignature(
      descriptor = "(II)Lqf;",
      garbageValue = "-565161685"
   )
   static class460 method7854(int var0) {
      class460 var1 = (class460)Client.DBTableMasterIndex_cache.get((long)var0);
      if (var1 == null) {
         var1 = new class460(Ignored.field4539, var0);
      }

      return var1;
   }
}
