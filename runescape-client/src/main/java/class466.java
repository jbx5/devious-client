import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rd")
final class class466 implements class463 {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Lsy;I)V",
      garbageValue = "-1509130344"
   )
   public void vmethod8486(Object var1, Buffer var2) {
      this.method8459((Long)var1, var2);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lsy;B)Ljava/lang/Object;",
      garbageValue = "0"
   )
   public Object vmethod8485(Buffer var1) {
      return var1.readLong();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Long;Lsy;I)V",
      garbageValue = "304937837"
   )
   void method8459(Long var1, Buffer var2) {
      var2.writeLong(var1);
   }
}
