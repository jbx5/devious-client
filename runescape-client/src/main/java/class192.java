import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
public class class192 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("field1915")
	static EvictingDualNodeHashTable field1915;

	static {
		field1915 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-15"
	)
	public static int method3717(int var0) {
		class138 var1 = class90.method2315(var0);
		if (var1 == null) {
			return 2;
		} else {
			return var1.method3087() ? 0 : 1;
		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-71"
	)
	static final void method3720() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0.hitpoints > 0) {
				--var0.hitpoints;
			}

			boolean var1;
			int var2;
			int var3;
			ObjectComposition var4;
			if (var0.hitpoints == 0) {
				if (var0.objectId >= 0) {
					var2 = var0.objectId;
					var3 = var0.field1188;
					var4 = MouseRecorder.getObjectDefinition(var2);
					if (var3 == 11) {
						var3 = 10;
					}

					if (var3 >= 5 && var3 <= 8) {
						var3 = 4;
					}

					var1 = var4.method4098(var3);
					if (!var1) {
						continue;
					}
				}

				ObjectSound.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1187, var0.field1188, var0.field1192);
				var0.remove();
			} else {
				if (var0.delay > 0) {
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102) {
					if (var0.field1198 >= 0) {
						var2 = var0.field1198;
						var3 = var0.field1191;
						var4 = MouseRecorder.getObjectDefinition(var2);
						if (var3 == 11) {
							var3 = 10;
						}

						if (var3 >= 5 && var3 <= 8) {
							var3 = 4;
						}

						var1 = var4.method4098(var3);
						if (!var1) {
							continue;
						}
					}

					ObjectSound.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.field1198, var0.field1190, var0.field1191, var0.field1192);
					var0.delay = -1;
					if (var0.field1198 == var0.objectId && var0.objectId == -1) {
						var0.remove();
					} else if (var0.objectId == var0.field1198 && var0.field1190 == var0.field1187 && var0.field1191 == var0.field1188) {
						var0.remove();
					}
				}
			}
		}

	}
}
