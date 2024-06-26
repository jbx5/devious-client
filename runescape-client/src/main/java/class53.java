import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
public class class53 extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	class47 field345;

	public class53() {
		this.field345 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcl;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) {
			this.field345 = new class47(var1, (RawSound)null);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lbl;)V"
	)
	public class53(RawSound var1) {
		this.field345 = new class47((VorbisSample)null, var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	public boolean method1098() {
		return this.field345 == null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lbl;",
		garbageValue = "-1684307212"
	)
	public RawSound method1103() {
		if (this.field345 != null && this.field345.field313.tryLock()) {
			RawSound var1;
			try {
				var1 = this.method1101();
			} finally {
				this.field345.field313.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lbl;",
		garbageValue = "0"
	)
	public RawSound method1100() {
		if (this.field345 != null) {
			this.field345.field313.lock();

			RawSound var1;
			try {
				var1 = this.method1101();
			} finally {
				this.field345.field313.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lbl;",
		garbageValue = "1336878389"
	)
	RawSound method1101() {
		if (this.field345.field311 == null) {
			this.field345.field311 = this.field345.field310.toRawSound((int[])null);
			this.field345.field310 = null;
		}

		return this.field345.field311;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1380335122"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var1 == null ? 0 : var1.size();
	}
}
