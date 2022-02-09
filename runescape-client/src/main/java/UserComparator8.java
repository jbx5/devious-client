import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ce")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("soundEffectsArchive")
    public static AbstractArchive soundEffectsArchive;

    @ObfuscatedName("er")
    @ObfuscatedGetter(longValue = -2764549140117055915L)
    static long field1347;

    @ObfuscatedName("hk")
    @Export("xteaKeys")
    static int[][] xteaKeys;

    @ObfuscatedName("c")
    @Export("reversed")
    final boolean reversed;

    public UserComparator8(boolean var1) {
        this.reversed = var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lmd;Lmd;B)I", garbageValue = "-21")
    @Export("compareBuddy")
    int compareBuddy(Buddy var1, Buddy var2) {
        if (Client.worldId == var1.world) {
            if (var2.world != Client.worldId) {
                return this.reversed ? -1 : 1;
            }
        } else if (var2.world == Client.worldId) {
            return this.reversed ? 1 : -1;
        }
        return this.compareUser(var1, var2);
    }

    public int compare(Object var1, Object var2) {
        return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(CI)B", garbageValue = "-2066646515")
    @Export("charToByteCp1252")
    public static byte charToByteCp1252(char var0) {
        byte var1;
        if (((var0 > 0) && (var0 < 128)) || ((var0 >= 160) && (var0 <= 255))) {
            var1 = ((byte) (var0));
        } else if (var0 == 8364) {
            var1 = -128;
        } else if (var0 == 8218) {
            var1 = -126;
        } else if (var0 == 402) {
            var1 = -125;
        } else if (var0 == 8222) {
            var1 = -124;
        } else if (var0 == 8230) {
            var1 = -123;
        } else if (var0 == 8224) {
            var1 = -122;
        } else if (var0 == 8225) {
            var1 = -121;
        } else if (var0 == 710) {
            var1 = -120;
        } else if (var0 == 8240) {
            var1 = -119;
        } else if (var0 == 352) {
            var1 = -118;
        } else if (var0 == 8249) {
            var1 = -117;
        } else if (var0 == 338) {
            var1 = -116;
        } else if (var0 == 381) {
            var1 = -114;
        } else if (var0 == 8216) {
            var1 = -111;
        } else if (var0 == 8217) {
            var1 = -110;
        } else if (var0 == 8220) {
            var1 = -109;
        } else if (var0 == 8221) {
            var1 = -108;
        } else if (var0 == 8226) {
            var1 = -107;
        } else if (var0 == 8211) {
            var1 = -106;
        } else if (var0 == 8212) {
            var1 = -105;
        } else if (var0 == 732) {
            var1 = -104;
        } else if (var0 == 8482) {
            var1 = -103;
        } else if (var0 == 353) {
            var1 = -102;
        } else if (var0 == 8250) {
            var1 = -101;
        } else if (var0 == 339) {
            var1 = -100;
        } else if (var0 == 382) {
            var1 = -98;
        } else if (var0 == 376) {
            var1 = -97;
        } else {
            var1 = 63;
        }
        return var1;
    }

    @ObfuscatedName("fs")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "1")
    static final void method2449() {
        class33.method626();
        ReflectionCheck.method631();
        KitDefinition.KitDefinition_cached.clear();
        class21.method301();
        class113.method2603();
        ItemComposition.ItemDefinition_cached.clear();
        ItemComposition.ItemDefinition_cachedModels.clear();
        ItemComposition.ItemDefinition_cachedSprites.clear();
        Clock.method3121();
        WorldMapSectionType.method4726();
        VarbitComposition.VarbitDefinition_cached.clear();
        class87.method2222();
        class115.HitSplatDefinition_cachedSprites.method7213();
        FloorOverlayDefinition.HitSplatDefinition_cached.method7213();
        class67.method1897();
        class18.method268();
        MouseRecorder.method2100();
        HealthBarDefinition.method3246();
        WorldMapElement.WorldMapElement_cachedSprites.clear();
        Language.method5812();
        VertexNormal.method4265();
        ((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).clear();
        Script.Script_cached.clear();
        class7.archive0.clearFiles();
        Client.archive1.clearFiles();
        Tile.archive3.clearFiles();
        class403.archive4.clearFiles();
        Client.archive5.clearFiles();
        WorldMapLabelSize.archive6.clearFiles();
        WorldMapLabelSize.archive7.clearFiles();
        Message.archive8.clearFiles();
        class9.archive9.clearFiles();
        Tile.archive10.clearFiles();
        class252.archive11.clearFiles();
        class148.archive12.clearFiles();
    }
}