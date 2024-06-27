import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vn")
public class class564 {
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1686890437
	)
	int field5493;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1553082509
	)
	int field5488;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1847470821
	)
	int field5487;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1106594863
	)
	int field5490;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -789417987
	)
	int field5491;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1402538695
	)
	int field5486;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1180354653
	)
	int field5494;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1961602031
	)
	int field5492;
	@ObfuscatedName("ai")
	boolean field5489;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1955973477
	)
	int field5496;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -728068103
	)
	int field5495;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1558879885
	)
	int field5497;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1341699441
	)
	int field5499;

	public class564() {
		this.field5494 = 0;
		this.field5492 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "-1973488942"
	)
	public void method10163(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5493 = var1;
		this.field5488 = var2;
		this.field5487 = var3;
		this.field5490 = var4;
		this.field5491 = var5;
		this.field5486 = var6;
		this.field5494 = var7;
		this.field5492 = var8;
		this.field5489 = var9;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1394055837"
	)
	public void method10174(int var1, int var2, int var3, int var4) {
		this.field5496 = var1;
		this.field5495 = var2;
		this.field5497 = var3;
		this.field5499 = var4;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lql;Lqh;I)V",
		garbageValue = "-2033915643"
	)
	public void method10165(class432 var1, Font var2) {
		if (var2 != null) {
			int var3 = var2.ascent;
			int var4 = Math.min(this.field5490, (int)((float)var3 * 0.9F));
			int var5 = var1.method8059(this.field5487);
			int var6 = var1.method7928(this.field5490);
			int var7 = var5 + (this.field5493 - this.field5491);
			int var8 = var3 + var6 + (this.field5488 - this.field5486);
			Rasterizer2D.Rasterizer2D_setClip(this.field5493, this.field5488, this.field5487 + this.field5493, this.field5488 + this.field5490);
			int var9 = this.field5492;
			int var10 = this.field5494;
			if (var9 > var10) {
				int var11 = var9;
				var9 = var10;
				var10 = var11;
			}

			class436 var21 = var1.method7932(0, var9);
			class436 var12 = var1.method7932(var9, var10);
			class436 var13 = var1.method7932(var10, var1.method7984());
			class436 var14 = var1.method7932(0, this.field5494);
			int var16;
			int var18;
			if (!var12.method8197()) {
				int var15 = var2.maxDescent + var2.maxAscent;

				for (var16 = 0; var16 < var12.method8198(); ++var16) {
					class434 var23 = var12.method8206(var16);
					var18 = var7 + var23.field4766;
					int var19 = var2.charWidth(var23.field4763);
					int var20 = var8 + var23.field4764 - var3;
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5499);
				}
			}

			if (!var21.method8197()) {
				var2.method8093(var21, var7, var8, this.field5496, this.field5495, -1);
			}

			if (!var12.method8197()) {
				var2.method8093(var12, var7, var8, this.field5497, this.field5495, -1);
			}

			if (!var13.method8197()) {
				var2.method8093(var13, var7, var8, this.field5496, this.field5495, -1);
			}

			if (this.field5489) {
				class517 var22 = var14.method8201();
				var16 = var7 + (Integer)var22.field5225;
				int var17 = var8 + (Integer)var22.field5222;
				var18 = var17 - var4;
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5496);
				if (this.field5495 != -1) {
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5495);
				}
			}

		}
	}
}
