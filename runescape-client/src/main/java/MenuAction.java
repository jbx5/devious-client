import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bs")
@Implements("MenuAction")
public class MenuAction {
   @ObfuscatedName("o")
   static int[] field905;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -141315481
   )
   @Export("param0")
   int param0;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1655196773
   )
   @Export("param1")
   int param1;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1646933843
   )
   @Export("opcode")
   int opcode;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1741699979
   )
   @Export("identifier")
   int identifier;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 799690807
   )
   @Export("itemId")
   int itemId;
   @ObfuscatedName("q")
   @Export("action")
   String action;
   @ObfuscatedName("f")
   @Export("target")
   String target;

   MenuAction() {
   }
}
