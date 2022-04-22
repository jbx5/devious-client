import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lld;")

	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(descriptor = 
	"Llx;")

	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	-1143373499)

	@Export("plane")
	int plane;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	196890987)

	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-1084424963)

	@Export("y")
	int y;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	993575825)

	@Export("maxX")
	int maxX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	-940444737)

	@Export("maxY")
	int maxY;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	-1342895703)

	int field818;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-1138356125)

	int field814;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	1961686125)

	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lau;")

	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"Lgj;")

	@Export("obj")
	ObjectComposition obj;
	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 
	712620851)

	int field810;
	@ObfuscatedName("w")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	-1687637789)

	int field821;
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"Lau;")

	@Export("stream2")
	RawPcmStream stream2;
	static 
	{
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"725537929")

	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field814 = var2.int7 * 128;
			this.field818 = var2.int5;
			this.field810 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field814 = 0;
			this.field818 = 0;
			this.field810 = 0;
			this.soundEffectIds = null;
		}

		if ((var1 != this.soundEffectId) && (this.stream1 != null)) {
			StructComposition.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(IIIZIZB)V", garbageValue = 
	"20")

	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = DevicePcmPlayerProvider.World_worlds[var6];
			DevicePcmPlayerProvider.World_worlds[var6] = DevicePcmPlayerProvider.World_worlds[var1];
			DevicePcmPlayerProvider.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				if (VerticalAlignment.method3538(DevicePcmPlayerProvider.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
					World var10 = DevicePcmPlayerProvider.World_worlds[var9];
					DevicePcmPlayerProvider.World_worlds[var9] = DevicePcmPlayerProvider.World_worlds[var7];
					DevicePcmPlayerProvider.World_worlds[var7++] = var10;
				}
			}

			DevicePcmPlayerProvider.World_worlds[var1] = DevicePcmPlayerProvider.World_worlds[var7];
			DevicePcmPlayerProvider.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1165685884")

	static void method1757() {
		if (Client.oculusOrbState == 1) {
			Client.field759 = true;
		}

	}
}