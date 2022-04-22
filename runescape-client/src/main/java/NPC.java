



import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lft;")

	@Export("definition")
	NPCComposition definition;

	NPC() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(ILgm;I)V", garbageValue = 
	"-1427084845")

	final void method2347(int var1, class193 var2) {
		int var3 = super.pathX[0];
		int var4 = super.pathY[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1) {
			++var4;
		}

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3) {
			--var3;
		}

		if (var1 == 4) {
			++var3;
		}

		if (var1 == 5) {
			--var3;
			--var4;
		}

		if (var1 == 6) {
			--var4;
		}

		if (var1 == 7) {
			++var3;
			--var4;
		}

		if ((super.sequence != (-1)) && (class163.SequenceDefinition_get(super.sequence).field2158 == 1)) {
			super.sequence = -1;
		}

		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) {
			super.pathX[var5] = super.pathX[var5 - 1];
			super.pathY[var5] = super.pathY[var5 - 1];
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
		}

		super.pathX[0] = var3;
		super.pathY[0] = var4;
		super.pathTraversed[0] = var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(B)Liq;", garbageValue = 
	"103")

	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = ((super.sequence != (-1)) && (super.sequenceDelay == 0)) ? class163.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = ((super.movementSequence != (-1)) && ((super.idleSequence != super.movementSequence) || (var1 == null))) ? class163.SequenceDefinition_get(super.movementSequence) : null;
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				if ((super.spotAnimation != (-1)) && (super.spotAnimationFrame != (-1))) {
					Model var4 = ClientPreferences.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.spotAnimationHeight, 0);
						Model[] var5 = new Model[]{ var3, var4 };
						var3 = new Model(var5, 2);
					}
				}

				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				if (((super.field1122 != 0) && (Client.cycle >= super.field1167)) && (Client.cycle < super.field1168)) {
					var3.overrideHue = super.field1169;
					var3.overrideSaturation = super.field1114;
					var3.overrideLuminance = super.field1171;
					var3.overrideAmount = super.field1122;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(IIZI)V", garbageValue = 
	"646080626")

	final void method2348(int var1, int var2, boolean var3) {
		if ((super.sequence != (-1)) && (class163.SequenceDefinition_get(super.sequence).field2158 == 1)) {
			super.sequence = -1;
		}

		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if ((((var4 >= (-8)) && (var4 <= 8)) && (var5 >= (-8))) && (var5 <= 8)) {
				if (super.pathLength < 9) {
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) {
					super.pathX[var6] = super.pathX[var6 - 1];
					super.pathY[var6] = super.pathY[var6 - 1];
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
				}

				super.pathX[0] = var1;
				super.pathY[0] = var2;
				super.pathTraversed[0] = class193.field2185;
				return;
			}
		}

		super.pathLength = 0;
		super.field1170 = 0;
		super.field1179 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = (super.pathX[0] * 128) + (super.field1150 * 64);
		super.y = (super.pathY[0] * 128) + (super.field1150 * 64);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-323504433")

	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"20")

	static void method2360() {
		Tiles.Tiles_underlays = null;
		class14.Tiles_overlays = null;
		class147.Tiles_shapes = null;
		Tiles.field983 = null;
		class420.field4545 = null;
		class392.field4374 = null;
		Tiles.field998 = null;
		BufferedNetSocket.Tiles_hue = null;
		class116.Tiles_saturation = null;
		Tiles.Tiles_lightness = null;
		class357.Tiles_hueMultiplier = null;
		class361.field4213 = null;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"-1163810213")

	static int method2361(int var0, Script var1, boolean var2) {
		Widget var3 = (var2) ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = WorldMapID.Widget_unpackTargetMask(class326.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			--var4;
			if (((var3.actions != null) && (var4 < var3.actions.length)) && (var3.actions[var4] != null)) {
				Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
			}

			return 1;
		}
	}
}