import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("fo")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements MouseWheel {

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lfo;")
	field1898(1, 0),
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lfo;")
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(0, 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lfo;")
	field1895(2, 2);
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -682238819)
	@Export("value")
	public final int value;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 928621237)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "104")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("eu")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-943359452")
	static final void method3399() {
		if (class4.field13) {
			for (int var0 = 0; var0 < Players.Players_count; ++var0) {
				Player var1 = Client.players[Players.Players_indices[var0]];
				var1.method2134();
			}
			class4.field13 = false;
		}
	}
}