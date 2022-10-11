import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
public enum class125 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1542(1, 0),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1541(3, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1536(4, 2),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1539(0, 3),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1540(2, 4);

	@ObfuscatedName("aq")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -148064907
	)
	public final int field1544;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 715952817
	)
	@Export("id")
	final int id;

	class125(int var3, int var4) {
		this.field1544 = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(Lce;B)V",
		garbageValue = "-82"
	)
	static final void method2968(Actor var0) {
		int var1 = Math.max(1, var0.field1183 - Client.cycle); // L: 4191
		int var2 = var0.field1131 * 738291136 + var0.field1192 * 128; // L: 4192
		int var3 = var0.field1131 * 738291136 + var0.field1181 * 128; // L: 4193
		var0.x += (var2 - var0.x) / var1; // L: 4194
		var0.y += (var3 - var0.y) / var1; // L: 4195
		var0.field1201 = 0; // L: 4196
		var0.orientation = var0.field1185; // L: 4197
	} // L: 4198
}
