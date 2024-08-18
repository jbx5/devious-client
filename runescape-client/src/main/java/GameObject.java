import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("he")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -477977489
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1383334743
	)
	@Export("z")
	int z;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1275599435
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -793585629
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1118062125
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -401987407
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1236768687
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1462368221
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -323195385
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2113574463
	)
	int field2310;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1030198055
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 8385204499142695701L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 186672813
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "925086899"
	)
	public static int method4490(int var0) {
		return class330.field3547[var0];
	}

	@ObfuscatedName("ay")
	public static String method4489(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (0L == var0 % 37L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5 = new StringBuilder(var2);

				while (0L != var0) {
					long var6 = var0;
					var0 /= 37L;
					var5.append(class418.base37Table[(int)(var6 - 37L * var0)]);
				}

				return var5.reverse().toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Loy;",
		garbageValue = "-1286885644"
	)
	public static class380[] method4487() {
		return new class380[]{class380.field4404, class380.field4405, class380.field4403, class380.field4401};
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZI)I",
		garbageValue = "1448380178"
	)
	static int method4488(int var0, Script var1, boolean var2) {
		Widget var3 = FloorUnderlayDefinition.widgetDefinition.method6544(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else {
			class352 var4;
			if (var0 == 2617) {
				var4 = var3.method6972();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3721 : 0;
			}

			if (var0 == 2618) {
				var4 = var3.method6972();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3720 : 0;
				return 1;
			} else {
				class358 var7;
				if (var0 == 2619) {
					var7 = var3.method6971();
					Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6824().method8107() : "";
					return 1;
				} else if (var0 == 2620) {
					var4 = var3.method6972();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3722 : 0;
					return 1;
				} else if (var0 == 2621) {
					var7 = var3.method6971();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6699() : 0;
					return 1;
				} else if (var0 == 2622) {
					var7 = var3.method6971();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6700() : 0;
					return 1;
				} else if (var0 == 2623) {
					var7 = var3.method6971();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6701() : 0;
					return 1;
				} else if (var0 == 2624) {
					var7 = var3.method6971();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6691() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var7 = var3.method6971();
						Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6881().method8267() : "";
						return 1;
					} else if (var0 == 2627) {
						var7 = var3.method6971();
						int var5 = var7 != null ? var7.method6695() : 0;
						int var6 = var7 != null ? var7.method6694() : 0;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 2628) {
						var7 = var3.method6971();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6694() : 0;
						return 1;
					} else if (var0 == 2629) {
						var7 = var3.method6971();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6678() : 0;
						return 1;
					} else if (var0 == 2630) {
						var7 = var3.method6971();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6702() : 0;
						return 1;
					} else if (var0 == 2631) {
						var7 = var3.method6971();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6704() : 0;
						return 1;
					} else if (var0 == 2632) {
						var7 = var3.method6971();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6705() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 2633) {
							var8 = var3.method6973();
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method364(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var8 = var3.method6973();
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method372((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method6971();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6692() ? 1 : 0;
					return 1;
				}
			}
		}
	}
}
