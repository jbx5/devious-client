import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sc")
public class class477 extends class480 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -629874895
	)
	int field4859;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -562859597
	)
	int field4858;
	@ObfuscatedName("ar")
	double field4863;
	@ObfuscatedName("am")
	double field4860;
	@ObfuscatedName("as")
	double field4861;
	@ObfuscatedName("aj")
	double field4862;
	@ObfuscatedName("ag")
	double field4857;

	public class477(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field4859 = 0;
		this.field4858 = 0;
		this.field4863 = 0.0D;
		this.field4860 = 0.0D;
		this.field4861 = 0.0D;
		this.field4862 = 0.0D;
		this.field4857 = 0.0D;
		this.field4859 = var3;
		this.field4858 = var6;
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
			this.field4863 = (double)var4;
			this.field4860 = (double)var5;
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D;
			double var13 = (double)((float)(var8 + var2)) / 2.0D;
			double var15 = (double)((float)(var4 + var7)) / 2.0D;
			double var17 = (double)((float)(var5 + var8)) / 2.0D;
			double var19 = (double)(var7 - var1) * -1.0D / (double)(var8 - var2);
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8);
			this.field4863 = (var11 * var19 - var15 * var21 + var17 - var13) / (var19 - var21);
			this.field4860 = var13 + (this.field4863 - var11) * var19;
			this.field4861 = Math.sqrt(Math.pow(this.field4863 - (double)var1, 2.0D) + Math.pow(this.field4860 - (double)var2, 2.0D));
			this.field4862 = Math.atan2((double)var2 - this.field4860, (double)var1 - this.field4863);
			double var23 = Math.atan2((double)var8 - this.field4860, (double)var7 - this.field4863);
			this.field4857 = Math.atan2((double)var5 - this.field4860, (double)var4 - this.field4863);
			boolean var25 = this.field4862 <= var23 && var23 <= this.field4857 || this.field4857 <= var23 && var23 <= this.field4862;
			if (!var25) {
				this.field4857 += 3.141592653589793D * (double)(this.field4862 - this.field4857 > 0.0D ? 2 : -2);
			}

		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "2587"
	)
	public int vmethod8499() {
		double var1 = this.method8504();
		double var3 = this.field4862 + (this.field4857 - this.field4862) * var1;
		return (int)Math.round(this.field4863 + this.field4861 * Math.cos(var3));
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1657628972"
	)
	public int vmethod8496() {
		double var1 = this.method8504();
		double var3 = (this.field4857 - this.field4862) * var1 + this.field4862;
		return (int)Math.round(this.field4860 + this.field4861 * Math.sin(var3));
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "10605"
	)
	public int vmethod8497() {
		double var1 = this.method8504();
		return (int)Math.round((double)this.field4859 + var1 * (double)(this.field4858 - this.field4859));
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(II)Ltx;",
		garbageValue = "522363485"
	)
	@Export("getDbTable")
	static DbTable getDbTable(int var0) {
		DbTable var1 = (DbTable)Client.DBTableIndex_cache.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(class176.field1852, ViewportMouse.method4930(var0), Message.method1241(var0));
			Client.DBTableIndex_cache.put(var1, (long)var0);
		}

		return var1;
	}
}
