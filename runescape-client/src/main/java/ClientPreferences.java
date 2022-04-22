import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-587272659)

	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("i")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("f")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("b")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("n")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	1845230803)

	int field1218;
	@ObfuscatedName("l")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	1402013239)

	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-2075315825)

	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	1548024689)

	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 
	-1754436801)

	int field1215;
	@ObfuscatedName("w")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	-2110885389)

	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("d")
	@Export("parameters")
	LinkedHashMap parameters;
	static 
	{
		ClientPreferences_optionCount = 10;
	}

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1215 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2226(true);
	}

	@ObfuscatedSignature(descriptor = 
	"(Lpi;)V")

	ClientPreferences(Buffer var1) {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1215 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		if ((var1 != null) && (var1.array != null)) {
			int var2 = var1.readUnsignedByte();
			if ((var2 >= 0) && (var2 <= ClientPreferences_optionCount)) {
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
					this.field1215 = var1.readUnsignedByte();
				}

				if (var2 > 8) {
					this.displayFps = var1.readUnsignedByte() == 1;
				}

				if (var2 > 9) {
					this.field1218 = var1.readInt();
				}
			} else {
				this.method2226(true);
			}
		} else {
			this.method2226(true);
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(ZB)V", garbageValue = 
	"-37")

	void method2226(boolean var1) {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)Lpi;", garbageValue = 
	"-779178440")

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
		var1.writeByte(((int) (this.brightness * 100.0)));
		var1.writeByte(this.musicVolume);
		var1.writeByte(this.soundEffectsVolume);
		var1.writeByte(this.areaSoundEffectsVolume);
		var1.writeByte(this.field1215);
		var1.writeByte(this.displayFps ? 1 : 0);
		var1.writeInt(this.field1218);
		return var1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(ZI)V", garbageValue = 
	"1690911744")

	void method2246(boolean var1) {
		this.roofsHidden = var1;
		GameEngine.savePreferences();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-51084929")

	boolean method2263() {
		return this.roofsHidden;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(ZI)V", garbageValue = 
	"-1567835423")

	void method2230(boolean var1) {
		this.hideUsername = var1;
		GameEngine.savePreferences();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"266836426")

	boolean method2317() {
		return this.hideUsername;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(ZI)V", garbageValue = 
	"944518633")

	void method2237(boolean var1) {
		this.titleMusicDisabled = var1;
		GameEngine.savePreferences();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"6")

	boolean method2279() {
		return this.titleMusicDisabled;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(ZI)V", garbageValue = 
	"618524190")

	void method2234(boolean var1) {
		this.displayFps = var1;
		GameEngine.savePreferences();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"82")

	void method2302() {
		this.method2234(!this.displayFps);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-509682647")

	boolean method2236() {
		return this.displayFps;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-1989585984")

	void method2260(int var1) {
		this.field1218 = var1;
		GameEngine.savePreferences();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"117")

	int method2238() {
		return this.field1218;
	}

	@ObfuscatedName("m")
	void method2239(double var1) {
		this.brightness = var1;
		GameEngine.savePreferences();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(B)D", garbageValue = 
	"23")

	double method2240() {
		return this.brightness;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"-14")

	void method2241(int var1) {
		this.musicVolume = var1;
		GameEngine.savePreferences();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1354418976")

	int method2321() {
		return this.musicVolume;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"15")

	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1;
		GameEngine.savePreferences();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"38")

	int method2243() {
		return this.soundEffectsVolume;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-1931510599")

	void method2244(int var1) {
		this.areaSoundEffectsVolume = var1;
		GameEngine.savePreferences();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"681521036")

	int method2270() {
		return this.areaSoundEffectsVolume;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)V", garbageValue = 
	"2038280864")

	void method2286(String var1) {
		this.rememberedUsername = var1;
		GameEngine.savePreferences();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = 
	"(S)Ljava/lang/String;", garbageValue = 
	"7053")

	String method2247() {
		return this.rememberedUsername;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"-91")

	void method2248(int var1) {
		this.field1215 = var1;
		GameEngine.savePreferences();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-858252444")

	int method2249() {
		return this.field1215;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1789378363")

	void method2250(int var1) {
		this.windowMode = var1;
		GameEngine.savePreferences();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"114")

	int method2251() {
		return this.windowMode;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(II)Lfh;", garbageValue = 
	"-2074828092")

	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = ((SpotAnimationDefinition) (SpotAnimationDefinition.SpotAnimationDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0);
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1889189967")

	static void method2259() {
		for (ObjectSound var0 = ((ObjectSound) (ObjectSound.objectSounds.last())); var0 != null; var0 = ((ObjectSound) (ObjectSound.objectSounds.previous()))) {
			if (var0.stream1 != null) {
				StructComposition.pcmStreamMixer.removeSubStream(var0.stream1);
				var0.stream1 = null;
			}

			if (var0.stream2 != null) {
				StructComposition.pcmStreamMixer.removeSubStream(var0.stream2);
				var0.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(CI)Z", garbageValue = 
	"441769737")

	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if ((var0 >= ' ') && (var0 <= '~')) {
			return true;
		} else if ((var0 >= 160) && (var0 <= 255)) {
			return true;
		} else {
			return ((((var0 == 8364) || (var0 == 338)) || (var0 == 8212)) || (var0 == 339)) || (var0 == 376);
		}
	}
}