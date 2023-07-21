import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 849917093
	)
	@Export("id")
	int id;
	@ObfuscatedName("ay")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("ar")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 898934693
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1787701241
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1354035795
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -527199435
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1541917825
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1923999583
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("aq")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("at")
	@Export("sections")
	LinkedList sections;

	public WorldMapArea() {
		this.id = -1;
		this.backGroundColor = -1;
		this.zoom = -1;
		this.origin = null;
		this.regionLowX = Integer.MAX_VALUE;
		this.regionHighX = 0;
		this.regionLowY = Integer.MAX_VALUE;
		this.regionHighY = 0;
		this.isMain = false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "1472949028"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		this.id = var2;
		this.internalName = var1.readStringCp1252NullTerminated();
		this.externalName = var1.readStringCp1252NullTerminated();
		this.origin = new Coord(var1.readInt());
		this.backGroundColor = var1.readInt();
		var1.readUnsignedByte();
		this.isMain = var1.readUnsignedByte() == 1;
		this.zoom = var1.readUnsignedByte();
		int var3 = var1.readUnsignedByte();
		this.sections = new LinkedList();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.sections.add(this.readWorldMapSection(var1));
		}

		this.setBounds();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)Lkz;",
		garbageValue = "2141604791"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		WorldMapSectionType[] var3 = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE3, WorldMapSectionType.WORLDMAPSECTIONTYPE1, WorldMapSectionType.WORLDMAPSECTIONTYPE0, WorldMapSectionType.WORLDMAPSECTIONTYPE2};
		WorldMapSectionType var4 = (WorldMapSectionType)ClientPreferences.findEnumerated(var3, var2);
		Object var5 = null;
		switch(var4.type) {
		case 0:
			var5 = new WorldMapSection1();
			break;
		case 1:
			var5 = new WorldMapSection2();
			break;
		case 2:
			var5 = new class261();
			break;
		case 3:
			var5 = new WorldMapSection0();
			break;
		default:
			throw new IllegalStateException("");
		}

		((WorldMapSection)var5).read(var1);
		return (WorldMapSection)var5;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "2035965907"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator();

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return false;
			}

			var5 = (WorldMapSection)var4.next();
		} while(!var5.containsCoord(var1, var2, var3));

		return true;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1924447461"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		int var3 = var1 / 64;
		int var4 = var2 / 64;
		if (var3 >= this.regionLowX && var3 <= this.regionHighX) {
			if (var4 >= this.regionLowY && var4 <= this.regionHighY) {
				Iterator var5 = this.sections.iterator();

				WorldMapSection var6;
				do {
					if (!var5.hasNext()) {
						return false;
					}

					var6 = (WorldMapSection)var5.next();
				} while(!var6.containsPosition(var1, var2));

				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-40"
	)
	@Export("position")
	public int[] position(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator();

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}

			var5 = (WorldMapSection)var4.next();
		} while(!var5.containsCoord(var1, var2, var3));

		return var5.getBorderTileLengths(var1, var2, var3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)Lmr;",
		garbageValue = "322661377"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		Iterator var3 = this.sections.iterator();

		WorldMapSection var4;
		do {
			if (!var3.hasNext()) {
				return null;
			}

			var4 = (WorldMapSection)var3.next();
		} while(!var4.containsPosition(var1, var2));

		return var4.coord(var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2141810509"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator();

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next();
			var2.expandBounds(this);
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-104"
	)
	@Export("getId")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "12"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1427046787"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "7"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-128"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-77"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1981016427"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-389390805"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-155817671"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1352292707"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-101"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Lmr;",
		garbageValue = "117"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1522833237"
	)
	static final boolean method5212(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1581255918"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class503.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeShortAddLE(var1);
		var2.packetBuffer.writeIntIME(var0);
		Client.packetWriter.addNode(var2);
	}
}
