import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tp")
@Implements("Node")
public class Node {
	@ObfuscatedName("hn")
	@Export("key")
	public long key;
	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("jw")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("ji")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
