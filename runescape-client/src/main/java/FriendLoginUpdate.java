import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ra")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -152542295
	)
	public int field4914;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("aj")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lvv;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4914 = (int)(class129.method3033() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}
}
