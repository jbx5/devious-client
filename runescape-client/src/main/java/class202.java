import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hp")
public class class202 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	static final class202 field2111;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	static final class202 field2108;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	static final class202 field2110;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	static final class202 field2114;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	static final class202 field2112;
	@ObfuscatedName("ag")
	static String[] field2113;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;

	static {
		field2111 = new class202(0);
		field2108 = new class202(1);
		field2110 = new class202(2);
		field2114 = new class202(3);
		field2112 = new class202(4);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "0"
	)
	class202(int var1) {
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "-5843"
	)
	static final int method4111(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZB)I",
		garbageValue = "-106"
	)
	static int method4110(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			class96.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Ldn;IIIII)Ldo;",
		garbageValue = "1181991581"
	)
	static final PendingSpawn method4112(WorldView var0, int var1, int var2, int var3, int var4) {
		for (PendingSpawn var5 = (PendingSpawn)var0.pendingSpawns.last(); var5 != null; var5 = (PendingSpawn)var0.pendingSpawns.previous()) {
			if (var5.plane == var1 && var2 == var5.x && var3 == var5.y && var4 == var5.type) {
				return var5;
			}
		}

		return null;
	}
}
