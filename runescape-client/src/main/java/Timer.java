import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qq")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -4306889190787913315L
	)
	long field4609;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -3876844548973792619L
	)
	long field4610;
	@ObfuscatedName("ak")
	public boolean field4617;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = 4594506903784360007L
	)
	long field4612;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 937263286774196801L
	)
	long field4613;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = -8607907730093070279L
	)
	long field4611;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1368088575
	)
	int field4615;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 390686835
	)
	int field4616;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 23894051
	)
	int field4614;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1679316281
	)
	int field4618;

	public Timer() {
		this.field4609 = -1L;
		this.field4610 = -1L;
		this.field4617 = false;
		this.field4612 = 0L;
		this.field4613 = 0L;
		this.field4611 = 0L;
		this.field4615 = 0;
		this.field4616 = 0;
		this.field4614 = 0;
		this.field4618 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "281982191"
	)
	public void method7832() {
		this.field4609 = GrandExchangeOfferTotalQuantityComparator.method7049();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	public void method7836() {
		if (-1L != this.field4609) {
			this.field4613 = GrandExchangeOfferTotalQuantityComparator.method7049() - this.field4609;
			this.field4609 = -1L;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "49"
	)
	public void method7833(int var1) {
		this.field4610 = GrandExchangeOfferTotalQuantityComparator.method7049();
		this.field4615 = var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1876587712"
	)
	public void method7834() {
		if (-1L != this.field4610) {
			this.field4612 = GrandExchangeOfferTotalQuantityComparator.method7049() - this.field4610;
			this.field4610 = -1L;
		}

		++this.field4614;
		this.field4617 = true;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-699557437"
	)
	public void method7835() {
		this.field4617 = false;
		this.field4616 = 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1309820962"
	)
	public void method7837() {
		this.method7834();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "1951350671"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4613;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.writeShort((int)var2);
		long var4 = this.field4612;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.writeShort((int)var4);
		long var6 = this.field4611;
		var6 /= 10L;
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}

		var1.writeShort((int)var6);
		var1.writeShort(this.field4615);
		var1.writeShort(this.field4616);
		var1.writeShort(this.field4614);
		var1.writeShort(this.field4618);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-2042986049"
	)
	public static String method7850(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = Actor.charToByteCp1252(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}
}
