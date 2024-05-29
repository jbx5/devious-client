import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Login")
public class Login {
	@ObfuscatedName("al")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -684644281
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	static IndexedSprite field946;
	@ObfuscatedName("ad")
	@Export("osNameLowercase")
	public static String osNameLowercase;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1270478887
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -467769523
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("ar")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 13511489
	)
	@Export("Login_banType")
	static int Login_banType;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1661503897
	)
	static int field949;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -79033559
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("ck")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("cn")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("ch")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cp")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cd")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("cs")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1312520673
	)
	static int field973;
	@ObfuscatedName("cc")
	static String[] field960;
	@ObfuscatedName("ce")
	@Export("displayName")
	static String displayName;
	@ObfuscatedName("cg")
	static boolean field967;
	@ObfuscatedName("cv")
	static boolean field963;
	@ObfuscatedName("cx")
	@Export("rememberUsername")
	static boolean rememberUsername;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -355769989
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("db")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -1791818179
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -651306129
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -801470097
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		longValue = -1064771094030866347L
	)
	static long field951;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		longValue = -8903805122193411189L
	)
	static long field939;
	@ObfuscatedName("dk")
	static String[] field974;
	@ObfuscatedName("dh")
	static String[] field956;
	@ObfuscatedName("dy")
	static String[] field942;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		Login_banType = -1;
		field949 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field973 = 0;
		field960 = new String[8];
		displayName = "";
		field967 = false;
		field963 = false;
		rememberUsername = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class137();
		field951 = -1L;
		field939 = -1L;
		field974 = new String[]{"title.jpg"};
		field956 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field942 = new String[]{"logo_speedrunning"};
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "165773503"
	)
	static int method2126(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}
}
