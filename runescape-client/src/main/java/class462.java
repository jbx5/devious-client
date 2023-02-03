import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
final class class462 implements class459 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Lrd;B)V",
      garbageValue = "10"
   )
   public void vmethod8518(Object var1, Buffer var2) {
      this.method8493((Long)var1, var2);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lrd;B)Ljava/lang/Object;",
      garbageValue = "4"
   )
   public Object vmethod8517(Buffer var1) {
      return var1.readLong();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Long;Lrd;B)V",
      garbageValue = "-92"
   )
   void method8493(Long var1, Buffer var2) {
      var2.writeLong(var1);
   }
}
