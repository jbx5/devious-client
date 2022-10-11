import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
public class class19 {
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("c")
	Future field106;
	@ObfuscatedName("p")
	String field105;

	class19(Future var1) {
		this.field106 = var1; // L: 10
	} // L: 11

	class19(String var1) {
		this.method297(var1); // L: 14
	} // L: 15

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "465411998"
	)
	void method297(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field105 = var1;
		if (this.field106 != null) {
			this.field106.cancel(true);
			this.field106 = null;
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-898803734"
	)
	public final String method288() {
		return this.field105;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1981525438"
	)
	public boolean method289() {
		return this.field105 != null || this.field106 == null;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "811022608"
	)
	public final boolean method291() {
		return this.method289() ? true : this.field106.isDone();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Ly;",
		garbageValue = "-989641812"
	)
	public final class21 method286() {
		if (this.method289()) {
			return new class21(this.field105);
		} else if (!this.method291()) {
			return null;
		} else {
			try {
				return (class21)this.field106.get();
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3);
				this.method297(var2);
				return new class21(var2);
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IILgb;Lgj;I)Z",
		garbageValue = "-1864357757"
	)
	public static final boolean method287(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0; // L: 19
		int var5 = var1; // L: 20
		byte var6 = 64; // L: 21
		byte var7 = 64; // L: 22
		int var8 = var0 - var6; // L: 23
		int var9 = var1 - var7; // L: 24
		class194.directions[var6][var7] = 99; // L: 25
		class194.distances[var6][var7] = 0; // L: 26
		byte var10 = 0; // L: 27
		int var11 = 0; // L: 28
		class194.bufferX[var10] = var0; // L: 29
		byte var10001 = var10;
		int var18 = var10 + 1;
		class194.bufferY[var10001] = var1; // L: 30
		int[][] var12 = var3.flags; // L: 31

		while (var18 != var11) { // L: 34
			var4 = class194.bufferX[var11]; // L: 35
			var5 = class194.bufferY[var11]; // L: 36
			var11 = var11 + 1 & 4095; // L: 37
			int var16 = var4 - var8; // L: 38
			int var17 = var5 - var9; // L: 39
			int var13 = var4 - var3.xInset; // L: 40
			int var14 = var5 - var3.yInset; // L: 41
			if (var2.hasArrived(1, var4, var5, var3)) { // L: 42
				Bounds.field4422 = var4; // L: 43
				class347.field4205 = var5; // L: 44
				return true; // L: 45
			}

			int var15 = class194.distances[var16][var17] + 1; // L: 47
			if (var16 > 0 && class194.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136776) == 0) { // L: 48
				class194.bufferX[var18] = var4 - 1; // L: 49
				class194.bufferY[var18] = var5; // L: 50
				var18 = var18 + 1 & 4095; // L: 51
				class194.directions[var16 - 1][var17] = 2; // L: 52
				class194.distances[var16 - 1][var17] = var15; // L: 53
			}

			if (var16 < 127 && class194.directions[var16 + 1][var17] == 0 && (var12[var13 + 1][var14] & 19136896) == 0) { // L: 55
				class194.bufferX[var18] = var4 + 1; // L: 56
				class194.bufferY[var18] = var5; // L: 57
				var18 = var18 + 1 & 4095; // L: 58
				class194.directions[var16 + 1][var17] = 8; // L: 59
				class194.distances[var16 + 1][var17] = var15; // L: 60
			}

			if (var17 > 0 && class194.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 62
				class194.bufferX[var18] = var4; // L: 63
				class194.bufferY[var18] = var5 - 1; // L: 64
				var18 = var18 + 1 & 4095; // L: 65
				class194.directions[var16][var17 - 1] = 1; // L: 66
				class194.distances[var16][var17 - 1] = var15; // L: 67
			}

			if (var17 < 127 && class194.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 69
				class194.bufferX[var18] = var4; // L: 70
				class194.bufferY[var18] = var5 + 1; // L: 71
				var18 = var18 + 1 & 4095; // L: 72
				class194.directions[var16][var17 + 1] = 4; // L: 73
				class194.distances[var16][var17 + 1] = var15; // L: 74
			}

			if (var16 > 0 && var17 > 0 && class194.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 76
				class194.bufferX[var18] = var4 - 1; // L: 77
				class194.bufferY[var18] = var5 - 1; // L: 78
				var18 = var18 + 1 & 4095; // L: 79
				class194.directions[var16 - 1][var17 - 1] = 3; // L: 80
				class194.distances[var16 - 1][var17 - 1] = var15; // L: 81
			}

			if (var16 < 127 && var17 > 0 && class194.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 83
				class194.bufferX[var18] = var4 + 1; // L: 84
				class194.bufferY[var18] = var5 - 1; // L: 85
				var18 = var18 + 1 & 4095; // L: 86
				class194.directions[var16 + 1][var17 - 1] = 9; // L: 87
				class194.distances[var16 + 1][var17 - 1] = var15; // L: 88
			}

			if (var16 > 0 && var17 < 127 && class194.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 90
				class194.bufferX[var18] = var4 - 1; // L: 91
				class194.bufferY[var18] = var5 + 1; // L: 92
				var18 = var18 + 1 & 4095; // L: 93
				class194.directions[var16 - 1][var17 + 1] = 6; // L: 94
				class194.distances[var16 - 1][var17 + 1] = var15; // L: 95
			}

			if (var16 < 127 && var17 < 127 && class194.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 1] & 19136992) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 97
				class194.bufferX[var18] = var4 + 1; // L: 98
				class194.bufferY[var18] = var5 + 1; // L: 99
				var18 = var18 + 1 & 4095; // L: 100
				class194.directions[var16 + 1][var17 + 1] = 12; // L: 101
				class194.distances[var16 + 1][var17 + 1] = var15; // L: 102
			}
		}

		Bounds.field4422 = var4; // L: 105
		class347.field4205 = var5; // L: 106
		return false; // L: 107
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(Lce;IIIIII)V",
		garbageValue = "1306310032"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 4818
			if (var0 instanceof NPC) { // L: 4819
				NPCComposition var6 = ((NPC)var0).definition; // L: 4820
				if (var6.transforms != null) { // L: 4821
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 4822
					return;
				}
			}

			int var75 = Players.Players_count; // L: 4824
			int[] var7 = Players.Players_indices; // L: 4825
			byte var8 = 0; // L: 4826
			if (var1 < var75 && var0.playerCycle == Client.cycle && WorldMapEvent.method5256((Player)var0)) { // L: 4827
				Player var9 = (Player)var0; // L: 4828
				if (var1 < var75) { // L: 4829
					class124.method2956(var0, var0.defaultHeight + 15); // L: 4830
					AbstractFont var10 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12); // L: 4831
					byte var11 = 9; // L: 4832
					var10.drawCentered(var9.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var11, 16777215, 0); // L: 4833
					var8 = 18; // L: 4834
				}
			}

			int var76 = -2; // L: 4837
			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method6309()) { // L: 4838
				class124.method2956(var0, var0.defaultHeight + 15); // L: 4839

				for (HealthBar var87 = (HealthBar)var0.healthBars.last(); var87 != null; var87 = (HealthBar)var0.healthBars.previous()) { // L: 4840
					HealthBarUpdate var79 = var87.get(Client.cycle); // L: 4841
					if (var79 == null) { // L: 4842
						if (var87.isEmpty()) { // L: 4900
							var87.remove();
						}
					} else {
						HealthBarDefinition var80 = var87.definition; // L: 4843
						SpritePixels var13 = var80.getBackSprite(); // L: 4844
						SpritePixels var81 = var80.getFrontSprite(); // L: 4845
						int var82 = 0; // L: 4847
						if (var13 != null && var81 != null) { // L: 4848
							if (var80.widthPadding * 2 < var81.subWidth) { // L: 4849
								var82 = var80.widthPadding;
							}

							var15 = var81.subWidth - var82 * 2; // L: 4850
						} else {
							var15 = var80.width; // L: 4852
						}

						int var17 = 255; // L: 4853
						boolean var83 = true; // L: 4854
						int var84 = Client.cycle - var79.cycle; // L: 4855
						int var85 = var15 * var79.health2 / var80.width; // L: 4856
						int var86;
						int var94;
						if (var79.cycleOffset > var84) { // L: 4857
							var86 = var80.field1897 == 0 ? 0 : var80.field1897 * (var84 / var80.field1897); // L: 4858
							var22 = var15 * var79.health / var80.width; // L: 4859
							var94 = var86 * (var85 - var22) / var79.cycleOffset + var22; // L: 4860
						} else {
							var94 = var85; // L: 4863
							var86 = var79.cycleOffset + var80.int5 - var84; // L: 4864
							if (var80.int3 >= 0) { // L: 4865
								var17 = (var86 << 8) / (var80.int5 - var80.int3);
							}
						}

						if (var79.health2 > 0 && var94 < 1) { // L: 4867
							var94 = 1;
						}

						if (var13 != null && var81 != null) { // L: 4868
							if (var94 == var15) { // L: 4869
								var94 += var82 * 2;
							} else {
								var94 += var82; // L: 4870
							}

							var86 = var13.subHeight; // L: 4871
							var76 += var86; // L: 4872
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 4873
							var23 = var3 + Client.viewportTempY - var76; // L: 4874
							var22 -= var82; // L: 4875
							if (var17 >= 0 && var17 < 255) { // L: 4876
								var13.drawTransAt(var22, var23, var17); // L: 4877
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var94 + var22, var23 + var86); // L: 4878
								var81.drawTransAt(var22, var23, var17); // L: 4879
							} else {
								var13.drawTransBgAt(var22, var23); // L: 4882
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var94, var86 + var23); // L: 4883
								var81.drawTransBgAt(var22, var23); // L: 4884
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 4886
							var76 += 2; // L: 4887
						} else {
							var76 += 5; // L: 4890
							if (Client.viewportTempX > -1) { // L: 4891
								var86 = var2 + Client.viewportTempX - (var15 >> 1); // L: 4892
								var22 = var3 + Client.viewportTempY - var76; // L: 4893
								Rasterizer2D.Rasterizer2D_fillRectangle(var86, var22, var94, 5, 65280); // L: 4894
								Rasterizer2D.Rasterizer2D_fillRectangle(var94 + var86, var22, var15 - var94, 5, 16711680); // L: 4895
							}

							var76 += 2; // L: 4897
						}
					}
				}
			}

			if (var76 == -2) { // L: 4903
				var76 += 7;
			}

			var76 += var8; // L: 4904
			if (var1 < var75) { // L: 4905
				Player var88 = (Player)var0; // L: 4906
				if (var88.isHidden) { // L: 4907
					return;
				}

				if (var88.headIconPk != -1 || var88.headIconPrayer != -1) { // L: 4908
					class124.method2956(var0, var0.defaultHeight + 15); // L: 4909
					if (Client.viewportTempX > -1) { // L: 4910
						if (var88.headIconPk != -1) { // L: 4911
							var76 += 25; // L: 4912
							class6.headIconPkSprites[var88.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 4913
						}

						if (var88.headIconPrayer != -1) { // L: 4915
							var76 += 25; // L: 4916
							class28.headIconPrayerSprites[var88.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 4917
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) { // L: 4921
					class124.method2956(var0, var0.defaultHeight + 15); // L: 4922
					if (Client.viewportTempX > -1) { // L: 4923
						var76 += class135.headIconHintSprites[1].subHeight; // L: 4924
						class135.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var76); // L: 4925
					}
				}
			} else {
				NPCComposition var89 = ((NPC)var0).definition; // L: 4930
				if (var89.transforms != null) { // L: 4931
					var89 = var89.transform();
				}

				if (var89.headIconPrayer >= 0 && var89.headIconPrayer < class28.headIconPrayerSprites.length) { // L: 4932
					class124.method2956(var0, var0.defaultHeight + 15); // L: 4933
					if (Client.viewportTempX > -1) { // L: 4934
						class28.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30); // L: 4935
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) { // L: 4938
					class124.method2956(var0, var0.defaultHeight + 15); // L: 4939
					if (Client.viewportTempX > -1) { // L: 4940
						class135.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			if (var0.overheadText != null && (var1 >= var75 || !var0.field1150 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) { // L: 4943 4944
				class124.method2956(var0, var0.defaultHeight); // L: 4945
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) { // L: 4946
					Client.overheadTextXOffsets[Client.overheadTextCount] = class29.fontBold12.stringWidth(var0.overheadText) / 2; // L: 4947
					Client.overheadTextAscents[Client.overheadTextCount] = class29.fontBold12.ascent; // L: 4948
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX; // L: 4949
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY; // L: 4950
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor; // L: 4951
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect; // L: 4952
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining; // L: 4953
					Client.overheadText[Client.overheadTextCount] = var0.overheadText; // L: 4954
					++Client.overheadTextCount; // L: 4955
				}
			}

			for (int var77 = 0; var77 < 4; ++var77) { // L: 4959
				int var90 = var0.hitSplatCycles[var77]; // L: 4960
				int var12 = var0.hitSplatTypes[var77]; // L: 4961
				HitSplatDefinition var91 = null; // L: 4962
				int var14 = 0; // L: 4963
				if (var12 >= 0) { // L: 4964
					if (var90 <= Client.cycle) { // L: 4965
						continue;
					}

					var91 = class126.method2973(var0.hitSplatTypes[var77]); // L: 4966
					var14 = var91.field2051; // L: 4967
					if (var91 != null && var91.transforms != null) { // L: 4968
						var91 = var91.transform(); // L: 4969
						if (var91 == null) { // L: 4970
							var0.hitSplatCycles[var77] = -1; // L: 4971
							continue; // L: 4972
						}
					}
				} else if (var90 < 0) { // L: 4976
					continue;
				}

				var15 = var0.hitSplatTypes2[var77]; // L: 4977
				HitSplatDefinition var16 = null; // L: 4978
				if (var15 >= 0) { // L: 4979
					var16 = class126.method2973(var15); // L: 4980
					if (var16 != null && var16.transforms != null) { // L: 4981
						var16 = var16.transform();
					}
				}

				if (var90 - var14 <= Client.cycle) { // L: 4983
					if (var91 == null) { // L: 4984
						var0.hitSplatCycles[var77] = -1; // L: 4985
					} else {
						class124.method2956(var0, var0.defaultHeight / 2); // L: 4988
						if (Client.viewportTempX > -1) { // L: 4989
							boolean var92 = true; // L: 4990
							if (var77 == 1) { // L: 4991
								Client.viewportTempY -= 20; // L: 4992
							}

							if (var77 == 2) { // L: 4994
								Client.viewportTempX -= 15; // L: 4995
								Client.viewportTempY -= 10; // L: 4996
							}

							if (var77 == 3) { // L: 4998
								Client.viewportTempX += 15; // L: 4999
								Client.viewportTempY -= 10; // L: 5000
							}

							SpritePixels var18 = null; // L: 5002
							SpritePixels var19 = null; // L: 5003
							SpritePixels var20 = null; // L: 5004
							SpritePixels var21 = null; // L: 5005
							var22 = 0; // L: 5006
							var23 = 0; // L: 5007
							int var24 = 0; // L: 5008
							int var25 = 0; // L: 5009
							int var26 = 0; // L: 5010
							int var27 = 0; // L: 5011
							int var28 = 0; // L: 5012
							int var29 = 0; // L: 5013
							SpritePixels var30 = null; // L: 5014
							SpritePixels var31 = null; // L: 5015
							SpritePixels var32 = null; // L: 5016
							SpritePixels var33 = null; // L: 5017
							int var34 = 0; // L: 5018
							int var35 = 0; // L: 5019
							int var36 = 0; // L: 5020
							int var37 = 0; // L: 5021
							int var38 = 0; // L: 5022
							int var39 = 0; // L: 5023
							int var40 = 0; // L: 5024
							int var41 = 0; // L: 5025
							int var42 = 0; // L: 5026
							var18 = var91.method3754(); // L: 5027
							int var43;
							if (var18 != null) { // L: 5028
								var22 = var18.subWidth; // L: 5029
								var43 = var18.subHeight; // L: 5030
								if (var43 > var42) { // L: 5031
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 5032
							}

							var19 = var91.method3755(); // L: 5034
							if (var19 != null) { // L: 5035
								var23 = var19.subWidth; // L: 5036
								var43 = var19.subHeight; // L: 5037
								if (var43 > var42) { // L: 5038
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 5039
							}

							var20 = var91.method3756(); // L: 5041
							if (var20 != null) { // L: 5042
								var24 = var20.subWidth; // L: 5043
								var43 = var20.subHeight; // L: 5044
								if (var43 > var42) { // L: 5045
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5046
							}

							var21 = var91.method3757(); // L: 5048
							if (var21 != null) { // L: 5049
								var25 = var21.subWidth; // L: 5050
								var43 = var21.subHeight; // L: 5051
								if (var43 > var42) { // L: 5052
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 5053
							}

							if (var16 != null) { // L: 5055
								var30 = var16.method3754(); // L: 5056
								if (var30 != null) { // L: 5057
									var34 = var30.subWidth; // L: 5058
									var43 = var30.subHeight; // L: 5059
									if (var43 > var42) { // L: 5060
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5061
								}

								var31 = var16.method3755(); // L: 5063
								if (var31 != null) { // L: 5064
									var35 = var31.subWidth; // L: 5065
									var43 = var31.subHeight; // L: 5066
									if (var43 > var42) { // L: 5067
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5068
								}

								var32 = var16.method3756(); // L: 5070
								if (var32 != null) { // L: 5071
									var36 = var32.subWidth; // L: 5072
									var43 = var32.subHeight; // L: 5073
									if (var43 > var42) { // L: 5074
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5075
								}

								var33 = var16.method3757(); // L: 5077
								if (var33 != null) { // L: 5078
									var37 = var33.subWidth; // L: 5079
									var43 = var33.subHeight; // L: 5080
									if (var43 > var42) { // L: 5081
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5082
								}
							}

							Font var78 = var91.getFont(); // L: 5087
							if (var78 == null) { // L: 5088
								var78 = class156.fontPlain11;
							}

							Font var44;
							if (var16 != null) { // L: 5089
								var44 = var16.getFont(); // L: 5090
								if (var44 == null) { // L: 5091
									var44 = class156.fontPlain11;
								}
							} else {
								var44 = class156.fontPlain11; // L: 5093
							}

							String var45 = null; // L: 5094
							String var46 = null; // L: 5095
							boolean var47 = false; // L: 5096
							int var48 = 0; // L: 5097
							var45 = var91.getString(var0.hitSplatValues[var77]); // L: 5098
							int var93 = var78.stringWidth(var45); // L: 5099
							if (var16 != null) { // L: 5100
								var46 = var16.getString(var0.hitSplatValues2[var77]); // L: 5101
								var48 = var44.stringWidth(var46); // L: 5102
							}

							int var49 = 0; // L: 5104
							int var50 = 0; // L: 5105
							if (var23 > 0) { // L: 5106
								if (var20 == null && var21 == null) { // L: 5107
									var49 = 1; // L: 5108
								} else {
									var49 = var93 / var23 + 1;
								}
							}

							if (var16 != null && var35 > 0) { // L: 5110 5111
								if (var32 == null && var33 == null) { // L: 5112
									var50 = 1; // L: 5113
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5116
							int var52 = var51; // L: 5117
							if (var22 > 0) { // L: 5118
								var51 += var22;
							}

							var51 += 2; // L: 5119
							int var53 = var51; // L: 5120
							if (var24 > 0) { // L: 5121
								var51 += var24;
							}

							int var54 = var51; // L: 5122
							int var55 = var51; // L: 5123
							int var56;
							if (var23 > 0) { // L: 5124
								var56 = var23 * var49; // L: 5125
								var51 += var56; // L: 5126
								var55 += (var56 - var93) / 2; // L: 5127
							} else {
								var51 += var93; // L: 5130
							}

							var56 = var51; // L: 5132
							if (var25 > 0) { // L: 5133
								var51 += var25;
							}

							int var57 = 0; // L: 5134
							int var58 = 0; // L: 5135
							int var59 = 0; // L: 5136
							int var60 = 0; // L: 5137
							int var61 = 0; // L: 5138
							int var62;
							if (var16 != null) { // L: 5139
								var51 += 2; // L: 5140
								var57 = var51; // L: 5141
								if (var34 > 0) {
									var51 += var34; // L: 5142
								}

								var51 += 2; // L: 5143
								var58 = var51; // L: 5144
								if (var36 > 0) { // L: 5145
									var51 += var36;
								}

								var59 = var51; // L: 5146
								var61 = var51; // L: 5147
								if (var35 > 0) { // L: 5148
									var62 = var35 * var50; // L: 5149
									var51 += var62; // L: 5150
									var61 += (var62 - var48) / 2; // L: 5151
								} else {
									var51 += var48; // L: 5154
								}

								var60 = var51; // L: 5156
								if (var37 > 0) { // L: 5157
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var77] - Client.cycle; // L: 5159
							int var63 = var91.field2056 - var62 * var91.field2056 / var91.field2051; // L: 5160
							int var64 = var62 * var91.field2057 / var91.field2051 + -var91.field2057; // L: 5161
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5162
							int var66 = var3 + Client.viewportTempY - 12 + var64; // L: 5163
							int var67 = var66; // L: 5164
							int var68 = var42 + var66; // L: 5165
							int var69 = var66 + var91.field2053 + 15; // L: 5166
							int var70 = var69 - var78.maxAscent; // L: 5167
							int var71 = var69 + var78.maxDescent; // L: 5168
							if (var70 < var66) { // L: 5169
								var67 = var70;
							}

							if (var71 > var68) { // L: 5170
								var68 = var71;
							}

							int var72 = 0; // L: 5171
							int var73;
							int var74;
							if (var16 != null) { // L: 5172
								var72 = var66 + var16.field2053 + 15; // L: 5173
								var73 = var72 - var44.maxAscent; // L: 5174
								var74 = var72 + var44.maxDescent; // L: 5175
								if (var73 < var67) { // L: 5176
									;
								}

								if (var74 > var68) { // L: 5177
									;
								}
							}

							var73 = 255; // L: 5179
							if (var91.field2064 >= 0) { // L: 5180
								var73 = (var62 << 8) / (var91.field2051 - var91.field2064);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5181
								if (var18 != null) { // L: 5182
									var18.drawTransAt(var52 + var65 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5183
									var20.drawTransAt(var65 + var53 - var28, var66, var73);
								}

								if (var19 != null) { // L: 5184
									for (var74 = 0; var74 < var49; ++var74) { // L: 5185
										var19.drawTransAt(var23 * var74 + (var54 + var65 - var27), var66, var73); // L: 5186
									}
								}

								if (var21 != null) { // L: 5189
									var21.drawTransAt(var56 + var65 - var29, var66, var73);
								}

								var78.drawAlpha(var45, var55 + var65, var69, var91.textColor, 0, var73); // L: 5190
								if (var16 != null) { // L: 5191
									if (var30 != null) { // L: 5192
										var30.drawTransAt(var57 + var65 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5193
										var32.drawTransAt(var65 + var58 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5194
										for (var74 = 0; var74 < var50; ++var74) { // L: 5195
											var31.drawTransAt(var74 * var35 + (var65 + var59 - var39), var66, var73); // L: 5196
										}
									}

									if (var33 != null) { // L: 5199
										var33.drawTransAt(var60 + var65 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var61 + var65, var72, var16.textColor, 0, var73); // L: 5200
								}
							} else {
								if (var18 != null) { // L: 5204
									var18.drawTransBgAt(var65 + var52 - var26, var66);
								}

								if (var20 != null) { // L: 5205
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var19 != null) { // L: 5206
									for (var74 = 0; var74 < var49; ++var74) { // L: 5207
										var19.drawTransBgAt(var74 * var23 + (var65 + var54 - var27), var66); // L: 5208
									}
								}

								if (var21 != null) { // L: 5211
									var21.drawTransBgAt(var65 + var56 - var29, var66);
								}

								var78.draw(var45, var65 + var55, var69, var91.textColor | -16777216, 0); // L: 5212
								if (var16 != null) { // L: 5213
									if (var30 != null) { // L: 5214
										var30.drawTransBgAt(var65 + var57 - var38, var66);
									}

									if (var32 != null) { // L: 5215
										var32.drawTransBgAt(var58 + var65 - var40, var66);
									}

									if (var31 != null) { // L: 5216
										for (var74 = 0; var74 < var50; ++var74) { // L: 5217
											var31.drawTransBgAt(var74 * var35 + (var59 + var65 - var39), var66); // L: 5218
										}
									}

									if (var33 != null) { // L: 5221
										var33.drawTransBgAt(var60 + var65 - var41, var66);
									}

									var44.draw(var46, var65 + var61, var72, var16.textColor | -16777216, 0); // L: 5222
								}
							}
						}
					}
				}
			}

		}
	} // L: 5227
}
