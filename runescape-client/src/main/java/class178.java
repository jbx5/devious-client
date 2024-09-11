import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
public class class178 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("field1913")
	public static EvictingDualNodeHashTable field1913;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;

	static {
		field1913 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1507663378"
	)
	public static void method3793() {
		VarbitComposition.VarbitDefinition_cached.clear();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "-578688127"
	)
	public static long method3794(int var0) {
		if (var0 > 63) {
			throw new class430("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
		} else {
			return (long)Math.pow(2.0D, (double)var0) - 1L;
		}
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-246189887"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			class461.clientPreferences.updateRoofsHidden(!class461.clientPreferences.isRoofsHidden());
			if (class461.clientPreferences.isRoofsHidden()) {
				StructComposition.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				StructComposition.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.startsWith("zbuf")) {
			boolean var1 = TaskHandler.method4455(var0.substring(5).trim()) == 1;
			class1.client.method497(var1);
			Rasterizer3D.method4803(var1);
		}

		if (var0.equalsIgnoreCase("z")) {
			Client.z = !Client.z;
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			class461.clientPreferences.toggleDisplayFps();
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		int var2;
		String[] var3;
		if (var0.startsWith("setdrawdistance")) {
			var3 = var0.split(" ");

			try {
				var2 = Integer.parseInt(var3[1]);
				class461.clientPreferences.setDrawDistance(var2);
			} catch (NumberFormatException var6) {
				StructComposition.addGameMessage(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var3[1]));
			}
		}

		if (var0.startsWith("settilerendermode")) {
			var3 = var0.split(" ");

			try {
				var2 = Integer.parseInt(var3[1]);
				ClientPreferences.topLevelWorldView.scene.method4931(class232.method4634()[var2]);
			} catch (NumberFormatException var5) {
				StructComposition.addGameMessage(99, "", String.format("Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s", var3[1]));
			}
		}

		if (var0.equalsIgnoreCase("getdrawdistance")) {
			StructComposition.addGameMessage(99, "", String.format("%d", class461.clientPreferences.getDrawDistance()));
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				UserComparator8.worldMap.showCoord = !UserComparator8.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				class461.clientPreferences.updateDisplayFps(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				class461.clientPreferences.updateDisplayFps(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				class375.method7427();
			}

			if (var0.equalsIgnoreCase("clientreload")) {
				class337.method6698();
			}
		}

		PacketBufferNode var7 = class141.getPacketBufferNode(ClientPacket.DOCHEAT, Client.packetWriter.isaacCipher);
		var7.packetBuffer.writeByte(var0.length() + 1);
		var7.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var7);
	}
}
