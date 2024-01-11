import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -7190583
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -309329667
	)
	@Export("type")
	int type;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -440010209
	)
	@Export("x")
	int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 956622833
	)
	@Export("y")
	int y;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1260061589
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -284572845
	)
	int field1162;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1964960583
	)
	int field1163;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 91823357
	)
	int field1164;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2132160277
	)
	int field1157;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 427908289
	)
	int field1166;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1348057939
	)
	int field1167;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1116431321
	)
	int field1169;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1748127727
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -255769707
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1169 = 31;
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "349896774"
	)
	void method2443(int var1) {
		this.field1169 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "65280"
	)
	boolean method2442(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1169 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lnn;II)V",
		garbageValue = "300310316"
	)
	public static void method2448(Widget var0, int var1) {
		ItemComposition var2 = class341.ItemDefinition_get(var1);
		var0.field3759.equipment[var2.maleModel] = var1 + 512;
		if (var2.maleModel1 != -1) {
			var0.field3759.equipment[var2.maleModel1] = 0;
		}

		if (var2.maleModel2 != -1) {
			var0.field3759.equipment[var2.maleModel2] = 0;
		}

		var0.field3759.method6383();
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Ldf;I)V",
		garbageValue = "-469241818"
	)
	static final void method2449(Actor var0) {
		int var2;
		int var3;
		int var4;
		if (var0.targetIndex != -1) {
			Object var1 = null;
			var2 = 65536;
			if (var0.targetIndex < var2) {
				var1 = Client.npcs[var0.targetIndex];
			} else {
				var1 = Client.players[var0.targetIndex - var2];
			}

			if (var1 != null) {
				var3 = var0.x - ((Actor)var1).x;
				var4 = var0.y - ((Actor)var1).y;
				if (var3 != 0 || var4 != 0) {
					int var6 = (int)(Math.atan2((double)var3, (double)var4) * 325.94932345220167D) & 2047;
					var0.orientation = var6;
				}
			} else if (var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}
		}

		int var7;
		if (var0.pathLength == 0 || var0.field1245 > 0) {
			var7 = -1;
			if (var0.field1213 != -1 && var0.field1210 != -1) {
				var2 = var0.field1213 * 128 - HealthBarDefinition.baseX * 8192 + 64;
				var3 = var0.field1210 * 128 - WorldMapScaleHandler.baseY * 8192 + 64;
				var4 = var0.x - var2;
				int var8 = var0.y - var3;
				if (var4 != 0 || var8 != 0) {
					var7 = class189.method3782(var4, var8);
				}
			} else if (var0.field1208 != -1) {
				var7 = var0.field1208;
			}

			if (var7 != -1) {
				var0.orientation = var7;
				if (var0.field1211) {
					var0.rotation = var0.orientation;
				}
			}

			var0.method2460();
		}

		var7 = var0.orientation - var0.rotation & 2047;
		if (var7 != 0) {
			boolean var10 = true;
			boolean var11 = true;
			++var0.field1239;
			var4 = var7 > 1024 ? -1 : 1;
			var0.rotation += var0.field1240 * var4;
			boolean var12 = true;
			if (var7 < var0.field1240 || var7 > 2048 - var0.field1240) {
				var0.rotation = var0.orientation;
				var12 = false;
			}

			if (var0.field1240 > 0 && var0.idleSequence == var0.movementSequence && (var0.field1239 > 25 || var12)) {
				if (var4 == -1 && var0.turnLeftSequence != -1) {
					var0.movementSequence = var0.turnLeftSequence;
				} else if (var4 == 1 && var0.turnRightSequence != -1) {
					var0.movementSequence = var0.turnRightSequence;
				} else {
					var0.movementSequence = var0.walkSequence;
				}
			}

			var0.rotation &= 2047;
		} else {
			if (var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			var0.field1239 = 0;
		}

	}
}
