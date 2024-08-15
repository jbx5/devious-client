import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
@Implements("PlayerType")
public enum PlayerType implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4432(6, 22, false, false, true),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4420(7, 41, false, false, true),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4421(8, 42, false, false, true),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4422(9, 43, false, false, true),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4423(10, 44, false, false, true),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4417(11, 45, false, false, true),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4425(12, 46, false, false, true),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4426(13, 47, false, false, true),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4427(14, 48, false, false, true),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4428(15, 49, false, false, true),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	field4424(16, 52, false, false, true);

	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1322775975
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -987210825
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("av")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("ar")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3;
		this.modIcon = var4;
		this.isPrivileged = var6;
		this.isUser = var7;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "-2091355049"
	)
	static boolean method7185(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		Scene var7 = class328.worldView.scene;
		int var9;
		if (var5 == class381.field4411.field4412) {
			BoundaryObject var8 = var7.getBoundaryObject(var0, var1, var2);
			if (var8 != null) {
				var9 = class513.Entity_unpackID(var8.tag);
				if (var3 == WorldMapDecorationType.field4000.id) {
					var8.renderable1 = new DynamicObject(class328.worldView, var9, 2, var4 + 4, var0, var1, var2, var6, false, var8.renderable1);
					var8.renderable2 = new DynamicObject(class328.worldView, var9, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var8.renderable2);
				} else {
					var8.renderable1 = new DynamicObject(class328.worldView, var9, var3, var4, var0, var1, var2, var6, false, var8.renderable1);
				}

				return true;
			}
		} else if (var5 == class381.field4409.field4412) {
			WallDecoration var10 = var7.getWallDecoration(var0, var1, var2);
			if (var10 != null) {
				var9 = class513.Entity_unpackID(var10.tag);
				if (var3 != WorldMapDecorationType.field3996.id && var3 != WorldMapDecorationType.field3997.id) {
					if (var3 == WorldMapDecorationType.field4006.id) {
						var10.renderable1 = new DynamicObject(class328.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field3992.id) {
						var10.renderable1 = new DynamicObject(class328.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4002.id) {
						var10.renderable1 = new DynamicObject(class328.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
						var10.renderable2 = new DynamicObject(class328.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable2);
					}
				} else {
					var10.renderable1 = new DynamicObject(class328.worldView, var9, 4, var4, var0, var1, var2, var6, false, var10.renderable1);
				}

				return true;
			}
		} else if (var5 == class381.field4410.field4412) {
			GameObject var11 = var7.getGameObject(var0, var1, var2);
			if (var3 == WorldMapDecorationType.field4012.id) {
				var3 = WorldMapDecorationType.field4011.id;
			}

			if (var11 != null) {
				var11.renderable = new DynamicObject(class328.worldView, class513.Entity_unpackID(var11.tag), var3, var4, var0, var1, var2, var6, false, var11.renderable);
				return true;
			}
		} else if (var5 == class381.field4408.field4412) {
			FloorDecoration var12 = var7.getFloorDecoration(var0, var1, var2);
			if (var12 != null) {
				var12.renderable = new DynamicObject(class328.worldView, class513.Entity_unpackID(var12.tag), 22, var4, var0, var1, var2, var6, false, var12.renderable);
				return true;
			}
		}

		return false;
	}
}
