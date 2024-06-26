import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("av")
public class class7 {
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("aq")
	ExecutorService field22;
	@ObfuscatedName("ad")
	Future field28;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	final Buffer field23;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	final class3 field27;

	@ObfuscatedSignature(
		descriptor = "(Lvp;Lak;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field22 = Executors.newSingleThreadExecutor();
		this.field23 = var1;
		this.field27 = var2;
		this.method45();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1439503173"
	)
	public boolean method42() {
		return this.field28.isDone();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1847280549"
	)
	public void method43() {
		this.field22.shutdown();
		this.field22 = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lvp;",
		garbageValue = "5"
	)
	public Buffer method44() {
		try {
			return (Buffer)this.field28.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-49"
	)
	void method45() {
		this.field28 = this.field22.submit(new class1(this, this.field23, this.field27));
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZB)I",
		garbageValue = "55"
	)
	static int method59(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = ModeWhere.widgetDefinition.method6519(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : class30.scriptActiveWidget;
		}

		String var4 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
		int[] var5 = null;
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]) {
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var9 = new Object[var4.length() + 1];

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) {
			if (var4.charAt(var7 - 1) == 's') {
				var9[var7] = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
			} else {
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
		if (var7 != -1) {
			var9[0] = new Integer(var7);
		} else {
			var9 = null;
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) {
			var3.onHold = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) {
			var3.onRelease = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) {
			var3.onMouseOver = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) {
			var3.onMouseLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) {
			var3.onDrag = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) {
			var3.onTargetLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) {
			var3.onVarTransmit = var9;
			var3.varTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) {
			var3.onTimer = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) {
			var3.onOp = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
			var3.onDragComplete = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) {
			var3.onClickRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
			var3.onMouseRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) {
			var3.onInvTransmit = var9;
			var3.invTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) {
			var3.onStatTransmit = var9;
			var3.statTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
			var3.onScroll = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
			var3.onChatTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) {
			var3.onKey = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
			var3.onFriendTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
			var3.onClanTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
			var3.onMiscTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) {
			var3.onDialogAbort = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) {
			var3.onSubChange = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
			var3.onStockTransmit = var9;
		} else if (var0 == 1426) {
			var3.field3954 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
			var3.field3947 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
			var3.field3865 = var9;
		} else if (var0 == 1430) {
			var3.field3840 = var9;
		} else if (var0 == 1431) {
			var3.field3829 = var9;
		} else if (var0 == 1434) {
			var3.field3955 = var9;
		} else if (var0 == 1435) {
			var3.field3939 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) {
				return 2;
			}

			class354 var8 = var3.method6892();
			if (var8 != null) {
				if (var0 == 1436) {
					var8.field3768 = var9;
				} else if (var0 == 1437) {
					var8.field3763 = var9;
				} else if (var0 == 1438) {
					var8.field3769 = var9;
				} else if (var0 == 1439) {
					var8.field3766 = var9;
				}
			}
		}

		var3.hasListener = true;
		return 1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqh;Lqh;B)V",
		garbageValue = "1"
	)
	static void method58(Font var0, Font var1) {
		int var4;
		int var5;
		if (class562.worldSelectBackSprites == null) {
			Archive var3 = archive8;
			SpritePixels[] var2;
			if (!var3.isValidFileName("sl_back", "")) {
				var2 = null;
			} else {
				var4 = var3.getGroupId("sl_back");
				var5 = var3.getFileId(var4, "");
				var2 = ClanMate.method8542(var3, var4, var5);
			}

			class562.worldSelectBackSprites = var2;
		}

		if (class105.worldSelectFlagSprites == null) {
			class105.worldSelectFlagSprites = WorldMapArchiveLoader.getFont(archive8, "sl_flags", "");
		}

		if (class76.worldSelectArrows == null) {
			class76.worldSelectArrows = WorldMapArchiveLoader.getFont(archive8, "sl_arrows", "");
		}

		if (GrandExchangeOfferUnitPriceComparator.worldSelectStars == null) {
			GrandExchangeOfferUnitPriceComparator.worldSelectStars = WorldMapArchiveLoader.getFont(archive8, "sl_stars", "");
		}

		if (class31.worldSelectLeftSprite == null) {
			class31.worldSelectLeftSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(archive8, "leftarrow", "");
		}

		if (Calendar.worldSelectRightSprite == null) {
			Calendar.worldSelectRightSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
		if (GrandExchangeOfferUnitPriceComparator.worldSelectStars != null) {
			GrandExchangeOfferUnitPriceComparator.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
			GrandExchangeOfferUnitPriceComparator.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
		}

		if (class76.worldSelectArrows != null) {
			int var22 = Login.xPadding + 280;
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
				class76.worldSelectArrows[2].drawAt(var22, 4);
			} else {
				class76.worldSelectArrows[0].drawAt(var22, 4);
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
				class76.worldSelectArrows[3].drawAt(var22 + 15, 4);
			} else {
				class76.worldSelectArrows[1].drawAt(var22 + 15, 4);
			}

			var0.draw("World", var22 + 32, 17, 16777215, -1);
			int var23 = Login.xPadding + 390;
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
				class76.worldSelectArrows[2].drawAt(var23, 4);
			} else {
				class76.worldSelectArrows[0].drawAt(var23, 4);
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
				class76.worldSelectArrows[3].drawAt(var23 + 15, 4);
			} else {
				class76.worldSelectArrows[1].drawAt(var23 + 15, 4);
			}

			var0.draw("Players", var23 + 32, 17, 16777215, -1);
			var4 = Login.xPadding + 500;
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
				class76.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				class76.worldSelectArrows[0].drawAt(var4, 4);
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
				class76.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				class76.worldSelectArrows[1].drawAt(var4 + 15, 4);
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1);
			var5 = Login.xPadding + 610;
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
				class76.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				class76.worldSelectArrows[0].drawAt(var5, 4);
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
				class76.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				class76.worldSelectArrows[1].drawAt(var5 + 15, 4);
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1);
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
		Login.hoveredWorldIndex = -1;
		if (class562.worldSelectBackSprites != null) {
			byte var26 = 88;
			byte var27 = 19;
			var4 = 765 / (var26 + 1) - 1;
			var5 = 480 / (var27 + 1);

			int var6;
			int var7;
			do {
				var6 = var5;
				var7 = var4;
				if (var5 * (var4 - 1) >= World.World_count) {
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}
			} while(var6 != var5 || var4 != var7);

			var6 = (765 - var4 * var26) / (var4 + 1);
			if (var6 > 5) {
				var6 = 5;
			}

			var7 = (480 - var5 * var27) / (var5 + 1);
			if (var7 > 5) {
				var7 = 5;
			}

			int var8 = (765 - var26 * var4 - var6 * (var4 - 1)) / 2;
			int var9 = (480 - var27 * var5 - var7 * (var5 - 1)) / 2;
			int var10 = (var5 + World.World_count - 1) / var5;
			Login.worldSelectPagesCount = var10 - var4;
			if (class31.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
				class31.worldSelectLeftSprite.drawAt(8, class1.canvasHeight / 2 - class31.worldSelectLeftSprite.subHeight / 2);
			}

			if (Calendar.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
				Calendar.worldSelectRightSprite.drawAt(class74.canvasWidth - Calendar.worldSelectRightSprite.subWidth - 8, class1.canvasHeight / 2 - Calendar.worldSelectRightSprite.subHeight / 2);
			}

			int var11 = var9 + 23;
			int var12 = var8 + Login.xPadding;
			int var13 = 0;
			boolean var14 = false;
			int var15 = Login.worldSelectPage;

			int var16;
			for (var16 = var15 * var5; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) {
				World var17 = class357.World_worlds[var16];
				boolean var18 = true;
				String var19 = Integer.toString(var17.population);
				if (var17.population == -1) {
					var19 = "OFF";
					var18 = false;
				} else if (var17.population > 1980) {
					var19 = "FULL";
					var18 = false;
				}

				class111 var20 = null;
				int var21 = 0;
				if (var17.isBeta()) {
					var20 = var17.isMembersOnly() ? class111.field1427 : class111.field1432;
				} else if (var17.isDeadman()) {
					var20 = var17.isMembersOnly() ? class111.field1435 : class111.field1434;
				} else if (var17.method1850()) {
					var21 = 16711680;
					var20 = var17.isMembersOnly() ? class111.field1420 : class111.field1426;
				} else if (var17.method1852()) {
					var20 = var17.isMembersOnly() ? class111.field1424 : class111.field1428;
				} else if (var17.isPvp()) {
					var20 = var17.isMembersOnly() ? class111.field1423 : class111.field1422;
				} else if (var17.method1881()) {
					var20 = var17.isMembersOnly() ? class111.field1429 : class111.field1430;
				} else if (var17.method1854()) {
					var20 = var17.isMembersOnly() ? class111.field1390 : class111.field1437;
				}

				if (var20 == null || var20.field1436 >= class562.worldSelectBackSprites.length) {
					var20 = var17.isMembersOnly() ? class111.field1421 : class111.field1431;
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var12 + var26 && MouseHandler.MouseHandler_y < var27 + var11 && var18) {
					Login.hoveredWorldIndex = var16;
					class562.worldSelectBackSprites[var20.field1436].drawTransOverlayAt(var12, var11, 128, 16777215);
					var14 = true;
				} else {
					class562.worldSelectBackSprites[var20.field1436].drawAt(var12, var11);
				}

				if (class105.worldSelectFlagSprites != null) {
					class105.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var27 / 2 + var11 + 5, var21, -1);
				var1.drawCentered(var19, var12 + 60, var27 / 2 + var11 + 5, 268435455, -1);
				var11 = var11 + var27 + var7;
				++var13;
				if (var13 >= var5) {
					var11 = var9 + 23;
					var12 = var12 + var26 + var6;
					var13 = 0;
					++var15;
				}
			}

			if (var14) {
				var16 = var1.stringWidth(class357.World_worlds[Login.hoveredWorldIndex].activity) + 6;
				int var24 = var1.ascent + 8;
				int var25 = MouseHandler.MouseHandler_y + 25;
				if (var25 + var24 > 480) {
					var25 = MouseHandler.MouseHandler_y - 25 - var24;
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 16777120);
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 0);
				var1.drawCentered(class357.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1);
			}
		}

	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1485745339"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (ModeWhere.widgetDefinition.loadInterface(var0)) {
				Widget[] var1 = ModeWhere.widgetDefinition.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						Varps.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-25"
	)
	static final void method55(boolean var0) {
		class157.method3347();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = class170.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.hadNetworkError = true;
				}
			}

		}
	}
}
