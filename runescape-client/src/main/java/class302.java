import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
public class class302 {
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -992361699
   )
   @Export("Interpreter_intStackSize")
   static int Interpreter_intStackSize;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1366058679
   )
   public int field3465;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 2101478585
   )
   public int field3470;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1069637893
   )
   public int field3467;

   class302() {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(CB)C",
      garbageValue = "51"
   )
   static char method5863(char var0) {
      return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
   }
}
