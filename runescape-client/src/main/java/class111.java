import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public class class111 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1431;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1421;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1422;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1423;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1426;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1420;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1432;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1427;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1428;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1424;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1430;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1429;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1437;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	@Export("field1390")
	static final class111 field1390;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1434;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1435;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -262339015
	)
	int field1436;

	static {
		field1431 = new class111(0);
		field1421 = new class111(1);
		field1422 = new class111(2);
		field1423 = new class111(3);
		field1426 = new class111(4);
		field1420 = new class111(5);
		field1432 = new class111(6);
		field1427 = new class111(7);
		field1428 = new class111(8);
		field1424 = new class111(9);
		field1430 = new class111(10);
		field1429 = new class111(11);
		field1437 = new class111(12);
		field1390 = new class111(13);
		field1434 = new class111(14);
		field1435 = new class111(15);
	}

	class111(int var1) {
		this.field1436 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1146245297"
	)
	public static void method2848() {
		class189.field2026.clear();
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)Z",
		garbageValue = "0"
	)
	static boolean method2849(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		Scene var7 = HttpResponse.worldView.scene;
		int var9;
		if (var5 == class380.field4435.field4439) {
			BoundaryObject var8 = var7.getBoundaryObject(var0, var1, var2);
			if (var8 != null) {
				var9 = class229.Entity_unpackID(var8.tag);
				if (var3 == WorldMapDecorationType.field4027.id) {
					var8.renderable1 = new DynamicObject(HttpResponse.worldView, var9, 2, var4 + 4, var0, var1, var2, var6, false, var8.renderable1);
					var8.renderable2 = new DynamicObject(HttpResponse.worldView, var9, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var8.renderable2);
				} else {
					var8.renderable1 = new DynamicObject(HttpResponse.worldView, var9, var3, var4, var0, var1, var2, var6, false, var8.renderable1);
				}

				return true;
			}
		} else if (var5 == class380.field4436.field4439) {
			WallDecoration var10 = var7.getWallDecoration(var0, var1, var2);
			if (var10 != null) {
				var9 = class229.Entity_unpackID(var10.tag);
				if (var3 != WorldMapDecorationType.field4014.id && var3 != WorldMapDecorationType.field4026.id) {
					if (var3 == WorldMapDecorationType.field4016.id) {
						var10.renderable1 = new DynamicObject(HttpResponse.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4017.id) {
						var10.renderable1 = new DynamicObject(HttpResponse.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4018.id) {
						var10.renderable1 = new DynamicObject(HttpResponse.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
						var10.renderable2 = new DynamicObject(HttpResponse.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable2);
					}
				} else {
					var10.renderable1 = new DynamicObject(HttpResponse.worldView, var9, 4, var4, var0, var1, var2, var6, false, var10.renderable1);
				}

				return true;
			}
		} else if (var5 == class380.field4437.field4439) {
			GameObject var11 = var7.getGameObject(var0, var1, var2);
			if (var3 == WorldMapDecorationType.field4030.id) {
				var3 = WorldMapDecorationType.field4029.id;
			}

			if (var11 != null) {
				var11.renderable = new DynamicObject(HttpResponse.worldView, class229.Entity_unpackID(var11.tag), var3, var4, var0, var1, var2, var6, false, var11.renderable);
				return true;
			}
		} else if (var5 == class380.field4438.field4439) {
			FloorDecoration var12 = var7.getFloorDecoration(var0, var1, var2);
			if (var12 != null) {
				var12.renderable = new DynamicObject(HttpResponse.worldView, class229.Entity_unpackID(var12.tag), 22, var4, var0, var1, var2, var6, false, var12.renderable);
				return true;
			}
		}

		return false;
	}
}
