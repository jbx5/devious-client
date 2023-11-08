import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("at")
	long[] field2321;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1255894499
	)
	int field2316;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 410408215
	)
	int field2317;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -4946846076129041373L
	)
	long field2319;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -991766849
	)
	int field2320;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 702042737
	)
	int field2318;

	MilliClock() {
		this.field2321 = new long[10];
		this.field2316 = 256;
		this.field2317 = 1;
		this.field2320 = 0;
		this.field2319 = SpotAnimationDefinition.method3775();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2321[var1] = this.field2319;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1366277024"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2321[var1] = 0L;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2001388980"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field2316;
		int var4 = this.field2317;
		this.field2316 = 300;
		this.field2317 = 1;
		this.field2319 = SpotAnimationDefinition.method3775();
		if (this.field2321[this.field2318] == 0L) {
			this.field2316 = var3;
			this.field2317 = var4;
		} else if (this.field2319 > this.field2321[this.field2318]) {
			this.field2316 = (int)((long)(var1 * 2560) / (this.field2319 - this.field2321[this.field2318]));
		}

		if (this.field2316 < 25) {
			this.field2316 = 25;
		}

		if (this.field2316 > 256) {
			this.field2316 = 256;
			this.field2317 = (int)((long)var1 - (this.field2319 - this.field2321[this.field2318]) / 10L);
		}

		if (this.field2317 > var1) {
			this.field2317 = var1;
		}

		this.field2321[this.field2318] = this.field2319;
		this.field2318 = (this.field2318 + 1) % 10;
		int var5;
		if (this.field2317 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field2321[var5]) {
					this.field2321[var5] += (long)this.field2317;
				}
			}
		}

		if (this.field2317 < var2) {
			this.field2317 = var2;
		}

		class219.method4260((long)this.field2317);

		for (var5 = 0; this.field2320 < 256; this.field2320 += this.field2316) {
			++var5;
		}

		this.field2320 &= 255;
		return var5;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Loi;",
		garbageValue = "-1866806569"
	)
	public static class364[] method4243() {
		return new class364[]{class364.field4239, class364.field4238, class364.field4236, class364.field4237};
	}

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(Lnn;IIIB)V",
		garbageValue = "42"
	)
	static final void method4249(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.method6668(HealthBarDefinition.widgetDefinition, false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				ItemLayer.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

		}
	}
}
