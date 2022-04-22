import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lnf;Lnf;B)I", garbageValue = 
	"-108")

	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if ((var1.world != 0) && (var2.world != 0)) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lgi;", garbageValue = 
	"-4")

	public static VarbitComposition method2643(int var0) {
		VarbitComposition var1 = ((VarbitComposition) (VarbitComposition.VarbitDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class11.VarbitDefinition_archive.takeFile(14, var0);
			var1 = new VarbitComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(descriptor = 
	"([BII)V", garbageValue = 
	"1110458768")

	static void method2646(byte[] var0, int var1) {
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class350.writeRandomDat(var0, var1, Client.randomDatData, 0, 24);
	}
}