import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public class class172 {
	@ObfuscatedName("as")
	public static short[] field1858;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = -228574189
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	public UrlRequest field1859;
	@ObfuscatedName("ah")
	public float[] field1857;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	final class182 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lhq;)V"
	)
	class172(class182 var1) {
		this.this$0 = var1;
		this.field1857 = new float[4];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "-1171750496"
	)
	static void method3496(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(class193.field1986, "rw", 10000L);
			Buffer var3 = new Buffer(500);
			var3.writeByte(3);
			var3.writeByte(var1 != null ? 1 : 0);
			var3.writeCESU8(var0.getPath());
			if (var1 != null) {
				var3.writeCESU8("");
			}

			var2.write(var3.array, 0, var3.offset);
			var2.close();
		} catch (IOException var4) {
			var4.printStackTrace();
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "64"
	)
	static void method3497(boolean var0) {
		byte var1 = 0;
		if (!HttpRequest.method101()) {
			var1 = 12;
		} else if (UrlRequest.client.containsAccessAndRefreshToken() || UrlRequest.client.method1212() || UrlRequest.client.containsSessionAndCharacterId()) {
			var1 = 10;
		}

		class210.method3930(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			SpriteMask.otpMedium = 0;
			class27.otp = "";
		}

		class7.method44();
		Friend.method8099();
	}
}
