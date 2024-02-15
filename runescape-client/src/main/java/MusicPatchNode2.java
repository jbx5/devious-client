import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("aq")
	byte[] field3467;
	@ObfuscatedName("aw")
	byte[] field3466;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1546619593
	)
	int field3465;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 955065725
	)
	int field3468;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2123728519
	)
	int field3469;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1834353121
	)
	int field3470;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1077628681
	)
	int field3471;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 349360921
	)
	int field3472;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1864429963
	)
	int field3473;

	MusicPatchNode2() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;ZI)V",
		garbageValue = "-822937371"
	)
	static void method6109(ArrayList var0, boolean var1) {
		if (!var1) {
			class321.field3484.clear();
		}

		Iterator var2 = var0.iterator();

		while (var2.hasNext()) {
			MusicSong var3 = (MusicSong)var2.next();
			if (var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
				if (!var1) {
					class321.field3484.add(var3);
				}

				class321.field3478.add(var3);
			}
		}

	}
}
