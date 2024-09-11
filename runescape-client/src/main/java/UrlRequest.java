import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1820354113
	)
	static int field1505;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1818166195
	)
	static int field1503;
	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("ac")
	final URL field1502;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1508455143
	)
	volatile int field1504;
	@ObfuscatedName("ax")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1505 = -1;
		field1503 = -2;
	}

	UrlRequest(URL var1) {
		this.field1504 = field1505;
		this.field1502 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-342876042"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1504 != field1505;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "1516593414"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1565436544"
	)
	public String method3164() {
		return this.field1502.toString();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "861564716"
	)
	public static void method3168() {
		class180.field1851.clear();
	}
}
