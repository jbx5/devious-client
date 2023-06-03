import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
public class class7 {
   @ObfuscatedName("at")
   ExecutorService field20 = Executors.newSingleThreadExecutor();
   @ObfuscatedName("an")
   Future field21;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Ltz;"
   )
   final Buffer field19;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Las;"
   )
   final class3 field22;

   @ObfuscatedSignature(
      descriptor = "(Ltz;Las;)V"
   )
   public class7(Buffer var1, class3 var2) {
      this.field19 = var1;
      this.field22 = var2;
      this.method41();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "443618027"
   )
   public boolean method37() {
      return this.field21.isDone();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1008705538"
   )
   public void method50() {
      this.field20.shutdown();
      this.field20 = null;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)Ltz;",
      garbageValue = "-1569723442"
   )
   public Buffer method40() {
      try {
         return (Buffer)this.field21.get();
      } catch (Exception var2) {
         return null;
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-28030"
   )
   void method41() {
      this.field21 = this.field20.submit(new class1(this, this.field19, this.field22));
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(CI)C",
      garbageValue = "557899842"
   )
   static char method52(char var0) {
      switch (var0) {
         case ' ':
         case '-':
         case '_':
         case ' ':
            return '_';
         case '#':
         case '[':
         case ']':
            return var0;
         case 'À':
         case 'Á':
         case 'Â':
         case 'Ã':
         case 'Ä':
         case 'à':
         case 'á':
         case 'â':
         case 'ã':
         case 'ä':
            return 'a';
         case 'Ç':
         case 'ç':
            return 'c';
         case 'È':
         case 'É':
         case 'Ê':
         case 'Ë':
         case 'è':
         case 'é':
         case 'ê':
         case 'ë':
            return 'e';
         case 'Í':
         case 'Î':
         case 'Ï':
         case 'í':
         case 'î':
         case 'ï':
            return 'i';
         case 'Ñ':
         case 'ñ':
            return 'n';
         case 'Ò':
         case 'Ó':
         case 'Ô':
         case 'Õ':
         case 'Ö':
         case 'ò':
         case 'ó':
         case 'ô':
         case 'õ':
         case 'ö':
            return 'o';
         case 'Ù':
         case 'Ú':
         case 'Û':
         case 'Ü':
         case 'ù':
         case 'ú':
         case 'û':
         case 'ü':
            return 'u';
         case 'ß':
            return 'b';
         case 'ÿ':
         case 'Ÿ':
            return 'y';
         default:
            return Character.toLowerCase(var0);
      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "-111"
   )
   static final void method51(String var0) {
      PacketBufferNode var1 = ObjectComposition.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
      var1.packetBuffer.writeByte(Widget.stringCp1252NullTerminatedByteSize(var0));
      var1.packetBuffer.writeStringCp1252NullTerminated(var0);
      Client.packetWriter.addNode(var1);
   }

   @ObfuscatedName("jf")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-541537538"
   )
   static final void method44() {
      int var0 = class180.menuX;
      int var1 = NewStuff.menuY;
      int var2 = class237.menuWidth;
      int var3 = class60.menuHeight;
      int var4 = 6116423;
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4);
      Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0);
      Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
      class166.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1);
      int var5 = MouseHandler.MouseHandler_x;
      int var6 = MouseHandler.MouseHandler_y;

      int var7;
      int var8;
      int var9;
      for(var7 = 0; var7 < Client.menuOptionsCount; ++var7) {
         var8 = var1 + (Client.menuOptionsCount - 1 - var7) * 15 + 31;
         var9 = 16777215;
         if (var5 > var0 && var5 < var2 + var0 && var6 > var8 - 13 && var6 < var8 + 3) {
            var9 = 16776960;
         }

         Font var12 = class166.fontBold12;
         String var13;
         if (var7 < 0) {
            var13 = "";
         } else if (Client.menuTargets[var7].length() > 0) {
            var13 = Client.menuActions[var7] + " " + Client.menuTargets[var7];
         } else {
            var13 = Client.menuActions[var7];
         }

         var12.draw(var13, var0 + 3, var8, var9, 0);
      }

      var7 = class180.menuX;
      var8 = NewStuff.menuY;
      var9 = class237.menuWidth;
      int var10 = class60.menuHeight;

      for(int var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
         if (Client.rootWidgetWidths[var11] + Client.rootWidgetXs[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var10 + var8) {
            Client.field724[var11] = true;
         }
      }

   }

   @ObfuscatedName("my")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1677894938"
   )
   @Export("Clan_joinChat")
   static final void Clan_joinChat(String var0) {
      if (!var0.equals("")) {
         PacketBufferNode var1 = ObjectComposition.getPacketBufferNode(ClientPacket.field3128, Client.packetWriter.isaacCipher);
         var1.packetBuffer.writeByte(Widget.stringCp1252NullTerminatedByteSize(var0));
         var1.packetBuffer.writeStringCp1252NullTerminated(var0);
         Client.packetWriter.addNode(var1);
      }
   }
}
