import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
public class class442 implements class441 {
   @ObfuscatedName("a")
   Map field4780;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lrr;"
   )
   final class470 field4781;

   @ObfuscatedSignature(
      descriptor = "(Lrr;)V"
   )
   public class442(class470 var1) {
      this.field4781 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "68"
   )
   public int vmethod8144(int var1) {
      if (this.field4780 != null) {
         class471 var2 = (class471)this.field4780.get(var1);
         if (var2 != null) {
            return (Integer)var2.field4930;
         }
      }

      return (Integer)this.field4781.vmethod8697(var1);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/Object;B)V",
      garbageValue = "22"
   )
   public void vmethod8143(int var1, Object var2) {
      if (this.field4780 == null) {
         this.field4780 = new HashMap();
         this.field4780.put(var1, new class471(var1, var2));
      } else {
         class471 var3 = (class471)this.field4780.get(var1);
         if (var3 == null) {
            this.field4780.put(var1, new class471(var1, var2));
         } else {
            var3.field4930 = var2;
         }
      }

   }

   public Iterator iterator() {
      return this.field4780 == null ? Collections.emptyList().iterator() : this.field4780.values().iterator();
   }
}
