import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qb")
@Implements("DelayFadeTask")
public class DelayFadeTask extends SongTask {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -8570152430470197323L
	)
	long field4564;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2113605799
	)
	int field4565;

	@ObfuscatedSignature(
		descriptor = "(Lqm;I)V"
	)
	public DelayFadeTask(SongTask var1, int var2) {
		super(var1);
		this.field4565 = var2;
		super.field4572 = "DelayFadeTask";
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-90"
	)
	public boolean vmethod7780() {
		if (this.field4564 < (long)this.field4565) {
			++this.field4564;
			return false;
		} else {
			return true;
		}
	}
}
