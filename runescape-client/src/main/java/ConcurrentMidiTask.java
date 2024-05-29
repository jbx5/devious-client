import java.util.ArrayList;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rs")
@Implements("ConcurrentMidiTask")
public class ConcurrentMidiTask extends SongTask {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lgo;"
	)
	static ClanChannel field4800;
	@ObfuscatedName("ak")
	ArrayList field4799;

	@ObfuscatedSignature(
		descriptor = "(Lre;Ljava/util/ArrayList;)V"
	)
	public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
		super(var1);
		this.field4799 = var2;
		super.field4793 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1230726323"
	)
	public boolean vmethod8329() {
		for (int var1 = 0; var1 < this.field4799.size(); ++var1) {
			SongTask var2 = (SongTask)this.field4799.get(var1);
			if (var2 == null) {
				this.field4799.remove(var1);
				--var1;
			} else if (var2.vmethod8329()) {
				if (var2.method8301()) {
					this.method8305(var2.method8319());
					this.field4799.clear();
					return true;
				}

				if (var2.method8304() != null) {
					this.field4799.add(var2.method8304());
				}

				super.field4798 = var2.field4798;
				this.field4799.remove(var1);
				--var1;
			}
		}

		if (this.field4799.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
