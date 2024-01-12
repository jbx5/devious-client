import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public class class7 {
	@ObfuscatedName("am")
	ExecutorService field10;
	@ObfuscatedName("ap")
	Future field11;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	final Buffer field12;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	final class3 field13;

	@ObfuscatedSignature(
		descriptor = "(Luk;Laj;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field10 = Executors.newSingleThreadExecutor();
		this.field12 = var1;
		this.field13 = var2;
		this.method50();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1275905562"
	)
	public boolean method44() {
		return this.field11.isDone();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "25"
	)
	public void method45() {
		this.field10.shutdown();
		this.field10 = null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Luk;",
		garbageValue = "1"
	)
	public Buffer method46() {
		try {
			return (Buffer)this.field11.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "57"
	)
	void method50() {
		this.field11 = this.field10.submit(new class1(this, this.field12, this.field13));
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIILhg;II)V",
		garbageValue = "-867036510"
	)
	@Export("createObjectSound")
	static void createObjectSound(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound();
		var5.plane = var0;
		var5.x = var1 * 128;
		var5.y = var2 * 16384;
		int var6 = var3.sizeX;
		int var7 = var3.sizeY;
		if (var4 == 1 || var4 == 3) {
			var6 = var3.sizeY;
			var7 = var3.sizeX;
		}

		var5.maxX = (var6 + var1) * 128;
		var5.maxY = (var7 + var2) * 128;
		var5.soundEffectId = var3.ambientSoundId;
		var5.field844 = var3.int7 * 16384;
		var5.field834 = var3.int5;
		var5.field840 = var3.int6;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}

		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field842 = var5.field834 + (int)(Math.random() * (double)(var5.field840 - var5.field834));
		}

	}
}
