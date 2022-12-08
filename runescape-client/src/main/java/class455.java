import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
final class class455 implements class452 {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Lqy;I)V",
      garbageValue = "-1165050397"
   )
   public void vmethod8422(Object var1, Buffer var2) {
      this.method8381((Long)var1, var2);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)Ljava/lang/Object;",
      garbageValue = "1911852841"
   )
   public Object vmethod8414(Buffer var1) {
      return var1.readLong();
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Long;Lqy;B)V",
      garbageValue = "1"
   )
   void method8381(Long var1, Buffer var2) {
      var2.writeLong(var1);
   }
}
