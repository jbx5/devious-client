import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
@Implements("ConcurrentMidiTask")
public class ConcurrentMidiTask extends SongTask {
	@ObfuscatedName("am")
	ArrayList field4600;

	@ObfuscatedSignature(
		descriptor = "(Lqd;Ljava/util/ArrayList;)V"
	)
	public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
		super(var1);
		this.field4600 = var2;
		super.field4597 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2012801823"
	)
	public boolean vmethod7975() {
		for (int var1 = 0; var1 < this.field4600.size(); ++var1) {
			SongTask var2 = (SongTask)this.field4600.get(var1);
			if (var2 == null) {
				this.field4600.remove(var1);
				--var1;
			} else if (var2.vmethod7975()) {
				if (var2.method7949()) {
					this.method7954(var2.method7952());
					this.field4600.clear();
					return true;
				}

				if (var2.method7953() != null) {
					this.field4600.add(var2.method7953());
				}

				super.field4594 = var2.field4594;
				this.field4600.remove(var1);
				--var1;
			}
		}

		if (this.field4600.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IS)Lgw;",
		garbageValue = "-683"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}
}
