import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
public class class386 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lnb;"
   )
   static final class386 field4499 = new class386("Basic");
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lnb;"
   )
   static final class386 field4498 = new class386("Bearer");
   @ObfuscatedName("v")
   final String field4497;

   class386(String var1) {
      this.field4497 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1783609031"
   )
   String method7408() {
      return this.field4497;
   }
}
