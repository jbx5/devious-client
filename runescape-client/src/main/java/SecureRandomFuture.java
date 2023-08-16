import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cc")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("au")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("ae")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor();
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2045980697"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1770543009"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/security/SecureRandom;",
		garbageValue = "-53"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get();
		} catch (Exception var4) {
			SecureRandom var3 = new SecureRandom();
			var3.nextInt();
			return var3;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1197212946"
	)
	public static void method2163(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Luy;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = (RunException)var0;
			var2.message = var2.message + ' ' + var1;
		} else {
			var2 = new RunException(var0, var1);
		}

		return var2;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZS)I",
		garbageValue = "-1442"
	)
	static int method2162(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
			var4 = class92.getWidget(var3);
		} else {
			var4 = var2 ? GameObject.scriptDotWidget : SceneTilePaint.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			SoundCache.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 3];
			class218.invalidateWidget(var4);
			class219.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				Login.revalidateWidgetScroll(PacketBufferNode.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			SoundCache.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 3];
			class218.invalidateWidget(var4);
			class219.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				Login.revalidateWidgetScroll(PacketBufferNode.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				class218.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ltm;IIIIIII)V",
		garbageValue = "-1694412552"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (class30.method453(var1, var2, var3)) {
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0;

			while (true) {
				var7 = var0.readUnsignedShort();
				if (var7 == 0) {
					if (var1 == 0) {
						int[] var14 = Tiles.Tiles_heights[0][var2];
						int var11 = var4 + 932731;
						int var12 = var5 + 556238;
						int var13 = class141.method3100(var11 + 45365, 91923 + var12, 4) - 128 + (class141.method3100(10294 + var11, var12 + 37821, 2) - 128 >> 1) + (class141.method3100(var11, var12, 1) - 128 >> 2);
						var13 = (int)((double)var13 * 0.3D) + 35;
						if (var13 < 10) {
							var13 = 10;
						} else if (var13 > 60) {
							var13 = 60;
						}

						var14[var3] = -var13 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
					}
					break;
				}

				if (var7 == 1) {
					int var8 = var0.readUnsignedByte();
					if (var8 == 1) {
						var8 = 0;
					}

					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8;
					}
					break;
				}

				if (var7 <= 49) {
					class227.Tiles_overlays[var1][var2][var3] = (short)var0.readShort();
					class172.Tiles_shapes[var1][var2][var3] = (byte)((var7 - 2) / 4);
					ModelData0.field2833[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
				} else if (var7 <= 81) {
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49);
				} else {
					Tiles.Tiles_underlays[var1][var2][var3] = (short)(var7 - 81);
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedShort();
				if (var7 == 0) {
					break;
				}

				if (var7 == 1) {
					var0.readUnsignedByte();
					break;
				}

				if (var7 <= 49) {
					var0.readShort();
				}
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-760322108"
	)
	public static int method2152(int var0, int var1) {
		int var2 = var0 >>> 31;
		return (var0 + var2) / var1 - var2;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZB)I",
		garbageValue = "-52"
	)
	static int method2166(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? GameObject.scriptDotWidget : SceneTilePaint.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = HealthBarDefinition.Widget_unpackTargetMask(NpcOverrides.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ldr;II)V",
		garbageValue = "1228067668"
	)
	static final void method2156(Actor var0, int var1) {
		HealthBar.worldToScreen(var0.x, var0.y, var1);
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1763932419"
	)
	static void method2151(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}
}
