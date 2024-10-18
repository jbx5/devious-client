import java.applet.Applet;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("ad")
@Implements("AsyncHttpResponse")
public class AsyncHttpResponse {
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = -678007887
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "Lue;"
	)
	static class539 field66;
	@ObfuscatedName("ap")
	@Export("responseFuture")
	Future responseFuture;
	@ObfuscatedName("aw")
	@Export("errorMessage")
	String errorMessage;

	AsyncHttpResponse(Future var1) {
		this.responseFuture = var1;
	}

	AsyncHttpResponse(String var1) {
		this.method258(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "94141695"
	)
	void method258(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.errorMessage = var1;
		if (this.responseFuture != null) {
			this.responseFuture.cancel(true);
			this.responseFuture = null;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "255"
	)
	@Export("getErrorMessage")
	public final String getErrorMessage() {
		return this.errorMessage;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2116986074"
	)
	@Export("hasError")
	public boolean hasError() {
		return this.errorMessage != null || this.responseFuture == null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "58"
	)
	@Export("hasFinished")
	public final boolean hasFinished() {
		return this.hasError() ? true : this.responseFuture.isDone();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Lav;",
		garbageValue = "48"
	)
	@Export("await")
	public final HttpResponse await() {
		if (this.hasError()) {
			return new HttpResponse(this.errorMessage);
		} else if (!this.hasFinished()) {
			return null;
		} else {
			try {
				return (HttpResponse)this.responseFuture.get();
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println(var2 + "\r\n" + var3);
				this.method258(var2);
				return new HttpResponse(var2);
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Loy;",
		garbageValue = "1208637588"
	)
	public static StudioGame[] method278() {
		return new StudioGame[]{StudioGame.game4, StudioGame.runescape, StudioGame.game3, StudioGame.game5, StudioGame.stellardawn, StudioGame.oldscape};
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;III)Lsw;",
		garbageValue = "1295728450"
	)
	public static AbstractSocket method281(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "-1381696483"
	)
	static boolean method277(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class31.field134.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var11.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var5) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Object var10 = class26.method385(class31.field135, var2, new Object[]{(new URL(class31.field135.getCodeBase(), var0)).toString()});
				return var10 != null;
			} catch (Throwable var6) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class31.field135.getAppletContext().showDocument(new URL(class31.field135.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var7) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Applet var3 = class31.field135;
				JSObject.getWindow(var3).call("loggedout", (Object[])null);
			} catch (Throwable var9) {
			}

			try {
				class31.field135.getAppletContext().showDocument(new URL(class31.field135.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var8) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(Lme;I)V",
		garbageValue = "-1249403145"
	)
	static void method279(PacketBufferNode var0) {
		var0.packetBuffer.writeIntLE(MouseHandler.archive6.hash);
		var0.packetBuffer.writeInt(class450.archive8.hash);
		var0.packetBuffer.writeInt(class1.archive12.hash);
		var0.packetBuffer.writeIntIME(Login.archive13.hash);
		var0.packetBuffer.writeIntIME(Sound.field1746.hash);
		var0.packetBuffer.writeInt(0);
		var0.packetBuffer.writeInt(class195.field2054.hash);
		var0.packetBuffer.writeIntLE(EnumComposition.archive9.hash);
		var0.packetBuffer.writeIntIME(class1.archive10.hash);
		var0.packetBuffer.writeIntLE(class156.field1737.hash);
		var0.packetBuffer.writeInt(UrlRequester.field1491.hash);
		var0.packetBuffer.writeIntME(class319.field3306.hash);
		var0.packetBuffer.writeIntLE(FileSystem.field2400.hash);
		var0.packetBuffer.writeIntLE(PlayerComposition.field3818.hash);
		var0.packetBuffer.writeInt(ObjectComposition.soundEffectsArchive.hash);
		var0.packetBuffer.writeInt(class59.archive2.hash);
		var0.packetBuffer.writeIntME(ModeWhere.field4720.hash);
		var0.packetBuffer.writeIntME(class171.field1849.hash);
		var0.packetBuffer.writeInt(Clock.field2468.hash);
		var0.packetBuffer.writeInt(WorldMapRegion.archive4.hash);
		var0.packetBuffer.writeIntME(class142.field1656.hash);
	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-796703665"
	)
	static void method267(String var0) {
		class145.field1668 = var0;

		try {
			String var1 = Projectile.client.getParameter(Integer.toString(18));
			String var2 = Projectile.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			String var5;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires=";
				long var6 = class77.method2338() + 94608000000L;
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

			Client var16 = Projectile.client;
			var5 = "document.cookie=\"" + var3 + "\"";
			JSObject.getWindow(var16).eval(var5);
		} catch (Throwable var15) {
		}

	}
}
