import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1362840817
	)
	static int field3276;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2015077723
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILnm;Lnm;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2125508958"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (TaskHandler.widgetDefinition.loadInterface(var0)) {
				Widget[] var1 = TaskHandler.widgetDefinition.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						InterfaceParent.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}
}
