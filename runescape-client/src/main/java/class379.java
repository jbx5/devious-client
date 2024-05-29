import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
public enum class379 implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4408(0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4407(1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4409(2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4410(3);

	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 968730851
	)
	public final int field4411;

	class379(int var3) {
		this.field4411 = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4411;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "-1569978867"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) {
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var4) {
				}
			}

			if (class31.field162.startsWith("win")) {
				class432.method8127(var0, 0, "openjs");
			} else if (class31.field162.startsWith("mac")) {
				class432.method8127(var0, 1, "openjs");
			} else {
				class432.method8127(var0, 2, "openjs");
			}
		} else {
			class432.method8127(var0, 3, "openjs");
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1098862798"
	)
	static long method7155() {
		try {
			URL var0 = new URL(class449.method8387("services", false) + "m=accountappeal/login.ws");
			URLConnection var1 = var0.openConnection();
			var1.setRequestProperty("connection", "close");
			var1.setDoInput(true);
			var1.setDoOutput(true);
			var1.setConnectTimeout(5000);
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
			var2.write("data1=req");
			var2.flush();
			InputStream var3 = var1.getInputStream();
			Buffer var4 = new Buffer(new byte[1000]);

			do {
				int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset);
				if (var5 == -1) {
					var4.offset = 0;
					long var7 = var4.readLong();
					return var7;
				}

				var4.offset += var5;
			} while(var4.offset < 1000);

			return 0L;
		} catch (Exception var9) {
			return 0L;
		}
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2137985045"
	)
	static void method7159(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) {
			if ((long)var0 == (var1.key >> 48 & 65535L)) {
				var1.remove();
			}
		}

	}
}
