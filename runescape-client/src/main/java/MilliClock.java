import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("aq")
	long[] field2370;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 77467019
	)
	int field2371;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 691435497
	)
	int field2372;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = -4725112427391503235L
	)
	long field2374;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1561619897
	)
	int field2373;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2128144825
	)
	int field2375;

	MilliClock() {
		this.field2370 = new long[10];
		this.field2371 = 256;
		this.field2372 = 1;
		this.field2373 = 0;
		this.field2374 = WorldMapData_1.method4861();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2370[var1] = this.field2374;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-246153511"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2370[var1] = 0L;
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1597628099"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field2371;
		int var4 = this.field2372;
		this.field2371 = 300;
		this.field2372 = 1;
		this.field2374 = WorldMapData_1.method4861();
		if (this.field2370[this.field2375] == 0L) {
			this.field2371 = var3;
			this.field2372 = var4;
		} else if (this.field2374 > this.field2370[this.field2375]) {
			this.field2371 = (int)((long)(var1 * 2560) / (this.field2374 - this.field2370[this.field2375]));
		}

		if (this.field2371 < 25) {
			this.field2371 = 25;
		}

		if (this.field2371 > 256) {
			this.field2371 = 256;
			this.field2372 = (int)((long)var1 - (this.field2374 - this.field2370[this.field2375]) / 10L);
		}

		if (this.field2372 > var1) {
			this.field2372 = var1;
		}

		this.field2370[this.field2375] = this.field2374;
		this.field2375 = (this.field2375 + 1) % 10;
		int var5;
		if (this.field2372 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (this.field2370[var5] != 0L) {
					this.field2370[var5] += (long)this.field2372;
				}
			}
		}

		if (this.field2372 < var2) {
			this.field2372 = var2;
		}

		class188.method3688((long)this.field2372);

		for (var5 = 0; this.field2373 < 256; this.field2373 += this.field2371) {
			++var5;
		}

		this.field2373 &= 255;
		return var5;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgt;",
		garbageValue = "1"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
