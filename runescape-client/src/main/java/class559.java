import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vu")
public class class559 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1730844585
	)
	public final int field5479;
	@ObfuscatedName("ae")
	public Object field5480;

	public class559(int var1) {
		this.field5479 = var1;
	}

	public class559(int var1, Object var2) {
		this.field5479 = var1;
		this.field5480 = var2;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class559)) {
			return false;
		} else {
			class559 var2 = (class559)var1;
			if (var2.field5480 == null && this.field5480 != null) {
				return false;
			} else if (this.field5480 == null && var2.field5480 != null) {
				return false;
			} else {
				return var2.field5479 == this.field5479 && var2.field5480.equals(this.field5480);
			}
		}
	}
}
