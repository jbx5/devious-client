import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("Login")
public class Login {
	@ObfuscatedName("p")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2144632883
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1406320157
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -636835861
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("z")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1963717405
	)
	@Export("Login_banType")
	static int Login_banType;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 382138665
	)
	static int field903;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 426058389
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("bg")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("bw")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("bc")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("bv")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("bi")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("bj")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1882733041
	)
	static int field891;
	@ObfuscatedName("bo")
	static String[] field907;
	@ObfuscatedName("bt")
	static boolean field925;
	@ObfuscatedName("bb")
	static boolean field920;
	@ObfuscatedName("bq")
	static boolean field916;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 793941749
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("cf")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1809316571
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -2076400999
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1399484843
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		longValue = -3144092253317418407L
	)
	static long field924;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		longValue = 9220212022270271691L
	)
	static long field918;
	@ObfuscatedName("cq")
	static String[] field896;
	@ObfuscatedName("cp")
	static String[] field927;

	static {
		xPadding = 0; // L: 47
		loginBoxX = xPadding + 202; // L: 66
		Login_loadingPercent = 10; // L: 68
		Login_loadingText = ""; // L: 69
		Login_banType = -1; // L: 89
		field903 = 1; // L: 92
		loginIndex = 0; // L: 96
		Login_response0 = ""; // L: 97
		Login_response1 = ""; // L: 98
		Login_response2 = ""; // L: 99
		Login_response3 = ""; // L: 100
		Login_username = ""; // L: 101
		Login_password = ""; // L: 102
		field891 = 0; // L: 104
		field907 = new String[8]; // L: 105
		field925 = false; // L: 116
		field920 = false; // L: 117
		field916 = true; // L: 120
		currentLoginField = 0; // L: 121
		worldSelectOpen = false; // L: 125
		hoveredWorldIndex = -1; // L: 133
		worldSelectPage = 0; // L: 134
		worldSelectPagesCount = 0; // L: 135
		new DecimalFormat("##0.00"); // L: 138
		new class121();
		field924 = -1L; // L: 146
		field918 = -1L; // L: 147
		field896 = new String[]{"title.jpg"}; // L: 150
		field927 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "logo_speedrunning", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"}; // L: 153
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I[BLnj;B)V",
		garbageValue = "126"
	)
	static void method2041(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 18
		var3.type = 0; // L: 19
		var3.key = (long)var0; // L: 20
		var3.data = var1; // L: 21
		var3.archiveDisk = var2; // L: 22
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 23
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 24
		} // L: 25

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 27
			if (ArchiveDiskActionHandler.field4018 == 0) { // L: 28
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 29
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 30
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 31
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 32
			}

			ArchiveDiskActionHandler.field4018 = 600; // L: 34
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1755574868"
	)
	public static boolean method2084(int var0) {
		return (var0 >> 30 & 1) != 0; // L: 37
	}
}
