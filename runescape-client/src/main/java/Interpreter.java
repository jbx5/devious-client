import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("ai")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("ay")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("as")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("ae")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("at")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -665162235
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lcu;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1199271129
	)
	static int field862;
	@ObfuscatedName("ad")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("ac")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("ax")
	static boolean field855;
	@ObfuscatedName("aq")
	static boolean field863;
	@ObfuscatedName("al")
	static ArrayList field857;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1233505853
	)
	static int field865;
	@ObfuscatedName("bv")
	static final double field866;
	@ObfuscatedName("vz")
	@ObfuscatedGetter(
		longValue = -6231841873716725333L
	)
	static long field868;

	static {
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field855 = false;
		field863 = false;
		field857 = new ArrayList();
		field865 = 0;
		field866 = Math.log(2.0D);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2039454866"
	)
	static void method2198(int var0) {
		class6.updateLoginIndex(14);
		Login.Login_banType = var0;
	}
}
