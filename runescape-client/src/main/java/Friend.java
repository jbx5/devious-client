import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("nk")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("o")
	boolean field4312;

	@ObfuscatedName("q")
	boolean field4313;

	Friend() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lnk;B)I", garbageValue = "-87")
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) {
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) {
			return 1;
		} else if (super.world != 0 && var1.world == 0) {
			return -1;
		} else if (var1.world != 0 && super.world == 0) {
			return 1;
		} else if (this.field4312 && !var1.field4312) {
			return -1;
		} else if (!this.field4312 && var1.field4312) {
			return 1;
		} else if (this.field4313 && !var1.field4313) {
			return -1;
		} else if (!this.field4313 && var1.field4313) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lnd;I)I", garbageValue = "1115853399")
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend(((Friend) (var1)));
	}

	public int compareTo(Object var1) {
		return this.compareToFriend(((Friend) (var1)));
	}
}