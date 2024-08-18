import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
public final class class424 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lqf;"
	)
	static class424[] field4676;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2009311141
	)
	static int field4675;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	static Archive field4678;
	@ObfuscatedName("au")
	float field4677;
	@ObfuscatedName("ax")
	float field4681;
	@ObfuscatedName("ao")
	float field4679;
	@ObfuscatedName("am")
	float field4680;

	static {
		field4676 = new class424[0];
		ClanSettings.method3500(100);
		new class424();
	}

	class424() {
		this.method7833();
	}

	public class424(float var1, float var2, float var3) {
		this.method7832(var1, var2, var3);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1688103255"
	)
	public void method7829() {
		synchronized(field4676) {
			if (AbstractUserComparator.field4921 < field4675 - 1) {
				field4676[++AbstractUserComparator.field4921 - 1] = this;
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-1294807756"
	)
	void method7841(float var1, float var2, float var3, float var4) {
		this.field4677 = var1;
		this.field4681 = var2;
		this.field4679 = var3;
		this.field4680 = var4;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "327390096"
	)
	public void method7837(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F));
		float var6 = (float)Math.cos((double)(0.5F * var4));
		this.field4677 = var1 * var5;
		this.field4681 = var2 * var5;
		this.field4679 = var5 * var3;
		this.field4680 = var6;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-665629066"
	)
	void method7832(float var1, float var2, float var3) {
		this.method7837(0.0F, 1.0F, 0.0F, var1);
		class424 var4 = GrandExchangeOfferAgeComparator.method7406();
		var4.method7837(1.0F, 0.0F, 0.0F, var2);
		this.method7834(var4);
		var4.method7837(0.0F, 0.0F, 1.0F, var3);
		this.method7834(var4);
		var4.method7829();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "120"
	)
	final void method7833() {
		this.field4679 = 0.0F;
		this.field4681 = 0.0F;
		this.field4677 = 0.0F;
		this.field4680 = 1.0F;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lqf;B)V",
		garbageValue = "18"
	)
	public final void method7834(class424 var1) {
		this.method7841(var1.field4681 * this.field4679 + this.field4680 * var1.field4677 + this.field4677 * var1.field4680 - var1.field4679 * this.field4681, var1.field4680 * this.field4681 - this.field4679 * var1.field4677 + this.field4680 * var1.field4681 + this.field4677 * var1.field4679, var1.field4679 * this.field4680 + (var1.field4677 * this.field4681 + var1.field4680 * this.field4679 - this.field4677 * var1.field4681), this.field4680 * var1.field4680 - this.field4677 * var1.field4677 - this.field4681 * var1.field4681 - var1.field4679 * this.field4679);
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = var2 * 31.0F + this.field4677;
		var2 = this.field4681 + 31.0F * var2;
		var2 = this.field4679 + 31.0F * var2;
		var2 = var2 * 31.0F + this.field4680;
		return (int)var2;
	}

	public String toString() {
		return this.field4677 + "," + this.field4681 + "," + this.field4679 + "," + this.field4680;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class424)) {
			return false;
		} else {
			class424 var2 = (class424)var1;
			return this.field4677 == var2.field4677 && var2.field4681 == this.field4681 && var2.field4679 == this.field4679 && var2.field4680 == this.field4680;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2144097964"
	)
	static final void method7859() {
		ReflectionCheck.method675("Your friend list is full. Max of 200 for free users, and 400 for members");
	}
}
