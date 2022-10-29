import java.text.ParseException;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("FloorUnderlayDefinition_archive")
   public static AbstractArchive FloorUnderlayDefinition_archive;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("FloorUnderlayDefinition_cached")
   public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 753437595
   )
   @Export("rgb")
   int rgb = 0;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 295922173
   )
   @Export("hue")
   public int hue;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -77220349
   )
   @Export("saturation")
   public int saturation;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 397399225
   )
   @Export("lightness")
   public int lightness;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 363693575
   )
   @Export("hueMultiplier")
   public int hueMultiplier;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1829034287"
   )
   @Export("postDecode")
   public void postDecode() {
      this.setHsl(this.rgb);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lqr;II)V",
      garbageValue = "-300836628"
   )
   @Export("decode")
   public void decode(Buffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.decodeNext(var1, var3, var2);
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lqr;III)V",
      garbageValue = "1456987597"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2, int var3) {
      if (var2 == 1) {
         this.rgb = var1.readMedium();
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "16"
   )
   @Export("setHsl")
   void setHsl(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0;
      double var4 = (double)(var1 >> 8 & 255) / 256.0;
      double var6 = (double)(var1 & 255) / 256.0;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0;
      double var14 = 0.0;
      double var16 = (var8 + var10) / 2.0;
      if (var10 != var8) {
         if (var16 < 0.5) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if (var16 >= 0.5) {
            var14 = (var10 - var8) / (2.0 - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = 2.0 + (var6 - var2) / (var10 - var8);
         } else if (var6 == var10) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0;
         }
      }

      var12 /= 6.0;
      this.saturation = (int)(var14 * 256.0);
      this.lightness = (int)(var16 * 256.0);
      if (this.saturation < 0) {
         this.saturation = 0;
      } else if (this.saturation > 255) {
         this.saturation = 255;
      }

      if (this.lightness < 0) {
         this.lightness = 0;
      } else if (this.lightness > 255) {
         this.lightness = 255;
      }

      if (var16 > 0.5) {
         this.hueMultiplier = (int)((1.0 - var16) * var14 * 512.0);
      } else {
         this.hueMultiplier = (int)(var14 * var16 * 512.0);
      }

      if (this.hueMultiplier < 1) {
         this.hueMultiplier = 1;
      }

      this.hue = (int)((double)this.hueMultiplier * var12);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljn;Lro;I)Ljc;",
      garbageValue = "-1310025636"
   )
   @Export("getPacketBufferNode")
   public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
      PacketBufferNode var2 = WorldMapLabelSize.method4683();
      var2.clientPacket = var0;
      var2.clientPacketLength = var0.length;
      if (var2.clientPacketLength == -1) {
         var2.packetBuffer = new PacketBuffer(260);
      } else if (var2.clientPacketLength == -2) {
         var2.packetBuffer = new PacketBuffer(10000);
      } else if (var2.clientPacketLength <= 18) {
         var2.packetBuffer = new PacketBuffer(20);
      } else if (var2.clientPacketLength <= 98) {
         var2.packetBuffer = new PacketBuffer(100);
      } else {
         var2.packetBuffer = new PacketBuffer(260);
      }

      var2.packetBuffer.setIsaacCipher(var1);
      var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
      var2.index = 0;
      return var2;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(ILlg;Ljava/lang/String;Ljava/lang/String;IZI)V",
      garbageValue = "-1976408626"
   )
   public static void method3623(int var0, AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
      int var6 = var1.getGroupId(var2);
      int var7 = var1.getFileId(var6, var3);
      class283.musicPlayerStatus = 1;
      DevicePcmPlayerProvider.musicTrackArchive = var1;
      class283.musicTrackGroupId = var6;
      class283.musicTrackFileId = var7;
      Messages.musicTrackVolume = var4;
      GrandExchangeEvents.musicTrackBoolean = var5;
      class19.pcmSampleLength = var0;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "949354995"
   )
   static boolean method3622() {
      Date var0;
      try {
         var0 = CollisionMap.method4028();
      } catch (ParseException var9) {
         GrandExchangeOfferOwnWorldComparator.method1171(7);
         MusicPatchNode2.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
         return false;
      }

      if (var0 == null) {
         return false;
      } else {
         java.util.Calendar var2 = java.util.Calendar.getInstance();
         var2.set(1, var2.get(1) - 13);
         var2.set(5, var2.get(5) + 1);
         var2.set(11, 0);
         var2.set(12, 0);
         var2.set(13, 0);
         var2.set(14, 0);
         Date var3 = var2.getTime();
         boolean var5 = var0.before(var3);
         Date var4 = class132.method2964();
         boolean var7 = var0.after(var4);
         if (!var7) {
            GrandExchangeOfferOwnWorldComparator.method1171(7);
            MusicPatchNode2.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
            return false;
         } else {
            if (!var5) {
               HealthBarDefinition.field1923 = 8388607;
            } else {
               HealthBarDefinition.field1923 = (int)(var0.getTime() / 86400000L - 11745L);
            }

            return true;
         }
      }
   }
}
