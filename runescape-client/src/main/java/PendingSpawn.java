import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("be")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("rq")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	static class486 field1171;
	@ObfuscatedName("ue")
	@ObfuscatedGetter(
		intValue = -197255023
	)
	static int field1188;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1826390675
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1583811915
	)
	@Export("type")
	int type;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1220919723
	)
	@Export("x")
	int x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 868871769
	)
	@Export("y")
	int y;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -617367559
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1138524769
	)
	int field1176;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -541310443
	)
	int field1185;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2086259071
	)
	int field1175;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 336431343
	)
	int field1179;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -544154603
	)
	int field1186;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 555173951
	)
	int field1181;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2057818687
	)
	int field1183;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 434863111
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1480623259
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1183 = 31;
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1778936841"
	)
	void method2474(int var1) {
		this.field1183 = var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-60"
	)
	boolean method2469(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1183 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1013652934"
	)
	@Export("clear")
	static final void clear() {
		class186.field2007.clear();
		EnumComposition.method3678();
		Messages.method2916();
		GameObject.method6032();
		DbTableType.DBTableType_cache.clear();
		EnumComposition.EnumDefinition_cached.clear();
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
		class176.field1913.clear();
		KitDefinition.KitDefinition_cached.clear();
		class354.method6536();
		class488.method8816();
		HttpRequestTask.method285();
		class111.method2848();
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
		ParamComposition.ParamDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
		WorldMapRenderer.method4829();
		StructComposition.StructDefinition_cached.clear();
		class144.method3244();
		if (class176.field1863 != null) {
			class176.field1863.method9369();
		}

		if (PlayerType.field4444 != null) {
			PlayerType.field4444.method9369();
		}

		class193.field2100.clear();
		class195.field2022.clear();
		AsyncHttpResponse.method279();
		class180.field1864.clear();
		AbstractSocket.method8716();
		class178.field1851.clear();
		class201.field1909.clear();
		class91.method2394();
		class199.field2136.clear();
		Client.DBTableIndex_cache.clear();
		Client.archive11.clear();
		GraphicsObject.method2154();
		if (ModeWhere.widgetDefinition != null) {
			ModeWhere.widgetDefinition.method6516();
		}

		if (Rasterizer3D.clips.Rasterizer3D_textureLoader != null) {
			((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
		}

		Script.Script_cached.clear();
		Client.field795.clearFiles();
		if (LoginState.field497 != null) {
			LoginState.field497.clearFiles();
		}

		if (class498.field5069 != null) {
			class498.field5069.clearFiles();
		}

		if (WorldMapSection1.archive10 != null) {
			WorldMapSection1.archive10.clearFiles();
		}

		if (WorldEntity.archive12 != null) {
			WorldEntity.archive12.clearFiles();
		}

		if (ApproximateRouteStrategy.archive2 != null) {
			ApproximateRouteStrategy.archive2.clearFiles();
		}

		if (AbstractWorldMapData.field2675 != null) {
			AbstractWorldMapData.field2675.clearFiles();
		}

		if (VarpDefinition.field1881 != null) {
			VarpDefinition.field1881.clearFiles();
		}

		if (ChatChannel.archive13 != null) {
			ChatChannel.archive13.clearFiles();
		}

		if (LoginScreenAnimation.archive4 != null) {
			LoginScreenAnimation.archive4.clearFiles();
		}

		if (ObjectSound.field856 != null) {
			ObjectSound.field856.clearFiles();
		}

		if (class424.field4703 != null) {
			class424.field4703.clearFiles();
		}

		if (JagNetThread.field4545 != null) {
			JagNetThread.field4545.clearFiles();
		}

		if (class157.archive9 != null) {
			class157.archive9.clearFiles();
		}

		if (class199.archive6 != null) {
			class199.archive6.clearFiles();
		}

		if (WorldMapSectionType.field2665 != null) {
			WorldMapSectionType.field2665.clearFiles();
		}

		if (Tile.field2872 != null) {
			Tile.field2872.clearFiles();
		}

		if (class7.archive8 != null) {
			class7.archive8.clearFiles();
		}

		if (class195.field2052 != null) {
			class195.field2052.clearFiles();
		}

		if (class239.field2524 != null) {
			class239.field2524.clearFiles();
		}

		if (PlayerComposition.field3785 != null) {
			PlayerComposition.field3785.clearFiles();
		}

		if (class151.field1715 != null) {
			class151.field1715.clearFiles();
		}

		if (LoginPacket.field1684 != null) {
			LoginPacket.field1684.clearFiles();
		}

	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "2068160193"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (ModeWhere.widgetDefinition.loadInterface(var0)) {
			class433.field4761 = null;
			WorldMapDecoration.drawInterface(ModeWhere.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (class433.field4761 != null) {
				WorldMapDecoration.drawInterface(class433.field4761, -1412584499, var1, var2, var3, var4, FloorDecoration.field2819, class143.field1673, var7);
				class433.field4761 = null;
			}

		} else {
			if (var7 != -1) {
				Client.validRootWidgets[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.validRootWidgets[var8] = true;
				}
			}

		}
	}
}
