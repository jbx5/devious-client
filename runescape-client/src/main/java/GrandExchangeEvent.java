import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1765104483
   )
   @Export("world")
   public final int world;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      longValue = -4945736935337905557L
   )
   @Export("age")
   public final long age;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lmz;"
   )
   @Export("grandExchangeOffer")
   public final GrandExchangeOffer grandExchangeOffer;
   @ObfuscatedName("x")
   @Export("offerName")
   String offerName;
   @ObfuscatedName("m")
   @Export("previousOfferName")
   String previousOfferName;

   @ObfuscatedSignature(
      descriptor = "(Lqy;BI)V"
   )
   GrandExchangeEvent(Buffer var1, byte var2, int var3) {
      this.offerName = var1.readStringCp1252NullTerminated();
      this.previousOfferName = var1.readStringCp1252NullTerminated();
      this.world = var1.readUnsignedShort();
      this.age = var1.readLong();
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      this.grandExchangeOffer = new GrandExchangeOffer();
      this.grandExchangeOffer.method6634(2);
      this.grandExchangeOffer.method6626(var2);
      this.grandExchangeOffer.unitPrice = var4;
      this.grandExchangeOffer.totalQuantity = var5;
      this.grandExchangeOffer.currentQuantity = 0;
      this.grandExchangeOffer.currentPrice = 0;
      this.grandExchangeOffer.id = var3;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "1474390937"
   )
   @Export("getOfferName")
   public String getOfferName() {
      return this.offerName;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "-101"
   )
   @Export("getPreviousOfferName")
   public String getPreviousOfferName() {
      return this.previousOfferName;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-180416065"
   )
   static void method6616() {
      Tiles.Tiles_minPlane = 99;
      Tiles.Tiles_underlays = new short[4][104][104];
      class490.Tiles_overlays = new short[4][104][104];
      Tiles.Tiles_shapes = new byte[4][104][104];
      class358.field4344 = new byte[4][104][104];
      class159.field1816 = new int[4][105][105];
      Canvas.Tiles_underlays = new byte[4][105][105];
      Tiles.field1030 = new int[105][105];
      Tiles.Tiles_hue = new int[104];
      PcmPlayer.Tiles_saturation = new int[104];
      Tiles.Tiles_lightness = new int[104];
      NPC.Tiles_hueMultiplier = new int[104];
      MenuAction.field905 = new int[104];
   }
}
