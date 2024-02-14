import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uh")
public class class521 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	public static final class521 field5125;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	public static final class521 field5128;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	public static final class521 field5126;
	@ObfuscatedName("gh")
	@Export("refreshToken")
	static String refreshToken;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -514186595
	)
	public final int field5127;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 838946281
	)
	public final int field5124;
	@ObfuscatedName("as")
	public final Class field5129;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	final class517 field5130;

	static {
		field5125 = new class521(1, 0, Integer.class, new class518());
		field5128 = new class521(2, 1, Long.class, new class520());
		field5126 = new class521(0, 2, String.class, new class522());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Ltq;)V"
	)
	class521(int var1, int var2, Class var3, class517 var4) {
		this.field5127 = var1;
		this.field5124 = var2;
		this.field5129 = var3;
		this.field5130 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5124;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)Ljava/lang/Object;",
		garbageValue = "-72937018"
	)
	public Object method9323(Buffer var1) {
		return this.field5130.vmethod9338(var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Luh;",
		garbageValue = "376094599"
	)
	public static class521[] method9335() {
		return new class521[]{field5126, field5125, field5128};
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Luh;",
		garbageValue = "-1236805071"
	)
	public static class521 method9334(Class var0) {
		class521[] var1 = method9335();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class521 var3 = var1[var2];
			if (var3.field5129 == var0) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Ltq;",
		garbageValue = "-487755960"
	)
	public static class517 method9321(Class var0) {
		class521 var1 = method9334(var0);
		if (var1 == null) {
			throw new IllegalArgumentException();
		} else {
			return var1.field5130;
		}
	}
}
