import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.ArrayList;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bs")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("v")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;

	@ObfuscatedName("c")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;

	@ObfuscatedName("q")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths = new int[5];

	@ObfuscatedName("i")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays = new int[5][5000];

	@ObfuscatedName("k")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack = new int[1000];

	@ObfuscatedName("n")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack = new String[1000];

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 1584311727)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth = 0;

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "[Lbu;")
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames = new ScriptFrame[50];

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "Lec;")
	static ClanChannel field826;

	@ObfuscatedName("p")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar = java.util.Calendar.getInstance();

	@ObfuscatedName("e")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS = new String[]{ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@ObfuscatedName("x")
	static boolean field820 = false;

	@ObfuscatedName("f")
	static boolean field816 = false;

	@ObfuscatedName("t")
	static ArrayList field831 = new ArrayList();

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1905581353)
	static int field830 = 0;

	@ObfuscatedName("av")
	static final double field824 = Math.log(2.0);

	@ObfuscatedName("bl")
	@ObfuscatedSignature(descriptor = "Lkt;")
	static GameBuild field834;
}