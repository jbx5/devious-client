import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
public class class318 {
	@ObfuscatedName("ay")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "647305117"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-927795799"
	)
	@Export("clear")
	static final void clear() {
		class201.field2007.clear();
		class203.field2023.clear();
		FileSystem.method3529();
		class27.method362();
		class139.method3117();
		UserComparator4.method2868();
		PcmPlayer.method799();
		FontName.method8922();
		RestClientThreadFactory.method203();
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
		class94.method2385();
		class106.method2698();
		ScriptEvent.method2306();
		GameObject.method5220();
		WorldMapElement.HitSplatDefinition_cached.clear();
		PlayerCompositionColorTextureOverride.method3691();
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
		AsyncRestClient.method183();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		StructComposition.StructDefinition_cached.clear();
		DevicePcmPlayerProvider.method290();
		if (DevicePcmPlayerProvider.field99 != null) {
			DevicePcmPlayerProvider.field99.method9070();
		}

		if (Tiles.field1043 != null) {
			Tiles.field1043.method9070();
		}

		class208.field2100.clear();
		UserComparator10.method2914();
		VarcInt.VarcInt_cached.clear();
		FadeInTask.method7823();
		class103.method2672();
		class193.field1851.clear();
		class180.method3593();
		VarpDefinition.VarpDefinition_cached.clear();
		ChatChannel.method2216();
		Client.DBTableIndex_cache.clear();
		Client.archive11.clear();
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		PlayerComposition.field3691.clearFiles();
		PlayerComposition.field3688 = 0;
		if (class243.widgetDefinition != null) {
			class243.widgetDefinition.method6284();
		}

		if (Rasterizer3D.clips.Rasterizer3D_textureLoader != null) {
			((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
		}

		Script.Script_cached.clear();
		Client.field597.clearFiles();
		if (UrlRequester.field1452 != null) {
			UrlRequester.field1452.clearFiles();
		}

		if (class17.field75 != null) {
			class17.field75.clearFiles();
		}

		if (SpriteMask.archive10 != null) {
			SpriteMask.archive10.clearFiles();
		}

		if (GrandExchangeOfferOwnWorldComparator.archive12 != null) {
			GrandExchangeOfferOwnWorldComparator.archive12.clearFiles();
		}

		if (UserComparator9.archive2 != null) {
			UserComparator9.archive2.clearFiles();
		}

		if (HttpHeaders.field4743 != null) {
			HttpHeaders.field4743.clearFiles();
		}

		if (SceneTilePaint.field2883 != null) {
			SceneTilePaint.field2883.clearFiles();
		}

		if (LoginState.archive13 != null) {
			LoginState.archive13.clearFiles();
		}

		if (GrandExchangeOfferOwnWorldComparator.archive4 != null) {
			GrandExchangeOfferOwnWorldComparator.archive4.clearFiles();
		}

		if (PcmPlayer.field283 != null) {
			PcmPlayer.field283.clearFiles();
		}

		if (class141.field1669 != null) {
			class141.field1669.clearFiles();
		}

		if (WorldMapScaleHandler.field3167 != null) {
			WorldMapScaleHandler.field3167.clearFiles();
		}

		if (class73.archive9 != null) {
			class73.archive9.clearFiles();
		}

		if (UserComparator6.archive6 != null) {
			UserComparator6.archive6.clearFiles();
		}

		if (class470.field4874 != null) {
			class470.field4874.clearFiles();
		}

		if (GraphicsObject.field883 != null) {
			GraphicsObject.field883.clearFiles();
		}

		if (GameEngine.archive8 != null) {
			GameEngine.archive8.clearFiles();
		}

		if (class107.field1377 != null) {
			class107.field1377.clearFiles();
		}

		if (class93.field1170 != null) {
			class93.field1170.clearFiles();
		}

		if (class153.field1726 != null) {
			class153.field1726.clearFiles();
		}

		if (PlayerType.field4332 != null) {
			PlayerType.field4332.clearFiles();
		}

		if (SoundCache.field308 != null) {
			SoundCache.field308.clearFiles();
		}

	}
}
