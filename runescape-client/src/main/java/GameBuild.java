import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	@Export("LIVE")
	public static final GameBuild LIVE;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	@Export("BUILDLIVE")
	public static final GameBuild BUILDLIVE;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	@Export("RC")
	public static final GameBuild RC;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	@Export("WIP")
	public static final GameBuild WIP;
	@ObfuscatedName("ai")
	@Export("name")
	public final String name;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -477858629
	)
	@Export("buildId")
	public final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lvn;",
		garbageValue = "1044582887"
	)
	@Export("getDbTableType")
	public static DbTableType getDbTableType(int var0) {
		DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbTableType.field5394.takeFile(39, var0);
			var1 = new DbTableType();
			if (var2 != null) {
				var1.method9973(new Buffer(var2));
			}

			var1.method9969();
			DbTableType.DBTableType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1587939232"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class113.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeIntME(var0);
		var2.packetBuffer.writeShort(var1);
		Client.packetWriter.addNode(var2);
	}
}
