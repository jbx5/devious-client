import java.util.ArrayList;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
@Implements("ConcurrentMidiTask")
public class ConcurrentMidiTask extends SongTask {
	@ObfuscatedName("at")
	ArrayList field4559;

	@ObfuscatedSignature(
		descriptor = "(Lql;Ljava/util/ArrayList;)V"
	)
	public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
		super(var1);
		this.field4559 = var2;
		super.field4552 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-799935345"
	)
	public boolean vmethod7858() {
		for (int var1 = 0; var1 < this.field4559.size(); ++var1) {
			SongTask var2 = (SongTask)this.field4559.get(var1);
			if (var2 == null) {
				this.field4559.remove(var1);
				--var1;
			} else if (var2.vmethod7858()) {
				if (var2.method7842()) {
					this.method7840(var2.method7834());
					this.field4559.clear();
					return true;
				}

				if (var2.method7839() != null) {
					this.field4559.add(var2.method7839());
				}

				super.field4555 = var2.field4555;
				this.field4559.remove(var1);
				--var1;
			}
		}

		if (this.field4559.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
