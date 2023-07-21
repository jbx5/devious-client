import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 8699423217077486177L
	)
	long field4564;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 4671403714336833189L
	)
	long field4567;
	@ObfuscatedName("ar")
	public boolean field4562;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = -5905080384772864585L
	)
	long field4561;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = 641029136384440193L
	)
	long field4565;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 3571423764849221457L
	)
	long field4566;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2133407915
	)
	int field4569;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1194941729
	)
	int field4568;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1688267959
	)
	int field4563;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1956302163
	)
	int field4570;

	public Timer() {
		this.field4564 = -1L;
		this.field4567 = -1L;
		this.field4562 = false;
		this.field4561 = 0L;
		this.field4565 = 0L;
		this.field4566 = 0L;
		this.field4569 = 0;
		this.field4568 = 0;
		this.field4563 = 0;
		this.field4570 = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "4160"
	)
	public void method7737() {
		this.field4564 = class113.method2835();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1471320567"
	)
	public void method7724() {
		if (this.field4564 != -1L) {
			this.field4565 = class113.method2835() - this.field4564;
			this.field4564 = -1L;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1578635933"
	)
	public void method7725(int var1) {
		this.field4567 = class113.method2835();
		this.field4569 = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1011224380"
	)
	public void method7726() {
		if (-1L != this.field4567) {
			this.field4561 = class113.method2835() - this.field4567;
			this.field4567 = -1L;
		}

		++this.field4563;
		this.field4562 = true;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1728500698"
	)
	public void method7727() {
		this.field4562 = false;
		this.field4568 = 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2026051280"
	)
	public void method7728() {
		this.method7726();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "22"
	)
	@Export("write")
	public void write(Buffer var1) {
		Message.method1230(var1, this.field4565);
		Message.method1230(var1, this.field4561);
		Message.method1230(var1, this.field4566);
		var1.writeShort(this.field4569);
		var1.writeShort(this.field4568);
		var1.writeShort(this.field4563);
		var1.writeShort(this.field4570);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-6"
	)
	public static int method7748(int var0) {
		return (var0 & class509.field5054) - 1;
	}
}
