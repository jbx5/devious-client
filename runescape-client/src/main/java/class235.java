import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
public class class235 implements Comparator {
	@ObfuscatedName("as")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -969439669
	)
	static int field2478;

	class235() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lic;Lic;B)I",
		garbageValue = "31"
	)
	int method4595(class230 var1, class230 var2) {
		return var1.method4505() - var2.method4505();
	}

	public int compare(Object var1, Object var2) {
		return this.method4595((class230)var1, (class230)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
