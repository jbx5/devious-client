import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("dd")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("el")
	@ObfuscatedSignature(descriptor = "Llc;")
	static Archive field1383;

	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lnm;Lnm;I)I", garbageValue = "-1964984147")
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IB)Lfs;", garbageValue = "-125")
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = ((EnumComposition) (EnumComposition.EnumDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0);
			var1 = new EnumComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			EnumComposition.EnumDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(II)Lbr;", garbageValue = "260622968")
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return ((Message) (Messages.Messages_hashTable.get(((long) (var0)))));
	}
}