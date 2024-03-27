import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
@Implements("IterableNodeDeque")
public class IterableNodeDeque implements Iterable, Collection {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	@Export("sentinel")
	Node sentinel;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	Node field4544;

	public IterableNodeDeque() {
		this.sentinel = new Node();
		this.sentinel.previous = this.sentinel;
		this.sentinel.next = this.sentinel;
	}

	@ObfuscatedName("az")
	@Export("rsClear")
	public void rsClear() {
		while (this.sentinel.previous != this.sentinel) {
			this.sentinel.previous.remove();
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lsu;)V"
	)
	@Export("addFirst")
	public void addFirst(Node var1) {
		if (var1.next != null) {
			var1.remove();
		}

		var1.next = this.sentinel.next;
		var1.previous = this.sentinel;
		var1.next.previous = var1;
		var1.previous.next = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsu;)V"
	)
	@Export("addLast")
	public void addLast(Node var1) {
		if (var1.next != null) {
			var1.remove();
		}

		var1.next = this.sentinel;
		var1.previous = this.sentinel.previous;
		var1.next.previous = var1;
		var1.previous.next = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lsu;"
	)
	@Export("last")
	public Node last() {
		return this.method7326((Node)null);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsu;)Lsu;"
	)
	Node method7326(Node var1) {
		Node var2;
		if (var1 == null) {
			var2 = this.sentinel.previous;
		} else {
			var2 = var1;
		}

		if (var2 == this.sentinel) {
			this.field4544 = null;
			return null;
		} else {
			this.field4544 = var2.previous;
			return var2;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lsu;"
	)
	@Export("previous")
	public Node previous() {
		Node var1 = this.field4544;
		if (var1 == this.sentinel) {
			this.field4544 = null;
			return null;
		} else {
			this.field4544 = var1.previous;
			return var1;
		}
	}

	@ObfuscatedName("aw")
	int method7293() {
		int var1 = 0;

		for (Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
			++var1;
		}

		return var1;
	}

	@ObfuscatedName("ad")
	public boolean method7356() {
		return this.sentinel.previous == this.sentinel;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()[Lsu;"
	)
	Node[] method7295() {
		Node[] var1 = new Node[this.method7293()];
		int var2 = 0;

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lsu;)Z"
	)
	boolean method7348(Node var1) {
		this.addFirst(var1);
		return true;
	}

	public Iterator iterator() {
		return new IterableNodeDequeDescendingIterator(this);
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean isEmpty() {
		return this.method7356();
	}

	public boolean contains(Object var1) {
		throw new RuntimeException();
	}

	public Object[] toArray(Object[] var1) {
		int var2 = 0;

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}

		return var1;
	}

	public boolean containsAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean add(Object var1) {
		return this.method7348((Node)var1);
	}

	public void clear() {
		this.rsClear();
	}

	public boolean remove(Object var1) {
		throw new RuntimeException();
	}

	public int size() {
		return this.method7293();
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public Object[] toArray() {
		return this.method7295();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lsu;Lsu;)V"
	)
	@Export("IterableNodeDeque_addBefore")
	public static void IterableNodeDeque_addBefore(Node var0, Node var1) {
		if (var0.next != null) {
			var0.remove();
		}

		var0.next = var1;
		var0.previous = var1.previous;
		var0.next.previous = var0;
		var0.previous.next = var0;
	}
}
