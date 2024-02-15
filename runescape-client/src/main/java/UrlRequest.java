import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 264132147
	)
	static int field1446;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2113744603
	)
	static int field1445;
	@ObfuscatedName("aq")
	final URL field1447;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1904658645
	)
	volatile int field1448;
	@ObfuscatedName("ar")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1446 = -1;
		field1445 = -2;
	}

	UrlRequest(URL var1) {
		this.field1448 = field1446;
		this.field1447 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1623052910"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1448 != field1446;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)[B",
		garbageValue = "-6055"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-122"
	)
	public String method2921() {
		return this.field1447.toString();
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "-1648762980"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		class246.insertMenuItem(var0, var1, var2, var3, var4, var5, -1, false);
	}
}
