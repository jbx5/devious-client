import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public enum class129 implements Enum
{
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	field1513(0, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	field1514(1, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	field1512(2, 2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	field1518(3, 3),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	field1510(4, 4);

	@ObfuscatedName("ac")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1830305403
	)
	final int field1515;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1827207297
	)
	final int field1516;

	class129(int var3, int var4) {
		this.field1515 = var3;
		this.field1516 = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1516;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Lru;",
		garbageValue = "94"
	)
	static class465[] method3090() {
		return new class465[]{class465.field4789, class465.field4792, class465.field4788, class465.field4790};
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "-1979044926"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = class361.World_worlds[var6];
			class361.World_worlds[var6] = class361.World_worlds[var1];
			class361.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				World var11 = class361.World_worlds[var9];
				int var12 = class89.compareWorlds(var11, var8, var2, var3);
				int var10;
				if (var12 != 0) {
					if (var3) {
						var10 = -var12;
					} else {
						var10 = var12;
					}
				} else if (var4 == -1) {
					var10 = 0;
				} else {
					int var13 = class89.compareWorlds(var11, var8, var4, var5);
					if (var5) {
						var10 = -var13;
					} else {
						var10 = var13;
					}
				}

				if (var10 <= 0) {
					World var14 = class361.World_worlds[var9];
					class361.World_worlds[var9] = class361.World_worlds[var7];
					class361.World_worlds[var7++] = var14;
				}
			}

			class361.World_worlds[var1] = class361.World_worlds[var7];
			class361.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "394738351"
	)
	static void method3086(int var0) {
		UserComparator7.method2966(14);
		Login.Login_banType = var0;
	}
}
