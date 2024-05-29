import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
public class class329 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	public static AbstractArchive field3586;
	@ObfuscatedName("az")
	public static ArrayList field3577;
	@ObfuscatedName("af")
	public static LinkedList field3576;
	@ObfuscatedName("aa")
	@Export("musicSongs")
	public static ArrayList musicSongs;
	@ObfuscatedName("at")
	public static ArrayList field3579;
	@ObfuscatedName("ab")
	public static ArrayList field3581;
	@ObfuscatedName("ac")
	public static final List field3582;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1205264695
	)
	@Export("musicPlayerStatus")
	static int musicPlayerStatus;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -442404381
	)
	static int field3584;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -889756167
	)
	static int field3585;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -405285165
	)
	static int field3580;

	static {
		field3577 = null;
		field3576 = new LinkedList();
		musicSongs = new ArrayList(3);
		field3579 = new ArrayList(3);
		field3581 = new ArrayList();
		field3582 = new ArrayList();
		musicPlayerStatus = 0;
		field3584 = 0;
		field3585 = 0;
		field3580 = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(CLpl;B)I",
		garbageValue = "-61"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)I",
		garbageValue = "-1593981666"
	)
	static int method6253(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_stringStack[class166.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
			Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var0.method6933(var1);
			return 1;
		}
	}
}
