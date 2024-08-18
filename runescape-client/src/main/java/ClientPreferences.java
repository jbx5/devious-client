import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("dm")
	static boolean field1299;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = 1345473337
	)
	static int field1285;
	@ObfuscatedName("ax")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("ao")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("am")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("ac")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1880094123
	)
	int field1300;
	@ObfuscatedName("ad")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1683955161
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -128156407
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1727398489
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 644052265
	)
	@Export("eula")
	int eula;
	@ObfuscatedName("aw")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1950420839
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -555701115
	)
	@Export("drawDistance")
	int drawDistance;
	@ObfuscatedName("ah")
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
		this.method2608(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Lvg;)V"
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
					this.field1300 = var1.readInt();
				}

				if (var2 > 10) {
					this.drawDistance = var1.readUnsignedByte();
				}
			} else {
				this.method2608(true);
			}
		} else {
			this.method2608(true);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1338042935"
	)
	void method2608(boolean var1) {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lvg;",
		garbageValue = "-2127881955"
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
		var1.writeInt(this.field1300);
		var1.writeByte(this.drawDistance);
		return var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	@Export("updateRoofsHidden")
	void updateRoofsHidden(boolean var1) {
		this.roofsHidden = var1;
		PacketBufferNode.savePreferences();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "971358775"
	)
	@Export("isRoofsHidden")
	boolean isRoofsHidden() {
		return this.roofsHidden;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1851646673"
	)
	@Export("updateHideUsername")
	void updateHideUsername(boolean var1) {
		this.hideUsername = var1;
		PacketBufferNode.savePreferences();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "21"
	)
	@Export("isUsernameHidden")
	boolean isUsernameHidden() {
		return this.hideUsername;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	@Export("updateTitleMusicDisabled")
	void updateTitleMusicDisabled(boolean var1) {
		this.titleMusicDisabled = var1;
		PacketBufferNode.savePreferences();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2007136110"
	)
	@Export("isTitleMusicDisabled")
	boolean isTitleMusicDisabled() {
		return this.titleMusicDisabled;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-91"
	)
	@Export("updateDisplayFps")
	void updateDisplayFps(boolean var1) {
		this.displayFps = var1;
		PacketBufferNode.savePreferences();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "26"
	)
	@Export("toggleDisplayFps")
	void toggleDisplayFps() {
		this.updateDisplayFps(!this.displayFps);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1972838139"
	)
	@Export("isDisplayingFps")
	boolean isDisplayingFps() {
		return this.displayFps;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1594144110"
	)
	void method2619(int var1) {
		this.field1300 = var1;
		PacketBufferNode.savePreferences();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "43"
	)
	int method2719() {
		return this.field1300;
	}

	@ObfuscatedName("af")
	@Export("updateBrightness")
	void updateBrightness(double var1) {
		this.brightness = var1;
		PacketBufferNode.savePreferences();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "-1747590660"
	)
	@Export("getBrightness")
	double getBrightness() {
		return this.brightness;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "646590263"
	)
	@Export("updateMusicVolume")
	void updateMusicVolume(int var1) {
		this.musicVolume = var1;
		PacketBufferNode.savePreferences();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1093738618"
	)
	@Export("getMusicVolume")
	int getMusicVolume() {
		return this.musicVolume;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2129328272"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1;
		PacketBufferNode.savePreferences();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-128"
	)
	@Export("getSoundEffectsVolume")
	int getSoundEffectsVolume() {
		return this.soundEffectsVolume;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "2"
	)
	@Export("updateAreaSoundEffectsVolume")
	void updateAreaSoundEffectsVolume(int var1) {
		this.areaSoundEffectsVolume = var1;
		PacketBufferNode.savePreferences();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "69"
	)
	@Export("getAreaSoundEffectsVolume")
	int getAreaSoundEffectsVolume() {
		return this.areaSoundEffectsVolume;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "114"
	)
	@Export("updateRememberedUsername")
	void updateRememberedUsername(String var1) {
		this.rememberedUsername = var1;
		PacketBufferNode.savePreferences();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "50"
	)
	@Export("getRememberedUsername")
	String getRememberedUsername() {
		return this.rememberedUsername;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-1"
	)
	@Export("updateEULA")
	void updateEULA(int var1) {
		this.eula = var1;
		PacketBufferNode.savePreferences();
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("getEULA")
	int getEULA() {
		return this.eula;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "106"
	)
	@Export("updateWindowMode")
	void updateWindowMode(int var1) {
		this.windowMode = var1;
		PacketBufferNode.savePreferences();
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-474252398"
	)
	@Export("getWindowMode")
	int getWindowMode() {
		return this.windowMode;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "670746647"
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
		PacketBufferNode.savePreferences();
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "129253806"
	)
	@Export("containsKey")
	boolean containsKey(String var1) {
		int var2 = this.getParameterKey(var1);
		return this.parameters.containsKey(var2);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1321285319"
	)
	@Export("getParameterValue")
	int getParameterValue(String var1) {
		int var2 = this.getParameterKey(var1);
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "127"
	)
	@Export("getParameterKey")
	int getParameterKey(String var1) {
		return class249.method4980(var1.toLowerCase());
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1677252786"
	)
	@Export("setDrawDistance")
	void setDrawDistance(int var1) {
		this.drawDistance = var1;
		if (ConcurrentMidiTask.topLevelWorldView != null) {
			ConcurrentMidiTask.topLevelWorldView.scene.method3925(TileItem.clientPreferences.getDrawDistance());
		}

		PacketBufferNode.savePreferences();
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1770214509"
	)
	@Export("getDrawDistance")
	int getDrawDistance() {
		return this.drawDistance;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIII)V",
		garbageValue = "590189301"
	)
	@Export("quicksortStringsWithCorrespondingIntegers")
	static void quicksortStringsWithCorrespondingIntegers(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			quicksortStringsWithCorrespondingIntegers(var0, var1, var2, var5 - 1);
			quicksortStringsWithCorrespondingIntegers(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ldy;I)V",
		garbageValue = "-1873160553"
	)
	static void method2705(WorldView var0) {
		for (int var1 = 0; var1 < var0.worldEntityCount; ++var1) {
			WorldEntity var2 = var0.worldEntities[var0.worldEntityIndices[var1]];
			if (var2 != null) {
				var2.tileHeight = class162.getTileHeight(var0, var2.x, var2.y, var0.plane);
				var2.worldView.scene.cycle = Client.cycle;
				var2.initScenePlane();
				var0.scene.drawEntity(var0.plane, var2.x, var2.y, var2.tileHeight, 60, var2.worldView.scene, var2.currentRotationAngle, 0L, false);
				WorldView var3 = var2.worldView;
				if (Client.renderSelf) {
					KitDefinition.addPlayerToScene(var3, Client.localPlayerIndex, false);
				}

				class87.method2400(var2.worldView);
				class170.addNpcsToScene(var2.worldView, true);
				class211.method4557(var2.worldView);
				class170.addNpcsToScene(var2.worldView, false);
				class87.method2407(var2.worldView);
				PcmPlayer.method801(var2.worldView);
			}
		}

	}
}
