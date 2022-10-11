import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("k")
	@Export("name")
	public final String name;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -739998815
	)
	@Export("buildId")
	public final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0); // L: 5
		BUILDLIVE = new GameBuild("BUILDLIVE", 3); // L: 6
		RC = new GameBuild("RC", 1); // L: 7
		WIP = new GameBuild("WIP", 2); // L: 8
	}

	GameBuild(String var1, int var2) {
		this.name = var1; // L: 17
		this.buildId = var2; // L: 18
	} // L: 19

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "([Lkw;II)V",
		garbageValue = "788410132"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11327
			Widget var3 = var0[var2]; // L: 11328
			if (var3 != null) { // L: 11329
				if (var3.type == 0) { // L: 11330
					if (var3.children != null) { // L: 11331
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11332
					if (var4 != null) { // L: 11333
						class18.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 11335
					var5 = new ScriptEvent(); // L: 11336
					var5.widget = var3; // L: 11337
					var5.args = var3.onDialogAbort; // L: 11338
					class348.runScriptEvent(var5); // L: 11339
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 11341
					if (var3.childIndex >= 0) { // L: 11342
						Widget var6 = SpotAnimationDefinition.getWidget(var3.id); // L: 11343
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 11344
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 11348
					var5.widget = var3; // L: 11349
					var5.args = var3.onSubChange; // L: 11350
					class348.runScriptEvent(var5); // L: 11351
				}
			}
		}

	} // L: 11354

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1671333815"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 12083
		short[] var2 = new short[16]; // L: 12084
		int var3 = 0; // L: 12085

		for (int var4 = 0; var4 < ItemComposition.ItemDefinition_fileCount; ++var4) { // L: 12086
			ItemComposition var9 = UserComparator3.ItemDefinition_get(var4); // L: 12087
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 12088 12089 12090
				if (var3 >= 250) { // L: 12091
					UserComparator4.foundItemIdCount = -1; // L: 12092
					class283.foundItemIds = null; // L: 12093
					return; // L: 12094
				}

				if (var3 >= var2.length) { // L: 12096
					short[] var6 = new short[var2.length * 2]; // L: 12097

					for (int var7 = 0; var7 < var3; ++var7) { // L: 12098
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 12099
				}

				var2[var3++] = (short)var4; // L: 12101
			}
		}

		class283.foundItemIds = var2; // L: 12103
		GameEngine.foundItemIndex = 0; // L: 12104
		UserComparator4.foundItemIdCount = var3; // L: 12105
		String[] var8 = new String[UserComparator4.foundItemIdCount]; // L: 12106

		for (int var5 = 0; var5 < UserComparator4.foundItemIdCount; ++var5) { // L: 12107
			var8[var5] = UserComparator3.ItemDefinition_get(var2[var5]).name;
		}

		class229.method5022(var8, class283.foundItemIds); // L: 12108
	} // L: 12109
}
