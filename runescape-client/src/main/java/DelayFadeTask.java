import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
@Implements("DelayFadeTask")
public class DelayFadeTask extends SongTask {
	@ObfuscatedName("ag")
	static String[] field4514;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = -5325232572376689765L
	)
	long field4512;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 942710907
	)
	int field4513;

	@ObfuscatedSignature(
		descriptor = "(Lpm;I)V"
	)
	public DelayFadeTask(SongTask var1, int var2) {
		super(var1);
		this.field4513 = var2;
		super.field4523 = "DelayFadeTask";
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1604030758"
	)
	public boolean vmethod7621() {
		if (this.field4512 < (long)this.field4513) {
			++this.field4512;
			return false;
		} else {
			return true;
		}
	}
}
