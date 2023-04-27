import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
public class class295 {
   @ObfuscatedName("af")
   static int[] field3369;

   static {
      new Object();
      field3369 = new int[33];
      field3369[0] = 0;
      int var0 = 2;

      for(int var1 = 1; var1 < 33; ++var1) {
         field3369[var1] = var0 - 1;
         var0 += var0;
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   public static void method5745() {
      if (NetCache.NetCache_socket != null) {
         NetCache.NetCache_socket.close();
      }

   }
}
