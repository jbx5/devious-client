import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -637887147
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1858594123
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("ar")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -78383605
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 2028574889
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -532421459
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -970004813
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 916475103
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 957509085
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1296969211
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	public FloorOverlayDefinition() {
		this.primaryRgb = 0;
		this.texture = -1;
		this.hideUnderlay = true;
		this.secondaryRgb = -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "10635"
	)
	@Export("postDecode")
	public void postDecode() {
		if (this.secondaryRgb != -1) {
			this.setHsl(this.secondaryRgb);
			this.secondaryHue = this.hue;
			this.secondarySaturation = this.saturation;
			this.secondaryLightness = this.lightness;
		}

		this.setHsl(this.primaryRgb);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "1339315312"
	)
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.decodeNext(var1, var3, var2);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;IIB)V",
		garbageValue = "0"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) {
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium();
		} else if (var2 == 8) {
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "89"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D;
		double var4 = (double)(var1 >> 8 & 255) / 256.0D;
		double var6 = (double)(var1 & 255) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var10 + var8) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0D;
		this.hue = (int)(var12 * 256.0D);
		this.saturation = (int)(256.0D * var14);
		this.lightness = (int)(256.0D * var16);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lof;Ljava/lang/String;Ljava/lang/String;I)[Lvg;",
		garbageValue = "-859391204"
	)
	@Export("getFont")
	public static IndexedSprite[] getFont(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			IndexedSprite[] var5;
			if (!class130.method3074(var0, var3, var4)) {
				var5 = null;
			} else {
				IndexedSprite[] var7 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

				for (int var8 = 0; var8 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var8) {
					IndexedSprite var9 = var7[var8] = new IndexedSprite();
					var9.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
					var9.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
					var9.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var8];
					var9.yOffset = SpriteBufferProperties.SpriteBuffer_yOffsets[var8];
					var9.subWidth = class235.SpriteBuffer_spriteWidths[var8];
					var9.subHeight = SpriteBufferProperties.SpriteBuffer_spriteHeights[var8];
					var9.palette = AbstractSocket.SpriteBuffer_spritePalette;
					var9.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var8];
				}

				SpriteBufferProperties.SpriteBuffer_xOffsets = null;
				SpriteBufferProperties.SpriteBuffer_yOffsets = null;
				class235.SpriteBuffer_spriteWidths = null;
				SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
				AbstractSocket.SpriteBuffer_spritePalette = null;
				SpriteBufferProperties.SpriteBuffer_pixels = null;
				var5 = var7;
			}

			return var5;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "3"
	)
	static int method4052(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field756 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (AbstractUserComparator.getWindowedMode() == 1) {
			class193.client.setMaxCanvasSize(765, 503);
		} else {
			class193.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25 && Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var1 = ViewportMouse.getPacketBufferNode(ClientPacket.field3177, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(AbstractUserComparator.getWindowedMode());
			var1.packetBuffer.writeShort(GameEngine.canvasWidth);
			var1.packetBuffer.writeShort(WorldMapArea.canvasHeight);
			Client.packetWriter.addNode(var1);
		}

	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIS)V",
		garbageValue = "512"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = Actor.scene.getBoundaryObjectTag(var0, var1, var2);
		int var7;
		int var8;
		int var9;
		int var10;
		int var13;
		int var14;
		if (var5 != 0L) {
			var7 = Actor.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = var3;
			boolean var11 = var5 != 0L && !class164.method3461(var5);
			if (var11) {
				var10 = var4;
			}

			int[] var12 = KeyHandler.sceneMinimapSprite.pixels;
			var13 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var14 = Message.Entity_unpackID(var5);
			ObjectComposition var15 = class127.getObjectDefinition(var14);
			if (var15.mapSceneId != -1) {
				IndexedSprite var16 = AbstractSocket.mapSceneSprites[var15.mapSceneId];
				if (var16 != null) {
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2;
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2;
					var16.drawAt(var1 * 4 + var17 + 48, var18 + (104 - var2 - var15.sizeY) * 4 + 48);
				}
			} else {
				if (var9 == 0 || var9 == 2) {
					if (var8 == 0) {
						var12[var13] = var10;
						var12[var13 + 512] = var10;
						var12[var13 + 1024] = var10;
						var12[var13 + 1536] = var10;
					} else if (var8 == 1) {
						var12[var13] = var10;
						var12[var13 + 1] = var10;
						var12[var13 + 2] = var10;
						var12[var13 + 3] = var10;
					} else if (var8 == 2) {
						var12[var13 + 3] = var10;
						var12[var13 + 512 + 3] = var10;
						var12[var13 + 1024 + 3] = var10;
						var12[var13 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var12[var13 + 1536] = var10;
						var12[var13 + 1536 + 1] = var10;
						var12[var13 + 1536 + 2] = var10;
						var12[var13 + 1536 + 3] = var10;
					}
				}

				if (var9 == 3) {
					if (var8 == 0) {
						var12[var13] = var10;
					} else if (var8 == 1) {
						var12[var13 + 3] = var10;
					} else if (var8 == 2) {
						var12[var13 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var12[var13 + 1536] = var10;
					}
				}

				if (var9 == 2) {
					if (var8 == 3) {
						var12[var13] = var10;
						var12[var13 + 512] = var10;
						var12[var13 + 1024] = var10;
						var12[var13 + 1536] = var10;
					} else if (var8 == 0) {
						var12[var13] = var10;
						var12[var13 + 1] = var10;
						var12[var13 + 2] = var10;
						var12[var13 + 3] = var10;
					} else if (var8 == 1) {
						var12[var13 + 3] = var10;
						var12[var13 + 512 + 3] = var10;
						var12[var13 + 1024 + 3] = var10;
						var12[var13 + 1536 + 3] = var10;
					} else if (var8 == 2) {
						var12[var13 + 1536] = var10;
						var12[var13 + 1536 + 1] = var10;
						var12[var13 + 1536 + 2] = var10;
						var12[var13 + 1536 + 3] = var10;
					}
				}
			}
		}

		var5 = Actor.scene.getGameObjectTag(var0, var1, var2);
		if (0L != var5) {
			var7 = Actor.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = Message.Entity_unpackID(var5);
			ObjectComposition var19 = class127.getObjectDefinition(var10);
			if (var19.mapSceneId != -1) {
				IndexedSprite var26 = AbstractSocket.mapSceneSprites[var19.mapSceneId];
				if (var26 != null) {
					var13 = (var19.sizeX * 4 - var26.subWidth) / 2;
					var14 = (var19.sizeY * 4 - var26.subHeight) / 2;
					var26.drawAt(var13 + var1 * 4 + 48, (104 - var2 - var19.sizeY) * 4 + var14 + 48);
				}
			} else if (var9 == 9) {
				int var20 = 15658734;
				boolean var27 = var5 != 0L && !class164.method3461(var5);
				if (var27) {
					var20 = 15597568;
				}

				int[] var21 = KeyHandler.sceneMinimapSprite.pixels;
				int var22 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var8 != 0 && var8 != 2) {
					var21[var22] = var20;
					var21[var22 + 1 + 512] = var20;
					var21[var22 + 1024 + 2] = var20;
					var21[var22 + 1536 + 3] = var20;
				} else {
					var21[var22 + 1536] = var20;
					var21[var22 + 1 + 1024] = var20;
					var21[var22 + 512 + 2] = var20;
					var21[var22 + 3] = var20;
				}
			}
		}

		var5 = Actor.scene.getFloorDecorationTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = Message.Entity_unpackID(var5);
			ObjectComposition var23 = class127.getObjectDefinition(var7);
			if (var23.mapSceneId != -1) {
				IndexedSprite var24 = AbstractSocket.mapSceneSprites[var23.mapSceneId];
				if (var24 != null) {
					var10 = (var23.sizeX * 4 - var24.subWidth) / 2;
					int var25 = (var23.sizeY * 4 - var24.subHeight) / 2;
					var24.drawAt(var10 + var1 * 4 + 48, var25 + (104 - var2 - var23.sizeY) * 4 + 48);
				}
			}
		}

	}
}
