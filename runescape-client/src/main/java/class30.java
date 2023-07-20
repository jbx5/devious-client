import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
public class class30 {
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "[Luu;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Ldc;",
		garbageValue = "-1173392084"
	)
	static Script method448(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = class126.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = class126.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}

					var2 = SoundCache.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, (long)(var0 << 16));
						return var2;
					}
				}

				return null;
			}
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "2078832853"
	)
	static int method447(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "-74"
	)
	static final void method446(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		var5 = UserList.method8016(var5, var6);
		int var7 = 2048 - var3 & 2047;
		int var8 = 2048 - var4 & 2047;
		int var9 = 0;
		int var10 = 0;
		int var11 = var5;
		int var12;
		int var13;
		int var14;
		if (var7 != 0) {
			var12 = Rasterizer3D.Rasterizer3D_sine[var7];
			var13 = Rasterizer3D.Rasterizer3D_cosine[var7];
			var14 = var13 * var10 - var12 * var5 >> 16;
			var11 = var12 * var10 + var13 * var5 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			var12 = Rasterizer3D.Rasterizer3D_sine[var8];
			var13 = Rasterizer3D.Rasterizer3D_cosine[var8];
			var14 = var12 * var11 + var13 * var9 >> 16;
			var11 = var11 * var13 - var9 * var12 >> 16;
			var9 = var14;
		}

		if (Client.isCameraLocked) {
			class422.field4606 = var0 - var9;
			FadeInTask.field4522 = var1 - var10;
			ModeWhere.field4410 = var2 - var11;
			class165.field1791 = var3;
			class4.field11 = var4;
		} else {
			class157.cameraX = var0 - var9;
			class384.cameraY = var1 - var10;
			SoundSystem.cameraZ = var2 - var11;
			class19.cameraPitch = var3;
			class456.cameraYaw = var4;
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class467.oculusOrbFocalPointX >> 7 != class136.localPlayer.x >> 7 || class36.oculusOrbFocalPointY >> 7 != class136.localPlayer.y >> 7)) {
			var12 = class136.localPlayer.plane;
			var13 = AbstractArchive.baseX * 64 + (class467.oculusOrbFocalPointX >> 7);
			var14 = class148.baseY * 64 + (class36.oculusOrbFocalPointY >> 7);
			PacketBufferNode var15 = class503.getPacketBufferNode(ClientPacket.field3165, Client.packetWriter.isaacCipher);
			var15.packetBuffer.writeIntIME(Client.field624);
			var15.packetBuffer.writeShortAddLE(var13);
			var15.packetBuffer.writeByteAdd(var12);
			var15.packetBuffer.writeShortAdd(var14);
			Client.packetWriter.addNode(var15);
		}

	}
}
