import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cc")
public class class102 extends UrlRequester {
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("k")
	final boolean field1358;

	public class102(boolean var1, int var2) {
		super(var2); // L: 13
		this.field1358 = var1; // L: 14
	} // L: 15

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lcm;B)V",
		garbageValue = "-112"
	)
	void vmethod2697(UrlRequest var1) throws IOException {
		URLConnection var2 = null; // L: 19

		try {
			try {
				String var3 = var1.url.getProtocol(); // L: 21
				if (var3.equals("http")) { // L: 22
					var2 = this.method2704(var1); // L: 23
				} else {
					if (!var3.equals("https")) { // L: 25
						var1.isDone0 = true; // L: 29
						return; // L: 30
					}

					var2 = this.method2699(var1); // L: 26
				}

				this.method2678(var2, var1); // L: 32
			} catch (IOException var7) {
			}

		} finally {
			var1.isDone0 = true; // L: 36
			if (var2 != null) { // L: 37
				if (var2 instanceof HttpURLConnection) { // L: 38
					((HttpURLConnection)var2).disconnect(); // L: 39
				} else if (var2 instanceof HttpsURLConnection) { // L: 41
					((HttpsURLConnection)var2).disconnect(); // L: 42
				}
			}

		}
	} // L: 46

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lcm;S)Ljava/net/URLConnection;",
		garbageValue = "-23057"
	)
	URLConnection method2704(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.url.openConnection(); // L: 49
		this.method2677(var2); // L: 50
		return var2; // L: 51
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lcm;I)Ljava/net/URLConnection;",
		garbageValue = "-709933919"
	)
	URLConnection method2699(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.url.openConnection(); // L: 55
		if (!this.field1358) { // L: 56
			if (class15.field86 == null) { // L: 60
				class15.field86 = new class15(); // L: 61
			}

			class15 var4 = class15.field86; // L: 63
			var2.setSSLSocketFactory(var4); // L: 65
		}

		this.method2677(var2); // L: 67
		return var2; // L: 68
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "479246121"
	)
	static int method2710(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 607
		Widget var3;
		if (var0 >= 2000) { // L: 608
			var0 -= 1000; // L: 609
			var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 610
			var3 = SpotAnimationDefinition.getWidget(var4); // L: 611
		} else {
			var3 = var2 ? TextureProvider.scriptDotWidget : MenuAction.scriptActiveWidget; // L: 613
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 614
			Interpreter.Interpreter_intStackSize -= 2; // L: 615
			var3.scrollX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 616
			if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 617
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) { // L: 618
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 619
			if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 620
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) { // L: 621
				var3.scrollY = 0;
			}

			class403.invalidateWidget(var3); // L: 622
			return 1; // L: 623
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) { // L: 625
			var3.color = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 626
			class403.invalidateWidget(var3); // L: 627
			return 1; // L: 628
		} else if (var0 == ScriptOpcodes.CC_SETFILL) { // L: 630
			var3.fill = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 631
			class403.invalidateWidget(var3); // L: 632
			return 1; // L: 633
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) { // L: 635
			var3.transparencyTop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 636
			class403.invalidateWidget(var3); // L: 637
			return 1; // L: 638
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) { // L: 640
			var3.lineWid = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 641
			class403.invalidateWidget(var3); // L: 642
			return 1; // L: 643
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) { // L: 645
			var3.spriteId2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 646
			class403.invalidateWidget(var3); // L: 647
			return 1; // L: 648
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) { // L: 650
			var3.spriteAngle = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 651
			class403.invalidateWidget(var3); // L: 652
			return 1; // L: 653
		} else if (var0 == ScriptOpcodes.CC_SETTILING) { // L: 655
			var3.spriteTiling = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 656
			class403.invalidateWidget(var3); // L: 657
			return 1; // L: 658
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) { // L: 660
			var3.modelType = 1; // L: 661
			var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 662
			class403.invalidateWidget(var3); // L: 663
			return 1; // L: 664
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) { // L: 666
			Interpreter.Interpreter_intStackSize -= 6; // L: 667
			var3.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 668
			var3.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 669
			var3.modelAngleX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 670
			var3.modelAngleY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 671
			var3.modelAngleZ = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 672
			var3.modelZoom = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5]; // L: 673
			class403.invalidateWidget(var3); // L: 674
			return 1; // L: 675
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) { // L: 677
				var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 678
				if (var8 != var3.sequenceId) { // L: 679
					var3.sequenceId = var8; // L: 680
					var3.modelFrame = 0; // L: 681
					var3.modelFrameCycle = 0; // L: 682
					class403.invalidateWidget(var3); // L: 683
				}

				return 1; // L: 685
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) { // L: 687
				var3.modelOrthog = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 688
				class403.invalidateWidget(var3); // L: 689
				return 1; // L: 690
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) { // L: 692
				String var7 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 693
				if (!var7.equals(var3.text)) { // L: 694
					var3.text = var7; // L: 695
					class403.invalidateWidget(var3); // L: 696
				}

				return 1; // L: 698
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) { // L: 700
				var3.fontId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 701
				class403.invalidateWidget(var3); // L: 702
				return 1; // L: 703
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) { // L: 705
				Interpreter.Interpreter_intStackSize -= 3; // L: 706
				var3.textXAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 707
				var3.textYAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 708
				var3.textLineHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 709
				class403.invalidateWidget(var3); // L: 710
				return 1; // L: 711
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) { // L: 713
				var3.textShadowed = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 714
				class403.invalidateWidget(var3); // L: 715
				return 1; // L: 716
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) { // L: 718
				var3.outline = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 719
				class403.invalidateWidget(var3); // L: 720
				return 1; // L: 721
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) { // L: 723
				var3.spriteShadow = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 724
				class403.invalidateWidget(var3); // L: 725
				return 1; // L: 726
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) { // L: 728
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 729
				class403.invalidateWidget(var3); // L: 730
				return 1; // L: 731
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) { // L: 733
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 734
				class403.invalidateWidget(var3); // L: 735
				return 1; // L: 736
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) { // L: 738
				Interpreter.Interpreter_intStackSize -= 2; // L: 739
				var3.scrollWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 740
				var3.scrollHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 741
				class403.invalidateWidget(var3); // L: 742
				if (var4 != -1 && var3.type == 0) { // L: 743
					StructComposition.revalidateWidgetScroll(Calendar.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 744
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) { // L: 746
				class425.resumePauseWidget(var3.id, var3.childIndex); // L: 747
				Client.meslayerContinueWidget = var3; // L: 748
				class403.invalidateWidget(var3); // L: 749
				return 1; // L: 750
			} else if (var0 == 1122) { // L: 752
				var3.spriteId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 753
				class403.invalidateWidget(var3); // L: 754
				return 1; // L: 755
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) { // L: 757
				var3.color2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 758
				class403.invalidateWidget(var3); // L: 759
				return 1; // L: 760
			} else if (var0 == 1124) { // L: 762
				var3.transparencyBot = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 763
				class403.invalidateWidget(var3); // L: 764
				return 1; // L: 765
			} else if (var0 == 1125) { // L: 767
				var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 768
				FillMode var6 = (FillMode)Varps.findEnumerated(UserComparator4.FillMode_values(), var8); // L: 769
				if (var6 != null) { // L: 770
					var3.fillMode = var6; // L: 771
					class403.invalidateWidget(var3); // L: 772
				}

				return 1; // L: 774
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) { // L: 776
					var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 777
					var3.field3434 = var5; // L: 778
					return 1; // L: 779
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) { // L: 781
					var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 782
					var3.modelTransparency = var5; // L: 783
					return 1; // L: 784
				} else if (var0 == 1129) { // L: 786
					var3.field3542 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 787
					class403.invalidateWidget(var3); // L: 788
					return 1; // L: 789
				} else if (var0 == 1130) { // L: 791
					var3.method5821(Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize], Messages.urlRequester, class21.method313()); // L: 792
					return 1; // L: 793
				} else if (var0 == 1131) { // L: 795
					Interpreter.Interpreter_intStackSize -= 2; // L: 796
					var3.method5873(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 797
					return 1; // L: 798
				} else if (var0 == 1132) { // L: 800
					var3.method5788(Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 801
					return 1; // L: 802
				} else {
					return 2; // L: 804
				}
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "1711900614"
	)
	static int method2709(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2105
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.cycle; // L: 2106
			return 1; // L: 2107
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2109
				Interpreter.Interpreter_intStackSize -= 2; // L: 2110
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2111
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2112
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class152.method3310(var3, var4); // L: 2113
				return 1; // L: 2114
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2116
				Interpreter.Interpreter_intStackSize -= 2; // L: 2117
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2118
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2119
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameEngine.ItemContainer_getCount(var3, var4); // L: 2120
				return 1; // L: 2121
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2123
				Interpreter.Interpreter_intStackSize -= 2; // L: 2124
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2125
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2126
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClanMate.method6838(var3, var4); // L: 2127
				return 1; // L: 2128
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2130
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2131
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class4.getInvDefinition(var3).size; // L: 2132
				return 1; // L: 2133
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2135
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2136
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2137
				return 1; // L: 2138
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2140
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2141
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2142
				return 1; // L: 2143
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2145
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2146
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2147
				return 1; // L: 2148
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2150
					var3 = Tiles.Client_plane; // L: 2151
					var4 = class128.baseX * 64 + (class67.localPlayer.x >> 7); // L: 2152
					var5 = WorldMapData_1.baseY * 64 + (class67.localPlayer.y >> 7); // L: 2153
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 2154
					return 1; // L: 2155
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2157
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2158
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 2159
					return 1; // L: 2160
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2162
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2163
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 28; // L: 2164
					return 1; // L: 2165
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2167
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2168
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & 16383; // L: 2169
					return 1; // L: 2170
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2172
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2173
					return 1; // L: 2174
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2176
					Interpreter.Interpreter_intStackSize -= 2; // L: 2177
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2178
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2179
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class152.method3310(var3, var4); // L: 2180
					return 1; // L: 2181
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2183
					Interpreter.Interpreter_intStackSize -= 2; // L: 2184
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2185
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2186
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameEngine.ItemContainer_getCount(var3, var4); // L: 2187
					return 1; // L: 2188
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2190
					Interpreter.Interpreter_intStackSize -= 2; // L: 2191
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2192
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2193
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClanMate.method6838(var3, var4); // L: 2194
					return 1; // L: 2195
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2197
					if (Client.staffModLevel >= 2) { // L: 2198
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2199
					}

					return 1; // L: 2200
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2202
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2203
					return 1; // L: 2204
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2206
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldId; // L: 2207
					return 1; // L: 2208
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2210
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.runEnergy; // L: 2211
					return 1; // L: 2212
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2214
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.weight; // L: 2215
					return 1; // L: 2216
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2218
					if (Client.playerMod) { // L: 2219
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2220
					}

					return 1; // L: 2221
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2223
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2224
					return 1; // L: 2225
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2227
					Interpreter.Interpreter_intStackSize -= 4; // L: 2228
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2229
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2230
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2231
					int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2232
					var3 += var4 << 14; // L: 2233
					var3 += var5 << 28; // L: 2234
					var3 += var6; // L: 2235
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 2236
					return 1; // L: 2237
				} else if (var0 == 3326) { // L: 2239
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field505; // L: 2240
					return 1; // L: 2241
				} else if (var0 == 3327) { // L: 2243
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field506; // L: 2244
					return 1; // L: 2245
				} else {
					return 2; // L: 2247
				}
			}
		}
	}
}
