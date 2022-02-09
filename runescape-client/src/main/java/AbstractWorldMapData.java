import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("hx")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = -728209617)
    @Export("regionXLow")
    int regionXLow;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = -2099381307)
    @Export("regionYLow")
    int regionYLow;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -1944778357)
    @Export("regionX")
    int regionX;

    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 92457965)
    @Export("regionY")
    int regionY;

    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = -699365889)
    @Export("minPlane")
    int minPlane;

    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = 719517601)
    @Export("planes")
    int planes;

    @ObfuscatedName("y")
    @ObfuscatedGetter(intValue = 1019583287)
    @Export("groupId")
    int groupId;

    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 582438051)
    @Export("fileId")
    int fileId;

    @ObfuscatedName("h")
    @Export("floorUnderlayIds")
    short[][][] floorUnderlayIds;

    @ObfuscatedName("q")
    @Export("floorOverlayIds")
    short[][][] floorOverlayIds;

    @ObfuscatedName("x")
    byte[][][] field2736;

    @ObfuscatedName("p")
    byte[][][] field2731;

    @ObfuscatedName("n")
    @ObfuscatedSignature(descriptor = "[[[[Lhj;")
    @Export("decorations")
    WorldMapDecoration[][][][] decorations;

    @ObfuscatedName("m")
    boolean field2728;

    @ObfuscatedName("d")
    boolean field2740;

    AbstractWorldMapData() {
        this.groupId = -1;
        this.fileId = -1;
        new LinkedList();
        this.field2728 = false;
        this.field2740 = false;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Lpi;B)V", garbageValue = "-12")
    @Export("readGeography")
    abstract void readGeography(Buffer var1);

    @ObfuscatedName("m")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1366006737")
    @Export("isFullyLoaded")
    boolean isFullyLoaded() {
        return this.field2728 && this.field2740;
    }

    @ObfuscatedName("d")
    @ObfuscatedSignature(descriptor = "(Lkq;B)V", garbageValue = "1")
    @Export("loadGeography")
    void loadGeography(AbstractArchive var1) {
        if (!this.isFullyLoaded()) {
            byte[] var2 = var1.takeFile(this.groupId, this.fileId);
            if (var2 != null) {
                this.readGeography(new Buffer(var2));
                this.field2728 = true;
                this.field2740 = true;
            }
        }
    }

    @ObfuscatedName("j")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1928141224")
    @Export("reset")
    void reset() {
        this.floorUnderlayIds = null;
        this.floorOverlayIds = null;
        this.field2736 = null;
        this.field2731 = null;
        this.decorations = null;
        this.field2728 = false;
        this.field2740 = false;
    }

    @ObfuscatedName("f")
    @ObfuscatedSignature(descriptor = "(IILpi;I)V", garbageValue = "-1017475721")
    @Export("readTile")
    void readTile(int var1, int var2, Buffer var3) {
        int var4 = var3.readUnsignedByte();
        if (var4 != 0) {
            if ((var4 & 1) != 0) {
                this.method4727(var1, var2, var3, var4);
            } else {
                this.method4752(var1, var2, var3, var4);
            }
        }
    }

    @ObfuscatedName("g")
    @ObfuscatedSignature(descriptor = "(IILpi;II)V", garbageValue = "891523991")
    void method4727(int var1, int var2, Buffer var3, int var4) {
        boolean var5 = (var4 & 2) != 0;
        if (var5) {
            this.floorOverlayIds[0][var1][var2] = ((short) (var3.readUnsignedByte()));
        }
        this.floorUnderlayIds[0][var1][var2] = ((short) (var3.readUnsignedByte()));
    }

    @ObfuscatedName("t")
    @ObfuscatedSignature(descriptor = "(IILpi;IB)V", garbageValue = "-103")
    void method4752(int var1, int var2, Buffer var3, int var4) {
        int var5 = ((var4 & 24) >> 3) + 1;
        boolean var6 = (var4 & 2) != 0;
        boolean var7 = (var4 & 4) != 0;
        this.floorUnderlayIds[0][var1][var2] = ((short) (var3.readUnsignedByte()));
        int var8;
        int var9;
        int var11;
        if (var6) {
            var8 = var3.readUnsignedByte();
            for (var9 = 0; var9 < var8; ++var9) {
                int var14 = var3.readUnsignedByte();
                if (var14 != 0) {
                    this.floorOverlayIds[var9][var1][var2] = ((short) (var14));
                    var11 = var3.readUnsignedByte();
                    this.field2736[var9][var1][var2] = ((byte) (var11 >> 2));
                    this.field2731[var9][var1][var2] = ((byte) (var11 & 3));
                }
            }
        }
        if (var7) {
            for (var8 = 0; var8 < var5; ++var8) {
                var9 = var3.readUnsignedByte();
                if (var9 != 0) {
                    WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];
                    for (var11 = 0; var11 < var9; ++var11) {
                        int var12 = var3.readNullableLargeSmart();
                        int var13 = var3.readUnsignedByte();
                        var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("k")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1413227060")
    @Export("getRegionX")
    int getRegionX() {
        return this.regionX;
    }

    @ObfuscatedName("b")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "123")
    @Export("getRegionY")
    int getRegionY() {
        return this.regionY;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lkq;Lkq;Lkq;Ljb;B)Z", garbageValue = "106")
    public static boolean method4753(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, MidiPcmStream var3) {
        class265.musicPatchesArchive = var0;
        class265.musicSamplesArchive = var1;
        UserComparator8.soundEffectsArchive = var2;
        class265.midiPcmStream = var3;
        return true;
    }

    @ObfuscatedName("gu")
    @ObfuscatedSignature(descriptor = "(Lcw;ZI)V", garbageValue = "-912053648")
    @Export("addPlayerToScene")
    static void addPlayerToScene(Player var0, boolean var1) {
        if (((var0 != null) && var0.isVisible()) && (!var0.isHidden)) {
            var0.isUnanimated = false;
            if ((((Client.isLowDetail && (Players.Players_count > 50)) || (Players.Players_count > 200)) && var1) && (var0.movementSequence == var0.idleSequence)) {
                var0.isUnanimated = true;
            }
            int var2 = var0.x >> 7;
            int var3 = var0.y >> 7;
            if ((((var2 >= 0) && (var2 < 104)) && (var3 >= 0)) && (var3 < 104)) {
                long var4 = ScriptEvent.calculateTag(0, 0, 0, false, var0.index);
                if (((var0.model0 != null) && (Client.cycle >= var0.animationCycleStart)) && (Client.cycle < var0.animationCycleEnd)) {
                    var0.isUnanimated = false;
                    var0.tileHeight = class92.getTileHeight(var0.x, var0.y, SoundSystem.Client_plane);
                    var0.playerCycle = Client.cycle;
                    Decimator.scene.addNullableObject(SoundSystem.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY);
                } else {
                    if (((var0.x & 127) == 64) && ((var0.y & 127) == 64)) {
                        if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
                            return;
                        }
                        Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
                    }
                    var0.tileHeight = class92.getTileHeight(var0.x, var0.y, SoundSystem.Client_plane);
                    var0.playerCycle = Client.cycle;
                    Decimator.scene.drawEntity(SoundSystem.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
                }
            }
        }
    }

    @ObfuscatedName("hk")
    @ObfuscatedSignature(descriptor = "(IIIIIIIIII)V", garbageValue = "-1897942000")
    @Export("updatePendingSpawn")
    static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        PendingSpawn var9 = null;
        for (PendingSpawn var10 = ((PendingSpawn) (Client.pendingSpawns.last())); var10 != null; var10 = ((PendingSpawn) (Client.pendingSpawns.previous()))) {
            if ((((var0 == var10.plane) && (var10.x == var1)) && (var2 == var10.y)) && (var3 == var10.type)) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new PendingSpawn();
            var9.plane = var0;
            var9.type = var3;
            var9.x = var1;
            var9.y = var2;
            class296.method5489(var9);
            Client.pendingSpawns.addFirst(var9);
        }
        var9.id = var4;
        var9.field1103 = var5;
        var9.orientation = var6;
        var9.delay = var7;
        var9.hitpoints = var8;
    }
}