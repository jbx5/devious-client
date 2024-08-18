import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2074702389
	)
	@Export("z")
	int z;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1418102753
	)
	@Export("x")
	int x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 829168125
	)
	@Export("y")
	int y;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = -3446861712907049611L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -665692657
	)
	@Export("height")
	int height;

	ItemLayer() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Ljr;",
		garbageValue = "-842872547"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else if (KitDefinition.KitDefinition_archive == null) {
			return null;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2076690439"
	)
	static final void method3632() {
		for (PendingSpawn var0 = (PendingSpawn)ConcurrentMidiTask.topLevelWorldView.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)ConcurrentMidiTask.topLevelWorldView.pendingSpawns.previous()) {
			if (var0.hitpoints == -1) {
				var0.delay = 0;
				class233.method4786(ConcurrentMidiTask.topLevelWorldView, var0);
			} else {
				var0.remove();
			}
		}

	}
}
