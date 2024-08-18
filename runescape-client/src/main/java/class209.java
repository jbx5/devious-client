import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
public class class209 extends class224 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1008051007
	)
	int field2316;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	final class221 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lii;Ljava/lang/String;I)V"
	)
	class209(class221 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2316 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-564375811"
	)
	public int vmethod4725() {
		return 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-8"
	)
	public int vmethod4732() {
		return this.field2316;
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "10"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			TileItem.clientPreferences.updateRoofsHidden(!TileItem.clientPreferences.isRoofsHidden());
			if (TileItem.clientPreferences.isRoofsHidden()) {
				class269.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				class269.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.startsWith("zbuf")) {
			boolean var1 = ApproximateRouteStrategy.method1193(var0.substring(5).trim()) == 1;
			DynamicObject.client.method588(var1);
			Rasterizer3D.method3727(var1);
		}

		if (var0.equalsIgnoreCase("z")) {
			Client.z = !Client.z;
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			TileItem.clientPreferences.toggleDisplayFps();
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
				TileItem.clientPreferences.setDrawDistance(var2);
			} catch (NumberFormatException var6) {
				class269.addGameMessage(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var3[1]));
			}
		}

		if (var0.startsWith("settilerendermode")) {
			var3 = var0.split(" ");

			try {
				var2 = Integer.parseInt(var3[1]);
				ConcurrentMidiTask.topLevelWorldView.scene.method3926(class173.method3629()[var2]);
			} catch (NumberFormatException var5) {
				class269.addGameMessage(99, "", String.format("Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s", var3[1]));
			}
		}

		if (var0.equalsIgnoreCase("getdrawdistance")) {
			class269.addGameMessage(99, "", String.format("%d", TileItem.clientPreferences.getDrawDistance()));
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				class219.worldMap.showCoord = !class219.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				TileItem.clientPreferences.updateDisplayFps(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				TileItem.clientPreferences.updateDisplayFps(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				class275.method5488();
			}
		}

		PacketBufferNode var7 = class218.getPacketBufferNode(ClientPacket.DOCHEAT, Client.packetWriter.isaacCipher);
		var7.packetBuffer.writeByte(var0.length() + 1);
		var7.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var7);
	}
}
