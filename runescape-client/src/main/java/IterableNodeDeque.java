import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
@Implements("IterableNodeDeque")
public class IterableNodeDeque implements Iterable, Collection {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("sentinel")
	Node sentinel;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	Node field4418;

	public IterableNodeDeque() {
		this.sentinel = new Node();
		this.sentinel.previous = this.sentinel;
		this.sentinel.next = this.sentinel;
	}

	@ObfuscatedName("aw")
	@Export("rsClear")
	public void rsClear() {
		while (this.sentinel.previous != this.sentinel) {
			this.sentinel.previous.remove();
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lsb;)V"
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
		descriptor = "(Lsb;)V"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Lsb;"
	)
	@Export("last")
	public Node last() {
		return this.method7080((Node)null);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsb;)Lsb;"
	)
	Node method7080(Node var1) {
		Node var2;
		if (var1 == null) {
			var2 = this.sentinel.previous;
		} else {
			var2 = var1;
		}

		if (var2 == this.sentinel) {
			this.field4418 = null;
			return null;
		} else {
			this.field4418 = var2.previous;
			return var2;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Lsb;"
	)
	@Export("previous")
	public Node previous() {
		Node var1 = this.field4418;
		if (var1 == this.sentinel) {
			this.field4418 = null;
			return null;
		} else {
			this.field4418 = var1.previous;
			return var1;
		}
	}

	@ObfuscatedName("az")
	int method7082() {
		int var1 = 0;

		for (Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
			++var1;
		}

		return var1;
	}

	@ObfuscatedName("av")
	public boolean method7083() {
		return this.sentinel.previous == this.sentinel;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()[Lsb;"
	)
	Node[] method7115() {
		Node[] var1 = new Node[this.method7082()];
		int var2 = 0;

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lsb;)Z"
	)
	boolean method7146(Node var1) {
		this.addFirst(var1);
		return true;
	}

	public boolean add(Object var1) {
		return this.method7146((Node)var1);
	}

	public boolean isEmpty() {
		return this.method7083();
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

	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int hashCode() {
		return super.hashCode();
	}

	public int size() {
		return this.method7082();
	}

	public boolean addAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean remove(Object var1) {
		throw new RuntimeException();
	}

	public Iterator iterator() {
		return new IterableNodeDequeDescendingIterator(this);
	}

	public Object[] toArray() {
		return this.method7115();
	}

	public void clear() {
		this.rsClear();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lsb;Lsb;)V"
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
