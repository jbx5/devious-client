import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("ay")
	static final int[] field2122;
	@ObfuscatedName("av")
	@Export("osNameLowercase")
	public static String osNameLowercase;
	@ObfuscatedName("jx")
	static int[] field2125;
	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static WorldView field2124;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 201276445
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 346325327
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1432610793
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		field2122 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field2122[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-879152973"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvl;II)V",
		garbageValue = "-1966667889"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I[IIB)V",
		garbageValue = "25"
	)
	static void method4131(int var0, int[] var1, int var2) {
		for (int var3 = 0; var3 < KitDefinition.KitDefinition_fileCount; ++var3) {
			KitDefinition var5 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var3);
			KitDefinition var4;
			if (var5 != null) {
				var4 = var5;
			} else if (GrandExchangeOfferNameComparator.KitDefinition_archive == null) {
				var4 = null;
			} else {
				byte[] var6 = GrandExchangeOfferNameComparator.KitDefinition_archive.takeFile(3, var3);
				var5 = new KitDefinition();
				if (var6 != null) {
					var5.decode(new Buffer(var6));
				}

				KitDefinition.KitDefinition_cached.put(var5, (long)var3);
				var4 = var5;
			}

			if (var4 != null && !var4.nonSelectable && var4.method3915(var2, var0)) {
				var1[class198.method4060(var2)] = var3 + 256;
				break;
			}
		}

	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(Ldn;Ldv;IILkk;I)V",
		garbageValue = "-63278733"
	)
	static final void method4130(WorldView var0, Player var1, int var2, int var3, MoveSpeed var4) {
		int var5 = var1.pathX[0];
		int var6 = var1.pathY[0];
		int var7 = var1.transformedSize();
		CollisionMap var8 = var0.collisionMaps[var0.plane];
		if (var5 >= var7 && var5 < var8.xSize - var7 && var6 >= var7 && var6 < var8.ySize - var7) {
			if (var2 >= var7 && var2 < var8.xSize - var7 && var3 >= var7 && var3 < var8.ySize - var7) {
				int var9 = Client.field795.method5824(var5, var6, var1.transformedSize(), WidgetDefinition.method6894(var2, var3), var8, true, Client.field801, Client.field506);
				if (var9 >= 1) {
					for (int var10 = 0; var10 < var9 - 1; ++var10) {
						var1.method2612(Client.field801[var10], Client.field506[var10], var4);
					}

				}
			}
		}
	}

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2137226056"
	)
	static void method4123(int var0) {
		Client.oculusOrbState = var0;
	}

	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "(II)Lvd;",
		garbageValue = "920758361"
	)
	static DbTable method4129(int var0) {
		DbTable var1 = (DbTable)Client.archive11.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(class160.field1759, var0);
		}

		return var1;
	}
}
