import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import net.runelite.mapping.Export;
@ObfuscatedName("cy")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1549167537)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount = 10;

	@ObfuscatedName("f")
	@Export("roofsHidden")
	boolean roofsHidden;

	@ObfuscatedName("u")
	@Export("hideUsername")
	boolean hideUsername = false;

	@ObfuscatedName("c")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;

	@ObfuscatedName("w")
	@Export("displayFps")
	boolean displayFps = false;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 967152513)
	int field1241;

	@ObfuscatedName("j")
	@Export("brightness")
	double brightness = 0.8;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 81680703)
	@Export("musicVolume")
	int musicVolume = 127;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 1566580435)
	@Export("soundEffectsVolume")
	int soundEffectsVolume = 127;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -1633780479)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume = 127;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 213477607)
	int field1244 = -1;

	@ObfuscatedName("x")
	@Export("rememberedUsername")
	String rememberedUsername = null;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -1209049139)
	@Export("windowMode")
	int windowMode = 1;

	@ObfuscatedName("p")
	@Export("parameters")
	LinkedHashMap parameters = new LinkedHashMap();

	ClientPreferences() {
		this.method2309(true);
	}

	@ObfuscatedSignature(descriptor = "(Lqw;)V")
	ClientPreferences(Buffer var1) {
		if (var1 != null && var1.array != null) {
			int var2 = var1.readUnsignedByte();
			if (var2 >= 0 && var2 <= ClientPreferences_optionCount) {
				if (var1.readUnsignedByte() == 1) {
					this.roofsHidden = true;
				}
				if (var2 > 1) {
					this.titleMusicDisabled = var1.readUnsignedByte() == 1;
				}
				if (var2 > 3) {
					this.windowMode = var1.readUnsignedByte();
				}
				if (var2 > 2) {
					int var3 = var1.readUnsignedByte();
					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.readInt();
						int var6 = var1.readInt();
						this.parameters.put(var5, var6);
					}
				}
				if (var2 > 4) {
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull();
				}
				if (var2 > 5) {
					this.hideUsername = var1.readBoolean();
				}
				if (var2 > 6) {
					this.brightness = ((double) (var1.readUnsignedByte())) / 100.0;
					this.musicVolume = var1.readUnsignedByte();
					this.soundEffectsVolume = var1.readUnsignedByte();
					this.areaSoundEffectsVolume = var1.readUnsignedByte();
				}
				if (var2 > 7) {
					this.field1244 = var1.readUnsignedByte();
				}
				if (var2 > 8) {
					this.displayFps = var1.readUnsignedByte() == 1;
				}
				if (var2 > 9) {
					this.field1241 = var1.readInt();
				}
			} else {
				this.method2309(true);
			}
		} else {
			this.method2309(true);
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(ZB)V", garbageValue = "-102")
	void method2309(boolean var1) {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Lqw;", garbageValue = "276334442")
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(100);
		var1.writeByte(ClientPreferences_optionCount);
		var1.writeByte(this.roofsHidden ? 1 : 0);
		var1.writeByte(this.titleMusicDisabled ? 1 : 0);
		var1.writeByte(this.windowMode);
		var1.writeByte(this.parameters.size());
		Iterator var2 = this.parameters.entrySet().iterator();
		while (var2.hasNext()) {
			Map.Entry var3 = ((Map.Entry) (var2.next()));
			var1.writeInt(((Integer) (var3.getKey())));
			var1.writeInt(((Integer) (var3.getValue())));
		} 
		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : "");
		var1.writeBoolean(this.hideUsername);
		var1.writeByte(((int) (100.0 * this.brightness)));
		var1.writeByte(this.musicVolume);
		var1.writeByte(this.soundEffectsVolume);
		var1.writeByte(this.areaSoundEffectsVolume);
		var1.writeByte(this.field1244);
		var1.writeByte(this.displayFps ? 1 : 0);
		var1.writeInt(this.field1241);
		return var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "-1020334135")
	void method2311(boolean var1) {
		this.roofsHidden = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "0")
	boolean method2312() {
		return this.roofsHidden;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(ZB)V", garbageValue = "119")
	void method2389(boolean var1) {
		this.hideUsername = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "52")
	boolean method2326() {
		return this.hideUsername;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "801738878")
	void method2347(boolean var1) {
		this.titleMusicDisabled = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-89")
	boolean method2316() {
		return this.titleMusicDisabled;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "-911249797")
	void method2338(boolean var1) {
		this.displayFps = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "1")
	void method2369() {
		this.method2338(!this.displayFps);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1718849137")
	boolean method2339() {
		return this.displayFps;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-2008348376")
	void method2320(int var1) {
		this.field1241 = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1365608555")
	int method2321() {
		return this.field1241;
	}

	@ObfuscatedName("b")
	void method2322(double var1) {
		this.brightness = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(I)D", garbageValue = "-1375339710")
	double method2323() {
		return this.brightness;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "463466171")
	void method2357(int var1) {
		this.musicVolume = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1692388245")
	int method2335() {
		return this.musicVolume;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-56")
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1988484023")
	int method2348() {
		return this.soundEffectsVolume;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "121")
	void method2332(int var1) {
		this.areaSoundEffectsVolume = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "2113963891")
	int method2329() {
		return this.areaSoundEffectsVolume;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "-25")
	void method2330(String var1) {
		this.rememberedUsername = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-1796864574")
	String method2331() {
		return this.rememberedUsername;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "1")
	void method2319(int var1) {
		this.field1244 = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-321740181")
	int method2333() {
		return this.field1244;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1018005741")
	void method2334(int var1) {
		this.windowMode = var1;
		class270.savePreferences();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "30")
	int method2387() {
		return this.windowMode;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Llc;Llc;I)V", garbageValue = "-1994537996")
	public static void method2400(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0;
		SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(Lgo;[Lgr;I)V", garbageValue = "-1704019261")
	static final void method2401(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) {
			for (var3 = 0; var3 < 104; ++var3) {
				for (var4 = 0; var4 < 104; ++var4) {
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) {
						var5 = var2;
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
							var5 = var2 - 1;
						}
						if (var5 >= 0) {
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}
		Tiles.rndHue += ((int) (Math.random() * 5.0)) - 2;
		if (Tiles.rndHue < -8) {
			Tiles.rndHue = -8;
		}
		if (Tiles.rndHue > 8) {
			Tiles.rndHue = 8;
		}
		Tiles.rndLightness += ((int) (Math.random() * 5.0)) - 2;
		if (Tiles.rndLightness < -16) {
			Tiles.rndLightness = -16;
		}
		if (Tiles.rndLightness > 16) {
			Tiles.rndLightness = 16;
		}
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int[] var10000;
		int var17;
		int var18;
		for (var2 = 0; var2 < 4; ++var2) {
			byte[][] var44 = Tiles.field998[var2];
			boolean var50 = true;
			boolean var51 = true;
			boolean var6 = true;
			boolean var7 = true;
			boolean var8 = true;
			var9 = ((int) (Math.sqrt(5100.0)));
			var10 = var9 * 768 >> 8;
			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11];
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1];
					var15 = ((int) (Math.sqrt(((double) (var13 * var13 + var14 * var14 + 65536)))));
					var16 = (var13 << 8) / var15;
					var17 = 65536 / var15;
					var18 = (var14 << 8) / var15;
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96;
					var20 = (var44[var12][var11 + 1] >> 3) + (var44[var12 - 1][var11] >> 2) + (var44[var12][var11 - 1] >> 2) + (var44[var12 + 1][var11] >> 3) + (var44[var12][var11] >> 1);
					class295.field3524[var12][var11] = var19 - var20;
				}
			}
			for (var11 = 0; var11 < 104; ++var11) {
				NetFileRequest.Tiles_hue[var11] = 0;
				class430.Tiles_saturation[var11] = 0;
				WallDecoration.Tiles_lightness[var11] = 0;
				class4.Tiles_hueMultiplier[var11] = 0;
				Tiles.field999[var11] = 0;
			}
			for (var11 = -5; var11 < 109; ++var11) {
				for (var12 = 0; var12 < 104; ++var12) {
					var13 = var11 + 5;
					int var10002;
					if (var13 >= 0 && var13 < 104) {
						var14 = class356.Tiles_underlays[var2][var13][var12] & 255;
						if (var14 > 0) {
							FloorUnderlayDefinition var48 = class131.method2909(var14 - 1);
							var10000 = NetFileRequest.Tiles_hue;
							var10000[var12] += var48.hue;
							var10000 = class430.Tiles_saturation;
							var10000[var12] += var48.saturation;
							var10000 = WallDecoration.Tiles_lightness;
							var10000[var12] += var48.lightness;
							var10000 = class4.Tiles_hueMultiplier;
							var10000[var12] += var48.hueMultiplier;
							var10002 = Tiles.field999[var12]++;
						}
					}
					var14 = var11 - 5;
					if (var14 >= 0 && var14 < 104) {
						var15 = class356.Tiles_underlays[var2][var14][var12] & 255;
						if (var15 > 0) {
							FloorUnderlayDefinition var49 = class131.method2909(var15 - 1);
							var10000 = NetFileRequest.Tiles_hue;
							var10000[var12] -= var49.hue;
							var10000 = class430.Tiles_saturation;
							var10000[var12] -= var49.saturation;
							var10000 = WallDecoration.Tiles_lightness;
							var10000[var12] -= var49.lightness;
							var10000 = class4.Tiles_hueMultiplier;
							var10000[var12] -= var49.hueMultiplier;
							var10002 = Tiles.field999[var12]--;
						}
					}
				}
				if (var11 >= 1 && var11 < 103) {
					var12 = 0;
					var13 = 0;
					var14 = 0;
					var15 = 0;
					var16 = 0;
					for (var17 = -5; var17 < 109; ++var17) {
						var18 = var17 + 5;
						if (var18 >= 0 && var18 < 104) {
							var12 += NetFileRequest.Tiles_hue[var18];
							var13 += class430.Tiles_saturation[var18];
							var14 += WallDecoration.Tiles_lightness[var18];
							var15 += class4.Tiles_hueMultiplier[var18];
							var16 += Tiles.field999[var18];
						}
						var19 = var17 - 5;
						if (var19 >= 0 && var19 < 104) {
							var12 -= NetFileRequest.Tiles_hue[var19];
							var13 -= class430.Tiles_saturation[var19];
							var14 -= WallDecoration.Tiles_lightness[var19];
							var15 -= class4.Tiles_hueMultiplier[var19];
							var16 -= Tiles.field999[var19];
						}
						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) {
							if (var2 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var2;
							}
							var20 = class356.Tiles_underlays[var2][var11][var17] & 255;
							int var21 = Tiles.Tiles_overlays[var2][var11][var17] & 255;
							if (var20 > 0 || var21 > 0) {
								int var22 = Tiles.Tiles_heights[var2][var11][var17];
								int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17];
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1];
								int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1];
								int var26 = class295.field3524[var11][var17];
								int var27 = class295.field3524[var11 + 1][var17];
								int var28 = class295.field3524[var11 + 1][var17 + 1];
								int var29 = class295.field3524[var11][var17 + 1];
								int var30 = -1;
								int var31 = -1;
								int var32;
								int var33;
								int var34;
								if (var20 > 0) {
									var32 = var12 * 256 / var15;
									var33 = var13 / var16;
									var34 = var14 / var16;
									var30 = Client.hslToRgb(var32, var33, var34);
									var32 = var32 + Tiles.rndHue & 255;
									var34 += Tiles.rndLightness;
									if (var34 < 0) {
										var34 = 0;
									} else if (var34 > 255) {
										var34 = 255;
									}
									var31 = Client.hslToRgb(var32, var33, var34);
								}
								FloorOverlayDefinition var35;
								if (var2 > 0) {
									boolean var56 = true;
									if (var20 == 0 && Tiles.Tiles_shapes[var2][var11][var17] != 0) {
										var56 = false;
									}
									if (var21 > 0) {
										var34 = var21 - 1;
										var35 = ((FloorOverlayDefinition) (FloorOverlayDefinition.FloorOverlayDefinition_cached.get(((long) (var34)))));
										FloorOverlayDefinition var45;
										if (var35 != null) {
											var45 = var35;
										} else {
											byte[] var36 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var34);
											var35 = new FloorOverlayDefinition();
											if (var36 != null) {
												var35.decode(new Buffer(var36), var34);
											}
											var35.postDecode();
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var35, ((long) (var34)));
											var45 = var35;
										}
										if (!var45.hideUnderlay) {
											var56 = false;
										}
									}
									if (var56 && var23 == var22 && var24 == var22 && var25 == var22) {
										var10000 = MouseRecorder.field1060[var2][var11];
										var10000[var17] |= 2340;
									}
								}
								var32 = 0;
								if (var31 != -1) {
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[StructComposition.method3599(var31, 96)];
								}
								if (var21 == 0) {
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, StructComposition.method3599(var30, var26), StructComposition.method3599(var30, var27), StructComposition.method3599(var30, var28), StructComposition.method3599(var30, var29), 0, 0, 0, 0, var32, 0);
								} else {
									var33 = Tiles.Tiles_shapes[var2][var11][var17] + 1;
									byte var57 = Tiles.field997[var2][var11][var17];
									int var46 = var21 - 1;
									FloorOverlayDefinition var37 = ((FloorOverlayDefinition) (FloorOverlayDefinition.FloorOverlayDefinition_cached.get(((long) (var46)))));
									if (var37 != null) {
										var35 = var37;
									} else {
										byte[] var38 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var46);
										var37 = new FloorOverlayDefinition();
										if (var38 != null) {
											var37.decode(new Buffer(var38), var46);
										}
										var37.postDecode();
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var37, ((long) (var46)));
										var35 = var37;
									}
									int var47 = var35.texture;
									int var39;
									int var40;
									int var41;
									int var42;
									if (var47 >= 0) {
										var40 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var47);
										var39 = -1;
									} else if (var35.primaryRgb == 16711935) {
										var39 = -2;
										var47 = -1;
										var40 = -2;
									} else {
										var39 = Client.hslToRgb(var35.hue, var35.saturation, var35.lightness);
										var41 = var35.hue + Tiles.rndHue & 255;
										var42 = var35.lightness + Tiles.rndLightness;
										if (var42 < 0) {
											var42 = 0;
										} else if (var42 > 255) {
											var42 = 255;
										}
										var40 = Client.hslToRgb(var41, var35.saturation, var42);
									}
									var41 = 0;
									if (var40 != -2) {
										var41 = Rasterizer3D.Rasterizer3D_colorPalette[World.method1692(var40, 96)];
									}
									if (var35.secondaryRgb != -1) {
										var42 = var35.secondaryHue + Tiles.rndHue & 255;
										int var43 = var35.secondaryLightness + Tiles.rndLightness;
										if (var43 < 0) {
											var43 = 0;
										} else if (var43 > 255) {
											var43 = 255;
										}
										var40 = Client.hslToRgb(var42, var35.secondarySaturation, var43);
										var41 = Rasterizer3D.Rasterizer3D_colorPalette[World.method1692(var40, 96)];
									}
									var0.addTile(var2, var11, var17, var33, var57, var47, var22, var23, var24, var25, StructComposition.method3599(var30, var26), StructComposition.method3599(var30, var27), StructComposition.method3599(var30, var28), StructComposition.method3599(var30, var29), World.method1692(var39, var26), World.method1692(var39, var27), World.method1692(var39, var28), World.method1692(var39, var29), var32, var41);
								}
							}
						}
					}
				}
			}
			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					var0.setTileMinPlane(var2, var12, var11, Actor.method2268(var2, var12, var11));
				}
			}
			class356.Tiles_underlays[var2] = null;
			Tiles.Tiles_overlays[var2] = null;
			Tiles.Tiles_shapes[var2] = null;
			Tiles.field997[var2] = null;
			Tiles.field998[var2] = null;
		}
		var0.method4138(-50, -10, -50);
		for (var2 = 0; var2 < 104; ++var2) {
			for (var3 = 0; var3 < 104; ++var3) {
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var0.setLinkBelow(var2, var3);
				}
			}
		}
		var2 = 1;
		var3 = 2;
		var4 = 4;
		for (var5 = 0; var5 < 4; ++var5) {
			if (var5 > 0) {
				var2 <<= 3;
				var3 <<= 3;
				var4 <<= 3;
			}
			for (int var52 = 0; var52 <= var5; ++var52) {
				for (int var53 = 0; var53 <= 104; ++var53) {
					for (int var54 = 0; var54 <= 104; ++var54) {
						short var55;
						if ((MouseRecorder.field1060[var52][var54][var53] & var2) != 0) {
							var9 = var53;
							var10 = var53;
							var11 = var52;
							for (var12 = var52; var9 > 0 && (MouseRecorder.field1060[var52][var54][var9 - 1] & var2) != 0; --var9) {
							}
							while (var10 < 104 && (MouseRecorder.field1060[var52][var54][var10 + 1] & var2) != 0) {
								++var10;
							} 
							label448 : while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((MouseRecorder.field1060[var11 - 1][var54][var13] & var2) == 0) {
										break label448;
									}
								}
								--var11;
							} 
							label437 : while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((MouseRecorder.field1060[var12 + 1][var54][var13] & var2) == 0) {
										break label437;
									}
								}
								++var12;
							} 
							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var55 = 240;
								var15 = Tiles.Tiles_heights[var12][var54][var9] - var55;
								var16 = Tiles.Tiles_heights[var11][var54][var9];
								Scene.Scene_addOccluder(var5, 1, var54 * 128, var54 * 128, var9 * 128, var10 * 128 + 128, var15, var16);
								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = MouseRecorder.field1060[var17][var54];
										var10000[var18] &= ~var2;
									}
								}
							}
						}
						if ((MouseRecorder.field1060[var52][var54][var53] & var3) != 0) {
							var9 = var54;
							var10 = var54;
							var11 = var52;
							for (var12 = var52; var9 > 0 && (MouseRecorder.field1060[var52][var9 - 1][var53] & var3) != 0; --var9) {
							}
							while (var10 < 104 && (MouseRecorder.field1060[var52][var10 + 1][var53] & var3) != 0) {
								++var10;
							} 
							label501 : while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((MouseRecorder.field1060[var11 - 1][var13][var53] & var3) == 0) {
										break label501;
									}
								}
								--var11;
							} 
							label490 : while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((MouseRecorder.field1060[var12 + 1][var13][var53] & var3) == 0) {
										break label490;
									}
								}
								++var12;
							} 
							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var55 = 240;
								var15 = Tiles.Tiles_heights[var12][var9][var53] - var55;
								var16 = Tiles.Tiles_heights[var11][var9][var53];
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var53 * 128, var53 * 128, var15, var16);
								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = MouseRecorder.field1060[var17][var18];
										var10000[var53] &= ~var3;
									}
								}
							}
						}
						if ((MouseRecorder.field1060[var52][var54][var53] & var4) != 0) {
							var9 = var54;
							var10 = var54;
							var11 = var53;
							for (var12 = var53; var11 > 0 && (MouseRecorder.field1060[var52][var54][var11 - 1] & var4) != 0; --var11) {
							}
							while (var12 < 104 && (MouseRecorder.field1060[var52][var54][var12 + 1] & var4) != 0) {
								++var12;
							} 
							label554 : while (var9 > 0) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((MouseRecorder.field1060[var52][var9 - 1][var13] & var4) == 0) {
										break label554;
									}
								}
								--var9;
							} 
							label543 : while (var10 < 104) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((MouseRecorder.field1060[var52][var10 + 1][var13] & var4) == 0) {
										break label543;
									}
								}
								++var10;
							} 
							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) {
								var13 = Tiles.Tiles_heights[var52][var9][var11];
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13);
								for (var14 = var9; var14 <= var10; ++var14) {
									for (var15 = var11; var15 <= var12; ++var15) {
										var10000 = MouseRecorder.field1060[var52][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}
	}
}