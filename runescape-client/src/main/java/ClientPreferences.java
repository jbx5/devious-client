import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("du")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	@Export("topLevelWorldView")
	static WorldView topLevelWorldView;
	@ObfuscatedName("ax")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("aq")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("af")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("at")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1545686075
	)
	int field1348;
	@ObfuscatedName("ar")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1401062805
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 770728641
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1530256263
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 649714297
	)
	@Export("eula")
	int eula;
	@ObfuscatedName("ab")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 345661593
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 448155139
	)
	@Export("drawDistance")
	int drawDistance;
	@ObfuscatedName("ai")
	@Export("parameters")
	final Map parameters;

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.eula = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.drawDistance = 25;
		this.parameters = new LinkedHashMap();
		this.method2755(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Lvf;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.eula = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.drawDistance = 25;
		this.parameters = new LinkedHashMap();
		if (var1 != null && var1.array != null) {
			int var2 = var1.readUnsignedByte();
			if (var2 >= 0 && var2 <= 11) {
				if (var1.readUnsignedByte() == 1) {
					this.roofsHidden = true;
				}

				if (var2 > 1) {
					this.titleMusicDisabled = var1.readUnsignedByte() == 1;
				}

				if (var2 > 3) {
					this.windowMode = var1.readUnsignedByte();
				}

				if (var2 > 2) {
					int var3 = var1.readUnsignedByte();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.readInt();
						int var6 = var1.readInt();
						this.parameters.put(var5, var6);
					}
				}

				if (var2 > 4) {
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull();
				}

				if (var2 > 5) {
					this.hideUsername = var1.readBoolean();
				}

				if (var2 > 6) {
					this.brightness = (double)var1.readUnsignedByte() / 100.0D;
					this.musicVolume = var1.readUnsignedByte();
					this.soundEffectsVolume = var1.readUnsignedByte();
					this.areaSoundEffectsVolume = var1.readUnsignedByte();
				}

				if (var2 > 7) {
					this.eula = var1.readUnsignedByte();
				}

				if (var2 > 8) {
					this.displayFps = var1.readUnsignedByte() == 1;
				}

				if (var2 > 9) {
					this.field1348 = var1.readInt();
				}

				if (var2 > 10) {
					this.drawDistance = var1.readUnsignedByte();
				}
			} else {
				this.method2755(true);
			}
		} else {
			this.method2755(true);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	void method2755(boolean var1) {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lvf;",
		garbageValue = "-575897557"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(418, true);
		var1.writeByte(11);
		var1.writeByte(this.roofsHidden ? 1 : 0);
		var1.writeByte(this.titleMusicDisabled ? 1 : 0);
		var1.writeByte(this.windowMode);
		var1.writeByte(this.parameters.size());
		Iterator var2 = this.parameters.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.writeInt((Integer)var3.getKey());
			var1.writeInt((Integer)var3.getValue());
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : "");
		var1.writeBoolean(this.hideUsername);
		var1.writeByte((int)(100.0D * this.brightness));
		var1.writeByte(this.musicVolume);
		var1.writeByte(this.soundEffectsVolume);
		var1.writeByte(this.areaSoundEffectsVolume);
		var1.writeByte(this.eula);
		var1.writeByte(this.displayFps ? 1 : 0);
		var1.writeInt(this.field1348);
		var1.writeByte(this.drawDistance);
		return var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1362433579"
	)
	@Export("updateRoofsHidden")
	void updateRoofsHidden(boolean var1) {
		this.roofsHidden = var1;
		AsyncRestClient.savePreferences();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1488734456"
	)
	@Export("isRoofsHidden")
	boolean isRoofsHidden() {
		return this.roofsHidden;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-114"
	)
	@Export("updateHideUsername")
	void updateHideUsername(boolean var1) {
		this.hideUsername = var1;
		AsyncRestClient.savePreferences();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "581715118"
	)
	@Export("isUsernameHidden")
	boolean isUsernameHidden() {
		return this.hideUsername;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-747295697"
	)
	@Export("updateTitleMusicDisabled")
	void updateTitleMusicDisabled(boolean var1) {
		this.titleMusicDisabled = var1;
		AsyncRestClient.savePreferences();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("isTitleMusicDisabled")
	boolean isTitleMusicDisabled() {
		return this.titleMusicDisabled;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-120"
	)
	@Export("updateDisplayFps")
	void updateDisplayFps(boolean var1) {
		this.displayFps = var1;
		AsyncRestClient.savePreferences();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1522117799"
	)
	@Export("toggleDisplayFps")
	void toggleDisplayFps() {
		this.updateDisplayFps(!this.displayFps);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-63"
	)
	@Export("isDisplayingFps")
	boolean isDisplayingFps() {
		return this.displayFps;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1104716084"
	)
	void method2747(int var1) {
		this.field1348 = var1;
		AsyncRestClient.savePreferences();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "141008103"
	)
	int method2748() {
		return this.field1348;
	}

	@ObfuscatedName("az")
	@Export("updateBrightness")
	void updateBrightness(double var1) {
		this.brightness = var1;
		AsyncRestClient.savePreferences();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "1940605885"
	)
	@Export("getBrightness")
	double getBrightness() {
		return this.brightness;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "293561954"
	)
	@Export("updateMusicVolume")
	void updateMusicVolume(int var1) {
		this.musicVolume = var1;
		AsyncRestClient.savePreferences();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2094438742"
	)
	@Export("getMusicVolume")
	int getMusicVolume() {
		return this.musicVolume;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "111982477"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1;
		AsyncRestClient.savePreferences();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2128181728"
	)
	@Export("getSoundEffectsVolume")
	int getSoundEffectsVolume() {
		return this.soundEffectsVolume;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "235315216"
	)
	@Export("updateAreaSoundEffectsVolume")
	void updateAreaSoundEffectsVolume(int var1) {
		this.areaSoundEffectsVolume = var1;
		AsyncRestClient.savePreferences();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "18"
	)
	@Export("getAreaSoundEffectsVolume")
	int getAreaSoundEffectsVolume() {
		return this.areaSoundEffectsVolume;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1500207798"
	)
	@Export("updateRememberedUsername")
	void updateRememberedUsername(String var1) {
		this.rememberedUsername = var1;
		AsyncRestClient.savePreferences();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "779576991"
	)
	@Export("getRememberedUsername")
	String getRememberedUsername() {
		return this.rememberedUsername;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-45"
	)
	@Export("updateEULA")
	void updateEULA(int var1) {
		this.eula = var1;
		AsyncRestClient.savePreferences();
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "863651433"
	)
	@Export("getEULA")
	int getEULA() {
		return this.eula;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2113123796"
	)
	@Export("updateWindowMode")
	void updateWindowMode(int var1) {
		this.windowMode = var1;
		AsyncRestClient.savePreferences();
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1736223773"
	)
	@Export("getWindowMode")
	int getWindowMode() {
		return this.windowMode;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "1628392199"
	)
	@Export("put")
	void put(String var1, int var2) {
		int var3 = this.getParameterKey(var1);
		if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) {
			Iterator var4 = this.parameters.entrySet().iterator();
			var4.next();
			var4.remove();
		}

		this.parameters.put(var3, var2);
		AsyncRestClient.savePreferences();
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1711665822"
	)
	@Export("containsKey")
	boolean containsKey(String var1) {
		int var2 = this.getParameterKey(var1);
		return this.parameters.containsKey(var2);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1435390397"
	)
	@Export("getParameterValue")
	int getParameterValue(String var1) {
		int var2 = this.getParameterKey(var1);
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1530904426"
	)
	@Export("getParameterKey")
	int getParameterKey(String var1) {
		String var3 = var1.toLowerCase();
		int var4 = var3.length();
		int var5 = 0;

		for (int var6 = 0; var6 < var4; ++var6) {
			var5 = (var5 << 5) - var5 + var3.charAt(var6);
		}

		return var5;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-966519693"
	)
	@Export("setDrawDistance")
	void setDrawDistance(int var1) {
		this.drawDistance = var1;
		if (topLevelWorldView != null) {
			topLevelWorldView.scene.method4930(class461.clientPreferences.getDrawDistance());
		}

		AsyncRestClient.savePreferences();
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "10"
	)
	@Export("getDrawDistance")
	int getDrawDistance() {
		return this.drawDistance;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([[[IIIII)V",
		garbageValue = "2013358759"
	)
	static final void method2841(int[][][] var0, int var1, int var2, int var3) {
		int var4;
		for (var4 = 0; var4 < 8; ++var4) {
			for (int var5 = 0; var5 < 8; ++var5) {
				var0[var1][var4 + var2][var3 + var5] = 0;
			}
		}

		if (var2 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				var0[var1][var2][var3 + var4] = var0[var1][var2 - 1][var3 + var4];
			}
		}

		if (var3 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				var0[var1][var4 + var2][var3] = var0[var1][var4 + var2][var3 - 1];
			}
		}

		if (var2 > 0 && var0[var1][var2 - 1][var3] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
		} else if (var3 > 0 && var0[var1][var2][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
		} else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZS)I",
		garbageValue = "180"
	)
	static int method2815(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
			var3 = TaskHandler.widgetDefinition.method6841(var4);
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : class464.scriptActiveWidget;
		}

		int var23;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			class320.Interpreter_intStackSize -= 2;
			var23 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
			int var16 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
			if (var3.type == 12) {
				class360 var17 = var3.method7268();
				if (var17 != null && var17.method6962(var23, var16)) {
					SecureRandomCallable.invalidateWidget(var3);
				}
			} else {
				var3.scrollX = var23;
				if (var3.scrollX > var3.scrollWidth - var3.width) {
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) {
					var3.scrollX = 0;
				}

				var3.scrollY = var16;
				if (var3.scrollY > var3.scrollHeight - var3.height) {
					var3.scrollY = var3.scrollHeight - var3.height;
				}

				if (var3.scrollY < 0) {
					var3.scrollY = 0;
				}

				SecureRandomCallable.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
			SecureRandomCallable.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
			SecureRandomCallable.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
			SecureRandomCallable.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
			SecureRandomCallable.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
			SecureRandomCallable.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
			SecureRandomCallable.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
			SecureRandomCallable.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
			SecureRandomCallable.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			class320.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 5];
			SecureRandomCallable.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var23 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
			if (var23 != var3.sequenceId) {
				var3.sequenceId = var23;
				var3.modelFrame = 0;
				var3.modelFrameCycle = 0;
				SecureRandomCallable.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
			SecureRandomCallable.invalidateWidget(var3);
			return 1;
		} else {
			String var15;
			class360 var21;
			if (var0 == ScriptOpcodes.CC_SETTEXT) {
				var15 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
				if (var3.type == 12) {
					var21 = var3.method7268();
					if (var21 != null && var21.method7009()) {
						var21.method7231(var15);
					} else {
						var3.text = var15;
					}

					SecureRandomCallable.invalidateWidget(var3);
				} else if (!var15.equals(var3.text)) {
					var3.text = var15;
					SecureRandomCallable.invalidateWidget(var3);
				}

				return 1;
			} else {
				class360 var19;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					if (var3.type == 12) {
						var19 = var3.method7268();
						if (var19 != null) {
							var19.method6969();
						}
					}

					SecureRandomCallable.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					class320.Interpreter_intStackSize -= 3;
					if (var3.type == 12) {
						var19 = var3.method7268();
						if (var19 != null) {
							var19.method6963(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1]);
							var19.method6964(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2]);
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
						var3.textYAlignment = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
						var3.textLineHeight = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
					}

					SecureRandomCallable.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
					SecureRandomCallable.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					SecureRandomCallable.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					SecureRandomCallable.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
					SecureRandomCallable.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
					SecureRandomCallable.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					class320.Interpreter_intStackSize -= 2;
					var3.scrollWidth = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
					var3.scrollHeight = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
					SecureRandomCallable.invalidateWidget(var3);
					if (var4 != -1 && var3.type == 0) {
						AsyncHttpResponse.revalidateWidgetScroll(TaskHandler.widgetDefinition.Widget_interfaceComponents[var4 >> 16], var3, false);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					class531.resumePauseWidget(var3.id, var3.childIndex);
					Client.meslayerContinueWidget = var3;
					SecureRandomCallable.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					SecureRandomCallable.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					SecureRandomCallable.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					SecureRandomCallable.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1125) {
					var23 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					FillMode var22 = (FillMode)ArchiveDiskAction.findEnumerated(Interpreter.FillMode_values(), var23);
					if (var22 != null) {
						var3.fillMode = var22;
						SecureRandomCallable.invalidateWidget(var3);
					}

					return 1;
				} else {
					boolean var14;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var14 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
						var3.field3886 = var14;
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var14 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
						var3.modelTransparency = var14;
						return 1;
					} else if (var0 == 1129) {
						var3.field3889 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
						SecureRandomCallable.invalidateWidget(var3);
						return 1;
					} else if (var0 == 1130) {
						var3.method7338(Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize], "", AsyncHttpResponse.urlRequester, class150.getUserId());
						return 1;
					} else if (var0 == 1131) {
						class320.Interpreter_intStackSize -= 2;
						var3.method7254(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1]);
						return 1;
					} else if (var0 == 1132) {
						var3.method7255(Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
						return 1;
					} else {
						class354 var20;
						if (var0 == 1133) {
							--class320.Interpreter_intStackSize;
							var20 = var3.method7303();
							if (var20 != null) {
								var20.field3774 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
								SecureRandomCallable.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1134) {
							--class320.Interpreter_intStackSize;
							var20 = var3.method7303();
							if (var20 != null) {
								var20.field3771 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
								SecureRandomCallable.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1135) {
							--class465.Interpreter_stringStackSize;
							var19 = var3.method7268();
							if (var19 != null) {
								var3.text2 = Interpreter.Interpreter_stringStack[class465.Interpreter_stringStackSize];
							}

							return 1;
						} else if (var0 == 1136) {
							--class320.Interpreter_intStackSize;
							var20 = var3.method7303();
							if (var20 != null) {
								var20.field3772 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
								SecureRandomCallable.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1137) {
							--class320.Interpreter_intStackSize;
							var19 = var3.method7268();
							if (var19 != null && var19.method7125(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize])) {
								SecureRandomCallable.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1138) {
							--class320.Interpreter_intStackSize;
							var19 = var3.method7268();
							if (var19 != null && var19.method6960(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize])) {
								SecureRandomCallable.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1139) {
							--class320.Interpreter_intStackSize;
							var19 = var3.method7268();
							if (var19 != null && var19.method6995(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize])) {
								SecureRandomCallable.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1140) {
							var14 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							Client.field679.method5545();
							var21 = var3.method7268();
							if (var21 != null && var21.method6953(var14)) {
								if (var14) {
									Client.field679.method5539(var3);
								}

								SecureRandomCallable.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1141) {
							var14 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
							if (!var14 && Client.field679.method5542() == var3) {
								Client.field679.method5545();
								SecureRandomCallable.invalidateWidget(var3);
							}

							var21 = var3.method7268();
							if (var21 != null) {
								var21.method6954(var14);
							}

							return 1;
						} else if (var0 == 1142) {
							class320.Interpreter_intStackSize -= 2;
							var19 = var3.method7268();
							if (var19 != null && var19.method6977(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1])) {
								SecureRandomCallable.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1143) {
							--class320.Interpreter_intStackSize;
							var19 = var3.method7268();
							if (var19 != null && var19.method6977(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize])) {
								SecureRandomCallable.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1144) {
							--class320.Interpreter_intStackSize;
							var19 = var3.method7268();
							if (var19 != null) {
								var19.method6966(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize]);
								SecureRandomCallable.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1145) {
							--class320.Interpreter_intStackSize;
							var19 = var3.method7268();
							if (var19 != null) {
								var19.method7217(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1146) {
							--class320.Interpreter_intStackSize;
							var19 = var3.method7268();
							if (var19 != null) {
								var19.method7008(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1147) {
							--class320.Interpreter_intStackSize;
							var19 = var3.method7268();
							if (var19 != null) {
								var19.method7162(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize]);
								SecureRandomCallable.invalidateWidget(var3);
							}

							return 1;
						} else {
							class27 var18;
							if (var0 == 1148) {
								class320.Interpreter_intStackSize -= 2;
								var18 = var3.method7270();
								if (var18 != null) {
									var18.method379(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								class320.Interpreter_intStackSize -= 2;
								var18 = var3.method7270();
								if (var18 != null) {
									var18.method380((char)Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var3.method7252(Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize], AsyncHttpResponse.urlRequester);
								return 1;
							} else if (var0 == 1151) {
								class465.Interpreter_stringStackSize -= 3;
								var15 = Interpreter.Interpreter_stringStack[class465.Interpreter_stringStackSize];
								String var13 = Interpreter.Interpreter_stringStack[class465.Interpreter_stringStackSize + 1];
								String var7 = Interpreter.Interpreter_stringStack[class465.Interpreter_stringStackSize + 2];
								long var8 = class150.getUserId();
								long var10 = class537.getUserHash();
								String var12 = class88.getPlatformInfo().getDeviceId(class88.getPlatformInfo().os);
								if (-1L != var8) {
									var15 = var15.replaceAll("%userid%", Long.toString(var8));
								}

								if (-1L != var10) {
									var15 = var15.replaceAll("%userhash%", Long.toString(var10));
								}

								if (!var12.isEmpty()) {
									var15 = var15.replaceAll("%deviceid%", var12);
								}

								var3.method7251(var15, var13, var7, var12, Long.toString(var10), AsyncHttpResponse.urlRequester);
								return 1;
							} else if (var0 == 1152) {
								if (var3.type != 11) {
									throw new RuntimeException();
								} else {
									class216 var5 = var3.method7299();
									boolean var6 = var5 != null && var5.method4426() && Player.method2610().method4524(var5.method4407());
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var6 ? 1 : 0;
									return 1;
								}
							} else {
								return 2;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "90"
	)
	static final void method2853(int var0, int var1, int var2, int var3) {
		if (!ViewportMouse.ViewportMouse_false0) {
			byte var8 = 50;
			int var9 = AbstractRasterizer.method4851();
			int var10 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var8 / Rasterizer3D.get3dZoom();
			int var11 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var8 / Rasterizer3D.get3dZoom();
			int var12 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var9 / Rasterizer3D.get3dZoom();
			int var13 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var9 / Rasterizer3D.get3dZoom();
			int var14 = class33.method475(var11, var8, var1, var0);
			int var15 = SecureUrlRequester.method3160(var11, var8, var1, var0);
			var11 = var14;
			var14 = class33.method475(var13, var9, var1, var0);
			var9 = SecureUrlRequester.method3160(var13, var9, var1, var0);
			var13 = var14;
			var14 = class217.method4454(var10, var15, var3, var2);
			var15 = ClanChannel.method3741(var10, var15, var3, var2);
			var10 = var14;
			var14 = class217.method4454(var12, var9, var3, var2);
			var9 = ClanChannel.method3741(var12, var9, var3, var2);
			class431.field4760 = (var14 + var10) / 2;
			WorldMapEvent.field3276 = (var11 + var13) / 2;
			ViewportMouse.field2877 = (var15 + var9) / 2;
			class145.field1679 = (var14 - var10) / 2;
			AbstractSocket.field5024 = (var13 - var11) / 2;
			ArchiveLoader.field1072 = (var9 - var15) / 2;
			class439.field4819 = Math.abs(class145.field1679);
			DefaultsGroup.field5051 = Math.abs(AbstractSocket.field5024);
			ViewportMouse.field2878 = Math.abs(ArchiveLoader.field1072);
			ViewportMouse.ViewportMouse_false0 = true;
		}
	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(Lny;IB)I",
		garbageValue = "-70"
	)
	static final int method2777(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
			try {
				int[] var2 = var0.cs1Instructions[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}

					if (var6 == 1) {
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) {
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) {
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = TaskHandler.widgetDefinition.method6841(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!MouseRecorder.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) {
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) {
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) {
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) {
						var7 = AddRequestTask.localPlayer.combatLevel;
					}

					if (var6 == 9) {
						for (var9 = 0; var9 < 25; ++var9) {
							if (Skills.Skills_enabled[var9]) {
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = TaskHandler.widgetDefinition.method6841(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!MouseRecorder.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 = 999999999;
									break;
								}
							}
						}
					}

					if (var6 == 11) {
						var7 = Client.runEnergy;
					}

					if (var6 == 12) {
						var7 = Client.weight;
					}

					if (var6 == 13) {
						var9 = Varps.Varps_main[var2[var4++]];
						int var13 = var2[var4++];
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = LoginPacket.getVarbit(var9);
					}

					if (var6 == 15) {
						var8 = 1;
					}

					if (var6 == 16) {
						var8 = 2;
					}

					if (var6 == 17) {
						var8 = 3;
					}

					if (var6 == 18) {
						var7 = (AddRequestTask.localPlayer.x >> 7) + topLevelWorldView.baseX;
					}

					if (var6 == 19) {
						var7 = (AddRequestTask.localPlayer.y >> 7) + topLevelWorldView.baseY;
					}

					if (var6 == 20) {
						var7 = var2[var4++];
					}

					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}

						if (var5 == 1) {
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}

						if (var5 == 3) {
							var3 *= var7;
						}

						var5 = 0;
					} else {
						var5 = var8;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}
}
