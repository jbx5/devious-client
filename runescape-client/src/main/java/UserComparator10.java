import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.io.File;
import net.runelite.mapping.Export;
@ObfuscatedName("dm")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("c")
	@Export("cacheDir")
	public static File cacheDir;

	@ObfuscatedName("o")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lnh;Lnh;I)I", garbageValue = "-364048224")
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(B)[Ljz;", garbageValue = "-31")
	public static class263[] method2689() {
		return new class263[]{ class263.field3022, class263.field3023, class263.field3021, class263.field3025, class263.field3024, class263.field3028, class263.field3020, class263.field3026, class263.field3027, class263.field3019 };
	}
}