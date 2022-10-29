import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
final class class452 implements class449 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Lqr;I)V",
      garbageValue = "-1814111354"
   )
   public void vmethod8274(Object var1, Buffer var2) {
      this.method8252((Long)var1, var2);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)Ljava/lang/Object;",
      garbageValue = "1394013597"
   )
   public Object vmethod8273(Buffer var1) {
      return var1.readLong();
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Long;Lqr;B)V",
      garbageValue = "101"
   )
   void method8252(Long var1, Buffer var2) {
      var2.writeLong(var1);
   }
}
