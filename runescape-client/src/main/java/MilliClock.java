import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	public static Buffer field1810;
	@ObfuscatedName("c")
	long[] field1804;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -392846051
	)
	int field1805;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 706631097
	)
	int field1803;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -7069218525651298561L
	)
	long field1809;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1321269335
	)
	int field1801;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1583430667
	)
	int field1806;

	MilliClock() {
		this.field1804 = new long[10]; // L: 7
		this.field1805 = 256; // L: 15
		this.field1803 = 1; // L: 16
		this.field1801 = 0; // L: 17
		this.field1809 = Language.method6232(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) { // L: 19
			this.field1804[var1] = this.field1809; // L: 20
		}

	} // L: 22

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2049257466"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field1804[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-4"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1805; // L: 31
		int var4 = this.field1803; // L: 32
		this.field1805 = 300; // L: 33
		this.field1803 = 1; // L: 34
		this.field1809 = Language.method6232(); // L: 35
		if (0L == this.field1804[this.field1806]) { // L: 36
			this.field1805 = var3; // L: 37
			this.field1803 = var4; // L: 38
		} else if (this.field1809 > this.field1804[this.field1806]) { // L: 40
			this.field1805 = (int)((long)(var1 * 2560) / (this.field1809 - this.field1804[this.field1806]));
		}

		if (this.field1805 < 25) { // L: 41
			this.field1805 = 25;
		}

		if (this.field1805 > 256) { // L: 42
			this.field1805 = 256;
			this.field1803 = (int)((long)var1 - (this.field1809 - this.field1804[this.field1806]) / 10L); // L: 44
		}

		if (this.field1803 > var1) { // L: 46
			this.field1803 = var1;
		}

		this.field1804[this.field1806] = this.field1809; // L: 47
		this.field1806 = (this.field1806 + 1) % 10; // L: 48
		int var5;
		if (this.field1803 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (0L != this.field1804[var5]) { // L: 51
					this.field1804[var5] += (long)this.field1803;
				}
			}
		}

		if (this.field1803 < var2) { // L: 54
			this.field1803 = var2;
		}

		class28.method412((long)this.field1803); // L: 55

		for (var5 = 0; this.field1801 < 256; this.field1801 += this.field1805) { // L: 56 59
			++var5; // L: 58
		}

		this.field1801 &= 255; // L: 61
		return var5; // L: 62
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1341812392"
	)
	public static boolean method3478(int var0) {
		return var0 >= WorldMapDecorationType.field3572.id && var0 <= WorldMapDecorationType.field3563.id || var0 == WorldMapDecorationType.field3583.id; // L: 43
	}

	@ObfuscatedName("f")
	public static int method3477(long var0) {
		return (int)(var0 >>> 7 & 127L); // L: 57
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIB)V",
		garbageValue = "-32"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null; // L: 7654

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7655 7656 7661
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) { // L: 7657
				var9 = var10; // L: 7658
				break;
			}
		}

		if (var9 == null) { // L: 7663
			var9 = new PendingSpawn(); // L: 7664
			var9.plane = var0; // L: 7665
			var9.type = var3; // L: 7666
			var9.x = var1; // L: 7667
			var9.y = var2; // L: 7668
			class20.method302(var9); // L: 7669
			Client.pendingSpawns.addFirst(var9); // L: 7670
		}

		var9.id = var4; // L: 7672
		var9.field1123 = var5; // L: 7673
		var9.orientation = var6; // L: 7674
		var9.delay = var7; // L: 7675
		var9.hitpoints = var8; // L: 7676
	} // L: 7677
}
