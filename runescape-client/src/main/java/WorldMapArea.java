import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import net.runelite.mapping.Export;
@ObfuscatedName("ht")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 567189365)
	@Export("id")
	int id = -1;

	@ObfuscatedName("h")
	@Export("internalName")
	String internalName;

	@ObfuscatedName("w")
	@Export("externalName")
	String externalName;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 25779945)
	@Export("backGroundColor")
	int backGroundColor = -1;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -265908139)
	@Export("zoom")
	int zoom = -1;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lku;")
	@Export("origin")
	Coord origin = null;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 2010353697)
	@Export("regionLowX")
	int regionLowX = Integer.MAX_VALUE;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 1119275097)
	@Export("regionHighX")
	int regionHighX = 0;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1280794219)
	@Export("regionLowY")
	int regionLowY = Integer.MAX_VALUE;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 1477951297)
	@Export("regionHighY")
	int regionHighY = 0;

	@ObfuscatedName("d")
	@Export("isMain")
	boolean isMain = false;

	@ObfuscatedName("a")
	@Export("sections")
	LinkedList sections;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lqr;II)V", garbageValue = "9983538")
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lqr;I)Lim;", garbageValue = "700625358")
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		WorldMapSectionType var3 = ((WorldMapSectionType) (GameEngine.findEnumerated(WorldMapSectionType.method4874(), var2)));
		Object var4 = null;
		switch (var3.type) {
			case 0 :
				var4 = new WorldMapSection1();
				break;
			case 1 :
				var4 = new WorldMapSection2();
				break;
			case 2 :
				var4 = new WorldMapSection0();
				break;
			case 3 :
				var4 = new class228();
				break;
			default :
				throw new IllegalStateException("");
		}
		((WorldMapSection) (var4)).read(var1);
		return ((WorldMapSection) (var4));
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IIII)Z", garbageValue = "428800392")
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator();
		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return false;
			}
			var5 = ((WorldMapSection) (var4.next()));
		} while (!var5.containsCoord(var1, var2, var3) );
		return true;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "-2102592598")
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
					var6 = ((WorldMapSection) (var5.next()));
				} while (!var6.containsPosition(var1, var2) );
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IIIB)[I", garbageValue = "72")
	@Export("position")
	public int[] position(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator();
		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}
			var5 = ((WorldMapSection) (var4.next()));
		} while (!var5.containsCoord(var1, var2, var3) );
		return var5.getBorderTileLengths(var1, var2, var3);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(III)Lku;", garbageValue = "988180686")
	@Export("coord")
	public Coord coord(int var1, int var2) {
		Iterator var3 = this.sections.iterator();
		WorldMapSection var4;
		do {
			if (!var3.hasNext()) {
				return null;
			}
			var4 = ((WorldMapSection) (var3.next()));
		} while (!var4.containsPosition(var1, var2) );
		return var4.coord(var1, var2);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1801027745")
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator();
		while (var1.hasNext()) {
			WorldMapSection var2 = ((WorldMapSection) (var1.next()));
			var2.expandBounds(this);
		} 
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-1")
	@Export("getId")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(S)Z", garbageValue = "25933")
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "1367820704")
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-1306086529")
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "5")
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(S)I", garbageValue = "-21816")
	@Export("getZoom")
	public int getZoom() {
		return this.zoom;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-833261903")
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-898923248")
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(S)I", garbageValue = "16034")
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "851913129")
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "90")
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "2146368821")
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1795139080")
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(I)Lku;", garbageValue = "206318306")
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin);
	}
}