import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
public class class9 implements MouseWheel {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	public static final class9 field41;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	public static final class9 field32;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	static final class9 field33;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	static final class9 field34;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	static final class9 field42;
	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "[Lnm;"
	)
	static Widget[] field35;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 30816287
	)
	int field36;
	@ObfuscatedName("ar")
	String field43;
	@ObfuscatedName("ab")
	boolean field31;
	@ObfuscatedName("am")
	boolean field39;

	static {
		field41 = new class9(0, "POST", true, true);
		field32 = new class9(1, "GET", true, false);
		field33 = new class9(2, "PUT", false, true);
		field34 = new class9(3, "PATCH", false, true);
		field42 = new class9(4, "DELETE", false, true);
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field36 = var1;
		this.field43 = var2;
		this.field31 = var3;
		this.field39 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field36;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1688270936"
	)
	boolean method69() {
		return this.field31;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1083861304"
	)
	public String method70() {
		return this.field43;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2015680525"
	)
	boolean method68() {
		return this.field39;
	}
}
