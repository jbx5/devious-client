import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oq")
@Implements("Node")
public class Node {
	@ObfuscatedName("gv")
	@Export("key")
	public long key;
	@ObfuscatedName("gt")
	@ObfuscatedSignature(descriptor = 
	"Loq;")

	@Export("previous")
	public Node previous;
	@ObfuscatedName("gm")
	@ObfuscatedSignature(descriptor = 
	"Loq;")

	@Export("next")
	public Node next;

	@ObfuscatedName("fg")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("fh")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}