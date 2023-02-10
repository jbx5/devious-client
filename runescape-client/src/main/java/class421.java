import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pq")
public class class421 implements class426 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lqs;"
   )
   public final class451 field4671;

   @ObfuscatedSignature(
      descriptor = "(Lqe;)V"
   )
   class421(class452 var1) {
      this.field4671 = var1;
   }

   @ObfuscatedSignature(
      descriptor = "(Lpo;)V"
   )
   public class421(class422 var1) {
      this(new class452(var1));
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "70"
   )
   public int method7995(int var1) {
      return this.field4671.vmethod8375(var1);
   }
}
