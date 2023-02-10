import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
class class128 implements Callable {
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lei;"
   )
   final class133 this$0;
   // $FF: synthetic field
   final int val$workStart;
   // $FF: synthetic field
   final int val$workEnd;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "[Ldu;"
   )
   final class124[] val$curveLoadJobs;

   @ObfuscatedSignature(
      descriptor = "(Lei;II[Ldu;)V"
   )
   class128(class133 var1, int var2, int var3, class124[] var4) {
      this.this$0 = var1;
      this.val$workStart = var2;
      this.val$workEnd = var3;
      this.val$curveLoadJobs = var4;
   }

   public Object call() {
      for(int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
         this.val$curveLoadJobs[var1].call();
      }

      return null;
   }
}
