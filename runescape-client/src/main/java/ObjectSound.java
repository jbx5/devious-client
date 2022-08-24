import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("by")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Llm;")
	@Export("objectSounds")
	static NodeDeque objectSounds = new NodeDeque();

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 583558677)
	int field807;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -58317953)
	@Export("plane")
	int plane;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 1556959837)
	@Export("x")
	int x;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 937762432)
	@Export("y")
	int y;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1832764288)
	@Export("maxX")
	int maxX;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 1323508352)
	@Export("maxY")
	int maxY;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = -1892809597)
	int field812;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -2067297625)
	@Export("soundEffectId")
	int soundEffectId;

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "Lan;")
	@Export("stream1")
	RawPcmStream stream1;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 320425733)
	int field811;

	@ObfuscatedName("a")
	@Export("soundEffectIds")
	int[] soundEffectIds;

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = -1730297605)
	int field815;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lan;")
	@Export("stream2")
	RawPcmStream stream2;

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "Lgc;")
	@Export("obj")
	ObjectComposition obj;

	ObjectSound() {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(S)V", garbageValue = "15536")
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field812 = var2.int7 * 128;
			this.field807 = var2.int5;
			this.field811 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field812 = 0;
			this.field807 = 0;
			this.field811 = 0;
			this.soundEffectIds = null;
		}
		if (var1 != this.soundEffectId && this.stream1 != null) {
			ModeWhere.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}
	}
}