import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qx")
final class class460 implements class459 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Lrd;B)V",
      garbageValue = "10"
   )
   public void vmethod8518(Object var1, Buffer var2) {
      this.method8481((Integer)var1, var2);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lrd;B)Ljava/lang/Object;",
      garbageValue = "4"
   )
   public Object vmethod8517(Buffer var1) {
      return var1.readInt();
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Integer;Lrd;I)V",
      garbageValue = "-1712633556"
   )
   void method8481(Integer var1, Buffer var2) {
      var2.writeInt(var1);
   }
}
