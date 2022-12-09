import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public final class class4 {
   @ObfuscatedName("ej")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("archive9")
   static Archive archive9;

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(CS)Z",
      garbageValue = "12575"
   )
   static boolean method22(char var0) {
      return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "15"
   )
   static final void method21() {
      Object var10000 = null;
      String var0 = "You can't add yourself to your own ignore list";
      KitDefinition.addGameMessage(30, "", var0);
   }
}
