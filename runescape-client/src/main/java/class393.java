import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
class class393 implements Comparator {
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lpe;"
   )
   final class394 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lpe;)V"
   )
   class393(class394 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lpn;Lpn;I)I",
      garbageValue = "1590106623"
   )
   int method7408(class395 var1, class395 var2) {
      if (var1.field4488 > var2.field4488) {
         return 1;
      } else {
         return var1.field4488 < var2.field4488 ? -1 : 0;
      }
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method7408((class395)var1, (class395)var2);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IZB)Ljava/lang/String;",
      garbageValue = "49"
   )
   @Export("intToString")
   public static String intToString(int var0, boolean var1) {
      return var1 && var0 >= 0 ? RouteStrategy.method4142(var0, 10, var1) : Integer.toString(var0);
   }
}
