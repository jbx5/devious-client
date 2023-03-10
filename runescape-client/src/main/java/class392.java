import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
public class class392 {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lpm;"
   )
   public static final class392 field4475 = new class392(1);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lpm;"
   )
   static final class392 field4478 = new class392(0);
   @ObfuscatedName("bj")
   @Export("client")
   @ObfuscatedSignature(
      descriptor = "Lclient;"
   )
   public static Client client;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -84981371
   )
   final int field4477;

   class392(int var1) {
      this.field4477 = var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/security/SecureRandom;",
      garbageValue = "1245058623"
   )
   static SecureRandom method7406() {
      SecureRandom var0 = new SecureRandom();
      var0.nextInt();
      return var0;
   }
}
