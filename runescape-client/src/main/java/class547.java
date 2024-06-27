import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vi")
public class class547 {
	@ObfuscatedName("aq")
	int[] field5368;
	@ObfuscatedName("ad")
	short[] field5367;

	@ObfuscatedSignature(
		descriptor = "(Lhb;)V"
	)
	public class547(NPCComposition var1) {
		this.field5368 = new int[8];
		this.field5367 = new short[8];
		int var2 = 0;
		if (var1.method3712()) {
			var2 = var1.method3713().length;
			System.arraycopy(var1.method3713(), 0, this.field5368, 0, var2);
			System.arraycopy(var1.method3715(), 0, this.field5367, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field5368[var3] = -1;
			this.field5367[var3] = -1;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-99"
	)
	public int[] method9802() {
		return this.field5368;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "1279520117"
	)
	public short[] method9811() {
		return this.field5367;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IISB)V",
		garbageValue = "-93"
	)
	public void method9804(int var1, int var2, short var3) {
		this.field5368[var1] = var2;
		this.field5367[var1] = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([I[SB)V",
		garbageValue = "1"
	)
	public void method9805(int[] var1, short[] var2) {
		this.field5368 = var1;
		this.field5367 = var2;
	}
}
