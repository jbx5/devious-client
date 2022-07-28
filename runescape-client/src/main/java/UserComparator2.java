import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

import java.util.Comparator;
@ObfuscatedName("qt")
@Implements("UserComparator2")
public class UserComparator2 implements Comparator {
	@ObfuscatedName("o")
	@Export("reversed")
	final boolean reversed;

	public UserComparator2(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lnd;Lnd;I)I", garbageValue = "2076521262")
	@Export("compare_bridged")
	int compare_bridged(User var1, User var2) {
		return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged(((User) (var1)), ((User) (var2)));
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "1783163879")
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = class433.getPacketBufferNode(ClientPacket.CLAN_JOINCHAT, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class92.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}