import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ha")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = -246999917)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("Widget_fontsArchive")
	public static AbstractArchive Widget_fontsArchive;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -874065581)
	@Export("swColor")
	int swColor;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 1159712219)
	@Export("seColor")
	int seColor;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1006604365)
	@Export("neColor")
	int neColor;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -1851893905)
	@Export("nwColor")
	int nwColor;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 503057411)
	@Export("texture")
	int texture;

	@ObfuscatedName("q")
	@Export("isFlat")
	boolean isFlat = true;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -532188411)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lco;S)V", garbageValue = "203")
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		GraphicsObject.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(CI)Z", garbageValue = "-1527071876")
	public static final boolean method4416(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "110")
	static void method4417() {
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1337 = null;
		Client.packetWriter.field1339 = null;
		Client.packetWriter.field1330 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1336 = 0;
		Client.rebootTimer = 0;
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.minimapState = 0;
		Client.destinationX = 0;
		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}
		ScriptFrame.localPlayer = null;
		for (var0 = 0; var0 < Client.npcs.length; ++var0) {
			NPC var1 = Client.npcs[var0];
			if (var1 != null) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}
		ItemContainer.itemContainers = new NodeHashTable(32);
		class4.updateGameState(30);
		for (var0 = 0; var0 < 100; ++var0) {
			Client.field643[var0] = true;
		}
		PacketBufferNode var2 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(Canvas.getWindowedMode());
		var2.packetBuffer.writeShort(class7.canvasWidth);
		var2.packetBuffer.writeShort(WallDecoration.canvasHeight);
		Client.packetWriter.addNode(var2);
	}
}