import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ld")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = -1765018995)
    @Export("world")
    public final int world;

    @ObfuscatedName("l")
    @ObfuscatedGetter(longValue = 5745888229985927283L)
    @Export("age")
    public final long age;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Llm;")
    @Export("grandExchangeOffer")
    public final GrandExchangeOffer grandExchangeOffer;

    @ObfuscatedName("e")
    @Export("offerName")
    String offerName;

    @ObfuscatedName("r")
    @Export("previousOfferName")
    String previousOfferName;

    @ObfuscatedSignature(descriptor = "(Lpi;BI)V")
    GrandExchangeEvent(Buffer var1, byte var2, int var3) {
        this.offerName = var1.readStringCp1252NullTerminated();
        this.previousOfferName = var1.readStringCp1252NullTerminated();
        this.world = var1.readUnsignedShort();
        this.age = var1.readLong();
        int var4 = var1.readInt();
        int var5 = var1.readInt();
        this.grandExchangeOffer = new GrandExchangeOffer();
        this.grandExchangeOffer.method5735(2);
        this.grandExchangeOffer.method5731(var2);
        this.grandExchangeOffer.unitPrice = var4;
        this.grandExchangeOffer.totalQuantity = var5;
        this.grandExchangeOffer.currentQuantity = 0;
        this.grandExchangeOffer.currentPrice = 0;
        this.grandExchangeOffer.id = var3;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "714500304")
    @Export("getOfferName")
    public String getOfferName() {
        return this.offerName;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-1208399136")
    @Export("getPreviousOfferName")
    public String getPreviousOfferName() {
        return this.previousOfferName;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lkq;Lkq;B)V", garbageValue = "-116")
    public static void method5726(AbstractArchive var0, AbstractArchive var1) {
        KitDefinition.KitDefinition_archive = var0;
        KitDefinition.KitDefinition_modelsArchive = var1;
        UserComparator10.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
    }
}