import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sd")
final class class468 implements class463 {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Lsy;I)V",
      garbageValue = "-1509130344"
   )
   public void vmethod8486(Object var1, Buffer var2) {
      this.method8483((String)var1, var2);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lsy;B)Ljava/lang/Object;",
      garbageValue = "0"
   )
   public Object vmethod8485(Buffer var1) {
      return var1.readStringCp1252NullTerminated();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lsy;I)V",
      garbageValue = "1996281669"
   )
   void method8483(String var1, Buffer var2) {
      var2.writeStringCp1252NullTerminated(var1);
   }
}
