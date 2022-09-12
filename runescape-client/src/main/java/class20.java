import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
public class class20 implements Callable {
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lj;"
	)
	final class10 field114;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lu;Lj;)V"
	)
	class20(class14 var1, class10 var2) {
		this.this$0 = var1; // L: 46
		this.field114 = var2; // L: 47
	} // L: 48

	public Object call() throws Exception {
		try {
			while (this.field114.method95()) { // L: 53
				class28.method412(10L); // L: 54
			}
		} catch (IOException var2) { // L: 57
			return new class21("Error servicing REST query: " + var2.getMessage()); // L: 58
		}

		return this.field114.method97(); // L: 60
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Lcw;B)V",
		garbageValue = "80"
	)
	static final void method302(PendingSpawn var0) {
		long var1 = 0L; // L: 7692
		int var3 = -1; // L: 7693
		int var4 = 0; // L: 7694
		int var5 = 0; // L: 7695
		if (var0.type == 0) { // L: 7696
			var1 = MusicPatchNode.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 7697
			var1 = MusicPatchNode.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 7698
			var1 = MusicPatchNode.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) { // L: 7699
			var1 = MusicPatchNode.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var1 != 0L) { // L: 7700
			int var6 = MusicPatchNode.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 7701
			var3 = class156.Entity_unpackID(var1); // L: 7702
			var4 = var6 & 31; // L: 7703
			var5 = var6 >> 6 & 3; // L: 7704
		}

		var0.objectId = var3; // L: 7706
		var0.field1121 = var4; // L: 7707
		var0.field1119 = var5; // L: 7708
	} // L: 7709

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "417114904"
	)
	static final void method303(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 11990
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3265()) { // L: 11991
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 11992
				if (var2.rank == -1) { // L: 11993
					PacketBufferNode var3 = class120.getPacketBufferNode(ClientPacket.field2960, Client.packetWriter.isaacCipher); // L: 11994
					var3.packetBuffer.writeByte(3 + class357.stringCp1252NullTerminatedByteSize(var2.username.getName())); // L: 11995
					var3.packetBuffer.writeByte(var0); // L: 11996
					var3.packetBuffer.writeShort(var1); // L: 11997
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName()); // L: 11998
					Client.packetWriter.addNode(var3); // L: 11999
				}
			}
		}
	} // L: 12000
}
