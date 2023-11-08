import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
public abstract class class467 extends class292 implements class534 {
	@ObfuscatedSignature(
		descriptor = "(Lnt;Lof;I)V"
	)
	protected class467(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsj;",
		garbageValue = "-61"
	)
	protected abstract class469 vmethod9077(int var1);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-973269100"
	)
	public int method8531() {
		return super.field3102;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "415168938"
	)
	public Object vmethod9599(int var1) {
		class469 var2 = this.vmethod9077(var1);
		return var2 != null && var2.method8553() ? var2.method8554() : null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)Lux;",
		garbageValue = "-475761809"
	)
	public class535 method8534(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class469 var3 = this.vmethod9077(var2);
		class535 var4 = new class535(var2);
		Class var5 = var3.field4808.field5064;
		if (var5 == Integer.class) {
			var4.field5205 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5205 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field5205 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class530.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class530 var6 = (class530)var5.newInstance();
				var6.method9574(var1);
				var4.field5205 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
