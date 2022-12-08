import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("bu")
@Implements("Login")
public class Login {
   @ObfuscatedName("e")
   @Export("clearLoginScreen")
   static boolean clearLoginScreen;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -994097247
   )
   @Export("xPadding")
   static int xPadding = 0;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "[Lra;"
   )
   @Export("runesSprite")
   static IndexedSprite[] runesSprite;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lra;"
   )
   @Export("logoSprite")
   static IndexedSprite logoSprite;
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Lra;"
   )
   static IndexedSprite field949;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Lra;"
   )
   static IndexedSprite field927;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1802972375
   )
   @Export("loginBoxX")
   static int loginBoxX;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -561151419
   )
   @Export("Login_loadingPercent")
   static int Login_loadingPercent;
   @ObfuscatedName("z")
   @Export("Login_loadingText")
   static String Login_loadingText;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1123765685
   )
   @Export("Login_banType")
   static int Login_banType;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1782720957
   )
   static int field928;
   @ObfuscatedName("ap")
   static String field929;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 860431235
   )
   @Export("loginIndex")
   static int loginIndex;
   @ObfuscatedName("bh")
   @Export("Login_response0")
   static String Login_response0;
   @ObfuscatedName("be")
   @Export("Login_response1")
   static String Login_response1;
   @ObfuscatedName("bf")
   @Export("Login_response2")
   static String Login_response2;
   @ObfuscatedName("bo")
   @Export("Login_response3")
   static String Login_response3;
   @ObfuscatedName("by")
   @Export("Login_username")
   static String Login_username;
   @ObfuscatedName("bw")
   @Export("Login_password")
   static String Login_password;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = 1776085317
   )
   static int field938;
   @ObfuscatedName("bl")
   static String[] field915;
   @ObfuscatedName("bt")
   static boolean field939;
   @ObfuscatedName("bu")
   static boolean field955;
   @ObfuscatedName("bm")
   static boolean field930;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -1156426449
   )
   @Export("currentLoginField")
   static int currentLoginField;
   @ObfuscatedName("cq")
   @Export("worldSelectOpen")
   static boolean worldSelectOpen;
   @ObfuscatedName("cj")
   @ObfuscatedGetter(
      intValue = -1726708665
   )
   @Export("hoveredWorldIndex")
   static int hoveredWorldIndex;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = -1039174001
   )
   @Export("worldSelectPage")
   static int worldSelectPage;
   @ObfuscatedName("cm")
   @ObfuscatedGetter(
      intValue = -231318101
   )
   @Export("worldSelectPagesCount")
   static int worldSelectPagesCount;
   @ObfuscatedName("cu")
   @ObfuscatedGetter(
      longValue = -1294134283863075195L
   )
   static long field937;
   @ObfuscatedName("co")
   @ObfuscatedGetter(
      longValue = 7897803412889482129L
   )
   static long field950;
   @ObfuscatedName("ch")
   static String[] field934;
   @ObfuscatedName("ce")
   static String[] field932;
   @ObfuscatedName("cg")
   static String[] field953;

   static {
      loginBoxX = xPadding + 202;
      Login_loadingPercent = 10;
      Login_loadingText = "";
      Login_banType = -1;
      field928 = 1;
      loginIndex = 0;
      Login_response0 = "";
      Login_response1 = "";
      Login_response2 = "";
      Login_response3 = "";
      Login_username = "";
      Login_password = "";
      field938 = 0;
      field915 = new String[8];
      field939 = false;
      field955 = false;
      field930 = true;
      currentLoginField = 0;
      worldSelectOpen = false;
      hoveredWorldIndex = -1;
      worldSelectPage = 0;
      worldSelectPagesCount = 0;
      new DecimalFormat("##0.00");
      new class128();
      field937 = -1L;
      field950 = -1L;
      field934 = new String[]{"title.jpg"};
      field932 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
      field953 = new String[]{"logo_speedrunning"};
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1089740356"
   )
   public static void method2065(int var0, int var1) {
      VarbitComposition var3 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
      VarbitComposition var2;
      if (var3 != null) {
         var2 = var3;
      } else {
         byte[] var4 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
         var3 = new VarbitComposition();
         if (var4 != null) {
            var3.decode(new Buffer(var4));
         }

         VarbitComposition.VarbitDefinition_cached.put(var3, (long)var0);
         var2 = var3;
      }

      int var8 = var2.baseVar;
      int var5 = var2.startBit;
      int var6 = var2.endBit;
      int var7 = Varps.Varps_masks[var6 - var5];
      if (var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(II)Lew;",
      garbageValue = "-1889979389"
   )
   public static class130 method2096(int var0) {
      class130 var1 = (class130)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive;
         AbstractArchive var4 = BuddyRankComparator.SequenceDefinition_skeletonsArchive;
         boolean var5 = true;
         byte[] var6 = var3.getFile(var0 >> 16 & '\uffff', var0 & '\uffff');
         class130 var2;
         if (var6 == null) {
            var5 = false;
            var2 = null;
         } else {
            int var7 = (var6[1] & 255) << 8 | var6[2] & 255;
            byte[] var8 = var4.getFile(var7, 0);
            if (var8 == null) {
               var5 = false;
            }

            if (!var5) {
               var2 = null;
            } else {
               try {
                  var2 = new class130(var3, var4, var0, false);
               } catch (Exception var10) {
                  var2 = null;
               }
            }
         }

         if (var2 != null) {
            SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
         }

         return var2;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F",
      garbageValue = "615126819"
   )
   static float[] method2094(JSONObject var0, String var1) throws JSONException {
      float[] var2 = new float[4];

      try {
         JSONArray var3 = var0.getJSONArray(var1);
         var2[0] = (float)var3.optDouble(0, 0.0);
         var2[1] = (float)var3.optDouble(1, 0.0);
         var2[2] = (float)var3.optDouble(2, 1.0);
         var2[3] = (float)var3.optDouble(3, 1.0);
      } catch (JSONException var4) {
         var2[0] = 0.0F;
         var2[1] = 0.0F;
         var2[2] = 1.0F;
         var2[3] = 1.0F;
      }

      return var2;
   }
}
