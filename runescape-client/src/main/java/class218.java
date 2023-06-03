import java.util.Comparator;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
public class class218 implements Comparator {
   @ObfuscatedName("ww")
   static Iterator field2404;

   class218() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lik;Lik;I)I",
      garbageValue = "-530792660"
   )
   int method4263(class213 var1, class213 var2) {
      return var1.method4207() - var2.method4207();
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method4263((class213)var1, (class213)var2);
   }
}
