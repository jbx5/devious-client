import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedGetter;
@ObfuscatedName("qp")
public class class451 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -946255737)
	public final int field4769;

	@ObfuscatedName("h")
	public Object field4768;

	public class451(int var1) {
		this.field4769 = var1;
	}

	public class451(int var1, Object var2) {
		this.field4769 = var1;
		this.field4768 = var2;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class451)) {
			return false;
		} else {
			class451 var2 = ((class451) (var1));
			if (var2.field4768 == null && this.field4768 != null) {
				return false;
			} else if (this.field4768 == null && var2.field4768 != null) {
				return false;
			} else {
				return this.field4769 == var2.field4769 && var2.field4768.equals(this.field4768);
			}
		}
	}

	public int hashCode() {
		return super.hashCode();
	}
}