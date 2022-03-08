import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("lm")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
    @ObfuscatedName("c")
    @Export("state")
    byte state;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -523918183)
    @Export("id")
    public int id;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -2075889425)
    @Export("unitPrice")
    public int unitPrice;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -767593877)
    @Export("totalQuantity")
    public int totalQuantity;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = 669868115)
    @Export("currentQuantity")
    public int currentQuantity;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = -514096397)
    @Export("currentPrice")
    public int currentPrice;

    public GrandExchangeOffer() {
    }

    @ObfuscatedSignature(descriptor = "(Lpi;Z)V", garbageValue = "0")
    public GrandExchangeOffer(Buffer var1, boolean var2) {
        this.state = var1.readByte();
        this.id = var1.readUnsignedShort();
        this.unitPrice = var1.readInt();
        this.totalQuantity = var1.readInt();
        this.currentQuantity = var1.readInt();
        this.currentPrice = var1.readInt();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "118")
    @Export("status")
    public int status() {
        return this.state & 7;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "2104620403")
    @Export("type")
    public int type() {
        return (this.state & 8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-324397199")
    void method5735(int var1) {
        this.state &= -8;
        this.state = ((byte) (this.state | (var1 & 7)));
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-2056263772")
    void method5731(int var1) {
        this.state &= -9;
        if (var1 == 1) {
            this.state = ((byte) (this.state | 8));
        }
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;", garbageValue = "2")
    public static String method5751(CharSequence var0) {
        String var1 = class335.base37DecodeLong(ParamComposition.method3381(var0));
        if (var1 == null) {
            var1 = "";
        }
        return var1;
    }
}