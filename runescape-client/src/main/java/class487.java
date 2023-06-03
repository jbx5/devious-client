import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sa")
final class class487 implements class486 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Ltz;B)V",
      garbageValue = "71"
   )
   public void vmethod8774(Object var1, Buffer var2) {
      this.method8737((Integer)var1, var2);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)Ljava/lang/Object;",
      garbageValue = "-190288914"
   )
   public Object vmethod8773(Buffer var1) {
      return var1.readInt();
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Integer;Ltz;I)V",
      garbageValue = "2031362998"
   )
   void method8737(Integer var1, Buffer var2) {
      var2.writeInt(var1);
   }
}
