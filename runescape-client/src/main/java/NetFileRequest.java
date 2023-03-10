import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ns")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
   @ObfuscatedName("cf")
   @Export("otp")
   static String otp;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lmx;"
   )
   @Export("archive")
   public Archive archive;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -977723823
   )
   @Export("crc")
   public int crc;
   @ObfuscatedName("ac")
   @Export("padding")
   public byte padding;

   NetFileRequest() {
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZB)I",
      garbageValue = "81"
   )
   static int method6429(int var0, Script var1, boolean var2) {
      Widget var7;
      if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
         int var4;
         if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
            var7 = var2 ? GameObject.scriptDotWidget : SoundSystem.scriptActiveWidget;
            var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (var4 >= 1 && var4 <= 10) {
               class99 var8 = new class99(var4, var7.id, var7.childIndex, var7.itemId);
               Interpreter.field837.add(var8);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
            Interpreter.Interpreter_intStackSize -= 3;
            int var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            if (var5 >= 1 && var5 <= 10) {
               class99 var6 = new class99(var5, var3, var4, WorldMapSection1.getWidget(var3).itemId);
               Interpreter.field837.add(var6);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else {
            return 2;
         }
      } else if (Interpreter.field838 >= 10) {
         throw new RuntimeException();
      } else {
         if (var0 >= 2000) {
            var7 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         } else {
            var7 = var2 ? GameObject.scriptDotWidget : SoundSystem.scriptActiveWidget;
         }

         if (var7.onResize == null) {
            return 0;
         } else {
            ScriptEvent var9 = new ScriptEvent();
            var9.widget = var7;
            var9.args = var7.onResize;
            var9.field1051 = Interpreter.field838 + 1;
            Client.scriptEvents.addFirst(var9);
            return 1;
         }
      }
   }
}
