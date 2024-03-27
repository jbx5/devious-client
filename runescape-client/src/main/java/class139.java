import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public enum class139 implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1653(0, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1645(1, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1646(2, 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1647(3, 3),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1651(4, 4),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1649(5, 5),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1644(6, 6),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1650(7, 7),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1652(8, 8);

	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -980446989
	)
	final int field1648;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1166609821
	)
	final int field1654;

	class139(int var3, int var4) {
		this.field1648 = var3;
		this.field1654 = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1654;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIS)V",
		garbageValue = "30357"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		if (class234.isWorldMapEvent(var0.type)) {
			Interpreter.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var6 = WidgetDefinition.WorldMapElement_get(Interpreter.worldMapEvent.mapElement);
			var4 = Language.getWorldMapScript(var0.type, var6.objectId, var6.category);
		} else {
			int var5 = (Integer)var3[0];
			var4 = class128.getScript(var5);
		}

		if (var4 != null) {
			UrlRequest.runScriptLogic(var0, var4, var1, var2);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "76"
	)
	public static void method3117() {
		DbTableType.DBTableType_cache.clear();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;ZI)V",
		garbageValue = "-388078015"
	)
	static void method3118(ArrayList var0, boolean var1) {
		if (!var1) {
			class321.field3496.clear();
		}

		Iterator var2 = var0.iterator();

		while (var2.hasNext()) {
			MusicSong var3 = (MusicSong)var2.next();
			if (var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
				if (!var1) {
					class321.field3496.add(var3);
				}

				class321.field3500.add(var3);
			}
		}

	}
}
