import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lfg;")

	field1935(2, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lfg;")

	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(1, 1),
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lfg;")

	field1932(0, 2);

	@ObfuscatedName("dh")
	@ObfuscatedSignature(descriptor = 
	"Lfx;")

	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("gl")
	@ObfuscatedSignature(descriptor = 
	"Lck;")

	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	609598821)

	@Export("value")
	public final int value;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	-2060500087)

	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"16")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Lbb;Lbb;IZIZI)I", garbageValue = 
	"-1569793930")

	static int method3538(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = SpriteMask.compareWorlds(var0, var1, var2, var3);
		if (var6 != 0) {
			return var3 ? -var6 : var6;
		} else if (var4 == (-1)) {
			return 0;
		} else {
			int var7 = SpriteMask.compareWorlds(var0, var1, var4, var5);
			return var5 ? -var7 : var7;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = 
	"(Lgj;I)Z", garbageValue = 
	"1046018492")

	static boolean method3539(ObjectComposition var0) {
		if (var0.transforms != null) {
			int[] var1 = var0.transforms;

			for (int var2 = 0; var2 < var1.length; ++var2) {
				int var3 = var1[var2];
				ObjectComposition var4 = class146.getObjectDefinition(var3);
				if (var4.mapIconId != (-1)) {
					return true;
				}
			}
		} else if (var0.mapIconId != (-1)) {
			return true;
		}

		return false;
	}}