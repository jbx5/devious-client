import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
public class class426 extends class392 implements class252 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Llq;")

	final AbstractArchive field4586;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lii;")

	final DemotingHashTable field4585;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	1295217061)

	final int field4587;

	@ObfuscatedSignature(descriptor = 
	"(Lkh;ILlp;Llq;)V")

	public class426(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field4585 = new DemotingHashTable(64);
		this.field4586 = var4;
		this.field4587 = var2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IB)Loi;", garbageValue = 
	"4")

	protected class394 vmethod7638(int var1) {
		synchronized(this.field4585) {
			class393 var2 = ((class393) (this.field4585.get(((long) (var1)))));
			if (var2 == null) {
				var2 = this.method7639(var1);
				this.field4585.method5145(var2, ((long) (var1)));
			}

			return var2;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lof;", garbageValue = 
	"90")

	class393 method7639(int var1) {
		byte[] var2 = this.field4586.takeFile(this.field4587, var1);
		class393 var3 = new class393(var1);
		if (var2 != null) {
			var3.method7199(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1581325429")

	public void method7640() {
		synchronized(this.field4585) {
			this.field4585.clear();
		}
	}

	public Iterator iterator() {
		return new class425(this);
	}
}