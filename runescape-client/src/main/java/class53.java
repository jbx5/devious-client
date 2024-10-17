import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
public class class53 extends Node {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	public static AbstractArchive field341;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	class47 field340;

	public class53() {
		this.field340 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcd;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) {
			this.field340 = new class47(var1, (RawSound)null);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lbt;)V"
	)
	public class53(RawSound var1) {
		this.field340 = new class47((VorbisSample)null, var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1329688603"
	)
	public boolean method1104() {
		return this.field340 == null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lbt;",
		garbageValue = "-1846771592"
	)
	public RawSound method1105() {
		if (this.field340 != null && this.field340.field304.tryLock()) {
			RawSound var1;
			try {
				var1 = this.method1107();
			} finally {
				this.field340.field304.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lbt;",
		garbageValue = "490766395"
	)
	public RawSound method1123() {
		if (this.field340 != null) {
			this.field340.field304.lock();

			RawSound var1;
			try {
				var1 = this.method1107();
			} finally {
				this.field340.field304.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lbt;",
		garbageValue = "80838377"
	)
	RawSound method1107() {
		if (this.field340.field303 == null) {
			this.field340.field303 = this.field340.field309.toRawSound((int[])null);
			this.field340.field309 = null;
		}

		return this.field340.field303;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lpe;III)Z",
		garbageValue = "1265120400"
	)
	public static boolean method1110(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			ClanChannel.SpriteBuffer_decode(var3);
			return true;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "803797261"
	)
	static int method1103(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "455281879"
	)
	static final void method1114(int var0) {
		if (class416.widgetDefinition.loadInterface(var0)) {
			UserComparator6.drawModelComponents(class416.widgetDefinition.Widget_interfaceComponents[var0], -1);
		}
	}
}
