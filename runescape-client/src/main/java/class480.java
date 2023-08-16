import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sc")
public abstract class class480 {
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = -1711054295
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2041242771
	)
	int field4878;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1232031963
	)
	int field4875;
	@ObfuscatedName("af")
	double field4874;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 627724959
	)
	int field4877;

	class480(int var1, int var2) {
		this.field4878 = 0;
		this.field4875 = 0;
		this.field4874 = 0.0D;
		this.field4877 = 0;
		this.field4878 = var1;
		this.field4875 = 0;
		this.field4877 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field4874 = class302.method5727(this.field4875, this.field4878, this.field4877);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-299202193"
	)
	public void method8479() {
		if (this.field4875 < this.field4878) {
			++this.field4875;
			this.field4874 = class302.method5727(this.field4875, this.field4878, this.field4877);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "1467440127"
	)
	double method8473() {
		return this.field4874;
	}
}
