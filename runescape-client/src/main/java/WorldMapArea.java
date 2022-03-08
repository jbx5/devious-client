import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("hm")
@Implements("WorldMapArea")
public class WorldMapArea {
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = -599230807)
    @Export("id")
    int id;

    @ObfuscatedName("l")
    @Export("internalName")
    String internalName;

    @ObfuscatedName("s")
    @Export("externalName")
    String externalName;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -959729585)
    @Export("backGroundColor")
    int backGroundColor;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = 928807297)
    @Export("zoom")
    int zoom;

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "Ljd;")
    @Export("origin")
    Coord origin;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -836572327)
    @Export("regionLowX")
    int regionLowX;

    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -892419397)
    @Export("regionHighX")
    int regionHighX;

    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = 861224949)
    @Export("regionLowY")
    int regionLowY;

    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = -1400851623)
    @Export("regionHighY")
    int regionHighY;

    @ObfuscatedName("y")
    @Export("isMain")
    boolean isMain;

    @ObfuscatedName("u")
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
    @ObfuscatedSignature(descriptor = "(Lpi;IB)V", garbageValue = "1")
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

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Lpi;I)Liu;", garbageValue = "439067659")
    @Export("readWorldMapSection")
    WorldMapSection readWorldMapSection(Buffer var1) {
        int var2 = var1.readUnsignedByte();
        WorldMapSectionType var3 = ((WorldMapSectionType) (class140.findEnumerated(WorldMapSectionType.method4723(), var2)));
        Object var4 = null;
        switch (var3.type) {
            case 0 :
                var4 = new class221();
                break;
            case 1 :
                var4 = new WorldMapSection1();
                break;
            case 2 :
                var4 = new WorldMapSection0();
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

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(IIII)Z", garbageValue = "-1417053973")
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

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "1440161098")
    @Export("containsPosition")
    public boolean containsPosition(int var1, int var2) {
        int var3 = var1 / 64;
        int var4 = var2 / 64;
        if ((var3 >= this.regionLowX) && (var3 <= this.regionHighX)) {
            if ((var4 >= this.regionLowY) && (var4 <= this.regionHighY)) {
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

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(IIII)[I", garbageValue = "-397137406")
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

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(III)Ljd;", garbageValue = "-145226842")
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
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "59")
    @Export("setBounds")
    void setBounds() {
        Iterator var1 = this.sections.iterator();
        while (var1.hasNext()) {
            WorldMapSection var2 = ((WorldMapSection) (var1.next()));
            var2.expandBounds(this);
        } 
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "27")
    @Export("getId")
    public int getId() {
        return this.id;
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "0")
    @Export("getIsMain")
    public boolean getIsMain() {
        return this.isMain;
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "1548265452")
    @Export("getInternalName")
    public String getInternalName() {
        return this.internalName;
    }

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;", garbageValue = "-15")
    @Export("getExternalName")
    public String getExternalName() {
        return this.externalName;
    }

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1810355585")
    @Export("getBackGroundColor")
    int getBackGroundColor() {
        return this.backGroundColor;
    }

    @ObfuscatedName("h")
    @ObfuscatedSignature(descriptor = "(S)I", garbageValue = "27378")
    @Export("getZoom")
    public int getZoom() {
        return this.zoom;
    }

    @ObfuscatedName("q")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1331342031")
    @Export("getRegionLowX")
    public int getRegionLowX() {
        return this.regionLowX;
    }

    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1392879252")
    @Export("getRegionHighX")
    public int getRegionHighX() {
        return this.regionHighX;
    }

    @ObfuscatedName("p")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-20")
    @Export("getRegionLowY")
    public int getRegionLowY() {
        return this.regionLowY;
    }

    @ObfuscatedName("n")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1240574286")
    @Export("getRegionHighY")
    public int getRegionHighY() {
        return this.regionHighY;
    }

    @ObfuscatedName("m")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-967738245")
    @Export("getOriginX")
    public int getOriginX() {
        return this.origin.x;
    }

    @ObfuscatedName("d")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-967738245")
    @Export("getOriginPlane")
    public int getOriginPlane() {
        return this.origin.plane;
    }

    @ObfuscatedName("j")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-74")
    @Export("getOriginY")
    public int getOriginY() {
        return this.origin.y;
    }

    @ObfuscatedName("f")
    @ObfuscatedSignature(descriptor = "(B)Ljd;", garbageValue = "47")
    @Export("getOrigin")
    public Coord getOrigin() {
        return new Coord(this.origin);
    }

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-1770218583")
    static final void method4446(String var0) {
        StringBuilder var10000 = new StringBuilder().append(var0);
        Object var10001 = null;
        String var1 = var10000.append(" is already on your ignore list").toString();
        LoginScreenAnimation.addGameMessage(30, "", var1);
    }
}