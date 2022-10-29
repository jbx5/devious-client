import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements MouseWheel {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lga;"
   )
   field2004(0, 0),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lga;"
   )
   @Export("VerticalAlignment_centered")
   VerticalAlignment_centered(1, 1),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lga;"
   )
   field2002(2, 2);

   @ObfuscatedName("ls")
   @ObfuscatedSignature(
      descriptor = "Lkn;"
   )
   @Export("dragInventoryWidget")
   static Widget dragInventoryWidget;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1173271927
   )
   @Export("value")
   public final int value;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1965041919
   )
   @Export("id")
   final int id;

   VerticalAlignment(int var3, int var4) {
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
}
