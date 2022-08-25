import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Comparator;
import net.runelite.mapping.Export;
@ObfuscatedName("qf")
@Implements("UserComparator1")
public class UserComparator1 implements Comparator {
	@ObfuscatedName("bs")
	@ObfuscatedGetter(intValue = -1330327021)
	static int field4765;

	@ObfuscatedName("s")
	@Export("reversed")
	final boolean reversed;

	public UserComparator1(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lnb;Lnb;B)I", garbageValue = "1")
	@Export("compare_bridged")
	int compare_bridged(User var1, User var2) {
		return this.reversed ? var1.compareTo_user(var2) : var2.compareTo_user(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged(((User) (var1)), ((User) (var2)));
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}