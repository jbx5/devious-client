import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
@Implements("HttpRequest")
public class HttpRequest {
	@ObfuscatedName("fz")
	@ObfuscatedGetter(
		intValue = 1355366367
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("az")
	@Export("connection")
	final HttpsURLConnection connection;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("httpHeaders")
	final HttpHeaders httpHeaders;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	final HttpMethod field43;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("httpPayload")
	HttpPayload httpPayload;
	@ObfuscatedName("an")
	@Export("requestInitialized")
	boolean requestInitialized;
	@ObfuscatedName("ao")
	@Export("followRedirects")
	boolean followRedirects;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1358021553
	)
	@Export("connectionTimeout")
	int connectionTimeout;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lal;Lqy;Z)V"
	)
	public HttpRequest(URL var1, HttpMethod var2, HttpHeaders var3, boolean var4) throws IOException {
		this.requestInitialized = false;
		this.followRedirects = false;
		this.connectionTimeout = 300000;
		if (!var2.method68()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.getName());
		} else {
			this.connection = (HttpsURLConnection)var1.openConnection();
			if (!var4) {
				HttpsURLConnection var5 = this.connection;
				if (SecureRandomSSLSocketFactory.INSTANCE == null) {
					SecureRandomSSLSocketFactory.INSTANCE = new SecureRandomSSLSocketFactory();
				}

				SecureRandomSSLSocketFactory var6 = SecureRandomSSLSocketFactory.INSTANCE;
				var5.setSSLSocketFactory(var6);
			}

			this.field43 = var2;
			this.httpHeaders = var3 != null ? var3 : new HttpHeaders();
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lal;Z)V"
	)
	public HttpRequest(URL var1, HttpMethod var2, boolean var3) throws IOException {
		this(var1, var2, new HttpHeaders(), var3);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lqy;",
		garbageValue = "-1117338649"
	)
	@Export("getHeaders")
	public HttpHeaders getHeaders() {
		return this.httpHeaders;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lsg;B)V",
		garbageValue = "37"
	)
	@Export("setPayload")
	public void setPayload(HttpPayload var1) {
		if (!this.requestInitialized) {
			if (var1 == null) {
				this.httpHeaders.removeHeader("Content-Type");
				this.httpPayload = null;
			} else {
				this.httpPayload = var1;
				if (this.httpPayload.getContentType() != null) {
					this.httpHeaders.contentType(this.httpPayload.getContentType());
				} else {
					this.httpHeaders.removeContentType();
				}

			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "47"
	)
	@Export("initializeRequest")
	void initializeRequest() throws ProtocolException {
		if (!this.requestInitialized) {
			this.connection.setRequestMethod(this.field43.getName());
			this.httpHeaders.setRequestProperties(this.connection);
			if (this.field43.method70() && this.httpPayload != null) {
				this.connection.setDoOutput(true);
				ByteArrayOutputStream var1 = new ByteArrayOutputStream();

				try {
					var1.write(this.httpPayload.toBytes());
					var1.writeTo(this.connection.getOutputStream());
				} catch (IOException var11) {
					var11.printStackTrace();
				} finally {
					try {
						var1.close();
					} catch (IOException var10) {
						var10.printStackTrace();
					}

				}
			}

			this.connection.setConnectTimeout(this.connectionTimeout);
			this.connection.setInstanceFollowRedirects(this.followRedirects);
			this.requestInitialized = true;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2037038519"
	)
	@Export("connect")
	boolean connect() throws IOException {
		if (!this.requestInitialized) {
			this.initializeRequest();
		}

		this.connection.connect();
		return this.connection.getResponseCode() == -1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Laa;",
		garbageValue = "111"
	)
	@Export("getResponse")
	HttpResponse getResponse() {
		try {
			if (!this.requestInitialized || this.connection.getResponseCode() == -1) {
				return new HttpResponse("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.connection.disconnect();
			return new HttpResponse("Error decoding REST response code: " + var10.getMessage());
		}

		HttpResponse var3;
		try {
			HttpResponse var1 = new HttpResponse(this.connection);
			return var1;
		} catch (IOException var8) {
			var3 = new HttpResponse("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.connection.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lid;",
		garbageValue = "308653318"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ItemComposition.ItemDefinition_archive.takeFile(10, var0);
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

			if (!class168.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
				if (var1.noteTemplate == -1 && var1.notedId == -1 && var1.placeholderTemplate == -1) {
					var1.name = var1.name + " (Members)";
				}

				var1.examine = "Login to a members' server to use this object.";
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
						ParamComposition var5 = class127.getParamDefinition((int)var4.key);
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "1946544915"
	)
	static final int method99(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljp;[Lix;I)V",
		garbageValue = "1142637180"
	)
	static final void method100(Scene var0, CollisionMap[] var1) {
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

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.rndHue < -8) {
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) {
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2;
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
			byte[][] var47 = TextureProvider.Tiles_underlays2[var2];
			boolean var59 = true;
			boolean var60 = true;
			boolean var6 = true;
			boolean var7 = true;
			boolean var8 = true;
			var9 = (int)Math.sqrt(5100.0D);
			var10 = var9 * 768 >> 8;

			int var19;
			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11];
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1];
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536));
					var16 = (var13 << 8) / var15;
					var17 = 65536 / var15;
					var18 = (var14 << 8) / var15;
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96;
					int var58 = (var47[var12][var11 + 1] >> 3) + (var47[var12 - 1][var11] >> 2) + (var47[var12][var11 - 1] >> 2) + (var47[var12 + 1][var11] >> 3) + (var47[var12][var11] >> 1);
					class306.field3195[var12][var11] = var19 - var58;
				}
			}

			for (var11 = 0; var11 < 104; ++var11) {
				World.Tiles_hue[var11] = 0;
				WorldMapLabelSize.Tiles_saturation[var11] = 0;
				class539.Tiles_lightness[var11] = 0;
				Tiles.Tiles_hueMultiplier[var11] = 0;
				class384.field4473[var11] = 0;
			}

			for (var11 = -5; var11 < 109; ++var11) {
				for (var12 = 0; var12 < 104; ++var12) {
					var13 = var11 + 5;
					int var10002;
					if (var13 >= 0 && var13 < 104) {
						long var52 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var16 = (int)var52;
						var17 = Tiles.Tiles_underlays[var2][var13][var12] & var16;
						if (var17 > 0) {
							FloorUnderlayDefinition var54 = class411.method7472(var17 - 1);
							var10000 = World.Tiles_hue;
							var10000[var12] += var54.hue;
							var10000 = WorldMapLabelSize.Tiles_saturation;
							var10000[var12] += var54.saturation;
							var10000 = class539.Tiles_lightness;
							var10000[var12] += var54.lightness;
							var10000 = Tiles.Tiles_hueMultiplier;
							var10000[var12] += var54.hueMultiplier;
							var10002 = class384.field4473[var12]++;
						}
					}

					var14 = var11 - 5;
					if (var14 >= 0 && var14 < 104) {
						long var55 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var17 = (int)var55;
						var18 = Tiles.Tiles_underlays[var2][var14][var12] & var17;
						if (var18 > 0) {
							FloorUnderlayDefinition var57 = class411.method7472(var18 - 1);
							var10000 = World.Tiles_hue;
							var10000[var12] -= var57.hue;
							var10000 = WorldMapLabelSize.Tiles_saturation;
							var10000[var12] -= var57.saturation;
							var10000 = class539.Tiles_lightness;
							var10000[var12] -= var57.lightness;
							var10000 = Tiles.Tiles_hueMultiplier;
							var10000[var12] -= var57.hueMultiplier;
							var10002 = class384.field4473[var12]--;
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
							var12 += World.Tiles_hue[var18];
							var13 += WorldMapLabelSize.Tiles_saturation[var18];
							var14 += class539.Tiles_lightness[var18];
							var15 += Tiles.Tiles_hueMultiplier[var18];
							var16 += class384.field4473[var18];
						}

						var19 = var17 - 5;
						if (var19 >= 0 && var19 < 104) {
							var12 -= World.Tiles_hue[var19];
							var13 -= WorldMapLabelSize.Tiles_saturation[var19];
							var14 -= class539.Tiles_lightness[var19];
							var15 -= Tiles.Tiles_hueMultiplier[var19];
							var16 -= class384.field4473[var19];
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) {
							if (var2 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var2;
							}

							long var20 = (long)Math.pow(2.0D, 15.0D) - 1L;
							int var22 = (int)var20;
							int var23 = Tiles.Tiles_underlays[var2][var11][var17] & var22;
							int var24 = AccessFile.Tiles_overlays[var2][var11][var17] & var22;
							if (var23 > 0 || var24 > 0) {
								int var25 = Tiles.Tiles_heights[var2][var11][var17];
								int var26 = Tiles.Tiles_heights[var2][var11 + 1][var17];
								int var27 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1];
								int var28 = Tiles.Tiles_heights[var2][var11][var17 + 1];
								int var29 = class306.field3195[var11][var17];
								int var30 = class306.field3195[var11 + 1][var17];
								int var31 = class306.field3195[var11 + 1][var17 + 1];
								int var32 = class306.field3195[var11][var17 + 1];
								int var33 = -1;
								int var34 = -1;
								int var35;
								int var36;
								int var37;
								if (var23 > 0) {
									var35 = var12 * 256 / var15;
									var36 = var13 / var16;
									var37 = var14 / var16;
									var33 = class137.method3081(var35, var36, var37);
									var35 = var35 + Tiles.rndHue & 255;
									var37 += Tiles.rndLightness;
									if (var37 < 0) {
										var37 = 0;
									} else if (var37 > 255) {
										var37 = 255;
									}

									var34 = class137.method3081(var35, var36, var37);
								}

								FloorOverlayDefinition var38;
								if (var2 > 0) {
									boolean var65 = true;
									if (var23 == 0 && Tiles.Tiles_shapes[var2][var11][var17] != 0) {
										var65 = false;
									}

									if (var24 > 0) {
										var37 = var24 - 1;
										var38 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var37);
										FloorOverlayDefinition var49;
										if (var38 != null) {
											var49 = var38;
										} else {
											byte[] var39 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var37);
											var38 = new FloorOverlayDefinition();
											if (var39 != null) {
												var38.decode(new Buffer(var39), var37);
											}

											var38.postDecode();
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var38, (long)var37);
											var49 = var38;
										}

										if (!var49.hideUnderlay) {
											var65 = false;
										}
									}

									if (var65 && var26 == var25 && var27 == var25 && var25 == var28) {
										var10000 = class168.field1833[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var35 = 0;
								if (var34 != -1) {
									var35 = Rasterizer3D.Rasterizer3D_colorPalette[WorldMapAreaData.method5783(var34, 96)];
								}

								if (var24 == 0) {
									var0.addTile(var2, var11, var17, 0, 0, -1, var25, var26, var27, var28, WorldMapAreaData.method5783(var33, var29), WorldMapAreaData.method5783(var33, var30), WorldMapAreaData.method5783(var33, var31), WorldMapAreaData.method5783(var33, var32), 0, 0, 0, 0, var35, 0);
								} else {
									var36 = Tiles.Tiles_shapes[var2][var11][var17] + 1;
									byte var66 = Tiles.field1028[var2][var11][var17];
									int var50 = var24 - 1;
									FloorOverlayDefinition var40 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var50);
									if (var40 != null) {
										var38 = var40;
									} else {
										byte[] var41 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var50);
										var40 = new FloorOverlayDefinition();
										if (var41 != null) {
											var40.decode(new Buffer(var41), var50);
										}

										var40.postDecode();
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var40, (long)var50);
										var38 = var40;
									}

									int var51 = var38.texture;
									int var42;
									int var43;
									int var44;
									int var45;
									if (var51 >= 0) {
										var43 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var51);
										var42 = -1;
									} else if (var38.primaryRgb == 16711935) {
										var42 = -2;
										var51 = -1;
										var43 = -2;
									} else {
										var42 = class137.method3081(var38.hue, var38.saturation, var38.lightness);
										var44 = var38.hue + Tiles.rndHue & 255;
										var45 = var38.lightness + Tiles.rndLightness;
										if (var45 < 0) {
											var45 = 0;
										} else if (var45 > 255) {
											var45 = 255;
										}

										var43 = class137.method3081(var44, var38.saturation, var45);
									}

									var44 = 0;
									if (var43 != -2) {
										var44 = Rasterizer3D.Rasterizer3D_colorPalette[SoundSystem.method817(var43, 96)];
									}

									if (var38.secondaryRgb != -1) {
										var45 = var38.secondaryHue + Tiles.rndHue & 255;
										int var46 = var38.secondaryLightness + Tiles.rndLightness;
										if (var46 < 0) {
											var46 = 0;
										} else if (var46 > 255) {
											var46 = 255;
										}

										var43 = class137.method3081(var45, var38.secondarySaturation, var46);
										var44 = Rasterizer3D.Rasterizer3D_colorPalette[SoundSystem.method817(var43, 96)];
									}

									var0.addTile(var2, var11, var17, var36, var66, var51, var25, var26, var27, var28, WorldMapAreaData.method5783(var33, var29), WorldMapAreaData.method5783(var33, var30), WorldMapAreaData.method5783(var33, var31), WorldMapAreaData.method5783(var33, var32), SoundSystem.method817(var42, var29), SoundSystem.method817(var42, var30), SoundSystem.method817(var42, var31), SoundSystem.method817(var42, var32), var35, var44);
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					if ((Tiles.Tiles_renderFlags[var2][var12][var11] & 8) != 0) {
						var17 = 0;
					} else if (var2 > 0 && (Tiles.Tiles_renderFlags[1][var12][var11] & 2) != 0) {
						var17 = var2 - 1;
					} else {
						var17 = var2;
					}

					var0.setTileMinPlane(var2, var12, var11, var17);
				}
			}

			Tiles.Tiles_underlays[var2] = null;
			AccessFile.Tiles_overlays[var2] = null;
			Tiles.Tiles_shapes[var2] = null;
			Tiles.field1028[var2] = null;
			TextureProvider.Tiles_underlays2[var2] = null;
		}

		var0.method4824(-50, -10, -50);

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

			for (int var61 = 0; var61 <= var5; ++var61) {
				for (int var62 = 0; var62 <= 104; ++var62) {
					for (int var63 = 0; var63 <= 104; ++var63) {
						short var64;
						if ((class168.field1833[var61][var63][var62] & var2) != 0) {
							var9 = var62;
							var10 = var62;
							var11 = var61;

							for (var12 = var61; var9 > 0 && (class168.field1833[var61][var63][var9 - 1] & var2) != 0; --var9) {
							}

							while (var10 < 104 && (class168.field1833[var61][var63][var10 + 1] & var2) != 0) {
								++var10;
							}

							label457:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class168.field1833[var11 - 1][var63][var13] & var2) == 0) {
										break label457;
									}
								}

								--var11;
							}

							label446:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class168.field1833[var12 + 1][var63][var13] & var2) == 0) {
										break label446;
									}
								}

								++var12;
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var64 = 240;
								var15 = Tiles.Tiles_heights[var12][var63][var9] - var64;
								var16 = Tiles.Tiles_heights[var11][var63][var9];
								Scene.Scene_addOccluder(var5, 1, var63 * 128, var63 * 128, var9 * 128, var10 * 128 + 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = class168.field1833[var17][var63];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((class168.field1833[var61][var63][var62] & var3) != 0) {
							var9 = var63;
							var10 = var63;
							var11 = var61;

							for (var12 = var61; var9 > 0 && (class168.field1833[var61][var9 - 1][var62] & var3) != 0; --var9) {
							}

							while (var10 < 104 && (class168.field1833[var61][var10 + 1][var62] & var3) != 0) {
								++var10;
							}

							label510:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class168.field1833[var11 - 1][var13][var62] & var3) == 0) {
										break label510;
									}
								}

								--var11;
							}

							label499:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class168.field1833[var12 + 1][var13][var62] & var3) == 0) {
										break label499;
									}
								}

								++var12;
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var64 = 240;
								var15 = Tiles.Tiles_heights[var12][var9][var62] - var64;
								var16 = Tiles.Tiles_heights[var11][var9][var62];
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var62 * 128, var62 * 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = class168.field1833[var17][var18];
										var10000[var62] &= ~var3;
									}
								}
							}
						}

						if ((class168.field1833[var61][var63][var62] & var4) != 0) {
							var9 = var63;
							var10 = var63;
							var11 = var62;

							for (var12 = var62; var11 > 0 && (class168.field1833[var61][var63][var11 - 1] & var4) != 0; --var11) {
							}

							while (var12 < 104 && (class168.field1833[var61][var63][var12 + 1] & var4) != 0) {
								++var12;
							}

							label563:
							while (var9 > 0) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((class168.field1833[var61][var9 - 1][var13] & var4) == 0) {
										break label563;
									}
								}

								--var9;
							}

							label552:
							while (var10 < 104) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((class168.field1833[var61][var10 + 1][var13] & var4) == 0) {
										break label552;
									}
								}

								++var10;
							}

							if ((var12 - var11 + 1) * (var10 - var9 + 1) >= 4) {
								var13 = Tiles.Tiles_heights[var61][var9][var11];
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13);

								for (var14 = var9; var14 <= var10; ++var14) {
									for (var15 = var11; var15 <= var12; ++var15) {
										var10000 = class168.field1833[var61][var14];
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

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "610118591"
	)
	static int method92(int var0, int var1) {
		int var2 = var1 - 334;
		if (var2 < 0) {
			var2 = 0;
		} else if (var2 > 100) {
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight;
		return var0 * var3 / 256;
	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1344105936"
	)
	static boolean method101() {
		return NPC.clientPreferences.method2479() >= Client.field513;
	}
}
