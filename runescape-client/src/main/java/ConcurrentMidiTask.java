import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rk")
@Implements("ConcurrentMidiTask")
public class ConcurrentMidiTask extends SongTask {
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = 635828803
	)
	static int field4799;
	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("topLevelWorldView")
	static WorldView topLevelWorldView;
	@ObfuscatedName("ab")
	ArrayList field4797;

	@ObfuscatedSignature(
		descriptor = "(Lrm;Ljava/util/ArrayList;)V"
	)
	public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
		super(var1);
		this.field4797 = var2;
		super.field4796 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "734274820"
	)
	public boolean vmethod8342() {
		for (int var1 = 0; var1 < this.field4797.size(); ++var1) {
			SongTask var2 = (SongTask)this.field4797.get(var1);
			if (var2 == null) {
				this.field4797.remove(var1);
				--var1;
			} else if (var2.vmethod8342()) {
				if (var2.method8321()) {
					this.method8325(var2.method8326());
					this.field4797.clear();
					return true;
				}

				if (var2.method8328() != null) {
					this.field4797.add(var2.method8328());
				}

				super.field4792 = var2.field4792;
				this.field4797.remove(var1);
				--var1;
			}
		}

		if (this.field4797.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
