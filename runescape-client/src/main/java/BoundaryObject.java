import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = 1135227967
	)
	static int field3111;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1442786301
	)
	@Export("z")
	int z;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1948067907
	)
	@Export("x")
	int x;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 990182061
	)
	@Export("y")
	int y;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -954673215
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 718867179
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = -5775559510302590085L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1101717799
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "-214764962"
	)
	public static byte[] method5944(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var6 = (byte[])((byte[])var0);
			if (var1) {
				int var4 = var6.length;
				byte[] var5 = new byte[var4];
				System.arraycopy(var6, 0, var5, 0, var4);
				return var5;
			} else {
				return var6;
			}
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "1260925535"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return class53.method1068(var0, 10, true);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1893992852"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-2129517602"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}
}
