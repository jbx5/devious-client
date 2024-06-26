import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qv")
@Implements("DelayFadeTask")
public class DelayFadeTask extends SongTask {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 4526152563025374107L
	)
	long field4803;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1559573617
	)
	int field4802;

	@ObfuscatedSignature(
		descriptor = "(Lro;I)V"
	)
	public DelayFadeTask(SongTask var1, int var2) {
		super(var1);
		this.field4802 = var2;
		super.field4814 = "DelayFadeTask";
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-4307"
	)
	public boolean vmethod8276() {
		if (this.field4803 < (long)this.field4802) {
			++this.field4803;
			return false;
		} else {
			return true;
		}
	}
}
