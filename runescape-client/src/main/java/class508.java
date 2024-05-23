import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tp")
public class class508 extends class510 {
	@ObfuscatedName("jh")
	static int[][] field5102;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1187107183
	)
	int field5097;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -80254017
	)
	int field5096;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -297415589
	)
	int field5098;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1375003211
	)
	int field5099;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 972883817
	)
	int field5100;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -429974495
	)
	int field5101;

	public class508(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field5097 = 0;
		this.field5096 = 0;
		this.field5098 = 0;
		this.field5099 = 0;
		this.field5100 = 0;
		this.field5101 = 0;
		this.field5097 = var1;
		this.field5096 = var2;
		this.field5098 = var3;
		this.field5099 = var4;
		this.field5100 = var5;
		this.field5101 = var6;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-31"
	)
	public int vmethod9046() {
		double var1 = this.method9058();
		return (int)Math.round((double)(this.field5099 - this.field5097) * var1 + (double)this.field5097);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-915809137"
	)
	public int vmethod9049() {
		double var1 = this.method9058();
		return (int)Math.round((double)this.field5096 + var1 * (double)(this.field5100 - this.field5096));
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "119291980"
	)
	public int vmethod9047() {
		double var1 = this.method9058();
		return (int)Math.round((double)this.field5098 + (double)(this.field5101 - this.field5098) * var1);
	}
}
