import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uf")
public class class539 implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	public static final class539 field5290;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	public static final class539 field5285;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	static final class539 field5286;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	static final class539 field5288;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	static final class539 field5289;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	static final class539 field5287;
	@ObfuscatedName("ag")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -418255553
	)
	final int field5291;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -571556527
	)
	final int field5292;

	static {
		field5290 = new class539(2, 0);
		field5285 = new class539(3, 2);
		field5286 = new class539(4, 5);
		field5288 = new class539(1, 6);
		field5289 = new class539(5, 7);
		field5287 = new class539(0, 8);
	}

	class539(int var1, int var2) {
		this.field5291 = var1;
		this.field5292 = var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5292;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "18"
	)
	public boolean method9558() {
		return this == field5285;
	}
}
