import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public class class171 extends class164 {
	@ObfuscatedName("ab")
	String field1817;
	@ObfuscatedName("ay")
	byte field1816;
	@ObfuscatedName("an")
	byte field1818;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	final class165 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgl;)V"
	)
	class171(class165 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;B)V",
		garbageValue = "-40"
	)
	void vmethod3611(Buffer var1) {
		this.field1817 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1817 != null) {
			var1.readUnsignedByte();
			this.field1816 = var1.readByte();
			this.field1818 = var1.readByte();
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgx;I)V",
		garbageValue = "-357446960"
	)
	void vmethod3612(ClanChannel var1) {
		var1.name = this.field1817;
		if (this.field1817 != null) {
			var1.field1804 = this.field1816;
			var1.field1806 = this.field1818;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "40"
	)
	static int method3614(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "963812052"
	)
	@Export("clear")
	static final void clear() {
		Projectile.method2268();
		ObjectComposition.method5149();
		class230.field1915.clear();
		DbRowType.DBRowType_cache.clear();
		Friend.method8589();
		EnumComposition.EnumDefinition_cached.clear();
		class376.method7162();
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
		UrlRequester.method2983();
		HorizontalAlignment.method4908();
		class36.method669();
		InvDefinition.method4765();
		WorldView.method2731();
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
		PlayerUpdateManager.method2893();
		class221.method4700();
		AuthenticationScheme.method3309();
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
		class154.method3401();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		StructComposition.StructDefinition_cached.clear();
		class229.method4772();
		if (class1.field2 != null) {
			class1.field2.method9408();
		}

		if (class373.field4034 != null) {
			class373.field4034.method9408();
		}

		class162.method3526();
		Frames.method4144();
		VarcInt.VarcInt_cached.clear();
		class233.field1864.clear();
		class335.method6430();
		WorldMapSectionType.method5915();
		class255.field1909.clear();
		VarpDefinition.VarpDefinition_cached.clear();
		class252.field2136.clear();
		Client.DBTableIndex_cache.clear();
		Client.archive11.clear();
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		PlayerComposition.field3753.clearFiles();
		PlayerComposition.field3755 = 0;
		if (FloorUnderlayDefinition.widgetDefinition != null) {
			FloorUnderlayDefinition.widgetDefinition.method6548();
		}

		if (Rasterizer3D.clips.Rasterizer3D_textureLoader != null) {
			((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
		}

		IntProjection.method3820();
		Client.field790.clearFiles();
		if (WorldView.field1305 != null) {
			WorldView.field1305.clearFiles();
		}

		if (LoginScreenAnimation.field1281 != null) {
			LoginScreenAnimation.field1281.clearFiles();
		}

		if (ReflectionCheck.archive10 != null) {
			ReflectionCheck.archive10.clearFiles();
		}

		if (RestClientThreadFactory.archive12 != null) {
			RestClientThreadFactory.archive12.clearFiles();
		}

		if (SoundSystem.archive2 != null) {
			SoundSystem.archive2.clearFiles();
		}

		if (class249.field2637 != null) {
			class249.field2637.clearFiles();
		}

		if (ClientPacket.field3331 != null) {
			ClientPacket.field3331.clearFiles();
		}

		if (Actor.archive13 != null) {
			Actor.archive13.clearFiles();
		}

		if (class60.archive4 != null) {
			class60.archive4.clearFiles();
		}

		if (class6.field11 != null) {
			class6.field11.clearFiles();
		}

		if (Projectile.soundEffectsArchive != null) {
			Projectile.soundEffectsArchive.clearFiles();
		}

		if (Occluder.field2111 != null) {
			Occluder.field2111.clearFiles();
		}

		if (ClientPreferences.archive9 != null) {
			ClientPreferences.archive9.clearFiles();
		}

		if (class33.archive6 != null) {
			class33.archive6.clearFiles();
		}

		if (KeyHandler.field100 != null) {
			KeyHandler.field100.clearFiles();
		}

		if (class167.field1796 != null) {
			class167.field1796.clearFiles();
		}

		if (class59.archive8 != null) {
			class59.archive8.clearFiles();
		}

		if (Tile.field1936 != null) {
			Tile.field1936.clearFiles();
		}

		if (class424.field4678 != null) {
			class424.field4678.clearFiles();
		}

		if (FriendsChat.field4909 != null) {
			FriendsChat.field4909.clearFiles();
		}

		if (class33.field152 != null) {
			class33.field152.clearFiles();
		}

		if (VarbitComposition.field2680 != null) {
			VarbitComposition.field2680.clearFiles();
		}

	}
}
