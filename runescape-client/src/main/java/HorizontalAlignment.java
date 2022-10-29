import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements MouseWheel {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lgl;"
   )
   field1951(1, 0),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lgl;"
   )
   @Export("HorizontalAlignment_centered")
   HorizontalAlignment_centered(0, 1),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lgl;"
   )
   field1950(2, 2);

   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1605598307
   )
   @Export("value")
   public final int value;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 2043429175
   )
   @Export("id")
   final int id;

   HorizontalAlignment(int var3, int var4) {
      this.value = var3;
      this.id = var4;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1955451774"
   )
   public static void method3543() {
      PlayerComposition.PlayerAppearance_cachedModels.clear();
   }
}
