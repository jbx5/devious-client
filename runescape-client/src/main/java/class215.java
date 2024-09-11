import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
public class class215 extends class230 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lua;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -362540747
	)
	static int field2352;
	@ObfuscatedName("gy")
	@Export("authServiceBaseUrl")
	static String authServiceBaseUrl;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 204902821
	)
	int field2351;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	final class227 this$0;

	@ObfuscatedSignature(
		descriptor = "(Liy;Ljava/lang/String;I)V"
	)
	class215(class227 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2351 = var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-24"
	)
	public int vmethod4613() {
		return 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "934706251"
	)
	public int vmethod4621() {
		return this.field2351;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ldo;I)V",
		garbageValue = "-1831834401"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		InterfaceParent.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2094644101"
	)
	static final void method4393(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3726()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketBufferNode var3 = class141.getPacketBufferNode(ClientPacket.field3307, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + class536.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}
}
