import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("hw")
@Implements("WorldMapRegion")
public class WorldMapRegion {
    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "Liy;")
    @Export("WorldMapRegion_cachedSprites")
    static DemotingHashTable WorldMapRegion_cachedSprites;

    @ObfuscatedName("ez")
    @ObfuscatedSignature(descriptor = "Lkz;")
    @Export("archive19")
    static Archive archive19;

    @ObfuscatedName("gt")
    @ObfuscatedSignature(descriptor = "Lov;")
    @Export("WorldMapElement_fonts")
    static Fonts WorldMapElement_fonts;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = -1680571103)
    @Export("regionX")
    int regionX;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -562965229)
    @Export("regionY")
    int regionY;

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "Lhu;")
    @Export("worldMapData_0")
    WorldMapData_0 worldMapData_0;

    @ObfuscatedName("v")
    @Export("worldMapData1List")
    LinkedList worldMapData1List;

    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = -1182979997)
    @Export("backgroundColor")
    int backgroundColor;

    @ObfuscatedName("y")
    @ObfuscatedGetter(intValue = 852240481)
    @Export("pixelsPerTile")
    int pixelsPerTile;

    @ObfuscatedName("u")
    @Export("icon0List")
    List icon0List;

    @ObfuscatedName("h")
    @Export("iconMap")
    HashMap iconMap;

    @ObfuscatedName("q")
    @Export("fonts")
    final HashMap fonts;

    static {
        WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256);
    }

    WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
        this.regionX = var1;
        this.regionY = var2;
        this.worldMapData1List = new LinkedList();
        this.icon0List = new LinkedList();
        this.iconMap = new HashMap();
        this.backgroundColor = var3 | (-16777216);
        this.fonts = var4;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(IIIB)V", garbageValue = "-13")
    void method4529(int var1, int var2, int var3) {
        int var5 = this.regionX;
        int var6 = this.regionY;
        int var7 = this.pixelsPerTile;
        DemotingHashTable var8 = WorldMapRegion_cachedSprites;
        long var9 = ((long) (((var7 << 16) | (var5 << 8)) | var6));
        SpritePixels var4 = ((SpritePixels) (var8.get(var9)));
        if (var4 != null) {
            if (var3 == (this.pixelsPerTile * 64)) {
                var4.drawAt(var1, var2);
            } else {
                var4.drawScaledWorldmap(var1, var2, var3, var3);
            }
        }
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(Lhu;Ljava/util/List;I)V", garbageValue = "605061873")
    @Export("initWorldMapData0")
    void initWorldMapData0(WorldMapData_0 var1, List var2) {
        this.iconMap.clear();
        this.worldMapData_0 = var1;
        this.addAllToIconList(var2);
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;Ljava/util/List;S)V", garbageValue = "-2249")
    @Export("initWorldMapData1")
    void initWorldMapData1(HashSet var1, List var2) {
        this.iconMap.clear();
        Iterator var3 = var1.iterator();
        while (var3.hasNext()) {
            WorldMapData_1 var4 = ((WorldMapData_1) (var3.next()));
            if ((var4.getRegionX() == this.regionX) && (var4.getRegionY() == this.regionY)) {
                this.worldMapData1List.add(var4);
            }
        } 
        this.addAllToIconList(var2);
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(IIIILhx;B)V", garbageValue = "-58")
    @Export("getIconsForTiles")
    void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
        for (int var6 = var1; var6 < (var3 + var1); ++var6) {
            label51 : for (int var7 = var2; var7 < (var2 + var4); ++var7) {
                for (int var8 = 0; var8 < var5.planes; ++var8) {
                    WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
                    if ((var9 != null) && (var9.length != 0)) {
                        WorldMapDecoration[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; ++var11) {
                            WorldMapDecoration var12 = var10[var11];
                            ObjectComposition var13 = ParamComposition.getObjectDefinition(var12.objectDefinitionId);
                            if (IgnoreList.method6265(var13)) {
                                this.getIcon(var13, var8, var6, var7, var5);
                                continue label51;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(Lfg;IIILhx;B)V", garbageValue = "-46")
    @Export("getIcon")
    void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
        Coord var6 = new Coord(var2, var3 + (this.regionX * 64), (this.regionY * 64) + var4);
        Coord var7 = null;
        if (this.worldMapData_0 != null) {
            var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + (this.worldMapData_0.regionXLow * 64), var4 + (this.worldMapData_0.regionYLow * 64));
        } else {
            WorldMapData_1 var8 = ((WorldMapData_1) (var5));
            var7 = new Coord(var2 + var8.minPlane, ((var8.regionXLow * 64) + var3) + (var8.getChunkXLow() * 8), (var4 + (var8.regionYLow * 64)) + (var8.getChunkYLow() * 8));
        }
        WorldMapElement var9;
        Object var10;
        if (var1.transforms != null) {
            var10 = new WorldMapIcon_1(var7, var6, var1.id, this);
        } else {
            var9 = class126.WorldMapElement_get(var1.mapIconId);
            var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
        }
        var9 = class126.WorldMapElement_get(((AbstractWorldMapIcon) (var10)).getElement());
        if (var9.field1769) {
            this.iconMap.put(new Coord(0, var3, var4), var10);
        }
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1666242277")
    @Export("initWorldMapIcon1s")
    void initWorldMapIcon1s() {
        Iterator var1 = this.iconMap.values().iterator();
        while (var1.hasNext()) {
            AbstractWorldMapIcon var2 = ((AbstractWorldMapIcon) (var1.next()));
            if (var2 instanceof WorldMapIcon_1) {
                ((WorldMapIcon_1) (var2)).init();
            }
        } 
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(Ljava/util/List;I)V", garbageValue = "972259681")
    @Export("addAllToIconList")
    void addAllToIconList(List var1) {
        Iterator var2 = var1.iterator();
        while (var2.hasNext()) {
            WorldMapIcon_0 var3 = ((WorldMapIcon_0) (var2.next()));
            if ((class126.WorldMapElement_get(var3.element).field1769 && ((var3.coord2.x >> 6) == this.regionX)) && ((var3.coord2.y >> 6) == this.regionY)) {
                WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4477(var3.element));
                this.icon0List.add(var4);
            }
        } 
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1756616208")
    void method4455() {
        if (this.worldMapData_0 != null) {
            this.worldMapData_0.reset();
        } else {
            Iterator var1 = this.worldMapData1List.iterator();
            while (var1.hasNext()) {
                WorldMapData_1 var2 = ((WorldMapData_1) (var1.next()));
                var2.reset();
            } 
        }
    }

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "(Lkq;S)Z", garbageValue = "4032")
    @Export("loadGeography")
    boolean loadGeography(AbstractArchive var1) {
        this.iconMap.clear();
        if (this.worldMapData_0 != null) {
            this.worldMapData_0.loadGeography(var1);
            if (this.worldMapData_0.isFullyLoaded()) {
                this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0);
                return true;
            } else {
                return false;
            }
        } else {
            boolean var2 = true;
            Iterator var3;
            WorldMapData_1 var4;
            for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) {
                var4 = ((WorldMapData_1) (var3.next()));
                var4.loadGeography(var1);
            }
            if (var2) {
                var3 = this.worldMapData1List.iterator();
                while (var3.hasNext()) {
                    var4 = ((WorldMapData_1) (var3.next()));
                    this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4);
                } 
            }
            return var2;
        }
    }

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "(ILif;[Lpg;Lkq;Lkq;I)V", garbageValue = "386346219")
    @Export("drawTile")
    void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
        this.pixelsPerTile = var1;
        if ((this.worldMapData_0 != null) || (!this.worldMapData1List.isEmpty())) {
            int var7 = this.regionX;
            int var8 = this.regionY;
            DemotingHashTable var9 = WorldMapRegion_cachedSprites;
            long var10 = ((long) (((var1 << 16) | (var7 << 8)) | var8));
            SpritePixels var6 = ((SpritePixels) (var9.get(var10)));
            if (var6 == null) {
                boolean var22 = true;
                var22 &= this.loadGeography(var4);
                int var11;
                if (this.worldMapData_0 != null) {
                    var11 = this.worldMapData_0.groupId;
                } else {
                    var11 = ((AbstractWorldMapData) (this.worldMapData1List.getFirst())).groupId;
                }
                var22 &= var5.tryLoadGroup(var11);
                if (var22) {
                    byte[] var23 = var5.takeFileFlat(var11);
                    WorldMapSprite var12;
                    if (var23 == null) {
                        var12 = new WorldMapSprite();
                    } else {
                        var12 = new WorldMapSprite(class125.method2743(var23).pixels);
                    }
                    SpritePixels var14 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
                    var14.setRaster();
                    if (this.worldMapData_0 != null) {
                        this.method4551(var2, var3, var12);
                    } else {
                        this.method4461(var2, var3, var12);
                    }
                    int var15 = this.regionX;
                    int var16 = this.regionY;
                    int var17 = this.pixelsPerTile;
                    DemotingHashTable var18 = WorldMapRegion_cachedSprites;
                    long var20 = ((long) (((var17 << 16) | (var15 << 8)) | var16));
                    var18.put(var14, var20, var14.pixels.length * 4);
                    this.method4455();
                }
            }
        }
    }

    @ObfuscatedName("h")
    @ObfuscatedSignature(descriptor = "(IIILjava/util/HashSet;I)V", garbageValue = "-1153996012")
    void method4458(int var1, int var2, int var3, HashSet var4) {
        if (var4 == null) {
            var4 = new HashSet();
        }
        this.drawNonLinkMapIcons(var1, var2, var4, var3);
        this.drawMapLinks(var1, var2, var4, var3);
    }

    @ObfuscatedName("q")
    @ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;III)V", garbageValue = "-1505477012")
    @Export("flashElements")
    void flashElements(HashSet var1, int var2, int var3) {
        Iterator var4 = this.iconMap.values().iterator();
        while (var4.hasNext()) {
            AbstractWorldMapIcon var5 = ((AbstractWorldMapIcon) (var4.next()));
            if (var5.hasValidElement()) {
                int var6 = var5.getElement();
                if (var1.contains(var6)) {
                    WorldMapElement var7 = class126.WorldMapElement_get(var6);
                    this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3);
                }
            }
        } 
        this.method4464(var1, var2, var3);
    }

    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "(Lif;[Lpg;Lhl;I)V", garbageValue = "321052771")
    void method4551(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
        int var4;
        int var5;
        for (var4 = 0; var4 < 64; ++var4) {
            for (var5 = 0; var5 < 64; ++var5) {
                this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
                this.method4504(var4, var5, this.worldMapData_0, var1);
            }
        }
        for (var4 = 0; var4 < 64; ++var4) {
            for (var5 = 0; var5 < 64; ++var5) {
                this.method4462(var4, var5, this.worldMapData_0, var1, var2);
            }
        }
    }

    @ObfuscatedName("p")
    @ObfuscatedSignature(descriptor = "(Lif;[Lpg;Lhl;I)V", garbageValue = "1869935790")
    void method4461(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
        Iterator var4 = this.worldMapData1List.iterator();
        WorldMapData_1 var5;
        int var6;
        int var7;
        while (var4.hasNext()) {
            var5 = ((WorldMapData_1) (var4.next()));
            for (var6 = var5.getChunkX() * 8; var6 < ((var5.getChunkX() * 8) + 8); ++var6) {
                for (var7 = var5.getChunkY() * 8; var7 < ((var5.getChunkY() * 8) + 8); ++var7) {
                    this.drawTileGround(var6, var7, var5, var1, var3);
                    this.method4504(var6, var7, var5, var1);
                }
            }
        } 
        var4 = this.worldMapData1List.iterator();
        while (var4.hasNext()) {
            var5 = ((WorldMapData_1) (var4.next()));
            for (var6 = var5.getChunkX() * 8; var6 < ((var5.getChunkX() * 8) + 8); ++var6) {
                for (var7 = var5.getChunkY() * 8; var7 < ((var5.getChunkY() * 8) + 8); ++var7) {
                    this.method4462(var6, var7, var5, var1, var2);
                }
            }
        } 
    }

    @ObfuscatedName("n")
    @ObfuscatedSignature(descriptor = "(IILhx;Lif;[Lpg;I)V", garbageValue = "1586018783")
    void method4462(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
        this.method4471(var1, var2, var3);
        this.method4466(var1, var2, var3, var5);
    }

    @ObfuscatedName("m")
    @ObfuscatedSignature(descriptor = "(IILhx;Lif;Lhl;I)V", garbageValue = "632653510")
    @Export("drawTileGround")
    void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
        int var6 = var3.floorUnderlayIds[0][var1][var2] - 1;
        int var7 = var3.floorOverlayIds[0][var1][var2] - 1;
        if ((var6 == (-1)) && (var7 == (-1))) {
            Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor);
        }
        int var8 = 16711935;
        int var9;
        if (var7 != (-1)) {
            int var10 = this.backgroundColor;
            FloorOverlayDefinition var12 = ((FloorOverlayDefinition) (FloorOverlayDefinition.FloorOverlayDefinition_cached.get(((long) (var7)))));
            FloorOverlayDefinition var11;
            if (var12 != null) {
                var11 = var12;
            } else {
                byte[] var13 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var7);
                var12 = new FloorOverlayDefinition();
                if (var13 != null) {
                    var12.decode(new Buffer(var13), var7);
                }
                var12.postDecode();
                FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var12, ((long) (var7)));
                var11 = var12;
            }
            if (var11 == null) {
                var9 = var10;
            } else if (var11.secondaryRgb >= 0) {
                var9 = var11.secondaryRgb | (-16777216);
            } else if (var11.texture >= 0) {
                int var19 = Canvas.method371(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96);
                var9 = Rasterizer3D.Rasterizer3D_colorPalette[var19] | (-16777216);
            } else if (var11.primaryRgb == 16711935) {
                var9 = var10;
            } else {
                int var14 = var11.hue;
                int var15 = var11.saturation;
                int var16 = var11.lightness;
                if (var16 > 179) {
                    var15 /= 2;
                }
                if (var16 > 192) {
                    var15 /= 2;
                }
                if (var16 > 217) {
                    var15 /= 2;
                }
                if (var16 > 243) {
                    var15 /= 2;
                }
                int var17 = (((var15 / 32) << 7) + (var16 / 2)) + ((var14 / 4) << 10);
                int var18 = Canvas.method371(var17, 96);
                var9 = Rasterizer3D.Rasterizer3D_colorPalette[var18] | (-16777216);
            }
            var8 = var9;
        }
        if ((var7 > (-1)) && (var3.field2736[0][var1][var2] == 0)) {
            Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
        } else {
            var9 = this.method4465(var1, var2, var3, var5);
            if (var7 == (-1)) {
                Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
            } else {
                var4.method4890(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2736[0][var1][var2], var3.field2731[0][var1][var2]);
            }
        }
    }

    @ObfuscatedName("d")
    @ObfuscatedSignature(descriptor = "(IILhx;Lif;I)V", garbageValue = "1515839713")
    void method4504(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
        for (int var5 = 1; var5 < var3.planes; ++var5) {
            int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
            if (var6 > (-1)) {
                int var8 = this.backgroundColor;
                FloorOverlayDefinition var10 = ((FloorOverlayDefinition) (FloorOverlayDefinition.FloorOverlayDefinition_cached.get(((long) (var6)))));
                FloorOverlayDefinition var9;
                if (var10 != null) {
                    var9 = var10;
                } else {
                    byte[] var11 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var6);
                    var10 = new FloorOverlayDefinition();
                    if (var11 != null) {
                        var10.decode(new Buffer(var11), var6);
                    }
                    var10.postDecode();
                    FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var10, ((long) (var6)));
                    var9 = var10;
                }
                int var7;
                if (var9 == null) {
                    var7 = var8;
                } else if (var9.secondaryRgb >= 0) {
                    var7 = var9.secondaryRgb | (-16777216);
                } else if (var9.texture >= 0) {
                    int var17 = Canvas.method371(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96);
                    var7 = Rasterizer3D.Rasterizer3D_colorPalette[var17] | (-16777216);
                } else if (var9.primaryRgb == 16711935) {
                    var7 = var8;
                } else {
                    int var12 = var9.hue;
                    int var13 = var9.saturation;
                    int var14 = var9.lightness;
                    if (var14 > 179) {
                        var13 /= 2;
                    }
                    if (var14 > 192) {
                        var13 /= 2;
                    }
                    if (var14 > 217) {
                        var13 /= 2;
                    }
                    if (var14 > 243) {
                        var13 /= 2;
                    }
                    int var15 = (((var13 / 32) << 7) + (var14 / 2)) + ((var12 / 4) << 10);
                    int var16 = Canvas.method371(var15, 96);
                    var7 = Rasterizer3D.Rasterizer3D_colorPalette[var16] | (-16777216);
                }
                if (var3.field2736[var5][var1][var2] == 0) {
                    Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
                } else {
                    var4.method4890(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2736[var5][var1][var2], var3.field2731[var5][var1][var2]);
                }
            }
        }
    }

    @ObfuscatedName("j")
    @ObfuscatedSignature(descriptor = "(IILhx;Lhl;S)I", garbageValue = "256")
    int method4465(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
        return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2);
    }

    @ObfuscatedName("f")
    @ObfuscatedSignature(descriptor = "(IILhx;[Lpg;B)V", garbageValue = "33")
    void method4466(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
        for (int var5 = 0; var5 < var3.planes; ++var5) {
            WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
            if ((var6 != null) && (var6.length != 0)) {
                WorldMapDecoration[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; ++var8) {
                    WorldMapDecoration var9 = var7[var8];
                    int var11 = var9.decoration;
                    boolean var10 = (var11 >= WorldMapDecorationType.field3438.id) && (var11 <= WorldMapDecorationType.field3444.id);
                    if (!var10) {
                        int var13 = var9.decoration;
                        boolean var12 = var13 == WorldMapDecorationType.field3437.id;
                        if (!var12) {
                            continue;
                        }
                    }
                    ObjectComposition var14 = ParamComposition.getObjectDefinition(var9.objectDefinitionId);
                    if (var14.mapSceneId != (-1)) {
                        if ((var14.mapSceneId != 46) && (var14.mapSceneId != 52)) {
                            var4[var14.mapSceneId].method7753(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
                        } else {
                            var4[var14.mapSceneId].method7753(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), (this.pixelsPerTile * 2) + 1, (this.pixelsPerTile * 2) + 1);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("g")
    @ObfuscatedSignature(descriptor = "(IILhx;B)V", garbageValue = "-114")
    void method4471(int var1, int var2, AbstractWorldMapData var3) {
        for (int var4 = 0; var4 < var3.planes; ++var4) {
            WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
            if ((var5 != null) && (var5.length != 0)) {
                WorldMapDecoration[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; ++var7) {
                    WorldMapDecoration var8 = var6[var7];
                    if (class286.method5462(var8.decoration)) {
                        ObjectComposition var9 = ParamComposition.getObjectDefinition(var8.objectDefinitionId);
                        int var10 = (var9.int1 != 0) ? -3407872 : -3355444;
                        if (var8.decoration == WorldMapDecorationType.field3424.id) {
                            this.method4467(var1, var2, var8.rotation, var10);
                        }
                        if (var8.decoration == WorldMapDecorationType.field3425.id) {
                            this.method4467(var1, var2, var8.rotation, -3355444);
                            this.method4467(var1, var2, var8.rotation + 1, var10);
                        }
                        if (var8.decoration == WorldMapDecorationType.field3426.id) {
                            if (var8.rotation == 0) {
                                Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
                            }
                            if (var8.rotation == 1) {
                                Rasterizer2D.Rasterizer2D_drawHorizontalLine((this.pixelsPerTile + (this.pixelsPerTile * var1)) - 1, this.pixelsPerTile * (63 - var2), 1, var10);
                            }
                            if (var8.rotation == 2) {
                                Rasterizer2D.Rasterizer2D_drawHorizontalLine((this.pixelsPerTile + (this.pixelsPerTile * var1)) - 1, ((this.pixelsPerTile * (63 - var2)) + this.pixelsPerTile) - 1, 1, var10);
                            }
                            if (var8.rotation == 3) {
                                Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, ((this.pixelsPerTile * (63 - var2)) + this.pixelsPerTile) - 1, 1, var10);
                            }
                        }
                        if (var8.decoration == WorldMapDecorationType.field3429.id) {
                            int var11 = var8.rotation % 2;
                            int var12;
                            if (var11 == 0) {
                                for (var12 = 0; var12 < this.pixelsPerTile; ++var12) {
                                    Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + (this.pixelsPerTile * var1), (((64 - var2) * this.pixelsPerTile) - 1) - var12, 1, var10);
                                }
                            } else {
                                for (var12 = 0; var12 < this.pixelsPerTile; ++var12) {
                                    Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + (this.pixelsPerTile * var1), var12 + (this.pixelsPerTile * (63 - var2)), 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("t")
    @ObfuscatedSignature(descriptor = "(IILjava/util/HashSet;II)V", garbageValue = "2025693021")
    @Export("drawNonLinkMapIcons")
    void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
        float var5 = ((float) (var4)) / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.iconMap.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = ((Entry) (var7.next()));
            Coord var9 = ((Coord) (var8.getKey()));
            int var10 = ((int) (((var5 * ((float) (var9.x))) + ((float) (var1))) - var6));
            int var11 = ((int) ((((float) (var2 + var4)) - (var5 * ((float) (var9.y)))) - var6));
            AbstractWorldMapIcon var12 = ((AbstractWorldMapIcon) (var8.getValue()));
            if ((var12 != null) && var12.hasValidElement()) {
                var12.screenX = var10;
                var12.screenY = var11;
                WorldMapElement var13 = class126.WorldMapElement_get(var12.getElement());
                if (!var3.contains(var13.getObjectId())) {
                    this.method4476(var12, var10, var11, var5);
                }
            }
        } 
    }

    @ObfuscatedName("k")
    @ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;IIB)V", garbageValue = "5")
    void method4464(HashSet var1, int var2, int var3) {
        Iterator var4 = this.icon0List.iterator();
        while (var4.hasNext()) {
            AbstractWorldMapIcon var5 = ((AbstractWorldMapIcon) (var4.next()));
            if (var5.hasValidElement()) {
                WorldMapElement var6 = class126.WorldMapElement_get(var5.getElement());
                if ((var6 != null) && var1.contains(var6.getObjectId())) {
                    this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3);
                }
            }
        } 
    }

    @ObfuscatedName("b")
    @ObfuscatedSignature(descriptor = "(Lfr;IIIII)V", garbageValue = "418620224")
    @Export("drawBackgroundCircle")
    void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
        SpritePixels var6 = var1.getSpriteBool(false);
        if (var6 != null) {
            var6.drawTransBgAt(var2 - (var6.subWidth / 2), var3 - (var6.subHeight / 2));
            if ((var4 % var5) < (var5 / 2)) {
                Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128);
                Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256);
            }
        }
    }

    @ObfuscatedName("z")
    @ObfuscatedSignature(descriptor = "(Lix;IIFI)V", garbageValue = "-696046692")
    void method4476(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
        WorldMapElement var5 = class126.WorldMapElement_get(var1.getElement());
        this.method4503(var5, var2, var3);
        this.method4522(var1, var5, var2, var3, var4);
    }

    @ObfuscatedName("ap")
    @ObfuscatedSignature(descriptor = "(Lfr;III)V", garbageValue = "1445965665")
    void method4503(WorldMapElement var1, int var2, int var3) {
        SpritePixels var4 = var1.getSpriteBool(false);
        if (var4 != null) {
            int var5 = this.method4475(var4, var1.horizontalAlignment);
            int var6 = this.method4555(var4, var1.verticalAlignment);
            var4.drawTransBgAt(var5 + var2, var3 + var6);
        }
    }

    @ObfuscatedName("af")
    @ObfuscatedSignature(descriptor = "(Lix;Lfr;IIFI)V", garbageValue = "1143588429")
    void method4522(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
        WorldMapLabel var6 = var1.getLabel();
        if (var6 != null) {
            if (var6.size.method4311(var5)) {
                Font var7 = ((Font) (this.fonts.get(var6.size)));
                var7.drawLines(var6.text, var3 - (var6.width / 2), var4, var6.width, var6.height, (-16777216) | var2.field1767, 0, 1, 0, var7.ascent / 2);
            }
        }
    }

    @ObfuscatedName("ak")
    @ObfuscatedSignature(descriptor = "(IILjava/util/HashSet;II)V", garbageValue = "-1498016817")
    @Export("drawMapLinks")
    void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
        float var5 = ((float) (var4)) / 64.0F;
        Iterator var6 = this.icon0List.iterator();
        while (var6.hasNext()) {
            AbstractWorldMapIcon var7 = ((AbstractWorldMapIcon) (var6.next()));
            if (var7.hasValidElement()) {
                int var8 = var7.coord2.x % 64;
                int var9 = var7.coord2.y % 64;
                var7.screenX = ((int) ((var5 * ((float) (var8))) + ((float) (var1))));
                var7.screenY = ((int) ((var5 * ((float) (63 - var9))) + ((float) (var2))));
                if (!var3.contains(var7.getElement())) {
                    this.method4476(var7, var7.screenX, var7.screenY, var5);
                }
            }
        } 
    }

    @ObfuscatedName("av")
    @ObfuscatedSignature(descriptor = "(Lpt;Lfh;I)I", garbageValue = "1758248115")
    int method4475(SpritePixels var1, HorizontalAlignment var2) {
        switch (var2.value) {
            case 0 :
                return 0;
            case 1 :
                return (-var1.subWidth) / 2;
            default :
                return -var1.subWidth;
        }
    }

    @ObfuscatedName("ar")
    @ObfuscatedSignature(descriptor = "(Lpt;Lfo;B)I", garbageValue = "50")
    int method4555(SpritePixels var1, VerticalAlignment var2) {
        switch (var2.value) {
            case 0 :
                return (-var1.subHeight) / 2;
            case 2 :
                return 0;
            default :
                return -var1.subHeight;
        }
    }

    @ObfuscatedName("aa")
    @ObfuscatedSignature(descriptor = "(II)Lhp;", garbageValue = "-967738245")
    WorldMapLabel method4477(int var1) {
        WorldMapElement var2 = class126.WorldMapElement_get(var1);
        return this.createMapLabel(var2);
    }

    @ObfuscatedName("ao")
    @ObfuscatedSignature(descriptor = "(Lfr;I)Lhp;", garbageValue = "865645266")
    @Export("createMapLabel")
    WorldMapLabel createMapLabel(WorldMapElement var1) {
        if (((var1.name != null) && (this.fonts != null)) && (this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null)) {
            WorldMapLabelSize var2 = WorldMapLabelSize.method4320(var1.textSize);
            if (var2 == null) {
                return null;
            } else {
                Font var3 = ((Font) (this.fonts.get(var2)));
                if (var3 == null) {
                    return null;
                } else {
                    int var4 = var3.lineCount(var1.name, 1000000);
                    String[] var5 = new String[var4];
                    var3.breakLines(var1.name, ((int[]) (null)), var5);
                    int var6 = (var5.length * var3.ascent) / 2;
                    int var7 = 0;
                    String[] var8 = var5;
                    for (int var9 = 0; var9 < var8.length; ++var9) {
                        String var10 = var8[var9];
                        int var11 = var3.stringWidth(var10);
                        if (var11 > var7) {
                            var7 = var11;
                        }
                    }
                    return new WorldMapLabel(var1.name, var7, var6, var2);
                }
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("aq")
    @ObfuscatedSignature(descriptor = "(IIIIII)Ljava/util/List;", garbageValue = "-1549827680")
    List method4449(int var1, int var2, int var3, int var4, int var5) {
        LinkedList var6 = new LinkedList();
        if ((var4 >= var1) && (var5 >= var2)) {
            if ((var4 < (var3 + var1)) && (var5 < (var3 + var2))) {
                Iterator var7 = this.iconMap.values().iterator();
                AbstractWorldMapIcon var8;
                while (var7.hasNext()) {
                    var8 = ((AbstractWorldMapIcon) (var7.next()));
                    if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) {
                        var6.add(var8);
                    }
                } 
                var7 = this.icon0List.iterator();
                while (var7.hasNext()) {
                    var8 = ((AbstractWorldMapIcon) (var7.next()));
                    if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) {
                        var6.add(var8);
                    }
                } 
                return var6;
            } else {
                return var6;
            }
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ay")
    @ObfuscatedSignature(descriptor = "(I)Ljava/util/List;", garbageValue = "753010260")
    @Export("icons")
    List icons() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.icon0List);
        var1.addAll(this.iconMap.values());
        return var1;
    }

    @ObfuscatedName("ac")
    @ObfuscatedSignature(descriptor = "(IIIIB)V", garbageValue = "23")
    void method4467(int var1, int var2, int var3, int var4) {
        var3 %= 4;
        if (var3 == 0) {
            Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
        }
        if (var3 == 1) {
            Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
        }
        if (var3 == 2) {
            Rasterizer2D.Rasterizer2D_drawVerticalLine(((this.pixelsPerTile * var1) + this.pixelsPerTile) - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
        }
        if (var3 == 3) {
            Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, ((this.pixelsPerTile * (63 - var2)) + this.pixelsPerTile) - 1, this.pixelsPerTile, var4);
        }
    }

    @ObfuscatedName("p")
    @ObfuscatedSignature(descriptor = "(IIIII)I", garbageValue = "2136379260")
    static final int method4495(int var0, int var1, int var2, int var3) {
        int var4 = (65536 - Rasterizer3D.Rasterizer3D_cosine[(var2 * 1024) / var3]) >> 1;
        return (((65536 - var4) * var0) >> 16) + ((var4 * var1) >> 16);
    }
}