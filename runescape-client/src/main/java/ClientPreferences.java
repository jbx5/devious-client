import net.runelite.mapping.ObfuscatedName;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.awt.Component;
import net.runelite.mapping.Export;
@ObfuscatedName("cv")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 229725929)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;

	@ObfuscatedName("ic")
	@ObfuscatedSignature(descriptor = "[Lqu;")
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;

	@ObfuscatedName("q")
	@Export("roofsHidden")
	boolean roofsHidden;

	@ObfuscatedName("f")
	@Export("hideUsername")
	boolean hideUsername;

	@ObfuscatedName("j")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;

	@ObfuscatedName("e")
	@Export("displayFps")
	boolean displayFps;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -334746973)
	int field1238;

	@ObfuscatedName("w")
	@Export("brightness")
	double brightness;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -1124707181)
	@Export("musicVolume")
	int musicVolume;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -1649253505)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 214111179)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 1784690563)
	int field1247;

	@ObfuscatedName("z")
	@Export("rememberedUsername")
	String rememberedUsername;

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 2087035801)
	@Export("windowMode")
	int windowMode;

	@ObfuscatedName("u")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 10;
	}

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1247 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2242(true);
	}

	@ObfuscatedSignature(descriptor = "(Lqt;)V")
	ClientPreferences(Buffer var1) {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1247 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
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
					this.field1247 = var1.readUnsignedByte();
				}
				if (var2 > 8) {
					this.displayFps = var1.readUnsignedByte() == 1;
				}
				if (var2 > 9) {
					this.field1238 = var1.readInt();
				}
			} else {
				this.method2242(true);
			}
		} else {
			this.method2242(true);
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "-998073107")
	void method2242(boolean var1) {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(B)Lqt;", garbageValue = "26")
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
		var1.writeByte(this.field1247);
		var1.writeByte(this.displayFps ? 1 : 0);
		var1.writeInt(this.field1238);
		return var1;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "-399700086")
	void method2339(boolean var1) {
		this.roofsHidden = var1;
		class220.savePreferences();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "931670239")
	boolean method2245() {
		return this.roofsHidden;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(ZS)V", garbageValue = "2048")
	void method2246(boolean var1) {
		this.hideUsername = var1;
		class220.savePreferences();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-737599418")
	boolean method2247() {
		return this.hideUsername;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "-1124391002")
	void method2248(boolean var1) {
		this.titleMusicDisabled = var1;
		class220.savePreferences();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1328840913")
	boolean method2317() {
		return this.titleMusicDisabled;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(ZB)V", garbageValue = "0")
	void method2250(boolean var1) {
		this.displayFps = var1;
		class220.savePreferences();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1624511223")
	void method2251() {
		this.method2250(!this.displayFps);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "1")
	boolean method2252() {
		return this.displayFps;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "92")
	void method2330(int var1) {
		this.field1238 = var1;
		class220.savePreferences();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1945148699")
	int method2243() {
		return this.field1238;
	}

	@ObfuscatedName("k")
	void method2255(double var1) {
		this.brightness = var1;
		class220.savePreferences();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)D", garbageValue = "-871452438")
	double method2254() {
		return this.brightness;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(IS)V", garbageValue = "5560")
	void method2297(int var1) {
		this.musicVolume = var1;
		class220.savePreferences();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1757790636")
	int method2258() {
		return this.musicVolume;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1680251159")
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1;
		class220.savePreferences();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1274127259")
	int method2241() {
		return this.soundEffectsVolume;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "2115644002")
	void method2341(int var1) {
		this.areaSoundEffectsVolume = var1;
		class220.savePreferences();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "50")
	int method2262() {
		return this.areaSoundEffectsVolume;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "-106")
	void method2260(String var1) {
		this.rememberedUsername = var1;
		class220.savePreferences();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-78579784")
	String method2264() {
		return this.rememberedUsername;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1094835721")
	void method2307(int var1) {
		this.field1247 = var1;
		class220.savePreferences();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "8")
	int method2266() {
		return this.field1247;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "4")
	void method2280(int var1) {
		this.windowMode = var1;
		class220.savePreferences();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = "(S)I", garbageValue = "510")
	int method2268() {
		return this.windowMode;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Ljava/awt/Component;I)V", garbageValue = "-1915359303")
	static void method2344(Component var0) {
		var0.setFocusTraversalKeysEnabled(false);
		var0.addKeyListener(KeyHandler.KeyHandler_instance);
		var0.addFocusListener(KeyHandler.KeyHandler_instance);
	}
}