import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ri")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 4967844252508248949L
	)
	long field4854;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = -7702364636721094597L
	)
	long field4852;
	@ObfuscatedName("ag")
	public boolean field4859;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = 3838602930801498373L
	)
	long field4857;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 3868601707168331443L
	)
	long field4855;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = 8299523440899943207L
	)
	long field4856;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1130866977
	)
	int field4853;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 121779419
	)
	int field4858;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1169960417
	)
	int field4851;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 366870427
	)
	int field4860;

	public Timer() {
		this.field4854 = -1L;
		this.field4852 = -1L;
		this.field4859 = false;
		this.field4857 = 0L;
		this.field4855 = 0L;
		this.field4856 = 0L;
		this.field4853 = 0;
		this.field4858 = 0;
		this.field4851 = 0;
		this.field4860 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "33555427"
	)
	public void method8328() {
		this.field4854 = WorldMapData_1.method4861();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-489815838"
	)
	public void method8338() {
		if (-1L != this.field4854) {
			this.field4855 = WorldMapData_1.method4861() - this.field4854;
			this.field4854 = -1L;
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2134692845"
	)
	public void method8334(int var1) {
		this.field4852 = WorldMapData_1.method4861();
		this.field4853 = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-389245349"
	)
	public void method8331() {
		if (this.field4852 != -1L) {
			this.field4857 = WorldMapData_1.method4861() - this.field4852;
			this.field4852 = -1L;
		}

		++this.field4851;
		this.field4859 = true;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1134261599"
	)
	public void method8332() {
		this.field4859 = false;
		this.field4858 = 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-100"
	)
	public void method8333() {
		this.method8331();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "-87"
	)
	@Export("write")
	public void write(Buffer var1) {
		class432.method8013(var1, this.field4855);
		class432.method8013(var1, this.field4857);
		class432.method8013(var1, this.field4856);
		var1.writeShort(this.field4853);
		var1.writeShort(this.field4858);
		var1.writeShort(this.field4851);
		var1.writeShort(this.field4860);
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(III)Ljv;",
		garbageValue = "807271628"
	)
	static RouteStrategy method8348(int var0, int var1) {
		Client.field645.approxDestinationX = var0;
		Client.field645.approxDestinationY = var1;
		Client.field645.approxDestinationSizeX = 1;
		Client.field645.approxDestinationSizeX = 1;
		return Client.field645;
	}
}
