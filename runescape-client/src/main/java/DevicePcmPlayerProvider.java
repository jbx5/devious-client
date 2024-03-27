import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("am")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = -181082999
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("qb")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	static class517 field99;

	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lby;",
		garbageValue = "1"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Lig;",
		garbageValue = "99"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-571645870"
	)
	public static void method290() {
		VarbitComposition.VarbitDefinition_cached.clear();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-327851457"
	)
	static int method291(int var0, Script var1, boolean var2) {
		Widget var3 = class243.widgetDefinition.method6281(Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else {
			class341 var4;
			if (var0 == 2617) {
				var4 = var3.method6699();
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var4 != null ? var4.field3655 : 0;
			}

			if (var0 == 2618) {
				var4 = var3.method6699();
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var4 != null ? var4.field3656 : 0;
				return 1;
			} else {
				class347 var7;
				if (var0 == 2619) {
					var7 = var3.method6667();
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6413().method7539() : "";
					return 1;
				} else if (var0 == 2620) {
					var4 = var3.method6699();
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var4 != null ? var4.field3657 : 0;
					return 1;
				} else if (var0 == 2621) {
					var7 = var3.method6667();
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7 != null ? var7.method6423() : 0;
					return 1;
				} else if (var0 == 2622) {
					var7 = var3.method6667();
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7 != null ? var7.method6424() : 0;
					return 1;
				} else if (var0 == 2623) {
					var7 = var3.method6667();
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7 != null ? var7.method6425() : 0;
					return 1;
				} else if (var0 == 2624) {
					var7 = var3.method6667();
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7 != null && var7.method6459() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var7 = var3.method6667();
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6431().method7763() : "";
						return 1;
					} else if (var0 == 2627) {
						var7 = var3.method6667();
						int var5 = var7 != null ? var7.method6559() : 0;
						int var6 = var7 != null ? var7.method6510() : 0;
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 2628) {
						var7 = var3.method6667();
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7 != null ? var7.method6510() : 0;
						return 1;
					} else if (var0 == 2629) {
						var7 = var3.method6667();
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7 != null ? var7.method6427() : 0;
						return 1;
					} else if (var0 == 2630) {
						var7 = var3.method6667();
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7 != null ? var7.method6574() : 0;
						return 1;
					} else if (var0 == 2631) {
						var7 = var3.method6667();
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7 != null ? var7.method6428() : 0;
						return 1;
					} else if (var0 == 2632) {
						var7 = var3.method6667();
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7 != null ? var7.method6429() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 2633) {
							var8 = var3.method6682();
							Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize - 1] = var8 != null ? var8.method364(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var8 = var3.method6682();
							Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize - 1] = var8 != null ? var8.method379((char)Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method6667();
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7 != null && var7.method6416() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-1047926071"
	)
	static int method293(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else {
			return 2;
		}
	}
}
