import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sn")
public abstract class class471 extends class295 implements class538 {
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lol;I)V"
	)
	protected class471(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lsf;",
		garbageValue = "1192439178"
	)
	protected abstract class473 vmethod9206(int var1);

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-103"
	)
	public int method8651() {
		return super.field3140;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "706881700"
	)
	public Object vmethod9698(int var1) {
		class473 var2 = this.vmethod9206(var1);
		return var2 != null && var2.method8671() ? var2.method8672() : null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)Lur;",
		garbageValue = "-1150729684"
	)
	public class539 method8659(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class473 var3 = this.vmethod9206(var2);
		class539 var4 = new class539(var2);
		Class var5 = var3.field4840.field5106;
		if (var5 == Integer.class) {
			var4.field5244 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5244 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field5244 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class534.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class534 var6 = (class534)var5.newInstance();
				var6.method9667(var1);
				var4.field5244 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
