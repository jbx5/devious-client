import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
@Implements("Calendar")
public class Calendar {
	@ObfuscatedName("aw")
	@Export("MONTH_NAMES_ENGLISH_GERMAN")
	public static final String[][] MONTH_NAMES_ENGLISH_GERMAN;
	@ObfuscatedName("ay")
	@Export("DAYS_OF_THE_WEEK")
	public static final String[] DAYS_OF_THE_WEEK;
	@ObfuscatedName("ar")
	@Export("Calendar_calendar")
	public static java.util.Calendar Calendar_calendar;
	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("fontBold12")
	static Font fontBold12;

	static {
		MONTH_NAMES_ENGLISH_GERMAN = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}};
		DAYS_OF_THE_WEEK = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		java.util.Calendar.getInstance();
		Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljo;IIIII)Z",
		garbageValue = "-596982918"
	)
	static final boolean method6619(Model var0, int var1, int var2, int var3, int var4) {
		if (!AttackOption.method2669()) {
			return false;
		} else {
			class11.method105();
			AABB var5 = (AABB)var0.aabb.get(var1);
			int var6 = var2 + var5.xMid;
			int var7 = var3 + var5.yMid;
			int var8 = var4 + var5.zMid;
			int var9 = var5.xMidOffset;
			int var10 = var5.yMidOffset;
			int var11 = var5.zMidOffset;
			int var12 = ViewportMouse.field2754 - var6;
			int var13 = ViewportMouse.field2755 - var7;
			int var14 = class151.field1693 - var8;
			if (Math.abs(var12) > var9 + class90.field1109) {
				return false;
			} else if (Math.abs(var13) > var10 + class136.field1606) {
				return false;
			} else if (Math.abs(var14) > var11 + class387.field4437) {
				return false;
			} else if (Math.abs(var14 * ViewportMouse.field2756 - var13 * class133.field1593) > var10 * class387.field4437 + var11 * class136.field1606) {
				return false;
			} else if (Math.abs(var12 * class133.field1593 - var14 * class538.field5228) > var11 * class90.field1109 + var9 * class387.field4437) {
				return false;
			} else {
				return Math.abs(var13 * class538.field5228 - var12 * ViewportMouse.field2756) <= var9 * class136.field1606 + var10 * class90.field1109;
			}
		}
	}
}
