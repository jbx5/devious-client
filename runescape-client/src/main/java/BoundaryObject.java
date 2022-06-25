import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hi")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("tr")
	@ObfuscatedGetter(intValue = 274182681)
	static int field2622;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 1257114009)
	@Export("z")
	int z;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -655721437)
	@Export("x")
	int x;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1527654875)
	@Export("y")
	int y;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 364149679)
	@Export("orientationA")
	int orientationA;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1337588957)
	@Export("orientationB")
	int orientationB;

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Lgj;")
	@Export("renderable1")
	public Renderable renderable1;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Lgj;")
	@Export("renderable2")
	public Renderable renderable2;

	@ObfuscatedName("w")
	@ObfuscatedGetter(longValue = 5334859034127772709L)
	@Export("tag")
	public long tag;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -256459155)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lcw;B)V", garbageValue = "-14")
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class135.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IIIIB)V", garbageValue = "94")
	static void method4534(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = ((ObjectSound) (ObjectSound.objectSounds.last())); var4 != null; var4 = ((ObjectSound) (ObjectSound.objectSounds.previous()))) {
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) {
				int var5 = 0;
				if (var1 > var4.maxX) {
					var5 += var1 - var4.maxX;
				} else if (var1 < var4.x) {
					var5 += var4.x - var1;
				}
				if (var2 > var4.maxY) {
					var5 += var2 - var4.maxY;
				} else if (var2 < var4.y) {
					var5 += var4.y - var2;
				}
				if (var5 - 64 <= var4.field812 && class19.clientPreferences.method2262() != 0 && var0 == var4.plane) {
					var5 -= 64;
					if (var5 < 0) {
						var5 = 0;
					}
					int var6 = (var4.field812 - var5) * class19.clientPreferences.method2262() / var4.field812;
					if (var4.stream1 == null) {
						if (var4.soundEffectId >= 0) {
							SoundEffect var7 = SoundEffect.readSoundEffect(Client.archive4, var4.soundEffectId, 0);
							if (var7 != null) {
								RawSound var8 = var7.toRawSound().resample(WorldMapRegion.decimator);
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6);
								var9.setNumLoops(-1);
								class21.pcmStreamMixer.addSubStream(var9);
								var4.stream1 = var9;
							}
						}
					} else {
						var4.stream1.method790(var6);
					}
					if (var4.stream2 == null) {
						if (var4.soundEffectIds != null && (var4.field809 -= var3) <= 0) {
							int var11 = ((int) (Math.random() * ((double) (var4.soundEffectIds.length))));
							SoundEffect var12 = SoundEffect.readSoundEffect(Client.archive4, var4.soundEffectIds[var11], 0);
							if (var12 != null) {
								RawSound var13 = var12.toRawSound().resample(WorldMapRegion.decimator);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6);
								var10.setNumLoops(0);
								class21.pcmStreamMixer.addSubStream(var10);
								var4.stream2 = var10;
								var4.field809 = var4.field819 + ((int) (Math.random() * ((double) (var4.field811 - var4.field819))));
							}
						}
					} else {
						var4.stream2.method790(var6);
						if (!var4.stream2.hasNext()) {
							var4.stream2 = null;
						}
					}
				} else {
					if (var4.stream1 != null) {
						class21.pcmStreamMixer.removeSubStream(var4.stream1);
						var4.stream1 = null;
					}
					if (var4.stream2 != null) {
						class21.pcmStreamMixer.removeSubStream(var4.stream2);
						var4.stream2 = null;
					}
				}
			}
		}
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(descriptor = "(I)J", garbageValue = "-2059501837")
	static long method4536() {
		return Client.field612;
	}
}