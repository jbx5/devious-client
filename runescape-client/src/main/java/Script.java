import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("aw")
	String field1002;
	@ObfuscatedName("ak")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("aj")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("ai")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1180786261
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 184594585
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 256793603
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 9671493
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lum;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IS)[Lum;",
		garbageValue = "17760"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("ak")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class421.base37Table[(int)(var6 - var0 * 37L)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1984554171"
	)
	static void method2454(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}
}
