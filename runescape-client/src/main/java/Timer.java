import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("v")
	@ObfuscatedGetter(longValue = 
	4555750395140073021L)

	long field4185;
	@ObfuscatedName("o")
	@ObfuscatedGetter(longValue = 
	-2846643341585363461L)

	long field4183;
	@ObfuscatedName("h")
	public boolean field4182;
	@ObfuscatedName("g")
	@ObfuscatedGetter(longValue = 
	5666983759497851335L)

	long field4189;
	@ObfuscatedName("l")
	@ObfuscatedGetter(longValue = 
	796750526860624939L)

	long field4186;
	@ObfuscatedName("n")
	@ObfuscatedGetter(longValue = 
	-3256458823420726931L)

	long field4187;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	283694851)

	int field4188;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-2009036561)

	int field4184;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	43489845)

	int field4190;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	425168073)

	int field4191;

	public Timer() {
		this.field4185 = -1L;
		this.field4183 = -1L;
		this.field4182 = false;
		this.field4189 = 0L;
		this.field4186 = 0L;
		this.field4187 = 0L;
		this.field4188 = 0;
		this.field4184 = 0;
		this.field4190 = 0;
		this.field4191 = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"2052102546")

	public void method6594() {
		this.field4185 = WorldMapSprite.getServerTime();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"8")

	public void method6595() {
		if (this.field4185 != (-1L)) {
			this.field4186 = WorldMapSprite.getServerTime() - this.field4185;
			this.field4185 = -1L;
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(IS)V", garbageValue = 
	"-20934")

	public void method6596(int var1) {
		this.field4183 = WorldMapSprite.getServerTime();
		this.field4188 = var1;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1987458157")

	public void method6597() {
		if (this.field4183 != (-1L)) {
			this.field4189 = WorldMapSprite.getServerTime() - this.field4183;
			this.field4183 = -1L;
		}

		++this.field4190;
		this.field4182 = true;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"85953838")

	public void method6593() {
		this.field4182 = false;
		this.field4184 = 0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-687283504")

	public void method6598() {
		this.method6597();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;I)V", garbageValue = 
	"-893944716")

	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4186;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.writeShort(((int) (var2)));
		long var4 = this.field4189;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.writeShort(((int) (var4)));
		long var6 = this.field4187;
		var6 /= 10L;
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}

		var1.writeShort(((int) (var6)));
		var1.writeShort(this.field4188);
		var1.writeShort(this.field4184);
		var1.writeShort(this.field4190);
		var1.writeShort(this.field4191);
	}
}