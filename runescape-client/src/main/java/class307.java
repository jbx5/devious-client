import java.util.Collections;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
public class class307 {
	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class303[] var2 = PendingSpawn.method2330(); // L: 12

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 13
			class303 var4 = var2[var3]; // L: 14
			if (var4.field3621 > var0) {
				var0 = var4.field3621; // L: 16
			}

			if (var4.field3622 > var1) { // L: 17
				var1 = var4.field3622;
			}
		}

	} // L: 21

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([I[IB)V",
		garbageValue = "47"
	)
	public static void method5930(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) { // L: 43
			ArchiveDiskActionHandler.ByteArrayPool_alternativeSizes = var0;
			class137.ByteArrayPool_altSizeArrayCounts = new int[var0.length]; // L: 51
			UrlRequest.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < ArchiveDiskActionHandler.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 53
				UrlRequest.ByteArrayPool_arrays[var2] = new byte[var1[var2]][]; // L: 54
				ByteArrayPool.field4259.add(var0[var2]); // L: 55
			}

			Collections.sort(ByteArrayPool.field4259);
		} else {
			ArchiveDiskActionHandler.ByteArrayPool_alternativeSizes = null; // L: 44
			class137.ByteArrayPool_altSizeArrayCounts = null;
			UrlRequest.ByteArrayPool_arrays = null;
			FriendSystem.method1807(); // L: 47
		}
	} // L: 58

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-98"
	)
	public static boolean method5928(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) { // L: 45
			if (var0 != 0) { // L: 46
				char[] var1 = class342.cp1252AsciiExtension; // L: 48

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 49
					char var3 = var1[var2]; // L: 50
					if (var0 == var3) {
						return true; // L: 52
					}
				}
			}

			return false; // L: 57
		} else {
			return true;
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1715477286"
	)
	static final void method5929(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		var5 = Huffman.method5646(var5, var6); // L: 5285
		int var7 = 2048 - var3 & 2047; // L: 5286
		int var8 = 2048 - var4 & 2047; // L: 5287
		int var9 = 0; // L: 5288
		int var10 = 0; // L: 5289
		int var11 = var5; // L: 5290
		int var12;
		int var13;
		int var14;
		if (var7 != 0) { // L: 5291
			var12 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 5292
			var13 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 5293
			var14 = var10 * var13 - var5 * var12 >> 16; // L: 5294
			var11 = var5 * var13 + var12 * var10 >> 16; // L: 5295
			var10 = var14; // L: 5296
		}

		if (var8 != 0) { // L: 5298
			var12 = Rasterizer3D.Rasterizer3D_sine[var8]; // L: 5299
			var13 = Rasterizer3D.Rasterizer3D_cosine[var8]; // L: 5300
			var14 = var9 * var13 + var11 * var12 >> 16; // L: 5301
			var11 = var13 * var11 - var9 * var12 >> 16; // L: 5302
			var9 = var14; // L: 5303
		}

		if (Client.isCameraLocked) { // L: 5305
			class402.field4479 = var0 - var9; // L: 5306
			class152.field1724 = var1 - var10; // L: 5307
			ArchiveDiskActionHandler.field4010 = var2 - var11; // L: 5308
			class21.field120 = var3; // L: 5309
			Client.field789 = var4; // L: 5310
		} else {
			TaskHandler.cameraX = var0 - var9; // L: 5313
			SecureRandomFuture.cameraY = var1 - var10; // L: 5314
			ApproximateRouteStrategy.cameraZ = var2 - var11; // L: 5315
			class163.cameraPitch = var3; // L: 5316
			class10.cameraYaw = var4; // L: 5317
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class147.oculusOrbFocalPointX >> 7 != class67.localPlayer.x >> 7 || Language.oculusOrbFocalPointY >> 7 != class67.localPlayer.y >> 7)) { // L: 5319 5320
			var12 = class67.localPlayer.plane; // L: 5321
			var13 = class128.baseX * 64 + (class147.oculusOrbFocalPointX >> 7); // L: 5322
			var14 = WorldMapData_1.baseY * 64 + (Language.oculusOrbFocalPointY >> 7); // L: 5323
			PacketBufferNode var15 = class120.getPacketBufferNode(ClientPacket.field3045, Client.packetWriter.isaacCipher); // L: 5326
			var15.packetBuffer.writeByteAdd(var12); // L: 5327
			var15.packetBuffer.writeShort(var14); // L: 5328
			var15.packetBuffer.writeIntIME(Client.field754); // L: 5329
			var15.packetBuffer.writeShortLE(var13); // L: 5330
			Client.packetWriter.addNode(var15); // L: 5331
		}

	} // L: 5335
}
