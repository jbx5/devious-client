import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ua")
public class class531 {
	@ObfuscatedName("am")
	int[] field5181;
	@ObfuscatedName("ap")
	short[] field5184;

	@ObfuscatedSignature(
		descriptor = "(Lho;)V"
	)
	public class531(NPCComposition var1) {
		this.field5181 = new int[8];
		this.field5184 = new short[8];
		int var2 = 0;
		if (var1.method3726()) {
			var2 = var1.method3775().length;
			System.arraycopy(var1.method3775(), 0, this.field5181, 0, var2);
			System.arraycopy(var1.method3722(), 0, this.field5184, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field5181[var3] = -1;
			this.field5184[var3] = -1;
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "88"
	)
	public int[] method9626() {
		return this.field5181;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "91"
	)
	public short[] method9641() {
		return this.field5184;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-228956453"
	)
	public void method9629(int var1, int var2, short var3) {
		this.field5181[var1] = var2;
		this.field5184[var1] = var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([I[SB)V",
		garbageValue = "-42"
	)
	public void method9630(int[] var1, short[] var2) {
		this.field5181 = var1;
		this.field5184 = var2;
	}
}
