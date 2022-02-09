import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("i")
public enum class6 implements MouseWheel {

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Li;")
    field27(0, 0);
    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("ItemDefinition_modelArchive")
    public static AbstractArchive ItemDefinition_modelArchive;

    @ObfuscatedName("aj")
    @ObfuscatedSignature(descriptor = "Lna;")
    static Bounds field25;

    @ObfuscatedName("gw")
    @ObfuscatedSignature(descriptor = "Lcz;")
    @Export("urlRequester")
    static UrlRequester urlRequester;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -1479015629)
    final int field22;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 538107041)
    final int field20;

    class6(int var3, int var4) {
        this.field22 = var3;
        this.field20 = var4;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-303340189")
    @Export("rsOrdinal")
    public int rsOrdinal() {
        return this.field20;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-72")
    @Export("loadWorlds")
    static boolean loadWorlds() {
        try {
            if (WorldMapID.World_request == null) {
                WorldMapID.World_request = urlRequester.request(new URL(ModelData0.field2546));
            } else if (WorldMapID.World_request.isDone()) {
                byte[] var0 = WorldMapID.World_request.getResponse();
                Buffer var1 = new Buffer(var0);
                var1.readInt();
                World.World_count = var1.readUnsignedShort();
                class33.World_worlds = new World[World.World_count];
                World var3;
                for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
                    var3 = class33.World_worlds[var2] = new World();
                    var3.id = var1.readUnsignedShort();
                    var3.properties = var1.readInt();
                    var3.host = var1.readStringCp1252NullTerminated();
                    var3.activity = var1.readStringCp1252NullTerminated();
                    var3.location = var1.readUnsignedByte();
                    var3.population = var1.readShort();
                }
                Players.sortWorlds(class33.World_worlds, 0, class33.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
                WorldMapID.World_request = null;
                return true;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            WorldMapID.World_request = null;
        }
        return false;
    }
}