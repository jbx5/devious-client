import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("hv")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = 818987269)
    @Export("minPlane")
    int minPlane;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -1887576147)
    @Export("planes")
    int planes;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 114191505)
    @Export("regionStartX")
    int regionStartX;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = 797573361)
    @Export("regionStartY")
    int regionStartY;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = -112404559)
    @Export("regionEndX")
    int regionEndX;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = 637576273)
    @Export("regionEndY")
    int regionEndY;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -461981327)
    int field2623;

    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -565925945)
    int field2618;

    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = -39846799)
    int field2625;

    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = -238586583)
    int field2626;

    WorldMapSection2() {
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lhm;I)V", garbageValue = "806489369")
    @Export("expandBounds")
    public void expandBounds(WorldMapArea var1) {
        if (var1.regionLowX > this.field2623) {
            var1.regionLowX = this.field2623;
        }
        if (var1.regionHighX < this.field2625) {
            var1.regionHighX = this.field2625;
        }
        if (var1.regionLowY > this.field2618) {
            var1.regionLowY = this.field2618;
        }
        if (var1.regionHighY < this.field2626) {
            var1.regionHighY = this.field2626;
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(IIII)Z", garbageValue = "1721879281")
    @Export("containsCoord")
    public boolean containsCoord(int var1, int var2, int var3) {
        if ((var1 >= this.minPlane) && (var1 < (this.planes + this.minPlane))) {
            return ((((var2 >> 6) >= this.regionStartX) && ((var2 >> 6) <= this.regionEndX)) && ((var3 >> 6) >= this.regionStartY)) && ((var3 >> 6) <= this.regionEndY);
        } else {
            return false;
        }
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "898039462")
    @Export("containsPosition")
    public boolean containsPosition(int var1, int var2) {
        return ((((var1 >> 6) >= this.field2623) && ((var1 >> 6) <= this.field2625)) && ((var2 >> 6) >= this.field2618)) && ((var2 >> 6) <= this.field2626);
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(IIII)[I", garbageValue = "499785766")
    @Export("getBorderTileLengths")
    public int[] getBorderTileLengths(int var1, int var2, int var3) {
        if (!this.containsCoord(var1, var2, var3)) {
            return null;
        } else {
            int[] var4 = new int[]{ var2 + ((this.field2623 * 64) - (this.regionStartX * 64)), var3 + ((this.field2618 * 64) - (this.regionStartY * 64)) };
            return var4;
        }
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(IIB)Ljd;", garbageValue = "90")
    @Export("coord")
    public Coord coord(int var1, int var2) {
        if (!this.containsPosition(var1, var2)) {
            return null;
        } else {
            int var3 = ((this.regionStartX * 64) - (this.field2623 * 64)) + var1;
            int var4 = var2 + ((this.regionStartY * 64) - (this.field2618 * 64));
            return new Coord(this.minPlane, var3, var4);
        }
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(Lpi;B)V", garbageValue = "-121")
    @Export("read")
    public void read(Buffer var1) {
        this.minPlane = var1.readUnsignedByte();
        this.planes = var1.readUnsignedByte();
        this.regionStartX = var1.readUnsignedShort();
        this.regionStartY = var1.readUnsignedShort();
        this.regionEndX = var1.readUnsignedShort();
        this.regionEndY = var1.readUnsignedShort();
        this.field2623 = var1.readUnsignedShort();
        this.field2618 = var1.readUnsignedShort();
        this.field2625 = var1.readUnsignedShort();
        this.field2626 = var1.readUnsignedShort();
        this.postRead();
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(S)V", garbageValue = "-9905")
    @Export("postRead")
    void postRead() {
    }

    @ObfuscatedName("fv")
    @ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "0")
    @Export("playSong")
    static void playSong(int var0) {
        if ((var0 == (-1)) && (!Client.field744)) {
            class265.midiPcmStream.clear();
            class265.musicPlayerStatus = 1;
            class265.musicTrackArchive = null;
        } else if ((((var0 != (-1)) && (var0 != Client.currentTrackGroupId)) && (class424.clientPreferences.musicVolume != 0)) && (!Client.field744)) {
            Archive var1 = WorldMapLabelSize.archive6;
            int var2 = class424.clientPreferences.musicVolume;
            class265.musicPlayerStatus = 1;
            class265.musicTrackArchive = var1;
            class265.musicTrackGroupId = var0;
            class140.musicTrackFileId = 0;
            class167.musicTrackVolume = var2;
            MusicPatch.musicTrackBoolean = false;
            GrandExchangeOfferNameComparator.pcmSampleLength = 2;
        }
        Client.currentTrackGroupId = var0;
    }

    @ObfuscatedName("ke")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-658608851")
    static final void method4360() {
        Client.field701 = Client.cycleCntr;
        ClanChannelMember.field1528 = true;
    }
}