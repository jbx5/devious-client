import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("w")
	static final int[] field2024;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1302830563
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1459980671
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 225583661
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -639426979
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
		field2024 = new int[32]; // L: 15
		int var0 = 2; // L: 18

		for (int var1 = 0; var1 < 32; ++var1) { // L: 19
			field2024[var1] = var0 - 1; // L: 20
			var0 += var0; // L: 21
		}

	} // L: 23

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;S)V",
		garbageValue = "-1765"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 27
			if (var2 == 0) { // L: 28
				return; // L: 31
			}

			this.decodeNext(var1, var2); // L: 29
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lqq;IB)V",
		garbageValue = "1"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 34
			this.baseVar = var1.readUnsignedShort(); // L: 35
			this.startBit = var1.readUnsignedByte(); // L: 36
			this.endBit = var1.readUnsignedByte(); // L: 37
		}

	} // L: 40

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "657760700"
	)
	public static int method3709(int var0) {
		return class403.field4482[var0 & 16383]; // L: 33
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqq;IIIIIII)V",
		garbageValue = "1696618230"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 169
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 170

			while (true) {
				var7 = var0.readUnsignedByte(); // L: 172
				if (var7 == 0) { // L: 173
					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -MouseRecorder.method2252(932731 + var2 + var4, var5 + var3 + 556238) * 8; // L: 174
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 175
					}
					break;
				}

				if (var7 == 1) { // L: 178
					int var8 = var0.readUnsignedByte(); // L: 179
					if (var8 == 1) { // L: 180
						var8 = 0;
					}

					if (var1 == 0) { // L: 181
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 182
					}
					break;
				}

				if (var7 <= 49) { // L: 185
					class294.Tiles_overlays[var1][var2][var3] = var0.readByte(); // L: 186
					Tiles.Tiles_shapes[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 187
					Tiles.field1001[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 188
				} else if (var7 <= 81) { // L: 191
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 192
				} else {
					class152.Tiles_underlays[var1][var2][var3] = (byte)(var7 - 81); // L: 195
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedByte(); // L: 200
				if (var7 == 0) { // L: 201
					break;
				}

				if (var7 == 1) { // L: 202
					var0.readUnsignedByte(); // L: 203
					break;
				}

				if (var7 <= 49) { // L: 206
					var0.readUnsignedByte();
				}
			}
		}

	} // L: 209
}
