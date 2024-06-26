import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1624647145
	)
	@Export("id")
	int id;
	@ObfuscatedName("ad")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("ag")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1572976237
	)
	int field2571;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -361968561
	)
	int field2583;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -426935707
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -903805205
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1871336757
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1361976443
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 380817895
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("au")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("ah")
	@Export("sections")
	LinkedList sections;

	public WorldMapArea() {
		this.id = -1;
		this.field2571 = -1;
		this.field2583 = -16777216;
		this.zoom = -1;
		this.origin = null;
		this.regionLowX = Integer.MAX_VALUE;
		this.regionHighX = 0;
		this.regionLowY = Integer.MAX_VALUE;
		this.regionHighY = 0;
		this.isMain = false;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;IS)V",
		garbageValue = "192"
	)
	public void method4649(Buffer var1, int var2) {
		this.id = var2;
		this.internalName = var1.readStringCp1252NullTerminated();
		this.externalName = var1.readStringCp1252NullTerminated();
		this.origin = new Coord(var1.readInt());
		this.field2571 = var1.readInt();
		this.field2583 = var1.readInt();
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)Lkd;",
		garbageValue = "-194688966"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		WorldMapSectionType[] var3 = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE1, WorldMapSectionType.WORLDMAPSECTIONTYPE2, WorldMapSectionType.WORLDMAPSECTIONTYPE0, WorldMapSectionType.WORLDMAPSECTIONTYPE3};
		WorldMapSectionType var4 = (WorldMapSectionType)class210.findEnumerated(var3, var2);
		Object var5 = null;
		switch(var4.type) {
		case 0:
			var5 = new class251();
			break;
		case 1:
			var5 = new WorldMapSection1();
			break;
		case 2:
			var5 = new WorldMapSection2();
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "13"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1869476820"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "304606071"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Lnl;",
		garbageValue = "-1586067659"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1283844709"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator();

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next();
			var2.expandBounds(this);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-337614921"
	)
	@Export("getId")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "208292224"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "32"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "22"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-752420167"
	)
	int method4679() {
		return this.field2571;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "611772049"
	)
	int method4693() {
		return this.field2583;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "79"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1949011067"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1968118485"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-201388180"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "23683"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1335921585"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2083894596"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-93"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Lnl;",
		garbageValue = "32"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin);
	}

	@ObfuscatedName("ad")
	static double method4698(double var0, double var2, double var4) {
		return DevicePcmPlayerProvider.method313((var0 - var2) / var4) / var4;
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "98"
	)
	static void method4700() {
		if (class511.topLevelWorldView != null) {
			class511.topLevelWorldView.scene.method5451(class105.clientPreferences.getDrawDistance());
		}

	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)V",
		garbageValue = "-480638389"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
		if (!Client.isMenuOpen) {
			int var10 = var2;
			if (var2 >= 2000) {
				var10 = var2 - 2000;
			}

			boolean var11 = var10 == 16 || var10 == 17 || var10 >= 18 && var10 <= 22;
			boolean var12 = var11 || class221.method4235(var10);
			if (!var12) {
				boolean var13 = var10 == 1002 || var10 == 1003 || var10 == 1004;
				var12 = var13;
			}

			boolean var9 = var12 || var8 == -1 || SoundCache.localPlayer.worldView.id == var8;
			if (var9) {
				if (Client.menuOptionsCount < 500) {
					Client.menuActions[Client.menuOptionsCount] = var0;
					Client.menuTargets[Client.menuOptionsCount] = var1;
					Client.menuOpcodes[Client.menuOptionsCount] = var2;
					Client.menuIdentifiers[Client.menuOptionsCount] = var3;
					Client.menuArguments1[Client.menuOptionsCount] = var4;
					Client.menuArguments2[Client.menuOptionsCount] = var5;
					Client.menuItemIds[Client.menuOptionsCount] = var6;
					Client.menuWorldViewIds[Client.menuOptionsCount] = var8;
					Client.menuShiftClick[Client.menuOptionsCount] = var7;
					++Client.menuOptionsCount;
				}

			}
		}
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2024394882"
	)
	static final int method4653() {
		float var0 = 200.0F * ((float)class105.clientPreferences.getBrightness() - 0.5F);
		return 100 - Math.round(var0);
	}
}
