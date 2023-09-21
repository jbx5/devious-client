import java.util.ArrayList;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
@Implements("ConcurrentMidiTask")
public class ConcurrentMidiTask extends SongTask {
	@ObfuscatedName("ac")
	ArrayList field4579;

	@ObfuscatedSignature(
		descriptor = "(Lqm;Ljava/util/ArrayList;)V"
	)
	public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
		super(var1);
		this.field4579 = var2;
		super.field4572 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-90"
	)
	public boolean vmethod7780() {
		for (int var1 = 0; var1 < this.field4579.size(); ++var1) {
			SongTask var2 = (SongTask)this.field4579.get(var1);
			if (var2 == null) {
				this.field4579.remove(var1);
				--var1;
			} else if (var2.vmethod7780()) {
				if (var2.method7760()) {
					this.method7773(var2.method7763());
					this.field4579.clear();
					return true;
				}

				if (var2.method7764() != null) {
					this.field4579.add(var2.method7764());
				}

				super.field4573 = var2.field4573;
				this.field4579.remove(var1);
				--var1;
			}
		}

		if (this.field4579.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-495331166"
	)
	static final void method7778() {
		Client.field790 = 0;
		int var0 = class20.baseX * 64 + (TextureProvider.localPlayer.x >> 7);
		int var1 = class19.baseY * 64 + (TextureProvider.localPlayer.y >> 7);
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
			Client.field790 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
			Client.field790 = 1;
		}

		if (Client.field790 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
			Client.field790 = 0;
		}

	}
}
