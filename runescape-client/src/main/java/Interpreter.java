import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("n")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("k")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("w")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("s")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("q")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2002811679
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("x")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1936721537
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Lbi;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("l")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("e")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("y")
	static boolean field843;
	@ObfuscatedName("i")
	static boolean field833;
	@ObfuscatedName("r")
	static ArrayList field848;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 178619761
	)
	static int field849;
	@ObfuscatedName("ao")
	static final double field850;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 84
		Interpreter_arrays = new int[5][5000]; // L: 85
		Interpreter_intStack = new int[1000]; // L: 86
		Interpreter_stringStack = new String[1000]; // L: 88
		Interpreter_frameDepth = 0; // L: 90
		Interpreter_frames = new ScriptFrame[50]; // L: 91
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 97
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 100
		field843 = false; // L: 103
		field833 = false; // L: 104
		field848 = new ArrayList(); // L: 105
		field849 = 0; // L: 106
		field850 = Math.log(2.0D); // L: 110
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-31238"
	)
	static final void method2011() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 11906
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 11907
			var1.clearIsFriend(); // L: 11908
		}

		Iterator var2 = Messages.Messages_hashTable.iterator(); // L: 11911

		while (var2.hasNext()) {
			Message var3 = (Message)var2.next(); // L: 11912
			var3.clearIsFromFriend(); // L: 11914
		}

		if (class145.friendsChat != null) { // L: 11918
			class145.friendsChat.clearFriends(); // L: 11919
		}

	} // L: 11921
}
