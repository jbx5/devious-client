import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qo")
@Implements("DelayFadeTask")
public class DelayFadeTask extends SongTask {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 5778479103417342563L
	)
	long field4639;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1495748279
	)
	int field4640;

	@ObfuscatedSignature(
		descriptor = "(Lqc;I)V"
	)
	public DelayFadeTask(SongTask var1, int var2) {
		super(var1);
		this.field4640 = var2;
		super.field4651 = "DelayFadeTask";
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-362428891"
	)
	public boolean vmethod7854() {
		if (this.field4639 < (long)this.field4640) {
			++this.field4639;
			return false;
		} else {
			return true;
		}
	}
}
