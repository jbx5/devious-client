import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("ab")
	@Export("ViewportMouse_isInViewport")
	static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -196970013
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1395437043
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("au")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1763385899
	)
	static int field2233;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1190552303
	)
	static int field2234;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1988776379
	)
	static int field2237;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1244756389
	)
	static int field2244;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 2031101489
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("aw")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;
	@ObfuscatedName("bc")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;

	static {
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "524686253"
	)
	public static void method4375() {
		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var0 = 0; var0 < JagexCache.field2352; ++var0) {
				ItemContainer.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZI)I",
		garbageValue = "825294897"
	)
	static int method4376(int var0, Script var1, boolean var2) {
		if (var0 == 6754) {
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			NPCComposition var6 = UserComparator8.getNpcDefinition(var5);
			Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : "";
			return 1;
		} else {
			NPCComposition var3;
			if (var0 == 6764) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = UserComparator8.getNpcDefinition(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
				int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method4925(var4);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method4927(var4);
				return 1;
			} else if (var0 == 6765) {
				var3 = UserComparator8.getNpcDefinition(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}
}
