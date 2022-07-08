import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bc")
@Implements("World")
public class World {
	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 1243814163)
	@Export("World_count")
	static int World_count;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 1265990767)
	@Export("World_listCount")
	static int World_listCount;

	@ObfuscatedName("w")
	@Export("World_sortOption2")
	static int[] World_sortOption2;

	@ObfuscatedName("y")
	@Export("World_sortOption1")
	static int[] World_sortOption1;

	@ObfuscatedName("bx")
	@Export("otp")
	static String otp;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -1195695549)
	@Export("id")
	int id;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 1566282553)
	@Export("properties")
	int properties;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 856262613)
	@Export("population")
	int population;

	@ObfuscatedName("r")
	@Export("host")
	String host;

	@ObfuscatedName("u")
	@Export("activity")
	String activity;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = -951869585)
	@Export("location")
	int location;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 1645334635)
	@Export("index")
	int index;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{ 1, 1, 1, 1 };
		World_sortOption1 = new int[]{ 0, 1, 2, 3 };
	}

	World() {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-1")
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "2111399818")
	boolean method1628() {
		return (2 & this.properties) != 0;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1146943017")
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "2013300690")
	boolean method1594() {
		return (8 & this.properties) != 0;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-2131603316")
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1130172337")
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "119")
	boolean method1597() {
		return (1073741824 & this.properties) != 0;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(B)Lfv;", garbageValue = "-7")
	public static Clock method1601() {
		try {
			return new NanoClock();
		} catch (Throwable var1) {
			return new MilliClock();
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1666471855")
	static final void method1627() {
		for (Projectile var0 = ((Projectile) (Client.projectiles.last())); var0 != null; var0 = ((Projectile) (Client.projectiles.previous()))) {
			if (var0.plane == PacketWriter.Client_plane && Client.cycle <= var0.cycleEnd) {
				if (Client.cycle >= var0.cycleStart) {
					if (var0.targetIndex > 0) {
						NPC var1 = Client.npcs[var0.targetIndex - 1];
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) {
							var0.setDestination(var1.x, var1.y, SceneTilePaint.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}
					if (var0.targetIndex < 0) {
						int var2 = -var0.targetIndex - 1;
						Player var3;
						if (var2 == Client.localPlayerIndex) {
							var3 = class101.localPlayer;
						} else {
							var3 = Client.players[var2];
						}
						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, SceneTilePaint.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}
					var0.advance(Client.field555);
					class356.scene.drawEntity(PacketWriter.Client_plane, ((int) (var0.x)), ((int) (var0.y)), ((int) (var0.z)), 60, var0, var0.yaw, -1L, false);
				}
			} else {
				var0.remove();
			}
		}
	}
}