import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qx")
@Implements("DelayFadeTask")
public class DelayFadeTask extends SongTask {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -5194633085651282499L
	)
	long field4615;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -677822171
	)
	int field4616;

	@ObfuscatedSignature(
		descriptor = "(Lqe;I)V"
	)
	public DelayFadeTask(SongTask var1, int var2) {
		super(var1);
		this.field4616 = var2;
		super.field4627 = "DelayFadeTask";
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	public boolean vmethod8043() {
		if (this.field4615 < (long)this.field4616) {
			++this.field4615;
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(II)Luz;",
		garbageValue = "1916440406"
	)
	static DbTable method7998(int var0) {
		DbTable var1 = (DbTable)Client.archive11.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(class150.field1703, var0);
		}

		return var1;
	}
}
