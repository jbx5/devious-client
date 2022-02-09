import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("lc")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Llt;")
    @Export("deque")
    IterableNodeDeque deque;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Loe;")
    Node field4012;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Loe;")
    @Export("last")
    Node last;

    @ObfuscatedSignature(descriptor = "(Llt;)V")
    IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
        this.last = null;
        this.setDeque(var1);
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Llt;)V")
    @Export("setDeque")
    void setDeque(IterableNodeDeque var1) {
        this.deque = var1;
        this.start();
    }

    @ObfuscatedName("l")
    @Export("start")
    void start() {
        this.field4012 = (this.deque != null) ? this.deque.sentinel.previous : null;
        this.last = null;
    }

    public void remove() {
        this.last.remove();
        this.last = null;
    }

    public Object next() {
        Node var1 = this.field4012;
        if (var1 == this.deque.sentinel) {
            var1 = null;
            this.field4012 = null;
        } else {
            this.field4012 = var1.previous;
        }
        this.last = var1;
        return var1;
    }

    public boolean hasNext() {
        return (this.deque.sentinel != this.field4012) && (this.field4012 != null);
    }
}