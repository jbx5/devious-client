import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qb")
public class class432 {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IIII)V",
		garbageValue = "-1047711891"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3821 == null) {
			throw new RuntimeException();
		} else {
			var0.field3821[var1] = var2;
			var0.field3738[var1] = var3;
		}
	}
}
