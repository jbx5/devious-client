import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
public class class426 extends class392 implements class252 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lln;")

	final AbstractArchive field4584;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lie;")

	final DemotingHashTable field4583;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	474099221)

	final int field4585;

	@ObfuscatedSignature(descriptor = 
	"(Lkt;ILlo;Lln;)V")

	public class426(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field4583 = new DemotingHashTable(64);
		this.field4584 = var4;
		this.field4585 = var2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lox;", garbageValue = 
	"60")

	protected class394 vmethod7542(int var1) {
		synchronized(this.field4583) {
			class393 var2 = ((class393) (this.field4583.get(((long) (var1)))));
			if (var2 == null) {
				var2 = this.method7543(var1);
				this.field4583.method5124(var2, ((long) (var1)));
			}

			return var2;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(II)Loh;", garbageValue = 
	"1788746986")

	class393 method7543(int var1) {
		byte[] var2 = this.field4584.takeFile(this.field4585, var1);
		class393 var3 = new class393(var1);
		if (var2 != null) {
			var3.method7128(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-9")

	public void method7541() {
		synchronized(this.field4583) {
			this.field4583.clear();
		}
	}

	public Iterator iterator() {
		return new class425(this);
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"0")

	static final void method7546() {
		Client.field703 = Client.cycleCntr;
		SoundSystem.field309 = true;
	}
}