import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
@ObfuscatedName("no")
public final class class387 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "[Lno;")
	static class387[] field4403 = new class387[0];

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1215158199)
	static int field4402;

	@ObfuscatedName("u")
	float field4405;

	@ObfuscatedName("c")
	float field4404;

	@ObfuscatedName("z")
	float field4406;

	@ObfuscatedName("j")
	float field4401;

	static {
		class362.method6603(100);
		new class387();
	}

	class387() {
		this.method6974();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-4")
	public void method6987() {
		synchronized(field4403) {
			if (class126.field1537 < field4402 - 1) {
				field4403[++class126.field1537 - 1] = this;
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(FFFFI)V", garbageValue = "1337450325")
	void method6978(float var1, float var2, float var3, float var4) {
		this.field4405 = var1;
		this.field4404 = var2;
		this.field4401 = var3;
		this.field4406 = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(FFFFB)V", garbageValue = "-88")
	public void method6973(float var1, float var2, float var3, float var4) {
		float var5 = ((float) (Math.sin(((double) (var4 * 0.5F)))));
		float var6 = ((float) (Math.cos(((double) (var4 * 0.5F)))));
		this.field4405 = var5 * var1;
		this.field4404 = var2 * var5;
		this.field4401 = var5 * var3;
		this.field4406 = var6;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(S)V", garbageValue = "-23299")
	final void method6974() {
		this.field4401 = 0.0F;
		this.field4404 = 0.0F;
		this.field4405 = 0.0F;
		this.field4406 = 1.0F;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(Lno;S)V", garbageValue = "10588")
	public final void method6970(class387 var1) {
		this.method6978(var1.field4405 * this.field4406 + var1.field4406 * this.field4405 + var1.field4404 * this.field4401 - var1.field4401 * this.field4404, var1.field4401 * this.field4405 + this.field4406 * var1.field4404 + (this.field4404 * var1.field4406 - this.field4401 * var1.field4405), var1.field4405 * this.field4404 + var1.field4406 * this.field4401 - this.field4405 * var1.field4404 + var1.field4401 * this.field4406, var1.field4406 * this.field4406 - var1.field4405 * this.field4405 - this.field4404 * var1.field4404 - var1.field4401 * this.field4401);
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class387)) {
			return false;
		} else {
			class387 var2 = ((class387) (var1));
			return this.field4405 == var2.field4405 && this.field4404 == var2.field4404 && var2.field4401 == this.field4401 && var2.field4406 == this.field4406;
		}
	}

	public String toString() {
		return this.field4405 + "," + this.field4404 + "," + this.field4401 + "," + this.field4406;
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = var2 * 31.0F + this.field4405;
		var2 = this.field4404 + var2 * 31.0F;
		var2 = 31.0F * var2 + this.field4401;
		var2 = 31.0F * var2 + this.field4406;
		return ((int) (var2));
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(descriptor = "(Lpy;B)Ljava/lang/Object;", garbageValue = "79")
	static Object method6998(class433 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch (var0.field4670) {
				case 1 :
					return Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				case 2 :
					return Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize];
				default :
					throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}
}