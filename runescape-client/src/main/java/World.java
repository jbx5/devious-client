import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cr")
@Implements("World")
public class World {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -571562711
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1618840033
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("at")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("au")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	static Bounds field824;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2102573495
	)
	@Export("id")
	int id;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1160988359
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1508153235
	)
	@Export("population")
	int population;
	@ObfuscatedName("ap")
	@Export("host")
	String host;
	@ObfuscatedName("ab")
	@Export("activity")
	String activity;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1651324629
	)
	@Export("location")
	int location;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -266651193
	)
	@Export("index")
	int index;
	@ObfuscatedName("ai")
	String field834;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (class545.field5375.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-91"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (class545.field5380.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "158"
	)
	boolean method1933() {
		return (class545.field5370.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-339652937"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (class545.field5366.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2131423672"
	)
	boolean method1930() {
		return (class545.field5368.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1114259502"
	)
	boolean method1931() {
		return (class545.field5393.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-289452616"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (class545.field5389.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1682761819"
	)
	boolean method1950() {
		return (class545.field5376.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-938374494"
	)
	boolean method1934() {
		return (class545.field5372.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-48"
	)
	boolean method1935() {
		return (class545.field5391.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1652291643"
	)
	static int method1981(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class464.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else {
			class360 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) {
				if (var3.type == 12) {
					var7 = var3.method7268();
					if (var7 != null) {
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var7.method7048().method8367();
						return 1;
					}
				}

				Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var3.text;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.scrollWidth;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.scrollHeight;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.modelZoom;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.modelAngleX;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.modelAngleZ;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.modelAngleY;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.transparencyTop;
				return 1;
			} else if (var0 == 1610) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.transparencyBot;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.color;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.color2;
				return 1;
			} else if (var0 == 1613) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
				return 1;
			} else {
				class354 var4;
				if (var0 == 1617) {
					var4 = var3.method7303();
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4 != null ? var4.field3774 : 0;
				}

				if (var0 == 1618) {
					var4 = var3.method7303();
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4 != null ? var4.field3771 : 0;
					return 1;
				} else if (var0 == 1619) {
					var7 = var3.method7268();
					Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var7 != null ? var7.method7002().method8367() : "";
					return 1;
				} else if (var0 == 1620) {
					var4 = var3.method7303();
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4 != null ? var4.field3772 : 0;
					return 1;
				} else if (var0 == 1621) {
					var7 = var3.method7268();
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var7 != null ? var7.method7123() : 0;
					return 1;
				} else if (var0 == 1622) {
					var7 = var3.method7268();
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var7 != null ? var7.method7013() : 0;
					return 1;
				} else if (var0 == 1623) {
					var7 = var3.method7268();
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var7 != null ? var7.method7211() : 0;
					return 1;
				} else if (var0 == 1624) {
					var7 = var3.method7268();
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var7 != null && var7.method7004() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var7 = var3.method7268();
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var7 != null ? var7.method7003().method8547() : "";
						return 1;
					} else if (var0 == 1627) {
						var7 = var3.method7268();
						int var5 = var7 != null ? var7.method7087() : 0;
						int var6 = var7 != null ? var7.method7007() : 0;
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 1628) {
						var7 = var3.method7268();
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var7 != null ? var7.method7007() : 0;
						return 1;
					} else if (var0 == 1629) {
						var7 = var3.method7268();
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var7 != null ? var7.method7093() : 0;
						return 1;
					} else if (var0 == 1630) {
						var7 = var3.method7268();
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var7 != null ? var7.method7015() : 0;
						return 1;
					} else if (var0 == 1631) {
						var7 = var3.method7268();
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var7 != null ? var7.method7017() : 0;
						return 1;
					} else if (var0 == 1632) {
						var7 = var3.method7268();
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var7 != null ? var7.method7052() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 1633) {
							var8 = var3.method7270();
							Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize - 1] = var8 != null ? var8.method381(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var8 = var3.method7270();
							Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize - 1] = var8 != null ? var8.method392((char)Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method7268();
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var7 != null && var7.method7005() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1990517158"
	)
	static int method1949(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class464.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.childIndex;
			return 1;
		} else if (var0 == 1707) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.method7257() ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return FileSystem.method4500(var3);
		} else {
			return var0 == 1709 ? GrandExchangeOfferUnitPriceComparator.method7722(var3) : 2;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-2124528546"
	)
	static int method1983(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Script.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					HttpRequest.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class461.clientPreferences.getWindowMode();
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--class320.Interpreter_intStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class461.clientPreferences.updateWindowMode(var3);
				}

				return 1;
			}
		}
	}
}
