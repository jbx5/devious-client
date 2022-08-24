import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("s")
public class class0 implements class3 {
	class0() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lqr;)Lqr;")
	public Buffer vmethod12(Buffer var1) {
		Buffer var2 = new Buffer(100);
		this.method0(var1, var2);
		return var2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lqr;Lqr;)V")
	void method0(Buffer var1, Buffer var2) {
		class8 var3 = new class8(var1);
		class5 var4 = new class5(var3);
		long var5;
		for (var5 = 0L; !var4.method36(var3.method62(), var3.method61(), var5); ++var5) {
		}
		var2.writeLong(var5);
	}
}