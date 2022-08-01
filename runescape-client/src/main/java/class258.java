import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("ix")
public class class258 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(II)Lge;", garbageValue = "191798603")
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = ((ItemComposition) (ItemComposition.ItemDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ItemComposition.ItemDefinition_archive.takeFile(10, var0);
			var1 = new ItemComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			var1.post();
			if (var1.noteTemplate != -1) {
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}
			if (var1.notedId != -1) {
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}
			if (var1.placeholderTemplate != -1) {
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}
			if (!ItemComposition.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
				var1.name = "Members object";
				var1.isTradable = false;
				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) {
					var1.groundActions[var3] = null;
				}
				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) {
					if (var3 != 4) {
						var1.inventoryActions[var3] = null;
					}
				}
				var1.shiftClickIndex = -2;
				var1.team = 0;
				if (var1.params != null) {
					boolean var6 = false;
					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
						ParamComposition var5 = class238.getParamDefinition(((int) (var4.key)));
						if (var5.autoDisable) {
							var4.remove();
						} else {
							var6 = true;
						}
					}
					if (!var6) {
						var1.params = null;
					}
				}
			}
			ItemComposition.ItemDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(IZII)V", garbageValue = "-228948511")
	public static final void method5186(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) {
			class301.field3595 = var0;
			PcmPlayer.PcmPlayer_stereo = var1;
			class354.field4242 = var2;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(descriptor = "(IIII)Lcd;", garbageValue = "177968651")
	static final InterfaceParent method5185(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, ((long) (var0)));
		WorldMapIcon_0.Widget_resetModelFrames(var1);
		Widget var4 = FloorUnderlayDefinition.getWidget(var0);
		class220.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			class220.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}
		class439.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var0 >> 16], var4, false);
		KeyHandler.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			class220.runIntfCloseListeners(Client.rootInterface, 1);
		}
		return var3;
	}
}