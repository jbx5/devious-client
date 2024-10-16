import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
public class class429 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("ap")
	float field4789;
	@ObfuscatedName("aw")
	float field4787;
	@ObfuscatedName("ak")
	float field4796;
	@ObfuscatedName("aj")
	float field4788;
	@ObfuscatedName("ai")
	float field4790;
	@ObfuscatedName("ay")
	float field4791;
	@ObfuscatedName("as")
	float field4792;
	@ObfuscatedName("ae")
	float field4793;
	@ObfuscatedName("am")
	float field4794;
	@ObfuscatedName("at")
	float field4795;
	@ObfuscatedName("au")
	float field4786;
	@ObfuscatedName("an")
	float field4797;

	static {
		new class429();
	}

	public class429() {
		this.method8349();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1301023560"
	)
	void method8349() {
		this.field4797 = 0.0F;
		this.field4786 = 0.0F;
		this.field4795 = 0.0F;
		this.field4793 = 0.0F;
		this.field4792 = 0.0F;
		this.field4791 = 0.0F;
		this.field4788 = 0.0F;
		this.field4796 = 0.0F;
		this.field4787 = 0.0F;
		this.field4794 = 1.0F;
		this.field4790 = 1.0F;
		this.field4789 = 1.0F;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "870981566"
	)
	public void method8339(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4787;
		float var5 = this.field4790;
		float var6 = this.field4793;
		float var7 = this.field4786;
		this.field4787 = var2 * var4 - this.field4796 * var3;
		this.field4796 = var4 * var3 + var2 * this.field4796;
		this.field4790 = var2 * var5 - var3 * this.field4791;
		this.field4791 = var2 * this.field4791 + var5 * var3;
		this.field4793 = var2 * var6 - var3 * this.field4794;
		this.field4794 = var2 * this.field4794 + var3 * var6;
		this.field4786 = var2 * var7 - this.field4797 * var3;
		this.field4797 = var7 * var3 + var2 * this.field4797;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "309319879"
	)
	public void method8340(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4789;
		float var5 = this.field4788;
		float var6 = this.field4792;
		float var7 = this.field4795;
		this.field4789 = var3 * this.field4796 + var2 * var4;
		this.field4796 = var2 * this.field4796 - var4 * var3;
		this.field4788 = this.field4791 * var3 + var5 * var2;
		this.field4791 = this.field4791 * var2 - var5 * var3;
		this.field4792 = this.field4794 * var3 + var2 * var6;
		this.field4794 = var2 * this.field4794 - var6 * var3;
		this.field4795 = var3 * this.field4797 + var2 * var7;
		this.field4797 = var2 * this.field4797 - var7 * var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1177991842"
	)
	void method8341(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4789;
		float var5 = this.field4788;
		float var6 = this.field4792;
		float var7 = this.field4795;
		this.field4789 = var4 * var2 - var3 * this.field4787;
		this.field4787 = var2 * this.field4787 + var4 * var3;
		this.field4788 = var5 * var2 - var3 * this.field4790;
		this.field4790 = var5 * var3 + this.field4790 * var2;
		this.field4792 = var6 * var2 - this.field4793 * var3;
		this.field4793 = var2 * this.field4793 + var6 * var3;
		this.field4795 = var2 * var7 - this.field4786 * var3;
		this.field4786 = var2 * this.field4786 + var7 * var3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1209216541"
	)
	public void method8338(float var1, float var2, float var3) {
		this.field4795 += var1;
		this.field4786 += var2;
		this.field4797 += var3;
	}

	public String toString() {
		return this.field4789 + "," + this.field4788 + "," + this.field4792 + "," + this.field4795 + "\n" + this.field4787 + "," + this.field4790 + "," + this.field4793 + "," + this.field4786 + "\n" + this.field4796 + "," + this.field4791 + "," + this.field4794 + "," + this.field4797;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)[Ltj;",
		garbageValue = "1"
	)
	static class495[] method8337() {
		return new class495[]{class495.field5121, class495.field5119, class495.field5118, class495.field5117};
	}
}
