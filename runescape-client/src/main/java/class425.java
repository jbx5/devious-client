import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
public final class class425 implements Comparable {
	@ObfuscatedName("aw")
	Object field4624;
	@ObfuscatedName("ay")
	Object field4626;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 4590125301027778469L
	)
	long field4625;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = 1155107975407069413L
	)
	long field4623;

	class425(Object var1, Object var2) {
		this.field4624 = var1;
		this.field4626 = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)I",
		garbageValue = "1914660180"
	)
	int method7859(class425 var1) {
		if (this.field4623 < var1.field4623) {
			return -1;
		} else {
			return this.field4623 > var1.field4623 ? 1 : 0;
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class425) {
			return this.field4626.equals(((class425)var1).field4626);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int hashCode() {
		return this.field4626.hashCode();
	}

	public int compareTo(Object var1) {
		return this.method7859((class425)var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "686402889"
	)
	static int method7864() {
		return ++Messages.Messages_count - 1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)[Lhl;",
		garbageValue = "215"
	)
	static VerticalAlignment[] method7863() {
		return new VerticalAlignment[]{VerticalAlignment.field2046, VerticalAlignment.field2045, VerticalAlignment.VerticalAlignment_centered};
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lnd;IB)V",
		garbageValue = "-49"
	)
	static void method7865(AbstractArchive var0, int var1) {
		if ((var1 & 536870912) != 0) {
			Login.logoSprite = class451.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", "");
		} else if ((var1 & 1073741824) != 0) {
			Login.logoSprite = class451.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", "");
		} else if ((var1 & 256) != 0) {
			Login.logoSprite = class451.SpriteBuffer_getIndexedSpriteByName(var0, "logo_speedrunning", "");
		} else {
			Login.logoSprite = class451.SpriteBuffer_getIndexedSpriteByName(var0, "logo", "");
		}

	}
}
