import java.io.File;
import java.io.RandomAccessFile;
import java.util.concurrent.Callable;




import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	SecureRandomCallable() {
	}

	public Object call() {
		return NPC.method2364();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/io/File;ZI)Z", garbageValue = 
	"-1849824347")

	public static boolean method2069(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var4) {
			return false;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(IIIB)I", garbageValue = 
	"57")

	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (((var1 / 32) << 7) + ((var0 / 4) << 10)) + (var2 / 2);
		return var3;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"-555980278")

	static int method2064(int var0, Script var1, boolean var2) {
		Widget var7;
		if ((var0 != ScriptOpcodes.CC_CALLONRESIZE) && (var0 != ScriptOpcodes.IF_CALLONRESIZE)) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var7 = (var2) ? class432.scriptDotWidget : class341.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				if ((var4 >= 1) && (var4 <= 10)) {
					class93 var8 = new class93(var4, var7.id, var7.childIndex, var7.itemId);
					Interpreter.field839.add(var8);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				class295.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2];
				if ((var5 >= 1) && (var5 <= 10)) {
					class93 var6 = new class93(var5, var3, var4, HorizontalAlignment.getWidget(var3).itemId);
					Interpreter.field839.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field827 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var7 = HorizontalAlignment.getWidget(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
			} else {
				var7 = (var2) ? class432.scriptDotWidget : class341.scriptActiveWidget;
			}

			if (var7.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var7;
				var9.args = var7.onResize;
				var9.field1053 = Interpreter.field827 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(descriptor = 
	"(ZLpy;B)V", garbageValue = 
	"88")

	static final void method2066(boolean var0, PacketBuffer var1) {
		while (true) {
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) {
				int var2 = var1.readBits(15);
				if (var2 != 32767) {
					boolean var3 = false;
					if (Client.npcs[var2] == null) {
						Client.npcs[var2] = new NPC();
						var3 = true;
					}

					NPC var4 = Client.npcs[var2];
					Client.npcIndices[(++Client.npcCount) - 1] = var2;
					var4.npcCycle = Client.cycle;
					int var5;
					int var6;
					int var7;
					int var8;
					boolean var9;
					int var10;
					if (class162.field1768) {
						if (var0) {
							var6 = var1.readBits(8);
							if (var6 > 127) {
								var6 -= 256;
							}
						} else {
							var6 = var1.readBits(5);
							if (var6 > 15) {
								var6 -= 32;
							}
						}

						var5 = var1.readBits(1);
						var8 = Client.defaultRotations[var1.readBits(3)];
						if (var3) {
							var4.orientation = var4.rotation = var8;
						}

						var4.definition = class9.getNpcDefinition(var1.readBits(14));
						if (var0) {
							var7 = var1.readBits(8);
							if (var7 > 127) {
								var7 -= 256;
							}
						} else {
							var7 = var1.readBits(5);
							if (var7 > 15) {
								var7 -= 32;
							}
						}

						var9 = var1.readBits(1) == 1;
						if (var9) {
							var1.readBits(32);
						}

						var10 = var1.readBits(1);
						if (var10 == 1) {
							Client.field533[(++Client.field609) - 1] = var2;
						}
					} else {
						var5 = var1.readBits(1);
						var8 = var1.readBits(1);
						if (var8 == 1) {
							Client.field533[(++Client.field609) - 1] = var2;
						}

						if (var0) {
							var7 = var1.readBits(8);
							if (var7 > 127) {
								var7 -= 256;
							}
						} else {
							var7 = var1.readBits(5);
							if (var7 > 15) {
								var7 -= 32;
							}
						}

						var9 = var1.readBits(1) == 1;
						if (var9) {
							var1.readBits(32);
						}

						if (var0) {
							var6 = var1.readBits(8);
							if (var6 > 127) {
								var6 -= 256;
							}
						} else {
							var6 = var1.readBits(5);
							if (var6 > 15) {
								var6 -= 32;
							}
						}

						var4.definition = class9.getNpcDefinition(var1.readBits(14));
						var10 = Client.defaultRotations[var1.readBits(3)];
						if (var3) {
							var4.orientation = var4.rotation = var10;
						}
					}

					var4.field1145 = var4.definition.size;
					var4.field1192 = var4.definition.rotation;
					if (var4.field1192 == 0) {
						var4.rotation = 0;
					}

					var4.walkSequence = var4.definition.walkSequence;
					var4.walkBackSequence = var4.definition.walkBackSequence;
					var4.walkLeftSequence = var4.definition.walkLeftSequence;
					var4.walkRightSequence = var4.definition.walkRightSequence;
					var4.idleSequence = var4.definition.idleSequence;
					var4.turnLeftSequence = var4.definition.turnLeftSequence;
					var4.turnRightSequence = var4.definition.turnRightSequence;
					var4.method2353(class19.localPlayer.pathX[0] + var6, class19.localPlayer.pathY[0] + var7, var5 == 1);
					continue;
				}
			}

			var1.exportIndex();
			return;
		} 
	}
}