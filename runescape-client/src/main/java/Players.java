import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("Players")
public class Players {
	@ObfuscatedName("h")
	static byte[] field1288;
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"[Lgv;")

	static class193[] field1285;
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"[Lpd;")

	static Buffer[] field1289;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	-1063456779)

	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("d")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-1214047537)

	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("u")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("r")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("k")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("x")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	-1240441597)

	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("j")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"Lpd;")

	static Buffer field1299;
	static 
	{
		field1288 = new byte[2048];
		field1285 = new class193[2048];
		field1289 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1299 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1554757323")

	static void method2419() {
		for (ObjectSound var0 = ((ObjectSound) (ObjectSound.objectSounds.last())); var0 != null; var0 = ((ObjectSound) (ObjectSound.objectSounds.previous()))) {
			if (var0.stream1 != null) {
				WorldMapIcon_1.pcmStreamMixer.removeSubStream(var0.stream1);
				var0.stream1 = null;
			}

			if (var0.stream2 != null) {
				WorldMapIcon_1.pcmStreamMixer.removeSubStream(var0.stream2);
				var0.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
	}
}