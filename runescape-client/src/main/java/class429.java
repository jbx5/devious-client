import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
public class class429 extends class394 implements class252 {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	final AbstractArchive field4681;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	final DemotingHashTable field4679;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1178378245
	)
	final int field4680;

	@ObfuscatedSignature(
		descriptor = "(Lkl;ILlj;Llv;)V"
	)
	public class429(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0); // L: 19
		this.field4679 = new DemotingHashTable(64); // L: 15
		this.field4681 = var4; // L: 20
		this.field4680 = var2; // L: 21
	} // L: 22

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Lof;",
		garbageValue = "-21"
	)
	protected class396 vmethod7723(int var1) {
		synchronized(this.field4679) { // L: 26
			class395 var2 = (class395)this.field4679.get((long)var1); // L: 27
			if (var2 == null) { // L: 28
				var2 = this.method7731(var1); // L: 29
				this.field4679.method5282(var2, (long)var1); // L: 30
			}

			return var2; // L: 33
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IS)Lol;",
		garbageValue = "490"
	)
	class395 method7731(int var1) {
		byte[] var2 = this.field4681.takeFile(this.field4680, var1); // L: 37
		class395 var3 = new class395(var1); // L: 38
		if (var2 != null) {
			var3.method7285(new Buffer(var2)); // L: 39
		}

		return var3; // L: 40
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "970961598"
	)
	public void method7724() {
		synchronized(this.field4679) { // L: 44
			this.field4679.clear(); // L: 45
		}
	} // L: 47

	public Iterator iterator() {
		return new class428(this); // L: 51
	}
}
