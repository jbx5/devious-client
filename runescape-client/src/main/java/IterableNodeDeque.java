import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
@Implements("IterableNodeDeque")
public class IterableNodeDeque implements Iterable, Collection {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("sentinel")
	Node sentinel;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	Node field4441;

	public IterableNodeDeque() {
		this.sentinel = new Node();
		this.sentinel.previous = this.sentinel;
		this.sentinel.next = this.sentinel;
	}

	@ObfuscatedName("at")
	@Export("rsClear")
	public void rsClear() {
		while (this.sentinel.previous != this.sentinel) {
			this.sentinel.previous.remove();
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lsh;)V"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lsh;)V"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lsh;"
	)
	@Export("last")
	public Node last() {
		return this.method7289((Node)null);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lsh;)Lsh;"
	)
	Node method7289(Node var1) {
		Node var2;
		if (var1 == null) {
			var2 = this.sentinel.previous;
		} else {
			var2 = var1;
		}

		if (var2 == this.sentinel) {
			this.field4441 = null;
			return null;
		} else {
			this.field4441 = var2.previous;
			return var2;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lsh;"
	)
	@Export("previous")
	public Node previous() {
		Node var1 = this.field4441;
		if (var1 == this.sentinel) {
			this.field4441 = null;
			return null;
		} else {
			this.field4441 = var1.previous;
			return var1;
		}
	}

	@ObfuscatedName("ac")
	int method7291() {
		int var1 = 0;

		for (Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
			++var1;
		}

		return var1;
	}

	@ObfuscatedName("al")
	public boolean method7350() {
		return this.sentinel.previous == this.sentinel;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()[Lsh;"
	)
	Node[] method7293() {
		Node[] var1 = new Node[this.method7291()];
		int var2 = 0;

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsh;)Z"
	)
	boolean method7295(Node var1) {
		this.addFirst(var1);
		return true;
	}

	public Iterator iterator() {
		return new IterableNodeDequeDescendingIterator(this);
	}

	public int size() {
		return this.method7291();
	}

	public boolean isEmpty() {
		return this.method7350();
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

	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	public void clear() {
		this.rsClear();
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int hashCode() {
		return super.hashCode();
	}

	public Object[] toArray() {
		return this.method7293();
	}

	public boolean add(Object var1) {
		return this.method7295((Node)var1);
	}

	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean remove(Object var1) {
		throw new RuntimeException();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsh;Lsh;)V"
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
