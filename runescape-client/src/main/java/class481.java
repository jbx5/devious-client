import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sk")
public abstract class class481 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -403372779
	)
	int field4873;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1457188905
	)
	int field4874;
	@ObfuscatedName("ap")
	double field4872;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 147542391
	)
	int field4875;

	class481(int var1, int var2) {
		this.field4873 = 0;
		this.field4874 = 0;
		this.field4872 = 0.0D;
		this.field4875 = 0;
		this.field4873 = var1;
		this.field4874 = 0;
		this.field4875 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field4872 = class339.method6629(this.field4874, this.field4873, this.field4875);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1393993433"
	)
	public void method8506() {
		if (this.field4874 < this.field4873) {
			++this.field4874;
			this.field4872 = class339.method6629(this.field4874, this.field4873, this.field4875);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "-116783534"
	)
	double method8504() {
		return this.field4872;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SB)V",
		garbageValue = "7"
	)
	public static void method8509(String[] var0, short[] var1) {
		class215.sortItemsByName(var0, var1, 0, var0.length - 1);
	}
}
