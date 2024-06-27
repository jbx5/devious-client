import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rx")
public class class452 {
	@ObfuscatedName("ae")
	public static short[] field4862;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;Ljava/lang/String;Ljava/lang/String;I)Lqh;",
		garbageValue = "-456035171"
	)
	public static Font method8351(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		if (!var0.isValidFileName(var2, var3)) {
			return null;
		} else {
			int var4 = var0.getGroupId(var2);
			int var5 = var0.getFileId(var4, var3);
			Font var6;
			if (!class146.method3260(var0, var4, var5)) {
				var6 = null;
			} else {
				byte[] var8 = var1.takeFile(var4, var5);
				Font var7;
				if (var8 == null) {
					var7 = null;
				} else {
					Font var9 = new Font(var8, UserComparator4.SpriteBuffer_xOffsets, LoginPacket.SpriteBuffer_yOffsets, SpriteBufferProperties.SpriteBuffer_spriteWidths, class315.SpriteBuffer_spriteHeights, SpriteBufferProperties.SpriteBuffer_spritePalette, SpriteBufferProperties.SpriteBuffer_pixels);
					Calendar.method7029();
					var7 = var9;
				}

				var6 = var7;
			}

			return var6;
		}
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "33"
	)
	@Export("getUserId")
	static long getUserId() {
		return Client.userId;
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(Lhg;IIZI)V",
		garbageValue = "1086932800"
	)
	static void method8354(Sound var0, int var1, int var2, boolean var3) {
		if (var0 != null) {
			if (var0.field2148 == 0) {
				if (!var3) {
					return;
				}

				Client.soundLocations[Client.soundEffectCount] = 0;
			} else {
				int var4 = (var1 - 64) / 128;
				int var5 = (var2 - 64) / 128;
				Client.soundLocations[Client.soundEffectCount] = (var5 << 8) + var0.field2148 + (var4 << 16);
			}

			Client.soundEffectIds[Client.soundEffectCount] = var0.field2150;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var0.field2147;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.field668[Client.soundEffectCount] = var0.field2149;
			++Client.soundEffectCount;
		}
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(Lnx;IIB)V",
		garbageValue = "45"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !World.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.method6943(ModeWhere.widgetDefinition, true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var7 * var5 + var4 * var8 >> 11;
					int var10 = var8 * var5 - var7 * var4 >> 11;
					int var11 = StudioGame.field4084.vmethod8670() + var9 >> 7;
					int var12 = StudioGame.field4084.vmethod8671() - var10 >> 7;
					PacketBufferNode var13 = class170.getPacketBufferNode(ClientPacket.MINIMAP_CLICK, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.writeShortLE(var12 + class511.topLevelWorldView.baseY);
					var13.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? (Client.indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
					var13.packetBuffer.writeShortAddLE(var11 + class511.topLevelWorldView.baseX);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(SoundCache.localPlayer.x);
					var13.packetBuffer.writeShort(SoundCache.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}
}
