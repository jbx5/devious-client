import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("to")
@Implements("Node")
public class Node {
	@ObfuscatedName("hk")
	@Export("key")
	public long key;
	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("jb")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("jj")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
