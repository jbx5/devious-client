import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
public final class class330 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 8085800780495672759L
	)
	static long field3595;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = 4340951857660502183L
	)
	static long field3596;

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lvf;[IB)[Ljava/lang/Object;",
		garbageValue = "-20"
	)
	static Object[] method6427(Buffer var0, int[] var1) {
		int var2 = var0.readUShortSmart();
		Object[] var3 = new Object[var1.length * var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			for (int var5 = 0; var5 < var1.length; ++var5) {
				int var6 = var1.length * var4 + var5;
				class537 var7 = LoginScreenAnimation.method2733(var1[var5]);
				var3[var6] = var7.method9761(var0);
			}
		}

		return var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1739114137"
	)
	public static void method6424() {
		DbRowType.DBRowType_cache.clear();
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(Ldd;I)V",
		garbageValue = "1684501395"
	)
	static final void method6428(WorldView var0) {
		for (PendingSpawn var1 = (PendingSpawn)var0.pendingSpawns.last(); var1 != null; var1 = (PendingSpawn)var0.pendingSpawns.previous()) {
			if (var1.hitpoints > 0) {
				--var1.hitpoints;
			}

			if (var1.hitpoints == 0) {
				if (var1.objectId < 0 || class142.method3388(var1.objectId, var1.field1211)) {
					class416.addPendingSpawnToScene(var0, var1.plane, var1.type, var1.x, var1.y, var1.objectId, var1.field1210, var1.field1211, var1.field1221);
					var1.remove();
				}
			} else {
				if (var1.delay > 0) {
					--var1.delay;
				}

				if (var1.delay == 0 && var1.x >= 1 && var1.y >= 1 && var1.x <= 102 && var1.y <= 102 && (var1.field1215 < 0 || class142.method3388(var1.field1215, var1.field1214))) {
					class416.addPendingSpawnToScene(var0, var1.plane, var1.type, var1.x, var1.y, var1.field1215, var1.field1212, var1.field1214, var1.field1221);
					var1.delay = -1;
					if (var1.field1215 == var1.objectId && var1.objectId == -1) {
						var1.remove();
					} else if (var1.objectId == var1.field1215 && var1.field1212 == var1.field1210 && var1.field1211 == var1.field1214) {
						var1.remove();
					}
				}
			}
		}

	}
}
