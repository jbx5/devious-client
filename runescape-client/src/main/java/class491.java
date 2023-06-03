import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sd")
final class class491 implements class486 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Ltz;B)V",
      garbageValue = "71"
   )
   public void vmethod8774(Object var1, Buffer var2) {
      this.method8781((String)var1, var2);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)Ljava/lang/Object;",
      garbageValue = "-190288914"
   )
   public Object vmethod8773(Buffer var1) {
      return var1.readStringCp1252NullTerminated();
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ltz;I)V",
      garbageValue = "-1584535843"
   )
   void method8781(String var1, Buffer var2) {
      var2.writeStringCp1252NullTerminated(var1);
   }
}
