import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
public class class16 implements ThreadFactory {
   @ObfuscatedName("h")
   final ThreadGroup field92;
   @ObfuscatedName("e")
   final AtomicInteger field91;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Ln;"
   )
   final class14 this$0;

   @ObfuscatedSignature(
      descriptor = "(Ln;)V"
   )
   class16(class14 var1) {
      this.this$0 = var1;
      this.field91 = new AtomicInteger(1);
      SecurityManager var2 = System.getSecurityManager();
      this.field92 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
   }

   public Thread newThread(Runnable var1) {
      Thread var2 = new Thread(this.field92, var1, this.this$0.field85 + "-rest-request-" + this.field91.getAndIncrement(), 0L);
      var2.setDaemon(true);
      var2.setPriority(5);
      return var2;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)Llz;",
      garbageValue = "1420480723"
   )
   public static GameBuild method198(int var0) {
      GameBuild[] var1 = class135.method3065();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         GameBuild var3 = var1[var2];
         if (var0 == var3.buildId) {
            return var3;
         }
      }

      return null;
   }

   @ObfuscatedName("ho")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "108"
   )
   static void method197(int var0, int var1) {
      if (StructComposition.clientPreferences.method2425() != 0 && var0 != -1) {
         class29.method426(class21.field123, var0, 0, StructComposition.clientPreferences.method2425(), false);
         Client.playingJingle = true;
      }

   }
}
