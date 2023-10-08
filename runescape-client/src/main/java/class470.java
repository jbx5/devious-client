import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sm")
public abstract class class470 extends class295 implements class537 {
	@ObfuscatedSignature(
		descriptor = "(Lnp;Loa;I)V"
	)
	protected class470(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lsl;",
		garbageValue = "-799452482"
	)
	protected abstract class472 vmethod8991(int var1);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1745704270"
	)
	public int method8449() {
		return super.field3109;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-123056323"
	)
	public Object vmethod9530(int var1) {
		class472 var2 = this.vmethod8991(var1);
		return var2 != null && var2.method8466() ? var2.method8470() : null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)Lut;",
		garbageValue = "-1458029459"
	)
	public class538 method8450(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class472 var3 = this.vmethod8991(var2);
		class538 var4 = new class538(var2);
		Class var5 = var3.field4816.field5070;
		if (var5 == Integer.class) {
			var4.field5204 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5204 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field5204 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class533.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class533 var6 = (class533)var5.newInstance();
				var6.method9503(var1);
				var4.field5204 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-89620142"
	)
	public static void method8459() {
		class319.field3440.clear();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "1657121032"
	)
	static int method8453(int var0, Script var1, boolean var2) {
		return 2;
	}
}
