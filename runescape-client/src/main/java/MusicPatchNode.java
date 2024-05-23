import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1505215401
	)
	int field3666;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lbr;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	MusicPatchNode2 field3665;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1927746767
	)
	int field3664;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1457269447
	)
	int field3668;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1435885311
	)
	int field3681;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1521106279
	)
	int field3669;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2043099973
	)
	int field3679;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 253167265
	)
	int field3667;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1615903851
	)
	int field3672;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1449132032
	)
	int field3670;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1482273737
	)
	int field3674;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 758523246
	)
	int field3680;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1684840621
	)
	int field3676;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 462063411
	)
	int field3677;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1166177967
	)
	int field3678;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -972526279
	)
	int field3675;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2014877643
	)
	int field3662;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2026374001
	)
	int field3682;

	MusicPatchNode() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1908529730"
	)
	void method6478() {
		this.table = null;
		this.rawSound = null;
		this.field3665 = null;
		this.stream = null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "0"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + UrlRequest.charToByteCp1252(var0.charAt(var3));
		}

		return var2;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "117"
	)
	public static int method6481(String var0) {
		return var0.length() + 2;
	}
}
