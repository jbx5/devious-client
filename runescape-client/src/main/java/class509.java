import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tl")
public class class509 extends class467 implements class294 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	final AbstractArchive field5053;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	final DemotingHashTable field5054;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 686115117
	)
	final int field5052;

	@ObfuscatedSignature(
		descriptor = "(Lnt;ILof;Lol;)V"
	)
	public class509(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field5054 = new DemotingHashTable(64);
		this.field5053 = var4;
		this.field5052 = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsj;",
		garbageValue = "-61"
	)
	protected class469 vmethod9077(int var1) {
		synchronized(this.field5054) {
			class468 var2 = (class468)this.field5054.get((long)var1);
			if (var2 == null) {
				var2 = this.method9076(var1);
				this.field5054.method5861(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsg;",
		garbageValue = "0"
	)
	class468 method9076(int var1) {
		byte[] var2 = this.field5053.takeFile(this.field5052, var1);
		class468 var3 = new class468(var1);
		if (var2 != null) {
			var3.method8551(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-985406624"
	)
	public void method9078() {
		synchronized(this.field5054) {
			this.field5054.clear();
		}
	}

	public Iterator iterator() {
		return new class508(this);
	}
}
