import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sz")
public abstract class class475 extends class297 implements class542 {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;

	@ObfuscatedSignature(
		descriptor = "(Lon;Lpv;I)V"
	)
	protected class475(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsm;",
		garbageValue = "0"
	)
	protected abstract class477 vmethod9068(int var1);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-878802408"
	)
	public int method8504() {
		return super.field3177;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "16"
	)
	public Object vmethod9575(int var1) {
		class477 var2 = this.vmethod9068(var1);
		return var2 != null && var2.method8525() ? var2.method8517() : null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;S)Luz;",
		garbageValue = "28502"
	)
	public class543 method8501(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class477 var3 = this.vmethod9068(var2);
		class543 var4 = new class543(var2);
		Class var5 = var3.field4903.field5153;
		if (var5 == Integer.class) {
			var4.field5300 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5300 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field5300 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class538.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class538 var6 = (class538)var5.newInstance();
				var6.method9553(var1);
				var4.field5300 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
