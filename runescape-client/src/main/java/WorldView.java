import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("WorldView")
public class WorldView extends Node {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1948824391
	)
	@Export("id")
	public int id;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("scene")
	public Scene scene;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lko;"
	)
	@Export("collisionMaps")
	CollisionMap[] collisionMaps;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 86027145
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1587254913
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1000264093
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2014668603
	)
	@Export("baseX")
	int baseX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1601580509
	)
	@Export("baseY")
	int baseY;
	@ObfuscatedName("am")
	@Export("tileLastDrawnActor")
	int[][] tileLastDrawnActor;
	@ObfuscatedName("at")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("au")
	@Export("tileSettings")
	byte[][][] tileSettings;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Ldv;"
	)
	@Export("players")
	public Player[] players;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lev;"
	)
	@Export("npcs")
	public NPC[] npcs;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2099244795
	)
	@Export("npcCount")
	int npcCount;
	@ObfuscatedName("ar")
	@Export("npcIndices")
	int[] npcIndices;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lso;"
	)
	@Export("worldEntities")
	WorldEntity[] worldEntities;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1234749921
	)
	@Export("worldEntityCount")
	int worldEntityCount;
	@ObfuscatedName("ag")
	@Export("worldEntityIndices")
	int[] worldEntityIndices;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[[[Lpu;"
	)
	@Export("groundItems")
	NodeDeque[][][] groundItems;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("pendingSpawns")
	NodeDeque pendingSpawns;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("projectiles")
	NodeDeque projectiles;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("graphicsObjects")
	NodeDeque graphicsObjects;

	@ObfuscatedSignature(
		descriptor = "(IIIILim;)V"
	)
	WorldView(int var1, int var2, int var3, int var4, class232 var5) {
		this.collisionMaps = new CollisionMap[4];
		this.players = new Player[2048];
		this.npcs = new NPC[65536];
		this.npcIndices = new int[65536];
		this.worldEntities = new WorldEntity[2048];
		this.worldEntityIndices = new int[2048];
		this.pendingSpawns = new NodeDeque();
		this.projectiles = new NodeDeque();
		this.graphicsObjects = new NodeDeque();
		this.id = var1;
		this.sizeX = var2;
		this.sizeY = var3;
		this.groundItems = new NodeDeque[4][var2][var3];
		this.tileHeights = new int[4][var2 + 1][var3 + 1];
		this.tileSettings = new byte[4][var2][var3];
		this.tileLastDrawnActor = new int[var2][var3];

		for (int var6 = 0; var6 < 4; ++var6) {
			this.collisionMaps[var6] = new CollisionMap(var2, var3);
		}

		this.scene = new Scene(var1, 4, var2, var3, var4, var5, this.tileHeights);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-8454"
	)
	void method2943() {
		this.npcCount = 0;
		this.worldEntityCount = 0;

		int var1;
		for (var1 = 0; var1 < 2048; ++var1) {
			this.players[var1] = null;
		}

		for (var1 = 0; var1 < 65536; ++var1) {
			this.npcs[var1] = null;
		}

		for (var1 = 0; var1 < 2048; ++var1) {
			this.worldEntities[var1] = null;
		}

		this.projectiles.clear();
		this.graphicsObjects.clear();
		this.pendingSpawns = new NodeDeque();

		for (var1 = 0; var1 < 4; ++var1) {
			for (int var2 = 0; var2 < this.sizeX; ++var2) {
				for (int var3 = 0; var3 < this.sizeY; ++var3) {
					this.groundItems[var1][var2][var3] = null;
				}
			}
		}

		this.scene.clearTempGameObjects();

		for (var1 = 0; var1 < 4; ++var1) {
			this.collisionMaps[var1].clear();
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1096311601"
	)
	void method2944() {
		int var1;
		for (var1 = 0; var1 < 2048; ++var1) {
			this.players[var1] = null;
		}

		for (var1 = 0; var1 < this.npcs.length; ++var1) {
			NPC var2 = this.npcs[var1];
			if (var2 != null) {
				var2.targetIndex = -1;
				var2.false0 = false;
			}
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZS)I",
		garbageValue = "-25639"
	)
	static int method2948(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "56"
	)
	@Export("clear")
	static final void clear() {
		class188.field2007.clear();
		AABB.method5246();
		HealthBarUpdate.method2774();
		class452.method8782();
		DbTableType.DBTableType_cache.clear();
		EnumComposition.EnumDefinition_cached.clear();
		ItemComposition.method4318();
		Sound.method3629();
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
		class111.method3078();
		class178.field1913.clear();
		KitDefinition.KitDefinition_cached.clear();
		InvDefinition.InvDefinition_cached.clear();
		ChatChannel.method2468();
		WorldMapElement.HitSplatDefinition_cached.clear();
		WorldMapSectionType.method6255();
		class163.method3738();
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
		class93.method2591();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		class254.method5318();
		ReflectionCheck.method696();
		if (AsyncHttpResponse.field66 != null) {
			AsyncHttpResponse.field66.method9889();
		}

		if (class59.field406 != null) {
			class59.field406.method9889();
		}

		class195.field2100.clear();
		class188.method3965();
		VarcInt.VarcInt_cached.clear();
		class145.method3530();
		class177.field1842.clear();
		class180.field1851.clear();
		WorldMapElement.method3900();
		AABB.method5245();
		UserComparator3.method3311();
		Client.DBTableIndex_cache.clear();
		Client.archive11.clear();
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		PlayerComposition.field3828.clearFiles();
		PlayerComposition.field3829 = 0;
		if (class416.widgetDefinition != null) {
			class416.widgetDefinition.method6898();
		}

		if (Rasterizer3D.clips.Rasterizer3D_textureLoader != null) {
			((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
		}

		RestClientThreadFactory.method202();
		Client.field789.clearFiles();
		if (FileSystem.field2400 != null) {
			FileSystem.field2400.clearFiles();
		}

		if (class171.field1849 != null) {
			class171.field1849.clearFiles();
		}

		if (class1.archive10 != null) {
			class1.archive10.clearFiles();
		}

		if (class1.archive12 != null) {
			class1.archive12.clearFiles();
		}

		if (class59.archive2 != null) {
			class59.archive2.clearFiles();
		}

		if (class160.field1759 != null) {
			class160.field1759.clearFiles();
		}

		if (class195.field2054 != null) {
			class195.field2054.clearFiles();
		}

		if (Login.archive13 != null) {
			Login.archive13.clearFiles();
		}

		if (WorldMapRegion.archive4 != null) {
			WorldMapRegion.archive4.clearFiles();
		}

		if (Language.field4701 != null) {
			Language.field4701.clearFiles();
		}

		if (ObjectComposition.soundEffectsArchive != null) {
			ObjectComposition.soundEffectsArchive.clearFiles();
		}

		if (PlayerComposition.field3818 != null) {
			PlayerComposition.field3818.clearFiles();
		}

		if (EnumComposition.archive9 != null) {
			EnumComposition.archive9.clearFiles();
		}

		if (MouseHandler.archive6 != null) {
			MouseHandler.archive6.clearFiles();
		}

		if (class156.field1737 != null) {
			class156.field1737.clearFiles();
		}

		if (class319.field3306 != null) {
			class319.field3306.clearFiles();
		}

		if (class450.archive8 != null) {
			class450.archive8.clearFiles();
		}

		if (ModeWhere.field4720 != null) {
			ModeWhere.field4720.clearFiles();
		}

		if (class142.field1656 != null) {
			class142.field1656.clearFiles();
		}

		if (Clock.field2468 != null) {
			Clock.field2468.clearFiles();
		}

		if (Sound.field1746 != null) {
			Sound.field1746.clearFiles();
		}

		if (UrlRequester.field1491 != null) {
			UrlRequester.field1491.clearFiles();
		}

	}
}
