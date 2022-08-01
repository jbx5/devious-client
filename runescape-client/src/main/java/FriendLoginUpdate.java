import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("nf")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -1560112081)
	public int field4316 = ((int) (class131.method2916() / 1000L));

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lqi;")
	@Export("username")
	public Username username;

	@ObfuscatedName("f")
	@Export("world")
	public short world;

	@ObfuscatedSignature(descriptor = "(Lqi;I)V")
	FriendLoginUpdate(Username var1, int var2) {
		this.username = var1;
		this.world = ((short) (var2));
	}
}