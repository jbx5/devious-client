import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
public class class315 {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lmg;"
   )
   @Export("huffman")
   static Huffman huffman;
   @ObfuscatedName("jb")
   @ObfuscatedSignature(
      descriptor = "[Lsn;"
   )
   @Export("headIconPkSprites")
   static SpritePixels[] headIconPkSprites;

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   static final void method6278() {
      Tiles.method2216("You can't add yourself to your own ignore list");
   }
}
