import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("IterableNodeDeque")
public class IterableNodeDeque implements Iterable , Collection {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Loq;")

	@Export("sentinel")
	Node sentinel;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Loq;")

	Node field4086;

	public IterableNodeDeque() {
		this.sentinel = new Node();
		this.sentinel.previous = this.sentinel;
		this.sentinel.next = this.sentinel;
	}

	@ObfuscatedName("v")
	@Export("rsClear")
	public void rsClear() {
		while (this.sentinel.previous != this.sentinel) {
			this.sentinel.previous.remove();
		} 

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Loq;)V")

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

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Loq;)V")

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

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"()Loq;")

	@Export("last")
	public Node last() {
		return this.method6161(((Node) (null)));
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Loq;)Loq;")

	Node method6161(Node var1) {
		Node var2;
		if (var1 == null) {
			var2 = this.sentinel.previous;
		} else {
			var2 = var1;
		}

		if (var2 == this.sentinel) {
			this.field4086 = null;
			return null;
		} else {
			this.field4086 = var2.previous;
			return var2;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"()Loq;")

	@Export("previous")
	public Node previous() {
		Node var1 = this.field4086;
		if (var1 == this.sentinel) {
			this.field4086 = null;
			return null;
		} else {
			this.field4086 = var1.previous;
			return var1;
		}
	}

	@ObfuscatedName("l")
	int method6163() {
		int var1 = 0;

		for (Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
			++var1;
		}

		return var1;
	}

	@ObfuscatedName("q")
	public boolean method6164() {
		return this.sentinel.previous == this.sentinel;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"()[Loq;")

	Node[] method6212() {
		Node[] var1 = new Node[this.method6163()];
		int var2 = 0;

		for (Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(Loq;)Z")

	boolean method6206(Node var1) {
		this.addFirst(var1);
		return true;
	}

	public boolean addAll(Collection var1) {
		throw new RuntimeException();
	}

	public Iterator iterator() {
		return new IterableNodeDequeDescendingIterator(this);
	}

	public int size() {
		return this.method6163();
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

	public Object[] toArray() {
		return this.method6212();
	}

	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	public void clear() {
		this.rsClear();
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean containsAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean isEmpty() {
		return this.method6164();
	}

	public boolean add(Object var1) {
		return this.method6206(((Node) (var1)));
	}

	public boolean remove(Object var1) {
		throw new RuntimeException();
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Loq;Loq;)V")

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