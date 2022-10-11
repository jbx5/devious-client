import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
public class class434 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	public static final class434 field4691;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	public static final class434 field4688;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	public static final class434 field4689;
	@ObfuscatedName("h")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -113376527
	)
	public final int field4694;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1782154455
	)
	public final int field4692;
	@ObfuscatedName("w")
	public final Class field4697;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	final class430 field4693;

	static {
		field4691 = new class434(1, 0, Integer.class, new class431()); // L: 10
		field4688 = new class434(0, 1, Long.class, new class433()); // L: 24
		field4689 = new class434(2, 2, String.class, new class435()); // L: 38
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lpo;)V"
	)
	class434(int var1, int var2, Class var3, class430 var4) {
		this.field4694 = var1; // L: 62
		this.field4692 = var2;
		this.field4697 = var3;
		this.field4693 = var4;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4692; // L: 96
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)Ljava/lang/Object;",
		garbageValue = "-40"
	)
	public Object method7778(Buffer var1) {
		return this.field4693.vmethod7802(var1); // L: 100
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)[Lps;",
		garbageValue = "89"
	)
	public static class434[] method7781() {
		return new class434[]{field4688, field4691, field4689}; // L: 58
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "624482502"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 63
		int[] var3 = new int[4]; // L: 64
		var2[0] = var0; // L: 65
		var3[0] = var1; // L: 66
		int var4 = 1; // L: 67

		for (int var5 = 0; var5 < 4; ++var5) { // L: 68
			if (World.World_sortOption1[var5] != var0) { // L: 69
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}

		World.World_sortOption1 = var2; // L: 75
		World.World_sortOption2 = var3; // L: 76
		PendingSpawn.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 77
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lps;",
		garbageValue = "-749674375"
	)
	public static class434 method7787(Class var0) {
		class434[] var1 = method7781(); // L: 70

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 71
			class434 var3 = var1[var2]; // L: 72
			if (var3.field4697 == var0) {
				return var3; // L: 74
			}
		}

		return null; // L: 78
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lqq;B)V",
		garbageValue = "71"
	)
	public static void method7775(Object var0, Buffer var1) {
		Class var3 = var0.getClass(); // L: 84
		class434 var4 = method7787(var3); // L: 86
		if (var4 == null) {
			throw new IllegalArgumentException(); // L: 87
		} else {
			class430 var2 = var4.field4693; // L: 88
			var2.vmethod7796(var0, var1); // L: 91
		}
	} // L: 92

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "2055199994"
	)
	static int method7790(int var0, Script var1, boolean var2) {
		if (var0 == 6809) { // L: 4433
			int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4434
			ObjectComposition var4 = PlayerComposition.getObjectDefinition(var3); // L: 4435
			Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 4436
			return 1; // L: 4437
		} else {
			return 2; // L: 4439
		}
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1186524695"
	)
	static void method7791() {
		if (Client.oculusOrbState == 1) { // L: 12148
			Client.field586 = true; // L: 12149
		}

	} // L: 12151
}
