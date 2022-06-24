import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("g")
public enum class6 implements MouseWheel {

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lg;")
	field17(0, 0);
	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Lqu;")
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;

	@ObfuscatedName("ef")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("archive17")
	static Archive archive17;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -1659874385)
	public final int field16;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -162249617)
	final int field15;

	class6(int var3, int var4) {
		this.field16 = var3;
		this.field15 = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-100")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field15;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1172724173")
	public static boolean method37() {
		ReflectionCheck var0 = ((ReflectionCheck) (class33.reflectionChecks.last()));
		return var0 != null;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IIILgk;II)V", garbageValue = "565551340")
	static void method38(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound();
		var5.plane = var0;
		var5.x = var1 * 128;
		var5.y = var2 * 128;
		int var6 = var3.sizeX;
		int var7 = var3.sizeY;
		if (var4 == 1 || var4 == 3) {
			var6 = var3.sizeY;
			var7 = var3.sizeX;
		}
		var5.maxX = (var6 + var1) * 128;
		var5.maxY = (var7 + var2) * 128;
		var5.soundEffectId = var3.ambientSoundId;
		var5.field812 = var3.int7 * 128;
		var5.field819 = var3.int5;
		var5.field811 = var3.int6;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}
		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field809 = var5.field819 + ((int) (Math.random() * ((double) (var5.field811 - var5.field819))));
		}
	}
}