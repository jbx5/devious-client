import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public class class151 extends class150 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -203536179
	)
	int field1708;
	@ObfuscatedName("ae")
	boolean field1707;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class151(class153 var1) {
		this.this$0 = var1;
		this.field1708 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "127"
	)
	void vmethod3778(Buffer var1) {
		this.field1708 = var1.readUnsignedShort();
		this.field1707 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgo;B)V",
		garbageValue = "32"
	)
	void vmethod3771(ClanSettings var1) {
		var1.method3588(this.field1708, this.field1707);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	public static void method3492() {
		HttpAuthenticationHeader.SpriteBuffer_xOffsets = null;
		Login.SpriteBuffer_yOffsets = null;
		GrandExchangeEvents.SpriteBuffer_spriteWidths = null;
		ModelData0.SpriteBuffer_spriteHeights = null;
		SpriteBufferProperties.SpriteBuffer_spritePalette = null;
		MusicPatchPcmStream.SpriteBuffer_pixels = null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-4045494"
	)
	static void method3482(boolean var0) {
		if (var0) {
			class60.method1192();
		} else {
			for (int var1 = 0; var1 < class334.musicSongs.size(); ++var1) {
				MusicSong var2 = (MusicSong)class334.musicSongs.get(var1);
				if (var2 == null) {
					class334.musicSongs.remove(var1);
					--var1;
				} else if (var2.field3735) {
					if (var2.midiPcmStream.field3637 > 0) {
						--var2.midiPcmStream.field3637;
					}

					var2.midiPcmStream.clear();
					var2.midiPcmStream.method6510();
					var2.midiPcmStream.setPcmStreamVolume(0);
					class334.musicSongs.remove(var1);
					--var1;
				} else {
					var2.field3735 = true;
				}
			}
		}

	}
}
