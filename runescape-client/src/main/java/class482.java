import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
public class class482 implements MouseWheel {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lsg;"
   )
   public static final class482 field4962 = new class482(5, 0);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lsg;"
   )
   public static final class482 field4956 = new class482(3, 2);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lsg;"
   )
   static final class482 field4957 = new class482(2, 5);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lsg;"
   )
   static final class482 field4955 = new class482(1, 6);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lsg;"
   )
   static final class482 field4959 = new class482(0, 7);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lsg;"
   )
   static final class482 field4960 = new class482(4, 8);
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -539848629
   )
   final int field4961;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1027217745
   )
   final int field4958;

   class482(int var1, int var2) {
      this.field4961 = var1;
      this.field4958 = var2;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1409646049"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field4958;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1427661354"
   )
   public boolean method8928() {
      return this == field4956;
   }
}
