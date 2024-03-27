import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("dm")
	static boolean field3108;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 652910965
	)
	@Export("width")
	int width;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1086019289
	)
	@Export("height")
	int height;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 382152447
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1356764147
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	final WorldMapRenderer this$0;

	@ObfuscatedSignature(
		descriptor = "(Lkh;)V"
	)
	WorldMapRectangle(WorldMapRenderer var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Ldt;I)V",
		garbageValue = "1552824540"
	)
	static final void method5683(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = LoginType.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) {
			var1 = LoginType.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) {
			var1 = LoginType.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = LoginType.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var1 != 0L) {
			int var6 = LoginType.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = NpcOverrides.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = var6 >> 6 & 3;
		}

		var0.objectId = var3;
		var0.field1188 = var4;
		var0.field1187 = var5;
	}
}
