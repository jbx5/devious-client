import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1014282793
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 475277647
	)
	@Export("x")
	int x;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1834590545
	)
	@Export("y")
	int y;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -565692800
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1181938048
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1410128111
	)
	int field857;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 11649375
	)
	int field864;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -394161421
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2023795085
	)
	int field861;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 770681291
	)
	int field862;
	@ObfuscatedName("ah")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -8538353
	)
	int field860;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1866792379"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field857 = var2.int7 * 128;
			this.field864 = var2.int8 * 128;
			this.field861 = var2.int5;
			this.field862 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field857 = 0;
			this.field864 = 0;
			this.field861 = 0;
			this.field862 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			GameEngine.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}
}
