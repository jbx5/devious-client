import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
public class class426 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	public static final class426 field4767;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	public static final class426 field4773;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lqt;"
	)
	public static class426[] field4768;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -306951475
	)
	static int field4769;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 937612641
	)
	public static int field4770;
	@ObfuscatedName("ay")
	public float field4771;
	@ObfuscatedName("as")
	float field4772;
	@ObfuscatedName("ae")
	public float field4766;

	static {
		new class426(0.0F, 0.0F, 0.0F);
		new class426(1.0F, 1.0F, 1.0F);
		new class426(1.0F, 0.0F, 0.0F);
		field4767 = new class426(0.0F, 1.0F, 0.0F);
		new class426(0.0F, 0.0F, 1.0F);
		new class426(1.0F, 0.0F, 0.0F);
		new class426(-1.0F, 0.0F, 0.0F);
		new class426(0.0F, 0.0F, 1.0F);
		field4773 = new class426(0.0F, 0.0F, -1.0F);
		new class426(0.0F, 1.0F, 0.0F);
		new class426(0.0F, -1.0F, 0.0F);
		field4768 = new class426[0];
		field4769 = 100;
		field4768 = new class426[100];
		field4770 = 0;
	}

	public class426(float var1, float var2, float var3) {
		this.field4771 = var1;
		this.field4772 = var2;
		this.field4766 = var3;
	}

	public class426() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lqt;)V"
	)
	public class426(class426 var1) {
		this.field4771 = var1.field4771;
		this.field4772 = var1.field4772;
		this.field4766 = var1.field4766;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "16711680"
	)
	public void method8168() {
		synchronized(field4768) {
			if (field4770 < field4769 - 1) {
				field4768[++field4770 - 1] = this;
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1603121434"
	)
	public void method8200(float var1, float var2, float var3) {
		this.field4771 = var1;
		this.field4772 = var2;
		this.field4766 = var3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "-980308502"
	)
	public void method8169(class426 var1) {
		this.method8200(var1.field4771, var1.field4772, var1.field4766);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1421845236"
	)
	final void method8202() {
		this.field4766 = 0.0F;
		this.field4772 = 0.0F;
		this.field4771 = 0.0F;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)Z",
		garbageValue = "-66"
	)
	boolean method8171(class426 var1) {
		return this.field4771 == var1.field4771 && var1.field4772 == this.field4772 && this.field4766 == var1.field4766;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1066170556"
	)
	public final void method8172() {
		float var1 = 1.0F / this.method8186();
		this.field4771 *= var1;
		this.field4772 *= var1;
		this.field4766 *= var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "-1203805015"
	)
	final void method8173(class426 var1) {
		this.field4771 += var1.field4771;
		this.field4772 += var1.field4772;
		this.field4766 += var1.field4766;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "1"
	)
	public final void method8196(class426 var1) {
		this.field4771 -= var1.field4771;
		this.field4772 -= var1.field4772;
		this.field4766 -= var1.field4766;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)F",
		garbageValue = "-1837312681"
	)
	public final float method8176(class426 var1) {
		return var1.field4766 * this.field4766 + this.field4771 * var1.field4771 + var1.field4772 * this.field4772;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "61"
	)
	public final void method8175(class426 var1) {
		this.method8200(var1.field4766 * this.field4772 - var1.field4772 * this.field4766, var1.field4771 * this.field4766 - var1.field4766 * this.field4771, this.field4771 * var1.field4772 - var1.field4771 * this.field4772);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)F",
		garbageValue = "-10964"
	)
	final float method8186() {
		return (float)Math.sqrt((double)(this.field4766 * this.field4766 + this.field4772 * this.field4772 + this.field4771 * this.field4771));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1096645015"
	)
	final void method8177(float var1) {
		this.field4771 *= var1;
		this.field4772 *= var1;
		this.field4766 *= var1;
	}

	public String toString() {
		return this.field4771 + ", " + this.field4772 + ", " + this.field4766;
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "22"
	)
	static int method8219(int var0, int var1) {
		int var2 = var1 - 334;
		if (var2 < 0) {
			var2 = 0;
		} else if (var2 > 100) {
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight;
		return var0 * var3 / 256;
	}
}
