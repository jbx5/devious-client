import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pz")
final class class433 implements class430 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lqq;S)V",
		garbageValue = "1113"
	)
	public void vmethod7796(Object var1, Buffer var2) {
		this.method7764((Long)var1, var2);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)Ljava/lang/Object;",
		garbageValue = "298261584"
	)
	public Object vmethod7802(Buffer var1) {
		return var1.readLong(); // L: 31
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lqq;I)V",
		garbageValue = "1599673002"
	)
	void method7764(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "-1484374902"
	)
	@Export("sortItemsByName")
	static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 13
			int var4 = (var3 + var2) / 2; // L: 14
			int var5 = var2; // L: 15
			String var6 = var0[var4]; // L: 16
			var0[var4] = var0[var3]; // L: 17
			var0[var3] = var6; // L: 18
			short var7 = var1[var4]; // L: 19
			var1[var4] = var1[var3]; // L: 20
			var1[var3] = var7; // L: 21

			for (int var8 = var2; var8 < var3; ++var8) { // L: 22
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 23
					String var9 = var0[var8]; // L: 24
					var0[var8] = var0[var5]; // L: 25
					var0[var5] = var9; // L: 26
					short var10 = var1[var8]; // L: 27
					var1[var8] = var1[var5]; // L: 28
					var1[var5++] = var10; // L: 29
				}
			}

			var0[var3] = var0[var5]; // L: 33
			var0[var5] = var6; // L: 34
			var1[var3] = var1[var5]; // L: 35
			var1[var5] = var7; // L: 36
			sortItemsByName(var0, var1, var2, var5 - 1); // L: 37
			sortItemsByName(var0, var1, var5 + 1, var3); // L: 38
		}

	} // L: 40
}
