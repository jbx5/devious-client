import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("mz")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
    @ObfuscatedName("l")
    @Export("nextComparator")
    Comparator nextComparator;

    protected AbstractUserComparator() {
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;I)V", garbageValue = "905237521")
    @Export("addComparator")
    final void addComparator(Comparator var1) {
        if (this.nextComparator == null) {
            this.nextComparator = var1;
        } else if (this.nextComparator instanceof AbstractUserComparator) {
            ((AbstractUserComparator) (this.nextComparator)).addComparator(var1);
        }
    }

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "(Lmy;Lmy;S)I", garbageValue = "6806")
    @Export("compareUser")
    protected final int compareUser(User var1, User var2) {
        return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2);
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }
}