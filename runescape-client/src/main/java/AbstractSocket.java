import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.io.IOException;
import net.runelite.mapping.Export;
@ObfuscatedName("nc")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	AbstractSocket() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "126370664")
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "14")
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-660901031")
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "([BIIB)I", garbageValue = "-6")
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "([BIIS)V", garbageValue = "-16011")
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-947955059")
	@Export("close")
	public abstract void close();

	@ObfuscatedName("iy")
	@ObfuscatedSignature(descriptor = "(Lkn;IIB)V", garbageValue = "-77")
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) {
			ClientPacket.method5130(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId);
		}
		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var3 = WorldMapDecoration.Widget_getSpellActionName(var0);
			if (var3 != null) {
				ClientPacket.method5130(var3, Clock.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id, var0.itemId);
			}
		}
		if (var0.buttonType == 3) {
			ChatChannel.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}
		if (var0.buttonType == 4) {
			ChatChannel.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}
		if (var0.buttonType == 5) {
			ChatChannel.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}
		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			ChatChannel.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}
		int var4;
		int var17;
		if (var0.type == 2) {
			var17 = 0;
			for (var4 = 0; var4 < var0.height; ++var4) {
				for (int var19 = 0; var19 < var0.width; ++var19) {
					int var6 = (var0.paddingX + 32) * var19;
					int var7 = (var0.paddingY + 32) * var4;
					if (var17 < 20) {
						var6 += var0.inventoryXOffsets[var17];
						var7 += var0.inventoryYOffsets[var17];
					}
					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) {
						Client.dragItemSlotDestination = var17;
						class133.hoveredItemContainer = var0;
						if (var0.itemIds[var17] > 0) {
							label300 : {
								ItemComposition var8 = AttackOption.ItemDefinition_get(var0.itemIds[var17] - 1);
								boolean var9;
								int var10;
								if (Client.isItemSelected == 1) {
									var10 = class193.getWidgetFlags(var0);
									var9 = (var10 >> 30 & 1) != 0;
									if (var9) {
										if (var0.id != class150.selectedItemWidget || var17 != class67.selectedItemSlot) {
											ClientPacket.method5130("Use", Client.selectedItemName + " " + "->" + " " + Clock.colorStartTag(16748608) + var8.name, 31, 0, var17, var0.id, var8.id);
										}
										break label300;
									}
								}
								if (Client.isSpellSelected) {
									var10 = class193.getWidgetFlags(var0);
									var9 = (var10 >> 30 & 1) != 0;
									if (var9) {
										if ((class149.selectedSpellFlags & 16) == 16) {
											ClientPacket.method5130(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Clock.colorStartTag(16748608) + var8.name, 32, 0, var17, var0.id, var8.id);
										}
										break label300;
									}
								}
								String[] var20 = var8.inventoryActions;
								var10 = -1;
								if (Client.shiftClickDrop && class142.method2990()) {
									var10 = var8.getShiftClickIndex();
								}
								int var12 = class193.getWidgetFlags(var0);
								boolean var11 = (var12 >> 30 & 1) != 0;
								if (var11) {
									for (int var13 = 4; var13 >= 3; --var13) {
										if (var10 != var13) {
											SoundSystem.addWidgetItemMenuItem(var0, var8, var17, var13, false);
										}
									}
								}
								Object var10000 = null;
								if (class286.method5454(class193.getWidgetFlags(var0))) {
									ClientPacket.method5130("Use", Clock.colorStartTag(16748608) + var8.name, 38, 0, var17, var0.id, var8.id);
								}
								int var14 = class193.getWidgetFlags(var0);
								boolean var21 = (var14 >> 30 & 1) != 0;
								int var15;
								if (var21) {
									for (var15 = 2; var15 >= 0; --var15) {
										if (var10 != var15) {
											SoundSystem.addWidgetItemMenuItem(var0, var8, var17, var15, false);
										}
									}
									if (var10 >= 0) {
										SoundSystem.addWidgetItemMenuItem(var0, var8, var17, var10, true);
									}
								}
								var20 = var0.itemActions;
								if (var20 != null) {
									for (var15 = 4; var15 >= 0; --var15) {
										if (var20[var15] != null) {
											byte var16 = 0;
											if (var15 == 0) {
												var16 = 39;
											}
											if (var15 == 1) {
												var16 = 40;
											}
											if (var15 == 2) {
												var16 = 41;
											}
											if (var15 == 3) {
												var16 = 42;
											}
											if (var15 == 4) {
												var16 = 43;
											}
											ClientPacket.method5130(var20[var15], Clock.colorStartTag(16748608) + var8.name, var16, 0, var17, var0.id, var8.id);
										}
									}
								}
								ClientPacket.method5130("Examine", Clock.colorStartTag(16748608) + var8.name, 1005, 0, var17, var0.id, var8.id);
							}
						}
					}
					++var17;
				}
			}
		}
		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				if (HealthBarDefinition.method3371(class193.getWidgetFlags(var0)) && (class149.selectedSpellFlags & 32) == 32) {
					ClientPacket.method5130(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId);
				}
			} else {
				for (var17 = 9; var17 >= 5; --var17) {
					String var18 = GrandExchangeOfferAgeComparator.method5910(var0, var17);
					if (var18 != null) {
						ClientPacket.method5130(var18, var0.dataText, 1007, var17 + 1, var0.childIndex, var0.id, var0.itemId);
					}
				}
				var3 = WorldMapDecoration.Widget_getSpellActionName(var0);
				if (var3 != null) {
					ClientPacket.method5130(var3, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId);
				}
				for (var4 = 4; var4 >= 0; --var4) {
					String var5 = GrandExchangeOfferAgeComparator.method5910(var0, var4);
					if (var5 != null) {
						CollisionMap.insertMenuItem(var5, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry);
					}
				}
				if (class385.method6873(class193.getWidgetFlags(var0))) {
					ChatChannel.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}
	}
}