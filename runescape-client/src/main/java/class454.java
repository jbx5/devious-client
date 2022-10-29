import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
final class class454 implements class449 {
   @ObfuscatedName("fs")
   @ObfuscatedGetter(
      intValue = -151760919
   )
   @Export("currentPort")
   static int currentPort;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Lqr;I)V",
      garbageValue = "-1814111354"
   )
   public void vmethod8274(Object var1, Buffer var2) {
      this.method8279((String)var1, var2);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)Ljava/lang/Object;",
      garbageValue = "1394013597"
   )
   public Object vmethod8273(Buffer var1) {
      return var1.readStringCp1252NullTerminated();
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lqr;I)V",
      garbageValue = "-511633053"
   )
   void method8279(String var1, Buffer var2) {
      var2.writeStringCp1252NullTerminated(var1);
   }
}
