import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("Calendar")
public class Calendar {
	@ObfuscatedName("c")
	@Export("MONTH_NAMES_ENGLISH_GERMAN")
	static final String[][] MONTH_NAMES_ENGLISH_GERMAN;
	@ObfuscatedName("p")
	@Export("DAYS_OF_THE_WEEK")
	static final String[] DAYS_OF_THE_WEEK;
	@ObfuscatedName("f")
	@Export("Calendar_calendar")
	static java.util.Calendar Calendar_calendar;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	static IndexedSprite field3331;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[[Lkw;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;

	static {
		MONTH_NAMES_ENGLISH_GERMAN = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}}; // L: 8
		DAYS_OF_THE_WEEK = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; // L: 18
		java.util.Calendar.getInstance(); // L: 22
		Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT")); // L: 23
	} // L: 24

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "954997773"
	)
	static int method5674(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 76
			boolean var3 = false; // L: 77
			boolean var4 = false; // L: 78
			int var5 = 0; // L: 79
			int var6 = var0.length(); // L: 80

			for (int var7 = 0; var7 < var6; ++var7) { // L: 81
				char var8 = var0.charAt(var7); // L: 82
				if (var7 == 0) { // L: 83
					if (var8 == '-') { // L: 84
						var3 = true; // L: 85
						continue;
					}

					if (var8 == '+') { // L: 88
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0'; // L: 90
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 91
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 92
						throw new NumberFormatException(); // L: 93
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 94
					throw new NumberFormatException();
				}

				if (var3) { // L: 95
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 96
				if (var9 / var1 != var5) { // L: 97
					throw new NumberFormatException();
				}

				var5 = var9; // L: 98
				var4 = true; // L: 99
			}

			if (!var4) { // L: 101
				throw new NumberFormatException();
			} else {
				return var5; // L: 102
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "790353390"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!IgnoreList.client.method1190() && !IgnoreList.client.method1191()) { // L: 1117
			Login.Login_response1 = ""; // L: 1121
			Login.Login_response2 = "Enter your username/email & password."; // L: 1122
			Login.Login_response3 = ""; // L: 1123
			class139.method3101(2); // L: 1124
			if (var0) { // L: 1125
				Login.Login_password = "";
			}

			if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 1127
				if (Player.clientPreferences.method2407() != null) { // L: 1128
					Login.Login_username = Player.clientPreferences.method2407(); // L: 1129
					Client.Login_isUsernameRemembered = true; // L: 1130
				} else {
					Client.Login_isUsernameRemembered = false; // L: 1132
				}
			}

			class65.method2029(); // L: 1134
		} else {
			class139.method3101(10); // L: 1118
		}
	} // L: 1119 1135
}
