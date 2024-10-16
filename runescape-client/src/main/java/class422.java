import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public class class422 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	public class427 field4752;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	public class426 field4753;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	public class426 field4754;

	public class422() {
		this.field4752 = AABB.method5244();
		this.field4753 = WorldMapCacheName.method6364();
		this.field4754 = LoginState.method1296(1.0F, 1.0F, 1.0F);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2074531920"
	)
	public void method8127() {
		this.field4752.method8227();
		this.field4753.method8168();
		this.field4754.method8168();
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = 31 * var2 + this.field4752.hashCode();
		var3 = var3 * 31 + this.field4753.hashCode();
		var3 = 31 * var3 + this.field4754.hashCode();
		return var3;
	}

	public String toString() {
		return "[" + this.field4752.toString() + "|" + this.field4753.toString() + "|" + this.field4754.toString() + "]";
	}

	public boolean equals(Object var1) {
		if (var1 == null) {
			return false;
		} else if (this == var1) {
			return true;
		} else if (!(var1 instanceof class422)) {
			return false;
		} else {
			class422 var2 = (class422)var1;
			return this.field4752.equals(var2.field4752) && this.field4753.method8171(var2.field4753) && this.field4754.method8171(var2.field4754);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "2"
	)
	public static int method8138(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}
}
