import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("wy")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1540240627
	)
	int field3515;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	MusicPatchNode2 field3501;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1065633041
	)
	int field3502;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1611842951
	)
	int field3517;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 371189119
	)
	int field3504;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1080286365
	)
	int field3505;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1134421179
	)
	int field3506;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -768142839
	)
	int field3507;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1635846053
	)
	int field3508;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -533246336
	)
	int field3509;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -729175597
	)
	int field3510;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1780473655
	)
	int field3511;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2127091813
	)
	int field3498;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 355540575
	)
	int field3519;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -959212405
	)
	int field3512;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 197759769
	)
	int field3503;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2058879221
	)
	int field3513;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1940413113
	)
	int field3516;

	MusicPatchNode() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "94"
	)
	void method6239() {
		this.table = null;
		this.rawSound = null;
		this.field3501 = null;
		this.stream = null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "666285399"
	)
	public static int method6238(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}
}
