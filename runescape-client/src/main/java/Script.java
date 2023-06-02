import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("Script")
public class Script extends DualNode {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("Script_cached")
   static EvictingDualNodeHashTable Script_cached = new EvictingDualNodeHashTable(128);
   @ObfuscatedName("an")
   String field992;
   @ObfuscatedName("av")
   @Export("opcodes")
   int[] opcodes;
   @ObfuscatedName("as")
   @Export("intOperands")
   int[] intOperands;
   @ObfuscatedName("ax")
   @Export("stringOperands")
   String[] stringOperands;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 280962447
   )
   @Export("localIntCount")
   int localIntCount;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 219646607
   )
   @Export("localStringCount")
   int localStringCount;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1089927101
   )
   @Export("intArgumentCount")
   int intArgumentCount;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 942495419
   )
   @Export("stringArgumentCount")
   int stringArgumentCount;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "[Lsv;"
   )
   @Export("switches")
   IterableNodeHashTable[] switches;

   Script() {
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(II)[Lsv;",
      garbageValue = "-1348069017"
   )
   @Export("newIterableNodeHashTable")
   IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
      return new IterableNodeHashTable[var1];
   }
}
