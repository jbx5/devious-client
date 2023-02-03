import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
   @ObfuscatedName("z")
   @Export("Interpreter_stringLocals")
   static String[] Interpreter_stringLocals;
   @ObfuscatedName("f")
   @Export("executor")
   ExecutorService executor = Executors.newSingleThreadExecutor();
   @ObfuscatedName("w")
   @Export("future")
   Future future;

   SecureRandomFuture() {
      this.future = this.executor.submit(new SecureRandomCallable());
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-910737329"
   )
   @Export("shutdown")
   void shutdown() {
      this.executor.shutdown();
      this.executor = null;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "122"
   )
   @Export("isDone")
   boolean isDone() {
      return this.future.isDone();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/security/SecureRandom;",
      garbageValue = "927124280"
   )
   @Export("get")
   SecureRandom get() {
      try {
         return (SecureRandom)this.future.get();
      } catch (Exception var2) {
         return class143.method3179();
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1316720395"
   )
   @Export("getVarbit")
   public static int getVarbit(int var0) {
      VarbitComposition var1 = VarpDefinition.method3597(var0);
      int var2 = var1.baseVar;
      int var3 = var1.startBit;
      int var4 = var1.endBit;
      int var5 = Varps.Varps_masks[var4 - var3];
      return Varps.Varps_main[var2] >> var3 & var5;
   }
}
