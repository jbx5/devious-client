import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -3926726354020327003L
	)
	long field4268;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = -1127738657898247179L
	)
	long field4272;
	@ObfuscatedName("f")
	public boolean field4265;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -6950914943070846117L
	)
	long field4266;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = 5923765781629435585L
	)
	long field4267;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = 5285216938933534565L
	)
	long field4263;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1510518223
	)
	int field4269;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -578071481
	)
	int field4270;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1628135725
	)
	int field4271;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1569242559
	)
	int field4264;

	public Timer() {
		this.field4268 = -1L; // L: 7
		this.field4272 = -1L; // L: 8
		this.field4265 = false; // L: 9
		this.field4266 = 0L; // L: 10
		this.field4267 = 0L; // L: 11
		this.field4263 = 0L; // L: 12
		this.field4269 = 0; // L: 13
		this.field4270 = 0; // L: 14
		this.field4271 = 0; // L: 15
		this.field4264 = 0; // L: 16
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "894218512"
	)
	public void method6702() {
		this.field4268 = Language.method6232(); // L: 19
	} // L: 20

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-645941723"
	)
	public void method6707() {
		if (-1L != this.field4268) { // L: 23
			this.field4267 = Language.method6232() - this.field4268; // L: 24
			this.field4268 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1357516830"
	)
	public void method6704(int var1) {
		this.field4272 = Language.method6232(); // L: 30
		this.field4269 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-40"
	)
	public void method6701() {
		if (-1L != this.field4272) { // L: 35
			this.field4266 = Language.method6232() - this.field4272; // L: 36
			this.field4272 = -1L; // L: 37
		}

		++this.field4271; // L: 39
		this.field4265 = true; // L: 40
	} // L: 41

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-10"
	)
	public void method6724() {
		this.field4265 = false; // L: 44
		this.field4270 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1307557155"
	)
	public void method6725() {
		this.method6701(); // L: 49
	} // L: 50

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "456320258"
	)
	@Export("write")
	public void write(Buffer var1) {
		class33.method643(var1, this.field4267); // L: 53
		class33.method643(var1, this.field4266); // L: 54
		class33.method643(var1, this.field4263); // L: 55
		var1.writeShort(this.field4269); // L: 56
		var1.writeShort(this.field4270); // L: 57
		var1.writeShort(this.field4271); // L: 58
		var1.writeShort(this.field4264); // L: 59
	} // L: 60
}
