import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("ae")
	String field1014;
	@ObfuscatedName("ao")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("at")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("ac")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1597120201
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1421158661
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -395613867
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 942118187
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lsf;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)[Lsf;",
		garbageValue = "-723912201"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	public static void method2180(int var0, int var1) {
		class270.method5491(var0, var1, 0, 0);
		class305.field3405.clear();
		class305.field3406.clear();
		if (class305.musicSongs.isEmpty() || var0 == 0 && var1 == 0) {
			ByteArrayPool.method7671();
		} else {
			class305.field3406.add(new DelayFadeTask((SongTask)null, class305.musicPlayerStatus));
			class305.field3406.add(new FadeOutTask((SongTask)null, 0, false, class305.field3409));
			ArrayList var3 = new ArrayList();
			Iterator var4 = class305.musicSongs.iterator();

			while (var4.hasNext()) {
				MusicSong var5 = (MusicSong)var4.next();
				var3.add(var5);
			}

			class305.field3406.add(new class401((SongTask)null, var3));
		}

	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-69260226"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		ArchiveDisk.logOut();
		switch(var0) {
		case 1:
			class463.method8342();
			break;
		case 2:
			PcmPlayer.method838(24);
			class318.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
		}

	}
}
