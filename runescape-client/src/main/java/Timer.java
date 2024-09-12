import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rs")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 7784924872236642853L
	)
	long field4878;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -5637713350767232039L
	)
	long field4883;
	@ObfuscatedName("ag")
	public boolean field4879;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = 760269766042478825L
	)
	long field4880;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = 3236048057709327751L
	)
	long field4881;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -5015578733524811349L
	)
	long field4882;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1095804043
	)
	int field4877;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1846275165
	)
	int field4884;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1039152439
	)
	int field4885;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1942397585
	)
	int field4886;

	public Timer() {
		this.field4878 = -1L;
		this.field4883 = -1L;
		this.field4879 = false;
		this.field4880 = 0L;
		this.field4881 = 0L;
		this.field4882 = 0L;
		this.field4877 = 0;
		this.field4884 = 0;
		this.field4885 = 0;
		this.field4886 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1044538422"
	)
	public void method8665() {
		this.field4878 = WorldMapElement.method3843();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1856125296"
	)
	public void method8666() {
		if (-1L != this.field4878) {
			this.field4881 = WorldMapElement.method3843() - this.field4878;
			this.field4878 = -1L;
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "349635744"
	)
	public void method8664(int var1) {
		this.field4883 = WorldMapElement.method3843();
		this.field4877 = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "3835"
	)
	public void method8668() {
		if (this.field4883 != -1L) {
			this.field4880 = WorldMapElement.method3843() - this.field4883;
			this.field4883 = -1L;
		}

		++this.field4885;
		this.field4879 = true;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1505439156"
	)
	public void method8669() {
		this.field4879 = false;
		this.field4884 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1274017525"
	)
	public void method8684() {
		this.method8668();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "-66666533"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4881;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.writeShort((int)var2);
		long var4 = this.field4880;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.writeShort((int)var4);
		long var6 = this.field4882;
		var6 /= 10L;
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}

		var1.writeShort((int)var6);
		var1.writeShort(this.field4877);
		var1.writeShort(this.field4884);
		var1.writeShort(this.field4885);
		var1.writeShort(this.field4886);
	}
}
