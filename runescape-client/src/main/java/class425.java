import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qx")
public class class425 {
	@ObfuscatedName("aq")
	float field4711;
	@ObfuscatedName("ad")
	float field4710;
	@ObfuscatedName("ag")
	float field4712;
	@ObfuscatedName("ak")
	float field4713;
	@ObfuscatedName("ap")
	float field4714;
	@ObfuscatedName("an")
	float field4715;
	@ObfuscatedName("aj")
	float field4719;
	@ObfuscatedName("av")
	float field4717;
	@ObfuscatedName("ab")
	float field4716;
	@ObfuscatedName("ai")
	float field4720;
	@ObfuscatedName("ae")
	float field4718;
	@ObfuscatedName("au")
	float field4721;

	static {
		new class425();
	}

	public class425() {
		this.method7862();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "13"
	)
	void method7862() {
		this.field4721 = 0.0F;
		this.field4718 = 0.0F;
		this.field4720 = 0.0F;
		this.field4717 = 0.0F;
		this.field4719 = 0.0F;
		this.field4715 = 0.0F;
		this.field4713 = 0.0F;
		this.field4712 = 0.0F;
		this.field4710 = 0.0F;
		this.field4716 = 1.0F;
		this.field4714 = 1.0F;
		this.field4711 = 1.0F;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1557731"
	)
	public void method7861(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4710;
		float var5 = this.field4714;
		float var6 = this.field4717;
		float var7 = this.field4718;
		this.field4710 = var2 * var4 - var3 * this.field4712;
		this.field4712 = var3 * var4 + this.field4712 * var2;
		this.field4714 = var5 * var2 - var3 * this.field4715;
		this.field4715 = var2 * this.field4715 + var5 * var3;
		this.field4717 = var6 * var2 - var3 * this.field4716;
		this.field4716 = var3 * var6 + this.field4716 * var2;
		this.field4718 = var7 * var2 - var3 * this.field4721;
		this.field4721 = var2 * this.field4721 + var7 * var3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1500176816"
	)
	public void method7871(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4711;
		float var5 = this.field4713;
		float var6 = this.field4719;
		float var7 = this.field4720;
		this.field4711 = var3 * this.field4712 + var4 * var2;
		this.field4712 = var2 * this.field4712 - var4 * var3;
		this.field4713 = var2 * var5 + var3 * this.field4715;
		this.field4715 = this.field4715 * var2 - var5 * var3;
		this.field4719 = this.field4716 * var3 + var6 * var2;
		this.field4716 = var2 * this.field4716 - var6 * var3;
		this.field4720 = var7 * var2 + var3 * this.field4721;
		this.field4721 = this.field4721 * var2 - var7 * var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-265108750"
	)
	void method7863(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4711;
		float var5 = this.field4713;
		float var6 = this.field4719;
		float var7 = this.field4720;
		this.field4711 = var2 * var4 - this.field4710 * var3;
		this.field4710 = var3 * var4 + this.field4710 * var2;
		this.field4713 = var2 * var5 - var3 * this.field4714;
		this.field4714 = this.field4714 * var2 + var5 * var3;
		this.field4719 = var6 * var2 - this.field4717 * var3;
		this.field4717 = var6 * var3 + this.field4717 * var2;
		this.field4720 = var2 * var7 - this.field4718 * var3;
		this.field4718 = var7 * var3 + this.field4718 * var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "1"
	)
	public void method7864(float var1, float var2, float var3) {
		this.field4720 += var1;
		this.field4718 += var2;
		this.field4721 += var3;
	}

	public String toString() {
		return this.field4711 + "," + this.field4713 + "," + this.field4719 + "," + this.field4720 + "\n" + this.field4710 + "," + this.field4714 + "," + this.field4717 + "," + this.field4718 + "\n" + this.field4712 + "," + this.field4715 + "," + this.field4716 + "," + this.field4721;
	}
}
