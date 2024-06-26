import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bn")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lbv;"
	)
	@Export("players")
	public volatile PcmPlayer[] players;

	public SoundSystem() {
		this.players = new PcmPlayer[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1];
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var4) {
			FriendsChat.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;",
		garbageValue = "22"
	)
	static File method875(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2;
		JagexCache.field2357 = new File(class74.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
		String var4 = null;
		String var5 = null;
		boolean var6 = false;
		File var22;
		if (JagexCache.field2357.exists()) {
			try {
				AccessFile var7 = new AccessFile(JagexCache.field2357, "rw", 10000L);

				Buffer var8;
				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.offset < var8.array.length; var8.offset += var9) {
					var9 = var7.read(var8.array, var8.offset, var8.array.length - var8.offset);
					if (var9 == -1) {
						throw new IOException();
					}
				}

				var8.offset = 0;
				var9 = var8.readUnsignedByte();
				if (var9 < 1 || var9 > 3) {
					throw new IOException("" + var9);
				}

				int var10 = 0;
				if (var9 > 1) {
					var10 = var8.readUnsignedByte();
				}

				if (var9 <= 2) {
					var4 = var8.readStringCp1252NullCircumfixed();
					if (var10 == 1) {
						var5 = var8.readStringCp1252NullCircumfixed();
					}
				} else {
					var4 = var8.readCESU8();
					if (var10 == 1) {
						var5 = var8.readCESU8();
					}
				}

				var7.close();
			} catch (IOException var20) {
				var20.printStackTrace();
			}

			if (var4 != null) {
				var22 = new File(var4);
				if (!var22.exists()) {
					var4 = null;
				}
			}

			if (var4 != null) {
				var22 = new File(var4, "test.dat");
				if (!class159.method3418(var22, true)) {
					var4 = null;
				}
			}
		}

		if (var4 == null && var2 == 0) {
			label123:
			for (int var15 = 0; var15 < class87.field1073.length; ++var15) {
				for (int var16 = 0; var16 < class147.field1695.length; ++var16) {
					File var17 = new File(class147.field1695[var16] + class87.field1073[var15] + File.separatorChar + var0 + File.separatorChar);
					if (var17.exists() && class159.method3418(new File(var17, "test.dat"), true)) {
						var4 = var17.toString();
						var6 = true;
						break label123;
					}
				}
			}
		}

		if (var4 == null) {
			var4 = class74.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
			var6 = true;
		}

		if (var5 != null) {
			File var21 = new File(var5);
			var22 = new File(var4);

			try {
				File[] var23 = var21.listFiles();
				File[] var18 = var23;

				for (int var11 = 0; var11 < var18.length; ++var11) {
					File var12 = var18[var11];
					File var13 = new File(var22, var12.getName());
					boolean var14 = var12.renameTo(var13);
					if (!var14) {
						throw new IOException();
					}
				}
			} catch (Exception var19) {
				var19.printStackTrace();
			}

			var6 = true;
		}

		if (var6) {
			class229.method4371(new File(var4), (File)null);
		}

		return new File(var4);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-962795376"
	)
	static final void method870(String var0) {
		AbstractWorldMapIcon.method5076(var0 + " is already on your friend list");
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "1898416425"
	)
	static int method874(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) {
			class130.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 + var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			class130.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			class130.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4 * var9;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			class130.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var9 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var9 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				class130.Interpreter_intStackSize -= 5;
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 + (var4 - var9) * (var7 - var5) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				class130.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 + var9 * var4 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				class130.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				class130.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				class130.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				class130.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				class130.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				class130.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9));
						break;
					default:
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				class130.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				class130.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 | var4;
				return 1;
			} else if (var0 == 4016) {
				class130.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4;
				return 1;
			} else if (var0 == 4017) {
				class130.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				class130.Interpreter_intStackSize -= 3;
				long var10 = (long)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				long var12 = (long)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				long var14 = (long)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (int)(var10 * var14 / var12);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var9 = World.method1907(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				class130.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				class130.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class166.method3477(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				class130.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = AsyncHttpResponse.method280(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				class130.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 << var6 >>> var6 + var4;
				return 1;
			} else if (var0 == 4030) {
				class130.Interpreter_intStackSize -= 4;
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3];
				var9 = AsyncHttpResponse.method280(var9, var5, var6);
				var7 = GraphicsObject.method2153(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1] = FloorOverlayDefinition.method4035(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1] = class6.method39(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				class130.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				var5 = WidgetDefinition.method6511(var9, var4);
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
				var4 = -1;
				if (HealthBarUpdate.isNumber(var3)) {
					var4 = GrandExchangeEvent.method7351(var3);
				}

				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.menuWorldViewIds[0] = -1;
		Client.menuActions[0] = "Cancel";
		Client.menuTargets[0] = "";
		Client.menuOpcodes[0] = 1006;
		Client.menuShiftClick[0] = false;
		Client.menuOptionsCount = 1;
	}

	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-906642804"
	)
	@Export("randomDatData2")
	static void randomDatData2(Buffer var0) {
		if (Client.randomDatData != null) {
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var2 = new byte[24];

			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.readFully(var2);

				int var3;
				for (var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) {
				}

				if (var3 >= 24) {
					throw new IOException();
				}
			} catch (Exception var6) {
				for (int var4 = 0; var4 < 24; ++var4) {
					var2[var4] = -1;
				}
			}

			var0.writeBytes(var2, 0, var2.length);
		}
	}
}
