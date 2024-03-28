import java.util.ArrayList;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
@Implements("ConcurrentMidiTask")
public class ConcurrentMidiTask extends SongTask {
	@ObfuscatedName("az")
	ArrayList field4659;

	@ObfuscatedSignature(
		descriptor = "(Lqc;Ljava/util/ArrayList;)V"
	)
	public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
		super(var1);
		this.field4659 = var2;
		super.field4651 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-362428891"
	)
	public boolean vmethod7854() {
		for (int var1 = 0; var1 < this.field4659.size(); ++var1) {
			SongTask var2 = (SongTask)this.field4659.get(var1);
			if (var2 == null) {
				this.field4659.remove(var1);
				--var1;
			} else if (var2.vmethod7854()) {
				if (var2.method7826()) {
					this.method7844(var2.method7842());
					this.field4659.clear();
					return true;
				}

				if (var2.method7827() != null) {
					this.field4659.add(var2.method7827());
				}

				super.field4654 = var2.field4654;
				this.field4659.remove(var1);
				--var1;
			}
		}

		if (this.field4659.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(Ldq;B)V",
		garbageValue = "57"
	)
	static void method7851(class93 var0) {
		if (Client.field540 != var0) {
			Client.field540 = var0;
		}
	}
}
