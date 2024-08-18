import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sq")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 586131593
	)
	public int field4915;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("an")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4915 = (int)(RouteStrategy.method5439() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}
}
