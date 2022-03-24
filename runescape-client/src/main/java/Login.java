import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("Login")
public class Login {
	@ObfuscatedName("o")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	1208455943)

	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"Lqx;")

	static IndexedSprite field882;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lqx;")

	static IndexedSprite field913;
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"Lql;")

	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("k")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Lcl;")

	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 
	1898905069)

	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 
	-802532583)

	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("t")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("an")
	@ObfuscatedGetter(intValue = 
	424820649)

	static int Login_banType;
	@ObfuscatedName("al")
	@ObfuscatedGetter(intValue = 
	1250677803)

	static int field897;
	@ObfuscatedName("af")
	@ObfuscatedGetter(intValue = 
	26859459)

	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("ap")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("ai")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("bk")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("bz")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("bl")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("be")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(descriptor = 
	"Lkh;")

	static StudioGame field917;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(intValue = 
	-864612433)

	static int field899;
	@ObfuscatedName("bg")
	static String[] field900;
	@ObfuscatedName("bs")
	static boolean field901;
	@ObfuscatedName("bx")
	static boolean field902;
	@ObfuscatedName("bj")
	static boolean field903;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(intValue = 
	-1722988803)

	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("cd")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("co")
	@ObfuscatedGetter(intValue = 
	1052242699)

	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(intValue = 
	971393423)

	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(intValue = 
	2024146027)

	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(longValue = 
	939352785293546991L)

	static long field911;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(longValue = 
	1361954428784605633L)

	static long field912;
	@ObfuscatedName("cg")
	static String[] field881;
	@ObfuscatedName("cz")
	static String[] field914;
	static 
	{
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		Login_banType = -1;
		field897 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field899 = 0;
		field900 = new String[8];
		field901 = false;
		field902 = false;
		field903 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class120();
		field911 = -1L;
		field912 = -1L;
		field881 = new String[]{ "title.jpg" };
		field914 = new String[]{ "logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button" };
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(ILjava/lang/String;Ljava/lang/String;I)V", garbageValue = 
	"2031996356")

	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class6.addChatMessage(var0, var1, var2, ((String) (null)));
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Llq;Llq;ZLmr;I)V", garbageValue = 
	"-1379223824")

	public static void method1944(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		WorldMapID.ItemDefinition_archive = var0;
		GameEngine.ItemDefinition_modelArchive = var1;
		HealthBar.ItemDefinition_inMembersWorld = var2;
		ArchiveLoader.ItemDefinition_fileCount = WorldMapID.ItemDefinition_archive.getGroupFileCount(10);
		class239.ItemDefinition_fontPlain11 = var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)Z", garbageValue = 
	"-333067271")

	static boolean method1945(String var0) {
		if (var0 == null) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var2) {
				return false;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(IIB)I", garbageValue = 
	"105")

	static int method1883(int var0, int var1) {
		ItemContainer var2 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var2 == null) {
			return 0;
		} else if (var1 == (-1)) {
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(II)I", garbageValue = 
	"2147483647")

	public static int method1894(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}
}