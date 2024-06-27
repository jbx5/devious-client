import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ph")
public class class399 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	static final class399 field4616;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	static final class399 field4613;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	static final class399 field4615;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	static final class399 field4614;

	static {
		field4616 = new class399();
		field4613 = new class399();
		field4615 = new class399();
		field4614 = new class399();
	}

	class399() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)Lix;",
		garbageValue = "19468"
	)
	public static Clock method7401() {
		try {
			return new NanoClock();
		} catch (Throwable var1) {
			return new MilliClock();
		}
	}
}
