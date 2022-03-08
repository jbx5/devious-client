import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("oc")
@Implements("IterableNodeHashTableIterator")
public class IterableNodeHashTableIterator implements Iterator {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lon;")
    @Export("hashTable")
    IterableNodeHashTable hashTable;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Loe;")
    @Export("head")
    Node head;

    @ObfuscatedName("s")
    @Export("index")
    int index;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Loe;")
    @Export("last")
    Node last;

    @ObfuscatedSignature(descriptor = "(Lon;)V")
    IterableNodeHashTableIterator(IterableNodeHashTable var1) {
        this.last = null;
        this.hashTable = var1;
        this.start();
    }

    @ObfuscatedName("c")
    @Export("start")
    void start() {
        this.head = this.hashTable.buckets[0].previous;
        this.index = 1;
        this.last = null;
    }

    public Object next() {
        Node var1;
        if (this.hashTable.buckets[this.index - 1] != this.head) {
            var1 = this.head;
            this.head = var1.previous;
            this.last = var1;
            return var1;
        } else {
            do {
                if (this.index >= this.hashTable.size) {
                    return null;
                }
                var1 = this.hashTable.buckets[this.index++].previous;
            } while (var1 == this.hashTable.buckets[this.index - 1] );
            this.head = var1.previous;
            this.last = var1;
            return var1;
        }
    }

    public boolean hasNext() {
        if (this.hashTable.buckets[this.index - 1] != this.head) {
            return true;
        } else {
            while (this.index < this.hashTable.size) {
                if (this.hashTable.buckets[this.index++].previous != this.hashTable.buckets[this.index - 1]) {
                    this.head = this.hashTable.buckets[this.index - 1].previous;
                    return true;
                }
                this.head = this.hashTable.buckets[this.index - 1];
            } 
            return false;
        }
    }

    public void remove() {
        if (this.last == null) {
            throw new IllegalStateException();
        } else {
            this.last.remove();
            this.last = null;
        }
    }
}