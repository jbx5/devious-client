import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
public class class230 {
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	static ClanSettings field2798;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lky;",
		garbageValue = "1434847927"
	)
	public static class310[] method5026() {
		return new class310[]{class310.field3982, class310.field3981, class310.field3980, class310.field3979}; // L: 15
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "80"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 146
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "547469381"
	)
	static final void method5028() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 11931
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 11932
			var1.method2278(); // L: 11933
		}

	} // L: 11935
}
