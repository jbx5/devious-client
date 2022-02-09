import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("bq")
@Implements("Login")
public class Login {
    @ObfuscatedName("l")
    @Export("clearLoginScreen")
    static boolean clearLoginScreen;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -553097527)
    @Export("xPadding")
    static int xPadding;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "[Lpg;")
    @Export("runesSprite")
    static IndexedSprite[] runesSprite;

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "Lpg;")
    @Export("titleboxSprite")
    static IndexedSprite titleboxSprite;

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "Lpg;")
    static IndexedSprite field894;

    @ObfuscatedName("n")
    @ObfuscatedSignature(descriptor = "Lcc;")
    @Export("loginScreenRunesAnimation")
    static LoginScreenAnimation loginScreenRunesAnimation;

    @ObfuscatedName("g")
    @ObfuscatedGetter(intValue = 1080882323)
    @Export("loginBoxX")
    static int loginBoxX;

    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = 1892263241)
    @Export("Login_loadingPercent")
    static int Login_loadingPercent;

    @ObfuscatedName("b")
    @Export("Login_loadingText")
    static String Login_loadingText;

    @ObfuscatedName("au")
    @ObfuscatedGetter(intValue = 2124652173)
    static int Login_banType;

    @ObfuscatedName("an")
    @ObfuscatedGetter(intValue = 1998991991)
    static int field918;

    @ObfuscatedName("ah")
    @ObfuscatedGetter(intValue = 445480309)
    @Export("loginIndex")
    static int loginIndex;

    @ObfuscatedName("ai")
    @Export("Login_response0")
    static String Login_response0;

    @ObfuscatedName("am")
    @Export("Login_response1")
    static String Login_response1;

    @ObfuscatedName("be")
    @Export("Login_response2")
    static String Login_response2;

    @ObfuscatedName("bt")
    @Export("Login_response3")
    static String Login_response3;

    @ObfuscatedName("bn")
    @Export("Login_username")
    static String Login_username;

    @ObfuscatedName("bz")
    @Export("Login_password")
    static String Login_password;

    @ObfuscatedName("bd")
    @ObfuscatedGetter(intValue = 2048872381)
    static int field910;

    @ObfuscatedName("bg")
    static String[] field911;

    @ObfuscatedName("ba")
    static boolean field912;

    @ObfuscatedName("bv")
    static boolean field913;

    @ObfuscatedName("bj")
    static boolean field893;

    @ObfuscatedName("bo")
    @ObfuscatedGetter(intValue = -93095323)
    @Export("currentLoginField")
    static int currentLoginField;

    @ObfuscatedName("ch")
    @Export("worldSelectOpen")
    static boolean worldSelectOpen;

    @ObfuscatedName("cc")
    @ObfuscatedGetter(intValue = 1771944375)
    @Export("hoveredWorldIndex")
    static int hoveredWorldIndex;

    @ObfuscatedName("cs")
    @ObfuscatedGetter(intValue = -564927075)
    @Export("worldSelectPage")
    static int worldSelectPage;

    @ObfuscatedName("cl")
    @ObfuscatedGetter(intValue = -351069605)
    @Export("worldSelectPagesCount")
    static int worldSelectPagesCount;

    @ObfuscatedName("cy")
    @ObfuscatedGetter(longValue = -2785638114199309409L)
    static long field922;

    @ObfuscatedName("cn")
    @ObfuscatedGetter(longValue = -5124268576715020243L)
    static long field923;

    @ObfuscatedName("cr")
    static String[] field924;

    @ObfuscatedName("co")
    static String[] field925;

    static {
        xPadding = 0;
        loginBoxX = xPadding + 202;
        Login_loadingPercent = 10;
        Login_loadingText = "";
        Login_banType = -1;
        field918 = 1;
        loginIndex = 0;
        Login_response0 = "";
        Login_response1 = "";
        Login_response2 = "";
        Login_response3 = "";
        Login_username = "";
        Login_password = "";
        field910 = 0;
        field911 = new String[8];
        field912 = false;
        field913 = false;
        field893 = true;
        currentLoginField = 0;
        worldSelectOpen = false;
        hoveredWorldIndex = -1;
        worldSelectPage = 0;
        worldSelectPagesCount = 0;
        new DecimalFormat("##0.00");
        new class118();
        field922 = -1L;
        field923 = -1L;
        field924 = new String[]{ "title.jpg" };
        field925 = new String[]{ "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
    }
}