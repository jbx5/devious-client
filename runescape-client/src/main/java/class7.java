import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ab")
public class class7 {
	@ObfuscatedName("af")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("ak")
	ExecutorService field19;
	@ObfuscatedName("al")
	Future field22;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lua;"
	)
	final Buffer field20;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	final class3 field18;

	@ObfuscatedSignature(
		descriptor = "(Lua;Laz;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field19 = Executors.newSingleThreadExecutor();
		this.field20 = var1;
		this.field18 = var2;
		this.method43();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1948917019"
	)
	public boolean method40() {
		return this.field22.isDone();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public void method41() {
		this.field19.shutdown();
		this.field19 = null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)Lua;",
		garbageValue = "18520"
	)
	public Buffer method42() {
		try {
			return (Buffer)this.field22.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "168342861"
	)
	void method43() {
		this.field22 = this.field19.submit(new class1(this, this.field20, this.field18));
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "89"
	)
	static int method45(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : SecureRandomSSLSocket.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else {
			class355 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) {
				if (var3.type == 12) {
					var7 = var3.method6942();
					if (var7 != null) {
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var7.method6665().method8000();
						return 1;
					}
				}

				Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var3.text;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.scrollWidth;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.scrollHeight;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.modelZoom;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.modelAngleX;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.modelAngleZ;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.modelAngleY;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.transparencyTop;
				return 1;
			} else if (var0 == 1610) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.transparencyBot;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.color;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.color2;
				return 1;
			} else if (var0 == 1613) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
				return 1;
			} else {
				class349 var4;
				if (var0 == 1617) {
					var4 = var3.method6943();
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4 != null ? var4.field3731 : 0;
				}

				if (var0 == 1618) {
					var4 = var3.method6943();
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4 != null ? var4.field3732 : 0;
					return 1;
				} else if (var0 == 1619) {
					var7 = var3.method6942();
					Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6666().method8000() : "";
					return 1;
				} else if (var0 == 1620) {
					var4 = var3.method6943();
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4 != null ? var4.field3733 : 0;
					return 1;
				} else if (var0 == 1621) {
					var7 = var3.method6942();
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7 != null ? var7.method6676() : 0;
					return 1;
				} else if (var0 == 1622) {
					var7 = var3.method6942();
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7 != null ? var7.method6677() : 0;
					return 1;
				} else if (var0 == 1623) {
					var7 = var3.method6942();
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7 != null ? var7.method6678() : 0;
					return 1;
				} else if (var0 == 1624) {
					var7 = var3.method6942();
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7 != null && var7.method6793() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var7 = var3.method6942();
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6667().method8254() : "";
						return 1;
					} else if (var0 == 1627) {
						var7 = var3.method6942();
						int var5 = var7 != null ? var7.method6822() : 0;
						int var6 = var7 != null ? var7.method6671() : 0;
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 1628) {
						var7 = var3.method6942();
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7 != null ? var7.method6671() : 0;
						return 1;
					} else if (var0 == 1629) {
						var7 = var3.method6942();
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7 != null ? var7.method6680() : 0;
						return 1;
					} else if (var0 == 1630) {
						var7 = var3.method6942();
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7 != null ? var7.method6679() : 0;
						return 1;
					} else if (var0 == 1631) {
						var7 = var3.method6942();
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7 != null ? var7.method6681() : 0;
						return 1;
					} else if (var0 == 1632) {
						var7 = var3.method6942();
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7 != null ? var7.method6798() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 1633) {
							var8 = var3.method7041();
							Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize - 1] = var8 != null ? var8.method400(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var8 = var3.method7041();
							Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize - 1] = var8 != null ? var8.method386((char)Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method6942();
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7 != null && var7.method6731() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-41"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (AsyncRestClient.widgetDefinition.loadInterface(var0)) {
				Widget[] var1 = AsyncRestClient.widgetDefinition.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						class144.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(Ldt;ZB)V",
		garbageValue = "-15"
	)
	static final void method53(class101 var0, boolean var1) {
		for (int var2 = 0; var2 < var0.field1344; ++var2) {
			class103 var3 = var0.field1343[var0.field1345[var2]];
			if (var3 != null && var3.isVisible() && var3.field1359.isVisible == var1 && var3.field1359.transformIsVisible()) {
				int var4 = var3.x >> 7;
				int var5 = var3.y >> 7;
				if (var4 >= 0 && var4 < var0.field1346 && var5 >= 0 && var5 < var0.field1330) {
					if (var3.field1208 == 1 && (var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.field1338[var4][var5] == Client.viewportDrawCount) {
							continue;
						}

						var0.field1338[var4][var5] = Client.viewportDrawCount;
					}

					long var6 = KitDefinition.method3900(0, 0, 1, !var3.field1359.isInteractable, var0.field1345[var2], var0.field1335);
					var3.field1264 = Client.cycle;
					var0.field1331.drawEntity(var0.field1348, var3.x, var3.y, SoundSystem.method856(var0, var3.field1208 * 64 - 64 + var3.x, var3.field1208 * 64 - 64 + var3.y, var0.field1348), var3.field1208 * 64 - 64 + 60, var3, var3.field1209, var6, var3.field1207);
				}
			}
		}

	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(Lnb;IIB)V",
		garbageValue = "-19"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) {
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) {
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) {
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) {
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) {
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14);
		}

		if (var0.yAlignment == 0) {
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) {
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) {
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14;
		} else if (var0.yAlignment == 4) {
			var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14);
		}

	}
}
