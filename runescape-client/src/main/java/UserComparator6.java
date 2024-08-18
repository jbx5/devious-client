import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = -1622474891
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("ab")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsc;Lsc;B)I",
		garbageValue = "112"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "10"
	)
	static void method3100(int var0, int var1, int var2, int var3) {
		class332.musicPlayerStatus = var0;
		class332.field3568 = var1;
		class332.field3570 = var2;
		class332.field3567 = var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-2061956312"
	)
	static final void method3099(String var0, int var1) {
		PacketBufferNode var2 = class218.getPacketBufferNode(ClientPacket.field3306, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(class526.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeByteSub(var1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "10"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = class218.getPacketBufferNode(ClientPacket.field3335, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class526.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
