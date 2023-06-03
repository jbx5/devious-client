import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("MenuAction")
public class MenuAction {
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("Widget_spritesArchive")
   public static AbstractArchive Widget_spritesArchive;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1834340331
   )
   @Export("param0")
   int param0;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -159980401
   )
   @Export("param1")
   int param1;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1577768295
   )
   @Export("opcode")
   int opcode;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 2012852551
   )
   @Export("identifier")
   int identifier;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1845635199
   )
   @Export("itemId")
   int itemId;
   @ObfuscatedName("ap")
   @Export("action")
   String action;
   @ObfuscatedName("ab")
   @Export("target")
   String target;

   MenuAction() {
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1739019735"
   )
   public static int method2055() {
      return ++MouseHandler.MouseHandler_idleCycles - 1;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Lmb;I)I",
      garbageValue = "-282518364"
   )
   static int method2056(Widget var0) {
      if (var0.type != 11) {
         --class149.Interpreter_stringStackSize;
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
         return 1;
      } else {
         String var1 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var0.method6371(var1);
         return 1;
      }
   }
}
