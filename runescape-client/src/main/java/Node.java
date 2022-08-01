import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("or")
@Implements("Node")
public class Node {
	@ObfuscatedName("gh")
	@Export("key")
	public long key;

	@ObfuscatedName("gl")
	@ObfuscatedSignature(descriptor = "Lor;")
	@Export("previous")
	public Node previous;

	@ObfuscatedName("gi")
	@ObfuscatedSignature(descriptor = "Lor;")
	@Export("next")
	public Node next;

	@ObfuscatedName("ft")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("fv")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}