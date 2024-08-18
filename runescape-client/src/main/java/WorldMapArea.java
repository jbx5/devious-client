import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 533462581
	)
	@Export("id")
	int id;
	@ObfuscatedName("ay")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("an")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -556777163
	)
	int field3058;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 615222679
	)
	int field3060;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1137577173
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1887650801
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 631093119
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 391088223
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1714400259
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("al")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("aj")
	@Export("sections")
	LinkedList sections;

	public WorldMapArea() {
		this.id = -1;
		this.field3058 = -1;
		this.field3060 = -16777216;
		this.zoom = -1;
		this.origin = null;
		this.regionLowX = Integer.MAX_VALUE;
		this.regionHighX = 0;
		this.regionLowY = Integer.MAX_VALUE;
		this.regionHighY = 0;
		this.isMain = false;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;II)V",
		garbageValue = "1775049323"
	)
	public void method5607(Buffer var1, int var2) {
		this.id = var2;
		this.internalName = var1.readStringCp1252NullTerminated();
		this.externalName = var1.readStringCp1252NullTerminated();
		this.origin = new Coord(var1.readInt());
		this.field3058 = var1.readInt();
		this.field3060 = var1.readInt();
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
		descriptor = "(Lvg;I)Lls;",
		garbageValue = "-1441072758"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		WorldMapSectionType var3 = (WorldMapSectionType)class134.findEnumerated(WorldMapSectionType.method5914(), var2);
		Object var4 = null;
		switch(var3.type) {
		case 0:
			var4 = new class287();
			break;
		case 1:
			var4 = new WorldMapSection2();
			break;
		case 2:
			var4 = new WorldMapSection1();
			break;
		case 3:
			var4 = new WorldMapSection0();
			break;
		default:
			throw new IllegalStateException("");
		}

		((WorldMapSection)var4).read(var1);
		return (WorldMapSection)var4;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "2008844907"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1694122801"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "107"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)Lnv;",
		garbageValue = "-1854041934"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-720812085"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator();

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next();
			var2.expandBounds(this);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-43"
	)
	@Export("getId")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "36672782"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "12"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-12"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2125398444"
	)
	int method5622() {
		return this.field3058;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1960418032"
	)
	int method5583() {
		return this.field3060;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-102"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1751791089"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1879183275"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1249606254"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2049988202"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1837977386"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-104"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-231394373"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lnv;",
		garbageValue = "-1454149892"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZB)I",
		garbageValue = "-14"
	)
	static int method5641(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return class109.method2863(var0, var1, var2);
		} else if (var0 < 1100) {
			return Message.method1186(var0, var1, var2);
		} else if (var0 < 1200) {
			return class451.method8398(var0, var1, var2);
		} else if (var0 < 1300) {
			return class246.method4970(var0, var1, var2);
		} else if (var0 < 1400) {
			return LoginState.method1212(var0, var1, var2);
		} else if (var0 < 1500) {
			return AbstractArchive.method7309(var0, var1, var2);
		} else if (var0 < 1600) {
			return ApproximateRouteStrategy.method1194(var0, var1, var2);
		} else if (var0 < 1700) {
			return FriendsChat.method8584(var0, var1, var2);
		} else if (var0 < 1800) {
			return class30.method421(var0, var1, var2);
		} else if (var0 < 1900) {
			return Message.method1163(var0, var1, var2);
		} else if (var0 < 2000) {
			return PlayerComposition.method6628(var0, var1, var2);
		} else if (var0 < 2100) {
			return Message.method1186(var0, var1, var2);
		} else if (var0 < 2200) {
			return class451.method8398(var0, var1, var2);
		} else if (var0 < 2300) {
			return class246.method4970(var0, var1, var2);
		} else if (var0 < 2400) {
			return LoginState.method1212(var0, var1, var2);
		} else if (var0 < 2500) {
			return AbstractArchive.method7309(var0, var1, var2);
		} else if (var0 < 2600) {
			return class524.method9343(var0, var1, var2);
		} else if (var0 < 2700) {
			return GameObject.method4488(var0, var1, var2);
		} else if (var0 < 2800) {
			return SoundSystem.method819(var0, var1, var2);
		} else if (var0 < 2900) {
			return WorldMapCacheName.method6019(var0, var1, var2);
		} else if (var0 < 3000) {
			return PlayerComposition.method6628(var0, var1, var2);
		} else if (var0 < 3200) {
			return UserComparator9.method3078(var0, var1, var2);
		} else if (var0 < 3300) {
			return class271.method5432(var0, var1, var2);
		} else if (var0 < 3400) {
			return class108.method2858(var0, var1, var2);
		} else if (var0 < 3500) {
			return class167.method3572(var0, var1, var2);
		} else if (var0 < 3600) {
			return Sound.method5108(var0, var1, var2);
		} else if (var0 < 3700) {
			return class53.method1045(var0, var1, var2);
		} else if (var0 < 3800) {
			return class143.method3300(var0, var1, var2);
		} else if (var0 < 3900) {
			return InvDefinition.method4758(var0, var1, var2);
		} else if (var0 < 4000) {
			return RestClientThreadFactory.method188(var0, var1, var2);
		} else if (var0 < 4100) {
			return HttpMethod.method67(var0, var1, var2);
		} else if (var0 < 4200) {
			return class108.method2855(var0, var1, var2);
		} else if (var0 < 4300) {
			return WorldMapSectionType.method5912(var0, var1, var2);
		} else if (var0 < 5100) {
			return AbstractWorldMapIcon.method6018(var0, var1, var2);
		} else if (var0 < 5400) {
			return FloorDecoration.method3718(var0, var1, var2);
		} else if (var0 < 5600) {
			return class269.method5423(var0, var1, var2);
		} else if (var0 < 5700) {
			return class419.method7761(var0, var1, var2);
		} else if (var0 < 6300) {
			return MouseHandler.method638(var0, var1, var2);
		} else if (var0 < 6600) {
			return SpotAnimationDefinition.method4983(var0, var1, var2);
		} else if (var0 < 6700) {
			return WorldMapEvent.method6095(var0, var1, var2);
		} else if (var0 < 6800) {
			return ViewportMouse.method4376(var0, var1, var2);
		} else if (var0 < 6900) {
			return TileItem.method2849(var0, var1, var2);
		} else if (var0 < 7000) {
			return WorldMapRenderer.method5798(var0, var1, var2);
		} else if (var0 < 7100) {
			return EnumComposition.method4895(var0, var1, var2);
		} else if (var0 < 7200) {
			return class499.method8954(var0, var1, var2);
		} else if (var0 < 7500) {
			return class169.method3597(var0, var1, var2);
		} else if (var0 < 7600) {
			return ArchiveLoader.method2381(var0, var1, var2);
		} else if (var0 < 7700) {
			return TextureProvider.method4174(var0, var1, var2);
		} else {
			return var0 < 8100 ? WorldMapLabel.method5961(var0, var1, var2) : 2;
		}
	}
}
