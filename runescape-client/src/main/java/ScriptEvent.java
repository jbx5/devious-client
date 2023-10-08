import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("ac")
	@Export("args")
	Object[] args;
	@ObfuscatedName("al")
	boolean field1077;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -516361671
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1264016841
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1289880341
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 875155687
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1281178505
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("av")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1781378181
	)
	int field1078;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -107146135
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;B)V",
		garbageValue = "-8"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1815349260"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnm;B)V",
		garbageValue = "-116"
	)
	public void method2317(Widget var1) {
		this.widget = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-119"
	)
	static int method2327(int var0, int var1) {
		FloorOverlayDefinition var2 = class4.method15(var0);
		if (var2 == null) {
			return var1;
		} else {
			int var3;
			int var4;
			byte var5;
			int var7;
			if (var2.secondaryRgb >= 0) {
				var3 = Occluder.method4859(var2.secondaryHue, var2.secondarySaturation, var2.secondaryLightness);
				var5 = 96;
				if (var3 == -2) {
					var4 = 12345678;
				} else if (var3 == -1) {
					if (var5 < 0) {
						var5 = 0;
					} else if (var5 > 127) {
						var5 = 127;
					}

					var7 = 127 - var5;
					var4 = var7;
				} else {
					var7 = var5 * (var3 & 127) / 128;
					if (var7 < 2) {
						var7 = 2;
					} else if (var7 > 126) {
						var7 = 126;
					}

					var4 = var7 + (var3 & 65408);
				}

				return Rasterizer3D.Rasterizer3D_colorPalette[var4] | -16777216;
			} else if (var2.texture >= 0) {
				var4 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture);
				var5 = 96;
				if (var4 == -2) {
					var3 = 12345678;
				} else if (var4 == -1) {
					if (var5 < 0) {
						var5 = 0;
					} else if (var5 > 127) {
						var5 = 127;
					}

					var7 = 127 - var5;
					var3 = var7;
				} else {
					var7 = var5 * (var4 & 127) / 128;
					if (var7 < 2) {
						var7 = 2;
					} else if (var7 > 126) {
						var7 = 126;
					}

					var3 = var7 + (var4 & 65408);
				}

				return Rasterizer3D.Rasterizer3D_colorPalette[var3] | -16777216;
			} else if (var2.primaryRgb == 16711935) {
				return var1;
			} else {
				var3 = Occluder.method4859(var2.hue, var2.saturation, var2.lightness);
				var5 = 96;
				if (var3 == -2) {
					var4 = 12345678;
				} else if (var3 == -1) {
					if (var5 < 0) {
						var5 = 0;
					} else if (var5 > 127) {
						var5 = 127;
					}

					var7 = 127 - var5;
					var4 = var7;
				} else {
					var7 = var5 * (var3 & 127) / 128;
					if (var7 < 2) {
						var7 = 2;
					} else if (var7 > 126) {
						var7 = 126;
					}

					var4 = var7 + (var3 & 65408);
				}

				return Rasterizer3D.Rasterizer3D_colorPalette[var4] | -16777216;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;III)[Lud;",
		garbageValue = "-1840423911"
	)
	public static SpritePixels[] method2331(AbstractArchive var0, int var1, int var2) {
		if (!class164.method3376(var0, var1, var2)) {
			return null;
		} else {
			SpritePixels[] var4 = new SpritePixels[class544.SpriteBuffer_spriteCount];

			for (int var5 = 0; var5 < class544.SpriteBuffer_spriteCount; ++var5) {
				SpritePixels var6 = var4[var5] = new SpritePixels();
				var6.width = class159.SpriteBuffer_spriteWidth;
				var6.height = class500.SpriteBuffer_spriteHeight;
				var6.xOffset = class326.SpriteBuffer_xOffsets[var5];
				var6.yOffset = ModelData0.SpriteBuffer_yOffsets[var5];
				var6.subWidth = class59.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = class544.SpriteBuffer_spriteHeights[var5];
				int var7 = var6.subWidth * var6.subHeight;
				byte[] var8 = AddRequestTask.SpriteBuffer_pixels[var5];
				var6.pixels = new int[var7];

				for (int var9 = 0; var9 < var7; ++var9) {
					var6.pixels[var9] = class372.SpriteBuffer_spritePalette[var8[var9] & 255];
				}
			}

			class407.method7453();
			return var4;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lom;Lom;ZIB)V",
		garbageValue = "-22"
	)
	static void method2328(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				GameEngine.method647(4);
			}

		} else {
			if (var3 == 0) {
				MusicPatchNode2.method5929(var2);
			} else {
				GameEngine.method647(var3);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			PcmPlayer.leftTitleSprite = Frames.method4854(var4);
			Login.rightTitleSprite = PcmPlayer.leftTitleSprite.mirrorHorizontally();
			TextureProvider.method4884(var1, Client.worldProperties);
			Login.titleboxSprite = class167.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			VarcInt.titlebuttonSprite = class167.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Login.field929 = class167.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			class364.field3941 = class167.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			class167.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			Login.runesSprite = InvDefinition.method3618(var1, "runes", "");
			Login.title_muteSprite = InvDefinition.method3618(var1, "title_mute", "");
			class519.options_buttons_0Sprite = class167.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			class305.field3128 = class167.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			class534.options_buttons_2Sprite = class167.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			ClanChannel.field1779 = class167.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			class274.field2991 = class519.options_buttons_0Sprite.subWidth;
			class202.field2025 = class519.options_buttons_0Sprite.subHeight;
			class544.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field947 = new String[8];
				Login.field946 = 0;
			}

			ClientPreferences.field1295 = 0;
			class186.otp = "";
			Login.field951 = true;
			Login.worldSelectOpen = false;
			if (!class91.clientPreferences.method2503()) {
				ArrayList var5 = new ArrayList();
				var5.add(new MusicSong(CollisionMap.archive6, "scape main", "", 255, false));
				class148.method3166(var5, 0, 0, 0, 100, false);
			} else {
				ItemComposition.method4136(0, 0);
			}

			class470.method8459();
			class13.method167().method7000(false);
			Login.clearLoginScreen = true;
			Login.xPadding = (class340.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			class379.loginBoxCenter = Login.loginBoxX + 180;
			PcmPlayer.leftTitleSprite.drawAt(Login.xPadding, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "77"
	)
	static final int method2330(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1310629797"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class304.method5860();
		class309.method5867();
		int var1 = class150.VarpDefinition_get(var0).type;
		if (var1 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					JagexCache.method3533(0.9D);
				}

				if (var2 == 2) {
					JagexCache.method3533(0.8D);
				}

				if (var2 == 3) {
					JagexCache.method3533(0.7D);
				}

				if (var2 == 4) {
					JagexCache.method3533(0.6D);
				}
			}

			if (var1 == 3) {
				if (var2 == 0) {
					JagexCache.setMusicVolume(255);
				}

				if (var2 == 1) {
					JagexCache.setMusicVolume(192);
				}

				if (var2 == 2) {
					JagexCache.setMusicVolume(128);
				}

				if (var2 == 3) {
					JagexCache.setMusicVolume(64);
				}

				if (var2 == 4) {
					JagexCache.setMusicVolume(0);
				}
			}

			if (var1 == 4) {
				if (var2 == 0) {
					FloorOverlayDefinition.method4148(127);
				}

				if (var2 == 1) {
					FloorOverlayDefinition.method4148(96);
				}

				if (var2 == 2) {
					FloorOverlayDefinition.method4148(64);
				}

				if (var2 == 3) {
					FloorOverlayDefinition.method4148(32);
				}

				if (var2 == 4) {
					FloorOverlayDefinition.method4148(0);
				}
			}

			if (var1 == 5) {
				Client.leftClickOpensMenu = var2 == 1;
			}

			if (var1 == 6) {
				Client.chatEffects = var2;
			}

			if (var1 == 9) {
			}

			if (var1 == 10) {
				if (var2 == 0) {
					class198.method3736(127);
				}

				if (var2 == 1) {
					class198.method3736(96);
				}

				if (var2 == 2) {
					class198.method3736(64);
				}

				if (var2 == 3) {
					class198.method3736(32);
				}

				if (var2 == 4) {
					class198.method3736(0);
				}
			}

			if (var1 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var1 == 18) {
				Client.playerAttackOption = (AttackOption)SequenceDefinition.findEnumerated(ClientPreferences.method2604(), var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var1 == 22) {
				Client.npcAttackOption = (AttackOption)SequenceDefinition.findEnumerated(ClientPreferences.method2604(), var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "-1009991511"
	)
	static String method2315(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (HealthBarDefinition.field1995 != null) {
			var3 = "/p=" + HealthBarDefinition.field1995;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + WorldMapLabelSize.clientLanguage + "/a=" + WorldMapIcon_1.field2916 + var3 + "/";
	}
}
