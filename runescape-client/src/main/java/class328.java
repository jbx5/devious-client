import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("lt")
public class class328 {
   static {
      int var0 = 0;
      int var1 = 0;
      class323[] var2 = FontName.method8320();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class323 var4 = var2[var3];
         if (var4.field3799 > var0) {
            var0 = var4.field3799;
         }

         if (var4.field3797 > var1) {
            var1 = var4.field3797;
         }
      }

   }
}
