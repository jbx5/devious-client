import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
public abstract class class394 extends class250 implements class451 {
	@ObfuscatedSignature(
		descriptor = "(Lkl;Llj;I)V"
	)
	protected class394(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3); // L: 15
	} // L: 16

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Lof;",
		garbageValue = "-21"
	)
	protected abstract class396 vmethod7723(int var1);

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-457837759"
	)
	public int method7267() {
		return super.field2914; // L: 19
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "119"
	)
	public Object vmethod8208(int var1) {
		class396 var2 = this.vmethod7723(var1); // L: 24
		return var2 != null && var2.method7287() ? var2.method7295() : null; // L: 25 26
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)Lql;",
		garbageValue = "39"
	)
	public class452 method7271(Buffer var1) {
		int var2 = var1.readUnsignedShort(); // L: 30
		class396 var3 = this.vmethod7723(var2); // L: 31
		class452 var4 = new class452(var2); // L: 32
		Class var5 = var3.field4465.field4697; // L: 33
		if (var5 == Integer.class) { // L: 34
			var4.field4797 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4797 = var1.readLong(); // L: 35
		} else if (var5 == String.class) { // L: 36
			var4.field4797 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class447.class.isAssignableFrom(var5)) { // L: 37
				throw new IllegalStateException(); // L: 46
			}

			try {
				class447 var6 = (class447)var5.newInstance(); // L: 39
				var6.method8179(var1); // L: 40
				var4.field4797 = var6; // L: 41
			} catch (InstantiationException var7) { // L: 43
			} catch (IllegalAccessException var8) { // L: 44
			}
		}

		return var4; // L: 47
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(CLlj;B)I",
		garbageValue = "1"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 143
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 144
			var0 = Character.toLowerCase(var0); // L: 145
			var2 = (var0 << 4) + 1; // L: 146
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 148
			var2 = 1762;
		}

		return var2; // L: 149
	}
}
