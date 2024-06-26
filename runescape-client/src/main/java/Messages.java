import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("aq")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 108964459
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	static IndexedSprite field1449;

	static {
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public static void method2916() {
		class177.field1915.clear();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-125"
	)
	static String method2917() {
		StringBuilder var0 = new StringBuilder();

		Message var2;
		for (Iterator var1 = Messages_hashTable.iterator(); var1.hasNext(); var0.append(var2.text).append('\n')) {
			var2 = (Message)var1.next();
			if (var2.sender != null && !var2.sender.isEmpty()) {
				var0.append(var2.sender).append(':');
			}
		}

		return var0.toString();
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "32"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (Decimator.friendsChat != null) {
			PacketBufferNode var1 = class170.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2136125959"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = class170.getPacketBufferNode(ClientPacket.field3365, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
