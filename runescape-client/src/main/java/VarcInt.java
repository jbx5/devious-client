import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("an")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	public VarcInt() {
		this.persist = false;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;S)V",
		garbageValue = "-14009"
	)
	public void method4815(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method4816(var1, var2);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvg;II)V",
		garbageValue = "-187876998"
	)
	void method4816(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[Lfj;",
		garbageValue = "-115"
	)
	static class143[] method4823() {
		return new class143[]{class143.field1650, class143.field1640, class143.field1645, class143.field1642, class143.field1643, class143.field1644, class143.field1641, class143.field1646, class143.field1647};
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1443728713"
	)
	static final void method4817(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class47.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method3577()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = class218.getPacketBufferNode(ClientPacket.field3343, Client.packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + class526.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				Client.packetWriter.addNode(var5);
			}
		}
	}
}
