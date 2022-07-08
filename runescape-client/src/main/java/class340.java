import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("mb")
public class class340 {
	@ObfuscatedName("c")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 1921739385)
	static int field4138;

	static {
		cp1252AsciiExtension = new char[]{ '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(Lkb;I[B[BB)V", garbageValue = "13")
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3448 == null) {
			if (var2 == null) {
				return;
			}
			var0.field3448 = new byte[11][];
			var0.field3406 = new byte[11][];
			var0.field3450 = new int[11];
			var0.field3451 = new int[11];
		}
		var0.field3448[var1] = var2;
		if (var2 != null) {
			var0.field3498 = true;
		} else {
			var0.field3498 = false;
			for (int var4 = 0; var4 < var0.field3448.length; ++var4) {
				if (var0.field3448[var4] != null) {
					var0.field3498 = true;
					break;
				}
			}
		}
		var0.field3406[var1] = var3;
	}
}