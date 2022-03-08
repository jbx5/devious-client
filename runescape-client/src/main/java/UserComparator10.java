import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("db")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 11996977)
    @Export("KitDefinition_fileCount")
    public static int KitDefinition_fileCount;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 204231041)
    static int field1368;

    @ObfuscatedName("c")
    @Export("reversed")
    final boolean reversed;

    public UserComparator10(boolean var1) {
        this.reversed = var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lmd;Lmd;B)I", garbageValue = "118")
    @Export("compareBuddy")
    int compareBuddy(Buddy var1, Buddy var2) {
        if ((Client.worldId == var1.world) && (var2.world == Client.worldId)) {
            return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
        } else {
            return this.compareUser(var1, var2);
        }
    }

    public int compare(Object var1, Object var2) {
        return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(II)Lfj;", garbageValue = "-1231821516")
    @Export("getNpcDefinition")
    public static NPCComposition getNpcDefinition(int var0) {
        NPCComposition var1 = ((NPCComposition) (NPCComposition.NpcDefinition_cached.get(((long) (var0)))));
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
            var1 = new NPCComposition();
            var1.id = var0;
            if (var2 != null) {
                var1.decode(new Buffer(var2));
            }
            var1.postDecode();
            NPCComposition.NpcDefinition_cached.put(var1, ((long) (var0)));
            return var1;
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(II)Lfu;", garbageValue = "-720151457")
    @Export("getInvDefinition")
    public static InvDefinition getInvDefinition(int var0) {
        InvDefinition var1 = ((InvDefinition) (InvDefinition.InvDefinition_cached.get(((long) (var0)))));
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
            var1 = new InvDefinition();
            if (var2 != null) {
                var1.decode(new Buffer(var2));
            }
            InvDefinition.InvDefinition_cached.put(var1, ((long) (var0)));
            return var1;
        }
    }
}