import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
public class class352 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	UrlRequest field3744;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	SpritePixels field3745;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Leb;)V"
	)
	class352(String var1, UrlRequester var2) {
		try {
			this.field3744 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3744 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Lea;)V"
	)
	class352(UrlRequest var1) {
		this.field3744 = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Lvc;",
		garbageValue = "37"
	)
	SpritePixels method6558() {
		if (this.field3745 == null && this.field3744 != null && this.field3744.isDone()) {
			if (this.field3744.getResponse() != null) {
				this.field3745 = class452.readSpritePixelsFromBytes(this.field3744.getResponse());
			}

			this.field3744 = null;
		}

		return this.field3745;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "1137185836"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class412.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "-119"
	)
	static int method6559(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(Lmd;I)V",
		garbageValue = "1992879641"
	)
	static void method6562(PacketBufferNode var0) {
		var0.packetBuffer.writeInt(0);
		var0.packetBuffer.writeInt(class133.field1602.hash);
		var0.packetBuffer.writeIntME(class333.field3643.hash);
		var0.packetBuffer.writeIntLE(class332.field3638.hash);
		var0.packetBuffer.writeIntLE(Projection.archive2.hash);
		var0.packetBuffer.writeIntIME(class327.field3564.hash);
		var0.packetBuffer.writeIntLE(HttpResponse.field105.hash);
		var0.packetBuffer.writeInt(class177.archive8.hash);
		var0.packetBuffer.writeInt(ClientPacket.field3374.hash);
		var0.packetBuffer.writeInt(class135.field1637.hash);
		var0.packetBuffer.writeIntLE(class138.archive10.hash);
		var0.packetBuffer.writeInt(class141.field1656.hash);
		var0.packetBuffer.writeIntLE(class324.field3552.hash);
		var0.packetBuffer.writeIntIME(LoginState.archive4.hash);
		var0.packetBuffer.writeInt(Varcs.field1452.hash);
		var0.packetBuffer.writeIntLE(class438.archive12.hash);
		var0.packetBuffer.writeIntME(WorldMapRegion.field3093.hash);
		var0.packetBuffer.writeIntLE(SceneTilePaint.archive9.hash);
		var0.packetBuffer.writeIntME(GameObject.archive6.hash);
		var0.packetBuffer.writeIntIME(class53.field370.hash);
		var0.packetBuffer.writeIntLE(class104.archive13.hash);
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1243600329"
	)
	static void method6561() {
		for (class229 var0 = (class229)Client.field741.last(); var0 != null; var0 = (class229)Client.field741.previous()) {
			var0.remove();
		}

	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(Lnb;IIZI)V",
		garbageValue = "-1659936287"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width;
		int var5 = var0.height;
		if (var0.widthAlignment == 0) {
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) {
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) {
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) {
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) {
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) {
			var0.width = var0.height * var0.field3886 / var0.field3833;
		}

		if (var0.heightAlignment == 4) {
			var0.height = var0.field3833 * var0.width / var0.field3886;
		}

		if (var0.contentType == 1337) {
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) {
			var0.method6942().method6622(var0.width, var0.height);
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) {
			ScriptEvent var6 = new ScriptEvent();
			var6.widget = var0;
			var6.args = var0.onResize;
			Client.scriptEvents.addFirst(var6);
		}

	}
}
