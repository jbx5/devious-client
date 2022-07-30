import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
@ObfuscatedName("mz")
public final class class363 implements Comparable {
	@ObfuscatedName("o")
	Object field4291;

	@ObfuscatedName("q")
	Object field4290;

	@ObfuscatedName("f")
	@ObfuscatedGetter(longValue = -9184291711572428283L)
	long field4292;

	@ObfuscatedName("u")
	@ObfuscatedGetter(longValue = -7970784477502383407L)
	long field4289;

	class363(Object var1, Object var2) {
		this.field4291 = var1;
		this.field4290 = var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lmz;I)I", garbageValue = "329944953")
	int method6611(class363 var1) {
		if (this.field4289 < var1.field4289) {
			return -1;
		} else {
			return this.field4289 > var1.field4289 ? 1 : 0;
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class363) {
			return this.field4290.equals(((class363) (var1)).field4290);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int hashCode() {
		return this.field4290.hashCode();
	}

	public int compareTo(Object var1) {
		return this.method6611(((class363) (var1)));
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2040795706")
	static final void method6621() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) {
			var0 = class28.localPlayer.x;
			var1 = class28.localPlayer.y;
			if (ObjectSound.oculusOrbFocalPointX - var0 < -500 || ObjectSound.oculusOrbFocalPointX - var0 > 500 || class306.oculusOrbFocalPointY - var1 < -500 || class306.oculusOrbFocalPointY - var1 > 500) {
				ObjectSound.oculusOrbFocalPointX = var0;
				class306.oculusOrbFocalPointY = var1;
			}
			if (var0 != ObjectSound.oculusOrbFocalPointX) {
				ObjectSound.oculusOrbFocalPointX += (var0 - ObjectSound.oculusOrbFocalPointX) / 16;
			}
			if (var1 != class306.oculusOrbFocalPointY) {
				class306.oculusOrbFocalPointY += (var1 - class306.oculusOrbFocalPointY) / 16;
			}
			var2 = ObjectSound.oculusOrbFocalPointX >> 7;
			var3 = class306.oculusOrbFocalPointY >> 7;
			var4 = SecureRandomFuture.getTileHeight(ObjectSound.oculusOrbFocalPointX, class306.oculusOrbFocalPointY, FriendSystem.Client_plane);
			var5 = 0;
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) {
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
						int var8 = FriendSystem.Client_plane;
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) {
							++var8;
						}
						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7];
						if (var9 > var5) {
							var5 = var9;
						}
					}
				}
			}
			var6 = var5 * 192;
			if (var6 > 98048) {
				var6 = 98048;
			}
			if (var6 < 32768) {
				var6 = 32768;
			}
			if (var6 > Client.field581) {
				Client.field581 += (var6 - Client.field581) / 24;
			} else if (var6 < Client.field581) {
				Client.field581 += (var6 - Client.field581) / 80;
			}
			FileSystem.field1753 = SecureRandomFuture.getTileHeight(class28.localPlayer.x, class28.localPlayer.y, FriendSystem.Client_plane) - Client.camFollowHeight;
		} else if (Client.oculusOrbState == 1) {
			BuddyRankComparator.method2698();
			short var10 = -1;
			if (KeyHandler.KeyHandler_pressedKeys[33]) {
				var10 = 0;
			} else if (KeyHandler.KeyHandler_pressedKeys[49]) {
				var10 = 1024;
			}
			if (KeyHandler.KeyHandler_pressedKeys[48]) {
				if (var10 == 0) {
					var10 = 1792;
				} else if (var10 == 1024) {
					var10 = 1280;
				} else {
					var10 = 1536;
				}
			} else if (KeyHandler.KeyHandler_pressedKeys[50]) {
				if (var10 == 0) {
					var10 = 256;
				} else if (var10 == 1024) {
					var10 = 768;
				} else {
					var10 = 512;
				}
			}
			byte var11 = 0;
			if (KeyHandler.KeyHandler_pressedKeys[35]) {
				var11 = -1;
			} else if (KeyHandler.KeyHandler_pressedKeys[51]) {
				var11 = 1;
			}
			var2 = 0;
			if (var10 >= 0 || var11 != 0) {
				var2 = (KeyHandler.KeyHandler_pressedKeys[81]) ? Client.oculusOrbSlowedSpeed : Client.oculusOrbNormalSpeed;
				var2 *= 16;
				Client.field573 = var10;
				Client.field574 = var11;
			}
			if (Client.field572 < var2) {
				Client.field572 += var2 / 8;
				if (Client.field572 > var2) {
					Client.field572 = var2;
				}
			} else if (Client.field572 > var2) {
				Client.field572 = Client.field572 * 9 / 10;
			}
			if (Client.field572 > 0) {
				var3 = Client.field572 / 16;
				if (Client.field573 >= 0) {
					var0 = Client.field573 - PendingSpawn.cameraYaw & 2047;
					var4 = Rasterizer3D.Rasterizer3D_sine[var0];
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0];
					ObjectSound.oculusOrbFocalPointX += var3 * var4 / 65536;
					class306.oculusOrbFocalPointY += var3 * var5 / 65536;
				}
				if (Client.field574 != 0) {
					FileSystem.field1753 += var3 * Client.field574;
					if (FileSystem.field1753 > 0) {
						FileSystem.field1753 = 0;
					}
				}
			} else {
				Client.field573 = -1;
				Client.field574 = -1;
			}
			if (KeyHandler.KeyHandler_pressedKeys[13]) {
				Client.packetWriter.addNode(class433.getPacketBufferNode(ClientPacket.FREECAM_EXIT, Client.packetWriter.isaacCipher));
				Client.oculusOrbState = 0;
			}
		}
		if (MouseHandler.MouseHandler_currentButton == 4 && ObjectSound.mouseCam) {
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY;
			Client.camAngleDX = var0 * 2;
			Client.mouseCamClickedY = (var0 != -1 && var0 != 1) ? (Client.mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y;
			var1 = Client.mouseCamClickedX - MouseHandler.MouseHandler_x;
			Client.camAngleDY = var1 * 2;
			Client.mouseCamClickedX = (var1 != -1 && var1 != 1) ? (MouseHandler.MouseHandler_x + Client.mouseCamClickedX) / 2 : MouseHandler.MouseHandler_x;
		} else {
			if (KeyHandler.KeyHandler_pressedKeys[96]) {
				Client.camAngleDY += (-24 - Client.camAngleDY) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[97]) {
				Client.camAngleDY += (24 - Client.camAngleDY) / 2;
			} else {
				Client.camAngleDY /= 2;
			}
			if (KeyHandler.KeyHandler_pressedKeys[98]) {
				Client.camAngleDX += (12 - Client.camAngleDX) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[99]) {
				Client.camAngleDX += (-12 - Client.camAngleDX) / 2;
			} else {
				Client.camAngleDX /= 2;
			}
			Client.mouseCamClickedY = MouseHandler.MouseHandler_y;
			Client.mouseCamClickedX = MouseHandler.MouseHandler_x;
		}
		Client.camAngleY = Client.camAngleDY / 2 + Client.camAngleY & 2047;
		Client.camAngleX += Client.camAngleDX / 2;
		if (Client.camAngleX < 128) {
			Client.camAngleX = 128;
		}
		if (Client.camAngleX > 383) {
			Client.camAngleX = 383;
		}
	}
}