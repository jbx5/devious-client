



import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public class class119 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Ldo;")

	static final class119 field1457;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Ldo;")

	static final class119 field1454;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Ldo;")

	static final class119 field1455;
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Ldo;")

	static final class119 field1456;
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Ldo;")

	static final class119 field1471;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Ldo;")

	static final class119 field1458;
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"Ldo;")

	static final class119 field1459;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Ldo;")

	static final class119 field1453;
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"Ldo;")

	static final class119 field1465;
	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"Ldo;")

	static final class119 field1468;
	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"Ldo;")

	static final class119 field1463;
	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"Ldo;")

	static final class119 field1464;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Ldo;")

	static final class119 field1462;
	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"Ldo;")

	static final class119 field1466;
	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"Ldo;")

	static final class119 field1467;
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"Ldo;")

	static final class119 field1460;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Ldo;")

	static final class119 field1469;
	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 
	1186456071)

	final int field1470;
	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 
	978299269)

	final int field1461;
	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 
	-1956996321)

	final int field1472;
	static 
	{
		field1457 = new class119(0, 0, ((String) (null)), -1, -1);
		field1454 = new class119(1, 1, ((String) (null)), 0, 2);
		field1455 = new class119(2, 2, ((String) (null)), 1, 2);
		field1456 = new class119(3, 3, ((String) (null)), 2, 2);
		field1471 = new class119(4, 4, ((String) (null)), 3, 1);
		field1458 = new class119(5, 5, ((String) (null)), 4, 1);
		field1459 = new class119(6, 6, ((String) (null)), 5, 1);
		field1453 = new class119(7, 7, ((String) (null)), 6, 3);
		field1465 = new class119(8, 8, ((String) (null)), 7, 3);
		field1468 = new class119(9, 9, ((String) (null)), 8, 3);
		field1463 = new class119(10, 10, ((String) (null)), 0, 7);
		field1464 = new class119(11, 11, ((String) (null)), 1, 7);
		field1462 = new class119(12, 12, ((String) (null)), 2, 7);
		field1466 = new class119(13, 13, ((String) (null)), 3, 7);
		field1467 = new class119(14, 14, ((String) (null)), 4, 7);
		field1460 = new class119(15, 15, ((String) (null)), 5, 7);
		field1469 = new class119(16, 16, ((String) (null)), 0, 5);
	}

	@ObfuscatedSignature(descriptor = 
	"(IILjava/lang/String;II)V", garbageValue = 
	"-1")

	class119(int var1, int var2, String var3, int var4, int var5) {
		this.field1470 = var1;
		this.field1461 = var2;
		this.field1472 = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"15")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1461;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"923796459")

	int method2751() {
		return this.field1472;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"-317596811")

	static int method2741(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				class295.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = SceneTilePaint.method4500(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				class295.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = HealthBarUpdate.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				class295.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Login.method1883(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class12.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = class160.Client_plane;
					var4 = (class19.localPlayer.x >> 7) + ApproximateRouteStrategy.baseX;
					var5 = (class19.localPlayer.y >> 7) + class250.baseY;
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = ((var4 << 14) + var5) + (var3 << 28);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (var3 >> 14) & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3 >> 28;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (Client.isMembersWorld) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					class295.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = SceneTilePaint.method4500(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					class295.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = HealthBarUpdate.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					class295.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Login.method1883(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					class295.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 3];
					var3 += var4 << 14;
					var3 += var5 << 28;
					var3 += var6;
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.field493;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.field494;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;ZI)V", garbageValue = 
	"-53681616")

	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = ViewportMouse.fontPlain12.lineWidth(var0, 250);
			int var6 = ViewportMouse.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, (var2 + var5) + var2, (var2 + var2) + var6, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, (var2 + var5) + var2, (var2 + var2) + var6, 16777215);
			ViewportMouse.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			int var7 = var3 - var2;
			int var8 = var4 - var2;
			int var9 = (var2 + var5) + var2;
			int var10 = (var6 + var2) + var2;

			for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
				if (((((Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11]) > var7) && (Client.rootWidgetXs[var11] < (var7 + var9))) && ((Client.rootWidgetYs[var11] + Client.rootWidgetHeights[var11]) > var8)) && (Client.rootWidgetYs[var11] < (var8 + var10))) {
					Client.field564[var11] = true;
				}
			}

			if (var1) {
				SpotAnimationDefinition.rasterProvider.drawFull(0, 0);
			} else {
				LoginScreenAnimation.method2240(var3, var4, var5, var6);
			}

		}
	}
}