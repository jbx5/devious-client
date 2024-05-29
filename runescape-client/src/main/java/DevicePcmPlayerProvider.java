import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
	@ObfuscatedName("bi")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = 1521460135
	)
	static int field114;

	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lbd;",
		garbageValue = "2031489257"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lhz;",
		garbageValue = "-1166165948"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0);
			var1 = new EnumComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(Lnb;III)V",
		garbageValue = "589984685"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class105.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.method6924(AsyncRestClient.widgetDefinition, true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var7 * var5 + var8 * var4 >> 11;
					int var10 = var8 * var5 - var4 * var7 >> 11;
					int var11 = Interpreter.field899.vmethod8779() + var9 >> 7;
					int var12 = Interpreter.field899.vmethod8773() - var10 >> 7;
					PacketBufferNode var13 = WorldMapElement.getPacketBufferNode(ClientPacket.MINIMAP_CLICK, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.writeShortAddLE(var12 + class358.topLevelWorldView.baseY);
					var13.packetBuffer.writeShortAdd(var11 + class358.topLevelWorldView.baseX);
					var13.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? (Client.indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(class17.localPlayer.x);
					var13.packetBuffer.writeShort(class17.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(Lnb;IIIIIII)V",
		garbageValue = "198415184"
	)
	static final void method295(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field611) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field611 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !class105.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				class324.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				class324.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				class324.invalidateWidget(var0);
				Client.field611 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				class324.invalidateWidget(var0);
			}
		}

	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)V",
		garbageValue = "-962419780"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0) {
		String var1;
		int var2;
		int var3;
		if (var0.buttonType == 1) {
			var1 = var0.buttonText;
			var2 = var0.id;
			var3 = var0.itemId;
			class194.insertMenuItem(var1, "", 24, 0, 0, var2, var3, false, -1);
		}

		int var4;
		String var9;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var1 = class105.Widget_getSpellActionName(var0);
			if (var1 != null) {
				var9 = HttpAuthenticationHeader.colorStartTag(65280) + var0.field3848;
				var3 = var0.id;
				var4 = var0.itemId;
				class194.insertMenuItem(var1, var9, 25, 0, -1, var3, var4, false, -1);
			}
		}

		if (var0.buttonType == 3) {
			KeyHandler.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			KeyHandler.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			KeyHandler.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			KeyHandler.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		if (var0.isIf3) {
			int var5;
			if (Client.isSpellSelected) {
				if (class166.method3447(class160.getWidgetFlags(var0)) && (GrandExchangeOfferUnitPriceComparator.selectedSpellFlags & 32) == 32) {
					var1 = Client.selectedSpellActionName;
					var9 = Client.selectedSpellName + " " + "->" + " " + var0.dataText;
					var3 = var0.childIndex;
					var4 = var0.id;
					var5 = var0.itemId;
					class194.insertMenuItem(var1, var9, 58, 0, var3, var4, var5, false, -1);
				}
			} else {
				for (int var10 = 9; var10 >= 5; --var10) {
					if (!class141.method3171(class160.getWidgetFlags(var0), var10) && var0.onOp == null) {
						var9 = null;
					} else if (var0.actions != null && var0.actions.length > var10 && var0.actions[var10] != null && var0.actions[var10].trim().length() != 0) {
						var9 = var0.actions[var10];
					} else {
						var9 = null;
					}

					if (var9 != null) {
						String var12 = var0.dataText;
						var5 = var10 + 1;
						int var6 = var0.childIndex;
						int var7 = var0.id;
						int var8 = var0.itemId;
						class194.insertMenuItem(var9, var12, 1007, var5, var6, var7, var8, false, -1);
					}
				}

				var1 = class105.Widget_getSpellActionName(var0);
				if (var1 != null) {
					var9 = var0.dataText;
					var3 = var0.childIndex;
					var4 = var0.id;
					var5 = var0.itemId;
					class194.insertMenuItem(var1, var9, 25, 0, var3, var4, var5, false, -1);
				}

				for (var2 = 4; var2 >= 0; --var2) {
					String var11;
					if (!class141.method3171(class160.getWidgetFlags(var0), var2) && var0.onOp == null) {
						var11 = null;
					} else if (var0.actions != null && var0.actions.length > var2 && var0.actions[var2] != null && var0.actions[var2].trim().length() != 0) {
						var11 = var0.actions[var2];
					} else {
						var11 = null;
					}

					if (var11 != null) {
						class194.insertMenuItem(var11, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry, -1);
					}
				}

				var3 = class160.getWidgetFlags(var0);
				boolean var13 = (var3 & 1) != 0;
				if (var13) {
					KeyHandler.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}

	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-555959200"
	)
	static void method299(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}
}
