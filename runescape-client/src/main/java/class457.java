import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qg")
final class class457 implements class452 {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Lqy;I)V",
      garbageValue = "-1165050397"
   )
   public void vmethod8422(Object var1, Buffer var2) {
      this.method8413((String)var1, var2);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)Ljava/lang/Object;",
      garbageValue = "1911852841"
   )
   public Object vmethod8414(Buffer var1) {
      return var1.readStringCp1252NullTerminated();
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lqy;B)V",
      garbageValue = "-8"
   )
   void method8413(String var1, Buffer var2) {
      var2.writeStringCp1252NullTerminated(var1);
   }
}
