import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("hg")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -695987835
	)
	@Export("z")
	int z;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1300612235
	)
	@Export("x")
	int x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -190485209
	)
	@Export("y")
	int y;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 810073207
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1356551947
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = -7729917977965778771L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 318935705
	)
	@Export("flags")
	int flags;

    BoundaryObject() {
        this.tag = 0L;
        this.flags = 0;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ljava/io/File;Ljava/io/File;B)V", garbageValue = "119")
    static void method4277(File var0, File var1) {
        try {
            AccessFile var2 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);
            Buffer var3 = new Buffer(500);
            var3.writeByte(3);
            var3.writeByte(var1 != null ? 1 : 0);
            var3.writeCESU8(var0.getPath());
            if (var1 != null) {
                var3.writeCESU8("");
            }
            var2.write(var3.array, 0, var3.offset);
            var2.close();
        } catch (IOException var4) {
            var4.printStackTrace();
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(III)I", garbageValue = "602248811")
    public static int method4275(int var0, int var1) {
        return (((-3) - var0) << 8) + var1;
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(IIIZIZI)V", garbageValue = "-1941182040")
    @Export("doWorldSorting")
    static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
        if (var0 < var1) {
            int var6 = (var0 + var1) / 2;
            int var7 = var0;
            World var8 = class33.World_worlds[var6];
            class33.World_worlds[var6] = class33.World_worlds[var1];
            class33.World_worlds[var1] = var8;
            for (int var9 = var0; var9 < var1; ++var9) {
                World var11 = class33.World_worlds[var9];
                int var12 = LoginScreenAnimation.compareWorlds(var11, var8, var2, var3);
                int var10;
                if (var12 != 0) {
                    if (var3) {
                        var10 = -var12;
                    } else {
                        var10 = var12;
                    }
                } else if (var4 == (-1)) {
                    var10 = 0;
                } else {
                    int var13 = LoginScreenAnimation.compareWorlds(var11, var8, var4, var5);
                    if (var5) {
                        var10 = -var13;
                    } else {
                        var10 = var13;
                    }
                }
                if (var10 <= 0) {
                    World var14 = class33.World_worlds[var9];
                    class33.World_worlds[var9] = class33.World_worlds[var7];
                    class33.World_worlds[var7++] = var14;
                }
            }
            class33.World_worlds[var1] = class33.World_worlds[var7];
            class33.World_worlds[var7] = var8;
            doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
            doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
        }
    }

    @ObfuscatedName("ai")
    @ObfuscatedSignature(descriptor = "(ILjd;ZI)V", garbageValue = "1668611134")
    static void method4276(int var0, Coord var1, boolean var2) {
        WorldMapArea var3 = WorldMapEvent.getWorldMap().getMapArea(var0);
        int var4 = WorldMapSprite.localPlayer.plane;
        int var5 = (WorldMapSprite.localPlayer.x >> 7) + Canvas.baseX;
        int var6 = (WorldMapSprite.localPlayer.y >> 7) + class118.baseY;
        Coord var7 = new Coord(var4, var5, var6);
        WorldMapEvent.getWorldMap().method7006(var3, var7, var1, var2);
    }
}
