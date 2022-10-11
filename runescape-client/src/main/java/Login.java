import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("Login")
public class Login {
   @ObfuscatedName("f")
   @Export("clearLoginScreen")
   static boolean clearLoginScreen;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -45097143
   )
   @Export("xPadding")
   static int xPadding = 0;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Lry;"
   )
   @Export("options_buttons_0Sprite")
   static IndexedSprite options_buttons_0Sprite;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 153301173
   )
   @Export("loginBoxX")
   static int loginBoxX;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -457094687
   )
   @Export("Login_loadingPercent")
   static int Login_loadingPercent;
   @ObfuscatedName("k")
   @Export("Login_loadingText")
   static String Login_loadingText;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -672921453
   )
   @Export("Login_banType")
   static int Login_banType;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1067270543
   )
   static int field925;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1476990491
   )
   @Export("loginIndex")
   static int loginIndex;
   @ObfuscatedName("bx")
   @Export("Login_response0")
   static String Login_response0;
   @ObfuscatedName("bh")
   @Export("Login_response1")
   static String Login_response1;
   @ObfuscatedName("bm")
   @Export("Login_response2")
   static String Login_response2;
   @ObfuscatedName("bp")
   @Export("Login_response3")
   static String Login_response3;
   @ObfuscatedName("bl")
   @Export("Login_username")
   static String Login_username;
   @ObfuscatedName("bo")
   @Export("Login_password")
   static String Login_password;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = -1701376131
   )
   static int field913;
   @ObfuscatedName("bq")
   static String[] field914;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -427317707
   )
   static int field915;
   @ObfuscatedName("bj")
   static boolean field916;
   @ObfuscatedName("bw")
   static boolean field917;
   @ObfuscatedName("bz")
   static boolean field900;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = 1294473831
   )
   @Export("currentLoginField")
   static int currentLoginField;
   @ObfuscatedName("cs")
   @Export("worldSelectOpen")
   static boolean worldSelectOpen;
   @ObfuscatedName("co")
   @ObfuscatedGetter(
      intValue = 1259488239
   )
   @Export("hoveredWorldIndex")
   static int hoveredWorldIndex;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = 220269139
   )
   @Export("worldSelectPage")
   static int worldSelectPage;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = -1175830793
   )
   @Export("worldSelectPagesCount")
   static int worldSelectPagesCount;
   @ObfuscatedName("ch")
   @ObfuscatedGetter(
      longValue = 963222976408093423L
   )
   static long field926;
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      longValue = 639732632039117835L
   )
   static long field918;
   @ObfuscatedName("cm")
   static String[] field928;
   @ObfuscatedName("cc")
   static String[] field911;

   static {
      loginBoxX = xPadding + 202;
      Login_loadingPercent = 10;
      Login_loadingText = "";
      Login_banType = -1;
      field925 = 1;
      loginIndex = 0;
      Login_response0 = "";
      Login_response1 = "";
      Login_response2 = "";
      Login_response3 = "";
      Login_username = "";
      Login_password = "";
      field913 = 0;
      field914 = new String[8];
      field916 = false;
      field917 = false;
      field900 = true;
      currentLoginField = 0;
      worldSelectOpen = false;
      hoveredWorldIndex = -1;
      worldSelectPage = 0;
      worldSelectPagesCount = 0;
      new DecimalFormat("##0.00");
      new class127();
      field926 = -1L;
      field918 = -1L;
      field928 = new String[]{"title.jpg"};
      field911 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "logo_speedrunning", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-2"
   )
   @Export("getVarbit")
   public static int getVarbit(int var0) {
      VarbitComposition var1 = class453.method8258(var0);
      int var2 = var1.baseVar;
      int var3 = var1.startBit;
      int var4 = var1.endBit;
      int var5 = Varps.Varps_masks[var4 - var3];
      return Varps.Varps_main[var2] >> var3 & var5;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIII)Lbz;",
      garbageValue = "1608304248"
   )
   @Export("getWorldMapScript")
   static Script getWorldMapScript(int var0, int var1, int var2) {
      int var3 = FloorOverlayDefinition.method3863(var1, var0);
      Script var4 = class453.method8261(var3, var0);
      if (var4 != null) {
         return var4;
      } else {
         var3 = Interpreter.method2007(var2, var0);
         var4 = class453.method8261(var3, var0);
         return var4 != null ? var4 : null;
      }
   }

   @ObfuscatedName("jx")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIII)V",
      garbageValue = "-1633812322"
   )
   static final void method2081(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
      UserComparator8.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, false);
   }
}
