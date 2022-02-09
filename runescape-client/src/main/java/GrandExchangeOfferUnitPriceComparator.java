import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("lq")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lld;Lld;B)I", garbageValue = "-101")
    @Export("compare_bridged")
    int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
        return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1;
    }

    public boolean equals(Object var1) {
        return super.equals(var1);
    }

    public int compare(Object var1, Object var2) {
        return this.compare_bridged(((GrandExchangeEvent) (var1)), ((GrandExchangeEvent) (var2)));
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Lpi;I)Ljava/lang/String;", garbageValue = "-1404402538")
    public static String method5755(Buffer var0) {
        String var1;
        try {
            int var2 = var0.readUShortSmart();
            if (var2 > 32767) {
                var2 = 32767;
            }
            byte[] var3 = new byte[var2];
            var0.offset += class13.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
            String var4 = class140.decodeStringCp1252(var3, 0, var2);
            var1 = var4;
        } catch (Exception var6) {
            var1 = "Cabbage";
        }
        return var1;
    }
}