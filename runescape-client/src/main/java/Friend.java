import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sp")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("ab")
	boolean field4911;
	@ObfuscatedName("ay")
	boolean field4912;

	Friend() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsp;I)I",
		garbageValue = "2101139269"
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
		} else if (this.field4911 && !var1.field4911) {
			return -1;
		} else if (!this.field4911 && var1.field4911) {
			return 1;
		} else if (this.field4912 && !var1.field4912) {
			return -1;
		} else if (!this.field4912 && var1.field4912) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lsz;I)I",
		garbageValue = "1336181307"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-777303227"
	)
	public static void method8589() {
		DbTableType.DBTableType_cache.clear();
	}
}
