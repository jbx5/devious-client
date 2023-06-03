import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
   @ObfuscatedName("gi")
   @ObfuscatedGetter(
      intValue = -1065093397
   )
   @Export("js5Port")
   static int js5Port;
   @ObfuscatedName("at")
   @Export("executor")
   ExecutorService executor = Executors.newSingleThreadExecutor();
   @ObfuscatedName("an")
   @Export("future")
   Future future;

   SecureRandomFuture() {
      this.future = this.executor.submit(new SecureRandomCallable());
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-947147535"
   )
   @Export("shutdown")
   void shutdown() {
      this.executor.shutdown();
      this.executor = null;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1288448133"
   )
   @Export("isDone")
   boolean isDone() {
      return this.future.isDone();
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(S)Ljava/security/SecureRandom;",
      garbageValue = "6896"
   )
   @Export("get")
   SecureRandom get() {
      try {
         return (SecureRandom)this.future.get();
      } catch (Exception var4) {
         SecureRandom var3 = new SecureRandom();
         var3.nextInt();
         return var3;
      }
   }
}
