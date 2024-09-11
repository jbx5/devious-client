import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rh")
@Implements("DelayFadeTask")
public class DelayFadeTask extends SongTask {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 2664804138201469369L
	)
	long field4833;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2096406071
	)
	int field4832;

	@ObfuscatedSignature(
		descriptor = "(Lri;I)V"
	)
	public DelayFadeTask(SongTask var1, int var2) {
		super(var1);
		this.field4832 = var2;
		super.field4843 = "DelayFadeTask";
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1411718299"
	)
	public boolean vmethod8618() {
		if (this.field4833 < (long)this.field4832) {
			++this.field4833;
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-1622580138"
	)
	static int method8590(int var0, Script var1, boolean var2) {
		return 2;
	}
}
