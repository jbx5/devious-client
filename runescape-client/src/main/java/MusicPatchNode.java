import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "[Lnt;"
	)
	static Widget[] field3599;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -852660057
	)
	int field3590;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lbr;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	MusicPatchNode2 field3579;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 87480399
	)
	int field3580;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1451998411
	)
	int field3581;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -457870065
	)
	int field3576;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2009498693
	)
	int field3589;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1044006111
	)
	int field3583;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1170562565
	)
	int field3596;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -952204807
	)
	int field3586;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -301285376
	)
	int field3587;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1223812093
	)
	int field3588;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 491069611
	)
	int field3593;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1203991787
	)
	int field3582;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 867871950
	)
	int field3584;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 904372071
	)
	int field3592;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2089745007
	)
	int field3595;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1048714269
	)
	int field3577;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -35637821
	)
	int field3597;

	MusicPatchNode() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "344891528"
	)
	void method6225() {
		this.table = null;
		this.rawSound = null;
		this.field3579 = null;
		this.stream = null;
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "1674082536"
	)
	static void method6224(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = Client.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id && var4 == var6.quantity) {
					var6.remove();
					break;
				}
			}

			if (var5.last() == null) {
				Client.groundItems[var0][var1][var2] = null;
			}

			class477.updateItemPile(var0, var1, var2);
		}

	}
}
