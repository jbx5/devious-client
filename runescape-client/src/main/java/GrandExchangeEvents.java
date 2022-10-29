import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
   @ObfuscatedName("f")
   @Export("GrandExchangeEvents_ageComparator")
   public static Comparator GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator();
   @ObfuscatedName("c")
   @Export("GrandExchangeEvents_priceComparator")
   public static Comparator GrandExchangeEvents_priceComparator;
   @ObfuscatedName("x")
   @Export("GrandExchangeEvents_nameComparator")
   public static Comparator GrandExchangeEvents_nameComparator;
   @ObfuscatedName("h")
   @Export("GrandExchangeEvents_quantityComparator")
   public static Comparator GrandExchangeEvents_quantityComparator;
   @ObfuscatedName("l")
   @Export("musicTrackBoolean")
   public static boolean musicTrackBoolean;
   @ObfuscatedName("a")
   @Export("events")
   public final List events;

   static {
      new GrandExchangeOfferWorldComparator();
      GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator();
      GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator();
      GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
   }

   @ObfuscatedSignature(
      descriptor = "(Lqr;Z)V",
      garbageValue = "1"
   )
   public GrandExchangeEvents(Buffer var1, boolean var2) {
      int var3 = var1.readUnsignedShort();
      boolean var4 = var1.readUnsignedByte() == 1;
      byte var5;
      if (var4) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      int var6 = var1.readUnsignedShort();
      this.events = new ArrayList(var6);

      for(int var7 = 0; var7 < var6; ++var7) {
         this.events.add(new GrandExchangeEvent(var1, var5, var3));
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Comparator;ZI)V",
      garbageValue = "-1882491116"
   )
   @Export("sort")
   public void sort(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.events, var1);
      } else {
         Collections.sort(this.events, Collections.reverseOrder(var1));
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(III)Lbk;",
      garbageValue = "866437887"
   )
   @Export("Messages_getByChannelAndID")
   static Message Messages_getByChannelAndID(int var0, int var1) {
      ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
      return var2.getMessage(var1);
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1985609196"
   )
   static void method6463(boolean var0) {
      byte var1 = 0;
      boolean var2 = BufferedSink.clientPreferences.method2472() >= Client.field494;
      if (!var2) {
         var1 = 12;
      } else if (ClanChannelMember.client.method1184() || ClanChannelMember.client.method1366()) {
         var1 = 10;
      }

      GrandExchangeOfferOwnWorldComparator.method1171(var1);
      if (var0) {
         Login.Login_username = "";
         Login.Login_password = "";
         class360.field4308 = 0;
         class355.otp = "";
      }

      PcmPlayer.method830();
      class283.method5450();
   }
}
