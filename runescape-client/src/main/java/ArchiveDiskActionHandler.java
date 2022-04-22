import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lld;")

	@Export("ArchiveDiskActionHandler_requestQueue")
	public static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lld;")

	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	1344367175)

	public static int field3945;
	@ObfuscatedName("f")
	@Export("ArchiveDiskActionHandler_lock")
	public static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("b")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"Lju;")

	@Export("musicTrack")
	public static MusicTrack musicTrack;
	static 
	{
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field3945 = 0;
		ArchiveDiskActionHandler_lock = new Object();
	}

	ArchiveDiskActionHandler() {
	}

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) {
					var1 = ((ArchiveDiskAction) (ArchiveDiskActionHandler_requestQueue.last()));
				}

				if (var1 != null) {
					if (var1.type == 0) {
						var1.archiveDisk.write(((int) (var1.key)), var1.data, var1.data.length);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							var1.remove();
						}
					} else if (var1.type == 1) {
						var1.data = var1.archiveDisk.read(((int) (var1.key)));
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							ArchiveDiskActionHandler_responseQueue.addFirst(var1);
						}
					}

					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3945 <= 1) {
							field3945 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						field3945 = 600;
					}
				} else {
					class93.method2384(100L);
					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3945 <= 1) {
							field3945 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						--field3945;
					}
				}
			} 
		} catch (Exception var13) {
			Widget.RunException_sendStackTrace(((String) (null)), var13);
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(II)[B", garbageValue = 
	"-64972529")

	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(Lky;I[B[BB)V", garbageValue = 
	"1")

	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3415 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3415 = new byte[11][];
			var0.field3485 = new byte[11][];
			var0.field3417 = new int[11];
			var0.field3418 = new int[11];
		}

		var0.field3415[var1] = var2;
		if (var2 != null) {
			var0.field3414 = true;
		} else {
			var0.field3414 = false;

			for (int var4 = 0; var4 < var0.field3415.length; ++var4) {
				if (var0.field3415[var4] != null) {
					var0.field3414 = true;
					break;
				}
			}
		}

		var0.field3485[var1] = var3;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-433593353")

	public static void method5813() {
		class451.SpriteBuffer_xOffsets = null;
		class271.SpriteBuffer_yOffsets = null;
		class451.SpriteBuffer_spriteWidths = null;
		class451.SpriteBuffer_spriteHeights = null;
		NetFileRequest.SpriteBuffer_spritePalette = null;
		FriendLoginUpdate.SpriteBuffer_pixels = null;
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(descriptor = 
	"(Lky;IIIB)V", garbageValue = 
	"-122")

	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class116.playPcmPlayers();
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if ((Client.minimapState != 2) && (Client.minimapState != 5)) {
				int var5 = Client.camAngleY & 2047;
				int var6 = (GrandExchangeEvents.localPlayer.x / 32) + 48;
				int var7 = 464 - (GrandExchangeEvents.localPlayer.y / 32);
				HealthBarUpdate.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = ((Client.mapIconXs[var8] * 4) + 2) - (GrandExchangeEvents.localPlayer.x / 32);
					var10 = ((Client.mapIconYs[var8] * 4) + 2) - (GrandExchangeEvents.localPlayer.y / 32);
					ReflectionCheck.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = Client.groundItems[class18.Client_plane][var8][var16];
						if (var14 != null) {
							var11 = ((var8 * 4) + 2) - (GrandExchangeEvents.localPlayer.x / 32);
							var12 = ((var16 * 4) + 2) - (GrandExchangeEvents.localPlayer.y / 32);
							ReflectionCheck.drawSpriteOnMinimap(var1, var2, var11, var12, class54.mapDotSprites[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) {
					NPC var9 = Client.npcs[Client.npcIndices[var8]];
					if ((var9 != null) && var9.isVisible()) {
						NPCComposition var18 = var9.definition;
						if ((var18 != null) && (var18.transforms != null)) {
							var18 = var18.transform();
						}

						if (((var18 != null) && var18.drawMapDot) && var18.isInteractable) {
							var11 = (var9.x / 32) - (GrandExchangeEvents.localPlayer.x / 32);
							var12 = (var9.y / 32) - (GrandExchangeEvents.localPlayer.y / 32);
							ReflectionCheck.drawSpriteOnMinimap(var1, var2, var11, var12, class54.mapDotSprites[1], var4);
						}
					}
				}

				var8 = Players.Players_count;
				int[] var17 = Players.Players_indices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = Client.players[var17[var10]];
					if ((((var15 != null) && var15.isVisible()) && (!var15.isHidden)) && (var15 != GrandExchangeEvents.localPlayer)) {
						var12 = (var15.x / 32) - (GrandExchangeEvents.localPlayer.x / 32);
						int var13 = (var15.y / 32) - (GrandExchangeEvents.localPlayer.y / 32);
						if (var15.isFriend()) {
							ReflectionCheck.drawSpriteOnMinimap(var1, var2, var12, var13, class54.mapDotSprites[3], var4);
						} else if (((GrandExchangeEvents.localPlayer.team != 0) && (var15.team != 0)) && (var15.team == GrandExchangeEvents.localPlayer.team)) {
							ReflectionCheck.drawSpriteOnMinimap(var1, var2, var12, var13, class54.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) {
							ReflectionCheck.drawSpriteOnMinimap(var1, var2, var12, var13, class54.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) {
							ReflectionCheck.drawSpriteOnMinimap(var1, var2, var12, var13, class54.mapDotSprites[6], var4);
						} else {
							ReflectionCheck.drawSpriteOnMinimap(var1, var2, var12, var13, class54.mapDotSprites[2], var4);
						}
					}
				}

				if ((Client.hintArrowType != 0) && ((Client.cycle % 20) < 10)) {
					if (((Client.hintArrowType == 1) && (Client.hintArrowNpcIndex >= 0)) && (Client.hintArrowNpcIndex < Client.npcs.length)) {
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = (var19.x / 32) - (GrandExchangeEvents.localPlayer.x / 32);
							var12 = (var19.y / 32) - (GrandExchangeEvents.localPlayer.y / 32);
							ReflectionCheck.worldToMinimap(var1, var2, var11, var12, WorldMapLabelSize.mapMarkerSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = (((Client.hintArrowX * 4) - (GrandExchangeOfferOwnWorldComparator.baseX * 4)) + 2) - (GrandExchangeEvents.localPlayer.x / 32);
						var11 = (((Client.hintArrowY * 4) - (VarcInt.baseY * 4)) + 2) - (GrandExchangeEvents.localPlayer.y / 32);
						ReflectionCheck.worldToMinimap(var1, var2, var10, var11, WorldMapLabelSize.mapMarkerSprites[1], var4);
					}

					if (((Client.hintArrowType == 10) && (Client.hintArrowPlayerIndex >= 0)) && (Client.hintArrowPlayerIndex < Client.players.length)) {
						Player var20 = Client.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = (var20.x / 32) - (GrandExchangeEvents.localPlayer.x / 32);
							var12 = (var20.y / 32) - (GrandExchangeEvents.localPlayer.y / 32);
							ReflectionCheck.worldToMinimap(var1, var2, var11, var12, WorldMapLabelSize.mapMarkerSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = ((Client.destinationX * 4) + 2) - (GrandExchangeEvents.localPlayer.x / 32);
					var11 = ((Client.destinationY * 4) + 2) - (GrandExchangeEvents.localPlayer.y / 32);
					ReflectionCheck.drawSpriteOnMinimap(var1, var2, var10, var11, WorldMapLabelSize.mapMarkerSprites[0], var4);
				}

				if (!GrandExchangeEvents.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(((var4.width / 2) + var1) - 1, ((var4.height / 2) + var2) - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field716[var3] = true;
		}
	}
}