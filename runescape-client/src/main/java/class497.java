import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tl")
public abstract class class497 extends class309 implements class565 {
	@ObfuscatedName("ai")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;

	@ObfuscatedSignature(
		descriptor = "(Loy;Lpn;I)V"
	)
	protected class497(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltv;",
		garbageValue = "-3"
	)
	protected abstract class499 vmethod9897(int var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-63"
	)
	public int method9332() {
		return super.field3286;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "-18"
	)
	public Object vmethod10432(int var1) {
		class499 var2 = this.vmethod9897(var1);
		return var2 != null && var2.method9355() ? var2.method9348() : null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)Lva;",
		garbageValue = "-1223431598"
	)
	public class566 method9326(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class499 var3 = this.vmethod9897(var2);
		class566 var4 = new class566(var2);
		Class var5 = var3.field5126.field5386;
		if (var5 == Integer.class) {
			var4.field5529 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5529 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field5529 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class561.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class561 var6 = (class561)var5.newInstance();
				var6.method10408(var1);
				var4.field5529 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
