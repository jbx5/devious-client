import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
class class135 implements Callable {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "[Lis;"
   )
   public static class215[] field1579;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfz;"
   )
   final class136 this$0;
   // $FF: synthetic field
   final int val$workStart;
   // $FF: synthetic field
   final int val$workEnd;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "[Leg;"
   )
   final class128[] val$curveLoadJobs;

   @ObfuscatedSignature(
      descriptor = "(Lfz;II[Leg;)V"
   )
   class135(class136 var1, int var2, int var3, class128[] var4) {
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

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)[Llj;",
      garbageValue = "1017659250"
   )
   public static class294[] method3046() {
      return new class294[]{class294.field3206, class294.field3199, class294.field3207, class294.field3201, class294.field3198, class294.field3203, class294.field3202, class294.field3205, class294.field3208, class294.field3204, class294.field3200};
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IIIB)I",
      garbageValue = "36"
   )
   static int method3045(int var0, int var1, int var2) {
      if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) {
         return 0;
      } else {
         return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0;
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "844519050"
   )
   static int method3048() {
      return Login.loginIndex;
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZB)I",
      garbageValue = "49"
   )
   static int method3047(int var0, Script var1, boolean var2) {
      return 2;
   }
}
