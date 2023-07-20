import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1900654953
	)
	public int field4648;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("ar")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lui;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4648 = (int)(class113.method2835() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1532325121"
	)
	static final void method7930() {
		Client.field637 = 0;
		int var0 = AbstractArchive.baseX * 64 + (class136.localPlayer.x >> 7);
		int var1 = class148.baseY * 64 + (class136.localPlayer.y >> 7);
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
			Client.field637 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
			Client.field637 = 1;
		}

		if (Client.field637 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
			Client.field637 = 0;
		}

	}
}
