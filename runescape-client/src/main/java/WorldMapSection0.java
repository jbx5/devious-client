import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -86185865
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1391149389
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 495226583
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1857189891
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -949232909
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -786465885
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 947228775
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1274435893
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 120528241
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1393218637
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -425948857
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1428979731
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -870860083
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -849374061
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I)V",
		garbageValue = "1844466074"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) {
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX;
		}

		if (var1.regionLowY > this.newY) {
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) {
			var1.regionHighY = this.newY;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1135530948"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1124460333"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "557011185"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
			return var4;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)Lmo;",
		garbageValue = "-1670709360"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
			int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-801073373"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte();
		this.newZ = var1.readUnsignedByte();
		this.oldX = var1.readUnsignedShort();
		this.oldChunkXLow = var1.readUnsignedByte();
		this.oldChunkXHigh = var1.readUnsignedByte();
		this.oldY = var1.readUnsignedShort();
		this.oldChunkYLow = var1.readUnsignedByte();
		this.oldChunkYHigh = var1.readUnsignedByte();
		this.newX = var1.readUnsignedShort();
		this.newChunkXLow = var1.readUnsignedByte();
		this.newChunkXHigh = var1.readUnsignedByte();
		this.newY = var1.readUnsignedShort();
		this.newChunkYLow = var1.readUnsignedByte();
		this.newChunkYHigh = var1.readUnsignedByte();
		this.postRead();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-15"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1252747607"
	)
	static void method5608() {
		class404.compass = null;
		ParamComposition.redHintArrowSprite = null;
		KitDefinition.mapSceneSprites = null;
		UserComparator4.headIconPkSprites = null;
		class157.headIconPrayerSprites = null;
		UserComparator8.headIconHintSprites = null;
		class47.mapDotSprites = null;
		EnumComposition.crossSprites = null;
		class103.field1336 = null;
		class36.scrollBarSprites = null;
		class178.field1854 = null;
	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "47"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3233, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
