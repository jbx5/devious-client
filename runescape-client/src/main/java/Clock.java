import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("Clock")
public abstract class Clock {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lut;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;

	Clock() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "65280"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2123373080"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);
}
