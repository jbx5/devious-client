import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cp")
@Implements("Login")
public class Login {
   @ObfuscatedName("al")
   @Export("clearLoginScreen")
   static boolean clearLoginScreen;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1829519957
   )
   @Export("xPadding")
   static int xPadding = 0;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "[Lsp;"
   )
   @Export("runesSprite")
   static IndexedSprite[] runesSprite;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lsp;"
   )
   @Export("titlebuttonSprite")
   static IndexedSprite titlebuttonSprite;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lsn;"
   )
   @Export("leftTitleSprite")
   static SpritePixels leftTitleSprite;
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Lsp;"
   )
   @Export("logoSprite")
   static IndexedSprite logoSprite;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lsp;"
   )
   @Export("options_buttons_0Sprite")
   static IndexedSprite options_buttons_0Sprite;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lsp;"
   )
   @Export("options_buttons_2Sprite")
   static IndexedSprite options_buttons_2Sprite;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1797050063
   )
   @Export("loginBoxX")
   static int loginBoxX;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 647465325
   )
   @Export("loginBoxCenter")
   static int loginBoxCenter;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 813109745
   )
   @Export("Login_loadingPercent")
   static int Login_loadingPercent;
   @ObfuscatedName("ah")
   @Export("Login_loadingText")
   static String Login_loadingText;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = 589427449
   )
   @Export("Login_banType")
   static int Login_banType;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = -550556813
   )
   static int field887;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -1020695771
   )
   @Export("loginIndex")
   static int loginIndex;
   @ObfuscatedName("cl")
   @Export("Login_response0")
   static String Login_response0;
   @ObfuscatedName("ca")
   @Export("Login_response1")
   static String Login_response1;
   @ObfuscatedName("cb")
   @Export("Login_response2")
   static String Login_response2;
   @ObfuscatedName("co")
   @Export("Login_response3")
   static String Login_response3;
   @ObfuscatedName("cj")
   @Export("Login_username")
   static String Login_username;
   @ObfuscatedName("cn")
   @Export("Login_password")
   static String Login_password;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = 621584615
   )
   static int field909;
   @ObfuscatedName("cc")
   static String[] field908;
   @ObfuscatedName("cg")
   static String field911;
   @ObfuscatedName("cw")
   static boolean field900;
   @ObfuscatedName("cp")
   static boolean field913;
   @ObfuscatedName("cv")
   static boolean field914;
   @ObfuscatedName("cr")
   @ObfuscatedGetter(
      intValue = -67843131
   )
   @Export("currentLoginField")
   static int currentLoginField;
   @ObfuscatedName("dp")
   @Export("worldSelectOpen")
   static boolean worldSelectOpen;
   @ObfuscatedName("dh")
   @ObfuscatedGetter(
      intValue = -611355623
   )
   @Export("hoveredWorldIndex")
   static int hoveredWorldIndex;
   @ObfuscatedName("dj")
   @ObfuscatedGetter(
      intValue = 1145129403
   )
   @Export("worldSelectPage")
   static int worldSelectPage;
   @ObfuscatedName("da")
   @ObfuscatedGetter(
      intValue = 1942540433
   )
   @Export("worldSelectPagesCount")
   static int worldSelectPagesCount;
   @ObfuscatedName("dw")
   @ObfuscatedGetter(
      longValue = 1083052260744045781L
   )
   static long field922;
   @ObfuscatedName("dt")
   @ObfuscatedGetter(
      longValue = -3783900184507538293L
   )
   static long field923;
   @ObfuscatedName("db")
   static String[] field924;
   @ObfuscatedName("dm")
   static String[] field925;
   @ObfuscatedName("dz")
   static String[] field926;
   @ObfuscatedName("np")
   @ObfuscatedGetter(
      intValue = -398912461
   )
   @Export("menuY")
   static int menuY;

   static {
      loginBoxX = xPadding + 202;
      Login_loadingPercent = 10;
      Login_loadingText = "";
      Login_banType = -1;
      field887 = 1;
      loginIndex = 0;
      Login_response0 = "";
      Login_response1 = "";
      Login_response2 = "";
      Login_response3 = "";
      Login_username = "";
      Login_password = "";
      field909 = 0;
      field908 = new String[8];
      field911 = "";
      field900 = false;
      field913 = false;
      field914 = true;
      currentLoginField = 0;
      worldSelectOpen = false;
      hoveredWorldIndex = -1;
      worldSelectPage = 0;
      worldSelectPagesCount = 0;
      new DecimalFormat("##0.00");
      new class130();
      field922 = -1L;
      field923 = -1L;
      field924 = new String[]{"title.jpg"};
      field925 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
      field926 = new String[]{"logo_speedrunning"};
   }

   @ObfuscatedName("aj")
   public static final void method2088(long var0) {
      if (var0 > 0L) {
         if (0L == var0 % 10L) {
            class169.method3466(var0 - 1L);
            class169.method3466(1L);
         } else {
            class169.method3466(var0);
         }

      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;S)I",
      garbageValue = "977"
   )
   @Export("hashString")
   public static int hashString(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + class18.charToByteCp1252(var0.charAt(var3));
      }

      return var2;
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZB)I",
      garbageValue = "27"
   )
   static int method2107(int var0, Script var1, boolean var2) {
      int var3;
      if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
         return 1;
      } else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
         return 1;
      } else {
         int var13;
         if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            var13 = Client.grandExchangeOffers[var3].status();
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0;
            return 1;
         } else {
            boolean var12;
            if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
               var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
               if (Projectile.grandExchangeEvents != null) {
                  Projectile.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
               var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
               if (Projectile.grandExchangeEvents != null) {
                  Projectile.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
               Interpreter.Interpreter_intStackSize -= 2;
               var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == 1;
               boolean var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
               if (Projectile.grandExchangeEvents != null) {
                  Client.GrandExchangeEvents_worldComparator.filterWorlds = var11;
                  Projectile.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
               var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
               if (Projectile.grandExchangeEvents != null) {
                  Projectile.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
               var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
               if (Projectile.grandExchangeEvents != null) {
                  Projectile.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
               }

               return 1;
            } else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Projectile.grandExchangeEvents == null ? 0 : Projectile.grandExchangeEvents.events.size();
               return 1;
            } else {
               GrandExchangeEvent var4;
               if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)Projectile.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.world;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)Projectile.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.getOfferName();
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)Projectile.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName();
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)Projectile.grandExchangeEvents.events.get(var3);
                  long var5 = WorldMapSection2.method4844() - GrandExchangeOfferWorldComparator.field4254 - var4.age;
                  int var7 = (int)(var5 / 3600000L);
                  int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
                  int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * '\uea60')) / 1000L);
                  String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var10;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)Projectile.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)Projectile.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice;
                  return 1;
               } else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (GrandExchangeEvent)Projectile.grandExchangeEvents.events.get(var3);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }
}
