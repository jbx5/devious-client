import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
public class class397 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("ak")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("aj")
	int[] field4580;
	@ObfuscatedName("az")
	int[] field4581;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 182759609
	)
	int field4582;

	public class397() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field4580 = new int[2048];
		this.field4581 = new int[2048];
		this.field4582 = 0;
		class152.field1722 = new int[2000];
		int var1 = 0;
		int var2 = 240;

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) {
			var4 = class360.method7083((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)((float)var1 * 0.425F / 16.0F + 0.075F));
			class152.field1722[var1] = var4;
			++var1;
		}

		var2 = 48;

		for (int var6 = var2 / 6; var1 < class152.field1722.length; var2 -= var6) {
			var4 = var1 * 2;

			for (int var5 = class360.method7083((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < class152.field1722.length; ++var1) {
				class152.field1722[var1] = var5;
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1831068754"
	)
	void method7445(int var1) {
		int var2 = var1 * 2 + 1;
		double[] var3 = ArchiveLoader.method2295(0.0D, (double)((float)var1 / 3.0F), var1);
		double var4 = var3[var1] * var3[var1];
		int[] var6 = new int[var2 * var2];
		boolean var7 = false;

		for (int var8 = 0; var8 < var2; ++var8) {
			for (int var9 = 0; var9 < var2; ++var9) {
				int var10 = var6[var9 + var2 * var8] = (int)(256.0D * (var3[var9] * var3[var8] / var4));
				if (!var7 && var10 > 0) {
					var7 = true;
				}
			}
		}

		SpritePixels var11 = new SpritePixels(var6, var2, var2);
		this.spriteMap.put(var1, var11);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lvc;",
		garbageValue = "-1069951755"
	)
	SpritePixels method7442(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method7445(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-509097697"
	)
	public final void method7443(int var1, int var2) {
		if (this.field4582 < this.field4580.length) {
			this.field4580[this.field4582] = var1;
			this.field4581[this.field4582] = var2;
			++this.field4582;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-23"
	)
	public final void method7456() {
		this.field4582 = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IILvc;FI)V",
		garbageValue = "-896621393"
	)
	public final void method7453(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(var4 * 18.0F);
		SpritePixels var6 = this.method7442(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4582; ++var10) {
			var11 = this.field4580[var10];
			var12 = this.field4581[var10];
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
			int var14 = (int)((float)var3.subHeight - var4 * (float)(var12 - var2)) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method7765(var8, var9);
			this.method7446(var6, var3, var9);
		}

		System.nanoTime();
		System.nanoTime();

		for (var10 = 0; var10 < var3.pixels.length; ++var10) {
			if (var3.pixels[var10] == 0) {
				var3.pixels[var10] = -16777216;
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256;
				if (var11 <= 0) {
					var3.pixels[var10] = -16777216;
				} else {
					if (var11 > class152.field1722.length) {
						var11 = class152.field1722.length;
					}

					var12 = class152.field1722[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lvc;Lvc;Lqi;I)V",
		garbageValue = "-1144373910"
	)
	void method7446(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) {
			int var4 = 0;
			int var5 = 0;
			if (var3.lowX == 0) {
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) {
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth;
			int var7 = var2.subWidth * var3.lowY + var3.lowX;

			for (int var8 = 0; var8 < var3.highY; ++var8) {
				for (int var9 = 0; var9 < var3.highX; ++var9) {
					int[] var10000 = var2.pixels;
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX;
				var7 += var2.subWidth - var3.highX;
			}

		}
	}
}
