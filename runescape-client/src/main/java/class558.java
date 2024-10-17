import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vt")
public class class558 {
	@ObfuscatedName("ap")
	int[] field5468;
	@ObfuscatedName("aw")
	short[] field5467;

	@ObfuscatedSignature(
		descriptor = "(Lhy;)V"
	)
	public class558(NPCComposition var1) {
		this.field5468 = new int[8];
		this.field5467 = new short[8];
		int var2 = 0;
		if (var1.method4001()) {
			var2 = var1.method4002().length;
			System.arraycopy(var1.method4002(), 0, this.field5468, 0, var2);
			System.arraycopy(var1.method4004(), 0, this.field5467, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field5468[var3] = -1;
			this.field5467[var3] = -1;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "69"
	)
	public int[] method10380() {
		return this.field5468;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "-26"
	)
	public short[] method10374() {
		return this.field5467;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IISB)V",
		garbageValue = "92"
	)
	public void method10376(int var1, int var2, short var3) {
		this.field5468[var1] = var2;
		this.field5467[var1] = var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-499131714"
	)
	public void method10377(int[] var1, short[] var2) {
		this.field5468 = var1;
		this.field5467 = var2;
	}
}
