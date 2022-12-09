import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("StudioGame")
public enum StudioGame implements MouseWheel {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Llw;"
   )
   @Export("runescape")
   runescape("runescape", "RuneScape", 0),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Llw;"
   )
   @Export("stellardawn")
   stellardawn("stellardawn", "Stellar Dawn", 1),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Llw;"
   )
   @Export("game3")
   game3("game3", "Game 3", 2),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Llw;"
   )
   @Export("game4")
   game4("game4", "Game 4", 3),
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Llw;"
   )
   @Export("game5")
   game5("game5", "Game 5", 4),
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Llw;"
   )
   @Export("oldscape")
   oldscape("oldscape", "RuneScape 2007", 5);

   @ObfuscatedName("f")
   @Export("name")
   public final String name;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1618416039
   )
   @Export("id")
   final int id;

   StudioGame(String var3, String var4, int var5) {
      this.name = var3;
      this.id = var5;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "96"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }
}
