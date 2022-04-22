import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;





import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("fd")
	@ObfuscatedGetter(intValue = 
	-1797802819)

	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("v")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("c")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor();
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"100")

	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"1428747809")

	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(B)Ljava/security/SecureRandom;", garbageValue = 
	"-92")

	@Export("get")
	SecureRandom get() {
		try {
			return ((SecureRandom) (this.future.get()));
		} catch (Exception var4) {
			SecureRandom var3 = new SecureRandom();
			var3.nextInt();
			return var3;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"2104431553")

	static int method1985(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			Interpreter.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			EnumComposition var10 = class78.getEnum(var3);
			if (var10.outputType != 's') {
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}

			if (var10 != null) {
				Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var10.defaultStr;
			}

			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				EnumComposition var4 = class78.getEnum(var3);
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			EnumComposition var7 = class78.getEnum(var5);
			if ((var3 == var7.inputType) && (var9 == var7.outputType)) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.defaultInt;
					}
				}

				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"970773332")

	static int method1984(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			Interpreter.Interpreter_intStackSize -= 2;
			Client.field760 = ((short) (GrandExchangeOffer.method6032(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])));
			if (Client.field760 <= 0) {
				Client.field760 = 256;
			}

			Client.field761 = ((short) (GrandExchangeOffer.method6032(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1])));
			if (Client.field761 <= 0) {
				Client.field761 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			Interpreter.Interpreter_intStackSize -= 2;
			Client.zoomHeight = ((short) (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]));
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = ((short) (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]));
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			Interpreter.Interpreter_intStackSize -= 4;
			Client.field764 = ((short) (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]));
			if (Client.field764 <= 0) {
				Client.field764 = 1;
			}

			Client.field765 = ((short) (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]));
			if (Client.field765 <= 0) {
				Client.field765 = 32767;
			} else if (Client.field765 < Client.field764) {
				Client.field765 = Client.field764;
			}

			Client.field766 = ((short) (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]));
			if (Client.field766 <= 0) {
				Client.field766 = 1;
			}

			Client.field666 = ((short) (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]));
			if (Client.field666 <= 0) {
				Client.field666 = 32767;
			} else if (Client.field666 < Client.field766) {
				Client.field666 = Client.field766;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				class17.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ClientPacket.method5175(Client.field760);
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ClientPacket.method5175(Client.field761);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = InvDefinition.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class321.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}