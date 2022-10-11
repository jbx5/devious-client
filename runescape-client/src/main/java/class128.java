import java.awt.Image;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
public class class128 extends class129 {
	@ObfuscatedName("ak")
	static Image field1561;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = -1981589143
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 153057193
	)
	int field1558;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	final class132 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leo;)V"
	)
	class128(class132 var1) {
		this.this$0 = var1;
		this.field1558 = -1; // L: 114
	} // L: 116

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "-41"
	)
	void vmethod3320(Buffer var1) {
		this.field1558 = var1.readUnsignedShort(); // L: 119
	} // L: 120

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Led;I)V",
		garbageValue = "-538131930"
	)
	void vmethod3313(ClanSettings var1) {
		var1.method3146(this.field1558); // L: 123
	} // L: 124

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-371587618"
	)
	static int method3003() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1478
			int var0 = 0; // L: 1479

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1480
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1481
			}

			return var0 * 10000 / Client.field613; // L: 1483
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1935735857"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = JagexCache.getWidgetChild(var0, var1); // L: 9231
		if (var4 != null && var4.onTargetEnter != null) { // L: 9232
			ScriptEvent var5 = new ScriptEvent(); // L: 9233
			var5.widget = var4; // L: 9234
			var5.args = var4.onTargetEnter; // L: 9235
			class348.runScriptEvent(var5); // L: 9236
		}

		Client.selectedSpellItemId = var3; // L: 9238
		Client.isSpellSelected = true; // L: 9239
		ClanSettings.selectedSpellWidget = var0; // L: 9240
		Client.selectedSpellChildIndex = var1; // L: 9241
		UrlRequest.selectedSpellFlags = var2; // L: 9242
		class403.invalidateWidget(var4); // L: 9243
	} // L: 9244
}
