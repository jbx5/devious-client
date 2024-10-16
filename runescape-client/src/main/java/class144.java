import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
class class144 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class145 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lfr;Lvl;I)V"
	)
	class144(class145 var1, Buffer var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3509(this.val$p, this.val$version);
		return null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;ZLqi;I)V",
		garbageValue = "1720170461"
	)
	public static void method3506(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		ItemComposition.ItemDefinition_archive = var0;
		TransformationMatrix.ItemDefinition_modelArchive = var1;
		HttpAuthenticationHeader.ItemDefinition_inMembersWorld = var2;
		ItemComposition.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10);
		class190.ItemDefinition_fontPlain11 = var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "1809402905"
	)
	static final void method3502(String var0, int var1) {
		PacketBufferNode var2 = class113.getPacketBufferNode(ClientPacket.field3388, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(World.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeByteSub(var1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var2);
	}
}
