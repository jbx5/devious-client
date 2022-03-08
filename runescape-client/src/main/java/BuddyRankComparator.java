import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("dr")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
    @ObfuscatedName("c")
    @Export("reversed")
    final boolean reversed;

    public BuddyRankComparator(boolean var1) {
        this.reversed = var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lmd;Lmd;I)I", garbageValue = "-1694287070")
    @Export("compareBuddy")
    int compareBuddy(Buddy var1, Buddy var2) {
        if (var2.rank != var1.rank) {
            return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
        } else {
            return this.compareUser(var1, var2);
        }
    }

    public int compare(Object var1, Object var2) {
        return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "1750865876")
    static boolean method2513(int var0, int var1) {
        return (var0 != 4) || (var1 < 8);
    }

    @ObfuscatedName("aq")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1109868456")
    @Export("getGcDuration")
    protected static int getGcDuration() {
        int var0 = 0;
        if ((GameEngine.garbageCollector == null) || (!GameEngine.garbageCollector.isValid())) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = ((GarbageCollectorMXBean) (var1.next()));
                    if (var2.isValid()) {
                        GameEngine.garbageCollector = var2;
                        GameEngine.garbageCollectorLastCheckTimeMs = -1L;
                        GameEngine.garbageCollectorLastCollectionTime = -1L;
                    }
                } 
            } catch (Throwable var11) {
            }
        }
        if (GameEngine.garbageCollector != null) {
            long var9 = DirectByteArrayCopier.getServerTime();
            long var3 = GameEngine.garbageCollector.getCollectionTime();
            if (GameEngine.garbageCollectorLastCollectionTime != (-1L)) {
                long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
                long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
                if (0L != var7) {
                    var0 = ((int) ((100L * var5) / var7));
                }
            }
            GameEngine.garbageCollectorLastCollectionTime = var3;
            GameEngine.garbageCollectorLastCheckTimeMs = var9;
        }
        return var0;
    }
}