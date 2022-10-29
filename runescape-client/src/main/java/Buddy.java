import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("of")
@Implements("Buddy")
public class Buddy extends User {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1899402835
   )
   @Export("world")
   public int world = -1;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1732968995
   )
   @Export("int2")
   public int int2;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 924228175
   )
   @Export("rank")
   public int rank;

   Buddy() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "78"
   )
   @Export("set")
   void set(int var1, int var2) {
      this.world = var1;
      this.int2 = var2;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-949915725"
   )
   @Export("getWorld")
   public int getWorld() {
      return this.world;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "75"
   )
   @Export("hasWorld")
   public boolean hasWorld() {
      return this.world > 0;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "-974133059"
   )
   static int method7457(int var0, Script var1, boolean var2) {
      Widget var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
      if (var0 == ScriptOpcodes.IF_GETX) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.x;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETY) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.y;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.width;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.height;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETHIDE) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETLAYER) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.parentId;
         return 1;
      } else {
         return 2;
      }
   }
}
