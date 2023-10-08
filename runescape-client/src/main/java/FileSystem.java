import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("ac")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("al")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("ak")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 396849549
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;

	static {
		FileSystem_hasPermissions = false;
		FileSystem_cacheFiles = new Hashtable(16);
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "1782754354"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < class284.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = class214.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					SoundSystem.foundItemIdCount = -1;
					class138.foundItemIds = null;
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

		class138.foundItemIds = var2;
		class317.foundItemIndex = 0;
		SoundSystem.foundItemIdCount = var3;
		String[] var8 = new String[SoundSystem.foundItemIdCount];

		for (int var5 = 0; var5 < SoundSystem.foundItemIdCount; ++var5) {
			var8[var5] = class214.ItemDefinition_get(var2[var5]).name;
		}

		GameObject.method5196(var8, class138.foundItemIds);
	}
}
