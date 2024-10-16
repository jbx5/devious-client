import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("World")
public class World {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lct;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 24621921
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1663533135
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("ae")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("am")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2073291263
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1020284873
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -770215649
	)
	@Export("population")
	int population;
	@ObfuscatedName("af")
	@Export("host")
	String host;
	@ObfuscatedName("ar")
	@Export("activity")
	String activity;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 580571777
	)
	@Export("location")
	int location;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1277016429
	)
	@Export("index")
	int index;
	@ObfuscatedName("ag")
	String field821;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-513824537"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (class552.field5433.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-69"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (class552.field5430.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-328780430"
	)
	boolean method1959() {
		return (class552.field5415.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "296653376"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (class552.field5416.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2144946940"
	)
	boolean method1961() {
		return (class552.field5425.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-651140387"
	)
	boolean method1962() {
		return (class552.field5443.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-118"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (class552.field5439.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1283647063"
	)
	boolean method1964() {
		return (class552.field5444.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "31015"
	)
	boolean method1965() {
		return (class552.field5422.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1689973911"
	)
	boolean method1982() {
		return (class552.field5417.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ap")
	public static final void method2001(long var0) {
		if (var0 > 0L) {
			if (0L == var0 % 10L) {
				Canvas.method323(var0 - 1L);
				Canvas.method323(1L);
			} else {
				Canvas.method323(var0);
			}

		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "984314712"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-85"
	)
	static final void method2000(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class158.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method3786()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = class113.getPacketBufferNode(ClientPacket.field3408, Client.packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				Client.packetWriter.addNode(var5);
			}
		}
	}
}
