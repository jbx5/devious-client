import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("uh")
public class class524 {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZI)I",
		garbageValue = "1808581418"
	)
	static int method9343(int var0, Script var1, boolean var2) {
		Widget var3 = FloorUnderlayDefinition.widgetDefinition.method6544(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1867335000"
	)
	static final void method9344(int var0, int var1, int var2) {
		if (class433.cameraX < var0) {
			class433.cameraX = (var0 - class433.cameraX) * FriendSystem.field827 / 1000 + class433.cameraX + LoginState.field500;
			if (class433.cameraX > var0) {
				class433.cameraX = var0;
			}
		}

		if (class433.cameraX > var0) {
			class433.cameraX -= (class433.cameraX - var0) * FriendSystem.field827 / 1000 + LoginState.field500;
			if (class433.cameraX < var0) {
				class433.cameraX = var0;
			}
		}

		if (RestClientThreadFactory.cameraY < var1) {
			RestClientThreadFactory.cameraY = (var1 - RestClientThreadFactory.cameraY) * FriendSystem.field827 / 1000 + RestClientThreadFactory.cameraY + LoginState.field500;
			if (RestClientThreadFactory.cameraY > var1) {
				RestClientThreadFactory.cameraY = var1;
			}
		}

		if (RestClientThreadFactory.cameraY > var1) {
			RestClientThreadFactory.cameraY -= (RestClientThreadFactory.cameraY - var1) * FriendSystem.field827 / 1000 + LoginState.field500;
			if (RestClientThreadFactory.cameraY < var1) {
				RestClientThreadFactory.cameraY = var1;
			}
		}

		if (WorldMapSection0.cameraZ < var2) {
			WorldMapSection0.cameraZ = (var2 - WorldMapSection0.cameraZ) * FriendSystem.field827 / 1000 + WorldMapSection0.cameraZ + LoginState.field500;
			if (WorldMapSection0.cameraZ > var2) {
				WorldMapSection0.cameraZ = var2;
			}
		}

		if (WorldMapSection0.cameraZ > var2) {
			WorldMapSection0.cameraZ -= (WorldMapSection0.cameraZ - var2) * FriendSystem.field827 / 1000 + LoginState.field500;
			if (WorldMapSection0.cameraZ < var2) {
				WorldMapSection0.cameraZ = var2;
			}
		}

	}
}
