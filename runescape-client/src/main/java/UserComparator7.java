import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("wd")
	@ObfuscatedGetter(
		intValue = -1566429995
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("ug")
	@ObfuscatedGetter(
		intValue = -1141587141
	)
	static int field1505;
	@ObfuscatedName("us")
	@ObfuscatedGetter(
		intValue = -939137475
	)
	static int field1502;
	@ObfuscatedName("ak")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lso;Lso;I)I",
		garbageValue = "-1564815998"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "62"
	)
	static void method2966(String var0) {
		Login.displayName = ClanChannelMember.method3246(var0);
	}
}
