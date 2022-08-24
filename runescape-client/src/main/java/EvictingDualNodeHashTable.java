import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("iz")
@Implements("EvictingDualNodeHashTable")
public final class EvictingDualNodeHashTable {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Loa;")
	@Export("dualNode")
	DualNode dualNode = new DualNode();

	@ObfuscatedName("h")
	@Export("capacity")
	int capacity;

	@ObfuscatedName("w")
	@Export("remainingCapacity")
	int remainingCapacity;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lpm;")
	@Export("hashTable")
	IterableNodeHashTable hashTable;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lms;")
	@Export("deque")
	IterableDualNodeQueue deque = new IterableDualNodeQueue();

	public EvictingDualNodeHashTable(int var1) {
		this.capacity = var1;
		this.remainingCapacity = var1;
		int var2;
		for (var2 = 1; var2 + var2 < var1; var2 += var2) {
		}
		this.hashTable = new IterableNodeHashTable(var2);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(J)Loa;")
	@Export("get")
	public DualNode get(long var1) {
		DualNode var3 = ((DualNode) (this.hashTable.get(var1)));
		if (var3 != null) {
			this.deque.add(var3);
		}
		return var3;
	}

	@ObfuscatedName("h")
	@Export("remove")
	public void remove(long var1) {
		DualNode var3 = ((DualNode) (this.hashTable.get(var1)));
		if (var3 != null) {
			var3.remove();
			var3.removeDual();
			++this.remainingCapacity;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Loa;J)V")
	@Export("put")
	public void put(DualNode var1, long var2) {
		if (this.remainingCapacity == 0) {
			DualNode var4 = this.deque.removeLast();
			var4.remove();
			var4.removeDual();
			if (var4 == this.dualNode) {
				var4 = this.deque.removeLast();
				var4.remove();
				var4.removeDual();
			}
		} else {
			--this.remainingCapacity;
		}
		this.hashTable.put(var1, var2);
		this.deque.add(var1);
	}

	@ObfuscatedName("v")
	@Export("clear")
	public void clear() {
		this.deque.clear();
		this.hashTable.clear();
		this.dualNode = new DualNode();
		this.remainingCapacity = this.capacity;
	}
}