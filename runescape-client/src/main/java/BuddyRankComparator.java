import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lnf;Lnf;I)I", garbageValue = 
	"-2004445607")

	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) {
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/Object;ZI)[B", garbageValue = 
	"606932016")

	public static byte[] method2633(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var3 = ((byte[]) ((byte[]) (var0)));
			return var1 ? SoundSystem.method764(var3) : var3;
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = ((AbstractByteArrayCopier) (var0));
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}
}