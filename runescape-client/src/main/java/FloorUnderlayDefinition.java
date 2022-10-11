import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("FloorUnderlayDefinition_archive")
	public static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1143219499
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 455972215
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1424080511
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 992744973
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1909005187
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	FloorUnderlayDefinition() {
		this.rgb = 0; // L: 12
	} // L: 18

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "383118719"
	)
	@Export("postDecode")
	void postDecode() {
		this.setHsl(this.rgb); // L: 32
	} // L: 33

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqq;IB)V",
		garbageValue = "108"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 37
			if (var3 == 0) { // L: 38
				return; // L: 41
			}

			this.decodeNext(var1, var3, var2); // L: 39
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lqq;IIB)V",
		garbageValue = "57"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 44
			this.rgb = var1.readMedium();
		}

	} // L: 46

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-33"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 49
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 50
		double var6 = (double)(var1 & 255) / 256.0D; // L: 51
		double var8 = var2; // L: 52
		if (var4 < var2) { // L: 53
			var8 = var4;
		}

		if (var6 < var8) { // L: 54
			var8 = var6;
		}

		double var10 = var2; // L: 55
		if (var4 > var2) { // L: 56
			var10 = var4;
		}

		if (var6 > var10) { // L: 57
			var10 = var6;
		}

		double var12 = 0.0D; // L: 58
		double var14 = 0.0D; // L: 59
		double var16 = (var8 + var10) / 2.0D; // L: 60
		if (var10 != var8) { // L: 61
			if (var16 < 0.5D) { // L: 62
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) { // L: 63
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) { // L: 64
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) { // L: 65
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8); // L: 66
			}
		}

		var12 /= 6.0D; // L: 68
		this.saturation = (int)(256.0D * var14); // L: 69
		this.lightness = (int)(256.0D * var16); // L: 70
		if (this.saturation < 0) { // L: 71
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 72
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 73
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 74
			this.lightness = 255;
		}

		if (var16 > 0.5D) { // L: 75
			this.hueMultiplier = (int)(512.0D * (1.0D - var16) * var14);
		} else {
			this.hueMultiplier = (int)(var14 * var16 * 512.0D); // L: 76
		}

		if (this.hueMultiplier < 1) { // L: 77
			this.hueMultiplier = 1;
		}

		this.hue = (int)((double)this.hueMultiplier * var12); // L: 78
	} // L: 79

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llv;Llv;ZLmv;I)V",
		garbageValue = "2014001805"
	)
	public static void method3700(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		ItemComposition.ItemDefinition_archive = var0; // L: 84
		ItemComposition.ItemDefinition_modelArchive = var1; // L: 85
		class17.ItemDefinition_inMembersWorld = var2; // L: 86
		ItemComposition.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10); // L: 87
		class296.ItemDefinition_fontPlain11 = var3; // L: 88
	} // L: 89

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "689180237"
	)
	static final void method3692() {
		int var0 = Players.Players_count; // L: 3836
		int[] var1 = Players.Players_indices; // L: 3837

		for (int var2 = 0; var2 < var0; ++var2) { // L: 3838
			Player var3 = Client.players[var1[var2]]; // L: 3839
			if (var3 != null) { // L: 3840
				ClientPreferences.updateActorSequence(var3, 1); // L: 3841
			}
		}

	} // L: 3844
}
