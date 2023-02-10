import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
public class class478 implements MouseWheel {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lro;"
   )
   public static final class478 field4996 = new class478(3, 0);
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lro;"
   )
   public static final class478 field4992 = new class478(1, 2);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lro;"
   )
   static final class478 field4993 = new class478(5, 5);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lro;"
   )
   static final class478 field4994 = new class478(2, 6);
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lro;"
   )
   static final class478 field4995 = new class478(0, 7);
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lro;"
   )
   static final class478 field4991 = new class478(4, 8);
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -821987039
   )
   final int field4997;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1469070037
   )
   final int field4998;

   class478(int var1, int var2) {
      this.field4997 = var1;
      this.field4998 = var2;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "3"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field4998;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "102"
   )
   public boolean method8938() {
      return this == field4992;
   }
}
