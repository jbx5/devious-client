import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.ArrayList;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bt")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("u")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;

	@ObfuscatedName("c")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;

	@ObfuscatedName("w")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths = new int[5];

	@ObfuscatedName("z")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays = new int[5][5000];

	@ObfuscatedName("j")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack = new int[1000];

	@ObfuscatedName("a")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack = new String[1000];

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 1952462401)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth = 0;

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "[Lba;")
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames = new ScriptFrame[50];

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -473119647)
	static int field836;

	@ObfuscatedName("k")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar = java.util.Calendar.getInstance();

	@ObfuscatedName("v")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS = new String[]{ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@ObfuscatedName("e")
	static boolean field831 = false;

	@ObfuscatedName("s")
	static boolean field840 = false;

	@ObfuscatedName("i")
	static ArrayList field841 = new ArrayList();

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 192809765)
	static int field844 = 0;

	@ObfuscatedName("aj")
	static final double field843 = Math.log(2.0);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V", garbageValue = "122")
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = ((ChatChannel) (Messages.Messages_channels.get(var0)));
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}
		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, ((long) (var5.count)));
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}
}