import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ce")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -588674117
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -835387121
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1409428147
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -379451217
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -38972211
	)
	@Export("itemId")
	int itemId;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -673509227
	)
	@Export("worldViewId")
	int worldViewId;
	@ObfuscatedName("af")
	@Export("action")
	String action;
	@ObfuscatedName("at")
	@Export("target")
	String target;
	@ObfuscatedName("au")
	boolean field935;

	MenuAction() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1448231718"
	)
	static void method2299() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var0.stream1 != null) {
				GameEngine.pcmStreamMixer.removeSubStream(var0.stream1);
				var0.stream1 = null;
			}

			if (var0.stream2 != null) {
				GameEngine.pcmStreamMixer.removeSubStream(var0.stream2);
				var0.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IS)Lhd;",
		garbageValue = "4196"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0);
			var1 = new EnumComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ae")
	static boolean method2300(long var0) {
		return class363.method7375(var0) == 2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZS)I",
		garbageValue = "26824"
	)
	static int method2302(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = TaskHandler.widgetDefinition.method6841(Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : class464.scriptActiveWidget;
		}

		SecureRandomCallable.invalidateWidget(var3);
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = AddRequestTask.localPlayer.appearance.getChatHeadId();
				return 1;
			} else if (var0 == 1207) {
				boolean var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
				var3.method7274(AddRequestTask.localPlayer.appearance, var7);
				return 1;
			} else if (var0 == 1208) {
				var4 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				if (var3.field3910 == null) {
					throw new RuntimeException("");
				} else {
					var3.field3910.method6894(var4);
					return 1;
				}
			} else if (var0 == 1209) {
				class320.Interpreter_intStackSize -= 2;
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var5 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				if (var3.field3910 == null) {
					throw new RuntimeException("");
				} else {
					var3.field3910.method6893(var4, var5);
					return 1;
				}
			} else if (var0 == 1210) {
				var4 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				if (var3.field3910 == null) {
					throw new RuntimeException("");
				} else {
					var3.field3910.method6891(AddRequestTask.localPlayer.appearance.gender, var4);
					return 1;
				}
			} else {
				return 2;
			}
		} else {
			class320.Interpreter_intStackSize -= 2;
			var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
			var5 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = MouseRecorder.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.field3908 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field3908;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "12"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class461.clientPreferences.getSoundEffectsVolume() != 0 && var1 != 0 && Client.soundEffectCount < 50) {
			Client.soundEffectIds[Client.soundEffectCount] = var0;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.soundLocations[Client.soundEffectCount] = 0;
			Client.field627[Client.soundEffectCount] = 0;
			++Client.soundEffectCount;
		}

	}
}
