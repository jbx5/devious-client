import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1331637163
	)
	int field3497;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	MusicPatchNode2 field3490;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 670524253
	)
	int field3503;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1947966229
	)
	int field3492;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1900320225
	)
	int field3493;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1386447781
	)
	int field3494;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1550635939
	)
	int field3491;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1426698929
	)
	int field3496;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 937704907
	)
	int field3499;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2124005376
	)
	int field3498;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -428307499
	)
	int field3505;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1260895315
	)
	int field3500;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1063512765
	)
	int field3501;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1200411245
	)
	int field3502;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1774158357
	)
	int field3487;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -50093413
	)
	int field3504;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 863924975
	)
	int field3506;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 288657113
	)
	int field3507;

	MusicPatchNode() {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-26"
	)
	void method5998() {
		this.table = null;
		this.rawSound = null;
		this.field3490 = null;
		this.stream = null;
	}
}
