import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("am")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1288424165
	)
	@Export("world")
	public int world;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lvs;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "729982676"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}
}
