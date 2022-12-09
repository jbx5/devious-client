import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public class class324 {
   static {
      int var0 = 0;
      int var1 = 0;
      class319[] var2 = WorldMapIcon_0.method5201();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class319 var4 = var2[var3];
         if (var4.field3783 > var0) {
            var0 = var4.field3783;
         }

         if (var4.field3784 > var1) {
            var1 = var4.field3784;
         }
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IB)Lfq;",
      garbageValue = "-13"
   )
   @Export("getInvDefinition")
   public static InvDefinition getInvDefinition(int var0) {
      InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
         var1 = new InvDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         InvDefinition.InvDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }
}
