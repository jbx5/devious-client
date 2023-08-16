import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("au")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("ae")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -224206529
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("at")
	@Export("Tiles_underlays")
	static short[][][] Tiles_underlays;
	@ObfuscatedName("aq")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("ax")
	static final int[] field1042;
	@ObfuscatedName("ah")
	static final int[] field1043;
	@ObfuscatedName("as")
	static final int[] field1044;
	@ObfuscatedName("ay")
	static final int[] field1045;
	@ObfuscatedName("aj")
	static final int[] field1051;
	@ObfuscatedName("av")
	static final int[] field1048;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1918244679
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1547931623
	)
	@Export("rndLightness")
	static int rndLightness;
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	static Archive field1038;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = 683914525
	)
	static int field1037;

	static {
		Tiles_heights = new int[4][105][105];
		Tiles_renderFlags = new byte[4][104][104];
		Tiles_minPlane = 99;
		field1042 = new int[]{1, 2, 4, 8};
		field1043 = new int[]{16, 32, 64, 128};
		field1044 = new int[]{1, 0, -1, 0};
		field1045 = new int[]{0, -1, 0, 1};
		field1051 = new int[]{1, -1, -1, 1};
		field1048 = new int[]{-1, -1, 1, 1};
		rndHue = (int)(Math.random() * 17.0D) - 8;
		rndLightness = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[Lhy;",
		garbageValue = "1"
	)
	static VerticalAlignment[] method2244() {
		return new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2081, VerticalAlignment.field2080};
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-360252292"
	)
	static final int method2241(int var0, int var1, int var2, int var3) {
		return var0 * var2 - var3 * var1 >> 16;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lnu;III)Lui;",
		garbageValue = "1499324687"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		return !ApproximateRouteStrategy.method1228(var0, var1, var2) ? null : UserComparator6.method2922();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILiv;[Lis;)V"
	)
	static final void method2202(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0);
		int var11 = -1;

		while (true) {
			int var12 = var10.readIncrSmallSmart();
			if (var12 == 0) {
				return;
			}

			var11 += var12;
			int var13 = 0;

			while (true) {
				int var14 = var10.readUShortSmart();
				if (var14 == 0) {
					break;
				}

				var13 += var14 - 1;
				int var15 = var13 & 63;
				int var16 = var13 >> 6 & 63;
				int var17 = var13 >> 12;
				int var18 = var10.readUnsignedByte();
				int var19 = var18 >> 2;
				int var20 = var18 & 3;
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
					ObjectComposition var21 = WorldMapElement.getObjectDefinition(var11);
					int var24 = var16 & 7;
					int var25 = var15 & 7;
					int var27 = var21.sizeX;
					int var28 = var21.sizeY;
					int var29;
					if ((var20 & 1) == 1) {
						var29 = var27;
						var27 = var28;
						var28 = var29;
					}

					int var26 = var7 & 3;
					int var23;
					if (var26 == 0) {
						var23 = var24;
					} else if (var26 == 1) {
						var23 = var25;
					} else if (var26 == 2) {
						var23 = 7 - var24 - (var27 - 1);
					} else {
						var23 = 7 - var25 - (var28 - 1);
					}

					var29 = var2 + var23;
					int var30 = var3 + InterfaceParent.method2279(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
					if (var29 > 0 && var30 > 0 && var29 < 103 && var30 < 103) {
						int var31 = var1;
						if ((Tiles_renderFlags[1][var29][var30] & 2) == 2) {
							var31 = var1 - 1;
						}

						CollisionMap var32 = null;
						if (var31 >= 0) {
							var32 = var9[var31];
						}

						class128.addObjects(var1, var29, var30, var11, var20 + var7 & 3, var19, var8, var32);
					}
				}
			}
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lmi;III)V",
		garbageValue = "2062613871"
	)
	public static void method2242(Widget var0, int var1, int var2) {
		var0.field3704.bodyColors[var1] = var2;
		var0.field3704.method6072();
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "645111513"
	)
	static final void method2229() {
		Renderable.method4713();
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
		class153.method3175();
		UserComparator9.method2901();
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		VarbitComposition.VarbitDefinition_cached.clear();
		VarpDefinition.VarpDefinition_cached.clear();
		class47.HitSplatDefinition_cachedSprites.method8874();
		SwapSongTask.HitSplatDefinition_cached.method8874();
		class394.method7382();
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
		StructComposition.StructDefinition_cached.clear();
		class126.method2941();
		WorldMapElement.WorldMapElement_cachedSprites.clear();
		class219.method4262();
		class19.method295();
		Client.DBTableIndex_cache.clear();
		Client.DBTableMasterIndex_cache.clear();
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		class261.method5398();
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
		Script.Script_cached.clear();
		Client.archive5.method7779();
		AttackOption.field1351.clearFiles();
		class318.archive7.clearFiles();
		ObjectSound.archive4.clearFiles();
		class28.field161.clearFiles();
		class499.archive9.clearFiles();
		class385.archive6.clearFiles();
		Message.archive11.clearFiles();
		PcmPlayer.archive8.clearFiles();
		class147.field1691.clearFiles();
		class141.archive10.clearFiles();
		class388.field4435.clearFiles();
		GrandExchangeOffer.archive12.clearFiles();
		class343.field3869.clearFiles();
	}
}
