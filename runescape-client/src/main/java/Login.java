import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("Login")
public class Login {
	@ObfuscatedName("ap")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1627937497
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lut;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	static IndexedSprite field925;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1966354381
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 126445631
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("al")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -2103833177
	)
	@Export("Login_banType")
	static int Login_banType;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -2138415387
	)
	static int field916;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -399449741
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cb")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("ci")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cv")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("ct")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cp")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("cq")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 661649741
	)
	static int field924;
	@ObfuscatedName("cc")
	static String[] field934;
	@ObfuscatedName("cn")
	@Export("displayName")
	static String displayName;
	@ObfuscatedName("cj")
	static boolean field928;
	@ObfuscatedName("cf")
	static boolean field929;
	@ObfuscatedName("ca")
	@Export("rememberUsername")
	static boolean rememberUsername;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 518877719
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dt")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -69035133
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -1352913763
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -2039430819
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		longValue = 1523375473091216033L
	)
	static long field939;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		longValue = 4047884965776512001L
	)
	static long field940;
	@ObfuscatedName("do")
	static String[] field941;
	@ObfuscatedName("dx")
	static String[] field942;
	@ObfuscatedName("dh")
	static String[] field943;

	static {
		xPadding = 0;
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
		field924 = 0;
		field934 = new String[8];
		displayName = "";
		field928 = false;
		field929 = false;
		rememberUsername = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class134();
		field939 = -1L;
		field940 = -1L;
		field941 = new String[]{"title.jpg"};
		field942 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field943 = new String[]{"logo_speedrunning"};
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Z",
		garbageValue = "-55"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return class93.method2441(var0, 10, true);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-106"
	)
	public static void method2167() {
		EnumComposition.EnumDefinition_cached.clear();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1057997369"
	)
	public static final void method2209(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0;
		ViewportMouse.ViewportMouse_y = var1;
		ViewportMouse.ViewportMouse_isInViewport = true;
		ViewportMouse.ViewportMouse_entityCount = 0;
		ViewportMouse.ViewportMouse_false0 = false;
	}
}
