import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
@ObfuscatedName("ln")
@Implements("IterableNodeDeque")
public class IterableNodeDeque implements Iterable , Collection {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lor;")
	@Export("sentinel")
	Node sentinel = new Node();

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lor;")
	Node field4150;

	public IterableNodeDeque() {
		this.sentinel.previous = this.sentinel;
		this.sentinel.next = this.sentinel;
	}

	@ObfuscatedName("o")
	@Export("rsClear")
	public void rsClear() {
		while (this.sentinel.previous != this.sentinel) {
			this.sentinel.previous.remove();
		} 
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lor;)V")
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lor;)V")
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "()Lor;")
	@Export("last")
	public Node last() {
		return this.method6163(((Node) (null)));
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lor;)Lor;")
	Node method6163(Node var1) {
		Node var2;
		if (var1 == null) {
			var2 = this.sentinel.previous;
		} else {
			var2 = var1;
		}
		if (var2 == this.sentinel) {
			this.field4150 = null;
			return null;
		} else {
			this.field4150 = var2.previous;
			return var2;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "()Lor;")
	@Export("previous")
	public Node previous() {
		Node var1 = this.field4150;
		if (var1 == this.sentinel) {
			this.field4150 = null;
			return null;
		} else {
			this.field4150 = var1.previous;
			return var1;
		}
	}

	@ObfuscatedName("j")
	int method6191() {
		int var1 = 0;
		for (Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
			++var1;
		}
		return var1;
	}

	@ObfuscatedName("h")
	public boolean method6165() {
		return this.sentinel.previous == this.sentinel;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "()[Lor;")
	Node[] method6166() {
		Node[] var1 = new Node[this.method6191()];
		int var2 = 0;
		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}
		return var1;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(Lor;)Z")
	boolean method6168(Node var1) {
		this.addFirst(var1);
		return true;
	}

	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	public int size() {
		return this.method6191();
	}

	public boolean isEmpty() {
		return this.method6165();
	}

	public boolean contains(Object var1) {
		throw new RuntimeException();
	}

	public Object[] toArray() {
		return this.method6166();
	}

	public Object[] toArray(Object[] var1) {
		int var2 = 0;
		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}
		return var1;
	}

	public boolean remove(Object var1) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection var1) {
		throw new RuntimeException();
	}

	public void clear() {
		this.rsClear();
	}

	public boolean add(Object var1) {
		return this.method6168(((Node) (var1)));
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean containsAll(Collection var1) {
		throw new RuntimeException();
	}

	public Iterator iterator() {
		return new IterableNodeDequeDescendingIterator(this);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lor;Lor;)V")
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