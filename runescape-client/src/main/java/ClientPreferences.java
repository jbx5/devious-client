import net.runelite.mapping.ObfuscatedName;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
@ObfuscatedName("cn")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 1849447049)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount = 10;

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Lqr;")
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;

	@ObfuscatedName("bm")
	@ObfuscatedGetter(intValue = 546312455)
	static int field1245;

	@ObfuscatedName("dc")
	@ObfuscatedSignature(descriptor = "Lnc;")
	@Export("js5Socket")
	static AbstractSocket js5Socket;

	@ObfuscatedName("jn")
	@ObfuscatedGetter(intValue = 1468675189)
	@Export("cameraYaw")
	static int cameraYaw;

	@ObfuscatedName("w")
	@Export("roofsHidden")
	boolean roofsHidden;

	@ObfuscatedName("v")
	@Export("hideUsername")
	boolean hideUsername = false;

	@ObfuscatedName("c")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;

	@ObfuscatedName("q")
	@Export("displayFps")
	boolean displayFps = false;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -1551707667)
	int field1240;

	@ObfuscatedName("k")
	@Export("brightness")
	double brightness = 0.8;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 798414231)
	@Export("musicVolume")
	int musicVolume = 127;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 1689386949)
	@Export("soundEffectsVolume")
	int soundEffectsVolume = 127;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -608443659)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume = 127;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -1481673311)
	int field1241 = -1;

	@ObfuscatedName("m")
	@Export("rememberedUsername")
	String rememberedUsername = null;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 296751793)
	@Export("windowMode")
	int windowMode = 1;

	@ObfuscatedName("l")
	@Export("parameters")
	LinkedHashMap parameters = new LinkedHashMap();

	ClientPreferences() {
		this.method2221(true);
	}

	@ObfuscatedSignature(descriptor = "(Lqr;)V")
	ClientPreferences(Buffer var1) {
		if (var1 != null && var1.array != null) {
			int var2 = var1.readUnsignedByte();
			if (var2 >= 0 && var2 <= ClientPreferences_optionCount) {
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
					this.brightness = ((double) (var1.readUnsignedByte())) / 100.0;
					this.musicVolume = var1.readUnsignedByte();
					this.soundEffectsVolume = var1.readUnsignedByte();
					this.areaSoundEffectsVolume = var1.readUnsignedByte();
				}
				if (var2 > 7) {
					this.field1241 = var1.readUnsignedByte();
				}
				if (var2 > 8) {
					this.displayFps = var1.readUnsignedByte() == 1;
				}
				if (var2 > 9) {
					this.field1240 = var1.readInt();
				}
			} else {
				this.method2221(true);
			}
		} else {
			this.method2221(true);
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "285882004")
	void method2221(boolean var1) {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)Lqr;", garbageValue = "2077502173")
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(100);
		var1.writeByte(ClientPreferences_optionCount);
		var1.writeByte(this.roofsHidden ? 1 : 0);
		var1.writeByte(this.titleMusicDisabled ? 1 : 0);
		var1.writeByte(this.windowMode);
		var1.writeByte(this.parameters.size());
		Iterator var2 = this.parameters.entrySet().iterator();
		while (var2.hasNext()) {
			Entry var3 = ((Entry) (var2.next()));
			var1.writeInt(((Integer) (var3.getKey())));
			var1.writeInt(((Integer) (var3.getValue())));
		} 
		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : "");
		var1.writeBoolean(this.hideUsername);
		var1.writeByte(((int) (100.0 * this.brightness)));
		var1.writeByte(this.musicVolume);
		var1.writeByte(this.soundEffectsVolume);
		var1.writeByte(this.areaSoundEffectsVolume);
		var1.writeByte(this.field1241);
		var1.writeByte(this.displayFps ? 1 : 0);
		var1.writeInt(this.field1240);
		return var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "-1245363455")
	void method2241(boolean var1) {
		this.roofsHidden = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "174409666")
	boolean method2209() {
		return this.roofsHidden;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "-1424806446")
	void method2210(boolean var1) {
		this.hideUsername = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1653420381")
	boolean method2211() {
		return this.hideUsername;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "121825973")
	void method2212(boolean var1) {
		this.titleMusicDisabled = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1529007775")
	boolean method2213() {
		return this.titleMusicDisabled;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(ZB)V", garbageValue = "-25")
	void method2276(boolean var1) {
		this.displayFps = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-245844861")
	void method2255() {
		this.method2276(!this.displayFps);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "744050622")
	boolean method2216() {
		return this.displayFps;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1413642376")
	void method2217(int var1) {
		this.field1240 = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1323232903")
	int method2218() {
		return this.field1240;
	}

	@ObfuscatedName("l")
	void method2234(double var1) {
		this.brightness = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(S)D", garbageValue = "20495")
	double method2220() {
		return this.brightness;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "4")
	void method2224(int var1) {
		this.musicVolume = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "807829996")
	int method2222() {
		return this.musicVolume;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1777260479")
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-2022982328")
	int method2204() {
		return this.soundEffectsVolume;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "22")
	void method2225(int var1) {
		this.areaSoundEffectsVolume = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-963216332")
	int method2226() {
		return this.areaSoundEffectsVolume;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "1592880074")
	void method2268(String var1) {
		this.rememberedUsername = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-1574056178")
	String method2227() {
		return this.rememberedUsername;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1056396306")
	void method2228(int var1) {
		this.field1241 = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "76")
	int method2229() {
		return this.field1241;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1468848973")
	void method2244(int var1) {
		this.windowMode = var1;
		class83.savePreferences();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1353353753")
	int method2231() {
		return this.windowMode;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)Lbb;", garbageValue = "-30419640")
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return ((Message) (Messages.Messages_hashTable.get(((long) (var0)))));
	}
}