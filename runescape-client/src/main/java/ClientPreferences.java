import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	1137490275)

	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("h")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("g")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("l")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("n")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	1182748365)

	int field1237;
	@ObfuscatedName("f")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	1977621949)

	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	949756333)

	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	-925299259)

	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 
	-2046216957)

	int field1245;
	@ObfuscatedName("c")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 
	-1653018799)

	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("p")
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
		this.field1245 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2252(true);
	}

	@ObfuscatedSignature(descriptor = 
	"(Lpd;)V")

	ClientPreferences(Buffer var1) {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1245 = -1;
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
					this.field1245 = var1.readUnsignedByte();
				}

				if (var2 > 8) {
					this.displayFps = var1.readUnsignedByte() == 1;
				}

				if (var2 > 9) {
					this.field1237 = var1.readInt();
				}
			} else {
				this.method2252(true);
			}
		} else {
			this.method2252(true);
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(ZI)V", garbageValue = 
	"330632498")

	void method2252(boolean var1) {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)Lpd;", garbageValue = 
	"-96")

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
		var1.writeByte(this.field1245);
		var1.writeByte(this.displayFps ? 1 : 0);
		var1.writeInt(this.field1237);
		return var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(ZI)V", garbageValue = 
	"80137453")

	void method2254(boolean var1) {
		this.roofsHidden = var1;
		class307.savePreferences();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-2146516502")

	boolean method2255() {
		return this.roofsHidden;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(ZB)V", garbageValue = 
	"-100")

	void method2256(boolean var1) {
		this.hideUsername = var1;
		class307.savePreferences();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"-98")

	boolean method2257() {
		return this.hideUsername;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(ZS)V", garbageValue = 
	"-12968")

	void method2258(boolean var1) {
		this.titleMusicDisabled = var1;
		class307.savePreferences();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"1326801022")

	boolean method2259() {
		return this.titleMusicDisabled;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(ZB)V", garbageValue = 
	"20")

	void method2265(boolean var1) {
		this.displayFps = var1;
		class307.savePreferences();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-20")

	void method2271() {
		this.method2265(!this.displayFps);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-122640703")

	boolean method2251() {
		return this.displayFps;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"30")

	void method2263(int var1) {
		this.field1237 = var1;
		class307.savePreferences();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1736696043")

	int method2275() {
		return this.field1237;
	}

	@ObfuscatedName("s")
	void method2260(double var1) {
		this.brightness = var1;
		class307.savePreferences();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(I)D", garbageValue = 
	"429450872")

	double method2266() {
		return this.brightness;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"272350050")

	void method2326(int var1) {
		this.musicVolume = var1;
		class307.savePreferences();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1605095826")

	int method2288() {
		return this.musicVolume;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"-50")

	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1;
		class307.savePreferences();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"0")

	int method2269() {
		return this.soundEffectsVolume;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = 
	"(IS)V", garbageValue = 
	"128")

	void method2270(int var1) {
		this.areaSoundEffectsVolume = var1;
		class307.savePreferences();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"-18")

	int method2286() {
		return this.areaSoundEffectsVolume;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)V", garbageValue = 
	"1115049469")

	void method2316(String var1) {
		this.rememberedUsername = var1;
		class307.savePreferences();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = 
	"(B)Ljava/lang/String;", garbageValue = 
	"85")

	String method2273() {
		return this.rememberedUsername;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"63")

	void method2274(int var1) {
		this.field1245 = var1;
		class307.savePreferences();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"1")

	int method2268() {
		return this.field1245;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-837481548")

	void method2276(int var1) {
		this.windowMode = var1;
		class307.savePreferences();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1919757284")

	int method2317() {
		return this.windowMode;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"([BI)V", garbageValue = 
	"960216537")

	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class451.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class451.SpriteBuffer_xOffsets = new int[class451.SpriteBuffer_spriteCount];
		class451.SpriteBuffer_yOffsets = new int[class451.SpriteBuffer_spriteCount];
		class451.SpriteBuffer_spriteWidths = new int[class451.SpriteBuffer_spriteCount];
		class451.SpriteBuffer_spriteHeights = new int[class451.SpriteBuffer_spriteCount];
		class460.SpriteBuffer_pixels = new byte[class451.SpriteBuffer_spriteCount][];
		var1.offset = (var0.length - 7) - (class451.SpriteBuffer_spriteCount * 8);
		class451.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class451.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class451.SpriteBuffer_spriteCount; ++var3) {
			class451.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class451.SpriteBuffer_spriteCount; ++var3) {
			class451.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class451.SpriteBuffer_spriteCount; ++var3) {
			class451.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class451.SpriteBuffer_spriteCount; ++var3) {
			class451.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = ((var0.length - 7) - (class451.SpriteBuffer_spriteCount * 8)) - ((var2 - 1) * 3);
		GrandExchangeOfferUnitPriceComparator.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			GrandExchangeOfferUnitPriceComparator.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (GrandExchangeOfferUnitPriceComparator.SpriteBuffer_spritePalette[var3] == 0) {
				GrandExchangeOfferUnitPriceComparator.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < class451.SpriteBuffer_spriteCount; ++var3) {
			int var4 = class451.SpriteBuffer_spriteWidths[var3];
			int var5 = class451.SpriteBuffer_spriteHeights[var3];
			int var6 = var5 * var4;
			byte[] var7 = new byte[var6];
			class460.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + (var4 * var10)] = var1.readByte();
					}
				}
			}
		}

	}
}