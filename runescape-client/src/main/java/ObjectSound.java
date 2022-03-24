import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lle;")

	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	1300939823)

	@Export("plane")
	int plane;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	-1842614453)

	@Export("x")
	int x;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	-813654201)

	@Export("y")
	int y;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-1223190233)

	@Export("maxX")
	int maxX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	-1010153229)

	@Export("maxY")
	int maxY;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	-1389167959)

	int field813;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-728064327)

	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"Lam;")

	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"Lgx;")

	@Export("obj")
	ObjectComposition obj;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	1621269019)

	int field809;
	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 
	1625171611)

	int field819;
	@ObfuscatedName("c")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 
	-670062811)

	int field821;
	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"Lam;")

	@Export("stream2")
	RawPcmStream stream2;
	static 
	{
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"349322313")

	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field813 = var2.int7 * 128;
			this.field809 = var2.int5;
			this.field819 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field813 = 0;
			this.field809 = 0;
			this.field819 = 0;
			this.soundEffectIds = null;
		}

		if ((var1 != this.soundEffectId) && (this.stream1 != null)) {
			WorldMapIcon_1.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)Ljava/lang/String;", garbageValue = 
	"32418508")

	static String method1734(String var0) {
		PlayerType[] var1 = HitSplatDefinition.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if ((var3.modIcon != (-1)) && var0.startsWith(class351.method6579(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}

		return var0;
	}
}