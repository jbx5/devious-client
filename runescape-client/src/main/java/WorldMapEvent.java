import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -716843431
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILnj;Lnj;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Lmd;",
		garbageValue = "8024"
	)
	public static PacketBufferNode method6095() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIIII)V",
		garbageValue = "-583873077"
	)
	static void method6096(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
		var1 = var1 * 128 + 64;
		var2 = var2 * 128 + 64;
		var3 = var3 * 128 + 64;
		var4 = var4 * 128 + 64;
		Projectile var14 = new Projectile(var6, var0, var1, var2, SoundSystem.getTileHeight(ModeWhere.worldView, var1, var2, var0) - var7, var9 + Client.cycle, var10 + Client.cycle, var11, var12, var13, var5, var8);
		var14.setDestination(var3, var4, SoundSystem.getTileHeight(ModeWhere.worldView, var3, var4, var0) - var8, var9 + Client.cycle);
		ModeWhere.worldView.projectiles.addFirst(var14);
	}
}
