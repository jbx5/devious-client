import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
public class class393 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lpm;"
   )
   static final class393 field4519 = new class393("Basic");
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lpm;"
   )
   static final class393 field4518 = new class393("Bearer");
   @ObfuscatedName("aw")
   final String field4520;

   class393(String var1) {
      this.field4520 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "43"
   )
   String method7621() {
      return this.field4520;
   }

   @ObfuscatedName("ny")
   @ObfuscatedSignature(
      descriptor = "(Lmq;B)Z",
      garbageValue = "1"
   )
   @Export("isComponentHidden")
   static boolean isComponentHidden(Widget var0) {
      return var0.isHidden;
   }
}
