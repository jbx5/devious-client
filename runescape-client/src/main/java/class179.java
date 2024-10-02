import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public class class179 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("field1915")
	static EvictingDualNodeHashTable field1915;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1694028507
	)
	static int field1883;

	static {
		field1915 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;IIB)Ljava/lang/String;",
		garbageValue = "56"
	)
	public static String method3798(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}

			StringBuilder var8 = new StringBuilder(var4);

			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}

			return var8.toString();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "14"
	)
	public static int method3802(int var0) {
		return var0 >>> 4 & class543.field5359;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1948231486"
	)
	static void method3800() {
		if (Login.clearLoginScreen) {
			class158.titleboxSprite = null;
			Login.titlebuttonSprite = null;
			Login.runesSprite = null;
			class331.leftTitleSprite = null;
			WorldMapCacheName.rightTitleSprite = null;
			UserComparator8.logoSprite = null;
			AuthenticationScheme.title_muteSprite = null;
			class174.options_buttons_0Sprite = null;
			TransformationMatrix.options_buttons_2Sprite = null;
			class6.worldSelectBackSprites = null;
			HttpRequestTask.worldSelectFlagSprites = null;
			WorldMapIcon_0.worldSelectArrows = null;
			class113.worldSelectStars = null;
			class138.field1636 = null;
			class268.loginScreenRunesAnimation.method2732();
			AbstractWorldMapIcon.method6257(0, 100);
			JagNetThread var0 = FontName.field5260;
			var0.method7641(true);
			Login.clearLoginScreen = false;
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-117"
	)
	@Export("clear")
	static final void clear() {
		class106.method2954();
		class378.method7438();
		class30.method448();
		class330.method6424();
		DbTableType.DBTableType_cache.clear();
		class139.method3373();
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
		class6.method41();
		class178.field1913.clear();
		KitDefinition.KitDefinition_cached.clear();
		InvDefinition.InvDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
		WorldMapElement.HitSplatDefinition_cached.clear();
		class191.field2026.clear();
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
		ObjectComposition.method4194();
		class180.method3808();
		VarbitComposition.method4073();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		LoginPacket.method3452();
		class178.method3793();
		if (FriendSystem.field841 != null) {
			FriendSystem.field841.method9713();
		}

		if (ApproximateRouteStrategy.field477 != null) {
			ApproximateRouteStrategy.field477.method9713();
		}

		FloatProjection.method5136();
		class47.method894();
		UserComparator10.method3226();
		class182.field1864.clear();
		class177.field1842.clear();
		UrlRequest.method3168();
		class30.method445();
		NPCComposition.method3978();
		class201.field2136.clear();
		Client.DBTableIndex_cache.clear();
		Client.archive11.clear();
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		PlayerComposition.field3805.clearFiles();
		PlayerComposition.field3806 = 0;
		if (TaskHandler.widgetDefinition != null) {
			TaskHandler.widgetDefinition.method6845();
		}

		if (Rasterizer3D.clips.Rasterizer3D_textureLoader != null) {
			((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
		}

		class142.method3383();
		Client.field804.clearFiles();
		if (KeyHandler.field110 != null) {
			KeyHandler.field110.clearFiles();
		}

		if (VertexNormal.field2888 != null) {
			VertexNormal.field2888.clearFiles();
		}

		if (class216.archive10 != null) {
			class216.archive10.clearFiles();
		}

		if (class187.archive12 != null) {
			class187.archive12.clearFiles();
		}

		if (class53.archive2 != null) {
			class53.archive2.clearFiles();
		}

		if (class156.field1738 != null) {
			class156.field1738.clearFiles();
		}

		if (ScriptFrame.field460 != null) {
			ScriptFrame.field460.clearFiles();
		}

		if (BuddyRankComparator.archive13 != null) {
			BuddyRankComparator.archive13.clearFiles();
		}

		if (class327.archive4 != null) {
			class327.archive4.clearFiles();
		}

		if (UserComparator9.field1534 != null) {
			UserComparator9.field1534.clearFiles();
		}

		if (class60.soundEffectsArchive != null) {
			class60.soundEffectsArchive.clearFiles();
		}

		if (MusicPatch.field3690 != null) {
			MusicPatch.field3690.clearFiles();
		}

		if (Bounds.archive9 != null) {
			Bounds.archive9.clearFiles();
		}

		if (HorizontalAlignment.archive6 != null) {
			HorizontalAlignment.archive6.clearFiles();
		}

		if (class358.field3790 != null) {
			class358.field3790.clearFiles();
		}

		if (KeyHandler.field112 != null) {
			KeyHandler.field112.clearFiles();
		}

		if (ApproximateRouteStrategy.archive8 != null) {
			ApproximateRouteStrategy.archive8.clearFiles();
		}

		if (PendingSpawn.field1213 != null) {
			PendingSpawn.field1213.clearFiles();
		}

		if (class134.field1578 != null) {
			class134.field1578.clearFiles();
		}

		if (class464.field4946 != null) {
			class464.field4946.clearFiles();
		}

		if (Login.field986 != null) {
			Login.field986.clearFiles();
		}

		if (class347.field3742 != null) {
			class347.field3742.clearFiles();
		}

	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(Ldd;Ldy;II)V",
		garbageValue = "868258311"
	)
	static void method3799(WorldView var0, Actor var1, int var2) {
		Coord var3 = var1.method2646(var0);
		int var4 = Coord.method6796(var1.x, var1.field1227 - 1);
		int var5 = Coord.method6796(var1.y, var1.field1227 - 1);
		class36.worldToScreen(var0, var3.x, var3.y, var4, var5, var2);
	}
}
