import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qp")
@Implements("DefaultsGroup")
public class DefaultsGroup {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lqp;"
   )
   static final DefaultsGroup field4635 = new DefaultsGroup(3);
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 595484225
   )
   @Export("group")
   final int group;

   DefaultsGroup(int var1) {
      this.group = var1;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZI)I",
      garbageValue = "1228806354"
   )
   static int method8080(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
      if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
         if (var3.itemId != -1) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
         } else {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETID) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.childIndex;
         return 1;
      } else if (var0 == 1707) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6382() ? 1 : 0;
         return 1;
      } else if (var0 == 1708) {
         return BufferedSource.method8029(var3);
      } else {
         return var0 == 1709 ? class4.method22(var3) : 2;
      }
   }
}
