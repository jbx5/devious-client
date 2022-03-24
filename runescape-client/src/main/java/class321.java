import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
public class class321 {
	@ObfuscatedName("ec")
	@ObfuscatedSignature(descriptor = 
	"Llu;")

	@Export("archive1")
	static Archive archive1;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(Llq;Llq;ZIB)V", garbageValue = 
	"17")

	static void method6031(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				class150.method3089(4);
			}

		} else {
			if (var3 == 0) {
				class230.method4894(var2);
			} else {
				class150.method3089(var3);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			Login.leftTitleSprite = class29.method433(var4);
			class162.rightTitleSprite = Login.leftTitleSprite.mirrorHorizontally();
			int var5 = Client.worldProperties;
			if ((var5 & 536870912) != 0) {
				HorizontalAlignment.logoSprite = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var5 & 1073741824) != 0) {
				HorizontalAlignment.logoSprite = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else {
				HorizontalAlignment.logoSprite = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}

			AbstractByteArrayCopier.titleboxSprite = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			class137.titlebuttonSprite = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Login.field882 = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			Login.field913 = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			class355.runesSprite = class271.method5255(var1, "runes", "");
			class114.title_muteSprite = class271.method5255(var1, "title_mute", "");
			class160.options_buttons_0Sprite = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			InvDefinition.field1814 = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			Skeleton.options_buttons_2Sprite = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			class143.field1639 = NPCComposition.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			Message.field458 = class160.options_buttons_0Sprite.subWidth;
			KeyHandler.field140 = class160.options_buttons_0Sprite.subHeight;
			Login.loginScreenRunesAnimation = new LoginScreenAnimation(class355.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field900 = new String[8];
				Login.field899 = 0;
			}

			UrlRequest.field1346 = 0;
			class452.otp = "";
			Login.field903 = true;
			Login.worldSelectOpen = false;
			if (!Interpreter.clientPreferences.method2259()) {
				Archive var6 = ArchiveLoader.archive6;
				int var7 = var6.getGroupId("scape main");
				int var8 = var6.getFileId(var7, "");
				class273.musicPlayerStatus = 1;
				class147.musicTrackArchive = var6;
				ArchiveLoader.musicTrackGroupId = var7;
				class273.musicTrackFileId = var8;
				DevicePcmPlayerProvider.musicTrackVolume = 255;
				class260.musicTrackBoolean = false;
				class273.pcmSampleLength = 2;
			} else {
				class273.musicPlayerStatus = 1;
				class147.musicTrackArchive = null;
				ArchiveLoader.musicTrackGroupId = -1;
				class273.musicTrackFileId = -1;
				DevicePcmPlayerProvider.musicTrackVolume = 0;
				class260.musicTrackBoolean = false;
				class273.pcmSampleLength = 2;
			}

			NPC.method2366(false);
			Login.clearLoginScreen = true;
			Login.xPadding = (class4.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			class134.loginBoxCenter = Login.loginBoxX + 180;
			Login.leftTitleSprite.drawAt(Login.xPadding, 0);
			class162.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			HorizontalAlignment.logoSprite.drawAt((Login.xPadding + 382) - (HorizontalAlignment.logoSprite.subWidth / 2), 18);
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(descriptor = 
	"(IIZI)V", garbageValue = 
	"1974154557")

	static final void method6030(int var0, int var1, boolean var2) {
		if (((!var2) || (var0 != class193.field2197)) || (class221.field2647 != var1)) {
			class193.field2197 = var0;
			class221.field2647 = var1;
			InterfaceParent.updateGameState(25);
			class119.drawLoadingMessage("Loading - please wait.", true);
			int var3 = ApproximateRouteStrategy.baseX;
			int var4 = class250.baseY;
			ApproximateRouteStrategy.baseX = (var0 - 6) * 8;
			class250.baseY = (var1 - 6) * 8;
			int var5 = ApproximateRouteStrategy.baseX - var3;
			int var6 = class250.baseY - var4;
			var3 = ApproximateRouteStrategy.baseX;
			var4 = class250.baseY;

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) {
				NPC var19 = Client.npcs[var7];
				if (var19 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var19.pathX;
						var10000[var9] -= var5;
						var10000 = var19.pathY;
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128;
					var19.y -= var6 * 128;
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) {
				Player var22 = Client.players[var7];
				if (var22 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var22.pathX;
						var10000[var9] -= var5;
						var10000 = var22.pathY;
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128;
					var22.y -= var6 * 128;
				}
			}

			byte var20 = 0;
			byte var8 = 104;
			byte var21 = 1;
			if (var5 < 0) {
				var20 = 103;
				var8 = -1;
				var21 = -1;
			}

			byte var10 = 0;
			byte var11 = 104;
			byte var12 = 1;
			if (var6 < 0) {
				var10 = 103;
				var11 = -1;
				var12 = -1;
			}

			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) {
				for (var14 = var10; var11 != var14; var14 += var12) {
					int var15 = var5 + var13;
					int var16 = var6 + var14;

					for (int var17 = 0; var17 < 4; ++var17) {
						if ((((var15 >= 0) && (var16 >= 0)) && (var15 < 104)) && (var16 < 104)) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null;
						}
					}
				}
			}

			for (PendingSpawn var18 = ((PendingSpawn) (Client.pendingSpawns.last())); var18 != null; var18 = ((PendingSpawn) (Client.pendingSpawns.previous()))) {
				var18.x -= var5;
				var18.y -= var6;
				if ((((var18.x < 0) || (var18.y < 0)) || (var18.x >= 104)) || (var18.y >= 104)) {
					var18.remove();
				}
			}

			if (Client.destinationX != 0) {
				Client.destinationX -= var5;
				Client.destinationY -= var6;
			}

			Client.soundEffectCount = 0;
			Client.isCameraLocked = false;
			EnumComposition.cameraX -= var5 << 7;
			CollisionMap.cameraZ -= var6 << 7;
			Messages.oculusOrbFocalPointX -= var5 << 7;
			class115.oculusOrbFocalPointY -= var6 << 7;
			Client.field721 = -1;
			Client.graphicsObjects.clear();
			Client.projectiles.clear();

			for (var14 = 0; var14 < 4; ++var14) {
				Client.collisionMaps[var14].clear();
			}

		}
	}
}