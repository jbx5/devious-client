import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
public final class class416 {
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("widgetDefinition")
	static WidgetDefinition widgetDefinition;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "10194"
	)
	public static int method8060(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)[I",
		garbageValue = "459254516"
	)
	static int[] method8059(int var0, int var1, int var2, int var3, int var4) {
		int[] var5 = new int[256];

		int var6;
		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6] = WorldMapEvent.method6438(var0, var1, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 64] = WorldMapEvent.method6438(var1, var2, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 128] = WorldMapEvent.method6438(var2, var3, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 192] = WorldMapEvent.method6438(var3, var4, var6);
		}

		return var5;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILdy;I)Ldn;",
		garbageValue = "-2056852767"
	)
	public static WorldView method8058(int var0, WorldViewManager var1) {
		Iterator var2 = var1.iterator();

		WorldView var3;
		do {
			if (!var2.hasNext()) {
				return var1.method2670();
			}

			var3 = (WorldView)var2.next();
		} while(var3.npcs[var0] == null);

		return var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)Ljava/lang/String;",
		garbageValue = "1301027424"
	)
	public static String method8056(Buffer var0) {
		return class167.method3769(var0, 32767);
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(Lng;III)V",
		garbageValue = "2076108392"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null && ScriptFrame.method1224(var0) != null) {
				Client.clickedWidget = var0;
				Client.clickedWidgetParent = ScriptFrame.method1224(var0);
				Client.widgetClickX = var1;
				Client.widgetClickY = var2;
				InterfaceParent.widgetDragDuration = 0;
				Client.isDraggingWidget = false;
				int var3 = MusicPatchPcmStream.method6792();
				if (var3 != -1) {
					class179.tempMenuAction = new MenuAction();
					class179.tempMenuAction.param0 = Client.menu.menuArguments1[var3];
					class179.tempMenuAction.param1 = Client.menu.menuArguments2[var3];
					class179.tempMenuAction.opcode = Client.menu.menuOpcodes[var3];
					class179.tempMenuAction.identifier = Client.menu.menuIdentifiers[var3];
					class179.tempMenuAction.itemId = Client.menu.menuItemIds[var3];
					class179.tempMenuAction.action = Client.menu.menuActions[var3];
					class179.tempMenuAction.target = Client.menu.menuTargets[var3];
					class179.tempMenuAction.worldViewId = Client.menu.menuWorldViewIds[var3];
					class179.tempMenuAction.field909 = Client.menu.menuShiftClick[var3];
				}

			}
		}
	}
}
