import java.util.ArrayList;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rd")
@Implements("ConcurrentMidiTask")
public class ConcurrentMidiTask extends SongTask {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1834009785
	)
	public static int field4886;
	@ObfuscatedName("ap")
	ArrayList field4887;

	@ObfuscatedSignature(
		descriptor = "(Lra;Ljava/util/ArrayList;)V"
	)
	public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
		super(var1);
		this.field4887 = var2;
		super.field4881 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "343486624"
	)
	public boolean vmethod8740() {
		for (int var1 = 0; var1 < this.field4887.size(); ++var1) {
			SongTask var2 = (SongTask)this.field4887.get(var1);
			if (var2 == null) {
				this.field4887.remove(var1);
				--var1;
			} else if (var2.vmethod8740()) {
				if (var2.method8721()) {
					this.method8725(var2.method8723());
					this.field4887.clear();
					return true;
				}

				if (var2.method8724() != null) {
					this.field4887.add(var2.method8724());
				}

				super.field4885 = var2.field4885;
				this.field4887.remove(var1);
				--var1;
			}
		}

		if (this.field4887.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
