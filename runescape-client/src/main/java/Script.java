import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("Script")
public class Script extends DualNode {
   @ObfuscatedName("tp")
   @ObfuscatedGetter(
      intValue = 621523353
   )
   static int field1001;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("Script_cached")
   static EvictingDualNodeHashTable Script_cached = new EvictingDualNodeHashTable(128);
   @ObfuscatedName("e")
   String field990;
   @ObfuscatedName("v")
   @Export("opcodes")
   int[] opcodes;
   @ObfuscatedName("x")
   @Export("intOperands")
   int[] intOperands;
   @ObfuscatedName("m")
   @Export("stringOperands")
   String[] stringOperands;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1144522069
   )
   @Export("localIntCount")
   int localIntCount;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 506367355
   )
   @Export("localStringCount")
   int localStringCount;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1904250989
   )
   @Export("intArgumentCount")
   int intArgumentCount;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 705152755
   )
   @Export("stringArgumentCount")
   int stringArgumentCount;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "[Lql;"
   )
   @Export("switches")
   IterableNodeHashTable[] switches;

   Script() {
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(II)[Lql;",
      garbageValue = "-1776194631"
   )
   @Export("newIterableNodeHashTable")
   IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
      return new IterableNodeHashTable[var1];
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(II)Lbv;",
      garbageValue = "-1509182401"
   )
   @Export("Messages_getMessage")
   static Message Messages_getMessage(int var0) {
      return (Message)Messages.Messages_hashTable.get((long)var0);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-85"
   )
   @Export("clearItemContainer")
   static void clearItemContainer(int var0) {
      ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.ids.length; ++var2) {
            var1.ids[var2] = -1;
            var1.quantities[var2] = 0;
         }

      }
   }
}
