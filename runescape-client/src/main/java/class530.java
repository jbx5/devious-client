import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uf")
public class class530 extends class488 implements class310 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	final AbstractArchive field5284;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	final DemotingHashTable field5283;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 793380861
	)
	final int field5285;

	@ObfuscatedSignature(
		descriptor = "(Lot;ILpg;Lob;)V"
	)
	public class530(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field5283 = new DemotingHashTable(64);
		this.field5284 = var4;
		this.field5285 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lst;",
		garbageValue = "870292735"
	)
	protected class490 vmethod9414(int var1) {
		synchronized(this.field5283) {
			class489 var2 = (class489)this.field5283.get((long)var1);
			if (var2 == null) {
				var2 = this.method9409(var1);
				this.field5283.method6105(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lsy;",
		garbageValue = "-99369538"
	)
	class489 method9409(int var1) {
		byte[] var2 = this.field5284.takeFile(this.field5285, var1);
		class489 var3 = new class489(var1);
		if (var2 != null) {
			var3.method8888(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "776009165"
	)
	public void method9408() {
		synchronized(this.field5283) {
			this.field5283.clear();
		}
	}

	public Iterator iterator() {
		return new class529(this);
	}
}
