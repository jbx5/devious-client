import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("oi")
public abstract class class393 extends class249 implements class450 {
	@ObfuscatedSignature(descriptor = "(Lkz;Llj;I)V")
	protected class393(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(II)Lof;", garbageValue = "288370314")
	protected abstract class395 vmethod7551(int var1);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-357161022")
	public int method7107() {
		return super.field2884;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(II)Ljava/lang/Object;", garbageValue = "711230371")
	public Object vmethod8047(int var1) {
		class395 var2 = this.vmethod7551(var1);
		return var2 != null && var2.method7124() ? var2.method7117() : null;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lqw;I)Lqn;", garbageValue = "-1849555279")
	public class451 method7104(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class395 var3 = this.vmethod7551(var2);
		class451 var4 = new class451(var2);
		Class var5 = var3.field4441.field4669;
		if (var5 == Integer.class) {
			var4.field4770 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4770 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field4770 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class446.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}
			try {
				class446 var6 = ((class446) (var5.newInstance()));
				var6.method8021(var1);
				var4.field4770 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}
		return var4;
	}
}