import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
class class132 implements Callable {
   @ObfuscatedName("wc")
   @ObfuscatedSignature(
      descriptor = "Lnf;"
   )
   public static class354 field1585;
   @ObfuscatedName("fx")
   @ObfuscatedGetter(
      longValue = 4041510135797154485L
   )
   static long field1580;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfh;"
   )
   final class133 this$0;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lsg;"
   )
   final Buffer val$p;
   // $FF: synthetic field
   final int val$version;

   @ObfuscatedSignature(
      descriptor = "(Lfh;Lsg;I)V"
   )
   class132(class133 var1, Buffer var2, int var3) {
      this.this$0 = var1;
      this.val$p = var2;
      this.val$version = var3;
   }

   public Object call() {
      this.this$0.method3135(this.val$p, this.val$version);
      return null;
   }
}
