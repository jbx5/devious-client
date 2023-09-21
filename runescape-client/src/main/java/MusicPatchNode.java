import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1506147385
	)
	int field3516;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	MusicPatchNode2 field3518;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1996196471
	)
	int field3519;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1419339041
	)
	int field3520;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1753088581
	)
	int field3521;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -855974251
	)
	int field3522;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1429053681
	)
	int field3517;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 132220191
	)
	int field3529;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1820174989
	)
	int field3525;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 203101491
	)
	int field3526;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 97854413
	)
	int field3527;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1208828233
	)
	int field3528;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1094756993
	)
	int field3524;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 437050865
	)
	int field3530;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 641731471
	)
	int field3531;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1448128495
	)
	int field3534;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1312759697
	)
	int field3536;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1653152313
	)
	int field3535;

	MusicPatchNode() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "60"
	)
	void method6195() {
		this.table = null;
		this.rawSound = null;
		this.field3518 = null;
		this.stream = null;
	}
}
