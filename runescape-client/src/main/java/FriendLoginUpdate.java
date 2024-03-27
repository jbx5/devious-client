import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rf")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1711175003
	)
	public int field4787;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lvx;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("af")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lvx;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4787 = (int)(VerticalAlignment.method3924() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}
}
