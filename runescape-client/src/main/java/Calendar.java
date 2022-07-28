import java.util.TimeZone;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("jw")
@Implements("Calendar")
public class Calendar {
	@ObfuscatedName("o")
	@Export("MONTH_NAMES_ENGLISH_GERMAN")
	public static final String[][] MONTH_NAMES_ENGLISH_GERMAN = new String[][]{ new String[]{ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, new String[]{ "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, new String[]{ "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, new String[]{ "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, new String[]{ "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" }, new String[]{ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, new String[]{ "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic" } };

	@ObfuscatedName("q")
	@Export("DAYS_OF_THE_WEEK")
	public static final String[] DAYS_OF_THE_WEEK = new String[]{ "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@ObfuscatedName("f")
	@Export("Calendar_calendar")
	public static java.util.Calendar Calendar_calendar;

	@ObfuscatedName("el")
	@ObfuscatedSignature(descriptor = "Llu;")
	@Export("archive5")
	static Archive archive5;

	@ObfuscatedName("eb")
	@ObfuscatedSignature(descriptor = "Llu;")
	static Archive field3297;

	static {
		java.util.Calendar.getInstance();
		Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(CB)B", garbageValue = "38")
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			var1 = ((byte) (var0));
		} else if (var0 == 8364) {
			var1 = -128;
		} else if (var0 == 8218) {
			var1 = -126;
		} else if (var0 == 402) {
			var1 = -125;
		} else if (var0 == 8222) {
			var1 = -124;
		} else if (var0 == 8230) {
			var1 = -123;
		} else if (var0 == 8224) {
			var1 = -122;
		} else if (var0 == 8225) {
			var1 = -121;
		} else if (var0 == 710) {
			var1 = -120;
		} else if (var0 == 8240) {
			var1 = -119;
		} else if (var0 == 352) {
			var1 = -118;
		} else if (var0 == 8249) {
			var1 = -117;
		} else if (var0 == 338) {
			var1 = -116;
		} else if (var0 == 381) {
			var1 = -114;
		} else if (var0 == 8216) {
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110;
		} else if (var0 == 8220) {
			var1 = -109;
		} else if (var0 == 8221) {
			var1 = -108;
		} else if (var0 == 8226) {
			var1 = -107;
		} else if (var0 == 8211) {
			var1 = -106;
		} else if (var0 == 8212) {
			var1 = -105;
		} else if (var0 == 732) {
			var1 = -104;
		} else if (var0 == 8482) {
			var1 = -103;
		} else if (var0 == 353) {
			var1 = -102;
		} else if (var0 == 8250) {
			var1 = -101;
		} else if (var0 == 339) {
			var1 = -100;
		} else if (var0 == 382) {
			var1 = -98;
		} else if (var0 == 376) {
			var1 = -97;
		} else {
			var1 = 63;
		}
		return var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;", garbageValue = "-126")
	public static String method5512(CharSequence var0) {
		int var2 = var0.length();
		char[] var3 = new char[var2];
		for (int var4 = 0; var4 < var2; ++var4) {
			var3[var4] = '*';
		}
		String var1 = new String(var3);
		return var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "1848801306")
	static int method5511(int var0, Script var1, boolean var2) {
		if (var0 != 3700 && var0 != 3701) {
			if (var0 == 3702) {
				++TaskHandler.Interpreter_intStackSize;
				return 1;
			} else {
				return 2;
			}
		} else {
			--TaskHandler.Interpreter_intStackSize;
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
			return 1;
		}
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1162094430")
	static void method5510() {
		PacketBufferNode var0 = class433.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(MouseRecorder.getWindowedMode());
		var0.packetBuffer.writeShort(class352.canvasWidth);
		var0.packetBuffer.writeShort(class228.canvasHeight);
		Client.packetWriter.addNode(var0);
	}
}