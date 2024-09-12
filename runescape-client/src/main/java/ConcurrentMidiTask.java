import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ru")
@Implements("ConcurrentMidiTask")
public class ConcurrentMidiTask extends SongTask {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lbr;"
	)
	@Export("soundSystem")
	public static SoundSystem soundSystem;
	@ObfuscatedName("ac")
	ArrayList field4846;

	@ObfuscatedSignature(
		descriptor = "(Lri;Ljava/util/ArrayList;)V"
	)
	public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
		super(var1);
		this.field4846 = var2;
		super.field4843 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1411718299"
	)
	public boolean vmethod8618() {
		for (int var1 = 0; var1 < this.field4846.size(); ++var1) {
			SongTask var2 = (SongTask)this.field4846.get(var1);
			if (var2 == null) {
				this.field4846.remove(var1);
				--var1;
			} else if (var2.vmethod8618()) {
				if (var2.method8599()) {
					this.method8609(var2.method8601());
					this.field4846.clear();
					return true;
				}

				if (var2.method8597() != null) {
					this.field4846.add(var2.method8597());
				}

				super.field4841 = var2.field4841;
				this.field4846.remove(var1);
				--var1;
			}
		}

		if (this.field4846.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
