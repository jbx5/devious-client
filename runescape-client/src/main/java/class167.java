import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
public class class167 extends class160 {
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		longValue = 8627223166861386023L
	)
	static long field1823;
	@ObfuscatedName("az")
	String field1824;
	@ObfuscatedName("ah")
	byte field1818;
	@ObfuscatedName("af")
	byte field1819;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	final class161 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgt;)V"
	)
	class167(class161 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "33"
	)
	void vmethod3414(Buffer var1) {
		this.field1824 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1824 != null) {
			var1.readUnsignedByte();
			this.field1818 = var1.readByte();
			this.field1819 = var1.readByte();
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgi;B)V",
		garbageValue = "18"
	)
	void vmethod3413(ClanChannel var1) {
		var1.name = this.field1824;
		if (this.field1824 != null) {
			var1.field1801 = this.field1818;
			var1.field1799 = this.field1819;
		}

	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-106638788"
	)
	static final void method3417() {
		if (class144.pcmPlayer1 != null) {
			class144.pcmPlayer1.run();
		}

	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Ldi;ZI)V",
		garbageValue = "659881899"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) {
			var0.isUnanimated = false;
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.idleSequence == var0.movementSequence) {
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7;
			int var3 = var0.y >> 7;
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
				long var4 = class154.calculateTag(0, 0, 0, false, var0.index);
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) {
					var0.isUnanimated = false;
					var0.tileHeight = Canvas.getTileHeight(var0.x, var0.y, class172.Client_plane);
					var0.playerCycle = Client.cycle;
					LoginType.scene.addNullableObject(class172.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY);
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
					}

					var0.tileHeight = Canvas.getTileHeight(var0.x, var0.y, class172.Client_plane);
					var0.playerCycle = Client.cycle;
					LoginType.scene.drawEntity(class172.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
				}
			}
		}

	}
}
