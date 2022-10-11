import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
final class class450 implements class449 {
   @ObfuscatedName("j")
   @Export("SpriteBuffer_spriteWidths")
   static int[] SpriteBuffer_spriteWidths;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Lqr;I)V",
      garbageValue = "-1814111354"
   )
   public void vmethod8274(Object var1, Buffer var2) {
      this.method8232((Integer)var1, var2);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)Ljava/lang/Object;",
      garbageValue = "1394013597"
   )
   public Object vmethod8273(Buffer var1) {
      return var1.readInt();
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Integer;Lqr;I)V",
      garbageValue = "-1013011153"
   )
   void method8232(Integer var1, Buffer var2) {
      var2.writeInt(var1);
   }
}
