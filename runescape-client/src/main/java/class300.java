import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kq")
public class class300 {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZB)I",
		garbageValue = "-77"
	)
	static int method5916(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? TextureProvider.scriptDotWidget : MenuAction.scriptActiveWidget; // L: 1122
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1123
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1124
			return 1; // L: 1125
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1127
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1128
			return 1; // L: 1129
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1131
			Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var3.text; // L: 1132
			return 1; // L: 1133
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1135
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1136
			return 1; // L: 1137
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1139
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1140
			return 1; // L: 1141
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1143
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1144
			return 1; // L: 1145
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1147
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1148
			return 1; // L: 1149
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1151
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1152
			return 1; // L: 1153
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1155
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1156
			return 1; // L: 1157
		} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1159
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1160
			return 1; // L: 1161
		} else if (var0 == 1610) { // L: 1163
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1164
			return 1; // L: 1165
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1167
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1168
			return 1; // L: 1169
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1171
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1172
			return 1; // L: 1173
		} else if (var0 == 1613) { // L: 1175
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1176
			return 1; // L: 1177
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1179
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1180
			return 1; // L: 1181
		} else {
			return 2; // L: 1183
		}
	}
}
