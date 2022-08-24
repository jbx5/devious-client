import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("jj")
public class class270 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-96821068")
	static final void method5154() {
		class4.method20("You can't add yourself to your own friend list");
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "46")
	static final void method5161() {
		for (PendingSpawn var0 = ((PendingSpawn) (Client.pendingSpawns.last())); var0 != null; var0 = ((PendingSpawn) (Client.pendingSpawns.previous()))) {
			if (var0.hitpoints > 0) {
				--var0.hitpoints;
			}
			if (var0.hitpoints == 0) {
				if (var0.objectId < 0 || Client.method1576(var0.objectId, var0.field1119)) {
					Frames.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1118, var0.field1119);
					var0.remove();
				}
			} else {
				if (var0.delay > 0) {
					--var0.delay;
				}
				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102 && (var0.id < 0 || Client.method1576(var0.id, var0.field1122))) {
					Frames.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.id, var0.orientation, var0.field1122);
					var0.delay = -1;
					if (var0.id == var0.objectId && var0.objectId == -1) {
						var0.remove();
					} else if (var0.id == var0.objectId && var0.field1118 == var0.orientation && var0.field1122 == var0.field1119) {
						var0.remove();
					}
				}
			}
		}
	}
}