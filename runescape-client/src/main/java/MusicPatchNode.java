import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 31873403
	)
	int field3735;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	MusicPatchNode2 field3723;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1553842313
	)
	int field3732;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 986016383
	)
	int field3725;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 309887859
	)
	int field3726;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1952586833
	)
	int field3727;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1804670005
	)
	int field3720;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1377577087
	)
	int field3739;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1088488079
	)
	int field3730;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 613388073
	)
	int field3728;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1191073049
	)
	int field3737;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -817688123
	)
	int field3733;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1980728553
	)
	int field3731;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1510705435
	)
	int field3724;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 442245821
	)
	int field3736;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2042615503
	)
	int field3729;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1548873295
	)
	int field3734;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1872629797
	)
	int field3740;

	MusicPatchNode() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1882757236"
	)
	void method6816() {
		this.table = null;
		this.rawSound = null;
		this.field3723 = null;
		this.stream = null;
	}
}
