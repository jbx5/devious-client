import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1608214613
	)
	static int field1529;
	@ObfuscatedName("ak")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lso;Lso;I)I",
		garbageValue = "-563542583"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "487878865"
	)
	static void method3016() {
		class197.Tiles_underlays = null;
		Tiles.Tiles_overlays = null;
		class253.Tiles_shapes = null;
		AbstractByteArrayCopier.field3975 = null;
		SongTask.field4795 = null;
		class202.Tiles_underlays2 = null;
		class17.field84 = null;
		ParamComposition.Tiles_hue = null;
		class194.Tiles_saturation = null;
		Tiles.Tiles_lightness = null;
		class131.Tiles_hueMultiplier = null;
		Tiles.field1050 = null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-166924155"
	)
	static final int method3021(int var0, int var1) {
		int var2 = var0 + var1 * 57;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(Ldn;I)V",
		garbageValue = "-257555905"
	)
	static void method3020(class94 var0) {
		if (Client.field561 != var0) {
			Client.field561 = var0;
		}
	}
}
