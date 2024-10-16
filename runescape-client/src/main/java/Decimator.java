import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("co")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("tj")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1572442445
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 212193755
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("ay")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) {
			int var4 = var1;
			int var5 = var2;
			if (var2 > var1) {
				var4 = var2;
				var5 = var1;
			}

			while (var5 != 0) {
				int var6 = var4 % var5;
				var4 = var5;
				var5 = var6;
			}

			var1 /= var4;
			var2 /= var4;
			this.inputRate = var1;
			this.outputRate = var2;
			this.table = new int[var1][14];

			for (int var7 = 0; var7 < var1; ++var7) {
				int[] var8 = this.table[var7];
				double var9 = 6.0D + (double)var7 / (double)var1;
				int var11 = (int)Math.floor(1.0D + (var9 - 7.0D));
				if (var11 < 0) {
					var11 = 0;
				}

				int var12 = (int)Math.ceil(var9 + 7.0D);
				if (var12 > 14) {
					var12 = 14;
				}

				for (double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) {
					double var15 = ((double)var11 - var9) * 3.141592653589793D;
					double var17 = var13;
					if (var15 < -1.0E-4D || var15 > 1.0E-4D) {
						var17 = var13 * (Math.sin(var15) / var15);
					}

					var17 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var11 - var9));
					var8[var11] = (int)Math.floor(var17 * 65536.0D + 0.5D);
				}
			}

		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "1"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) {
			int var2 = (int)((long)var1.length * (long)this.outputRate / (long)this.inputRate) + 14;
			int[] var3 = new int[var2];
			int var4 = 0;
			int var5 = 0;

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) {
				byte var7 = var1[var6];
				int[] var8 = this.table[var5];

				int var9;
				for (var9 = 0; var9 < 14; ++var9) {
					var3[var9 + var4] += var8[var9] * var7;
				}

				var5 += this.outputRate;
				var9 = var5 / this.inputRate;
				var4 += var9;
				var5 -= var9 * this.inputRate;
			}

			var1 = new byte[var2];

			for (var6 = 0; var6 < var2; ++var6) {
				int var10 = var3[var6] + 32768 >> 16;
				if (var10 < -128) {
					var1[var6] = -128;
				} else if (var10 > 127) {
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10;
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1133269880"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate);
		}

		return var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1666166859"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) {
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate) + 6;
		}

		return var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-398765297"
	)
	static final void method1167() {
		Object var10000 = null;
		String var0 = "Your friend list is full. Max of 200 for free users, and 400 for members";
		class430.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "829360175"
	)
	static int method1169(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = class416.widgetDefinition.method6911(Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = class416.widgetDefinition.method6911(Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize]);
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_HASSUB) {
			int var5 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5);
			if (var4 != null) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTOP) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.rootInterface;
			return 1;
		} else if (var0 == 2707) {
			var3 = class416.widgetDefinition.method6911(Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.method7409() ? 1 : 0;
			return 1;
		} else if (var0 == 2708) {
			var3 = class416.widgetDefinition.method6911(Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize]);
			return DynamicObject.method2461(var3);
		} else if (var0 == 2709) {
			var3 = class416.widgetDefinition.method6911(Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize]);
			return SecureRandomCallable.method2521(var3);
		} else {
			return 2;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "-1824873059"
	)
	static int method1166(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) {
			class96.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9 + var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			class96.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			class96.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9 * var4;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			class96.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var9 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var9 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				class96.Interpreter_intStackSize -= 5;
				var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9 + (var4 - var9) * (var7 - var5) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				class96.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9 + var9 * var4 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				class96.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				class96.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				class96.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				class96.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				class96.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				class96.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9));
						break;
					default:
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				class96.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				class96.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9 | var4;
				return 1;
			} else if (var0 == 4016) {
				class96.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4;
				return 1;
			} else if (var0 == 4017) {
				class96.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				class96.Interpreter_intStackSize -= 3;
				long var10 = (long)Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				long var12 = (long)Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				long var14 = (long)Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = (int)(var14 * var10 / var12);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var9 = class422.method8138(Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				class96.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				class96.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class318.method6508(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				class96.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class169.method3785(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				class96.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9 << var6 >>> var6 + var4;
				return 1;
			} else if (var0 == 4030) {
				class96.Interpreter_intStackSize -= 4;
				var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 3];
				var9 = class169.method3785(var9, var5, var6);
				var7 = MenuAction.method2336(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var9 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize - 1] = HttpRequestTask.method287(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize - 1] = Friend.method8993(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				class96.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				var5 = WorldMapRegion.method6003(var9, var4);
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var3 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
				var4 = -1;
				if (class298.isNumber(var3)) {
					var4 = class27.method437(var3);
				}

				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-45"
	)
	static boolean method1168(int var0, int var1) {
		int var3 = var1;
		if (var1 >= 2000) {
			var3 = var1 - 2000;
		}

		boolean var4 = var0 == class229.field2458 || var0 == -1;
		boolean var5;
		if (!var4) {
			var5 = var3 == 2 || var3 == 8 || var3 == 25 || var3 == 17 || var3 == 25;
			var4 = var5;
		}

		var5 = var4;
		boolean var6;
		if (!var4) {
			var6 = var3 == 14 || var3 == 15 || var3 >= 44 && var3 <= 51;
			var5 = var6;
		}

		var6 = var5;
		boolean var7;
		if (!var5) {
			var7 = var3 == 1002 || var3 == 1003 || var3 == 1004;
			var6 = var7;
		}

		if (!var6) {
			return false;
		} else {
			var5 = var1 == 14 || var1 == 15 || var1 >= 44 && var1 <= 51;
			var6 = var5;
			if (!var5) {
				var7 = var1 == 1 || var1 == 2 || var1 >= 3 && var1 <= 6 || var1 == 1001;
				var6 = var7;
			}

			var7 = var6;
			boolean var8;
			if (!var6) {
				var8 = var1 == 7 || var1 == 8 || var1 >= 9 && var1 <= 13;
				var7 = var8;
			}

			var8 = var7;
			boolean var9;
			if (!var7) {
				var9 = var1 == 16 || var1 == 17 || var1 >= 18 && var1 <= 22;
				var8 = var9;
			}

			var9 = var8;
			if (!var8) {
				boolean var10 = var1 == 1002 || var1 == 1003 || var1 == 1004;
				var9 = var10;
			}

			if (var9) {
				class491 var11 = Client.worldViewManager.method2676(var0);
				if (var11 == class491.field5086) {
					return false;
				}

				if (var11 == class491.field5085) {
					var6 = var1 == 1002 || var1 == 1003 || var1 == 1004;
					if (!var6) {
						return false;
					}
				}
			}

			return true;
		}
	}
}
