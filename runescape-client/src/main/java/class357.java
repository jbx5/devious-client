import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
public class class357 {
	@ObfuscatedName("aq")
	public static final short[] field3816;
	@ObfuscatedName("ad")
	public static final short[][] field3817;
	@ObfuscatedName("ag")
	public static final short[] field3818;
	@ObfuscatedName("ak")
	public static final short[][] field3814;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lcw;"
	)
	@Export("World_worlds")
	static World[] World_worlds;

	static {
		field3816 = new short[]{6798, 8741, 25238, 4626, 4550};
		field3817 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010, -22122, 937, 8130, -13422, 30385}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}};
		field3818 = new short[]{-10304, 9104, -1, -1, -1};
		field3814 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002, -22116, 945, 8144, -13414, 30389}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]};
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZS)I",
		garbageValue = "188"
	)
	static int method6854(int var0, Script var1, boolean var2) {
		if (var0 == 7463) {
			boolean var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
			class168.method3509(var3);
			return 1;
		} else {
			return 2;
		}
	}
}
