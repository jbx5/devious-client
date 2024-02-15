import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("al")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	VarcInt() {
		this.persist = false;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-1598158199"
	)
	void method3593(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method3592(var1, var2);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;IS)V",
		garbageValue = "13984"
	)
	void method3592(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lgx;",
		garbageValue = "140098528"
	)
	public static HealthBarDefinition method3595(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0);
			var1 = new HealthBarDefinition();
			var1.field1918 = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lho;",
		garbageValue = "770454173"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Ltf;",
		garbageValue = "1260468308"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(class11.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (JagexCache.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (JagexCache.cacheGamebuild == 34) {
			var4 = "_wip";
		}

		File var5 = new File(class334.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		AccessFile var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BIILkq;[Liz;I)V",
		garbageValue = "-1433547236"
	)
	static final void method3606(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0);
		int var6 = -1;

		while (true) {
			int var7 = var5.readIncrSmallSmart();
			if (var7 == 0) {
				return;
			}

			var6 += var7;
			int var8 = 0;

			while (true) {
				int var9 = var5.readUShortSmart();
				if (var9 == 0) {
					break;
				}

				var8 += var9 - 1;
				int var10 = var8 & 63;
				int var11 = var8 >> 6 & 63;
				int var12 = var8 >> 12;
				int var13 = var5.readUnsignedByte();
				int var14 = var13 >> 2;
				int var15 = var13 & 3;
				int var16 = var11 + var1;
				int var17 = var10 + var2;
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
					int var18 = var12;
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) {
						var18 = var12 - 1;
					}

					CollisionMap var19 = null;
					if (var18 >= 0) {
						var19 = var4[var18];
					}

					ItemComposition.addObjects(var12, var16, var17, var6, var15, var14, var3, var19);
				}
			}
		}
	}
}
