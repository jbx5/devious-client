import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vj")
public class class549 {
	@ObfuscatedName("ab")
	int[] field5386;
	@ObfuscatedName("ay")
	short[] field5385;

	@ObfuscatedSignature(
		descriptor = "(Ljm;)V"
	)
	public class549(NPCComposition var1) {
		this.field5386 = new int[8];
		this.field5385 = new short[8];
		int var2 = 0;
		if (var1.method4923()) {
			var2 = var1.method4950().length;
			System.arraycopy(var1.method4950(), 0, this.field5386, 0, var2);
			System.arraycopy(var1.method4930(), 0, this.field5385, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field5386[var3] = -1;
			this.field5385[var3] = -1;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "221624755"
	)
	public int[] method9859() {
		return this.field5386;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-913251617"
	)
	public short[] method9860() {
		return this.field5385;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-311636614"
	)
	public void method9863(int var1, int var2, short var3) {
		this.field5386[var1] = var2;
		this.field5385[var1] = var3;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([I[SB)V",
		garbageValue = "-27"
	)
	public void method9862(int[] var1, short[] var2) {
		this.field5386 = var1;
		this.field5385 = var2;
	}
}
