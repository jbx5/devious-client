import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
public class class278 implements Comparator {
	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	static Task field3064;
	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;

	class278() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Lkl;B)I",
		garbageValue = "-55"
	)
	int method5846(class271 var1, class271 var2) {
		return var1.method5720() - var2.method5720();
	}

	public int compare(Object var1, Object var2) {
		return this.method5846((class271)var1, (class271)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "314070210"
	)
	public static int method5850(int var0) {
		return class507.field5149[var0 & 2047];
	}
}
