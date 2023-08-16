import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ks")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1160500229
	)
	@Export("width")
	int width;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 944463717
	)
	@Export("height")
	int height;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1279455469
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 827095241
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	final WorldMapRenderer this$0;

	@ObfuscatedSignature(
		descriptor = "(Ljd;)V"
	)
	WorldMapRectangle(WorldMapRenderer var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-213889891"
	)
	static int method5479(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? GameObject.scriptDotWidget : SceneTilePaint.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else {
			class329 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) {
				if (var3.type == 12) {
					var7 = var3.method6532();
					if (var7 != null) {
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var7.method6230().method7282();
						return 1;
					}
				}

				Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3.text;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.scrollWidth;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.scrollHeight;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.modelZoom;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.modelAngleX;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.modelAngleZ;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.modelAngleY;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.transparencyTop;
				return 1;
			} else if (var0 == 1610) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.transparencyBot;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.color;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.color2;
				return 1;
			} else if (var0 == 1613) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
				return 1;
			} else {
				class324 var4;
				if (var0 == 1617) {
					var4 = var3.method6416();
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4 != null ? var4.field3547 : 0;
				}

				if (var0 == 1618) {
					var4 = var3.method6416();
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4 != null ? var4.field3548 : 0;
					return 1;
				} else if (var0 == 1619) {
					var7 = var3.method6532();
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6155().method7282() : "";
					return 1;
				} else if (var0 == 1620) {
					var4 = var3.method6416();
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4 != null ? var4.field3549 : 0;
					return 1;
				} else if (var0 == 1621) {
					var7 = var3.method6532();
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6326() : 0;
					return 1;
				} else if (var0 == 1622) {
					var7 = var3.method6532();
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6298() : 0;
					return 1;
				} else if (var0 == 1623) {
					var7 = var3.method6532();
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6362() : 0;
					return 1;
				} else if (var0 == 1624) {
					var7 = var3.method6532();
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null && var7.method6157() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var7 = var3.method6532();
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6120().method7542() : "";
						return 1;
					} else if (var0 == 1627) {
						var7 = var3.method6532();
						int var5 = var7 != null ? var7.method6161() : 0;
						int var6 = var7 != null ? var7.method6160() : 0;
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 1628) {
						var7 = var3.method6532();
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6160() : 0;
						return 1;
					} else if (var0 == 1629) {
						var7 = var3.method6532();
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6123() : 0;
						return 1;
					} else if (var0 == 1630) {
						var7 = var3.method6532();
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6168() : 0;
						return 1;
					} else if (var0 == 1631) {
						var7 = var3.method6532();
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6261() : 0;
						return 1;
					} else if (var0 == 1632) {
						var7 = var3.method6532();
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6114() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 1633) {
							var8 = var3.method6401();
							Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1] = var8 != null ? var8.method389(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var8 = var3.method6401();
							Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1] = var8 != null ? var8.method395((char)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method6532();
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null && var7.method6158() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "853160118"
	)
	static void method5478() {
		if (Canvas.worldMap != null) {
			Canvas.worldMap.method8505(HealthBar.Client_plane, UrlRequester.baseX * 64 + (VarbitComposition.localPlayer.x >> 7), class47.baseY * 64 + (VarbitComposition.localPlayer.y >> 7), false);
			Canvas.worldMap.loadCache();
		}

	}
}
