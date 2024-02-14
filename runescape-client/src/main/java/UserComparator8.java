import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("ao")
	static int[] field1457;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lua;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("aq")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lry;Lry;I)I",
		garbageValue = "-1579115164"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) {
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2029946391"
	)
	static final boolean method2944() {
		return ViewportMouse.ViewportMouse_isInViewport;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lng;II)V",
		garbageValue = "-1245873869"
	)
	public static void method2942(Widget var0, int var1) {
		ItemComposition var2 = ArchiveDiskActionHandler.ItemDefinition_get(var1);
		var0.field3774.equipment[var2.maleModel] = var1 + 512;
		if (var2.maleModel1 != -1) {
			var0.field3774.equipment[var2.maleModel1] = 0;
		}

		if (var2.maleModel2 != -1) {
			var0.field3774.equipment[var2.maleModel2] = 0;
		}

		var0.field3774.method6477();
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-30"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (Projectile.friendsChat != null) {
			PacketBufferNode var1 = ViewportMouse.getPacketBufferNode(ClientPacket.field3259, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class145.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
