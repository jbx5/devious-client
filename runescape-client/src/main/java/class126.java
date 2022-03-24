import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
public class class126 extends class128 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(longValue = 
	-3842845710666604635L)

	long field1526;
	@ObfuscatedName("o")
	String field1527;

	@ObfuscatedSignature(descriptor = 
	"Lee;")

	final class131 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Lee;)V")

	class126(class131 var1) {
		this.this$0 = var1;
		this.field1526 = -1L;
		this.field1527 = null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;B)V", garbageValue = 
	"-73")

	void vmethod3107(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1526 = var1.readLong();
		}

		this.field1527 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Leh;I)V", garbageValue = 
	"-1228032820")

	void vmethod3104(ClanSettings var1) {
		var1.method2918(this.field1526, this.field1527, 0);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/CharSequence;B)Ljava/lang/String;", garbageValue = 
	"82")

	public static String method2817(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((((((((var4 < 'a') || (var4 > 'z')) && ((var4 < 'A') || (var4 > 'Z'))) && ((var4 < '0') || (var4 > '9'))) && (var4 != '.')) && (var4 != '-')) && (var4 != '*')) && (var4 != '_')) {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = class123.charToByteCp1252(var4);
					var2.append('%');
					int var6 = (var5 >> 4) & 15;
					if (var6 >= 10) {
						var2.append(((char) (var6 + 55)));
					} else {
						var2.append(((char) (var6 + 48)));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append(((char) (var6 + 55)));
					} else {
						var2.append(((char) (var6 + 48)));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1862606861")

	public static void method2819() {
		try {
			if (class273.musicPlayerStatus == 1) {
				int var0 = WorldMapEvent.midiPcmStream.method5369();
				if ((var0 > 0) && WorldMapEvent.midiPcmStream.isReady()) {
					var0 -= class273.pcmSampleLength;
					if (var0 < 0) {
						var0 = 0;
					}

					WorldMapEvent.midiPcmStream.setPcmStreamVolume(var0);
					return;
				}

				WorldMapEvent.midiPcmStream.clear();
				WorldMapEvent.midiPcmStream.removeAll();
				if (class147.musicTrackArchive != null) {
					class273.musicPlayerStatus = 2;
				} else {
					class273.musicPlayerStatus = 0;
				}

				class273.musicTrack = null;
				class273.soundCache = null;
			}
		} catch (Exception var2) {
			var2.printStackTrace();
			WorldMapEvent.midiPcmStream.clear();
			class273.musicPlayerStatus = 0;
			class273.musicTrack = null;
			class273.soundCache = null;
			class147.musicTrackArchive = null;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(IIIB)V", garbageValue = 
	"33")

	static final void method2820(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) {
			for (int var4 = 0; var4 < 8; ++var4) {
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) {
			for (var3 = 1; var3 < 8; ++var3) {
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) {
			for (var3 = 1; var3 < 8; ++var3) {
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if ((var1 > 0) && (Tiles.Tiles_heights[var0][var1 - 1][var2] != 0)) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if ((var2 > 0) && (Tiles.Tiles_heights[var0][var1][var2 - 1] != 0)) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (((var1 > 0) && (var2 > 0)) && (Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0)) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	}
}