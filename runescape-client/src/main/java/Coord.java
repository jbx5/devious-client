import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("kp")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("ne")
	@ObfuscatedGetter(intValue = 1208888331)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1220578687)
	@Export("plane")
	public int plane;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1712596677)
	@Export("x")
	public int x;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1113097037)
	@Export("y")
	public int y;

	@ObfuscatedSignature(descriptor = "(Lkp;)V")
	public Coord(Coord var1) {
		this.plane = var1.plane;
		this.x = var1.x;
		this.y = var1.y;
	}

	public Coord(int var1, int var2, int var3) {
		this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	public Coord(int var1) {
		if (var1 == -1) {
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3;
			this.x = var1 >> 14 & 16383;
			this.y = var1 & 16383;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "62533759")
	@Export("packed")
	public int packed() {
		int var2 = this.plane;
		int var3 = this.x;
		int var4 = this.y;
		int var1 = var2 << 28 | var3 << 14 | var4;
		return var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lkp;I)Z", garbageValue = "1957084070")
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) {
			return false;
		} else if (this.x != var1.x) {
			return false;
		} else {
			return this.y == var1.y;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", garbageValue = "37")
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
	}

	public String toString() {
		return this.toString(",");
	}

	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord(((Coord) (var1)));
		}
	}

	public int hashCode() {
		return this.packed();
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(descriptor = "(IIZB)V", garbageValue = "-72")
	static final void method5543(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3117()) {
				ClanChannelMember var3 = ((ClanChannelMember) (Client.currentClanChannels[var0].members.get(var1)));
				PacketBufferNode var4 = class433.getPacketBufferNode(ClientPacket.field3017, Client.packetWriter.isaacCipher);
				var4.packetBuffer.writeByte(4 + class92.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var4.packetBuffer.writeByte(var0);
				var4.packetBuffer.writeShort(var1);
				var4.packetBuffer.writeBoolean(var2);
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				Client.packetWriter.addNode(var4);
			}
		}
	}
}