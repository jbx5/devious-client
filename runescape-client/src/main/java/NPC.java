import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.util.Date;
import net.runelite.mapping.Export;
@ObfuscatedName("co")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lfj;")
	@Export("definition")
	NPCComposition definition;

	@ObfuscatedName("v")
	String field1261;

	NPC() {
		this.field1261 = "";
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-1916980767")
	void method2373(String var1) {
		this.field1261 = (var1 == null) ? "" : var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)Lhy;", garbageValue = "1081110576")
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = (super.sequence != -1 && super.sequenceDelay == 0) ? ScriptFrame.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = (super.movementSequence == -1 || super.movementSequence == super.idleSequence && var1 != null) ? null : ScriptFrame.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					Model var4 = ObjectSound.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.spotAnimationHeight, 0);
						Model[] var5 = new Model[]{ var3, var4 };
						var3 = new Model(var5, 2);
					}
				}
				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}
				if (super.field1133 != 0 && Client.cycle >= super.field1189 && Client.cycle < super.field1135) {
					var3.overrideHue = super.field1191;
					var3.overrideSaturation = super.field1192;
					var3.overrideLuminance = super.field1193;
					var3.overrideAmount = super.field1133;
				} else {
					var3.overrideAmount = 0;
				}
				return var3;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;", garbageValue = "56")
	final String method2360() {
		if (!this.field1261.isEmpty()) {
			return this.field1261;
		} else {
			NPCComposition var1 = this.definition;
			if (var1.transforms != null) {
				var1 = var1.transform();
				if (var1 == null) {
					var1 = this.definition;
				}
			}
			return var1.name;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(ILgn;I)V", garbageValue = "376054191")
	final void method2361(int var1, class192 var2) {
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
		if (super.sequence != -1 && ScriptFrame.SequenceDefinition_get(super.sequence).field2188 == 1) {
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(IIZI)V", garbageValue = "1894796101")
	final void method2362(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && ScriptFrame.SequenceDefinition_get(super.sequence).field2188 == 1) {
			super.sequence = -1;
		}
		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
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
				super.pathTraversed[0] = class192.field2212;
				return;
			}
		}
		super.pathLength = 0;
		super.field1203 = 0;
		super.field1202 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.pathX[0] * 128 + super.field1205 * 64;
		super.y = super.field1205 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "9013641")
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "17")
	public static void method2365() {
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}
	}

	@ObfuscatedName("c")
	public static String method2382(long var0) {
		Calendar.Calendar_calendar.setTime(new Date(var0));
		int var2 = Calendar.Calendar_calendar.get(7);
		int var3 = Calendar.Calendar_calendar.get(5);
		int var4 = Calendar.Calendar_calendar.get(2);
		int var5 = Calendar.Calendar_calendar.get(1);
		int var6 = Calendar.Calendar_calendar.get(11);
		int var7 = Calendar.Calendar_calendar.get(12);
		int var8 = Calendar.Calendar_calendar.get(13);
		return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-839633711")
	public static void method2379() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(descriptor = "(Lkb;IIII)V", garbageValue = "1069482621")
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				class267.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}
		}
	}
}