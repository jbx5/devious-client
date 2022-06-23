import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("nb")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1766830117)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lnb;I)I", garbageValue = "-1083429285")
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lne;B)I", garbageValue = "-81")
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored(((Ignored) (var1)));
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored(((Ignored) (var1)));
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IB)Lqg;", garbageValue = "-15")
	public static PrivateChatMode method6780(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{ PrivateChatMode.field4818, PrivateChatMode.field4817, PrivateChatMode.field4819 };
		PrivateChatMode[] var2 = var1;
		for (int var3 = 0; var3 < var2.length; ++var3) {
			PrivateChatMode var4 = var2[var3];
			if (var0 == var4.field4820) {
				return var4;
			}
		}
		return null;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(Llh;IIB)Z", garbageValue = "-50")
	public static boolean method6774(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			ChatChannel.SpriteBuffer_decode(var3);
			return true;
		}
	}
}