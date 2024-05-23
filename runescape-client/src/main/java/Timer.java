import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rd")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = -1432285200756225385L
	)
	long field4834;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -3812748211047258135L
	)
	long field4833;
	@ObfuscatedName("aj")
	public boolean field4835;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = -2834928832477283745L
	)
	long field4836;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -4358401982993948489L
	)
	long field4842;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = 4819439958652967L
	)
	long field4838;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1273921
	)
	int field4839;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1014599563
	)
	int field4840;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1118243023
	)
	int field4841;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -797746207
	)
	int field4837;

	public Timer() {
		this.field4834 = -1L;
		this.field4833 = -1L;
		this.field4835 = false;
		this.field4836 = 0L;
		this.field4842 = 0L;
		this.field4838 = 0L;
		this.field4839 = 0;
		this.field4840 = 0;
		this.field4841 = 0;
		this.field4837 = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "5888"
	)
	public void method8390() {
		this.field4834 = class129.method3033();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-269435694"
	)
	public void method8389() {
		if (this.field4834 != -1L) {
			this.field4842 = class129.method3033() - this.field4834;
			this.field4834 = -1L;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "69"
	)
	public void method8391(int var1) {
		this.field4833 = class129.method3033();
		this.field4839 = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "9375"
	)
	public void method8393() {
		if (this.field4833 != -1L) {
			this.field4836 = class129.method3033() - this.field4833;
			this.field4833 = -1L;
		}

		++this.field4841;
		this.field4835 = true;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-988886766"
	)
	public void method8394() {
		this.field4835 = false;
		this.field4840 = 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2019054983"
	)
	public void method8395() {
		this.method8393();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "-1766858383"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4842;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.writeShort((int)var2);
		long var4 = this.field4836;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.writeShort((int)var4);
		long var6 = this.field4838;
		var6 /= 10L;
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}

		var1.writeShort((int)var6);
		var1.writeShort(this.field4839);
		var1.writeShort(this.field4840);
		var1.writeShort(this.field4841);
		var1.writeShort(this.field4837);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "499735574"
	)
	public static int method8396(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) {
			var2 = var2 << 1 | var0 & 1;
			var0 >>>= 1;
		}

		return var2;
	}
}
