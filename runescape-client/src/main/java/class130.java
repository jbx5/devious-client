import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class130 implements Callable {
	@ObfuscatedName("qi")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class131 field1555;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class132 field1554;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	final class133 field1556;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2141685417
	)
	final int field1553;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	final class138 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfa;Lfm;Lfd;Lfe;I)V"
	)
	class130(class138 var1, class131 var2, class132 var3, class133 var4, int var5) {
		this.this$0 = var1;
		this.field1555 = var2;
		this.field1554 = var3;
		this.field1556 = var4;
		this.field1553 = var5;
	}

	public Object call() {
		this.field1555.method3018();
		class131[][] var1;
		if (this.field1554 == class132.field1583) {
			var1 = this.this$0.field1634;
		} else {
			var1 = this.this$0.field1633;
		}

		var1[this.field1553][this.field1556.method3061()] = this.field1555;
		return null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BI)Ljava/lang/String;",
		garbageValue = "-971784863"
	)
	@Export("base64Encode")
	public static String base64Encode(byte[] var0) {
		int var2 = var0.length;
		StringBuilder var3 = new StringBuilder();

		for (int var4 = 0; var4 < var2 + 0; var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class405.field4562[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class405.field4562[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class405.field4562[(var6 & 15) << 2 | var7 >>> 6]).append(class405.field4562[var7 & 63]);
				} else {
					var3.append(class405.field4562[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class405.field4562[(var5 & 3) << 4]).append("==");
			}
		}

		String var1 = var3.toString();
		return var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lif;",
		garbageValue = "1144972870"
	)
	static VerticalAlignment[] method3014() {
		return new VerticalAlignment[]{VerticalAlignment.field2156, VerticalAlignment.field2150, VerticalAlignment.VerticalAlignment_centered};
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([I[IIIS)V",
		garbageValue = "6741"
	)
	public static void method3015(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method3015(var0, var1, var2, var5 - 1);
			method3015(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1009669422"
	)
	static boolean method3011() {
		Date var0;
		try {
			var0 = MouseHandler.method655();
		} catch (ParseException var4) {
			class145.method3156("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}

		if (var0 == null) {
			return false;
		} else {
			boolean var3 = class160.method3354(var0);
			boolean var2 = class348.method6644(var0);
			if (!var2) {
				class145.method3156("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
				return false;
			} else {
				if (!var3) {
					class332.field3603 = 8388607;
				} else {
					class332.field3603 = (int)(var0.getTime() / 86400000L - 11745L);
				}

				return true;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1492906481"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!UrlRequest.client.containsAccessAndRefreshToken() && !UrlRequest.client.method1212() && !UrlRequest.client.containsSessionAndCharacterId()) {
			Login.Login_response1 = "";
			Login.Login_response2 = "Enter your username/email & password.";
			Login.Login_response3 = "";
			class210.method3930(2);
			if (var0) {
				Login.Login_password = "";
			}

			class7.method44();
			Friend.method8099();
		} else {
			class210.method3930(10);
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "936667859"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (Occluder.garbageCollector == null || !Occluder.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						Occluder.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = -1L;
						GameEngine.garbageCollectorLastCollectionTime = -1L;
					}
				}
			} catch (Throwable var11) {
			}
		}

		if (Occluder.garbageCollector != null) {
			long var9 = VerticalAlignment.method3924();
			long var3 = Occluder.garbageCollector.getCollectionTime();
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) {
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
				if (0L != var7) {
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3;
			GameEngine.garbageCollectorLastCheckTimeMs = var9;
		}

		return var0;
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IIIIIII)V",
		garbageValue = "1652512334"
	)
	static final void method3010(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field601) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field601 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !class412.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				WorldMapData_0.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				WorldMapData_0.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				WorldMapData_0.invalidateWidget(var0);
				Client.field601 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				WorldMapData_0.invalidateWidget(var0);
			}
		}

	}
}
