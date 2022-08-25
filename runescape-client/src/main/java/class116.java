import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("dg")
public enum class116 implements MouseWheel {

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Ldg;")
	field1434(0, 0),
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Ldg;")
	field1431(1, 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Ldg;")
	field1428(2, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Ldg;")
	field1433(3, 3),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Ldg;")
	field1432(4, 4);
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -468392523)
	final int field1430;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -2081257831)
	final int field1429;

	class116(int var3, int var4) {
		this.field1430 = var3;
		this.field1429 = var4;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "104")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1429;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-500725143")
	static void method2683(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1765352582")
	static final void method2678() {
		VarpDefinition.method3288();
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
		UserComparator4.method2535();
		class114.method2637();
		class145.method3021();
		class120.method2734();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		class101.method2502();
		VarpDefinition.VarpDefinition_cached.clear();
		class290.HitSplatDefinition_cachedSprites.method7444();
		Bounds.HitSplatDefinition_cached.method7444();
		class149.method3062();
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
		Tiles.method2022();
		ParamComposition.ParamDefinition_cached.clear();
		WorldMapElement.WorldMapElement_cachedSprites.clear();
		Occluder.method4237();
		class309.method5690();
		Client.DBTableIndex_cache.clear();
		Client.DBTableMasterIndex_cache.clear();
		VarpDefinition.method3284();
		Widget.Widget_cachedSprites.clear();
		Widget.Widget_cachedModels.clear();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
		((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).clear();
		Script.Script_cached.clear();
		ClanChannelMember.archive5.clearFiles();
		Decimator.field403.clearFiles();
		class306.archive7.clearFiles();
		class271.archive4.clearFiles();
		class120.archive9.clearFiles();
		PacketBuffer.archive6.clearFiles();
		FloorUnderlayDefinition.archive11.clearFiles();
		class299.archive8.clearFiles();
		class201.field2366.clearFiles();
		KitDefinition.archive10.clearFiles();
		class17.field89.clearFiles();
		SequenceDefinition.archive12.clearFiles();
		Timer.field4232.clearFiles();
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-2085207398")
	static final int method2682() {
		if (ClanMate.clientPreferences.method2209()) {
			return class268.Client_plane;
		} else {
			int var0 = 3;
			if (class82.cameraPitch < 310) {
				label164 : {
					int var1;
					int var2;
					if (Client.oculusOrbState == 1) {
						var1 = FloorOverlayDefinition.oculusOrbFocalPointX >> 7;
						var2 = AbstractUserComparator.oculusOrbFocalPointY >> 7;
					} else {
						var1 = ScriptFrame.localPlayer.x >> 7;
						var2 = ScriptFrame.localPlayer.y >> 7;
					}
					int var3 = class16.cameraX >> 7;
					int var4 = class269.cameraZ >> 7;
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
						if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
							if ((Tiles.Tiles_renderFlags[class268.Client_plane][var3][var4] & 4) != 0) {
								var0 = class268.Client_plane;
							}
							int var5;
							if (var1 > var3) {
								var5 = var1 - var3;
							} else {
								var5 = var3 - var1;
							}
							int var6;
							if (var2 > var4) {
								var6 = var2 - var4;
							} else {
								var6 = var4 - var2;
							}
							int var7;
							int var8;
							if (var5 > var6) {
								var7 = var6 * 65536 / var5;
								var8 = 32768;
								while (true) {
									if (var1 == var3) {
										break label164;
									}
									if (var3 < var1) {
										++var3;
									} else if (var3 > var1) {
										--var3;
									}
									if ((Tiles.Tiles_renderFlags[class268.Client_plane][var3][var4] & 4) != 0) {
										var0 = class268.Client_plane;
									}
									var8 += var7;
									if (var8 >= 65536) {
										var8 -= 65536;
										if (var4 < var2) {
											++var4;
										} else if (var4 > var2) {
											--var4;
										}
										if ((Tiles.Tiles_renderFlags[class268.Client_plane][var3][var4] & 4) != 0) {
											var0 = class268.Client_plane;
										}
									}
								} 
							} else {
								if (var6 > 0) {
									var7 = var5 * 65536 / var6;
									var8 = 32768;
									while (var2 != var4) {
										if (var4 < var2) {
											++var4;
										} else if (var4 > var2) {
											--var4;
										}
										if ((Tiles.Tiles_renderFlags[class268.Client_plane][var3][var4] & 4) != 0) {
											var0 = class268.Client_plane;
										}
										var8 += var7;
										if (var8 >= 65536) {
											var8 -= 65536;
											if (var3 < var1) {
												++var3;
											} else if (var3 > var1) {
												--var3;
											}
											if ((Tiles.Tiles_renderFlags[class268.Client_plane][var3][var4] & 4) != 0) {
												var0 = class268.Client_plane;
											}
										}
									} 
								}
								break label164;
							}
						}
						return class268.Client_plane;
					}
					return class268.Client_plane;
				}
			}
			if (ScriptFrame.localPlayer.x >= 0 && ScriptFrame.localPlayer.y >= 0 && ScriptFrame.localPlayer.x < 13312 && ScriptFrame.localPlayer.y < 13312) {
				if ((Tiles.Tiles_renderFlags[class268.Client_plane][ScriptFrame.localPlayer.x >> 7][ScriptFrame.localPlayer.y >> 7] & 4) != 0) {
					var0 = class268.Client_plane;
				}
				return var0;
			} else {
				return class268.Client_plane;
			}
		}
	}
}