import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("Script")
public class Script extends DualNode {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("Script_cached")
   static EvictingDualNodeHashTable Script_cached = new EvictingDualNodeHashTable(128);
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("Widget_fontsArchive")
   public static AbstractArchive Widget_fontsArchive;
   @ObfuscatedName("w")
   String field981;
   @ObfuscatedName("v")
   @Export("opcodes")
   int[] opcodes;
   @ObfuscatedName("s")
   @Export("intOperands")
   int[] intOperands;
   @ObfuscatedName("z")
   @Export("stringOperands")
   String[] stringOperands;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 989411477
   )
   @Export("localIntCount")
   int localIntCount;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 594981079
   )
   @Export("localStringCount")
   int localStringCount;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -250091469
   )
   @Export("intArgumentCount")
   int intArgumentCount;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1334350971
   )
   @Export("stringArgumentCount")
   int stringArgumentCount;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "[Lqu;"
   )
   @Export("switches")
   IterableNodeHashTable[] switches;

   Script() {
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(II)[Lqu;",
      garbageValue = "1227371114"
   )
   @Export("newIterableNodeHashTable")
   IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
      return new IterableNodeHashTable[var1];
   }
}
