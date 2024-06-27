import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class134 implements Callable {
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("loginState")
	static LoginState loginState;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class135 field1571;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	final class136 field1574;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	final class137 field1570;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -13995373
	)
	final int field1569;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final class142 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lft;Lfd;Lfi;Lfb;I)V"
	)
	class134(class142 var1, class135 var2, class136 var3, class137 var4, int var5) {
		this.this$0 = var1;
		this.field1571 = var2;
		this.field1574 = var3;
		this.field1570 = var4;
		this.field1569 = var5;
	}

	public Object call() {
		this.field1571.method3139();
		class135[][] var1;
		if (this.field1574 == class136.field1601) {
			var1 = this.this$0.field1650;
		} else {
			var1 = this.this$0.field1654;
		}

		var1[this.field1569][this.field1570.method3178()] = this.field1571;
		return null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIILho;IB)V",
		garbageValue = "-19"
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
		var5.field845 = var3.int7 * 128;
		var5.field846 = Math.max(var3.int8 * 16384 - 128, 0);
		var5.field849 = var3.int5;
		var5.field850 = var3.int6;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}

		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field840 = var5.field849 + (int)(Math.random() * (double)(var5.field850 - var5.field849));
		}

	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(I)Lij;",
		garbageValue = "784571849"
	)
	static IndexCheck method3133() {
		return Client.indexCheck;
	}
}
