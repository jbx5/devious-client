import java.awt.FontMetrics;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
class class133 implements Callable {
   @ObfuscatedName("bj")
   @Export("loginScreenFontMetrics")
   static FontMetrics loginScreenFontMetrics;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfz;"
   )
   final class136 this$0;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Ltz;"
   )
   final Buffer val$p;
   // $FF: synthetic field
   final int val$version;

   @ObfuscatedSignature(
      descriptor = "(Lfz;Ltz;I)V"
   )
   class133(class136 var1, Buffer var2, int var3) {
      this.this$0 = var1;
      this.val$p = var2;
      this.val$version = var3;
   }

   public Object call() {
      this.this$0.method3069(this.val$p, this.val$version);
      return null;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lnq;I)V",
      garbageValue = "-1175904330"
   )
   public static void method3038(AbstractArchive var0) {
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "619467586"
   )
   public static boolean method3039(int var0) {
      return var0 >= WorldMapDecorationType.field3801.id && var0 <= WorldMapDecorationType.field3786.id || var0 == WorldMapDecorationType.field3799.id;
   }
}
