import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.text.DecimalFormat;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ba")
@Implements("Login")
public class Login {
	@ObfuscatedName("v")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -368109383)
	@Export("xPadding")
	static int xPadding;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Lqu;")
	static IndexedSprite field914;

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "Lqe;")
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lqu;")
	@Export("logoSprite")
	static IndexedSprite logoSprite;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lcf;")
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = -1216144849)
	@Export("loginBoxX")
	static int loginBoxX;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -887287559)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;

	@ObfuscatedName("m")
	@Export("Login_loadingText")
	static String Login_loadingText;

	@ObfuscatedName("ah")
	@ObfuscatedGetter(intValue = 1711559605)
	static int field897;

	@ObfuscatedName("av")
	@ObfuscatedGetter(intValue = -1589978227)
	static int field902;

	@ObfuscatedName("ay")
	@ObfuscatedGetter(intValue = 2023908257)
	@Export("loginIndex")
	static int loginIndex;

	@ObfuscatedName("as")
	@Export("Login_response0")
	static String Login_response0;

	@ObfuscatedName("be")
	@Export("Login_response1")
	static String Login_response1;

	@ObfuscatedName("bz")
	@Export("Login_response2")
	static String Login_response2;

	@ObfuscatedName("bp")
	@Export("Login_response3")
	static String Login_response3;

	@ObfuscatedName("bf")
	@Export("Login_username")
	static String Login_username;

	@ObfuscatedName("bg")
	@Export("Login_password")
	static String Login_password;

	@ObfuscatedName("bn")
	@ObfuscatedGetter(intValue = -1310477501)
	static int field910;

	@ObfuscatedName("bq")
	static String[] field911;

	@ObfuscatedName("bw")
	static boolean field912;

	@ObfuscatedName("bi")
	static boolean field913;

	@ObfuscatedName("bm")
	static boolean field895;

	@ObfuscatedName("by")
	@ObfuscatedGetter(intValue = -265960089)
	@Export("currentLoginField")
	static int currentLoginField;

	@ObfuscatedName("cq")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;

	@ObfuscatedName("cp")
	@ObfuscatedGetter(intValue = 306108477)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;

	@ObfuscatedName("cf")
	@ObfuscatedGetter(intValue = -1875553221)
	@Export("worldSelectPage")
	static int worldSelectPage;

	@ObfuscatedName("cv")
	@ObfuscatedGetter(intValue = 374883871)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;

	@ObfuscatedName("co")
	@ObfuscatedGetter(longValue = 413858699552618351L)
	static long field923;

	@ObfuscatedName("cz")
	@ObfuscatedGetter(longValue = 2000245042084222809L)
	static long field925;

	@ObfuscatedName("cu")
	static String[] field924;

	@ObfuscatedName("ce")
	static String[] field916;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		field897 = -1;
		field902 = 1;
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
		field895 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class120();
		field923 = -1L;
		field925 = -1L;
		field924 = new String[]{ "title.jpg" };
		field916 = new String[]{ "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
	}
}