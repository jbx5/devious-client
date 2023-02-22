import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
class class133 implements Callable {
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lns;"
   )
   @Export("NetCache_currentResponse")
   public static NetFileRequest NetCache_currentResponse;
   @ObfuscatedName("hy")
   @Export("secureRandom")
   static SecureRandom secureRandom;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfl;"
   )
   final class134 this$0;
   // $FF: synthetic field
   final int val$workStart;
   // $FF: synthetic field
   final int val$workEnd;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "[Lez;"
   )
   final class126[] val$curveLoadJobs;

   @ObfuscatedSignature(
      descriptor = "(Lfl;II[Lez;)V"
   )
   class133(class134 var1, int var2, int var3, class126[] var4) {
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

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)[Leu;",
      garbageValue = "5"
   )
   static class128[] method3040() {
      return new class128[]{class128.field1523, class128.field1534, class128.field1524, class128.field1525, class128.field1526, class128.field1527};
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1753207720"
   )
   static void method3039() {
      Messages.Messages_channels.clear();
      Messages.Messages_hashTable.clear();
      Messages.Messages_queue.clear();
      Messages.Messages_count = 0;
   }

   @ObfuscatedName("hg")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-120"
   )
   static final void method3038() {
      if (class18.ClanChat_inClanChat) {
         if (ReflectionCheck.friendsChat != null) {
            ReflectionCheck.friendsChat.sort();
         }

         class169.method3465();
         class18.ClanChat_inClanChat = false;
      }

   }
}
