import java.util.ArrayList;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
@Implements("ConcurrentMidiTask")
public class ConcurrentMidiTask extends SongTask {
	@ObfuscatedName("aq")
	ArrayList field4631;

	@ObfuscatedSignature(
		descriptor = "(Lqe;Ljava/util/ArrayList;)V"
	)
	public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
		super(var1);
		this.field4631 = var2;
		super.field4627 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	public boolean vmethod8043() {
		for (int var1 = 0; var1 < this.field4631.size(); ++var1) {
			SongTask var2 = (SongTask)this.field4631.get(var1);
			if (var2 == null) {
				this.field4631.remove(var1);
				--var1;
			} else if (var2.vmethod8043()) {
				if (var2.method8013()) {
					this.method8017(var2.method8015());
					this.field4631.clear();
					return true;
				}

				if (var2.method8016() != null) {
					this.field4631.add(var2.method8016());
				}

				super.field4630 = var2.field4630;
				this.field4631.remove(var1);
				--var1;
			}
		}

		if (this.field4631.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
