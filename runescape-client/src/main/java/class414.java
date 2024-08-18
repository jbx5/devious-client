import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pa")
public class class414 {
	@ObfuscatedName("ab")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "[Lvb;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Ldy;Ldt;II)V",
		garbageValue = "813892221"
	)
	static void method7695(WorldView var0, Actor var1, int var2) {
		Coord var3 = var1.method2531(var0);
		class87.worldToScreen(var0, var3.x, var3.y, var1.x, var1.y, var2);
	}
}
