import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1360491083
	)
	@Export("world")
	public int world;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 597666939
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1849484327
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1; // L: 4
	} // L: 8

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-8776"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1; // L: 11
		this.int2 = var2; // L: 12
	} // L: 13

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-99"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world; // L: 16
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1159455418"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0; // L: 20
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Z",
		garbageValue = "14"
	)
	static final boolean method6989(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 212
		Buffer var4 = new Buffer(var0); // L: 213
		int var5 = -1; // L: 214

		label69:
		while (true) {
			int var6 = var4.readIncrSmallSmart(); // L: 216
			if (var6 == 0) { // L: 217
				return var3; // L: 248
			}

			var5 += var6; // L: 218
			int var7 = 0; // L: 219
			boolean var8 = false; // L: 220

			while (true) {
				int var9;
				while (!var8) { // L: 222
					var9 = var4.readUShortSmart(); // L: 228
					if (var9 == 0) { // L: 229
						continue label69;
					}

					var7 += var9 - 1; // L: 230
					int var10 = var7 & 63; // L: 231
					int var11 = var7 >> 6 & 63; // L: 232
					int var12 = var4.readUnsignedByte() >> 2; // L: 233
					int var13 = var11 + var1; // L: 234
					int var14 = var10 + var2; // L: 235
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 236
						ObjectComposition var15 = PlayerComposition.getObjectDefinition(var5); // L: 237
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 238
							if (!var15.needsModelFiles()) { // L: 239
								++Client.field558; // L: 240
								var3 = false; // L: 241
							}

							var8 = true; // L: 243
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 223
				if (var9 == 0) { // L: 224
					break;
				}

				var4.readUnsignedByte(); // L: 225
			}
		}
	}
}
