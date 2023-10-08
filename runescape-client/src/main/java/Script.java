import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("ay")
	static int[] field1008;
	@ObfuscatedName("al")
	String field1004;
	@ObfuscatedName("ak")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("ax")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("ao")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1799598971
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1300060503
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1220003295
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1530472731
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Ltp;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)[Ltp;",
		garbageValue = "-902364502"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1816632175"
	)
	static void method2215(boolean var0) {
		if (var0) {
			class74.method2113();
		} else {
			for (int var1 = 0; var1 < class319.musicSongs.size(); ++var1) {
				MusicSong var2 = (MusicSong)class319.musicSongs.get(var1);
				if (var2 == null) {
					class319.musicSongs.remove(var1);
					--var1;
				} else if (var2.field3550) {
					if (var2.midiPcmStream.field3450 > 0) {
						--var2.midiPcmStream.field3450;
					}

					var2.midiPcmStream.clear();
					var2.midiPcmStream.method6044();
					var2.midiPcmStream.setPcmStreamVolume(0);
					class319.musicSongs.remove(var1);
					--var1;
				} else {
					var2.field3550 = true;
				}
			}
		}

	}
}
