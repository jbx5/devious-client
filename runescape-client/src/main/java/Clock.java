import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "10"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "497587420"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(Lvf;II)V",
		garbageValue = "-371161429"
	)
	static void method4630(Buffer var0, int var1) {
		FloorOverlayDefinition.method4308(var0.array, var1);
		HitSplatDefinition.method4155(var0, var1);
	}
}
