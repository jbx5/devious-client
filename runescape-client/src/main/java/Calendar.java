import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
@Implements("Calendar")
public class Calendar {
	@ObfuscatedName("v")
	@Export("MONTH_NAMES_ENGLISH_GERMAN")
	public static final String[][] MONTH_NAMES_ENGLISH_GERMAN;
	@ObfuscatedName("c")
	@Export("DAYS_OF_THE_WEEK")
	public static final String[] DAYS_OF_THE_WEEK;
	@ObfuscatedName("i")
	@Export("Calendar_calendar")
	public static java.util.Calendar Calendar_calendar;
	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"Lex;")

	static ClanSettings field3269;
	static 
	{
		MONTH_NAMES_ENGLISH_GERMAN = new String[][]{ new String[]{ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, new String[]{ "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, new String[]{ "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, new String[]{ "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, new String[]{ "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" }, new String[]{ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, new String[]{ "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic" } };
		DAYS_OF_THE_WEEK = new String[]{ "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		java.util.Calendar.getInstance();
		Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(IILgt;Lgv;I)Z", garbageValue = 
	"-692039603")

	public static final boolean method5507(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0;
		int var5 = var1;
		byte var6 = 64;
		byte var7 = 64;
		int var8 = var0 - var6;
		int var9 = var1 - var7;
		class194.directions[var6][var7] = 99;
		class194.distances[var6][var7] = 0;
		byte var10 = 0;
		int var11 = 0;
		class194.bufferX[var10] = var0;
		byte var10001 = var10;
		int var18 = var10 + 1;
		class194.bufferY[var10001] = var1;
		int[][] var12 = var3.flags;

		while (var18 != var11) {
			var4 = class194.bufferX[var11];
			var5 = class194.bufferY[var11];
			var11 = (var11 + 1) & 4095;
			int var16 = var4 - var8;
			int var17 = var5 - var9;
			int var13 = var4 - var3.xInset;
			int var14 = var5 - var3.yInset;
			if (var2.hasArrived(2, var4, var5, var3)) {
				HealthBarUpdate.field1189 = var4;
				StructComposition.field1988 = var5;
				return true;
			}

			int var15 = class194.distances[var16][var17] + 1;
			if ((((var16 > 0) && (class194.directions[var16 - 1][var17] == 0)) && ((var12[var13 - 1][var14] & 19136782) == 0)) && ((var12[var13 - 1][var14 + 1] & 19136824) == 0)) {
				class194.bufferX[var18] = var4 - 1;
				class194.bufferY[var18] = var5;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16 - 1][var17] = 2;
				class194.distances[var16 - 1][var17] = var15;
			}

			if ((((var16 < 126) && (class194.directions[var16 + 1][var17] == 0)) && ((var12[var13 + 2][var14] & 19136899) == 0)) && ((var12[var13 + 2][var14 + 1] & 19136992) == 0)) {
				class194.bufferX[var18] = var4 + 1;
				class194.bufferY[var18] = var5;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16 + 1][var17] = 8;
				class194.distances[var16 + 1][var17] = var15;
			}

			if ((((var17 > 0) && (class194.directions[var16][var17 - 1] == 0)) && ((var12[var13][var14 - 1] & 19136782) == 0)) && ((var12[var13 + 1][var14 - 1] & 19136899) == 0)) {
				class194.bufferX[var18] = var4;
				class194.bufferY[var18] = var5 - 1;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16][var17 - 1] = 1;
				class194.distances[var16][var17 - 1] = var15;
			}

			if ((((var17 < 126) && (class194.directions[var16][var17 + 1] == 0)) && ((var12[var13][var14 + 2] & 19136824) == 0)) && ((var12[var13 + 1][var14 + 2] & 19136992) == 0)) {
				class194.bufferX[var18] = var4;
				class194.bufferY[var18] = var5 + 1;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16][var17 + 1] = 4;
				class194.distances[var16][var17 + 1] = var15;
			}

			if ((((((var16 > 0) && (var17 > 0)) && (class194.directions[var16 - 1][var17 - 1] == 0)) && ((var12[var13 - 1][var14] & 19136830) == 0)) && ((var12[var13 - 1][var14 - 1] & 19136782) == 0)) && ((var12[var13][var14 - 1] & 19136911) == 0)) {
				class194.bufferX[var18] = var4 - 1;
				class194.bufferY[var18] = var5 - 1;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16 - 1][var17 - 1] = 3;
				class194.distances[var16 - 1][var17 - 1] = var15;
			}

			if ((((((var16 < 126) && (var17 > 0)) && (class194.directions[var16 + 1][var17 - 1] == 0)) && ((var12[var13 + 1][var14 - 1] & 19136911) == 0)) && ((var12[var13 + 2][var14 - 1] & 19136899) == 0)) && ((var12[var13 + 2][var14] & 19136995) == 0)) {
				class194.bufferX[var18] = var4 + 1;
				class194.bufferY[var18] = var5 - 1;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16 + 1][var17 - 1] = 9;
				class194.distances[var16 + 1][var17 - 1] = var15;
			}

			if ((((((var16 > 0) && (var17 < 126)) && (class194.directions[var16 - 1][var17 + 1] == 0)) && ((var12[var13 - 1][var14 + 1] & 19136830) == 0)) && ((var12[var13 - 1][var14 + 2] & 19136824) == 0)) && ((var12[var13][var14 + 2] & 19137016) == 0)) {
				class194.bufferX[var18] = var4 - 1;
				class194.bufferY[var18] = var5 + 1;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16 - 1][var17 + 1] = 6;
				class194.distances[var16 - 1][var17 + 1] = var15;
			}

			if ((((((var16 < 126) && (var17 < 126)) && (class194.directions[var16 + 1][var17 + 1] == 0)) && ((var12[var13 + 1][var14 + 2] & 19137016) == 0)) && ((var12[var13 + 2][var14 + 2] & 19136992) == 0)) && ((var12[var13 + 2][var14 + 1] & 19136995) == 0)) {
				class194.bufferX[var18] = var4 + 1;
				class194.bufferY[var18] = var5 + 1;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16 + 1][var17 + 1] = 12;
				class194.distances[var16 + 1][var17 + 1] = var15;
			}
		} 

		HealthBarUpdate.field1189 = var4;
		StructComposition.field1988 = var5;
		return false;
	}
}