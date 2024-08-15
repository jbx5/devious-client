import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 132730433
	)
	int field3652;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	MusicPatchNode2 field3655;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1785827303
	)
	int field3650;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1662510391
	)
	int field3657;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -981115785
	)
	int field3647;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1931338823
	)
	int field3649;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1076438447
	)
	int field3654;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1790268709
	)
	int field3662;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -30834329
	)
	int field3656;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 672828565
	)
	int field3646;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 602682667
	)
	int field3665;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1927625706
	)
	int field3659;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1580281925
	)
	int field3660;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1898545899
	)
	int field3661;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1290670467
	)
	int field3653;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1059375611
	)
	int field3663;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -458933961
	)
	int field3651;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1425788947
	)
	int field3666;

	MusicPatchNode() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-39"
	)
	void method6470() {
		this.table = null;
		this.rawSound = null;
		this.field3655 = null;
		this.stream = null;
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(Ljt;IIZI)V",
		garbageValue = "-2125897796"
	)
	static void method6473(Sound var0, int var1, int var2, boolean var3) {
		if (var0 != null) {
			if (var0.field2727 == 0) {
				if (!var3) {
					return;
				}

				Client.soundLocations[Client.soundEffectCount] = 0;
			} else {
				int var4 = (var1 - 64) / 128;
				int var5 = (var2 - 64) / 128;
				Client.soundLocations[Client.soundEffectCount] = (var5 << 8) + var0.field2727 + (var4 << 16);
			}

			Client.soundEffectIds[Client.soundEffectCount] = var0.field2725;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var0.field2724;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.field756[Client.soundEffectCount] = var0.field2726;
			++Client.soundEffectCount;
		}
	}
}
