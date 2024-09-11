import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sa")
public abstract class class490 extends class310 implements class558 {
	@ObfuscatedSignature(
		descriptor = "(Lob;Lpx;I)V"
	)
	protected class490(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsz;",
		garbageValue = "16"
	)
	protected abstract class492 vmethod9715(int var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1714079205"
	)
	public int method9149() {
		return super.field3279;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-427155111"
	)
	public Object vmethod10246(int var1) {
		class492 var2 = this.vmethod9715(var1);
		return var2 != null && var2.method9174() ? var2.method9168() : null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)Lvu;",
		garbageValue = "-815063681"
	)
	public class559 method9150(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class492 var3 = this.vmethod9715(var2);
		class559 var4 = new class559(var2);
		Class var5 = var3.field5081.field5335;
		if (var5 == Integer.class) {
			var4.field5480 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5480 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field5480 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class554.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class554 var6 = (class554)var5.newInstance();
				var6.method10217(var1);
				var4.field5480 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
