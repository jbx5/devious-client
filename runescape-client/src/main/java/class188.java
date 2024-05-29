import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
public abstract class class188 {
	@ObfuscatedName("bb")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("az")
	String field1965;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	final class185 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lhj;Ljava/lang/String;)V"
	)
	class188(class185 var1, String var2) {
		this.this$0 = var1;
		this.field1965 = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-435761148"
	)
	public abstract int vmethod3757();

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2059088308"
	)
	public int vmethod3759() {
		return -1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2073167750"
	)
	public String vmethod3764() {
		return null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "3"
	)
	public String method3760() {
		return this.field1965;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2086783673"
	)
	static final void method3766(String var0) {
		PacketBufferNode var1 = WorldMapElement.getPacketBufferNode(ClientPacket.field3308, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(class432.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lby;S)V",
		garbageValue = "-28974"
	)
	public static final void method3767(class51 var0) {
		class60.pcmPlayerProvider = var0;
	}
}
