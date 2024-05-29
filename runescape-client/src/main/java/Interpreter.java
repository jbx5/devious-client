import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("az")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("aa")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("at")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("ab")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("ao")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 359682213
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lcr;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("as")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("aw")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("ai")
	static boolean field891;
	@ObfuscatedName("an")
	static boolean field895;
	@ObfuscatedName("am")
	static ArrayList field893;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -322801345
	)
	static int field901;
	@ObfuscatedName("bo")
	static final double field894;
	@ObfuscatedName("gg")
	@Export("characterId")
	static String characterId;
	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	static class67 field899;

	static {
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field891 = false;
		field895 = false;
		field893 = new ArrayList();
		field901 = 0;
		field894 = Math.log(2.0D);
	}
}
