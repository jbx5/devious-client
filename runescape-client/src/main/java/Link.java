import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("od")
@Implements("Link")
public class Link {
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lod;")
	@Export("previous")
	public Link previous;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lod;")
	@Export("next")
	public Link next;

	@ObfuscatedName("o")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}
}