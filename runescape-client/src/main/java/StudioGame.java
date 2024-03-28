import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("on")
@Implements("StudioGame")
public enum StudioGame implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("ab")
	@Export("name")
	public final String name;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 972217003
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "-10"
	)
	static final void method6870(String var0, int var1) {
		PacketBufferNode var2 = FadeInTask.getPacketBufferNode(ClientPacket.field3227, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(SequenceDefinition.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		var2.packetBuffer.writeByteAdd(var1);
		Client.packetWriter.addNode(var2);
	}
}
