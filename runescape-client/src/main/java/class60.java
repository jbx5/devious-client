import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
public class class60 {
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = 1983512085
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("aq")
	byte[] field413;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1939909553
	)
	int field410;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1005414431
	)
	int field412;

	class60() {
		this.field413 = null;
		this.field410 = 0;
		this.field412 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "9"
	)
	int method1178(int var1) {
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field412; var1 -= var4) {
			var4 = 8 - this.field412;
			int var5 = (1 << var4) - 1;
			var2 += (this.field413[this.field410] >> this.field412 & var5) << var3;
			this.field412 = 0;
			++this.field410;
			var3 += var4;
		}

		if (var1 > 0) {
			var4 = (1 << var1) - 1;
			var2 += (this.field413[this.field410] >> this.field412 & var4) << var3;
			this.field412 += var1;
		}

		return var2;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1896393256"
	)
	int method1166() {
		int var1 = this.field413[this.field410] >> this.field412 & 1;
		++this.field412;
		this.field410 += this.field412 >> 3;
		this.field412 &= 7;
		return var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "-2030419149"
	)
	void method1168(byte[] var1, int var2) {
		this.field413 = var1;
		this.field410 = var2;
		this.field412 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lie;",
		garbageValue = "11"
	)
	public static FloorOverlayDefinition method1179(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0);
			var1 = new FloorOverlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-3016048"
	)
	static void method1172() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var0.stream1 != null) {
				class238.pcmStreamMixer.removeSubStream(var0.stream1);
				var0.stream1 = null;
			}

			if (var0.stream2 != null) {
				class238.pcmStreamMixer.removeSubStream(var0.stream2);
				var0.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1708397335"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (ModeWhere.widgetDefinition.loadInterface(var0)) {
			AsyncHttpResponse.updateInterface(ModeWhere.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
