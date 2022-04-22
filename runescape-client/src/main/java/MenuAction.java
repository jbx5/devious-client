import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("pz")
	@ObfuscatedSignature(descriptor = 
	"Lfo;")

	@Export("mouseWheel")
	static class158 mouseWheel;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-1429096249)

	@Export("param0")
	int param0;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	2131658559)

	@Export("param1")
	int param1;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	1741045209)

	@Export("opcode")
	int opcode;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-1117975603)

	@Export("identifier")
	int identifier;
	@ObfuscatedName("b")
	@Export("action")
	String action;

	MenuAction() {
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"942696763")

	static final void method1907() {
		for (PendingSpawn var0 = ((PendingSpawn) (Client.pendingSpawns.last())); var0 != null; var0 = ((PendingSpawn) (Client.pendingSpawns.previous()))) {
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
					var3 = var0.field1105;
					var4 = class146.getObjectDefinition(var2);
					if (var3 == 11) {
						var3 = 10;
					}

					if ((var3 >= 5) && (var3 <= 8)) {
						var3 = 4;
					}

					var1 = var4.method3664(var3);
					if (!var1) {
						continue;
					}
				}

				ClanChannel.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1104, var0.field1105);
				var0.remove();
			} else {
				if (var0.delay > 0) {
					--var0.delay;
				}

				if (((((var0.delay == 0) && (var0.x >= 1)) && (var0.y >= 1)) && (var0.x <= 102)) && (var0.y <= 102)) {
					if (var0.id >= 0) {
						var2 = var0.id;
						var3 = var0.field1107;
						var4 = class146.getObjectDefinition(var2);
						if (var3 == 11) {
							var3 = 10;
						}

						if ((var3 >= 5) && (var3 <= 8)) {
							var3 = 4;
						}

						var1 = var4.method3664(var3);
						if (!var1) {
							continue;
						}
					}

					ClanChannel.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.id, var0.orientation, var0.field1107);
					var0.delay = -1;
					if ((var0.id == var0.objectId) && (var0.objectId == (-1))) {
						var0.remove();
					} else if (((var0.id == var0.objectId) && (var0.orientation == var0.field1104)) && (var0.field1105 == var0.field1107)) {
						var0.remove();
					}
				}
			}
		}

	}
}