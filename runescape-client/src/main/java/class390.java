import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
public class class390 {
	@ObfuscatedName("c")
	float field4448;
	@ObfuscatedName("p")
	float field4452;
	@ObfuscatedName("f")
	float field4444;
	@ObfuscatedName("n")
	float field4450;
	@ObfuscatedName("k")
	float field4446;
	@ObfuscatedName("w")
	float field4447;
	@ObfuscatedName("s")
	float field4442;
	@ObfuscatedName("q")
	float field4449;
	@ObfuscatedName("m")
	float field4443;
	@ObfuscatedName("x")
	float field4451;
	@ObfuscatedName("j")
	float field4445;
	@ObfuscatedName("v")
	float field4453;

	static {
		new class390();
	} // L: 6

	class390() {
		this.method7233(); // L: 22
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1328551408"
	)
	void method7233() {
		this.field4453 = 0.0F; // L: 26
		this.field4445 = 0.0F; // L: 27
		this.field4451 = 0.0F; // L: 28
		this.field4449 = 0.0F; // L: 29
		this.field4442 = 0.0F; // L: 30
		this.field4447 = 0.0F; // L: 31
		this.field4450 = 0.0F; // L: 32
		this.field4444 = 0.0F; // L: 33
		this.field4452 = 0.0F; // L: 34
		this.field4443 = 1.0F; // L: 35
		this.field4446 = 1.0F; // L: 36
		this.field4448 = 1.0F; // L: 37
	} // L: 38

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1596898937"
	)
	void method7240(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 41
		float var3 = (float)Math.sin((double)var1); // L: 42
		float var4 = this.field4452; // L: 43
		float var5 = this.field4446; // L: 44
		float var6 = this.field4449; // L: 45
		float var7 = this.field4445; // L: 46
		this.field4452 = var4 * var2 - var3 * this.field4444; // L: 47
		this.field4444 = this.field4444 * var2 + var3 * var4; // L: 48
		this.field4446 = var2 * var5 - var3 * this.field4447; // L: 49
		this.field4447 = var3 * var5 + var2 * this.field4447; // L: 50
		this.field4449 = var6 * var2 - this.field4443 * var3; // L: 51
		this.field4443 = var3 * var6 + var2 * this.field4443; // L: 52
		this.field4445 = var2 * var7 - var3 * this.field4453; // L: 53
		this.field4453 = var2 * this.field4453 + var3 * var7; // L: 54
	} // L: 55

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "5"
	)
	void method7235(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 58
		float var3 = (float)Math.sin((double)var1); // L: 59
		float var4 = this.field4448; // L: 60
		float var5 = this.field4450; // L: 61
		float var6 = this.field4442; // L: 62
		float var7 = this.field4451; // L: 63
		this.field4448 = var3 * this.field4444 + var2 * var4; // L: 64
		this.field4444 = this.field4444 * var2 - var3 * var4; // L: 65
		this.field4450 = var2 * var5 + this.field4447 * var3; // L: 66
		this.field4447 = var2 * this.field4447 - var5 * var3; // L: 67
		this.field4442 = this.field4443 * var3 + var6 * var2; // L: 68
		this.field4443 = var2 * this.field4443 - var6 * var3; // L: 69
		this.field4451 = var7 * var2 + this.field4453 * var3; // L: 70
		this.field4453 = var2 * this.field4453 - var3 * var7; // L: 71
	} // L: 72

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "2028361359"
	)
	void method7236(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 75
		float var3 = (float)Math.sin((double)var1); // L: 76
		float var4 = this.field4448; // L: 77
		float var5 = this.field4450; // L: 78
		float var6 = this.field4442; // L: 79
		float var7 = this.field4451; // L: 80
		this.field4448 = var2 * var4 - this.field4452 * var3; // L: 81
		this.field4452 = var2 * this.field4452 + var3 * var4; // L: 82
		this.field4450 = var5 * var2 - this.field4446 * var3; // L: 83
		this.field4446 = var3 * var5 + this.field4446 * var2; // L: 84
		this.field4442 = var2 * var6 - this.field4449 * var3; // L: 85
		this.field4449 = var2 * this.field4449 + var3 * var6; // L: 86
		this.field4451 = var7 * var2 - this.field4445 * var3; // L: 87
		this.field4445 = var7 * var3 + this.field4445 * var2; // L: 88
	} // L: 89

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-51199894"
	)
	void method7237(float var1, float var2, float var3) {
		this.field4451 += var1; // L: 92
		this.field4445 += var2; // L: 93
		this.field4453 += var3; // L: 94
	} // L: 95

	public String toString() {
		return this.field4448 + "," + this.field4450 + "," + this.field4442 + "," + this.field4451 + "\n" + this.field4452 + "," + this.field4446 + "," + this.field4449 + "," + this.field4445 + "\n" + this.field4444 + "," + this.field4447 + "," + this.field4443 + "," + this.field4453; // L: 99
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llv;III)[Lqu;",
		garbageValue = "94464176"
	)
	public static IndexedSprite[] method7253(AbstractArchive var0, int var1, int var2) {
		return !Occluder.method4475(var0, var1, var2) ? null : GraphicsObject.method2018(); // L: 23 24
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-93"
	)
	static final void method7252() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) { // L: 3404
			int var10002 = Client.queuedSoundEffectDelays[var0]--; // L: 3405
			if (Client.queuedSoundEffectDelays[var0] >= -10) { // L: 3406
				SoundEffect var1 = Client.soundEffects[var0]; // L: 3418
				if (var1 == null) { // L: 3419
					Object var10000 = null; // L: 3420
					var1 = SoundEffect.readSoundEffect(UserComparator10.archive4, Client.soundEffectIds[var0], 0);
					if (var1 == null) { // L: 3421
						continue;
					}

					int[] var13 = Client.queuedSoundEffectDelays; // L: 3422
					var13[var0] += var1.calculateDelay();
					Client.soundEffects[var0] = var1; // L: 3423
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) { // L: 3429
					int var2;
					if (Client.soundLocations[var0] != 0) { // L: 3431
						int var3 = (Client.soundLocations[var0] & 255) * 128; // L: 3432
						int var4 = Client.soundLocations[var0] >> 16 & 255; // L: 3433
						int var5 = var4 * 128 + 64 - class67.localPlayer.x; // L: 3434
						if (var5 < 0) { // L: 3435
							var5 = -var5;
						}

						int var6 = Client.soundLocations[var0] >> 8 & 255; // L: 3436
						int var7 = var6 * 128 + 64 - class67.localPlayer.y; // L: 3437
						if (var7 < 0) { // L: 3438
							var7 = -var7;
						}

						int var8 = var7 + var5 - 128; // L: 3439
						if (var8 > var3) { // L: 3440
							Client.queuedSoundEffectDelays[var0] = -100; // L: 3441
							continue; // L: 3442
						}

						if (var8 < 0) { // L: 3444
							var8 = 0;
						}

						var2 = (var3 - var8) * Player.clientPreferences.method2474() / var3; // L: 3445
					} else {
						var2 = Player.clientPreferences.method2385(); // L: 3447
					}

					if (var2 > 0) { // L: 3448
						RawSound var9 = var1.toRawSound().resample(class327.decimator); // L: 3449
						RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2); // L: 3450
						var10.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1); // L: 3451
						class16.pcmStreamMixer.addSubStream(var10); // L: 3452
					}

					Client.queuedSoundEffectDelays[var0] = -100; // L: 3454
				}
			} else {
				--Client.soundEffectCount; // L: 3407

				for (int var11 = var0; var11 < Client.soundEffectCount; ++var11) { // L: 3408
					Client.soundEffectIds[var11] = Client.soundEffectIds[var11 + 1]; // L: 3409
					Client.soundEffects[var11] = Client.soundEffects[var11 + 1]; // L: 3410
					Client.queuedSoundEffectLoops[var11] = Client.queuedSoundEffectLoops[var11 + 1]; // L: 3411
					Client.queuedSoundEffectDelays[var11] = Client.queuedSoundEffectDelays[var11 + 1]; // L: 3412
					Client.soundLocations[var11] = Client.soundLocations[var11 + 1]; // L: 3413
				}

				--var0; // L: 3415
			}
		}

		if (Client.playingJingle) { // L: 3457
			boolean var12;
			if (class274.musicPlayerStatus != 0) { // L: 3460
				var12 = true; // L: 3461
			} else {
				var12 = class139.midiPcmStream.isReady(); // L: 3464
			}

			if (!var12) { // L: 3466
				if (Player.clientPreferences.method2402() != 0 && Client.currentTrackGroupId != -1) { // L: 3467
					Message.method1164(class14.archive6, Client.currentTrackGroupId, 0, Player.clientPreferences.method2402(), false);
				}

				Client.playingJingle = false; // L: 3468
			}
		}

	} // L: 3471
}
