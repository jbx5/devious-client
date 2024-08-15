import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
public abstract class class488 extends class308 implements class556 {
	@ObfuscatedSignature(
		descriptor = "(Lot;Lpg;I)V"
	)
	protected class488(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lst;",
		garbageValue = "870292735"
	)
	protected abstract class490 vmethod9414(int var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "626853269"
	)
	public int method8882() {
		return super.field3235;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "11"
	)
	public Object vmethod9922(int var1) {
		class490 var2 = this.vmethod9414(var1);
		return var2 != null && var2.method8890() ? var2.method8891() : null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)Lvy;",
		garbageValue = "1335933924"
	)
	public class557 method8872(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class490 var3 = this.vmethod9414(var2);
		class557 var4 = new class557(var2);
		Class var5 = var3.field5019.field5297;
		if (var5 == Integer.class) {
			var4.field5445 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5445 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field5445 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class552.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class552 var6 = (class552)var5.newInstance();
				var6.method9897(var1);
				var4.field5445 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
