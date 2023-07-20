import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("ay")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("ar")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public static boolean method2273() {
		if (!class306.field3399.isEmpty()) {
			return true;
		} else {
			return !class306.musicSongs.isEmpty() && class306.musicSongs.get(0) != null && ((MusicSong)class306.musicSongs.get(0)).midiPcmStream != null ? ((MusicSong)class306.musicSongs.get(0)).midiPcmStream.isReady() : false;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "409263053"
	)
	static final void method2271(String var0) {
		PacketBufferNode var1 = class503.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(class501.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}
}
