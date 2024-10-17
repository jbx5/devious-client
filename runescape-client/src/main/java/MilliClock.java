import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("fq")
	static boolean field2402;
	@ObfuscatedName("ap")
	long[] field2404;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -664575679
	)
	int field2407;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 618726771
	)
	int field2403;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -948619675202107909L
	)
	long field2405;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -202292821
	)
	int field2406;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -303769267
	)
	int field2409;

	MilliClock() {
		this.field2404 = new long[10];
		this.field2407 = 256;
		this.field2403 = 1;
		this.field2406 = 0;
		this.field2405 = class77.method2338();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2404[var1] = this.field2405;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "555753729"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2404[var1] = 0L;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-120"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field2407;
		int var4 = this.field2403;
		this.field2407 = 300;
		this.field2403 = 1;
		this.field2405 = class77.method2338();
		if (this.field2404[this.field2409] == 0L) {
			this.field2407 = var3;
			this.field2403 = var4;
		} else if (this.field2405 > this.field2404[this.field2409]) {
			this.field2407 = (int)((long)(var1 * 2560) / (this.field2405 - this.field2404[this.field2409]));
		}

		if (this.field2407 < 25) {
			this.field2407 = 25;
		}

		if (this.field2407 > 256) {
			this.field2407 = 256;
			this.field2403 = (int)((long)var1 - (this.field2405 - this.field2404[this.field2409]) / 10L);
		}

		if (this.field2403 > var1) {
			this.field2403 = var1;
		}

		this.field2404[this.field2409] = this.field2405;
		this.field2409 = (this.field2409 + 1) % 10;
		int var5;
		if (this.field2403 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field2404[var5]) {
					this.field2404[var5] += (long)this.field2403;
				}
			}
		}

		if (this.field2403 < var2) {
			this.field2403 = var2;
		}

		World.method2001((long)this.field2403);

		for (var5 = 0; this.field2406 < 256; this.field2406 += this.field2407) {
			++var5;
		}

		this.field2406 &= 255;
		return var5;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)Lce;",
		garbageValue = "-1123538803"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}
}
