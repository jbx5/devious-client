import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
public class class1 implements Callable {
   @ObfuscatedName("ag")
   @Export("fontHelvetica13")
   static java.awt.Font fontHelvetica13;
   @ObfuscatedName("fw")
   @ObfuscatedGetter(
      intValue = 43392043
   )
   @Export("worldPort")
   static int worldPort;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lrd;"
   )
   final Buffer field6;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Ls;"
   )
   final class3 field1;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Ln;"
   )
   final class7 this$0;

   @ObfuscatedSignature(
      descriptor = "(Ln;Lrd;Ls;)V"
   )
   class1(class7 var1, Buffer var2, class3 var3) {
      this.this$0 = var1;
      this.field6 = var2;
      this.field1 = var3;
   }

   public Object call() {
      return this.field1.vmethod12(this.field6);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Llm;II)V",
      garbageValue = "-2059005384"
   )
   static void method9(Archive var0, int var1) {
      class10.field56.offset = var1 * 8 + 5;
      if (class10.field56.offset >= class10.field56.array.length) {
         if (var0.field4205) {
            var0.method6480();
         } else {
            throw new RuntimeException("");
         }
      } else {
         int var2 = class10.field56.readInt();
         int var3 = class10.field56.readInt();
         var0.loadIndex(var2, var3);
      }
   }
}
