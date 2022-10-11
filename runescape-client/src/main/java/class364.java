import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
public final class class364 implements Comparable {
	@ObfuscatedName("c")
	Object field4319;
	@ObfuscatedName("p")
	Object field4316;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 3059845206622440493L
	)
	long field4317;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = 373580814376708173L
	)
	long field4318;

	class364(Object var1, Object var2) {
		this.field4319 = var1; // L: 10
		this.field4316 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lns;B)I",
		garbageValue = "78"
	)
	int method6767(class364 var1) {
		if (this.field4318 < var1.field4318) {
			return -1; // L: 15
		} else {
			return this.field4318 > var1.field4318 ? 1 : 0; // L: 16 17
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class364) { // L: 22
			return this.field4316.equals(((class364)var1).field4316);
		} else {
			throw new IllegalArgumentException(); // L: 23
		}
	}

	public int hashCode() {
		return this.field4316.hashCode(); // L: 28
	}

	public int compareTo(Object var1) {
		return this.method6767((class364)var1); // L: 32
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1505950639"
	)
	static final void method6771(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) { // L: 154
			for (int var4 = 0; var4 < 8; ++var4) { // L: 155
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) { // L: 157
			for (var3 = 1; var3 < 8; ++var3) { // L: 158
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) { // L: 160
			for (var3 = 1; var3 < 8; ++var3) { // L: 161
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) { // L: 163
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) { // L: 164
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) { // L: 165
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	} // L: 166

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "13"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		ClientPreferences.method2487(); // L: 11924
		if (class145.friendsChat != null) { // L: 11925
			class145.friendsChat.invalidateIgnoreds(); // L: 11926
		}

	} // L: 11928
}
