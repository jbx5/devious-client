import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.Iterator;
@ObfuscatedName("po")
public class class428 extends class393 implements class251 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llc;")
	final AbstractArchive field4655;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lid;")
	final DemotingHashTable field4656 = new DemotingHashTable(64);

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 1079858443)
	final int field4658;

	@ObfuscatedSignature(descriptor = "(Lkz;ILlj;Llc;)V")
	public class428(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field4655 = var4;
		this.field4658 = var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(II)Lof;", garbageValue = "288370314")
	protected class395 vmethod7551(int var1) {
		synchronized(this.field4656) {
			class394 var2 = ((class394) (this.field4656.get(((long) (var1)))));
			if (var2 == null) {
				var2 = this.method7555(var1);
				this.field4656.method5125(var2, ((long) (var1)));
			}
			return var2;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(IB)Lom;", garbageValue = "28")
	class394 method7555(int var1) {
		byte[] var2 = this.field4655.takeFile(this.field4658, var1);
		class394 var3 = new class394(var1);
		if (var2 != null) {
			var3.method7114(new Buffer(var2));
		}
		return var3;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1106917598")
	public void method7552() {
		synchronized(this.field4656) {
			this.field4656.clear();
		}
	}

	public Iterator iterator() {
		return new class427(this);
	}
}