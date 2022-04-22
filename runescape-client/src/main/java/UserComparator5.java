import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lnf;Lnf;I)I", garbageValue = 
	"-2036334399")

	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) {
			if (var2.world == 0) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IIIB)Lqi;", garbageValue = 
	"-28")

	static SpritePixels method2599(int var0, int var1, int var2) {
		DemotingHashTable var3 = WorldMapRegion.WorldMapRegion_cachedSprites;
		long var4 = ((long) (((var2 << 16) | (var0 << 8)) | var1));
		return ((SpritePixels) (var3.get(var4)));
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lln;Lln;B)V", garbageValue = 
	"0")

	public static void method2592(AbstractArchive var0, AbstractArchive var1) {
		HealthBarDefinition.HealthBarDefinition_archive = var0;
		HealthBarDefinition.field1863 = var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(III)Lbd;", garbageValue = 
	"121897231")

	static Script method2600(int var0, int var1) {
		Script var2 = ((Script) (Script.Script_cached.get(((long) (var0 << 16)))));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = class152.archive12.getGroupId(var3);
			if (var4 == (-1)) {
				return null;
			} else {
				byte[] var5 = class152.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}

					var2 = PcmPlayer.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, ((long) (var0 << 16)));
						return var2;
					}
				}

				return null;
			}
		}
	}
}