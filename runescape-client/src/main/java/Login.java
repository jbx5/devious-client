import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("Login")
public class Login {
	@ObfuscatedName("ay")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1315923807
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lvb;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lvb;"
	)
	static IndexedSprite field930;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lvb;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("pcmPlayerProvider")
	static class51 pcmPlayerProvider;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lvb;"
	)
	static IndexedSprite field907;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lvb;"
	)
	static IndexedSprite field902;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -245400841
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1369619267
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("at")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -2007333059
	)
	@Export("Login_banType")
	static int Login_banType;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1242144635
	)
	static int field941;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -2100978975
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cu")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("cz")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cm")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("ct")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cl")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("cb")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 519934007
	)
	static int field915;
	@ObfuscatedName("cg")
	static String[] field925;
	@ObfuscatedName("cn")
	@Export("displayName")
	static String displayName;
	@ObfuscatedName("ck")
	static boolean field927;
	@ObfuscatedName("ch")
	static boolean field914;
	@ObfuscatedName("ca")
	@Export("rememberUsername")
	static boolean rememberUsername;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -142860965
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dl")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 1344448859
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 362711843
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 1431358501
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		longValue = -5324091792590456167L
	)
	static long field934;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		longValue = 6270362586739788945L
	)
	static long field939;
	@ObfuscatedName("dg")
	static String[] field935;
	@ObfuscatedName("dt")
	static String[] field940;
	@ObfuscatedName("du")
	static String[] field923;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		Login_banType = -1;
		field941 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field915 = 0;
		field925 = new String[8];
		displayName = "";
		field927 = false;
		field914 = false;
		rememberUsername = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class138();
		field934 = -1L;
		field939 = -1L;
		field935 = new String[]{"title.jpg"};
		field940 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field923 = new String[]{"logo_speedrunning"};
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Ldw;IIB)V",
		garbageValue = "-86"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = class182.SequenceDefinition_get(var1).restartMode;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1228 = 0;
			}

			if (var3 == 2) {
				var0.field1228 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || class182.SequenceDefinition_get(var1).field2867 >= class182.SequenceDefinition_get(var0.sequence).field2867) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1228 = 0;
			var0.field1255 = var0.pathLength;
		}

	}

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(Lnq;IIII)V",
		garbageValue = "2115736277"
	)
	static final void method2252(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.method6948(FloorUnderlayDefinition.widgetDefinition, false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				class343.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

		}
	}
}
