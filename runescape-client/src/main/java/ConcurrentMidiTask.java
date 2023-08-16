import java.util.ArrayList;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
@Implements("ConcurrentMidiTask")
public class ConcurrentMidiTask extends SongTask {
	@ObfuscatedName("au")
	ArrayList field4526;

	@ObfuscatedSignature(
		descriptor = "(Lpm;Ljava/util/ArrayList;)V"
	)
	public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
		super(var1);
		this.field4526 = var2;
		super.field4523 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1604030758"
	)
	public boolean vmethod7621() {
		for (int var1 = 0; var1 < this.field4526.size(); ++var1) {
			SongTask var2 = (SongTask)this.field4526.get(var1);
			if (var2 == null) {
				this.field4526.remove(var1);
				--var1;
			} else if (var2.vmethod7621()) {
				if (var2.method7598()) {
					this.method7601(var2.method7595());
					this.field4526.clear();
					return true;
				}

				if (var2.method7600() != null) {
					this.field4526.add(var2.method7600());
				}

				super.field4525 = var2.field4525;
				this.field4526.remove(var1);
				--var1;
			}
		}

		if (this.field4526.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
