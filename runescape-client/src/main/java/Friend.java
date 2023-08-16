import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qo")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("au")
	boolean field4644;
	@ObfuscatedName("ae")
	boolean field4645;

	Friend() {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqo;I)I",
		garbageValue = "-1434956269"
	)
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
		} else if (this.field4644 && !var1.field4644) {
			return -1;
		} else if (!this.field4644 && var1.field4644) {
			return 1;
		} else if (this.field4645 && !var1.field4645) {
			return -1;
		} else if (!this.field4645 && var1.field4645) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lqs;I)I",
		garbageValue = "1756748027"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}
}
