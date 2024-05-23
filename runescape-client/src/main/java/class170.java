import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
public class class170 extends class163 {
	@ObfuscatedName("ak")
	String field1842;
	@ObfuscatedName("al")
	byte field1840;
	@ObfuscatedName("aj")
	byte field1841;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	final class164 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgx;)V"
	)
	class170(class164 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "-406894472"
	)
	void vmethod3479(Buffer var1) {
		this.field1842 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1842 != null) {
			var1.readUnsignedByte();
			this.field1840 = var1.readByte();
			this.field1841 = var1.readByte();
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgo;I)V",
		garbageValue = "-472458599"
	)
	void vmethod3480(ClanChannel var1) {
		var1.name = this.field1842;
		if (this.field1842 != null) {
			var1.field1828 = this.field1840;
			var1.field1829 = this.field1841;
		}

	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Ldt;I)V",
		garbageValue = "239873725"
	)
	static final void method3484(class101 var0) {
		for (Projectile var1 = (Projectile)var0.field1351.last(); var1 != null; var1 = (Projectile)var0.field1351.previous()) {
			if (var0.field1348 == var1.plane && Client.cycle <= var1.cycleEnd) {
				if (Client.cycle >= var1.cycleStart) {
					class103 var2;
					int var3;
					Player var4;
					if (!var1.isMoving && var1.field1005 != 0) {
						if (var1.field1005 > 0) {
							var2 = ModeWhere.field4623.field1343[var1.field1005 - 1];
							if (var2 != null && var2.x >= 0 && var2.x < 13312 && var2.y >= 0 && var2.y < 13312) {
								var1.sourceX = var2.x;
								var1.sourceY = var2.y;
								var1.setDestination(var1.field984, var1.field985, var1.field981, Client.cycle);
							}
						} else {
							var3 = -var1.field1005 - 1;
							if (var3 == Client.localPlayerIndex) {
								var4 = class17.localPlayer;
							} else {
								var4 = ModeWhere.field4623.field1341[var3];
							}

							if (var4 != null && var4.x >= 0 && var4.x < 13312 && var4.y >= 0 && var4.y < 13312) {
								var1.sourceX = var4.x;
								var1.sourceY = var4.y;
								var1.setDestination(var1.field984, var1.field985, var1.field981, Client.cycle);
							}
						}
					}

					if (var1.targetIndex > 0) {
						var2 = var0.field1343[var1.targetIndex - 1];
						if (var2 != null && var2.x >= 0 && var2.x < 13312 && var2.y >= 0 && var2.y < 13312) {
							var1.setDestination(var2.x, var2.y, SoundSystem.method856(var0, var2.x, var2.y, var1.plane) - var1.endHeight, Client.cycle);
						}
					}

					if (var1.targetIndex < 0) {
						var3 = -var1.targetIndex - 1;
						if (var3 == Client.localPlayerIndex) {
							var4 = class17.localPlayer;
						} else {
							var4 = var0.field1341[var3];
						}

						if (var4 != null && var4.x >= 0 && var4.x < 13312 && var4.y >= 0 && var4.y < 13312) {
							var1.setDestination(var4.x, var4.y, SoundSystem.method856(var0, var4.x, var4.y, var1.plane) - var1.endHeight, Client.cycle);
						}
					}

					var1.advance(Client.graphicsCycle);
					var0.field1331.drawEntity(var0.field1348, (int)var1.x, (int)var1.y, (int)var1.z, 60, var1, var1.yaw, -1L, false);
				}
			} else {
				var1.remove();
			}
		}

	}
}
