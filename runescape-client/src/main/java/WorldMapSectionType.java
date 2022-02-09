import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("hf")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lhf;")
    @Export("WORLDMAPSECTIONTYPE0")
    WORLDMAPSECTIONTYPE0(3, ((byte) (0))),
    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lhf;")
    @Export("WORLDMAPSECTIONTYPE1")
    WORLDMAPSECTIONTYPE1(1, ((byte) (1))),
    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lhf;")
    @Export("WORLDMAPSECTIONTYPE2")
    WORLDMAPSECTIONTYPE2(2, ((byte) (2))),
    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Lhf;")
    @Export("WORLDMAPSECTIONTYPE3")
    WORLDMAPSECTIONTYPE3(0, ((byte) (3)));
    @ObfuscatedName("ss")
    @ObfuscatedGetter(intValue = -493940413)
    static int field2723;

    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = 608641575)
    @Export("cacheGamebuild")
    static int cacheGamebuild;

    @ObfuscatedName("ky")
    @ObfuscatedSignature(descriptor = "Ljz;")
    static Widget field2720;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = 550297925)
    @Export("type")
    final int type;

    @ObfuscatedName("o")
    @Export("id")
    final byte id;

    WorldMapSectionType(int var3, byte var4) {
        this.type = var3;
        this.id = var4;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-303340189")
    @Export("rsOrdinal")
    public int rsOrdinal() {
        return this.id;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;", garbageValue = "-87998947")
    static String method4720(int var0) {
        return ("<img=" + var0) + ">";
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(S)[Lhf;", garbageValue = "14034")
    static WorldMapSectionType[] method4723() {
        return new WorldMapSectionType[]{ WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE1 };
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1693744275")
    public static void method4726() {
        SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
        SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
    }

    @ObfuscatedName("p")
    @ObfuscatedSignature(descriptor = "(II)Ldw;", garbageValue = "-1694408965")
    static class120 method4724(int var0) {
        class120 var1 = ((class120) (SequenceDefinition.SequenceDefinition_cachedModel.get(((long) (var0)))));
        if (var1 != null) {
            return var1;
        } else {
            AbstractArchive var3 = WorldMapData_0.SequenceDefinition_animationsArchive;
            AbstractArchive var4 = SequenceDefinition.SequenceDefinition_skeletonsArchive;
            boolean var5 = true;
            byte[] var6 = var3.takeFile((var0 >> 16) & 65535, var0 & 65535);
            class120 var2;
            if (var6 == null) {
                var5 = false;
                var2 = null;
            } else {
                int var7 = ((var6[1] & 255) << 8) | (var6[2] & 255);
                byte[] var8 = var4.getFile(var7, 0);
                if (var8 == null) {
                    var5 = false;
                }
                if (!var5) {
                    var2 = null;
                } else {
                    try {
                        var2 = new class120(var3, var4, var0, false);
                    } catch (Exception var10) {
                        var2 = null;
                    }
                }
            }
            if (var2 != null) {
                SequenceDefinition.SequenceDefinition_cachedModel.put(var2, ((long) (var0)));
            }
            return var2;
        }
    }

    @ObfuscatedName("g")
    @ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "-1583923340")
    static final boolean method4717(int var0, int var1) {
        ObjectComposition var2 = ParamComposition.getObjectDefinition(var0);
        if (var1 == 11) {
            var1 = 10;
        }
        if ((var1 >= 5) && (var1 <= 8)) {
            var1 = 4;
        }
        return var2.method3475(var1);
    }

    @ObfuscatedName("fe")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1498740944")
    static final void method4725() {
        if (Skeleton.ClanChat_inClanChat) {
            if (class67.friendsChat != null) {
                class67.friendsChat.sort();
            }
            for (int var0 = 0; var0 < Players.Players_count; ++var0) {
                Player var1 = Client.players[Players.Players_indices[var0]];
                var1.clearIsInFriendsChat();
            }
            Skeleton.ClanChat_inClanChat = false;
        }
    }
}