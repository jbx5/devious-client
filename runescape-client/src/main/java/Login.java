import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("Login")
public class Login {
	@ObfuscatedName("al")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -684887311
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lun;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	static IndexedSprite field929;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Lun;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 458923923
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 581596689
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("af")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -2075218971
	)
	@Export("Login_banType")
	static int Login_banType;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -2106627381
	)
	static int field938;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -175245841
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cu")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("cw")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("co")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cc")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cg")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("cq")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1841332601
	)
	static int field946;
	@ObfuscatedName("cp")
	static String[] field947;
	@ObfuscatedName("cs")
	static String field928;
	@ObfuscatedName("cd")
	static boolean field949;
	@ObfuscatedName("ct")
	static boolean field924;
	@ObfuscatedName("ca")
	static boolean field951;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 207570935
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dg")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 1746301625
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -935504249
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 380969913
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		longValue = 5736123435137773119L
	)
	static long field959;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		longValue = 6594393808528520715L
	)
	static long field955;
	@ObfuscatedName("dw")
	static String[] field939;
	@ObfuscatedName("di")
	static String[] field962;
	@ObfuscatedName("dt")
	static String[] field961;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		Login_banType = -1;
		field938 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field946 = 0;
		field947 = new String[8];
		field928 = "";
		field949 = false;
		field924 = false;
		field951 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class135();
		field959 = -1L;
		field955 = -1L;
		field939 = new String[]{"title.jpg"};
		field962 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field961 = new String[]{"logo_speedrunning"};
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "85678974"
	)
	static final int method2140(int var0, int var1) {
		int var2 = ClientPreferences.method2602(var0 - 1, var1 - 1) + ClientPreferences.method2602(var0 + 1, var1 - 1) + ClientPreferences.method2602(var0 - 1, var1 + 1) + ClientPreferences.method2602(var0 + 1, var1 + 1);
		int var3 = ClientPreferences.method2602(var0 - 1, var1) + ClientPreferences.method2602(var0 + 1, var1) + ClientPreferences.method2602(var0, var1 - 1) + ClientPreferences.method2602(var0, 1 + var1);
		int var4 = ClientPreferences.method2602(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}
}
