import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tb")
public class class502 implements MouseWheel {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	public static final class502 field5035;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	public static final class502 field5037;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	public static final class502 field5030;
	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "[Lui;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 784477885
	)
	public final int field5031;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1507631009
	)
	public final int field5032;
	@ObfuscatedName("ai")
	public final Class field5033;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	public final class498 field5034;

	static {
		field5035 = new class502(1, 0, Integer.class, new class499());
		field5037 = new class502(0, 1, Long.class, new class501());
		field5030 = new class502(2, 2, String.class, new class503());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Ltj;)V"
	)
	class502(int var1, int var2, Class var3, class498 var4) {
		this.field5031 = var1;
		this.field5032 = var2;
		this.field5033 = var3;
		this.field5034 = var4;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5032;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltm;S)Ljava/lang/Object;",
		garbageValue = "5018"
	)
	public Object method8917(Buffer var1) {
		return this.field5034.vmethod8926(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[Ltb;",
		garbageValue = "44"
	)
	public static class502[] method8922() {
		return new class502[]{field5035, field5030, field5037};
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;B)Ltb;",
		garbageValue = "82"
	)
	public static class502 method8915(Class var0) {
		class502[] var1 = method8922();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class502 var3 = var1[var2];
			if (var3.field5033 == var0) {
				return var3;
			}
		}

		return null;
	}
}
