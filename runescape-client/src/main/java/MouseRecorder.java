import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("v")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("c")
	@Export("lock")
	Object lock;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	1040654815)

	@Export("index")
	int index;
	@ObfuscatedName("f")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("b")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("n")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; class93.method2384(50L)) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(III)I", garbageValue = 
	"1730658434")

	static int method2093(int var0, int var1) {
		ItemContainer var2 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var2 == null) {
			return -1;
		} else {
			return (var1 >= 0) && (var1 < var2.ids.length) ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"2109167375")

	public static void method2098() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"1423538345")

	static int method2094(int var0, Script var1, boolean var2) {
		if ((((((((var0 != 7000) && (var0 != 7005)) && (var0 != 7010)) && (var0 != 7015)) && (var0 != 7020)) && (var0 != 7025)) && (var0 != 7030)) && (var0 != 7035)) {
			if ((((((var0 != 7001) && (var0 != 7002)) && (var0 != 7011)) && (var0 != 7012)) && (var0 != 7021)) && (var0 != 7022)) {
				if (((var0 != 7003) && (var0 != 7013)) && (var0 != 7023)) {
					if ((((((var0 != 7006) && (var0 != 7007)) && (var0 != 7016)) && (var0 != 7017)) && (var0 != 7026)) && (var0 != 7027)) {
						if (((var0 != 7008) && (var0 != 7018)) && (var0 != 7028)) {
							if ((var0 != 7031) && (var0 != 7032)) {
								if (var0 == 7033) {
									--class122.Interpreter_stringStackSize;
									return 1;
								} else if ((var0 != 7036) && (var0 != 7037)) {
									if (var0 == 7038) {
										--Interpreter.Interpreter_intStackSize;
										return 1;
									} else if ((((((((var0 != 7004) && (var0 != 7009)) && (var0 != 7014)) && (var0 != 7019)) && (var0 != 7024)) && (var0 != 7029)) && (var0 != 7034)) && (var0 != 7039)) {
										return 2;
									} else {
										--Interpreter.Interpreter_intStackSize;
										return 1;
									}
								} else {
									Interpreter.Interpreter_intStackSize -= 2;
									return 1;
								}
							} else {
								--class122.Interpreter_stringStackSize;
								--Interpreter.Interpreter_intStackSize;
								return 1;
							}
						} else {
							--Interpreter.Interpreter_intStackSize;
							return 1;
						}
					} else {
						Interpreter.Interpreter_intStackSize -= 2;
						return 1;
					}
				} else {
					Interpreter.Interpreter_intStackSize -= 2;
					return 1;
				}
			} else {
				Interpreter.Interpreter_intStackSize -= 3;
				return 1;
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 5;
			return 1;
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(descriptor = 
	"(IIIII)V", garbageValue = 
	"1147144850")

	static final void method2096(int var0, int var1, int var2, int var3) {
		Client.overheadTextCount = 0;
		boolean var4 = false;
		int var5 = -1;
		int var6 = -1;
		int var7 = Players.Players_count;
		int[] var8 = Players.Players_indices;

		int var9;
		for (var9 = 0; var9 < (var7 + Client.npcCount); ++var9) {
			Object var20;
			if (var9 < var7) {
				var20 = Client.players[var8[var9]];
				if (var8[var9] == Client.combatTargetPlayerIndex) {
					var4 = true;
					var5 = var9;
					continue;
				}

				if (var20 == GrandExchangeEvents.localPlayer) {
					var6 = var9;
					continue;
				}
			} else {
				var20 = Client.npcs[Client.npcIndices[var9 - var7]];
			}

			ScriptFrame.drawActor2d(((Actor) (var20)), var9, var0, var1, var2, var3);
		}

		if (Client.renderSelf && (var6 != (-1))) {
			ScriptFrame.drawActor2d(GrandExchangeEvents.localPlayer, var6, var0, var1, var2, var3);
		}

		if (var4) {
			ScriptFrame.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3);
		}

		for (var9 = 0; var9 < Client.overheadTextCount; ++var9) {
			int var10 = Client.overheadTextXs[var9];
			int var11 = Client.overheadTextYs[var9];
			int var12 = Client.overheadTextXOffsets[var9];
			int var13 = Client.overheadTextAscents[var9];
			boolean var14 = true;

			while (var14) {
				var14 = false;

				for (int var19 = 0; var19 < var9; ++var19) {
					if ((((((var11 + 2) > (Client.overheadTextYs[var19] - Client.overheadTextAscents[var19])) && ((var11 - var13) < (Client.overheadTextYs[var19] + 2))) && ((var10 - var12) < (Client.overheadTextXs[var19] + Client.overheadTextXOffsets[var19]))) && ((var10 + var12) > (Client.overheadTextXs[var19] - Client.overheadTextXOffsets[var19]))) && ((Client.overheadTextYs[var19] - Client.overheadTextAscents[var19]) < var11)) {
						var11 = Client.overheadTextYs[var19] - Client.overheadTextAscents[var19];
						var14 = true;
					}
				}
			} 

			Client.viewportTempX = Client.overheadTextXs[var9];
			Client.viewportTempY = Client.overheadTextYs[var9] = var11;
			String var15 = Client.overheadText[var9];
			if (Client.chatEffects == 0) {
				int var16 = 16776960;
				if (Client.overheadTextColors[var9] < 6) {
					var16 = Client.field725[Client.overheadTextColors[var9]];
				}

				if (Client.overheadTextColors[var9] == 6) {
					var16 = ((Client.viewportDrawCount % 20) < 10) ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var9] == 7) {
					var16 = ((Client.viewportDrawCount % 20) < 10) ? 255 : '￿';
				}

				if (Client.overheadTextColors[var9] == 8) {
					var16 = ((Client.viewportDrawCount % 20) < 10) ? '뀀' : 8454016;
				}

				int var17;
				if (Client.overheadTextColors[var9] == 9) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					if (var17 < 50) {
						var16 = (var17 * 1280) + 16711680;
					} else if (var17 < 100) {
						var16 = 16776960 - ((var17 - 50) * 327680);
					} else if (var17 < 150) {
						var16 = ((var17 - 100) * 5) + 65280;
					}
				}

				if (Client.overheadTextColors[var9] == 10) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					if (var17 < 50) {
						var16 = (var17 * 5) + 16711680;
					} else if (var17 < 100) {
						var16 = 16711935 - ((var17 - 50) * 327680);
					} else if (var17 < 150) {
						var16 = (((var17 - 100) * 327680) + 255) - ((var17 - 100) * 5);
					}
				}

				if (Client.overheadTextColors[var9] == 11) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					if (var17 < 50) {
						var16 = 16777215 - (var17 * 327685);
					} else if (var17 < 100) {
						var16 = ((var17 - 50) * 327685) + 65280;
					} else if (var17 < 150) {
						var16 = 16777215 - ((var17 - 100) * 327680);
					}
				}

				if (Client.overheadTextEffects[var9] == 0) {
					RouteStrategy.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0);
				}

				if (Client.overheadTextEffects[var9] == 1) {
					RouteStrategy.fontBold12.drawCenteredWave(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 2) {
					RouteStrategy.fontBold12.drawCenteredWave2(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 3) {
					RouteStrategy.fontBold12.drawCenteredShake(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var9]);
				}

				if (Client.overheadTextEffects[var9] == 4) {
					var17 = ((150 - Client.overheadTextCyclesRemaining[var9]) * (RouteStrategy.fontBold12.stringWidth(var15) + 100)) / 150;
					Rasterizer2D.Rasterizer2D_expandClip((var0 + Client.viewportTempX) - 50, var1, (var0 + Client.viewportTempX) + 50, var3 + var1);
					RouteStrategy.fontBold12.draw(var15, ((var0 + Client.viewportTempX) + 50) - var17, Client.viewportTempY + var1, var16, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}

				if (Client.overheadTextEffects[var9] == 5) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					int var18 = 0;
					if (var17 < 25) {
						var18 = var17 - 25;
					} else if (var17 > 125) {
						var18 = var17 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, ((Client.viewportTempY + var1) - RouteStrategy.fontBold12.ascent) - 1, var0 + var2, (Client.viewportTempY + var1) + 5);
					RouteStrategy.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, (var18 + Client.viewportTempY) + var1, var16, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				RouteStrategy.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}

	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"551926222")

	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (class155.loadInterface(var0)) {
			class155.runComponentCloseListeners(Widget.Widget_interfaceComponents[var0], var1);
		}
	}
}