import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.io.IOException;
import netscape.javascript.JSObject;
import java.util.Date;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
@ObfuscatedName("t")
public class class20 implements Callable {
	@ObfuscatedName("uh")
	@ObfuscatedGetter(longValue = 6478596122969031279L)
	static long field116;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -924286125)
	static int field115;

	@ObfuscatedName("ek")
	@ObfuscatedSignature(descriptor = "Llu;")
	@Export("archive2")
	static Archive archive2;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Ld;")
	final class10 field110;

	@ObfuscatedSignature(descriptor = "Lp;")
	final class14 this$0;

	@ObfuscatedSignature(descriptor = "(Lp;Ld;)V")
	class20(class14 var1, class10 var2) {
		this.this$0 = var1;
		this.field110 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field110.method87()) {
				WorldMapDecoration.method4967(10L);
			} 
		} catch (IOException var2) {
			return new class21("Error servicing REST query: " + var2.getMessage());
		}
		return this.field110.method88();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Object;ZI)[B", garbageValue = "16748608")
	public static byte[] method291(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var6 = ((byte[]) ((byte[]) (var0)));
			if (var1) {
				int var4 = var6.length;
				byte[] var5 = new byte[var4];
				System.arraycopy(var6, 0, var5, 0, var4);
				return var5;
			} else {
				return var6;
			}
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = ((AbstractByteArrayCopier) (var0));
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "-820668756")
	static int method294(int var0, int var1) {
		ItemContainer var2 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
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

	@ObfuscatedName("lq")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-1565249484")
	static void method295(String var0) {
		Script.field975 = var0;
		try {
			String var1 = class329.client.getParameter(Integer.toString(18));
			String var2 = class329.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			String var5;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires=";
				long var6 = class131.method2916() + 94608000000L;
				Calendar.Calendar_calendar.setTime(new Date(var6));
				int var8 = Calendar.Calendar_calendar.get(7);
				int var9 = Calendar.Calendar_calendar.get(5);
				int var10 = Calendar.Calendar_calendar.get(2);
				int var11 = Calendar.Calendar_calendar.get(1);
				int var12 = Calendar.Calendar_calendar.get(11);
				int var13 = Calendar.Calendar_calendar.get(12);
				int var14 = Calendar.Calendar_calendar.get(13);
				var5 = Calendar.DAYS_OF_THE_WEEK[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
				var3 = var4 + var5 + "; Max-Age=" + 94608000L;
			}
			Client var16 = class329.client;
			var5 = "document.cookie=\"" + var3 + "\"";
			JSObject.getWindow(var16).eval(var5);
		} catch (Throwable var15) {
		}
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", garbageValue = "1991451267")
	static String method293(String var0) {
		PlayerType[] var1 = Client.PlayerType_values();
		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon != -1 && var0.startsWith(UrlRequester.method2619(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}
		return var0;
	}
}