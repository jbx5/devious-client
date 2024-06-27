import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("ad")
	String field1011;
	@ObfuscatedName("ag")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("ak")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("ap")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1746577925
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1287810367
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 63573081
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1982128447
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lth;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)[Lth;",
		garbageValue = "978095262"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-8"
	)
	@Export("setMusicVolume")
	static final void setMusicVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class105.clientPreferences.getMusicVolume()) {
			if (class105.clientPreferences.getMusicVolume() == 0 && class243.method4563()) {
				Archive var1 = class199.archive6;
				if (!class330.field3585.isEmpty()) {
					ArrayList var2 = new ArrayList();
					Iterator var3 = class330.field3585.iterator();

					while (var3.hasNext()) {
						MusicSong var4 = (MusicSong)var3.next();
						var4.field3710 = false;
						var4.field3709 = false;
						var4.field3715 = false;
						var4.field3712 = false;
						var4.musicTrackArchive = var1;
						var4.musicTrackVolume = var0;
						var4.field3704 = 0.0F;
						var2.add(var4);
					}

					FontName.method9220(var2, class330.musicPlayerStatus, class330.field3589, class330.field3590, class330.field3586, false);
				}

				Client.playingJingle = false;
			} else if (var0 == 0) {
				class137.method3187(0, 0);
				Client.playingJingle = false;
			} else {
				HttpResponse.method300(var0);
			}

			class105.clientPreferences.updateMusicVolume(var0);
		}

	}
}
