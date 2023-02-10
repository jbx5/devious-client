import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("Interpreter")
public class Interpreter {
   @ObfuscatedName("s")
   @Export("Interpreter_intLocals")
   static int[] Interpreter_intLocals;
   @ObfuscatedName("j")
   @Export("Interpreter_arrayLengths")
   static int[] Interpreter_arrayLengths = new int[5];
   @ObfuscatedName("i")
   @Export("Interpreter_arrays")
   static int[][] Interpreter_arrays = new int[5][5000];
   @ObfuscatedName("n")
   @Export("Interpreter_intStack")
   static int[] Interpreter_intStack = new int[1000];
   @ObfuscatedName("k")
   @Export("Interpreter_stringStack")
   static String[] Interpreter_stringStack = new String[1000];
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 371814983
   )
   @Export("Interpreter_frameDepth")
   static int Interpreter_frameDepth = 0;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "[Lbl;"
   )
   @Export("Interpreter_frames")
   static ScriptFrame[] Interpreter_frames = new ScriptFrame[50];
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "Lkz;"
   )
   @Export("scriptDotWidget")
   static Widget scriptDotWidget;
   @ObfuscatedName("u")
   @Export("Interpreter_calendar")
   static java.util.Calendar Interpreter_calendar = java.util.Calendar.getInstance();
   @ObfuscatedName("x")
   @Export("Interpreter_MONTHS")
   static final String[] Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
   @ObfuscatedName("q")
   static boolean field851 = false;
   @ObfuscatedName("d")
   static boolean field866 = false;
   @ObfuscatedName("e")
   static ArrayList field864 = new ArrayList();
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 555404067
   )
   static int field861 = 0;
   @ObfuscatedName("ai")
   static final double field862 = Math.log(2.0);
}
