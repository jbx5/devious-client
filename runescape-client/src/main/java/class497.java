import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("th")
public class class497 extends class455 implements class283 {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	final AbstractArchive field5020;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	final DemotingHashTable field5021;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1843835189
	)
	final int field5019;

	@ObfuscatedSignature(
		descriptor = "(Lns;ILon;Lnu;)V"
	)
	public class497(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field5021 = new DemotingHashTable(64);
		this.field5020 = var4;
		this.field5019 = var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrv;",
		garbageValue = "-32"
	)
	protected class457 vmethod8872(int var1) {
		synchronized(this.field5021) {
			class456 var2 = (class456)this.field5021.get((long)var1);
			if (var2 == null) {
				var2 = this.method8878(var1);
				this.field5021.method5639(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrg;",
		garbageValue = "-117"
	)
	class456 method8878(int var1) {
		byte[] var2 = this.field5020.takeFile(this.field5019, var1);
		class456 var3 = new class456(var1);
		if (var2 != null) {
			var3.method8310(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "322447059"
	)
	public void method8874() {
		synchronized(this.field5021) {
			this.field5021.clear();
		}
	}

	public Iterator iterator() {
		return new class496(this);
	}
}
