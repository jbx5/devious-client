import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gg")
public class class166 extends class147 {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 755505003
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1184575361
	)
	int field1820;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfu;)V"
	)
	class166(class150 var1) {
		this.this$0 = var1;
		this.field1820 = -1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "1738227110"
	)
	void vmethod3486(Buffer var1) {
		this.field1820 = var1.readUnsignedShort();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgc;B)V",
		garbageValue = "100"
	)
	void vmethod3490(ClanSettings var1) {
		var1.method3370(this.field1820);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-13"
	)
	public static boolean method3447(int var0) {
		return (var0 >> 21 & 1) != 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-2020334192"
	)
	static int method3443(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = AsyncRestClient.widgetDefinition.method6536(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : SecureRandomSSLSocket.scriptActiveWidget;
		}

		String var4 = Interpreter.Interpreter_stringStack[--Interpreter_stringStackSize];
		int[] var5 = null;
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]) {
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var9 = new Object[var4.length() + 1];

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) {
			if (var4.charAt(var7 - 1) == 's') {
				var9[var7] = Interpreter.Interpreter_stringStack[--Interpreter_stringStackSize];
			} else {
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
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
			var3.field3904 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
			var3.field3931 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
			var3.field3932 = var9;
		} else if (var0 == 1430) {
			var3.field3927 = var9;
		} else if (var0 == 1431) {
			var3.field3928 = var9;
		} else if (var0 == 1434) {
			var3.field3939 = var9;
		} else if (var0 == 1435) {
			var3.field3957 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) {
				return 2;
			}

			class353 var8 = var3.method6945();
			if (var8 != null) {
				if (var0 == 1436) {
					var8.field3753 = var9;
				} else if (var0 == 1437) {
					var8.field3749 = var9;
				} else if (var0 == 1438) {
					var8.field3752 = var9;
				} else if (var0 == 1439) {
					var8.field3750 = var9;
				}
			}
		}

		var3.hasListener = true;
		return 1;
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Ldt;IIIS)V",
		garbageValue = "188"
	)
	@Export("updateItemPile2")
	static final void updateItemPile2(WorldView var0, int var1, int var2, int var3) {
		NodeDeque var4 = var0.groundItems[var1][var2][var3];
		if (var4 == null) {
			var0.scene.removeGroundItemPile(var1, var2, var3);
		} else {
			long var5 = -99999999L;
			TileItem var7 = null;

			TileItem var8;
			for (var8 = (TileItem)var4.last(); var8 != null; var8 = (TileItem)var4.previous()) {
				ItemComposition var9 = KeyHandler.ItemDefinition_get(var8.id);
				long var13 = (long)var9.price;
				if (var9.isStackable == 1) {
					var13 *= var8.quantity < Integer.MAX_VALUE ? (long)(var8.quantity + 1) : (long)var8.quantity;
				}

				if (var13 > var5) {
					var5 = var13;
					var7 = var8;
				}
			}

			if (var7 == null) {
				var0.scene.removeGroundItemPile(var1, var2, var3);
			} else {
				var4.addLast(var7);
				TileItem var15 = null;
				TileItem var10 = null;

				for (var8 = (TileItem)var4.last(); var8 != null; var8 = (TileItem)var4.previous()) {
					if (var8.id != var7.id) {
						if (var15 == null) {
							var15 = var8;
						}

						if (var8.id != var15.id && var10 == null) {
							var10 = var8;
						}
					}
				}

				long var11 = KitDefinition.calculateTag(var2, var3, 3, false, 0, var0.id);
				var0.scene.newGroundItemPile(var1, var2, var3, SoundSystem.getTileHeight(var0, var2 * 128 + 64, var3 * 128 + 64, var1), var7, var11, var15, var10);
			}
		}
	}
}
