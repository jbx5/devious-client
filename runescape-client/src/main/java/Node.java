import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sj")
@Implements("Node")
public class Node {
	@ObfuscatedName("hf")
	@Export("key")
	public long key;
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	@Export("previous")
	public Node previous;
	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	@Export("next")
	public Node next;

	@ObfuscatedName("gx")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}

	@ObfuscatedName("gp")
	@Export("hasNext")
	public boolean hasNext() {
		return this.next != null;
	}
}
