import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	static ClanSettings field4599;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -5918236800932361813L
	)
	long field4600;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = 8938502343300443105L
	)
	long field4595;
	@ObfuscatedName("ar")
	public boolean field4596;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 2558513201177713L
	)
	long field4597;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 6748223924929752003L
	)
	long field4598;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = 6630723275566090897L
	)
	long field4594;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1431337855
	)
	int field4602;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -472244753
	)
	int field4605;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1263861047
	)
	int field4604;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2108065449
	)
	int field4603;

	public Timer() {
		this.field4600 = -1L;
		this.field4595 = -1L;
		this.field4596 = false;
		this.field4597 = 0L;
		this.field4598 = 0L;
		this.field4594 = 0L;
		this.field4602 = 0;
		this.field4605 = 0;
		this.field4604 = 0;
		this.field4603 = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "919653710"
	)
	public void method7923() {
		this.field4600 = SpotAnimationDefinition.method3775();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "587956368"
	)
	public void method7924() {
		if (this.field4600 != -1L) {
			this.field4598 = SpotAnimationDefinition.method3775() - this.field4600;
			this.field4600 = -1L;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1512116667"
	)
	public void method7931(int var1) {
		this.field4595 = SpotAnimationDefinition.method3775();
		this.field4602 = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-7"
	)
	public void method7926() {
		if (-1L != this.field4595) {
			this.field4597 = SpotAnimationDefinition.method3775() - this.field4595;
			this.field4595 = -1L;
		}

		++this.field4604;
		this.field4596 = true;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2032251318"
	)
	public void method7927() {
		this.field4596 = false;
		this.field4605 = 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "36"
	)
	public void method7928() {
		this.method7926();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "221618490"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4598;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.writeShort((int)var2);
		long var4 = this.field4597;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.writeShort((int)var4);
		long var6 = this.field4594;
		var6 /= 10L;
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}

		var1.writeShort((int)var6);
		var1.writeShort(this.field4602);
		var1.writeShort(this.field4605);
		var1.writeShort(this.field4604);
		var1.writeShort(this.field4603);
	}
}
