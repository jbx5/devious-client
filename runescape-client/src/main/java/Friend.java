import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("gz")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("at")
	boolean field4681;
	@ObfuscatedName("ah")
	boolean field4679;

	Friend() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqk;I)I",
		garbageValue = "1155977086"
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
		} else if (this.field4681 && !var1.field4681) {
			return -1;
		} else if (!this.field4681 && var1.field4681) {
			return 1;
		} else if (this.field4679 && !var1.field4679) {
			return -1;
		} else if (!this.field4679 && var1.field4679) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lrf;B)I",
		garbageValue = "-95"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}
}
