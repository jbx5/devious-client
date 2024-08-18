import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public class class138 implements class128 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "0"
	)
	static final int method3247(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "346149035"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		class171.clear();
		ConcurrentMidiTask.topLevelWorldView.clear();
		Client.field735.method5345();
		System.gc();
		class92.method2440(0, 0);
		class147.method3342();
		Client.playingJingle = false;
		AbstractWorldMapData.method5949();
		UserComparator3.updateGameState(10);
		Client.serverCycle = 0;
		AsyncHttpResponse.method265().method4625();
		AsyncHttpResponse.method265().method4626();
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "34"
	)
	static final int method3250() {
		float var0 = 200.0F * ((float)TileItem.clientPreferences.getBrightness() - 0.5F);
		return 100 - Math.round(var0);
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-15"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (HttpRequestTask.friendsChat != null) {
			PacketBufferNode var1 = class218.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class526.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
