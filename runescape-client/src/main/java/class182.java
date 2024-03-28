import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("hq")
public class class182 {
	@ObfuscatedName("ah")
	String field1928;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -587024587
	)
	int field1929;
	@ObfuscatedName("at")
	ArrayList field1934;
	@ObfuscatedName("an")
	ArrayList field1931;
	@ObfuscatedName("ao")
	ArrayList field1930;
	@ObfuscatedName("ab")
	String field1932;
	@ObfuscatedName("aw")
	float[] field1927;
	@ObfuscatedName("ad")
	Map field1935;
	@ObfuscatedName("al")
	Map field1936;

	class182() {
		this.field1929 = 0;
		this.field1934 = new ArrayList();
		this.field1931 = new ArrayList();
		this.field1930 = new ArrayList();
		this.field1932 = null;
		this.field1927 = new float[4];
		this.field1935 = new HashMap();
		this.field1936 = new HashMap();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-991755602"
	)
	String method3597() {
		return this.field1928;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1668433026"
	)
	int method3598() {
		return this.field1929;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1140566683"
	)
	void method3601() {
		this.field1932 = null;
		this.field1927[0] = 0.0F;
		this.field1927[1] = 0.0F;
		this.field1927[2] = 1.0F;
		this.field1927[3] = 1.0F;
		this.field1934.clear();
		this.field1931.clear();
		this.field1930.clear();
		this.field1935.clear();
		this.field1936.clear();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILea;S)Z",
		garbageValue = "-9790"
	)
	boolean method3632(JSONObject var1, int var2, UrlRequester var3) {
		JSONObject var4 = var1;
		if (var2 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var13) {
				this.method3601();
				return false;
			}

			try {
				this.method3634(var4.getJSONArray("images"), var3);
			} catch (Exception var12) {
				this.field1931.clear();
			}

			try {
				this.method3603(var4.getJSONArray("labels"));
			} catch (Exception var11) {
				this.field1930.clear();
			}
		} else {
			try {
				this.method3602(var4.getJSONObject("image"), var3);
			} catch (Exception var10) {
				this.field1931.clear();
			}

			try {
				this.method3610(var4.getJSONObject("label"));
			} catch (Exception var9) {
				this.field1930.clear();
			}
		}

		try {
			this.method3622(var4.getJSONObject("behaviour"));
		} catch (Exception var8) {
			this.field1932 = null;
			this.field1927[0] = 0.0F;
			this.field1927[1] = 0.0F;
			this.field1927[2] = 1.0F;
			this.field1927[3] = 1.0F;
			this.field1934.clear();
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta");
			if (var5 != null) {
				this.method3605(var4.getJSONObject("meta"));
			}
		} catch (Exception var7) {
			this.field1935.clear();
			this.field1936.clear();
		}

		if (var2 == 2) {
			try {
				this.field1928 = var4.getString("id");
				this.field1929 = Integer.parseInt(var4.getString("priority"));
			} catch (Exception var6) {
			}
		}

		return true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lea;B)V",
		garbageValue = "1"
	)
	void method3634(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class172 var5 = new class172(this);
					var5.field1859 = var2.request(new URL(var4.getString("src")));
					var5.field1857 = class143.method3147(var4, "placement");
					this.field1931.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Lea;I)V",
		garbageValue = "-1108962694"
	)
	void method3602(JSONObject var1, UrlRequester var2) throws JSONException {
		try {
			class172 var3 = new class172(this);
			var3.field1859 = var2.request(new URL(var1.getString("src")));
			var3.field1857 = class143.method3147(var1, "placement");
			this.field1931.add(var3);
		} catch (MalformedURLException var4) {
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "-2078330414"
	)
	void method3603(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class183 var4 = new class183(this);
				var4.field1940 = var3.getString("text");
				String var7 = var3.getString("align_x");
				byte var6;
				if (var7.equals("centre")) {
					var6 = 1;
				} else if (!var7.equals("bottom") && !var7.equals("right")) {
					var6 = 0;
				} else {
					var6 = 2;
				}

				var4.field1941 = var6;
				String var10 = var3.getString("align_y");
				byte var9;
				if (var10.equals("centre")) {
					var9 = 1;
				} else if (!var10.equals("bottom") && !var10.equals("right")) {
					var9 = 0;
				} else {
					var9 = 2;
				}

				var4.field1942 = var9;
				var4.field1943 = var3.getInt("font");
				var4.field1938 = class143.method3147(var3, "placement");
				this.field1930.add(var4);
			}

		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-95861413"
	)
	void method3610(JSONObject var1) throws JSONException {
		class183 var2 = new class183(this);
		var2.field1940 = var1.optString("text");
		String var5 = var1.optString("align_x");
		byte var4;
		if (var5.equals("centre")) {
			var4 = 1;
		} else if (!var5.equals("bottom") && !var5.equals("right")) {
			var4 = 0;
		} else {
			var4 = 2;
		}

		var2.field1941 = var4;
		String var8 = var1.optString("align_y");
		byte var7;
		if (var8.equals("centre")) {
			var7 = 1;
		} else if (!var8.equals("bottom") && !var8.equals("right")) {
			var7 = 0;
		} else {
			var7 = 2;
		}

		var2.field1942 = var7;
		var2.field1943 = var1.optInt("font");
		var2.field1938 = class143.method3147(var1, "placement");
		this.field1930.add(var2);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-777241744"
	)
	void method3622(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field1927 = class143.method3147(var1, "clickbounds");
			this.field1932 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field1934.add(new class170(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field1934.add(new class170(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field1934.add(new class170(this, var2[var3], 0));
							} else {
								this.field1934.add(new class179(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "-8"
	)
	void method3605(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.optInt(var2[var3]);
				this.field1935.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.optString(var2[var3]);
					if (var5.equals("true")) {
						this.field1935.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field1935.put(var2[var3], 0);
					} else {
						this.field1936.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Ldi;III)V",
		garbageValue = "334529676"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = DevicePcmPlayerProvider.SequenceDefinition_get(var1).restartMode;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1248 = 0;
			}

			if (var3 == 2) {
				var0.field1248 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || DevicePcmPlayerProvider.SequenceDefinition_get(var1).field2393 >= DevicePcmPlayerProvider.SequenceDefinition_get(var0.sequence).field2393) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1248 = 0;
			var0.field1274 = var0.pathLength;
		}

	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Lde;IIIIIB)V",
		garbageValue = "-123"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) {
			if (var0 instanceof NPC) {
				NPCComposition var6 = ((NPC)var0).definition;
				if (var6.transforms != null) {
					var6 = var6.transform();
				}

				if (var6 == null) {
					return;
				}
			}

			int var75 = Players.Players_count;
			int[] var7 = Players.Players_indices;
			boolean var8 = var1 < var75;
			int var9 = -2;
			if (var0.overheadText != null && (!var8 || !var0.field1222 && (Client.publicChatMode == 4 || !var0.field1252 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) {
				Varcs.method2753(var0, var0.defaultHeight);
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
					Client.overheadTextXOffsets[Client.overheadTextCount] = DevicePcmPlayerProvider.fontBold12.stringWidth(var0.overheadText) / 2;
					Client.overheadTextAscents[Client.overheadTextCount] = DevicePcmPlayerProvider.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY - var9;
					Client.overheadTextColors[Client.overheadTextCount] = var0.field1224;
					Client.overheadTextEffects[Client.overheadTextCount] = var0.field1225;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining;
					Client.field779[Client.overheadTextCount] = var0.field1262;
					Client.overheadText[Client.overheadTextCount] = var0.overheadText;
					++Client.overheadTextCount;
					var9 += 12;
				}
			}

			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method7356()) {
				Varcs.method2753(var0, var0.defaultHeight + 15);

				for (HealthBar var10 = (HealthBar)var0.healthBars.last(); var10 != null; var10 = (HealthBar)var0.healthBars.previous()) {
					HealthBarUpdate var11 = var10.get(Client.cycle);
					if (var11 == null) {
						if (var10.isEmpty()) {
							var10.remove();
						}
					} else {
						HealthBarDefinition var12 = var10.definition;
						SpritePixels var79 = var12.getBackSprite();
						SpritePixels var83 = var12.getFrontSprite();
						int var84 = 0;
						if (var79 != null && var83 != null) {
							if (var12.widthPadding * 2 < var83.subWidth) {
								var84 = var12.widthPadding;
							}

							var15 = var83.subWidth - var84 * 2;
						} else {
							var15 = var12.width;
						}

						int var81 = 255;
						boolean var85 = true;
						int var86 = Client.cycle - var11.cycle;
						int var87 = var15 * var11.health2 / var12.width;
						int var88;
						int var98;
						if (var11.cycleOffset > var86) {
							var88 = var12.field2049 == 0 ? 0 : var12.field2049 * (var86 / var12.field2049);
							var22 = var15 * var11.health / var12.width;
							var98 = var88 * (var87 - var22) / var11.cycleOffset + var22;
						} else {
							var98 = var87;
							var88 = var11.cycleOffset + var12.int5 - var86;
							if (var12.int3 >= 0) {
								var81 = (var88 << 8) / (var12.int5 - var12.int3);
							}
						}

						if (var11.health2 > 0 && var98 < 1) {
							var98 = 1;
						}

						if (var79 != null && var83 != null) {
							if (var15 == var98) {
								var98 += var84 * 2;
							} else {
								var98 += var84;
							}

							var88 = var79.subHeight;
							var9 += var88;
							var22 = var2 + Client.viewportTempX - (var15 >> 1);
							var23 = var3 + Client.viewportTempY - var9;
							var22 -= var84;
							if (var81 >= 0 && var81 < 255) {
								var79.drawTransAt(var22, var23, var81);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var98, var88 + var23);
								var83.drawTransAt(var22, var23, var81);
							} else {
								var79.drawTransBgAt(var22, var23);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var98, var23 + var88);
								var83.drawTransBgAt(var22, var23);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
							var9 += 2;
						} else {
							var9 += 5;
							if (Client.viewportTempX > -1) {
								var88 = var2 + Client.viewportTempX - (var15 >> 1);
								var22 = var3 + Client.viewportTempY - var9;
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var22, var98, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var88 + var98, var22, var15 - var98, 5, 16711680);
							}

							var9 += 2;
						}
					}
				}
			}

			if (var9 == -2) {
				var9 += 7;
			}

			Player var89;
			if (var8 && var0.playerCycle == Client.cycle && class474.method8495((Player)var0)) {
				var89 = (Player)var0;
				if (var8) {
					Varcs.method2753(var0, var0.defaultHeight + 15);
					AbstractFont var90 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
					var9 += 4;
					var90.drawCentered(var89.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var9, 16777215, 0);
					var9 += 18;
				}
			}

			if (var8) {
				var89 = (Player)var0;
				if (var89.isHidden) {
					return;
				}

				if (var89.headIconPk != -1 || var89.headIconPrayer != -1) {
					Varcs.method2753(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						if (var89.headIconPk != -1) {
							var9 += 25;
							class91.headIconPkSprites[var89.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
						}

						if (var89.headIconPrayer != -1) {
							var9 += 25;
							class334.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) {
					Varcs.method2753(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						var9 += class137.headIconHintSprites[1].subHeight;
						class137.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
					}
				}
			} else {
				NPC var91 = (NPC)var0;
				int[] var92 = var91.method2612();
				short[] var93 = var91.method2589();
				if (var93 != null && var92 != null) {
					for (int var13 = 0; var13 < var93.length; ++var13) {
						if (var93[var13] >= 0 && var92[var13] >= 0) {
							long var14 = (long)var92[var13] << 8 | (long)var93[var13];
							SpritePixels var16 = (SpritePixels)Client.field597.method8015(var14);
							if (var16 == null) {
								SpritePixels[] var17 = Player.method2379(GameEngine.archive8, var92[var13], 0);
								if (var17 != null && var93[var13] < var17.length) {
									var16 = var17[var93[var13]];
									Client.field597.method8008(var14, var16);
								}
							}

							if (var16 != null) {
								Varcs.method2753(var0, var0.defaultHeight + 15);
								if (Client.viewportTempX > -1) {
									var16.drawTransBgAt(var2 + Client.viewportTempX - (var16.subWidth >> 1), Client.viewportTempY + (var3 - var16.subHeight) - 4);
								}
							}
						}
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
					Varcs.method2753(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						class137.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var76 = 0; var76 < 4; ++var76) {
				int var77 = var0.hitSplatCycles[var76];
				int var78 = var0.hitSplatTypes[var76];
				HitSplatDefinition var96 = null;
				int var80 = 0;
				if (var78 >= 0) {
					if (var77 <= Client.cycle) {
						continue;
					}

					var96 = class193.method3723(var0.hitSplatTypes[var76]);
					var80 = var96.field2227;
					if (var96 != null && var96.transforms != null) {
						var96 = var96.transform();
						if (var96 == null) {
							var0.hitSplatCycles[var76] = -1;
							continue;
						}
					}
				} else if (var77 < 0) {
					continue;
				}

				var15 = var0.hitSplatTypes2[var76];
				HitSplatDefinition var94 = null;
				if (var15 >= 0) {
					var94 = class193.method3723(var15);
					if (var94 != null && var94.transforms != null) {
						var94 = var94.transform();
					}
				}

				if (var77 - var80 <= Client.cycle) {
					if (var96 == null) {
						var0.hitSplatCycles[var76] = -1;
					} else {
						Varcs.method2753(var0, var0.defaultHeight / 2);
						if (Client.viewportTempX > -1) {
							boolean var97 = true;
							if (var76 == 1) {
								Client.viewportTempY -= 20;
							}

							if (var76 == 2) {
								Client.viewportTempX -= 15;
								Client.viewportTempY -= 10;
							}

							if (var76 == 3) {
								Client.viewportTempX += 15;
								Client.viewportTempY -= 10;
							}

							SpritePixels var18 = null;
							SpritePixels var19 = null;
							SpritePixels var20 = null;
							SpritePixels var21 = null;
							var22 = 0;
							var23 = 0;
							int var24 = 0;
							int var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							SpritePixels var30 = null;
							SpritePixels var31 = null;
							SpritePixels var32 = null;
							SpritePixels var33 = null;
							int var34 = 0;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							var18 = var96.method4048();
							int var43;
							if (var18 != null) {
								var22 = var18.subWidth;
								var43 = var18.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var26 = var18.xOffset;
							}

							var19 = var96.method4049();
							if (var19 != null) {
								var23 = var19.subWidth;
								var43 = var19.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var27 = var19.xOffset;
							}

							var20 = var96.method4050();
							if (var20 != null) {
								var24 = var20.subWidth;
								var43 = var20.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var28 = var20.xOffset;
							}

							var21 = var96.method4062();
							if (var21 != null) {
								var25 = var21.subWidth;
								var43 = var21.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var29 = var21.xOffset;
							}

							if (var94 != null) {
								var30 = var94.method4048();
								if (var30 != null) {
									var34 = var30.subWidth;
									var43 = var30.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var38 = var30.xOffset;
								}

								var31 = var94.method4049();
								if (var31 != null) {
									var35 = var31.subWidth;
									var43 = var31.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var39 = var31.xOffset;
								}

								var32 = var94.method4050();
								if (var32 != null) {
									var36 = var32.subWidth;
									var43 = var32.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var40 = var32.xOffset;
								}

								var33 = var94.method4062();
								if (var33 != null) {
									var37 = var33.subWidth;
									var43 = var33.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var41 = var33.xOffset;
								}
							}

							Font var82 = var96.getFont();
							if (var82 == null) {
								var82 = DevicePcmPlayerProvider.fontPlain11;
							}

							Font var44;
							if (var94 != null) {
								var44 = var94.getFont();
								if (var44 == null) {
									var44 = DevicePcmPlayerProvider.fontPlain11;
								}
							} else {
								var44 = DevicePcmPlayerProvider.fontPlain11;
							}

							String var45 = null;
							String var46 = null;
							boolean var47 = false;
							int var48 = 0;
							var45 = var96.getString(var0.hitSplatValues[var76]);
							int var95 = var82.stringWidth(var45);
							if (var94 != null) {
								var46 = var94.getString(var0.hitSplatValues2[var76]);
								var48 = var44.stringWidth(var46);
							}

							int var49 = 0;
							int var50 = 0;
							if (var23 > 0) {
								if (var20 == null && var21 == null) {
									var49 = 1;
								} else {
									var49 = var95 / var23 + 1;
								}
							}

							if (var94 != null && var35 > 0) {
								if (var32 == null && var33 == null) {
									var50 = 1;
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0;
							int var52 = var51;
							if (var22 > 0) {
								var51 += var22;
							}

							var51 += 2;
							int var53 = var51;
							if (var24 > 0) {
								var51 += var24;
							}

							int var54 = var51;
							int var55 = var51;
							int var56;
							if (var23 > 0) {
								var56 = var49 * var23;
								var51 += var56;
								var55 += (var56 - var95) / 2;
							} else {
								var51 += var95;
							}

							var56 = var51;
							if (var25 > 0) {
								var51 += var25;
							}

							int var57 = 0;
							int var58 = 0;
							int var59 = 0;
							int var60 = 0;
							int var61 = 0;
							int var62;
							if (var94 != null) {
								var51 += 2;
								var57 = var51;
								if (var34 > 0) {
									var51 += var34;
								}

								var51 += 2;
								var58 = var51;
								if (var36 > 0) {
									var51 += var36;
								}

								var59 = var51;
								var61 = var51;
								if (var35 > 0) {
									var62 = var35 * var50;
									var51 += var62;
									var61 += (var62 - var48) / 2;
								} else {
									var51 += var48;
								}

								var60 = var51;
								if (var37 > 0) {
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var76] - Client.cycle;
							int var63 = var96.field2232 - var62 * var96.field2232 / var96.field2227;
							int var64 = var62 * var96.field2233 / var96.field2227 + -var96.field2233;
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1));
							int var66 = var64 + (var3 + Client.viewportTempY - 12);
							int var67 = var66;
							int var68 = var42 + var66;
							int var69 = var66 + var96.field2237 + 15;
							int var70 = var69 - var82.maxAscent;
							int var71 = var69 + var82.maxDescent;
							if (var70 < var66) {
								var67 = var70;
							}

							if (var71 > var68) {
								var68 = var71;
							}

							int var72 = 0;
							int var73;
							int var74;
							if (var94 != null) {
								var72 = var66 + var94.field2237 + 15;
								var73 = var72 - var44.maxAscent;
								var74 = var72 + var44.maxDescent;
								if (var73 < var67) {
									;
								}

								if (var74 > var68) {
									;
								}
							}

							var73 = 255;
							if (var96.field2234 >= 0) {
								var73 = (var62 << 8) / (var96.field2227 - var96.field2234);
							}

							if (var73 >= 0 && var73 < 255) {
								if (var18 != null) {
									var18.drawTransAt(var65 + var52 - var26, var66, var73);
								}

								if (var20 != null) {
									var20.drawTransAt(var65 + var53 - var28, var66, var73);
								}

								if (var19 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var19.drawTransAt(var23 * var74 + (var65 + var54 - var27), var66, var73);
									}
								}

								if (var21 != null) {
									var21.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var82.drawAlpha(var45, var65 + var55, var69, var96.textColor, 0, var73);
								if (var94 != null) {
									if (var30 != null) {
										var30.drawTransAt(var65 + var57 - var38, var66, var73);
									}

									if (var32 != null) {
										var32.drawTransAt(var58 + var65 - var40, var66, var73);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransAt(var74 * var35 + (var59 + var65 - var39), var66, var73);
										}
									}

									if (var33 != null) {
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var65 + var61, var72, var94.textColor, 0, var73);
								}
							} else {
								if (var18 != null) {
									var18.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) {
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var19 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var19.drawTransBgAt(var23 * var74 + (var54 + var65 - var27), var66);
									}
								}

								if (var21 != null) {
									var21.drawTransBgAt(var65 + var56 - var29, var66);
								}

								var82.draw(var45, var55 + var65, var69, var96.textColor | -16777216, 0);
								if (var94 != null) {
									if (var30 != null) {
										var30.drawTransBgAt(var65 + var57 - var38, var66);
									}

									if (var32 != null) {
										var32.drawTransBgAt(var58 + var65 - var40, var66);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransBgAt(var74 * var35 + (var65 + var59 - var39), var66);
										}
									}

									if (var33 != null) {
										var33.drawTransBgAt(var60 + var65 - var41, var66);
									}

									var44.draw(var46, var65 + var61, var72, var94.textColor | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}
}
