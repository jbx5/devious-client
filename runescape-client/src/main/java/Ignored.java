import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("mo")
@Implements("Ignored")
public class Ignored extends User {
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = 1341966107)
    @Export("id")
    int id;

    Ignored() {
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lmo;B)I", garbageValue = "-68")
    @Export("compareTo_ignored")
    int compareTo_ignored(Ignored var1) {
        return this.id - var1.id;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Lmy;I)I", garbageValue = "-1446218206")
    @Export("compareTo_user")
    public int compareTo_user(User var1) {
        return this.compareTo_ignored(((Ignored) (var1)));
    }

    public int compareTo(Object var1) {
        return this.compareTo_ignored(((Ignored) (var1)));
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-164861656")
    @Export("clearItemContainer")
    static void clearItemContainer(int var0) {
        ItemContainer var1 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.ids.length; ++var2) {
                var1.ids[var2] = -1;
                var1.quantities[var2] = 0;
            }
        }
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(CI)Z", garbageValue = "-300276479")
    @Export("isCharAlphabetic")
    public static boolean isCharAlphabetic(char var0) {
        return ((var0 >= 'A') && (var0 <= 'Z')) || ((var0 >= 'a') && (var0 <= 'z'));
    }
}