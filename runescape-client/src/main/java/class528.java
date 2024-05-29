import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uj")
public class class528 extends class486 implements class307 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	final AbstractArchive field5255;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	final DemotingHashTable field5256;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1108143243
	)
	final int field5257;

	@ObfuscatedSignature(
		descriptor = "(Loz;ILpl;Lor;)V"
	)
	public class528(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field5256 = new DemotingHashTable(64);
		this.field5255 = var4;
		this.field5257 = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsp;",
		garbageValue = "89"
	)
	protected class488 vmethod9465(int var1) {
		synchronized(this.field5256) {
			class487 var2 = (class487)this.field5256.get((long)var1);
			if (var2 == null) {
				var2 = this.method9466(var1);
				this.field5256.method6105(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lsu;",
		garbageValue = "929402894"
	)
	class487 method9466(int var1) {
		byte[] var2 = this.field5255.takeFile(this.field5257, var1);
		class487 var3 = new class487(var1);
		if (var2 != null) {
			var3.method8914(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "547689449"
	)
	public void method9467() {
		synchronized(this.field5256) {
			this.field5256.clear();
		}
	}

	public Iterator iterator() {
		return new class527(this);
	}
}
