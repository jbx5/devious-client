import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
public class class350 {
   static {
      new HashMap();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Llm;IB)V",
      garbageValue = "52"
   )
   static void method6771(Archive var0, int var1) {
      if (var0.field4205) {
         if (var1 <= NetCache.field4253) {
            throw new RuntimeException("");
         }

         if (var1 < NetCache.field4254) {
            NetCache.field4254 = var1;
         }
      } else {
         if (var1 >= NetCache.field4254) {
            throw new RuntimeException("");
         }

         if (var1 > NetCache.field4253) {
            NetCache.field4253 = var1;
         }
      }

      if (class10.field56 != null) {
         class1.method9(var0, var1);
      } else {
         World.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true);
         NetCache.NetCache_archives[var1] = var0;
      }
   }
}
