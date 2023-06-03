import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("AttackOption")
public enum AttackOption implements MouseWheel {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lds;"
   )
   @Export("AttackOption_dependsOnCombatLevels")
   AttackOption_dependsOnCombatLevels(0),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lds;"
   )
   @Export("AttackOption_alwaysRightClick")
   AttackOption_alwaysRightClick(1),
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lds;"
   )
   field1308(2),
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lds;"
   )
   @Export("AttackOption_hidden")
   AttackOption_hidden(3),
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lds;"
   )
   field1307(4);

   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1527727815
   )
   @Export("id")
   final int id;

   AttackOption(int var3) {
      this.id = var3;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-14"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }
}
