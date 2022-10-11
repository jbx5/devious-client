import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public abstract class class166 {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -485044255
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("n")
	String field1821;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	final class156 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfc;Ljava/lang/String;)V"
	)
	class166(class156 var1, String var2) {
		this.this$0 = var1; // L: 331
		this.field1821 = var2; // L: 332
	} // L: 333

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-748814320"
	)
	public abstract int vmethod3480();

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "13"
	)
	public String vmethod3481() {
		return null; // L: 342
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-516438870"
	)
	public int vmethod3482() {
		return -1; // L: 346
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2058447212"
	)
	public String method3493() {
		return this.field1821; // L: 336
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "426296250"
	)
	static void method3494(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 99
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) { // L: 100
				int var5 = 0; // L: 101
				if (var1 > var4.maxX * 128) { // L: 102
					var5 += var1 - var4.maxX * 128;
				} else if (var1 < var4.x * 16384) { // L: 103
					var5 += var4.x * 16384 - var1;
				}

				if (var2 > var4.maxY * 16384) { // L: 104
					var5 += var2 - var4.maxY * 16384;
				} else if (var2 < var4.y * 128) { // L: 105
					var5 += var4.y * 128 - var2;
				}

				if (var5 - 64 <= var4.field823 && Player.clientPreferences.method2474() != 0 && var0 == var4.plane) { // L: 106
					var5 -= 64; // L: 117
					if (var5 < 0) { // L: 118
						var5 = 0;
					}

					int var6 = (var4.field823 - var5) * Player.clientPreferences.method2474() / var4.field823; // L: 119
					if (var4.stream1 == null) { // L: 120
						if (var4.soundEffectId >= 0) { // L: 121
							SoundEffect var7 = SoundEffect.readSoundEffect(UserComparator10.archive4, var4.soundEffectId, 0); // L: 122
							if (var7 != null) { // L: 123
								RawSound var8 = var7.toRawSound().resample(class327.decimator); // L: 124
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6); // L: 125
								var9.setNumLoops(-1); // L: 126
								class16.pcmStreamMixer.addSubStream(var9); // L: 127
								var4.stream1 = var9; // L: 128
							}
						}
					} else {
						var4.stream1.method854(var6); // L: 132
					}

					if (var4.stream2 == null) { // L: 133
						if (var4.soundEffectIds != null && (var4.field829 -= var3) <= 0) { // L: 134
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length); // L: 135
							SoundEffect var12 = SoundEffect.readSoundEffect(UserComparator10.archive4, var4.soundEffectIds[var11], 0); // L: 136
							if (var12 != null) { // L: 137
								RawSound var13 = var12.toRawSound().resample(class327.decimator); // L: 138
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6); // L: 139
								var10.setNumLoops(0); // L: 140
								class16.pcmStreamMixer.addSubStream(var10); // L: 141
								var4.stream2 = var10; // L: 142
								var4.field829 = var4.field819 + (int)(Math.random() * (double)(var4.field827 - var4.field819)); // L: 143
							}
						}
					} else {
						var4.stream2.method854(var6); // L: 148
						if (!var4.stream2.hasNext()) { // L: 149
							var4.stream2 = null; // L: 150
						}
					}
				} else {
					if (var4.stream1 != null) { // L: 107
						class16.pcmStreamMixer.removeSubStream(var4.stream1); // L: 108
						var4.stream1 = null; // L: 109
					}

					if (var4.stream2 != null) { // L: 111
						class16.pcmStreamMixer.removeSubStream(var4.stream2); // L: 112
						var4.stream2 = null; // L: 113
					}
				}
			}
		}

	} // L: 154

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public static final void method3479() {
		ViewportMouse.ViewportMouse_isInViewport = false; // L: 87
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 88
	} // L: 89

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IZIB)V",
		garbageValue = "0"
	)
	public static final void method3490(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) { // L: 49
			PcmPlayer.field307 = var0; // L: 50
			PcmPlayer.PcmPlayer_stereo = var1; // L: 51
			PcmPlayer.field289 = var2; // L: 52
		} else {
			throw new IllegalArgumentException();
		}
	} // L: 53
}
