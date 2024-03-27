import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	field2090(1, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(2, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	field2087(0, 2);

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	static StudioGame field2089;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1211211747
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -863373227
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1301037601"
	)
	static void method3850(int var0, String var1) {
		Login.Login_loadingText = var1;
		Login.Login_loadingPercent = var0;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IIB)V",
		garbageValue = "108"
	)
	public static void method3854(Widget var0, int var1, int var2) {
		var0.field3801.bodyColors[var1] = var2;
		var0.field3801.method6332();
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)Z",
		garbageValue = "0"
	)
	static boolean method3853(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8;
		if (var5 == class371.field4328.field4331) {
			BoundaryObject var7 = LoginType.scene.method4728(var0, var1, var2);
			if (var7 != null) {
				var8 = NpcOverrides.Entity_unpackID(var7.tag);
				if (var3 == WorldMapDecorationType.field3925.id) {
					var7.renderable1 = new DynamicObject(var8, 2, var4 + 4, var0, var1, var2, var6, false, var7.renderable1);
					var7.renderable2 = new DynamicObject(var8, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var7.renderable2);
				} else {
					var7.renderable1 = new DynamicObject(var8, var3, var4, var0, var1, var2, var6, false, var7.renderable1);
				}

				return true;
			}
		} else if (var5 == class371.field4327.field4331) {
			WallDecoration var9 = LoginType.scene.method4817(var0, var1, var2);
			if (var9 != null) {
				var8 = NpcOverrides.Entity_unpackID(var9.tag);
				if (var3 != WorldMapDecorationType.field3936.id && var3 != WorldMapDecorationType.field3935.id) {
					if (var3 == WorldMapDecorationType.field3930.id) {
						var9.renderable1 = new DynamicObject(var8, 4, var4 + 4, var0, var1, var2, var6, false, var9.renderable1);
					} else if (var3 == WorldMapDecorationType.field3945.id) {
						var9.renderable1 = new DynamicObject(var8, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var9.renderable1);
					} else if (var3 == WorldMapDecorationType.field3932.id) {
						var9.renderable1 = new DynamicObject(var8, 4, var4 + 4, var0, var1, var2, var6, false, var9.renderable1);
						var9.renderable2 = new DynamicObject(var8, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var9.renderable2);
					}
				} else {
					var9.renderable1 = new DynamicObject(var8, 4, var4, var0, var1, var2, var6, false, var9.renderable1);
				}

				return true;
			}
		} else if (var5 == class371.field4329.field4331) {
			GameObject var10 = LoginType.scene.getGameObject(var0, var1, var2);
			if (var3 == WorldMapDecorationType.field3929.id) {
				var3 = WorldMapDecorationType.field3943.id;
			}

			if (var10 != null) {
				var10.renderable = new DynamicObject(NpcOverrides.Entity_unpackID(var10.tag), var3, var4, var0, var1, var2, var6, false, var10.renderable);
				return true;
			}
		} else if (var5 == class371.field4330.field4331) {
			FloorDecoration var11 = LoginType.scene.getFloorDecoration(var0, var1, var2);
			if (var11 != null) {
				var11.renderable = new DynamicObject(NpcOverrides.Entity_unpackID(var11.tag), 22, var4, var0, var1, var2, var6, false, var11.renderable);
				return true;
			}
		}

		return false;
	}
}
