import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("wf")
	@ObfuscatedGetter(
		intValue = -344460445
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("dk")
	static boolean field3131;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1797510003
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2122061283
	)
	@Export("z")
	int z;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1307458835
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 990255065
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 733062771
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2090331591
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1972009079
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1144008403
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1776545777
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 779132871
	)
	int field3132;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -908903719
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -1053012787197118801L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 613582333
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-788767206"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) {
			NPC var2 = Client.npcs[Client.npcIndices[var1]];
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
				int var3 = var2.x >> 7;
				int var4 = var2.y >> 7;
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
					if (var2.field1212 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
					}

					long var5 = AsyncHttpResponse.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
					var2.playerCycle = Client.cycle;
					Actor.scene.drawEntity(class473.Client_plane, var2.x, var2.y, class272.getTileHeight(var2.field1212 * 64 - 64 + var2.x, var2.field1212 * 64 - 64 + var2.y, class473.Client_plane), var2.field1212 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
				}
			}
		}

	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-99454612"
	)
	static void method5963() {
		if (Client.isSpellSelected) {
			Widget var0 = ArchiveLoader.widgetDefinition.getWidgetChild(class160.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				class177.runScriptEvent(var1);
			}

			Client.selectedSpellItemId = -1;
			Client.isSpellSelected = false;
			UserComparator5.invalidateWidget(var0);
		}
	}
}
