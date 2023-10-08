import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
public class class214 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("archive4")
	static EvictingDualNodeHashTable archive4;

	static {
		archive4 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Liy;",
		garbageValue = "-114"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class317.ItemDefinition_archive.takeFile(10, var0);
			var1 = new ItemComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.post();
			if (var1.noteTemplate != -1) {
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) {
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) {
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!HealthBarUpdate.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
				if (var1.noteTemplate == -1 && var1.notedId == -1 && var1.placeholderTemplate == -1) {
					var1.name = var1.name + " (Members)";
				}

				var1.isTradable = false;

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) {
					var1.groundActions[var3] = null;
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) {
					if (var3 != 4) {
						var1.inventoryActions[var3] = null;
					}
				}

				var1.shiftClickIndex = -2;
				var1.team = 0;
				if (var1.params != null) {
					boolean var6 = false;

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
						ParamComposition var5 = class180.getParamDefinition((int)var4.key);
						if (var5.autoDisable) {
							var4.remove();
						} else {
							var6 = true;
						}
					}

					if (!var6) {
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfk;",
		garbageValue = "-119"
	)
	static class139 method3910(int var0) {
		class139 var3 = (class139)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
		class139 var2;
		class139 var4;
		AbstractArchive var5;
		AbstractArchive var6;
		boolean var7;
		byte[] var8;
		int var9;
		byte[] var10;
		if (var3 != null) {
			var2 = var3;
		} else {
			var5 = SequenceDefinition.SequenceDefinition_animationsArchive;
			var6 = SequenceDefinition.SequenceDefinition_skeletonsArchive;
			var7 = true;
			var8 = var5.getFile(var0 >> 16 & 65535, var0 & 65535);
			if (var8 == null) {
				var7 = false;
				var4 = null;
			} else {
				var9 = (var8[1] & 255) << 8 | var8[2] & 255;
				var10 = var6.getFile(var9, 0);
				if (var10 == null) {
					var7 = false;
				}

				if (!var7) {
					var4 = null;
				} else {
					if (SoundCache.field333 == null) {
						MusicPatchPcmStream.field3510 = Runtime.getRuntime().availableProcessors();
						SoundCache.field333 = new ThreadPoolExecutor(0, MusicPatchPcmStream.field3510, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(MusicPatchPcmStream.field3510 * 100 + 100), new class186());
					}

					try {
						var4 = new class139(var5, var6, var0, false);
					} catch (Exception var13) {
						var4 = null;
					}
				}
			}

			if (var4 != null) {
				SequenceDefinition.SequenceDefinition_cachedModel.put(var4, (long)var0);
			}

			var2 = var4;
		}

		int var1;
		if (var2 == null) {
			var1 = 2;
		} else {
			var1 = var2.method3091() ? 0 : 1;
		}

		if (var1 != 0) {
			return null;
		} else {
			var3 = (class139)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
			if (var3 != null) {
				var2 = var3;
			} else {
				var5 = SequenceDefinition.SequenceDefinition_animationsArchive;
				var6 = SequenceDefinition.SequenceDefinition_skeletonsArchive;
				var7 = true;
				var8 = var5.getFile(var0 >> 16 & 65535, var0 & 65535);
				if (var8 == null) {
					var7 = false;
					var4 = null;
				} else {
					var9 = (var8[1] & 255) << 8 | var8[2] & 255;
					var10 = var6.getFile(var9, 0);
					if (var10 == null) {
						var7 = false;
					}

					if (!var7) {
						var4 = null;
					} else {
						if (SoundCache.field333 == null) {
							MusicPatchPcmStream.field3510 = Runtime.getRuntime().availableProcessors();
							SoundCache.field333 = new ThreadPoolExecutor(0, MusicPatchPcmStream.field3510, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(MusicPatchPcmStream.field3510 * 100 + 100), new class216());
						}

						try {
							var4 = new class139(var5, var6, var0, false);
						} catch (Exception var12) {
							var4 = null;
						}
					}
				}

				if (var4 != null) {
					SequenceDefinition.SequenceDefinition_cachedModel.put(var4, (long)var0);
				}

				var2 = var4;
			}

			return var2;
		}
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2124568966"
	)
	static final void method3909() {
		UserComparator10.method2924();
		SoundSystem.method846();
		class517.method9048();
		class74.method2120();
		PlayerType.method6830();
		EnumComposition.EnumDefinition_cached.clear();
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
		MouseHandler.method679();
		KitDefinition.KitDefinition_cached.clear();
		PlayerCompositionColorTextureOverride.method3597();
		MusicPatchPcmStream.method6184();
		class33.method476();
		class141.method3127();
		class20.method293();
		class315.method5904();
		class20.method297();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
		class198.method3737();
		Actor.method2456();
		UserComparator3.method2909();
		HealthBarDefinition.Widget_cachedModels.method8993();
		class53.Widget_cachedFonts.method8993();
		class206.Widget_cachedSpriteMasks.clear();
		class208.field2100.clear();
		class154.method3223();
		class193.archive5.clear();
		class188.field1909.clear();
		Language.method7159();
		KeyHandler.method344();
		UserComparator10.method2925();
		UserComparator9.method2912();
		Client.DBTableIndex_cache.clear();
		Client.archive11.clear();
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		PlayerComposition.field3628.clearFiles();
		PlayerComposition.field3626 = 0;
		class33.widgetDefinition.method6252();
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
		Script.Script_cached.clear();
		Client.field810.clearFiles();
		class92.field1117.clearFiles();
		class199.field2009.clearFiles();
		class190.archive10.clearFiles();
		SongTask.archive12.clearFiles();
		SoundSystem.archive2.clearFiles();
		class313.field3396.clearFiles();
		WorldMapDecorationType.field3881.clearFiles();
		class27.archive13.clearFiles();
		AbstractByteArrayCopier.archive4.clearFiles();
		class319.field3442.clearFiles();
		class469.field4812.clearFiles();
		Language.field4435.clearFiles();
		class198.archive9.clearFiles();
		CollisionMap.archive6.clearFiles();
		GrandExchangeOfferOwnWorldComparator.field515.clearFiles();
		class317.field3415.clearFiles();
		class199.archive8.clearFiles();
		class241.field2558.clearFiles();
		ArchiveDiskAction.field4291.clearFiles();
		HorizontalAlignment.field2028.clearFiles();
		class358.field3898.clearFiles();
		AABB.field2658.clearFiles();
	}
}
