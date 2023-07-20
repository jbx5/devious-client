import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public abstract class class159 extends Node {
	@ObfuscatedName("ax")
	static int[] field1755;

	class159() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "-43"
	)
	abstract void vmethod3411(Buffer var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "-2132107044"
	)
	abstract void vmethod3404(ClanChannel var1);

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1889169776"
	)
	static int method3337(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field882 - 7.0D) * 256.0D);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "43"
	)
	static int method3327(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-22255"
	)
	static final void method3336() {
		FadeOutTask.method7642();
		ArchiveDiskActionHandler.method6684();
		KitDefinition.KitDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
		UserComparator3.method2887();
		GrandExchangeOfferOwnWorldComparator.method1251();
		class467.method8434();
		InvDefinition.method3592();
		VarbitComposition.VarbitDefinition_cached.clear();
		VarpDefinition.VarpDefinition_cached.clear();
		class293.HitSplatDefinition_cachedSprites.method8883();
		class344.HitSplatDefinition_cached.method8883();
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.field2112.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
		class503.method8952();
		class134.method3048();
		ParamComposition.ParamDefinition_cached.clear();
		WorldMapElement.WorldMapElement_cachedSprites.clear();
		Message.method1213();
		DbRowType.DBRowType_cache.clear();
		Client.DBTableIndex_cache.clear();
		Client.DBTableMasterIndex_cache.clear();
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		class59.method1181();
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
		Script.Script_cached.clear();
		Client.archive5.method7849();
		class151.field1694.clearFiles();
		TileItem.archive7.clearFiles();
		class253.archive4.clearFiles();
		class149.field1676.clearFiles();
		Canvas.archive9.clearFiles();
		class13.archive6.clearFiles();
		class7.archive11.clearFiles();
		class386.archive8.clearFiles();
		class148.field1670.clearFiles();
		class131.archive10.clearFiles();
		GrandExchangeOfferOwnWorldComparator.field511.clearFiles();
		class126.archive12.clearFiles();
		class176.field1852.clearFiles();
	}
}
