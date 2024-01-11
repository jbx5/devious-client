import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
@Implements("HttpMethod")
public class HttpMethod implements Enum {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("POST")
	public static final HttpMethod POST;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("GET")
	public static final HttpMethod GET;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("PUT")
	static final HttpMethod PUT;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("PATCH")
	static final HttpMethod PATCH;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("DELETE")
	static final HttpMethod DELETE;
	@ObfuscatedName("bi")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("ua")
	@ObfuscatedGetter(
		intValue = -1484275712
	)
	static int field29;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1539111659
	)
	int field22;
	@ObfuscatedName("ag")
	@Export("name")
	String name;
	@ObfuscatedName("ao")
	boolean field25;
	@ObfuscatedName("ae")
	boolean field26;

	static {
		POST = new HttpMethod(0, "POST", true, true);
		GET = new HttpMethod(1, "GET", true, false);
		PUT = new HttpMethod(2, "PUT", false, true);
		PATCH = new HttpMethod(3, "PATCH", false, true);
		DELETE = new HttpMethod(4, "DELETE", false, true);
	}

	HttpMethod(int var1, String var2, boolean var3, boolean var4) {
		this.field22 = var1;
		this.name = var2;
		this.field25 = var3;
		this.field26 = var4;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1549455343"
	)
	boolean method64() {
		return this.field25;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field22;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-12"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1715077183"
	)
	boolean method63() {
		return this.field26;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhl;",
		garbageValue = "15"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-781544794"
	)
	static final void method79() {
		if (SecureUrlRequester.Client_plane != Client.field732) {
			Client.field732 = SecureUrlRequester.Client_plane;
			class102.method2738(SecureUrlRequester.Client_plane);
		}

	}

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-888075873"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = class482.getPacketBufferNode(ClientPacket.field3217, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(CollisionMap.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "2023850938"
	)
	static final void method69(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3492()) {
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				PacketBufferNode var4 = class482.getPacketBufferNode(ClientPacket.field3231, Client.packetWriter.isaacCipher);
				var4.packetBuffer.writeByte(4 + CollisionMap.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var4.packetBuffer.writeByte(var0);
				var4.packetBuffer.writeShort(var1);
				var4.packetBuffer.writeBoolean(var2);
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				Client.packetWriter.addNode(var4);
			}
		}
	}
}
