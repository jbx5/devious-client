import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hq")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements MouseWheel {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lhq;"
   )
   field2045(2, 0),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lhq;"
   )
   @Export("VerticalAlignment_centered")
   VerticalAlignment_centered(0, 1),
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lhq;"
   )
   field2043(1, 2);

   @ObfuscatedName("kj")
   @ObfuscatedSignature(
      descriptor = "[Ltj;"
   )
   @Export("modIconSprites")
   static IndexedSprite[] modIconSprites;
   @ObfuscatedName("sw")
   @ObfuscatedSignature(
      descriptor = "Lgv;"
   )
   @Export("guestClanChannel")
   static ClanChannel guestClanChannel;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -2582509
   )
   @Export("value")
   public final int value;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1907451199
   )
   @Export("id")
   final int id;

   VerticalAlignment(int var3, int var4) {
      this.value = var3;
      this.id = var4;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-14"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)J",
      garbageValue = "724345939"
   )
   static long method3753() {
      try {
         URL var0 = new URL(Widget.method6509("services", false) + "m=accountappeal/login.ws");
         URLConnection var1 = var0.openConnection();
         var1.setRequestProperty("connection", "close");
         var1.setDoInput(true);
         var1.setDoOutput(true);
         var1.setConnectTimeout(5000);
         OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
         var2.write("data1=req");
         var2.flush();
         InputStream var3 = var1.getInputStream();
         Buffer var4 = new Buffer(new byte[1000]);

         do {
            int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset);
            if (var5 == -1) {
               var4.offset = 0;
               long var7 = var4.readLong();
               return var7;
            }

            var4.offset += var5;
         } while(var4.offset < 1000);

         return 0L;
      } catch (Exception var9) {
         return 0L;
      }
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZI)I",
      garbageValue = "1899018290"
   )
   static int method3754(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
         Interpreter.Interpreter_intStackSize -= 2;
         Client.field776 = (short)class389.method7215(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
         if (Client.field776 <= 0) {
            Client.field776 = 256;
         }

         Client.field620 = (short)class389.method7215(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
         if (Client.field620 <= 0) {
            Client.field620 = 256;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
         Interpreter.Interpreter_intStackSize -= 2;
         Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         if (Client.zoomHeight <= 0) {
            Client.zoomHeight = 256;
         }

         Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         if (Client.zoomWidth <= 0) {
            Client.zoomWidth = 320;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
         Interpreter.Interpreter_intStackSize -= 4;
         Client.field780 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         if (Client.field780 <= 0) {
            Client.field780 = 1;
         }

         Client.field781 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         if (Client.field781 <= 0) {
            Client.field781 = 32767;
         } else if (Client.field781 < Client.field780) {
            Client.field781 = Client.field780;
         }

         Client.field591 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         if (Client.field591 <= 0) {
            Client.field591 = 1;
         }

         Client.field783 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
         if (Client.field783 <= 0) {
            Client.field783 = 32767;
         } else if (Client.field783 < Client.field591) {
            Client.field783 = Client.field591;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
         if (Client.viewportWidget != null) {
            WorldMapDecorationType.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportWidth;
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportHeight;
         } else {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomHeight;
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomWidth;
         return 1;
      } else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapRegion.method5289(Client.field776);
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapRegion.method5289(Client.field620);
         return 1;
      } else if (var0 == 6220) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
         return 1;
      } else if (var0 == 6221) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
         return 1;
      } else if (var0 == 6222) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class448.canvasWidth;
         return 1;
      } else if (var0 == 6223) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapID.canvasHeight;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("lk")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-31"
   )
   @Export("createMenuAction")
   static void createMenuAction(int var0) {
      UrlRequester.tempMenuAction = new MenuAction();
      UrlRequester.tempMenuAction.param0 = Client.menuArguments1[var0];
      UrlRequester.tempMenuAction.param1 = Client.menuArguments2[var0];
      UrlRequester.tempMenuAction.opcode = Client.menuOpcodes[var0];
      UrlRequester.tempMenuAction.identifier = Client.menuIdentifiers[var0];
      UrlRequester.tempMenuAction.itemId = Client.menuItemIds[var0];
      UrlRequester.tempMenuAction.action = Client.menuActions[var0];
      UrlRequester.tempMenuAction.target = Client.menuTargets[var0];
   }
}
