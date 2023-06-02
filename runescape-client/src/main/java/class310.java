import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
public class class310 {
   @ObfuscatedName("fq")
   @ObfuscatedSignature(
      descriptor = "Lny;"
   )
   @Export("archive13")
   static Archive archive13;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1542614613
   )
   int field3457;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lcu;"
   )
   class53 field3456;

   @ObfuscatedSignature(
      descriptor = "(ILcu;)V"
   )
   class310(int var1, class53 var2) {
      this.field3457 = var1;
      this.field3456 = var2;
   }
}
