import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("af")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("aa")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("at")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("ab")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 937088039
	)
	int field1326;
	@ObfuscatedName("ao")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1427090983
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -483689475
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -683553787
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 20381337
	)
	@Export("eula")
	int eula;
	@ObfuscatedName("ae")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -50596465
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -948621627
	)
	int field1327;
	@ObfuscatedName("au")
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
		this.field1327 = 25;
		this.parameters = new LinkedHashMap();
		this.method2505(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Lua;)V"
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
		this.field1327 = 25;
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
					this.field1326 = var1.readInt();
				}

				if (var2 > 10) {
					this.field1327 = var1.readUnsignedByte();
				}
			} else {
				this.method2505(true);
			}
		} else {
			this.method2505(true);
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1822140976"
	)
	void method2505(boolean var1) {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lua;",
		garbageValue = "-727087966"
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
		var1.writeByte((int)(this.brightness * 100.0D));
		var1.writeByte(this.musicVolume);
		var1.writeByte(this.soundEffectsVolume);
		var1.writeByte(this.areaSoundEffectsVolume);
		var1.writeByte(this.eula);
		var1.writeByte(this.displayFps ? 1 : 0);
		var1.writeInt(this.field1326);
		var1.writeByte(this.field1327);
		return var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-96"
	)
	@Export("updateRoofsHidden")
	void updateRoofsHidden(boolean var1) {
		this.roofsHidden = var1;
		class202.savePreferences();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1434051902"
	)
	@Export("isRoofsHidden")
	boolean isRoofsHidden() {
		return this.roofsHidden;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "428305558"
	)
	@Export("updateHideUsername")
	void updateHideUsername(boolean var1) {
		this.hideUsername = var1;
		class202.savePreferences();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-718561153"
	)
	@Export("isUsernameHidden")
	boolean isUsernameHidden() {
		return this.hideUsername;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-891538985"
	)
	@Export("updateTitleMusicDisabled")
	void updateTitleMusicDisabled(boolean var1) {
		this.titleMusicDisabled = var1;
		class202.savePreferences();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1145206959"
	)
	@Export("isTitleMusicDisabled")
	boolean isTitleMusicDisabled() {
		return this.titleMusicDisabled;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1169976115"
	)
	@Export("updateDisplayFps")
	void updateDisplayFps(boolean var1) {
		this.displayFps = var1;
		class202.savePreferences();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "995239248"
	)
	@Export("toggleDisplayFps")
	void toggleDisplayFps() {
		this.updateDisplayFps(!this.displayFps);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isDisplayingFps")
	boolean isDisplayingFps() {
		return this.displayFps;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1847221655"
	)
	void method2556(int var1) {
		this.field1326 = var1;
		class202.savePreferences();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1723685321"
	)
	int method2618() {
		return this.field1326;
	}

	@ObfuscatedName("ax")
	@Export("updateBrightness")
	void updateBrightness(double var1) {
		this.brightness = var1;
		class202.savePreferences();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "-45549100"
	)
	@Export("getBrightness")
	double getBrightness() {
		return this.brightness;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-740577446"
	)
	@Export("updateMusicVolume")
	void updateMusicVolume(int var1) {
		this.musicVolume = var1;
		class202.savePreferences();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-21"
	)
	@Export("getMusicVolume")
	int getMusicVolume() {
		return this.musicVolume;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2104366538"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1;
		class202.savePreferences();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "9933"
	)
	@Export("getSoundEffectsVolume")
	int getSoundEffectsVolume() {
		return this.soundEffectsVolume;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-996029927"
	)
	@Export("updateAreaSoundEffectsVolume")
	void updateAreaSoundEffectsVolume(int var1) {
		this.areaSoundEffectsVolume = var1;
		class202.savePreferences();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1831722097"
	)
	@Export("getAreaSoundEffectsVolume")
	int getAreaSoundEffectsVolume() {
		return this.areaSoundEffectsVolume;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-9"
	)
	@Export("updateRememberedUsername")
	void updateRememberedUsername(String var1) {
		this.rememberedUsername = var1;
		class202.savePreferences();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-584717344"
	)
	@Export("getRememberedUsername")
	String getRememberedUsername() {
		return this.rememberedUsername;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1662012789"
	)
	@Export("updateEULA")
	void updateEULA(int var1) {
		this.eula = var1;
		class202.savePreferences();
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1611340914"
	)
	int method2529() {
		return this.eula;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "6"
	)
	@Export("updateWindowMode")
	void updateWindowMode(int var1) {
		this.windowMode = var1;
		class202.savePreferences();
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-101495280"
	)
	@Export("getWindowMode")
	int getWindowMode() {
		return this.windowMode;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "539829909"
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
		class202.savePreferences();
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "6"
	)
	@Export("containsKey")
	boolean containsKey(String var1) {
		int var2 = this.getParameterKey(var1);
		return this.parameters.containsKey(var2);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1197187535"
	)
	@Export("getParameterValue")
	int getParameterValue(String var1) {
		int var2 = this.getParameterKey(var1);
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "845688822"
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

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "16"
	)
	void method2536(int var1) {
		this.field1327 = var1;
		if (class358.scene != null) {
			class358.scene.field1331.method4971(class459.clientPreferences.method2577());
		}

		class202.savePreferences();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-110"
	)
	int method2577() {
		return this.field1327;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-751638598"
	)
	static int method2629(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "123"
	)
	static final boolean method2630() {
		return ViewportMouse.ViewportMouse_isInViewport;
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Ldt;ZLuk;I)V",
		garbageValue = "-1493100299"
	)
	static final void method2546(class101 var0, boolean var1, PacketBuffer var2) {
		Client.field658 = 0;
		Client.field588 = 0;
		var2.importIndex();
		int var3 = var2.readBits(8);
		int var4;
		if (var3 < var0.field1344) {
			for (var4 = var3; var4 < var0.field1344; ++var4) {
				Client.field659[++Client.field658 - 1] = var0.field1345[var4];
			}
		}

		if (var3 > var0.field1344) {
			throw new RuntimeException("");
		} else {
			var0.field1344 = 0;

			int var7;
			int var8;
			int var9;
			int var10;
			for (var4 = 0; var4 < var3; ++var4) {
				int var20 = var0.field1345[var4];
				class103 var21 = var0.field1343[var20];
				var7 = var2.readBits(1);
				if (var7 == 0) {
					var0.field1345[++var0.field1344 - 1] = var20;
					var21.field1263 = Client.cycle;
				} else {
					var8 = var2.readBits(2);
					if (var8 == 0) {
						var0.field1345[++var0.field1344 - 1] = var20;
						var21.field1263 = Client.cycle;
						Client.overheadTextXs[++Client.field588 - 1] = var20;
					} else if (var8 == 1) {
						var0.field1345[++var0.field1344 - 1] = var20;
						var21.field1263 = Client.cycle;
						var9 = var2.readBits(3);
						var21.method2657(var9, class237.field2525);
						var10 = var2.readBits(1);
						if (var10 == 1) {
							Client.overheadTextXs[++Client.field588 - 1] = var20;
						}
					} else if (var8 == 2) {
						var0.field1345[++var0.field1344 - 1] = var20;
						var21.field1263 = Client.cycle;
						if (var2.readBits(1) == 1) {
							var9 = var2.readBits(3);
							var21.method2657(var9, class237.field2529);
							var10 = var2.readBits(3);
							var21.method2657(var10, class237.field2529);
						} else {
							var9 = var2.readBits(3);
							var21.method2657(var9, class237.field2524);
						}

						var9 = var2.readBits(1);
						if (var9 == 1) {
							Client.overheadTextXs[++Client.field588 - 1] = var20;
						}
					} else if (var8 == 3) {
						Client.field659[++Client.field658 - 1] = var20;
					}
				}
			}

			class155.method3295(var0, var1, var2);

			for (var3 = 0; var3 < Client.field588; ++var3) {
				var4 = Client.overheadTextXs[var3];
				class103 var5 = var0.field1343[var4];
				int var6 = var2.readUnsignedByte();
				if ((var6 & 1) != 0) {
					var7 = var2.readUnsignedByte();
					var6 += var7 << 8;
				}

				if ((var6 & 4096) != 0) {
					var7 = var2.readUnsignedByte();
					var6 += var7 << 16;
				}

				if ((var6 & 8) != 0) {
					var5.field1359 = class134.getNpcDefinition(var2.readUnsignedShortAddLE());
					class4.method15(var5);
					var5.method2665();
				}

				if ((var6 & 4) != 0) {
					var7 = var2.readUnsignedShortAddLE();
					if (var7 == 65535) {
						var7 = -1;
					}

					var8 = var2.readUnsignedByte();
					if (var7 == var5.field1223 && var7 != -1) {
						var9 = FaceNormal.SequenceDefinition_get(var7).restartMode;
						if (var9 == 1) {
							var5.field1250 = 0;
							var5.field1251 = 0;
							var5.field1252 = var8;
							var5.field1239 = 0;
						}

						if (var9 == 2) {
							var5.field1239 = 0;
						}
					} else if (var7 == -1 || var5.field1223 == -1 || FaceNormal.SequenceDefinition_get(var7).field2409 >= FaceNormal.SequenceDefinition_get(var5.field1223).field2409) {
						var5.field1223 = var7;
						var5.field1250 = 0;
						var5.field1251 = 0;
						var5.field1252 = var8;
						var5.field1239 = 0;
						var5.field1226 = var5.field1274;
					}
				}

				if ((var6 & 2) != 0) {
					var5.field1224 = var2.readStringCp1252NullTerminated();
					var5.field1218 = 100;
				}

				int var11;
				int var12;
				int[] var15;
				short[] var16;
				short[] var17;
				long var18;
				boolean var22;
				if ((var6 & 512) != 0) {
					var7 = var2.readUnsignedByte();
					if ((var7 & 1) == 1) {
						var5.method2688();
					} else {
						var15 = null;
						if ((var7 & 2) == 2) {
							var9 = var2.readShortLE();
							var15 = new int[var9];

							for (var10 = 0; var10 < var9; ++var10) {
								var11 = var2.readUnsignedIntLE();
								var11 = var11 == 65535 ? -1 : var11;
								var15[var10] = var11;
							}
						}

						var16 = null;
						if ((var7 & 4) == 4) {
							var10 = 0;
							if (var5.field1359.recolorTo != null) {
								var10 = var5.field1359.recolorTo.length;
							}

							var16 = new short[var10];

							for (var11 = 0; var11 < var10; ++var11) {
								var16[var11] = (short)var2.readUnsignedIntIME();
							}
						}

						var17 = null;
						if ((var7 & 8) == 8) {
							var11 = 0;
							if (var5.field1359.retextureTo != null) {
								var11 = var5.field1359.retextureTo.length;
							}

							var17 = new short[var11];

							for (var12 = 0; var12 < var11; ++var12) {
								var17[var12] = (short)var2.readUnsignedShort();
							}
						}

						var22 = false;
						if ((var7 & 16) != 0) {
							var22 = var2.readUnsignedByteSub() == 1;
						}

						var18 = (long)(++class103.field1364 - 1);
						var5.method2668(new NpcOverrides(var18, var15, var16, var17, var22));
					}
				}

				if ((var6 & 128) != 0) {
					var7 = var2.readUnsignedIntIME();
					var8 = var2.readUnsignedShort();
					var5.field1244 = var2.readUnsignedShortAdd() == 1;
					var5.field1242 = var7;
					var5.field1243 = var8;
				}

				if ((var6 & 131072) != 0) {
					var7 = var2.readUnsignedByte();
					var15 = new int[8];
					var16 = new short[8];

					for (var10 = 0; var10 < 8; ++var10) {
						if ((var7 & 1 << var10) != 0) {
							var15[var10] = var2.readNullableLargeSmart();
							var16[var10] = (short)var2.readShortSmartSub();
						} else {
							var15[var10] = -1;
							var16[var10] = -1;
						}
					}

					var5.method2664(var15, var16);
				}

				if ((var6 & 2048) != 0) {
					var7 = var2.readUnsignedByteSub();
					if ((var7 & 1) == 1) {
						var5.method2669();
					} else {
						var15 = null;
						if ((var7 & 2) == 2) {
							var9 = var2.readShortLE();
							var15 = new int[var9];

							for (var10 = 0; var10 < var9; ++var10) {
								var11 = var2.readUnsignedIntIME();
								var11 = var11 == 65535 ? -1 : var11;
								var15[var10] = var11;
							}
						}

						var16 = null;
						if ((var7 & 4) == 4) {
							var10 = 0;
							if (var5.field1359.recolorTo != null) {
								var10 = var5.field1359.recolorTo.length;
							}

							var16 = new short[var10];

							for (var11 = 0; var11 < var10; ++var11) {
								var16[var11] = (short)var2.readUnsignedShortAddLE();
							}
						}

						var17 = null;
						if ((var7 & 8) == 8) {
							var11 = 0;
							if (var5.field1359.retextureTo != null) {
								var11 = var5.field1359.retextureTo.length;
							}

							var17 = new short[var11];

							for (var12 = 0; var12 < var11; ++var12) {
								var17[var12] = (short)var2.readUnsignedIntIME();
							}
						}

						var22 = false;
						if ((var7 & 16) != 0) {
							var22 = var2.readUnsignedByte() == 1;
						}

						var18 = (long)(++class103.field1366 - 1);
						var5.method2692(new NpcOverrides(var18, var15, var16, var17, var22));
					}
				}

				if ((var6 & 1024) != 0) {
					var5.method2653(var2.readStringCp1252NullTerminated());
				}

				if ((var6 & 32) != 0) {
					var7 = var2.readUnsignedShortAdd();
					int var13;
					if (var7 > 0) {
						for (var8 = 0; var8 < var7; ++var8) {
							var10 = -1;
							var11 = -1;
							var12 = -1;
							var9 = var2.readUShortSmart();
							if (var9 == 32767) {
								var9 = var2.readUShortSmart();
								var11 = var2.readUShortSmart();
								var10 = var2.readUShortSmart();
								var12 = var2.readUShortSmart();
							} else if (var9 != 32766) {
								var11 = var2.readUShortSmart();
							} else {
								var9 = -1;
							}

							var13 = var2.readUShortSmart();
							var5.addHitSplat(var9, var11, var10, var12, Client.cycle, var13);
						}
					}

					var8 = var2.readUnsignedByteSub();
					if (var8 > 0) {
						for (var9 = 0; var9 < var8; ++var9) {
							var10 = var2.readUShortSmart();
							var11 = var2.readUShortSmart();
							if (var11 != 32767) {
								var12 = var2.readUShortSmart();
								var13 = var2.readUnsignedShortAdd();
								int var14 = var11 > 0 ? var2.readShortLE() : var13;
								var5.addHealthBar(var10, Client.cycle, var11, var12, var13, var14);
							} else {
								var5.removeHealthBar(var10);
							}
						}
					}
				}

				if ((var6 & 256) != 0) {
					var5.field1265 = Client.cycle + var2.readUnsignedIntIME();
					var5.field1266 = Client.cycle + var2.readUnsignedIntLE();
					var5.field1267 = var2.readByteAdd();
					var5.field1268 = var2.readByte();
					var5.field1269 = var2.readByte();
					var5.field1270 = (byte)var2.readUnsignedByteSub();
				}

				if ((var6 & 32768) != 0) {
					var5.field1280 = var2.readInt();
				}

				if ((var6 & 64) != 0) {
					var5.field1219 = var2.readUnsignedIntLE();
					var5.field1219 += var2.readUnsignedByteSub() << 16;
					var7 = 16777215;
					if (var7 == var5.field1219) {
						var5.field1219 = -1;
					}
				}

				if ((var6 & 262144) != 0) {
					var7 = var2.readUnsignedShortLE();
					var5.field1241 = (var7 & 1) != 0 ? var2.readUnsignedShort() : var5.field1359.turnLeftSequence;
					var5.field1212 = (var7 & 2) != 0 ? var2.readUnsignedIntLE() : var5.field1359.turnRightSequence;
					var5.field1213 = (var7 & 4) != 0 ? var2.readUnsignedShort() : var5.field1359.walkSequence;
					var5.field1222 = (var7 & 8) != 0 ? var2.readUnsignedIntIME() : var5.field1359.walkBackSequence;
					var5.field1205 = (var7 & 16) != 0 ? var2.readUnsignedShortAddLE() : var5.field1359.walkLeftSequence;
					var5.field1216 = (var7 & 32) != 0 ? var2.readUnsignedIntLE() : var5.field1359.walkRightSequence;
					var5.field1217 = (var7 & 64) != 0 ? var2.readUnsignedIntLE() : var5.field1359.field2130;
					var5.field1215 = (var7 & 128) != 0 ? var2.readUnsignedIntLE() : var5.field1359.field2131;
					var5.field1225 = (var7 & 256) != 0 ? var2.readUnsignedIntLE() : var5.field1359.field2161;
					var5.field1220 = (var7 & 512) != 0 ? var2.readUnsignedIntIME() : var5.field1359.field2133;
					var5.field1273 = (var7 & 1024) != 0 ? var2.readUnsignedShortAddLE() : var5.field1359.field2134;
					var5.field1206 = (var7 & 2048) != 0 ? var2.readUnsignedIntLE() : var5.field1359.field2135;
					var5.field1281 = (var7 & 4096) != 0 ? var2.readUnsignedIntLE() : var5.field1359.field2136;
					var5.field1228 = (var7 & 8192) != 0 ? var2.readUnsignedShortAddLE() : var5.field1359.field2124;
					var5.idleSequence = (var7 & 16384) != 0 ? var2.readUnsignedIntIME() : var5.field1359.idleSequence;
				}

				if ((var6 & 16) != 0) {
					var2.readUnsignedShort();
					var2.readUnsignedIntME();
				}

				if ((var6 & 65536) != 0) {
					var7 = var2.readUnsignedShortAdd();

					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var2.readUnsignedShortAdd();
						var10 = var2.readUnsignedIntLE();
						var11 = var2.readInt();
						var5.updateSpotAnimation(var9, var10, var11 >> 16, var11 & 65535);
					}
				}

				if ((var6 & 8192) != 0) {
					var5.method2678(var2.readShortLE());
				}

				if ((var6 & 16384) != 0) {
					var5.field1256 = var2.readByteSub();
					var5.field1258 = var2.readByte();
					var5.field1257 = var2.readByteNeg();
					var5.field1259 = var2.readByteSub();
					var5.field1260 = var2.readUnsignedShort() + Client.cycle;
					var5.field1261 = var2.readUnsignedShort() + Client.cycle;
					var5.field1262 = var2.readUnsignedIntLE();
					var5.field1274 = 1;
					var5.field1226 = 0;
					var5.field1256 += var5.field1229[0];
					var5.field1258 += var5.field1276[0];
					var5.field1257 += var5.field1229[0];
					var5.field1259 += var5.field1276[0];
				}
			}

			for (var3 = 0; var3 < Client.field658; ++var3) {
				var4 = Client.field659[var3];
				if (var0.field1343[var4].field1263 != Client.cycle) {
					var0.field1343[var4].field1359 = null;
					var0.field1343[var4] = null;
				}
			}

			if (var2.offset != Client.packetWriter.serverPacketLength) {
				throw new RuntimeException(var2.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var3 = 0; var3 < var0.field1344; ++var3) {
					if (var0.field1343[var0.field1345[var3]] == null) {
						throw new RuntimeException(var3 + "," + var0.field1344);
					}
				}

			}
		}
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "([Lnb;II)V",
		garbageValue = "774896882"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						SecureUrlRequester.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					class371.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = AsyncRestClient.widgetDefinition.method6536(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					class371.runScriptEvent(var5);
				}
			}
		}

	}
}
