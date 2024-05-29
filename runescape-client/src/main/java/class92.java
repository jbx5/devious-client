import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
public enum class92 implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1131(0, -1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1125(1, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1129(2, 3),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1124(3, 4),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1128(4, 5),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1127(5, 6);

	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1019212589
	)
	final int field1130;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -92361051
	)
	final int field1126;

	class92(int var3, int var4) {
		this.field1130 = var3;
		this.field1126 = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1126;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Lvl;",
		garbageValue = "101"
	)
	static IndexedSprite[] method2357() {
		IndexedSprite[] var0 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

		for (int var1 = 0; var1 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var1) {
			IndexedSprite var2 = var0[var1] = new IndexedSprite();
			var2.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
			var2.height = class351.SpriteBuffer_spriteHeight;
			var2.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var1];
			var2.yOffset = SpriteBufferProperties.SpriteBuffer_yOffsets[var1];
			var2.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = SpriteBufferProperties.SpriteBuffer_spriteHeights[var1] * -1603996197;
			var2.palette = UrlRequest.SpriteBuffer_spritePalette;
			var2.pixels = PlayerCompositionColorTextureOverride.SpriteBuffer_pixels[var1];
		}

		SpriteBufferProperties.SpriteBuffer_xOffsets = null;
		SpriteBufferProperties.SpriteBuffer_yOffsets = null;
		SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
		SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
		UrlRequest.SpriteBuffer_spritePalette = null;
		PlayerCompositionColorTextureOverride.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "79"
	)
	@Export("getUserId")
	static long getUserId() {
		return Client.userId;
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "310369199"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			class459.clientPreferences.updateRoofsHidden(!class459.clientPreferences.isRoofsHidden());
			if (class459.clientPreferences.isRoofsHidden()) {
				UrlRequest.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				UrlRequest.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.startsWith("zbuf")) {
			boolean var1 = class177.method3601(var0.substring(5).trim()) == 1;
			class188.client.method492(var1);
			Rasterizer3D.method4698(var1);
		}

		if (var0.equalsIgnoreCase("z")) {
			Client.z = !Client.z;
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			class459.clientPreferences.toggleDisplayFps();
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (var0.startsWith("setdrawdistance")) {
			String[] var3 = var0.split(" ");

			try {
				int var2 = Integer.parseInt(var3[1]);
				class459.clientPreferences.setDrawDistance(var2);
			} catch (NumberFormatException var5) {
				UrlRequest.addGameMessage(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var3[1]));
			}
		}

		if (var0.equalsIgnoreCase("getdrawdistance")) {
			UrlRequest.addGameMessage(99, "", String.format("%d", class459.clientPreferences.getDrawDistance()));
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				class6.worldMap.showCoord = !class6.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				class459.clientPreferences.updateDisplayFps(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				class459.clientPreferences.updateDisplayFps(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				ClientPacket.method6167();
			}
		}

		PacketBufferNode var6 = WorldMapElement.getPacketBufferNode(ClientPacket.DOCHEAT, Client.packetWriter.isaacCipher);
		var6.packetBuffer.writeByte(var0.length() + 1);
		var6.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var6);
	}
}
