import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1883588565
	)
	@Export("group")
	int group;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1659928537
	)
	@Export("type")
	int type;
	@ObfuscatedName("ag")
	boolean field1095;

	InterfaceParent() {
		this.field1095 = false;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ldo;III)V",
		garbageValue = "1977275131"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		if (GrandExchangeOfferUnitPriceComparator.isWorldMapEvent(var0.type)) {
			class162.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var6 = class142.WorldMapElement_get(class162.worldMapEvent.mapElement);
			var4 = PlayerCompositionColorTextureOverride.getWorldMapScript(var0.type, var6.objectId, var6.category);
		} else {
			int var5 = (Integer)var3[0];
			var4 = HttpResponse.getScript(var5);
		}

		if (var4 != null) {
			AbstractWorldMapData.runScriptLogic(var0, var4, var1, var2);
		}

	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "33"
	)
	static boolean method2506() {
		return (Client.drawPlayerNames & 4) != 0;
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-659897185"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (TaskHandler.widgetDefinition.loadInterface(var0)) {
			class321.field3302 = null;
			PlayerUpdateManager.drawInterface(TaskHandler.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (class321.field3302 != null) {
				PlayerUpdateManager.drawInterface(class321.field3302, -1412584499, var1, var2, var3, var4, class146.field1680, Strings.field4449, var7);
				class321.field3302 = null;
			}

		} else {
			if (var7 != -1) {
				Client.validRootWidgets[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.validRootWidgets[var8] = true;
				}
			}

		}
	}

	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1483868129"
	)
	public static boolean method2509() {
		return Client.staffModLevel >= 2;
	}
}
