import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import net.runelite.mapping.Export;
@ObfuscatedName("hw")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -1825592271)
	@Export("id")
	int id = -1;

	@ObfuscatedName("q")
	@Export("internalName")
	String internalName;

	@ObfuscatedName("f")
	@Export("externalName")
	String externalName;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 769973147)
	@Export("backGroundColor")
	int backGroundColor = -1;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 1429277531)
	@Export("zoom")
	int zoom = -1;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lkp;")
	@Export("origin")
	Coord origin = null;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = -429438279)
	@Export("regionLowX")
	int regionLowX = Integer.MAX_VALUE;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1448353139)
	@Export("regionHighX")
	int regionHighX = 0;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 1329366581)
	@Export("regionLowY")
	int regionLowY = Integer.MAX_VALUE;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 829638635)
	@Export("regionHighY")
	int regionHighY = 0;

	@ObfuscatedName("d")
	@Export("isMain")
	boolean isMain = false;

	@ObfuscatedName("n")
	@Export("sections")
	LinkedList sections;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;II)V", garbageValue = "587651130")
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqw;I)Lil;", garbageValue = "-542562363")
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		WorldMapSectionType var3 = ((WorldMapSectionType) (class271.findEnumerated(WorldMapSectionType.method4928(), var2)));
		Object var4 = null;
		switch (var3.type) {
			case 0 :
				var4 = new WorldMapSection0();
				break;
			case 1 :
				var4 = new class228();
				break;
			case 2 :
				var4 = new WorldMapSection1();
				break;
			case 3 :
				var4 = new WorldMapSection2();
				break;
			default :
				throw new IllegalStateException("");
		}
		((WorldMapSection) (var4)).read(var1);
		return ((WorldMapSection) (var4));
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IIIB)Z", garbageValue = "1")
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "-634436531")
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
	@ObfuscatedSignature(descriptor = "(IIII)[I", garbageValue = "1929273885")
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(III)Lkp;", garbageValue = "910511543")
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2103527641")
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator();
		while (var1.hasNext()) {
			WorldMapSection var2 = ((WorldMapSection) (var1.next()));
			var2.expandBounds(this);
		} 
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1693756717")
	@Export("getId")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-31")
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;", garbageValue = "21")
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-870184786")
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-2044429655")
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "9")
	@Export("getZoom")
	public int getZoom() {
		return this.zoom;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-34")
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1398742159")
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1880886563")
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "31")
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "625476090")
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-843965541")
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1385080775")
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(B)Lkp;", garbageValue = "-23")
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin);
	}
}