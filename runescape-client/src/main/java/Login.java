import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Login")
public class Login {
   @ObfuscatedName("an")
   @Export("clearLoginScreen")
   static boolean clearLoginScreen;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -165575055
   )
   @Export("xPadding")
   static int xPadding = 0;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "[Ltj;"
   )
   @Export("runesSprite")
   static IndexedSprite[] runesSprite;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Ltj;"
   )
   @Export("titlebuttonSprite")
   static IndexedSprite titlebuttonSprite;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Ltm;"
   )
   @Export("rightTitleSprite")
   static SpritePixels rightTitleSprite;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -805293561
   )
   @Export("loginBoxX")
   static int loginBoxX;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 1526243609
   )
   @Export("Login_loadingPercent")
   static int Login_loadingPercent;
   @ObfuscatedName("al")
   @Export("Login_loadingText")
   static String Login_loadingText;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = -566253033
   )
   @Export("Login_banType")
   static int Login_banType;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = 1836462063
   )
   static int field929;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = 203490525
   )
   @Export("loginIndex")
   static int loginIndex;
   @ObfuscatedName("cu")
   @Export("Login_response0")
   static String Login_response0;
   @ObfuscatedName("ca")
   @Export("Login_response1")
   static String Login_response1;
   @ObfuscatedName("cf")
   @Export("Login_response2")
   static String Login_response2;
   @ObfuscatedName("cw")
   @Export("Login_response3")
   static String Login_response3;
   @ObfuscatedName("ch")
   @Export("Login_username")
   static String Login_username;
   @ObfuscatedName("cp")
   @Export("Login_password")
   static String Login_password;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = 77869249
   )
   static int field935;
   @ObfuscatedName("cv")
   static String[] field938;
   @ObfuscatedName("cb")
   static String field939;
   @ObfuscatedName("cn")
   static boolean field947;
   @ObfuscatedName("ct")
   static boolean field941;
   @ObfuscatedName("cz")
   static boolean field942;
   @ObfuscatedName("dd")
   @ObfuscatedGetter(
      intValue = -270199593
   )
   @Export("currentLoginField")
   static int currentLoginField;
   @ObfuscatedName("dt")
   @Export("worldSelectOpen")
   static boolean worldSelectOpen;
   @ObfuscatedName("dq")
   @ObfuscatedGetter(
      intValue = 1715383833
   )
   @Export("hoveredWorldIndex")
   static int hoveredWorldIndex;
   @ObfuscatedName("dh")
   @ObfuscatedGetter(
      intValue = -754088211
   )
   @Export("worldSelectPage")
   static int worldSelectPage;
   @ObfuscatedName("dp")
   @ObfuscatedGetter(
      intValue = -1876641005
   )
   @Export("worldSelectPagesCount")
   static int worldSelectPagesCount;
   @ObfuscatedName("di")
   @ObfuscatedGetter(
      longValue = -4458678754542330191L
   )
   static long field949;
   @ObfuscatedName("dj")
   @ObfuscatedGetter(
      longValue = 8560470216792171217L
   )
   static long field930;
   @ObfuscatedName("dk")
   static String[] field952;
   @ObfuscatedName("dy")
   static String[] field953;
   @ObfuscatedName("dg")
   static String[] field933;
   @ObfuscatedName("lx")
   @ObfuscatedGetter(
      intValue = 430718727
   )
   static int field917;

   static {
      loginBoxX = xPadding + 202;
      Login_loadingPercent = 10;
      Login_loadingText = "";
      Login_banType = -1;
      field929 = 1;
      loginIndex = 0;
      Login_response0 = "";
      Login_response1 = "";
      Login_response2 = "";
      Login_response3 = "";
      Login_username = "";
      Login_password = "";
      field935 = 0;
      field938 = new String[8];
      field939 = "";
      field947 = false;
      field941 = false;
      field942 = true;
      currentLoginField = 0;
      worldSelectOpen = false;
      hoveredWorldIndex = -1;
      worldSelectPage = 0;
      worldSelectPagesCount = 0;
      new DecimalFormat("##0.00");
      new class132();
      field949 = -1L;
      field930 = -1L;
      field952 = new String[]{"title.jpg"};
      field953 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
      field933 = new String[]{"logo_speedrunning"};
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lmb;I[B[BI)V",
      garbageValue = "-1847692125"
   )
   @Export("Widget_setKey")
   static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
      if (var0.field3678 == null) {
         if (var2 == null) {
            return;
         }

         var0.field3678 = new byte[11][];
         var0.field3671 = new byte[11][];
         var0.field3639 = new int[11];
         var0.field3681 = new int[11];
      }

      var0.field3678[var1] = var2;
      if (var2 != null) {
         var0.field3677 = true;
      } else {
         var0.field3677 = false;

         for(int var4 = 0; var4 < var0.field3678.length; ++var4) {
            if (var0.field3678[var4] != null) {
               var0.field3677 = true;
               break;
            }
         }
      }

      var0.field3671[var1] = var3;
   }
}
