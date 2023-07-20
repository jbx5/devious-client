import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tp")
public class class498 extends class456 implements class284 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	final AbstractArchive field5020;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	final DemotingHashTable field5018;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1417136981
	)
	final int field5019;

	@ObfuscatedSignature(
		descriptor = "(Lnu;ILot;Lnd;)V"
	)
	public class498(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field5018 = new DemotingHashTable(64);
		this.field5020 = var4;
		this.field5019 = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lrc;",
		garbageValue = "-1481639468"
	)
	protected class458 vmethod8884(int var1) {
		synchronized(this.field5018) {
			class457 var2 = (class457)this.field5018.get((long)var1);
			if (var2 == null) {
				var2 = this.method8885(var1);
				this.field5018.method5655(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrl;",
		garbageValue = "-53"
	)
	class457 method8885(int var1) {
		byte[] var2 = this.field5020.takeFile(this.field5019, var1);
		class457 var3 = new class457(var1);
		if (var2 != null) {
			var3.method8381(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "356849458"
	)
	public void method8883() {
		synchronized(this.field5018) {
			this.field5018.clear();
		}
	}

	public Iterator iterator() {
		return new class497(this);
	}
}
