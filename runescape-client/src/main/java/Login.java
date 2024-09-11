import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("Login")
public class Login {
	@ObfuscatedName("ae")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1776792799
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lvt;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("ax")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	static IndexedSprite field980;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	static IndexedSprite field948;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1359998811
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1239278667
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("an")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1857384015
	)
	@Export("Login_banType")
	static int Login_banType;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1783522205
	)
	static int field960;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1220996517
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("ch")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("cf")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cu")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cm")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cj")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("cx")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 2016267409
	)
	static int field982;
	@ObfuscatedName("co")
	static String[] field970;
	@ObfuscatedName("cc")
	@Export("displayName")
	static String displayName;
	@ObfuscatedName("cp")
	static boolean field971;
	@ObfuscatedName("cb")
	static boolean field972;
	@ObfuscatedName("ck")
	@Export("rememberUsername")
	static boolean rememberUsername;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -1584448409
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dk")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -999434329
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -1187465059
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -450854559
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		longValue = -6098580745384794823L
	)
	static long field981;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		longValue = -5579989597765027495L
	)
	static long field957;
	@ObfuscatedName("dz")
	static String[] field983;
	@ObfuscatedName("dg")
	static String[] field984;
	@ObfuscatedName("dr")
	static String[] field985;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static Archive field986;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		Login_banType = -1;
		field960 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field982 = 0;
		field970 = new String[8];
		displayName = "";
		field971 = false;
		field972 = false;
		rememberUsername = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class141();
		field981 = -1L;
		field957 = -1L;
		field983 = new String[]{"title.jpg"};
		field984 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field985 = new String[]{"logo_speedrunning"};
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1431655680"
	)
	public static String method2349(String var0) {
		StringBuilder var1 = new StringBuilder(var0.length());
		int var2 = 0;
		int var3 = -1;

		for (int var4 = 0; var4 < var0.length(); ++var4) {
			char var5 = var0.charAt(var4);
			if (var5 == '<') {
				var1.append(var0.substring(var2, var4));
				var3 = var4;
			} else if (var5 == '>' && var3 != -1) {
				String var6 = var0.substring(var3 + 1, var4);
				var3 = -1;
				if (var6.equals("lt")) {
					var1.append("<");
				} else if (var6.equals("gt")) {
					var1.append(">");
				} else if (var6.equals("br")) {
					var1.append("\n");
				}

				var2 = var4 + 1;
			}
		}

		if (var2 < var0.length()) {
			var1.append(var0.substring(var2, var0.length()));
		}

		return var1.toString();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "43"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login_response1 = var0;
		Login_response2 = var1;
		Login_response3 = var2;
	}

	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "(II)Luv;",
		garbageValue = "106120262"
	)
	@Export("getDbTable")
	static DbTable getDbTable(int var0) {
		DbTable var1 = (DbTable)Client.DBTableIndex_cache.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(class156.field1738, WorldMapRectangle.method6188(var0), class179.method3802(var0));
			Client.DBTableIndex_cache.put(var1, (long)var0);
		}

		return var1;
	}
}
