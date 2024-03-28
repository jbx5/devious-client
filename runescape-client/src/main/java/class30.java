import java.awt.Image;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
public class class30 {
	@ObfuscatedName("bd")
	static Image field147;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "-174828521"
	)
	static final boolean method426(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		Buffer var4 = new Buffer(var0);
		int var5 = -1;

		label69:
		while (true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;

			while (true) {
				int var9;
				while (!var8) {
					var9 = var4.readUShortSmart();
					if (var9 == 0) {
						continue label69;
					}

					var7 += var9 - 1;
					int var10 = var7 & 63;
					int var11 = var7 >> 6 & 63;
					int var12 = var4.readUnsignedByte() >> 2;
					int var13 = var11 + var1;
					int var14 = var10 + var2;
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
						ObjectComposition var15 = MouseRecorder.getObjectDefinition(var5);
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
							if (!var15.needsModelFiles()) {
								++Client.field727;
								var3 = false;
							}

							var8 = true;
						}
					}
				}

				var9 = var4.readUShortSmart();
				if (var9 == 0) {
					break;
				}

				var4.readUnsignedByte();
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lck;B)V",
		garbageValue = "-90"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			Decimator.method1085(var0.isMembersOnly());
		}

		if (var0.properties != Client.worldProperties) {
			GrandExchangeEvents.method7082(GameEngine.archive8, var0.properties);
		}

		class166.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		class430.field4669 = var0.field831;
		HttpRequest.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		SoundCache.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		DesktopPlatformInfoProvider.currentPort = HttpRequest.worldPort;
	}
}
