import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("Interpreter")
public class Interpreter {
   @ObfuscatedName("ac")
   @Export("Interpreter_intLocals")
   static int[] Interpreter_intLocals;
   @ObfuscatedName("au")
   @Export("Interpreter_stringLocals")
   static String[] Interpreter_stringLocals;
   @ObfuscatedName("ab")
   @Export("Interpreter_arrayLengths")
   static int[] Interpreter_arrayLengths = new int[5];
   @ObfuscatedName("aq")
   @Export("Interpreter_arrays")
   static int[][] Interpreter_arrays = new int[5][5000];
   @ObfuscatedName("al")
   @Export("Interpreter_intStack")
   static int[] Interpreter_intStack = new int[1000];
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -964267539
   )
   @Export("Interpreter_intStackSize")
   static int Interpreter_intStackSize;
   @ObfuscatedName("aa")
   @Export("Interpreter_stringStack")
   static String[] Interpreter_stringStack = new String[1000];
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1968816839
   )
   @Export("Interpreter_frameDepth")
   static int Interpreter_frameDepth = 0;
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "[Lck;"
   )
   @Export("Interpreter_frames")
   static ScriptFrame[] Interpreter_frames = new ScriptFrame[50];
   @ObfuscatedName("am")
   @Export("Interpreter_calendar")
   static java.util.Calendar Interpreter_calendar = java.util.Calendar.getInstance();
   @ObfuscatedName("as")
   @Export("Interpreter_MONTHS")
   static final String[] Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
   @ObfuscatedName("ak")
   static boolean field849 = false;
   @ObfuscatedName("az")
   static boolean field853 = false;
   @ObfuscatedName("ad")
   static ArrayList field837 = new ArrayList();
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1484376709
   )
   static int field852 = 0;
   @ObfuscatedName("bi")
   static final double field851 = Math.log(2.0);

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lnm;Lnm;ZB)V",
      garbageValue = "3"
   )
   public static void method1987(AbstractArchive var0, AbstractArchive var1, boolean var2) {
      ObjectComposition.ObjectDefinition_archive = var0;
      class157.ObjectDefinition_modelsArchive = var1;
      ObjectComposition.ObjectDefinition_isLowDetail = var2;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)Lcl;",
      garbageValue = "1711407599"
   )
   @Export("getNextWorldListWorld")
   static World getNextWorldListWorld() {
      return World.World_listCount < World.World_count ? class31.World_worlds[++World.World_listCount - 1] : null;
   }
}
