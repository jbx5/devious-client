import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
public class class452 implements class451 {
   @ObfuscatedName("f")
   Map field4849;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lrc;"
   )
   final class481 field4848;

   @ObfuscatedSignature(
      descriptor = "(Lrc;)V"
   )
   public class452(class481 var1) {
      this.field4848 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "69"
   )
   public int vmethod8375(int var1) {
      if (this.field4849 != null) {
         class482 var2 = (class482)this.field4849.get(var1);
         if (var2 != null) {
            return (Integer)var2.field5004;
         }
      }

      return (Integer)this.field4848.vmethod8966(var1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/Object;I)V",
      garbageValue = "-1706605993"
   )
   public void vmethod8378(int var1, Object var2) {
      if (this.field4849 == null) {
         this.field4849 = new HashMap();
         this.field4849.put(var1, new class482(var1, var2));
      } else {
         class482 var3 = (class482)this.field4849.get(var1);
         if (var3 == null) {
            this.field4849.put(var1, new class482(var1, var2));
         } else {
            var3.field5004 = var2;
         }
      }

   }

   public Iterator iterator() {
      return this.field4849 == null ? Collections.emptyList().iterator() : this.field4849.values().iterator();
   }
}
