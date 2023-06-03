import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
public class class306 implements Comparator {
   class306() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Llc;Llc;I)I",
      garbageValue = "1537862345"
   )
   int method5732(class310 var1, class310 var2) {
      return var1.field3457 - var2.field3457;
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method5732((class310)var1, (class310)var2);
   }
}
