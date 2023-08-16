import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1984190391
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqu;I)I",
		garbageValue = "-1019476190"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lqs;I)I",
		garbageValue = "1756748027"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "44"
	)
	static final void method7992() {
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
					var3 = var0.field1186;
					var4 = WorldMapElement.getObjectDefinition(var2);
					if (var3 == 11) {
						var3 = 10;
					}

					if (var3 >= 5 && var3 <= 8) {
						var3 = 4;
					}

					var1 = var4.method3892(var3);
					if (!var1) {
						continue;
					}
				}

				WorldMap.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1185, var0.field1186, var0.field1190);
				var0.remove();
			} else {
				if (var0.delay > 0) {
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102) {
					if (var0.field1187 >= 0) {
						var2 = var0.field1187;
						var3 = var0.field1183;
						var4 = WorldMapElement.getObjectDefinition(var2);
						if (var3 == 11) {
							var3 = 10;
						}

						if (var3 >= 5 && var3 <= 8) {
							var3 = 4;
						}

						var1 = var4.method3892(var3);
						if (!var1) {
							continue;
						}
					}

					WorldMap.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.field1187, var0.field1189, var0.field1183, var0.field1190);
					var0.delay = -1;
					if (var0.field1187 == var0.objectId && var0.objectId == -1) {
						var0.remove();
					} else if (var0.field1187 == var0.objectId && var0.field1189 == var0.field1185 && var0.field1186 == var0.field1183) {
						var0.remove();
					}
				}
			}
		}

	}
}
