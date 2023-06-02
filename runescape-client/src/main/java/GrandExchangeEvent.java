import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
   @ObfuscatedName("aj")
   public static short[] field4312;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 75833577
   )
   @Export("world")
   public final int world;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      longValue = -1208702684482562975L
   )
   @Export("age")
   public final long age;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Loe;"
   )
   @Export("grandExchangeOffer")
   public final GrandExchangeOffer grandExchangeOffer;
   @ObfuscatedName("as")
   @Export("offerName")
   String offerName;
   @ObfuscatedName("ax")
   @Export("previousOfferName")
   String previousOfferName;

   @ObfuscatedSignature(
      descriptor = "(Ltz;BI)V"
   )
   GrandExchangeEvent(Buffer var1, byte var2, int var3) {
      this.offerName = var1.readStringCp1252NullTerminated();
      this.previousOfferName = var1.readStringCp1252NullTerminated();
      this.world = var1.readUnsignedShort();
      this.age = var1.readLong();
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      this.grandExchangeOffer = new GrandExchangeOffer();
      this.grandExchangeOffer.method6845(2);
      this.grandExchangeOffer.method6855(var2);
      this.grandExchangeOffer.unitPrice = var4;
      this.grandExchangeOffer.totalQuantity = var5;
      this.grandExchangeOffer.currentQuantity = 0;
      this.grandExchangeOffer.currentPrice = 0;
      this.grandExchangeOffer.id = var3;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "1295893712"
   )
   @Export("getOfferName")
   public String getOfferName() {
      return this.offerName;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "-58"
   )
   @Export("getPreviousOfferName")
   public String getPreviousOfferName() {
      return this.previousOfferName;
   }
}
