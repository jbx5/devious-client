import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("uu")
	@ObfuscatedSignature(descriptor = 
	"Lcv;")

	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("l")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("n")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("d")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("f")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("r")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 
	-1239743013)

	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"[Lbt;")

	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("a")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("m")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("y")
	static boolean field837;
	@ObfuscatedName("z")
	static boolean field838;
	@ObfuscatedName("e")
	static ArrayList field839;
	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 
	-1884784675)

	static int field827;
	@ObfuscatedName("ay")
	static final double field842;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(descriptor = 
	"Lqx;")

	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	static 
	{
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		field837 = false;
		field838 = false;
		field839 = new ArrayList();
		field827 = 0;
		field842 = Math.log(2.0);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(IIB)V", garbageValue = 
	"8")

	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) {
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}

		World.World_sortOption1 = var2;
		World.World_sortOption2 = var3;
		WorldMapDecorationType.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}
}