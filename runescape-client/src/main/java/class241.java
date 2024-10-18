import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
public class class241 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lfw;"
	)
	class134[] field2608;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 861196603
	)
	int field2610;

	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V"
	)
	class241(Buffer var1, int var2) {
		this.field2608 = new class134[var2];
		this.field2610 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2608.length; ++var3) {
			class134 var4 = new class134(this.field2610, var1, false);
			this.field2608[var3] = var4;
		}

		this.method4902();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "374756753"
	)
	void method4902() {
		class134[] var1 = this.field2608;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class134 var3 = var1[var2];
			if (var3.field1569 >= 0) {
				var3.field1574 = this.field2608[var3.field1569];
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1298895339"
	)
	public int method4903() {
		return this.field2608.length;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lfw;",
		garbageValue = "-335772549"
	)
	class134 method4904(int var1) {
		return var1 >= this.method4903() ? null : this.field2608[var1];
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfw;",
		garbageValue = "1631585712"
	)
	class134[] method4905() {
		return this.field2608;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lfr;IB)V",
		garbageValue = "91"
	)
	void method4909(class145 var1, int var2) {
		this.method4907(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfr;I[ZZI)V",
		garbageValue = "-1490826237"
	)
	void method4907(class145 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3511();
		int var6 = 0;
		class134[] var7 = this.method4905();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class134 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method3513(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I[BLsl;I)V",
		garbageValue = "-1880017708"
	)
	static void method4920(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 0;
		var3.key = (long)var0;
		var3.data = var1;
		var3.archiveDisk = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		WorldMapScaleHandler.method6437();
	}
}
