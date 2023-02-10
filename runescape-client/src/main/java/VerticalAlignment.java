import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements MouseWheel {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lgd;"
   )
   field2074(1, 0),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lgd;"
   )
   @Export("VerticalAlignment_centered")
   VerticalAlignment_centered(2, 1),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lgd;"
   )
   field2078(0, 2);

   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -76089911
   )
   static int field2071;
   @ObfuscatedName("bi")
   static String field2070;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -404874057
   )
   @Export("value")
   public final int value;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 589122881
   )
   @Export("id")
   final int id;

   VerticalAlignment(int var3, int var4) {
      this.value = var3;
      this.id = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "3"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }
}
