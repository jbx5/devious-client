import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1311074651
   )
   @Export("world")
   public final int world;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      longValue = -4090332982333422471L
   )
   @Export("age")
   public final long age;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lmi;"
   )
   @Export("grandExchangeOffer")
   public final GrandExchangeOffer grandExchangeOffer;
   @ObfuscatedName("x")
   @Export("offerName")
   String offerName;
   @ObfuscatedName("h")
   @Export("previousOfferName")
   String previousOfferName;

   @ObfuscatedSignature(
      descriptor = "(Lqr;BI)V"
   )
   GrandExchangeEvent(Buffer var1, byte var2, int var3) {
      this.offerName = var1.readStringCp1252NullTerminated();
      this.previousOfferName = var1.readStringCp1252NullTerminated();
      this.world = var1.readUnsignedShort();
      this.age = var1.readLong();
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      this.grandExchangeOffer = new GrandExchangeOffer();
      this.grandExchangeOffer.method6518(2);
      this.grandExchangeOffer.method6512(var2);
      this.grandExchangeOffer.unitPrice = var4;
      this.grandExchangeOffer.totalQuantity = var5;
      this.grandExchangeOffer.currentQuantity = 0;
      this.grandExchangeOffer.currentPrice = 0;
      this.grandExchangeOffer.id = var3;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "8"
   )
   @Export("getOfferName")
   public String getOfferName() {
      return this.offerName;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1202205713"
   )
   @Export("getPreviousOfferName")
   public String getPreviousOfferName() {
      return this.previousOfferName;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2067930525"
   )
   @Export("loadWorlds")
   static boolean loadWorlds() {
      try {
         if (class96.World_request == null) {
            class96.World_request = PcmPlayer.urlRequester.request(new URL(class127.field1534));
         } else if (class96.World_request.isDone()) {
            byte[] var0 = class96.World_request.getResponse();
            Buffer var1 = new Buffer(var0);
            var1.readInt();
            World.World_count = var1.readUnsignedShort();
            class412.World_worlds = new World[World.World_count];

            World var3;
            for(int var2 = 0; var2 < World.World_count; var3.index = var2++) {
               var3 = class412.World_worlds[var2] = new World();
               var3.id = var1.readUnsignedShort();
               var3.properties = var1.readInt();
               var3.host = var1.readStringCp1252NullTerminated();
               var3.activity = var1.readStringCp1252NullTerminated();
               var3.location = var1.readUnsignedByte();
               var3.population = var1.readShort();
            }

            class10.sortWorlds(class412.World_worlds, 0, class412.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
            class96.World_request = null;
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         class96.World_request = null;
      }

      return false;
   }
}
