import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 513778063
	)
	static int field1454;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2063335977
	)
	static int field1455;
	@ObfuscatedName("ad")
	public static short[] field1458;
	@ObfuscatedName("au")
	final URL field1453;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2063603547
	)
	volatile int field1456;
	@ObfuscatedName("ac")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1454 = -1;
		field1455 = -2;
	}

	UrlRequest(URL var1) {
		this.field1456 = field1454;
		this.field1453 = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1941771443"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1456 != field1454;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-90219734"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "79865594"
	)
	public String method2848() {
		return this.field1453.toString();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnb;",
		garbageValue = "2139207855"
	)
	public static GameBuild[] method2855() {
		return new GameBuild[]{GameBuild.LIVE, GameBuild.RC, GameBuild.WIP, GameBuild.BUILDLIVE};
	}
}
