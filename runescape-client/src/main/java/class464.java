import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
final class class464 implements class463 {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Lsy;I)V",
      garbageValue = "-1509130344"
   )
   public void vmethod8486(Object var1, Buffer var2) {
      this.method8441((Integer)var1, var2);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lsy;B)Ljava/lang/Object;",
      garbageValue = "0"
   )
   public Object vmethod8485(Buffer var1) {
      return var1.readInt();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Integer;Lsy;B)V",
      garbageValue = "0"
   )
   void method8441(Integer var1, Buffer var2) {
      var2.writeInt(var1);
   }
}
