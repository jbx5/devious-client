import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import net.runelite.mapping.Export;
@ObfuscatedName("hg")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1597712321)
	@Export("id")
	int id;

	@ObfuscatedName("v")
	@Export("internalName")
	String internalName;

	@ObfuscatedName("q")
	@Export("externalName")
	String externalName;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1737833383)
	@Export("backGroundColor")
	int backGroundColor;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1942406311)
	@Export("zoom")
	int zoom;

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Lkd;")
	@Export("origin")
	Coord origin;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -2103250031)
	@Export("regionLowX")
	int regionLowX;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1341200167)
	@Export("regionHighX")
	int regionHighX;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 986248981)
	@Export("regionLowY")
	int regionLowY;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -360253211)
	@Export("regionHighY")
	int regionHighY;

	@ObfuscatedName("s")
	@Export("isMain")
	boolean isMain;

	@ObfuscatedName("t")
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqt;II)V", garbageValue = "1424101591")
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lqt;I)Lih;", garbageValue = "2053446291")
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		WorldMapSectionType var3 = ((WorldMapSectionType) (Actor.findEnumerated(WorldMapSectionType.method4950(), var2)));
		Object var4 = null;
		switch (var3.type) {
			case 0 :
				var4 = new class228();
				break;
			case 1 :
				var4 = new WorldMapSection2();
				break;
			case 2 :
				var4 = new WorldMapSection0();
				break;
			case 3 :
				var4 = new WorldMapSection1();
				break;
			default :
				throw new IllegalStateException("");
		}
		((WorldMapSection) (var4)).read(var1);
		return ((WorldMapSection) (var4));
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IIII)Z", garbageValue = "-876642942")
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "-1025417")
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(IIII)[I", garbageValue = "-885448620")
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(III)Lkd;", garbageValue = "-1315713782")
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1353069052")
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator();
		while (var1.hasNext()) {
			WorldMapSection var2 = ((WorldMapSection) (var1.next()));
			var2.expandBounds(this);
		} 
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1950741707")
	@Export("getId")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "15")
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "1728819039")
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;", garbageValue = "123")
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-410449947")
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1613337186")
	@Export("getZoom")
	public int getZoom() {
		return this.zoom;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-28")
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1776623593")
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "50")
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "47612520")
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1452541812")
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "709733027")
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "43")
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(I)Lkd;", garbageValue = "-2060886066")
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "([BZB)Ljava/lang/Object;", garbageValue = "-9")
	public static Object method4621(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0.length > 136) {
			DirectByteArrayCopier var2 = new DirectByteArrayCopier();
			var2.set(var0);
			return var2;
		} else {
			return var0;
		}
	}
}