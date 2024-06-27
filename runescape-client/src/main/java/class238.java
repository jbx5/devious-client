import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
public enum class238 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field2512((byte)-1, 0.0F),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field2520((byte)0, 0.5F),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field2519((byte)1, 1.0F),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field2509((byte)2, 2.0F),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field2510((byte)3, 1.5F),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field2511((byte)4, 2.5F),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field2516((byte)5, 3.0F),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field2513((byte)6, 3.5F),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field2507((byte)7, 4.0F);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Ljb;"
	)
	static class238[] field2508 = class193.method3759();
	@ObfuscatedName("tp")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("ai")
	public final byte field2515;
	@ObfuscatedName("ae")
	public final float field2517;

	static {
		class562.method10144();
	}

	class238(byte var3, float var4) {
		this.field2515 = var3;
		this.field2517 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2515;
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Lde;ZI)V",
		garbageValue = "2064026790"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(WorldView var0, boolean var1) {
		for (int var2 = 0; var2 < var0.npcCount; ++var2) {
			NPC var3 = var0.npcs[var0.npcIndices[var2]];
			if (var3 != null && var3.isVisible() && var3.definition.isVisible == var1 && var3.definition.transformIsVisible()) {
				int var4 = var3.x >> 7;
				int var5 = var3.y >> 7;
				if (var4 >= 0 && var4 < var0.sizeX && var5 >= 0 && var5 < var0.sizeY) {
					if (var3.field1194 == 1 && (var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.tileLastDrawnActor[var4][var5] == Client.viewportDrawCount) {
							continue;
						}

						var0.tileLastDrawnActor[var4][var5] = Client.viewportDrawCount;
					}

					long var6 = FileSystem.calculateTag(0, 0, 1, !var3.definition.isInteractable, var0.npcIndices[var2], var0.id);
					var3.playerCycle = Client.cycle;
					var0.scene.drawEntity(var0.plane, var3.x, var3.y, class169.getTileHeight(var0, var3.field1194 * 64 - 64 + var3.x, var3.field1194 * 64 - 64 + var3.y, var0.plane), var3.field1194 * 64 - 64 + 60, var3, var3.rotation, var6, var3.isWalking);
				}
			}
		}

	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1905415221"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}

		if (var1.length() > 9) {
			return " " + NpcOverrides.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + NpcOverrides.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + NpcOverrides.colorStartTag(16776960) + var1 + "</col>";
		}
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "([Lnx;Lnx;ZI)V",
		garbageValue = "-1942820533"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width;
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height;
		ArchiveLoader.resizeInterface(var0, var1.id, var3, var4, var2);
		if (var1.children != null) {
			ArchiveLoader.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
		if (var5 != null) {
			ClanChannel.method3488(var5.group, var3, var4, var2);
		}

		if (var1.contentType == 1337) {
		}

	}
}
