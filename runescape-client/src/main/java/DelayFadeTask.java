import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
@Implements("DelayFadeTask")
public class DelayFadeTask extends SongTask {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 1425121292009798795L
	)
	long field4779;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1976081777
	)
	int field4780;

	@ObfuscatedSignature(
		descriptor = "(Lrm;I)V"
	)
	public DelayFadeTask(SongTask var1, int var2) {
		super(var1);
		this.field4780 = var2;
		super.field4796 = "DelayFadeTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "734274820"
	)
	public boolean vmethod8342() {
		if (this.field4779 < (long)this.field4780) {
			++this.field4779;
			return false;
		} else {
			return true;
		}
	}
}
