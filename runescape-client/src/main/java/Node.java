import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sb")
@Implements("Node")
public class Node {
	@ObfuscatedName("hs")
	@Export("key")
	public long key;
	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("gf")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("gk")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
