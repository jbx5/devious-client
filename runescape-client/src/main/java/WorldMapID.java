import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	static final WorldMapID field2659;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	static final WorldMapID field2658;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Lcj;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1317539837
	)
	@Export("value")
	final int value;

	static {
		field2659 = new WorldMapID(0);
		field2658 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IB)I",
		garbageValue = "101"
	)
	public static int method5045(CharSequence var0, int var1) {
		return Script.method2242(var0, var1, true);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1075667756"
	)
	static int method5043(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-61769157"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < ItemComposition.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = ArchiveDiskActionHandler.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					class207.foundItemIdCount = -1;
					class73.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		class73.foundItemIds = var2;
		GameObject.foundItemIndex = 0;
		class207.foundItemIdCount = var3;
		String[] var8 = new String[class207.foundItemIdCount];

		for (int var5 = 0; var5 < class207.foundItemIdCount; ++var5) {
			var8[var5] = ArchiveDiskActionHandler.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = class73.foundItemIds;
		Script.sortItemsByName(var8, var10, 0, var8.length - 1);
	}
}
