import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("ax")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("ah")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("ar")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("ab")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -527981427
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("av")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 772033927
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lcn;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	static ClanChannel field876;
	@ObfuscatedName("ai")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("ae")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("aq")
	static boolean field882;
	@ObfuscatedName("az")
	static boolean field883;
	@ObfuscatedName("at")
	static ArrayList field886;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 804295643
	)
	static int field878;
	@ObfuscatedName("by")
	static final double field884;

	static {
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field882 = false;
		field883 = false;
		field886 = new ArrayList();
		field878 = 0;
		field884 = Math.log(2.0D);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ldl;I)V",
		garbageValue = "1932379586"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		ArchiveDisk.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1205286290"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (class33.widgetDefinition.loadInterface(var0)) {
			ClientPacket.runComponentCloseListeners(class33.widgetDefinition.Widget_interfaceComponents[var0], var1);
		}
	}
}
