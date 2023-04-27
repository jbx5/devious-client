import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("Login")
public class Login {
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 578342931
   )
   @Export("xPadding")
   static int xPadding = 0;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Ltc;"
   )
   @Export("titleboxSprite")
   static IndexedSprite titleboxSprite;
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Ltc;"
   )
   @Export("options_buttons_0Sprite")
   static IndexedSprite options_buttons_0Sprite;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Ltc;"
   )
   static IndexedSprite field893;
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Ltc;"
   )
   static IndexedSprite field907;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -575466127
   )
   static int field927;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lsg;"
   )
   static Buffer field928;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 678588245
   )
   @Export("loginBoxX")
   static int loginBoxX;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 1158424865
   )
   @Export("Login_loadingPercent")
   static int Login_loadingPercent;
   @ObfuscatedName("ae")
   @Export("Login_loadingText")
   static String Login_loadingText;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = -1478945003
   )
   @Export("Login_banType")
   static int Login_banType;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = -1733444455
   )
   static int field916;
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      intValue = 1145608355
   )
   @Export("loginIndex")
   static int loginIndex;
   @ObfuscatedName("ci")
   @Export("Login_response0")
   static String Login_response0;
   @ObfuscatedName("cs")
   @Export("Login_response1")
   static String Login_response1;
   @ObfuscatedName("cc")
   @Export("Login_response2")
   static String Login_response2;
   @ObfuscatedName("cn")
   @Export("Login_response3")
   static String Login_response3;
   @ObfuscatedName("ca")
   @Export("Login_username")
   static String Login_username;
   @ObfuscatedName("cu")
   @Export("Login_password")
   static String Login_password;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = -1262226977
   )
   static int field909;
   @ObfuscatedName("cm")
   static String[] field910;
   @ObfuscatedName("cy")
   static String field911;
   @ObfuscatedName("cj")
   static boolean field890;
   @ObfuscatedName("ch")
   static boolean field902;
   @ObfuscatedName("cd")
   static boolean field914;
   @ObfuscatedName("dm")
   @ObfuscatedGetter(
      intValue = -1232221421
   )
   @Export("currentLoginField")
   static int currentLoginField;
   @ObfuscatedName("di")
   @Export("worldSelectOpen")
   static boolean worldSelectOpen;
   @ObfuscatedName("de")
   @ObfuscatedGetter(
      intValue = 248569915
   )
   @Export("hoveredWorldIndex")
   static int hoveredWorldIndex;
   @ObfuscatedName("dh")
   @ObfuscatedGetter(
      intValue = 1246310743
   )
   @Export("worldSelectPage")
   static int worldSelectPage;
   @ObfuscatedName("dp")
   @ObfuscatedGetter(
      intValue = 1959698517
   )
   @Export("worldSelectPagesCount")
   static int worldSelectPagesCount;
   @ObfuscatedName("db")
   @ObfuscatedGetter(
      longValue = -7899453336143161787L
   )
   static long field894;
   @ObfuscatedName("df")
   @ObfuscatedGetter(
      longValue = 6949275123175874863L
   )
   static long field923;
   @ObfuscatedName("dq")
   static String[] field924;
   @ObfuscatedName("dd")
   static String[] field925;
   @ObfuscatedName("dj")
   static String[] field926;

   static {
      loginBoxX = xPadding + 202;
      Login_loadingPercent = 10;
      Login_loadingText = "";
      Login_banType = -1;
      field916 = 1;
      loginIndex = 0;
      Login_response0 = "";
      Login_response1 = "";
      Login_response2 = "";
      Login_response3 = "";
      Login_username = "";
      Login_password = "";
      field909 = 0;
      field910 = new String[8];
      field911 = "";
      field890 = false;
      field902 = false;
      field914 = true;
      currentLoginField = 0;
      worldSelectOpen = false;
      hoveredWorldIndex = -1;
      worldSelectPage = 0;
      worldSelectPagesCount = 0;
      new DecimalFormat("##0.00");
      new class129();
      field894 = -1L;
      field923 = -1L;
      field924 = new String[]{"title.jpg"};
      field925 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
      field926 = new String[]{"logo_speedrunning"};
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-722826482"
   )
   static void method2100(boolean var0) {
      byte var1 = 0;
      if (!class134.method3178()) {
         var1 = 12;
      } else if (ScriptFrame.client.method1431() || ScriptFrame.client.method1235() || ScriptFrame.client.method1234()) {
         var1 = 10;
      }

      class129.method3124(var1);
      if (var0) {
         Login_username = "";
         Login_password = "";
         class204.field2330 = 0;
         Messages.otp = "";
      }

      WallDecoration.method5025();
      if (Client.Login_isUsernameRemembered && Login_username != null && Login_username.length() > 0) {
         currentLoginField = 1;
      } else {
         currentLoginField = 0;
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2141606464"
   )
   static void method2102() {
      if (Players.loadWorlds()) {
         worldSelectOpen = true;
         worldSelectPage = 0;
         worldSelectPagesCount = 0;
      }

   }

   @ObfuscatedName("nd")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-681433942"
   )
   @Export("FriendSystem_invalidateIgnoreds")
   static final void FriendSystem_invalidateIgnoreds() {
      class124.method3058();
      if (UserComparator5.friendsChat != null) {
         UserComparator5.friendsChat.invalidateIgnoreds();
      }

   }
}
