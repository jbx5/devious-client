import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("Interpreter")
public class Interpreter {
   @ObfuscatedName("tp")
   @ObfuscatedSignature(
      descriptor = "Lbd;"
   )
   @Export("pcmPlayer0")
   static PcmPlayer pcmPlayer0;
   @ObfuscatedName("ab")
   @Export("Interpreter_intLocals")
   static int[] Interpreter_intLocals;
   @ObfuscatedName("an")
   @Export("Interpreter_stringLocals")
   static String[] Interpreter_stringLocals;
   @ObfuscatedName("ao")
   @Export("Interpreter_arrayLengths")
   static int[] Interpreter_arrayLengths = new int[5];
   @ObfuscatedName("av")
   @Export("Interpreter_arrays")
   static int[][] Interpreter_arrays = new int[5][5000];
   @ObfuscatedName("aq")
   @Export("Interpreter_intStack")
   static int[] Interpreter_intStack = new int[1000];
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 295942057
   )
   @Export("Interpreter_intStackSize")
   static int Interpreter_intStackSize;
   @ObfuscatedName("ar")
   @Export("Interpreter_stringStack")
   static String[] Interpreter_stringStack = new String[1000];
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1716844447
   )
   @Export("Interpreter_frameDepth")
   static int Interpreter_frameDepth = 0;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "[Lcd;"
   )
   @Export("Interpreter_frames")
   static ScriptFrame[] Interpreter_frames = new ScriptFrame[50];
   @ObfuscatedName("ay")
   static int[] field840;
   @ObfuscatedName("ag")
   @Export("Interpreter_calendar")
   static java.util.Calendar Interpreter_calendar = java.util.Calendar.getInstance();
   @ObfuscatedName("at")
   @Export("Interpreter_MONTHS")
   static final String[] Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
   @ObfuscatedName("ai")
   static boolean field835 = false;
   @ObfuscatedName("aw")
   static boolean field836 = false;
   @ObfuscatedName("aa")
   static ArrayList field837 = new ArrayList();
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 1582577225
   )
   static int field838 = 0;
   @ObfuscatedName("bo")
   static final double field839 = Math.log(2.0);
   @ObfuscatedName("ix")
   @ObfuscatedGetter(
      intValue = 1340082839
   )
   static int field844;

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "732600151"
   )
   static boolean method2027(char var0) {
      for(int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var1) {
         if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var1)) {
            return true;
         }
      }

      return false;
   }
}
