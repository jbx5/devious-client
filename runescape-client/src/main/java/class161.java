import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
public class class161 extends class147 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1872253511
	)
	int field1796;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class161(class150 var1) {
		this.this$0 = var1;
		this.field1796 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "118"
	)
	void vmethod3528(Buffer var1) {
		this.field1796 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "3"
	)
	void vmethod3530(ClanSettings var1) {
		var1.method3359(this.field1796);
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Lde;Ldw;I)V",
		garbageValue = "1321297831"
	)
	static final void method3429(WorldView var0, Actor var1) {
		int var3;
		int var4;
		int var5;
		if (var1.targetIndex != -1) {
			Object var2 = null;
			var3 = 65536;
			if (var1.targetIndex < var3) {
				var2 = var0.npcs[var1.targetIndex];
			} else {
				var2 = var0.players[var1.targetIndex - var3];
			}

			if (var2 != null) {
				var4 = var1.x - ((Actor)var2).x;
				var5 = var1.y - ((Actor)var2).y;
				if (var4 != 0 || var5 != 0) {
					var1.orientation = class418.method7673(var4, var5);
				}
			} else if (var1.false0) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		int var8;
		if (var1.pathLength == 0 || var1.field1264 > 0) {
			var8 = -1;
			if (var1.field1252 != -1 && var1.field1225 != -1) {
				var3 = class376.method7084(var1.field1252 - class511.topLevelWorldView.baseX);
				var4 = class376.method7084(var1.field1225 - class511.topLevelWorldView.baseY);
				var5 = var1.x - var3;
				int var6 = var1.y - var4;
				if (var5 != 0 || var6 != 0) {
					var8 = class418.method7673(var5, var6);
				}
			} else if (var1.field1227 != -1) {
				var8 = var1.field1227;
			}

			if (var8 != -1) {
				var1.orientation = var8;
				if (var1.field1230) {
					var1.rotation = var1.orientation;
				}
			}

			var1.method2485();
		}

		var8 = var1.orientation - var1.rotation & 2047;
		if (var8 != 0) {
			boolean var9 = true;
			boolean var10 = true;
			++var1.field1258;
			var5 = var8 > 1024 ? -1 : 1;
			var1.rotation += var1.field1259 * var5;
			boolean var11 = true;
			if (var8 < var1.field1259 || var8 > 2048 - var1.field1259) {
				var1.rotation = var1.orientation;
				var11 = false;
			}

			if (var1.field1259 > 0 && var1.idleSequence == var1.movementSequence && (var1.field1258 > 25 || var11)) {
				if (var5 == -1 && var1.turnLeftSequence != -1) {
					var1.movementSequence = var1.turnLeftSequence;
				} else if (var5 == 1 && var1.turnRightSequence != -1) {
					var1.movementSequence = var1.turnRightSequence;
				} else {
					var1.movementSequence = var1.walkSequence;
				}
			}

			var1.rotation &= 2047;
		} else {
			if (var1.false0) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}

			var1.field1258 = 0;
		}

	}
}
