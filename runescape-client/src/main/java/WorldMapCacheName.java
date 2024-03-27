import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	public static final WorldMapCacheName field3154;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	public static final WorldMapCacheName field3155;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	public static final WorldMapCacheName field3156;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	static final WorldMapCacheName field3157;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	public static final WorldMapCacheName field3158;
	@ObfuscatedName("ao")
	@Export("name")
	public final String name;

	static {
		field3154 = new WorldMapCacheName("details");
		field3155 = new WorldMapCacheName("compositemap");
		field3156 = new WorldMapCacheName("compositetexture");
		field3157 = new WorldMapCacheName("area");
		field3158 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-124"
	)
	static void method5751() {
		if (Client.isSpellSelected) {
			Widget var0 = class243.widgetDefinition.getWidgetChild(ChatChannel.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				AbstractWorldMapData.runScriptEvent(var1);
			}

			Client.selectedSpellItemId = -1;
			Client.isSpellSelected = false;
			WorldMapData_0.invalidateWidget(var0);
		}
	}
}
