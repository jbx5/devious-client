import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rh")
public class class471 implements MouseWheel {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lrh;"
   )
   public static final class471 field4976 = new class471(1, 0);
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lrh;"
   )
   public static final class471 field4969 = new class471(0, 2);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lrh;"
   )
   static final class471 field4972 = new class471(3, 5);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lrh;"
   )
   static final class471 field4971 = new class471(4, 6);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Lrh;"
   )
   static final class471 field4974 = new class471(2, 7);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lrh;"
   )
   static final class471 field4973 = new class471(5, 8);
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1996327845
   )
   final int field4970;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1814081275
   )
   final int field4975;

   class471(int var1, int var2) {
      this.field4970 = var1;
      this.field4975 = var2;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-2122375647"
   )
   public boolean method8841() {
      return this == field4969;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "96"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field4975;
   }
}
