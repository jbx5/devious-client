import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rk")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("js")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1925686629
	)
	public int field4751;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lvn;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("al")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lvn;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4751 = (int)(SecureRandomCallable.method2320() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2060638001"
	)
	public static void method8302() {
		KitDefinition.KitDefinition_archive = null;
		class4.KitDefinition_modelsArchive = null;
		KitDefinition.KitDefinition_fileCount = 0;
	}
}
