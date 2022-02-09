import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("kr")
@Implements("StudioGame")
public enum StudioGame implements MouseWheel {

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lkr;")
    @Export("runescape")
    runescape("runescape", "RuneScape", 0),
    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lkr;")
    @Export("stellardawn")
    stellardawn("stellardawn", "Stellar Dawn", 1),
    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lkr;")
    @Export("game3")
    game3("game3", "Game 3", 2),
    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Lkr;")
    @Export("game4")
    game4("game4", "Game 4", 3),
    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "Lkr;")
    @Export("game5")
    game5("game5", "Game 5", 4),
    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "Lkr;")
    @Export("oldscape")
    oldscape("oldscape", "RuneScape 2007", 5);
    @ObfuscatedName("i")
    @Export("name")
    public final String name;

    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 1751135383)
    @Export("id")
    final int id;

    StudioGame(String var3, String var4, int var5) {
        this.name = var3;
        this.id = var5;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-303340189")
    @Export("rsOrdinal")
    public int rsOrdinal() {
        return this.id;
    }

    @ObfuscatedName("hf")
    @ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "0")
    @Export("updateItemPile")
    static final void updateItemPile(int var0, int var1) {
        NodeDeque var2 = Client.groundItems[SoundSystem.Client_plane][var0][var1];
        if (var2 == null) {
            Decimator.scene.removeGroundItemPile(SoundSystem.Client_plane, var0, var1);
        } else {
            long var3 = -99999999L;
            TileItem var5 = null;
            TileItem var6;
            for (var6 = ((TileItem) (var2.last())); var6 != null; var6 = ((TileItem) (var2.previous()))) {
                ItemComposition var7 = Client.ItemDefinition_get(var6.id);
                long var11 = ((long) (var7.price));
                if (var7.isStackable == 1) {
                    var11 *= ((long) (var6.quantity + 1));
                }
                if (var11 > var3) {
                    var3 = var11;
                    var5 = var6;
                }
            }
            if (var5 == null) {
                Decimator.scene.removeGroundItemPile(SoundSystem.Client_plane, var0, var1);
            } else {
                var2.addLast(var5);
                TileItem var13 = null;
                TileItem var8 = null;
                for (var6 = ((TileItem) (var2.last())); var6 != null; var6 = ((TileItem) (var2.previous()))) {
                    if (var5.id != var6.id) {
                        if (var13 == null) {
                            var13 = var6;
                        }
                        if ((var6.id != var13.id) && (var8 == null)) {
                            var8 = var6;
                        }
                    }
                }
                long var9 = ScriptEvent.calculateTag(var0, var1, 3, false, 0);
                Decimator.scene.newGroundItemPile(SoundSystem.Client_plane, var0, var1, class92.getTileHeight((var0 * 128) + 64, (var1 * 128) + 64, SoundSystem.Client_plane), var5, var9, var13, var8);
            }
        }
    }
}