import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-1955718833)

	@Export("z")
	int z;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	616317407)

	@Export("x")
	int x;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-1784777855)

	@Export("y")
	int y;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lix;")

	@Export("first")
	Renderable first;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Lix;")

	@Export("second")
	Renderable second;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lix;")

	@Export("third")
	Renderable third;
	@ObfuscatedName("s")
	@ObfuscatedGetter(longValue = 
	-3789512817442359409L)

	@Export("tag")
	long tag;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-1666880433)

	@Export("height")
	int height;

	ItemLayer() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(IZS)Ljava/lang/String;", garbageValue = 
	"13756")

	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && (var0 >= 0) ? class145.method3085(var0, 10, var1) : Integer.toString(var0);
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"17826065")

	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
		MouseRecorder.method2098();
		class193.method3884();
		HealthBarDefinition.method3466();
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
		ReflectionCheck.HitSplatDefinition_cachedSprites.method7541();
		DirectByteArrayCopier.HitSplatDefinition_cached.method7541();
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
		StructComposition.StructDefinition_cached.clear();
		ParamComposition.ParamDefinition_cached.clear();
		WorldMapElement.WorldMapElement_cachedSprites.clear();
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		Widget.Widget_cachedSprites.clear();
		Widget.Widget_cachedModels.clear();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
		((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).clear();
		Script.Script_cached.clear();
		KeyHandler.archive0.clearFiles();
		UserComparator8.archive1.clearFiles();
		BufferedNetSocket.archive3.clearFiles();
		class182.archive4.clearFiles();
		Players.archive5.clearFiles();
		class16.archive6.clearFiles();
		LoginScreenAnimation.archive7.clearFiles();
		class145.archive8.clearFiles();
		WorldMapDecorationType.archive9.clearFiles();
		JagexCache.archive10.clearFiles();
		Message.archive11.clearFiles();
		class152.archive12.clearFiles();
		ArchiveLoader.scene.clear();

		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}

		System.gc();
		Actor.method2183(2);
		Client.currentTrackGroupId = -1;
		Client.field746 = false;
		ClientPreferences.method2259();
		Decimator.updateGameState(10);
	}
}