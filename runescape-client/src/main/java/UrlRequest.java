import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1191249779
	)
	static int field1479;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2111422939
	)
	static int field1485;
	@ObfuscatedName("jv")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("aq")
	final URL field1483;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1821102533
	)
	volatile int field1482;
	@ObfuscatedName("ap")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1479 = -1;
		field1485 = -2;
	}

	UrlRequest(URL var1) {
		this.field1482 = field1479;
		this.field1483 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-15592"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1482 != field1479;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-872165"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1943999950"
	)
	public String method2978() {
		return this.field1483.toString();
	}

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1898898128"
	)
	static final void method2985(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3501()) {
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				PacketBufferNode var4 = class170.getPacketBufferNode(ClientPacket.field3348, Client.packetWriter.isaacCipher);
				var4.packetBuffer.writeByte(4 + Actor.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var4.packetBuffer.writeByte(var0);
				var4.packetBuffer.writeShort(var1);
				var4.packetBuffer.writeBoolean(var2);
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				Client.packetWriter.addNode(var4);
			}
		}
	}
}
