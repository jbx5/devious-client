import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Iterator;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("SecureUrlRequester")
public class SecureUrlRequester extends UrlRequester {
	@ObfuscatedName("ao")
	@Export("SpriteBuffer_spritePalette")
	static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = 2003804321
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("td")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("aq")
	@Export("secureHttps")
	final boolean secureHttps;

	public SecureUrlRequester(boolean var1, int var2) {
		super(var2);
		this.secureHttps = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lee;I)V",
		garbageValue = "-630521525"
	)
	@Export("openConnection")
	void openConnection(UrlRequest var1) throws IOException {
		URLConnection var2 = null;
		boolean var9 = false;

		HttpURLConnection var12;
		label131: {
			label125: {
				try {
					label115: {
						var9 = true;
						String var3 = var1.field1440.getProtocol();
						if (var3.equals("http")) {
							var2 = this.openHttpConnection(var1);
						} else {
							if (!var3.equals("https")) {
								var1.field1436 = UrlRequest.field1435;
								var9 = false;
								break label115;
							}

							var2 = this.openHttpsConnection(var1);
						}

						this.method2878(var2, var1);
						var9 = false;
						break label131;
					}
				} catch (IOException var10) {
					var1.field1436 = UrlRequest.field1435;
					var9 = false;
					break label125;
				} finally {
					if (var9) {
						if (var2 != null && var2 instanceof HttpURLConnection) {
							HttpURLConnection var6 = (HttpURLConnection)var2;
							var6.disconnect();
						}

					}
				}

				if (var2 != null && var2 instanceof HttpURLConnection) {
					HttpURLConnection var4 = (HttpURLConnection)var2;
					var4.disconnect();
				}

				return;
			}

			if (var2 != null && var2 instanceof HttpURLConnection) {
				var12 = (HttpURLConnection)var2;
				var12.disconnect();
			}

			return;
		}

		if (var2 != null && var2 instanceof HttpURLConnection) {
			var12 = (HttpURLConnection)var2;
			var12.disconnect();
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lee;I)Ljava/net/URLConnection;",
		garbageValue = "2121934963"
	)
	@Export("openHttpConnection")
	URLConnection openHttpConnection(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1440.openConnection();
		this.setDefaultRequestProperties(var2);
		return var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lee;I)Ljava/net/URLConnection;",
		garbageValue = "-1382211858"
	)
	@Export("openHttpsConnection")
	URLConnection openHttpsConnection(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1440.openConnection();
		if (!this.secureHttps) {
			var2.setSSLSocketFactory(SecureRandomSSLSocketFactory.method208());
		}

		this.setDefaultRequestProperties(var2);
		return var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Ldd;",
		garbageValue = "-149009670"
	)
	@Export("getScript")
	static Script getScript(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = WorldMapDecorationType.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = WorldMapDecorationType.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}

					var2 = class90.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, (long)(var0 << 16));
						return var2;
					}
				}

				return null;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1145814280"
	)
	static void method2916() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromFriend();
		}

	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1427712263"
	)
	static boolean method2915() {
		return (Client.drawPlayerNames & 1) != 0;
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(Lnn;IIII)V",
		garbageValue = "65561455"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		WorldMapRectangle.method5020();
		SpriteMask var4 = var0.method6745(class380.widgetDefinition, false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = KeyHandler.localPlayer.x / 32 + 48;
				int var7 = 464 - KeyHandler.localPlayer.y / 32;
				class482.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - KeyHandler.localPlayer.x / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - KeyHandler.localPlayer.y / 32;
					TileItem.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = Client.groundItems[Client_plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - KeyHandler.localPlayer.x / 32;
							var12 = var16 * 4 + 2 - KeyHandler.localPlayer.y / 32;
							TileItem.drawSpriteOnMinimap(var1, var2, var11, var12, class142.field1634[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) {
					NPC var9 = Client.npcs[Client.npcIndices[var8]];
					if (var9 != null && var9.isVisible()) {
						NPCComposition var18 = var9.definition;
						if (var18 != null && var18.transforms != null) {
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) {
							var11 = var9.x / 32 - KeyHandler.localPlayer.x / 32;
							var12 = var9.y / 32 - KeyHandler.localPlayer.y / 32;
							TileItem.drawSpriteOnMinimap(var1, var2, var11, var12, class142.field1634[1], var4);
						}
					}
				}

				var8 = Players.Players_count;
				int[] var17 = Players.Players_indices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = Client.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != KeyHandler.localPlayer) {
						var12 = var15.x / 32 - KeyHandler.localPlayer.x / 32;
						int var13 = var15.y / 32 - KeyHandler.localPlayer.y / 32;
						if (var15.isFriend()) {
							TileItem.drawSpriteOnMinimap(var1, var2, var12, var13, class142.field1634[3], var4);
						} else if (KeyHandler.localPlayer.team != 0 && var15.team != 0 && var15.team == KeyHandler.localPlayer.team) {
							TileItem.drawSpriteOnMinimap(var1, var2, var12, var13, class142.field1634[4], var4);
						} else if (var15.isFriendsChatMember()) {
							TileItem.drawSpriteOnMinimap(var1, var2, var12, var13, class142.field1634[5], var4);
						} else if (var15.isClanMember()) {
							TileItem.drawSpriteOnMinimap(var1, var2, var12, var13, class142.field1634[6], var4);
						} else {
							TileItem.drawSpriteOnMinimap(var1, var2, var12, var13, class142.field1634[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = var19.x / 32 - KeyHandler.localPlayer.x / 32;
							var12 = var19.y / 32 - KeyHandler.localPlayer.y / 32;
							class341.worldToMinimap(var1, var2, var11, var12, class365.mapDotSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - HealthBarDefinition.baseX * 256 + 2 - KeyHandler.localPlayer.x / 32;
						var11 = Client.hintArrowY * 4 - WorldMapScaleHandler.baseY * 256 + 2 - KeyHandler.localPlayer.y / 32;
						class341.worldToMinimap(var1, var2, var10, var11, class365.mapDotSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
						Player var20 = Client.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - KeyHandler.localPlayer.x / 32;
							var12 = var20.y / 32 - KeyHandler.localPlayer.y / 32;
							class341.worldToMinimap(var1, var2, var11, var12, class365.mapDotSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - KeyHandler.localPlayer.x / 32;
					var11 = Client.destinationY * 4 + 2 - KeyHandler.localPlayer.y / 32;
					TileItem.drawSpriteOnMinimap(var1, var2, var10, var11, class365.mapDotSprites[0], var4);
				}

				if (!KeyHandler.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field663[var3] = true;
		}
	}
}
