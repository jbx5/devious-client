import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
public class class76 {
	@ObfuscatedName("aq")
	static final BigInteger field913;
	@ObfuscatedName("ad")
	static final BigInteger field912;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1059024585
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("jd")
	@Export("regions")
	static int[] regions;

	static {
		field913 = new BigInteger("10001", 16);
		field912 = new BigInteger("90e0c0abb9cf2e1b90eb2b513fda79227a748db8db248d3870e090f51444087e037fe20a8594ab814a245e880415de0ee45fb4614eeed6f8dfd15b66b1e0a7a699b86524b50183e7f2ff789cdd0c05aca8b25d6cb395d02b11b5e613b7405d26b63b56e5149871dafb73278f21f440d021aa9a85f333de26f329d52d9d565cdf", 16);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhb;",
		garbageValue = "-108"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class416.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lcw;Lcw;IZIZI)I",
		garbageValue = "1128301581"
	)
	static int method2162(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = ModelData0.compareWorlds(var0, var1, var2, var3);
		if (var6 != 0) {
			return var3 ? -var6 : var6;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var7 = ModelData0.compareWorlds(var0, var1, var4, var5);
			return var5 ? -var7 : var7;
		}
	}
}
