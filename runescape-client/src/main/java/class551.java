import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vh")
public class class551 {
	@ObfuscatedName("ac")
	int[] field5419;
	@ObfuscatedName("ae")
	short[] field5418;

	@ObfuscatedSignature(
		descriptor = "(Lhn;)V"
	)
	public class551(NPCComposition var1) {
		this.field5419 = new int[8];
		this.field5418 = new short[8];
		int var2 = 0;
		if (var1.method3961()) {
			var2 = var1.method3973().length;
			System.arraycopy(var1.method3973(), 0, this.field5419, 0, var2);
			System.arraycopy(var1.method3975(), 0, this.field5418, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field5419[var3] = -1;
			this.field5418[var3] = -1;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-2019124091"
	)
	public int[] method10174() {
		return this.field5419;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "121"
	)
	public short[] method10181() {
		return this.field5418;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-342488937"
	)
	public void method10176(int var1, int var2, short var3) {
		this.field5419[var1] = var2;
		this.field5418[var1] = var3;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "2099996310"
	)
	public void method10177(int[] var1, short[] var2) {
		this.field5419 = var1;
		this.field5418 = var2;
	}
}
