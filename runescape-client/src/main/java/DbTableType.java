import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pt")
@Implements("DbTableType")
public class DbTableType extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	static AbstractArchive field4708;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("DBTableType_cache")
	static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("f")
	@Export("types")
	public int[][] types;
	@ObfuscatedName("n")
	@Export("defaultValues")
	public Object[][] defaultValues;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	DbTableType() {
	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "18"
	)
	void method7808(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.method7814(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lqq;IB)V",
		garbageValue = "-37"
	)
	void method7814(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			int var3 = var1.readUnsignedByte(); // L: 43
			if (this.types == null) { // L: 44
				this.types = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 45 46 58
				int var5 = var4 & 127; // L: 47
				boolean var6 = (var4 & 128) != 0; // L: 48
				int[] var7 = new int[var1.readUnsignedByte()]; // L: 49

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 50
					var7[var8] = var1.readUShortSmart(); // L: 51
				}

				this.types[var5] = var7; // L: 53
				if (var6) { // L: 54
					if (this.defaultValues == null) {
						this.defaultValues = new Object[this.types.length][]; // L: 55
					}

					this.defaultValues[var5] = class358.method6730(var1, var7); // L: 56
				}
			}
		}

	} // L: 62

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "59"
	)
	void method7809() {
	} // L: 64

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)[Lkj;",
		garbageValue = "2"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field3996, PlayerType.PlayerType_ultimateIronman, PlayerType.field3998, PlayerType.field3992, PlayerType.PlayerType_normal, PlayerType.field3999, PlayerType.PlayerType_ironman, PlayerType.field3993, PlayerType.field3988, PlayerType.field3990, PlayerType.PlayerType_playerModerator, PlayerType.field3994, PlayerType.field3986, PlayerType.PlayerType_jagexModerator, PlayerType.field3995, PlayerType.PlayerType_hardcoreIronman}; // L: 29
	}
}
