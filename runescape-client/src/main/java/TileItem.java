import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("cj")
@Implements("TileItem")
public final class TileItem extends Renderable {
    @ObfuscatedName("t")
    @Export("userHomeDirectory")
    static String userHomeDirectory;

    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = -1193227227)
    @Export("id")
    int id;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -440248455)
    @Export("quantity")
    int quantity;

    TileItem() {
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(B)Lgf;", garbageValue = "39")
    @Export("getModel")
    protected final Model getModel() {
        return Client.ItemDefinition_get(this.id).getModel(this.quantity);
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;", garbageValue = "404484711")
    public static String method2296(CharSequence var0) {
        int var1 = var0.length();
        StringBuilder var2 = new StringBuilder(var1);
        for (int var3 = 0; var3 < var1; ++var3) {
            char var4 = var0.charAt(var3);
            if ((((((((var4 < 'a') || (var4 > 'z')) && ((var4 < 'A') || (var4 > 'Z'))) && ((var4 < '0') || (var4 > '9'))) && (var4 != '.')) && (var4 != '-')) && (var4 != '*')) && (var4 != '_')) {
                if (var4 == ' ') {
                    var2.append('+');
                } else {
                    byte var5 = UserComparator8.charToByteCp1252(var4);
                    var2.append('%');
                    int var6 = (var5 >> 4) & 15;
                    if (var6 >= 10) {
                        var2.append(((char) (var6 + 55)));
                    } else {
                        var2.append(((char) (var6 + 48)));
                    }
                    var6 = var5 & 15;
                    if (var6 >= 10) {
                        var2.append(((char) (var6 + 55)));
                    } else {
                        var2.append(((char) (var6 + 48)));
                    }
                }
            } else {
                var2.append(var4);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ljava/awt/Component;B)V", garbageValue = "17")
    static void method2299(Component var0) {
        var0.setFocusTraversalKeysEnabled(false);
        var0.addKeyListener(KeyHandler.KeyHandler_instance);
        var0.addFocusListener(KeyHandler.KeyHandler_instance);
    }
}