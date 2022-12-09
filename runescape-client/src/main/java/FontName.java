import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pt")
@Implements("FontName")
public class FontName {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lpt;"
   )
   @Export("FontName_plain11")
   public static final FontName FontName_plain11 = new FontName("p11_full");
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lpt;"
   )
   @Export("FontName_plain12")
   public static final FontName FontName_plain12 = new FontName("p12_full");
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lpt;"
   )
   @Export("FontName_bold12")
   public static final FontName FontName_bold12 = new FontName("b12_full");
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lpt;"
   )
   @Export("FontName_verdana11")
   public static final FontName FontName_verdana11 = new FontName("verdana_11pt_regular");
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Lpt;"
   )
   @Export("FontName_verdana13")
   public static final FontName FontName_verdana13 = new FontName("verdana_13pt_regular");
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lpt;"
   )
   @Export("FontName_verdana15")
   public static final FontName FontName_verdana15 = new FontName("verdana_15pt_regular");
   @ObfuscatedName("fb")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("archive19")
   static Archive archive19;
   @ObfuscatedName("f")
   @Export("name")
   String name;

   FontName(String var1) {
      this.name = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)[Lpt;",
      garbageValue = "1254065539"
   )
   public static FontName[] method8203() {
      return new FontName[]{FontName_plain12, FontName_verdana11, FontName_bold12, FontName_verdana15, FontName_verdana13, FontName_plain11};
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2050351066"
   )
   static void method8199() {
      if (Login.clearLoginScreen) {
         ModelData0.titleboxSprite = null;
         Frames.titlebuttonSprite = null;
         Login.runesSprite = null;
         SecureRandomCallable.leftTitleSprite = null;
         class9.rightTitleSprite = null;
         Login.logoSprite = null;
         class109.title_muteSprite = null;
         WorldMapLabel.options_buttons_0Sprite = null;
         class89.options_buttons_2Sprite = null;
         GrandExchangeOfferOwnWorldComparator.worldSelectBackSprites = null;
         class87.worldSelectFlagSprites = null;
         FloorDecoration.worldSelectArrows = null;
         class280.worldSelectStars = null;
         class98.field1340 = null;
         class154.loginScreenRunesAnimation.method2381();
         class384.method7370(2);
         if (NetCache.NetCache_socket != null) {
            try {
               Buffer var0 = new Buffer(4);
               var0.writeByte(2);
               var0.writeMedium(0);
               NetCache.NetCache_socket.write(var0.array, 0, 4);
            } catch (IOException var3) {
               try {
                  NetCache.NetCache_socket.close();
               } catch (Exception var2) {
               }

               ++NetCache.NetCache_ioExceptions;
               NetCache.NetCache_socket = null;
            }
         }

         Login.clearLoginScreen = false;
      }
   }

   @ObfuscatedName("ib")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1513435469"
   )
   static final void method8202(boolean var0) {
      Client.playPcmPlayers();
      ++Client.packetWriter.pendingWrites;
      if (Client.packetWriter.pendingWrites >= 50 || var0) {
         Client.packetWriter.pendingWrites = 0;
         if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
            PacketBufferNode var1 = class136.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
            Client.packetWriter.addNode(var1);

            try {
               Client.packetWriter.flush();
            } catch (IOException var3) {
               Client.hadNetworkError = true;
            }
         }

      }
   }

   @ObfuscatedName("kr")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "-1334048221"
   )
   @Export("formatItemStacks")
   static final String formatItemStacks(int var0) {
      String var1 = Integer.toString(var0);

      for(int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
         var1 = var1.substring(0, var2) + "," + var1.substring(var2);
      }

      if (var1.length() > 9) {
         return " " + MouseRecorder.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
      } else {
         return var1.length() > 6 ? " " + MouseRecorder.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + MouseRecorder.colorStartTag(16776960) + var1 + "</col>";
      }
   }
}
