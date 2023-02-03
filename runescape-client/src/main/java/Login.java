import java.text.DecimalFormat;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("Login")
public class Login {
   @ObfuscatedName("w")
   @Export("clearLoginScreen")
   static boolean clearLoginScreen;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1185580279
   )
   @Export("xPadding")
   static int xPadding = 0;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "[Lrg;"
   )
   @Export("runesSprite")
   static IndexedSprite[] runesSprite;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lrg;"
   )
   @Export("titlebuttonSprite")
   static IndexedSprite titlebuttonSprite;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Lrs;"
   )
   @Export("leftTitleSprite")
   static SpritePixels leftTitleSprite;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "[Lrg;"
   )
   @Export("title_muteSprite")
   static IndexedSprite[] title_muteSprite;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Lrg;"
   )
   @Export("options_buttons_0Sprite")
   static IndexedSprite options_buttons_0Sprite;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "Lrg;"
   )
   @Export("options_buttons_2Sprite")
   static IndexedSprite options_buttons_2Sprite;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1865803391
   )
   @Export("loginBoxX")
   static int loginBoxX;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1234617649
   )
   @Export("Login_loadingPercent")
   static int Login_loadingPercent;
   @ObfuscatedName("g")
   @Export("Login_loadingText")
   static String Login_loadingText;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 2070143889
   )
   @Export("Login_banType")
   static int Login_banType;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1374593207
   )
   static int field917;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 830758527
   )
   @Export("loginIndex")
   static int loginIndex;
   @ObfuscatedName("bj")
   @Export("Login_response0")
   static String Login_response0;
   @ObfuscatedName("bf")
   @Export("Login_response1")
   static String Login_response1;
   @ObfuscatedName("bz")
   @Export("Login_response2")
   static String Login_response2;
   @ObfuscatedName("br")
   @Export("Login_response3")
   static String Login_response3;
   @ObfuscatedName("bm")
   @Export("Login_username")
   static String Login_username;
   @ObfuscatedName("be")
   @Export("Login_password")
   static String Login_password;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = -312548173
   )
   static int field925;
   @ObfuscatedName("bq")
   static String[] field926;
   @ObfuscatedName("bd")
   static String field927;
   @ObfuscatedName("bp")
   static boolean field939;
   @ObfuscatedName("bc")
   static boolean field934;
   @ObfuscatedName("bx")
   static boolean field930;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = 465493979
   )
   @Export("currentLoginField")
   static int currentLoginField;
   @ObfuscatedName("cp")
   @Export("worldSelectOpen")
   static boolean worldSelectOpen;
   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "Lrg;"
   )
   static IndexedSprite field935;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = -995626195
   )
   @Export("hoveredWorldIndex")
   static int hoveredWorldIndex;
   @ObfuscatedName("cb")
   @ObfuscatedGetter(
      intValue = -1797889597
   )
   @Export("worldSelectPage")
   static int worldSelectPage;
   @ObfuscatedName("cz")
   @ObfuscatedGetter(
      intValue = 1497941413
   )
   @Export("worldSelectPagesCount")
   static int worldSelectPagesCount;
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      longValue = -576354342293618767L
   )
   static long field921;
   @ObfuscatedName("cv")
   @ObfuscatedGetter(
      longValue = 1153389561507731615L
   )
   static long field904;
   @ObfuscatedName("cf")
   static String[] field941;
   @ObfuscatedName("cm")
   static String[] field942;
   @ObfuscatedName("ce")
   static String[] field902;

   static {
      loginBoxX = xPadding + 202;
      Login_loadingPercent = 10;
      Login_loadingText = "";
      Login_banType = -1;
      field917 = 1;
      loginIndex = 0;
      Login_response0 = "";
      Login_response1 = "";
      Login_response2 = "";
      Login_response3 = "";
      Login_username = "";
      Login_password = "";
      field925 = 0;
      field926 = new String[8];
      field927 = "";
      field939 = false;
      field934 = false;
      field930 = true;
      currentLoginField = 0;
      worldSelectOpen = false;
      hoveredWorldIndex = -1;
      worldSelectPage = 0;
      worldSelectPagesCount = 0;
      new DecimalFormat("##0.00");
      new class129();
      field921 = -1L;
      field904 = -1L;
      field941 = new String[]{"title.jpg"};
      field942 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
      field902 = new String[]{"logo_speedrunning"};
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lln;Lln;IZB)Lei;",
      garbageValue = "-125"
   )
   public static class133 method2165(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
      boolean var4 = true;
      byte[] var5 = var0.getFile(var2 >> 16 & '\uffff', var2 & '\uffff');
      if (var5 == null) {
         var4 = false;
         return null;
      } else {
         int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
         byte[] var7;
         if (var3) {
            var7 = var1.getFile(0, var6);
         } else {
            var7 = var1.getFile(var6, 0);
         }

         if (var7 == null) {
            var4 = false;
         }

         if (!var4) {
            return null;
         } else {
            if (class277.field3059 == null) {
               class461.field4894 = Runtime.getRuntime().availableProcessors();
               class277.field3059 = new ThreadPoolExecutor(0, class461.field4894, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class461.field4894 * 100 + 100), new class130());
            }

            try {
               return new class133(var0, var1, var2, var3);
            } catch (Exception var9) {
               return null;
            }
         }
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lru;B)V",
      garbageValue = "-76"
   )
   @Export("updatePlayer")
   static final void updatePlayer(PacketBuffer var0) {
      var0.importIndex();
      int var1 = Client.localPlayerIndex;
      Player var2 = class387.localPlayer = Client.players[var1] = new Player();
      var2.index = var1;
      int var3 = var0.readBits(30);
      byte var4 = (byte)(var3 >> 28);
      int var5 = var3 >> 14 & 16383;
      int var6 = var3 & 16383;
      var2.pathX[0] = var5 - ParamComposition.baseX * 64;
      var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6);
      var2.pathY[0] = var6 - Client.baseY * 64;
      var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6);
      class103.Client_plane = var2.plane = var4;
      if (Players.field1341[var1] != null) {
         var2.read(Players.field1341[var1]);
      }

      Players.Players_count = 0;
      Players.Players_indices[++Players.Players_count - 1] = var1;
      Players.field1353[var1] = 0;
      Players.Players_emptyIdxCount = 0;

      for(int var7 = 1; var7 < 2048; ++var7) {
         if (var7 != var1) {
            int var8 = var0.readBits(18);
            int var9 = var8 >> 16;
            int var10 = var8 >> 8 & 597;
            int var11 = var8 & 597;
            Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28);
            Players.Players_orientations[var7] = 0;
            Players.Players_targetIndices[var7] = -1;
            Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7;
            Players.field1353[var7] = 0;
         }
      }

      var0.exportIndex();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lln;Lln;B)V",
      garbageValue = "102"
   )
   public static void method2166(AbstractArchive var0, AbstractArchive var1) {
      class303.HealthBarDefinition_archive = var0;
      HealthBarDefinition.field1985 = var1;
   }
}
