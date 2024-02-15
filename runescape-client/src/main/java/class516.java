import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tx")
public class class516 extends class474 implements class299 {
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("tx")
	@ObfuscatedGetter(
		intValue = -1748523701
	)
	static int field5118;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	final AbstractArchive field5116;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	final DemotingHashTable field5115;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2110259639
	)
	final int field5114;

	@ObfuscatedSignature(
		descriptor = "(Lox;ILpe;Lof;)V"
	)
	public class516(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field5115 = new DemotingHashTable(64);
		this.field5116 = var4;
		this.field5114 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsy;",
		garbageValue = "79"
	)
	protected class476 vmethod9278(int var1) {
		synchronized(this.field5115) {
			class475 var2 = (class475)this.field5115.get((long)var1);
			if (var2 == null) {
				var2 = this.method9274(var1);
				this.field5115.method5975(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lsn;",
		garbageValue = "-1765623354"
	)
	class475 method9274(int var1) {
		byte[] var2 = this.field5116.takeFile(this.field5114, var1);
		class475 var3 = new class475(var1);
		if (var2 != null) {
			var3.method8736(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "198654526"
	)
	public void method9275() {
		synchronized(this.field5115) {
			this.field5115.clear();
		}
	}

	public Iterator iterator() {
		return new class515(this);
	}
}
