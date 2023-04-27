import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sr")
public class class493 implements MouseWheel {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lsr;"
   )
   public static final class493 field5048 = new class493(5, 0);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lsr;"
   )
   public static final class493 field5044 = new class493(1, 2);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lsr;"
   )
   static final class493 field5046 = new class493(2, 5);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lsr;"
   )
   static final class493 field5045 = new class493(4, 6);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lsr;"
   )
   static final class493 field5047 = new class493(0, 7);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lsr;"
   )
   static final class493 field5049 = new class493(3, 8);
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1668238515
   )
   final int field5050;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1588670303
   )
   final int field5051;

   class493(int var1, int var2) {
      this.field5050 = var1;
      this.field5051 = var2;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "741942848"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field5051;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-228540689"
   )
   public boolean method9347() {
      return this == field5044;
   }
}
