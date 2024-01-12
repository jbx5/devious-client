import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kt")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2116611681
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -240376913
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 864182291
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -882964857
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 103642191
	)
	@Export("type")
	int type;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1805399985
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1018221453
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -746426085
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1064808971
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 214057975
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1978825721
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1704694173
	)
	int field2927;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 121621181
	)
	int field2916;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -226127811
	)
	int field2930;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 637558021
	)
	int field2928;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -635496377
	)
	int field2932;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1753962731
	)
	int field2919;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1124977837
	)
	int field2933;

	Occluder() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-82"
	)
	static final int method5588(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "36"
	)
	static int method5586(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = class380.widgetDefinition.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? class31.scriptDotWidget : class185.scriptActiveWidget;
		}

		String var4 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
		int[] var5 = null;
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]) {
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var9 = new Object[var4.length() + 1];

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) {
			if (var4.charAt(var7 - 1) == 's') {
				var9[var7] = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
			} else {
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
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
			var3.field3824 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
			var3.field3817 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
			var3.field3818 = var9;
		} else if (var0 == 1430) {
			var3.field3813 = var9;
		} else if (var0 == 1431) {
			var3.field3814 = var9;
		} else if (var0 == 1434) {
			var3.field3825 = var9;
		} else if (var0 == 1435) {
			var3.field3809 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) {
				return 2;
			}

			class342 var8 = var3.method6716();
			if (var8 != null) {
				if (var0 == 1436) {
					var8.field3633 = var9;
				} else if (var0 == 1437) {
					var8.field3634 = var9;
				} else if (var0 == 1438) {
					var8.field3629 = var9;
				} else if (var0 == 1439) {
					var8.field3632 = var9;
				}
			}
		}

		var3.hasListener = true;
		return 1;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-55"
	)
	static int method5590(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = class341.ItemDefinition_get(var3).name;
			return 1;
		} else {
			ItemComposition var5;
			int var6;
			if (var0 == ScriptOpcodes.OC_OP) {
				UserComparator6.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				var5 = class341.ItemDefinition_get(var3);
				if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				UserComparator6.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				var5 = class341.ItemDefinition_get(var3);
				if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class341.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class341.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					var4 = class341.ItemDefinition_get(var3);
					if (var4.noteTemplate == -1 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					var4 = class341.ItemDefinition_get(var3);
					if (var4.noteTemplate >= 0 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class341.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					var4 = class341.ItemDefinition_get(var3);
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					var4 = class341.ItemDefinition_get(var3);
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var7 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
					var6 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					class102.findItemDefinitions(var7, var6 == 1);
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class31.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						AsyncHttpResponse.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						var6 = class341.ItemDefinition_get(var3).getShiftClickIndex();
						if (var6 == -1) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var6;
						} else {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var6 + 1;
						}

						return 1;
					} else if (var0 == 4214) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class341.ItemDefinition_get(var3).maleModel;
						return 1;
					} else if (var0 == 4215) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class341.ItemDefinition_get(var3).maleModel1;
						return 1;
					} else if (var0 == 4216) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class341.ItemDefinition_get(var3).maleModel2;
						return 1;
					} else if (var0 == 4217) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						var4 = class341.ItemDefinition_get(var3);
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.field2196;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (class317.foundItemIds != null && AsyncHttpResponse.foundItemIndex < class31.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class317.foundItemIds[++AsyncHttpResponse.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-981596243"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class482.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeShortAddLE(var1);
		var2.packetBuffer.writeInt(var0);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1982035225"
	)
	static final void method5589() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) {
			Player var1 = Client.players[Players.Players_indices[var0]];
			var1.clearIsFriend();
		}

		SecureUrlRequester.method2916();
		if (ClientPreferences.friendsChat != null) {
			ClientPreferences.friendsChat.clearFriends();
		}

	}
}
