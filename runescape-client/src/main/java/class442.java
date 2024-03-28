import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("rl")
class class442 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	final class443 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lrt;)V"
	)
	class442(class443 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrv;Lrv;I)I",
		garbageValue = "-841356644"
	)
	int method7996(class444 var1, class444 var2) {
		if (var1.field4760 > var2.field4760) {
			return 1;
		} else {
			return var1.field4760 < var2.field4760 ? -1 : 0;
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method7996((class444)var1, (class444)var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)I",
		garbageValue = "-97"
	)
	public static int method8005(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						throw new NumberFormatException();
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10;
				if (var9 / var1 != var5) {
					throw new NumberFormatException();
				}

				var5 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZB)I",
		garbageValue = "15"
	)
	static int method8004(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			HttpRequestTask.Interpreter_intStackSize -= 2;
			Client.field785 = (short)GrandExchangeOfferTotalQuantityComparator.method7092(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize]);
			if (Client.field785 <= 0) {
				Client.field785 = 256;
			}

			Client.field786 = (short)GrandExchangeOfferTotalQuantityComparator.method7092(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1]);
			if (Client.field786 <= 0) {
				Client.field786 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			HttpRequestTask.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			HttpRequestTask.Interpreter_intStackSize -= 4;
			Client.field789 = (short)Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
			if (Client.field789 <= 0) {
				Client.field789 = 1;
			}

			Client.field728 = (short)Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
			if (Client.field728 <= 0) {
				Client.field728 = 32767;
			} else if (Client.field728 < Client.field789) {
				Client.field728 = Client.field789;
			}

			Client.field791 = (short)Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
			if (Client.field791 <= 0) {
				Client.field791 = 1;
			}

			Client.field792 = (short)Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 3];
			if (Client.field792 <= 0) {
				Client.field792 = 32767;
			} else if (Client.field792 < Client.field791) {
				Client.field792 = Client.field791;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				SecureRandomFuture.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Skills.method6858(Client.field785);
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Skills.method6858(Client.field786);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = class148.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = class342.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
